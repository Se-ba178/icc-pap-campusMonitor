package edu.ups.pap.u01;
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
    

}