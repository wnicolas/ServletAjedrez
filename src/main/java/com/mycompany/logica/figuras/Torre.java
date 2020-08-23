package com.mycompany.logica.figuras;

import com.mycompany.logica.modelo.Modelo;

public class Torre extends Figura {

    public Torre(String color, Modelo modelo) {
        super(color, modelo);
        if (color.equals("negra")) {
            tipo = "t";
        } else if (color.equals("blanca")) {
            tipo = "T";
        }
    }

    public Torre(String color) {
        super(color);
        if (color.equals("negra")) {
            tipo = "t";
        } else if (color.equals("blanca")) {
            tipo = "T";
        }
    }

    @Override
    public void evaluaCasillas(int posInicialX, int posInicialY, int posFinalX, int posFinalY) {

        Boolean entro;
        int posIniX = posInicialX;
        int posIniY = posInicialY;
        Boolean while2=false; 
        if (tipo.equals("t")) {//Ficha negra
            //System.out.println("soy una torra negra");            
                entro = false;
                if (posInicialY == posFinalY) {
                    if (posInicialX > posFinalX) {
                        
                        while (modelo.getTablero()[posIniX - 1][posInicialY].getTipo().equals(".")||(while2==false&&modelo.getTablero()[posInicialX-1][posInicialY].getColor().equals("blanca")&&posInicialX-1==posFinalX)) {                            
                            
                            posIniX--;                            
                            if (posIniX == posFinalX) {
                                modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialX][posInicialY];                                
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");  
                                System.out.println(modelo.getTablero()[posInicialX][posInicialY]);
                                entro = true;
                                break;
                            } else if ((posIniX - 1 == posFinalX) && (modelo.getTablero()[posIniX-1][posInicialY].getColor().equals("blanca"))){
                                modelo.getTablero()[posIniX-1][posIniY] = modelo.getTablero()[posInicialX][posInicialY];
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            }
                            while2=true;
                        }
                        if (entro == false) {
                            System.out.println("Movimiento invalido");
                        }
                    } else if (posInicialX < posFinalX) {
                        
                        while (modelo.getTablero()[posIniX + 1][posInicialY].getTipo().equals(".")||(while2==false&&modelo.getTablero()[posInicialX+1][posInicialY].getColor().equals("blanca")&&posInicialX+1==posFinalX)) {
                            System.out.println("k" + posIniX);
                            
                            posIniX++;
                            System.out.println("entro");
                            if (posIniX == posFinalX) {
                                modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialX][posInicialY];
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            } else if ((posIniX + 1 == posFinalX) && (modelo.getTablero()[posIniX+1][posInicialY].getColor().equals("blanca"))){
                                modelo.getTablero()[posIniX+1][posIniY] = modelo.getTablero()[posInicialX][posInicialY];
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            }
                            while2=true;
                        }
                        if (entro == false) {
                            System.out.println("Movimiento invalido");
                        }
                    }

                } else if (posInicialX == posFinalX) {
                    if (posInicialY > posFinalY) {
                        while (modelo.getTablero()[posIniX][posInicialY - 1].getTipo().equals(".")||(while2==false&&modelo.getTablero()[posInicialX][posInicialY-1].getColor().equals("blanca")&&posInicialY-1==posFinalY)) {
                            posIniY--;
                            if (posIniY == posFinalY) {
                                modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialX][posInicialY];                                
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            }   else if ((posIniY - 1 == posFinalY) && (modelo.getTablero()[posIniX][posInicialY-1].getColor().equals("blanca"))){                                                                
                                modelo.getTablero()[posIniX][posIniY-1] = modelo.getTablero()[posInicialX][posInicialY];
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            }
                            while2=true;
                        }
                        if (entro == false) {
                            System.out.println("Movimiento invalido");
                        }
                    } else if (posInicialY < posFinalY) {

                        while (modelo.getTablero()[posIniX][posInicialY + 1].getTipo().equals(".")||(while2==false&&modelo.getTablero()[posInicialX][posInicialY+1].getColor().equals("blanca")&&posInicialY+1==posFinalY)) {
                            posIniY++;
                            if (posIniY == posFinalY) {                                
                                modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialX][posInicialY];
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            } else if ((posIniY + 1 == posFinalY) && (modelo.getTablero()[posIniX][posInicialY+1].getColor().equals("blanca"))){
                                modelo.getTablero()[posIniX][posIniY+1] = modelo.getTablero()[posInicialX][posInicialY];
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            }
                            while2=true;
                        }
                        if (entro == false) {
                            System.out.println("Movimiento invalido");
                        }
                    }

                } else {
                    System.out.println("Movimiento invalido");
            }
                
             
        } else if (tipo.equals("T")) {//Ficha blanca
            
                entro = false;
                if (posInicialY == posFinalY) {
                    if (posInicialX > posFinalX) {
                        System.out.println("entro0");
                        while (modelo.getTablero()[posIniX - 1][posInicialY].getTipo().equals(".")||(while2==false&&modelo.getTablero()[posInicialX-1][posInicialY].getColor().equals("negra")&&posInicialX-1==posFinalX)) {                            
                            
                            posIniX--;                            
                            if (posIniX == posFinalX) {
                                modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialX][posInicialY];                                
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");  
                                System.out.println(modelo.getTablero()[posInicialX][posInicialY]);
                                entro = true;
                                break;
                            } else if ((posIniX - 1 == posFinalX) && (modelo.getTablero()[posIniX-1][posInicialY].getColor().equals("negra"))){
                                modelo.getTablero()[posIniX-1][posIniY] = modelo.getTablero()[posInicialX][posInicialY];
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            }
                            while2=true;
                        }
                        if (entro == false) {
                            System.out.println("Movimiento invalido");
                        }
                    } else if (posInicialX < posFinalX) {
                        
                        while (modelo.getTablero()[posIniX + 1][posInicialY].getTipo().equals(".")||(while2==false&&modelo.getTablero()[posInicialX+1][posInicialY].getColor().equals("negra")&&posInicialX+1==posFinalX)) {
                            System.out.println("k" + posIniX);
                            
                            posIniX++;
                            System.out.println("entro");
                            if (posIniX == posFinalX) {
                                modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialX][posInicialY];
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            } else if ((posIniX + 1 == posFinalX) && (modelo.getTablero()[posIniX+1][posInicialY].getColor().equals("negra"))){
                                modelo.getTablero()[posIniX+1][posIniY] = modelo.getTablero()[posInicialX][posInicialY];
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            }
                            while2=true;
                        }
                        if (entro == false) {
                            System.out.println("Movimiento invalido");
                        }
                    }

                } else if (posInicialX == posFinalX) {
                    if (posInicialY > posFinalY) {
                        while (modelo.getTablero()[posIniX][posInicialY - 1].getTipo().equals(".")||(while2==false&&modelo.getTablero()[posInicialX][posInicialY-1].getColor().equals("negra")&&posInicialY-1==posFinalY)) {
                            posIniY--;
                            if (posIniY == posFinalY) {
                                modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialX][posInicialY];                                
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            }   else if ((posIniY - 1 == posFinalY) && (modelo.getTablero()[posIniX][posInicialY-1].getColor().equals("negra"))){                                                                
                                modelo.getTablero()[posIniX][posIniY-1] = modelo.getTablero()[posInicialX][posInicialY];
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            }
                            while2=true;
                        }
                        if (entro == false) {
                            System.out.println("Movimiento invalido");
                        }
                    } else if (posInicialY < posFinalY) {

                        while (modelo.getTablero()[posIniX][posInicialY + 1].getTipo().equals(".")||(while2==false&&modelo.getTablero()[posInicialX][posInicialY+1].getColor().equals("negra")&&posInicialY+1==posFinalY)) {
                            posIniY++;
                            if (posIniY == posFinalY) {                                
                                modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialX][posInicialY];
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            } else if ((posIniY + 1 == posFinalY) && (modelo.getTablero()[posIniX][posInicialY+1].getColor().equals("negra"))){
                                modelo.getTablero()[posIniX][posIniY+1] = modelo.getTablero()[posInicialX][posInicialY];
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            }
                            while2=true;
                        }
                        if (entro == false) {
                            System.out.println("Movimiento invalido");
                        }
                    }

                } else {
                    System.out.println("Movimiento invalido");
                }
                
            } 
        else{
            System.out.println("Movimiento invalido");
        }
        }
   // }

}