package edu.ups.pap.u01;

import java.util.function.Function;

public class Caja<T>{
    //Dato Generico 
    private final T valor;

    public  Caja(T valor){
        this.valor = valor;
    }
    //Metodo Generico 
    public T obtener(){
        return valor;
    }
    //Metodo Generico
    public <R> R mapear(Function <T, R> operacion){
        R resultado = operacion.apply(valor);
        return resultado; 
    }
    

}