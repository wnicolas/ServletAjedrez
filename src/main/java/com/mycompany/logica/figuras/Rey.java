package com.mycompany.logica.figuras;

import com.mycompany.logica.modelo.Modelo;

public class Rey extends Figura {

    public Rey(String color, Modelo modelo) {
        super(color, modelo);
        if (color.equals("negra")) {
            tipo = "r";
        } else if (color.equals("blanca")) {
            tipo = "R";
        }
    }

    public Rey(String color) {
        super(color);
        if (color.equals("negra")) {
            tipo = "r";
        } else if (color.equals("blanca")) {
            tipo = "R";
        }
    }

    @Override
    public void evaluaCasillas(int posInicialI, int posInicialJ, int posFinalI, int posFinalJ) {
        if (tipo.equals("r")) {//FICHA NEGRA
            if (posFinalI == posInicialI + 1 && posInicialJ == posFinalJ) {//Abajo
                if (modelo.getTablero()[posFinalI][posFinalJ].getColor().equals("blanca") || modelo.getTablero()[posFinalI][posFinalJ].getTipo().equals(".")) {
                    modelo.getTablero()[posFinalI][posFinalJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                }
            } else if (posFinalI == posInicialI - 1 && posInicialJ == posFinalJ) {//Arriba
                if (modelo.getTablero()[posFinalI][posFinalJ].getColor().equals("blanca") || modelo.getTablero()[posFinalI][posFinalJ].getTipo().equals(".")) {
                    modelo.getTablero()[posFinalI][posFinalJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                }
            }else if (posFinalI == posInicialI  && posInicialJ +1 == posFinalJ) {//Derecha
                if (modelo.getTablero()[posFinalI][posFinalJ].getColor().equals("blanca") || modelo.getTablero()[posFinalI][posFinalJ].getTipo().equals(".")) {
                    modelo.getTablero()[posFinalI][posFinalJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                }
            }else if (posFinalI == posInicialI  && posInicialJ -1 == posFinalJ) {//Izquierda
                if (modelo.getTablero()[posFinalI][posFinalJ].getColor().equals("blanca") || modelo.getTablero()[posFinalI][posFinalJ].getTipo().equals(".")) {
                    modelo.getTablero()[posFinalI][posFinalJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                }
            }else if (posFinalI == posInicialI+1  && posInicialJ +1 == posFinalJ) {//Abajo Derecha
                if (modelo.getTablero()[posFinalI][posFinalJ].getColor().equals("blanca") || modelo.getTablero()[posFinalI][posFinalJ].getTipo().equals(".")) {
                    modelo.getTablero()[posFinalI][posFinalJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                }
            }else if (posFinalI == posInicialI+1  && posInicialJ -1 == posFinalJ) {//Abajo Izquierda
                if (modelo.getTablero()[posFinalI][posFinalJ].getColor().equals("blanca") || modelo.getTablero()[posFinalI][posFinalJ].getTipo().equals(".")) {
                    modelo.getTablero()[posFinalI][posFinalJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                }
            }else if (posFinalI == posInicialI-1  && posInicialJ +1 == posFinalJ) {//Arriba Derecha
                if (modelo.getTablero()[posFinalI][posFinalJ].getColor().equals("blanca") || modelo.getTablero()[posFinalI][posFinalJ].getTipo().equals(".")) {
                    modelo.getTablero()[posFinalI][posFinalJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                }
            }else if (posFinalI == posInicialI-1  && posInicialJ -1 == posFinalJ) {//Abajo izquierda
                if (modelo.getTablero()[posFinalI][posFinalJ].getColor().equals("blanca") || modelo.getTablero()[posFinalI][posFinalJ].getTipo().equals(".")) {
                    modelo.getTablero()[posFinalI][posFinalJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                }
            }

        } else {//FICHA BLANCA
             if (posFinalI == posInicialI + 1 && posInicialJ == posFinalJ) {//Abajo
                if (modelo.getTablero()[posFinalI][posFinalJ].getColor().equals("negra") || modelo.getTablero()[posFinalI][posFinalJ].getTipo().equals(".")) {
                    modelo.getTablero()[posFinalI][posFinalJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                }
            } else if (posFinalI == posInicialI - 1 && posInicialJ == posFinalJ) {//Arriba
                if (modelo.getTablero()[posFinalI][posFinalJ].getColor().equals("negra") || modelo.getTablero()[posFinalI][posFinalJ].getTipo().equals(".")) {
                    modelo.getTablero()[posFinalI][posFinalJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                }
            }else if (posFinalI == posInicialI  && posInicialJ +1 == posFinalJ) {//Derecha
                if (modelo.getTablero()[posFinalI][posFinalJ].getColor().equals("negra") || modelo.getTablero()[posFinalI][posFinalJ].getTipo().equals(".")) {
                    modelo.getTablero()[posFinalI][posFinalJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                }
            }else if (posFinalI == posInicialI  && posInicialJ -1 == posFinalJ) {//Izquierda
                if (modelo.getTablero()[posFinalI][posFinalJ].getColor().equals("negra") || modelo.getTablero()[posFinalI][posFinalJ].getTipo().equals(".")) {
                    modelo.getTablero()[posFinalI][posFinalJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                }
            }else if (posFinalI == posInicialI+1  && posInicialJ +1 == posFinalJ) {//Abajo Derecha
                if (modelo.getTablero()[posFinalI][posFinalJ].getColor().equals("negra") || modelo.getTablero()[posFinalI][posFinalJ].getTipo().equals(".")) {
                    modelo.getTablero()[posFinalI][posFinalJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                }
            }else if (posFinalI == posInicialI+1  && posInicialJ -1 == posFinalJ) {//Abajo Izquierda
                if (modelo.getTablero()[posFinalI][posFinalJ].getColor().equals("negra") || modelo.getTablero()[posFinalI][posFinalJ].getTipo().equals(".")) {
                    modelo.getTablero()[posFinalI][posFinalJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                }
            }else if (posFinalI == posInicialI-1  && posInicialJ +1 == posFinalJ) {//Arriba Derecha
                if (modelo.getTablero()[posFinalI][posFinalJ].getColor().equals("negra") || modelo.getTablero()[posFinalI][posFinalJ].getTipo().equals(".")) {
                    modelo.getTablero()[posFinalI][posFinalJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                }
            }else if (posFinalI == posInicialI-1  && posInicialJ -1 == posFinalJ) {//Abajo izquierda
                if (modelo.getTablero()[posFinalI][posFinalJ].getColor().equals("negra") || modelo.getTablero()[posFinalI][posFinalJ].getTipo().equals(".")) {
                    modelo.getTablero()[posFinalI][posFinalJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                }
            }
        }
    }

}
