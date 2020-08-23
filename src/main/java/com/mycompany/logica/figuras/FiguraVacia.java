package com.mycompany.logica.figuras;

import com.mycompany.logica.modelo.Modelo;

public class FiguraVacia extends Figura {

    public FiguraVacia(String color,Modelo modelo) {
        
        
        super(color,modelo);
        tipo = ".";
    }

    public FiguraVacia(String color){
        super(color);
        tipo = ".";
    }

    @Override
    public void evaluaCasillas(int posInicialX, int posInicialY, int posFinalX, int posFinalY) {

    }

}
