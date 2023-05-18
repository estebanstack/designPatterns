package com.designPatterns.Singleton;

public class Main {

    public static void main(String[] args) {
        Persona persona = Persona.getInstance(); //-> new Singleton()

        persona.setSaluda("Hola");


        Persona personaInglesa = Persona.getInstance(); // -> singleton1 = singleton
        personaInglesa.setSaluda("What´s up");

       // Persona persona1 = new Persona(); // - > Arroja error

        System.out.println("Valor: " + persona.getSaluda() + " "+ personaInglesa.getSaluda());
        System.out.println("Memoria: "+ persona + " "+ personaInglesa);

        /*
        No crea instancias nuevas solo reutiliza la ya creada de primeras, gracias al if creado en
        la clase Persona permite que al solo crear una, al crear otra devuelva la ya creada.
        Y así, ocupan el mismo valor en memoria; y al usar un set en "personaInglesa" tambien se altera el
        de "persona". Ademas al poner el constructor vacio en privado no permite crear nuevas instancias
        sin utilizar el getInstance, ya que arrojaría error.
         */

    }
}
