package org.example;

import org.example.model.entities.Componente;
import org.example.model.entities.Compuesto;
import org.example.model.entities.Equipo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Desarrollo de patron Composite");
        Equipo grafica = new Componente("gtx",500,10000);
        Equipo disco = new Componente("ssd",200,4000);
        Equipo pc1 = new Compuesto();
        Equipo mother = new Compuesto();
        Equipo proce = new Componente("procesador",100,8000);
        mother.addEquipo(proce);

        pc1.addEquipo(grafica);
        pc1.addEquipo(disco);
        pc1.addEquipo(mother);
        System.out.println(pc1);

    }
}