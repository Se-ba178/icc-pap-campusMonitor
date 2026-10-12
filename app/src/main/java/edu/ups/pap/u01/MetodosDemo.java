package edu.ups.pap.u01;

public class MetodosDemo {
    public  static  void  main(String[] args){
        Caja<String> original = new Caja<String>("Algoritmo");

        /// Mapear el valor String de la Caja a un Integer
        Integer longitud = original.mapear(texto -> texto.length());
        String etiqueta = original.mapear(texto -> "Materia: " + texto);

        System.out.println("Original" + original.obtener());
        System.out.println("Longitud" + longitud);
        System.out.println(etiqueta);
    }
    
}
