package org.example.model.entities;

public class Componente implements Equipo {
    private String nombre;
    private int consumo;
    private int precio;

    @Override
    public int getPrecio() {
        return this.precio;
    }

    @Override
    public int getConsumo() {
        return this.consumo;
    }

    public Componente(String nombre, int consumo, int precio) {
        this.nombre = nombre;
        this.consumo = consumo;
        this.precio = precio;
    }
}
