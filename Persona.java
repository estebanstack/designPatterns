package com.designPatterns.Singleton;

public class Persona {
    private static Persona persona;
    String saluda;

    private Persona() {} // es privado para que no permita hacer un new Persona
    public static Persona getInstance(){
        if(persona == null) {
             persona =  new Persona();
        }

        return persona;
    }
    public String getSaluda() {
        return saluda;
    }

    public void setSaluda(String saluda) {
        this.saluda = saluda;
    }
}
