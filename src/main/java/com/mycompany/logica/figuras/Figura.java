
package com.mycompany.logica.figuras;

import com.mycompany.logica.modelo.Modelo;
import java.awt.Dimension;
import java.util.ArrayList;


public abstract class Figura {
    protected String tipo;
    private String color;
    protected Modelo modelo;
    private ArrayList<Dimension> casillasDisponibles=new ArrayList<>();
    
    public Figura(String color, Modelo modelo){
        this.color=color;
        this.modelo=modelo;
    }
    
    public Figura(String color){
        this.color=color;
    }
    
    
    
    
    public Figura(){
    }
    
    public abstract void evaluaCasillas(int posInicialX, int posInicialY, int posFinalX, int posFinalY);

    public String getColor() {
        return color;
    }

    public ArrayList<Dimension> getCasillasDisponibles() {
        return casillasDisponibles;
    }

    public String getTipo() {
        return tipo;
    }
    
    
    
    
    
}
