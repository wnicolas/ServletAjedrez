package com.mycompany.logica.modelo;

import com.mycompany.logica.figuras.Alfil;
import com.mycompany.logica.figuras.Caballo;
import com.mycompany.logica.figuras.Dama;
import com.mycompany.logica.figuras.Figura;
import com.mycompany.logica.figuras.FiguraVacia;
import com.mycompany.logica.figuras.Peon;
import com.mycompany.logica.figuras.Rey;
import com.mycompany.logica.figuras.Torre;

public class Modelo {

    private Figura tablero[][] = new Figura[8][8];

    public Modelo() {
        init();
    }

    public void init() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                FiguraVacia vacia = new FiguraVacia("vacia");
                tablero[i][j] = vacia;
            }
            initPeones();
            initTorres();
            initCaballos();
            initAlfiles();
            initDamas();
            initReyes();
        }
    }

    public void initPeones() {
        for (int j = 0; j < 8; j++) {
            Peon peon= new Peon("negra",this);
            tablero[1][j] = peon;
        }
        for (int j = 0; j < 8; j++) {
            Peon peon= new Peon("blanca",this);
            tablero[6][j] = peon;
        }
    }
    
    public void initTorres(){
        
        for (int i = 0; i < 2; i++) {
            Torre torre=new Torre("negra",this);
            tablero[0][i*7] = torre;
        }
        for (int i = 0; i < 2; i++) {
            Torre torre=new Torre("blanca",this);
            tablero[7][i*7] = torre;
        }
        
    }
    
    public void initCaballos(){
        
        for (int i = 0; i < 2; i++) {
            Caballo caballo=new Caballo("negra",this);
            tablero[0][1+i*5] = caballo;
        }
        for (int i = 0; i < 2; i++) {
            Caballo caballo=new Caballo("blanca",this);
            tablero[7][1+i*5] = caballo;
        }
        
    }
    
    public void initAlfiles(){
        
        for (int i = 0; i < 2; i++) {
            Alfil alfil=new Alfil("negra",this);
            tablero[0][2+i*3] = alfil;
        }
        for (int i = 0; i < 2; i++) {
            Alfil alfil=new Alfil("blanca",this);
            tablero[7][2+i*3] = alfil;
        }
        
    }
    
    public void initDamas(){
        
        Dama dama0=new Dama("negra",this);
        tablero[0][3]=dama0;
        Dama dama1=new Dama("blanca",this);
        tablero[7][3]=dama1;
        
    }
    
    public void initReyes(){
        
        Rey rey0=new Rey("negra",this);
        tablero[0][4]=rey0;
        Rey rey1=new Rey("blanca",this);
        tablero[7][4]=rey1;
        
    }

    public void mostrarTablero() {
        System.out.print("  |");
        for (int i = 0; i < 8; i++) {
            System.out.print("_"+i);
        }
        System.out.println("");
        for (int i = 0; i < 8; i++) {
            System.out.print(i+" | ");
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j].getTipo()+" ");
                
            }
            System.out.print("|"+i);
            System.out.println("");
        }
        System.out.print("  |");
        for (int i = 0; i < 8; i++) {
            System.out.print("_"+i);
        }
        System.out.println("");

    }

    public Figura[][] getTablero() {
        return tablero;
    }

    public void setTablero(Figura[][] tablero) {
        this.tablero = tablero;
    }
    
    

}
