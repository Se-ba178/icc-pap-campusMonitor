package edu.ups.pap.models;

import java.util.function.Function;

public class Lectura <T>{
    private String idSensor;
    private T valor;
    private String unidad;
    
    public Lectura(String idSensor, T valor, String unidad) {
        this.idSensor = idSensor;
        this.valor = valor;
        this.unidad = unidad;
    }
    public String getIdSensor() {
        return idSensor;
    }
    public T getValor() {
        return valor;
    }
    public String getUnidad() {
        return unidad;
    }

    //Metodo generico
    public <R> Lectura<R> transformar(Function<T, R> conversor, String nuevaUnidad){

        if(conversor == null){ //Ver si es nulo o nada
            throw new IllegalArgumentException("El valor mandado no puede ser nulo");
        }

        R nuevoValorDado = conversor.apply(valor);

        //verificamos de nuevo pero con el valor nuevo
        if(nuevoValorDado == null){
            throw new IllegalArgumentException("El valor sigue siendo nulo");
        }
        
        return new Lectura<>(idSensor, nuevoValorDado, nuevaUnidad);
        
    }

    
}
