package org.example.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Compuesto implements Equipo{
    private List<Equipo> componentes;
    private int total = 0;
    private int consumoTotal = 0;

    public Compuesto() {
        this.componentes  = new ArrayList<Equipo>();

    }

    public void addEquipo(Equipo e) {
        this.componentes.add(e);
        this.total += e.getPrecio();
        this.consumoTotal += e.getConsumo();

    }


    public void deleteEquipo(Equipo e) {
        this.componentes.remove(e);
    }


    @Override
    public int getPrecio() {
        return this.total;
    }

    @Override
    public int getConsumo() {
        return this.consumoTotal;
    }

    @Override
    public String toString(){
        return "El precio de este compuesto es: "+this.total + ", el consumo: " + this.consumoTotal +" , y sus componentes: " + componentes;
    }
}
