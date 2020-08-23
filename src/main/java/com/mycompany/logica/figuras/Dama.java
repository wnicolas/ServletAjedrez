package com.mycompany.logica.figuras;

import com.mycompany.logica.modelo.Modelo;

public class Dama extends Figura {

    public Dama(String color, Modelo modelo) {
        super(color, modelo);
        if (color.equals("negra")) {
            tipo = "d";
        } else if (color.equals("blanca")) {
            tipo = "D";
        }
    }

    public Dama(String color) {
        super(color);
        if (color.equals("negra")) {
            tipo = "d";
        } else if (color.equals("blanca")) {
            tipo = "D";
        }
    }

    @Override
    public void evaluaCasillas(int posInicialI, int posInicialJ, int posFinalI, int posFinalJ) {
        Boolean entro;
        int posIniX = posInicialI;
        int posIniY = posInicialJ;
        Boolean while2 = false;
        if (tipo.equals("d")) {//Ficha negra
            //System.out.println("soy una torra negra");            
            entro = false;
            if (posInicialJ == posFinalJ) {
                if (posInicialI > posFinalI) {

                    while (modelo.getTablero()[posIniX - 1][posInicialJ].getTipo().equals(".") || (while2 == false && modelo.getTablero()[posInicialI - 1][posInicialJ].getColor().equals("blanca") && posInicialI - 1 == posFinalI)) {

                        posIniX--;
                        if (posIniX == posFinalI) {
                            modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            System.out.println(modelo.getTablero()[posInicialI][posInicialJ]);
                            entro = true;
                            break;
                        } else if ((posIniX - 1 == posFinalI) && (modelo.getTablero()[posIniX - 1][posInicialJ].getColor().equals("blanca"))) {
                            modelo.getTablero()[posIniX - 1][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            entro = true;
                            break;
                        }
                        while2 = true;
                    }
                    if (entro == false) {
                        System.out.println("Movimiento invalido");
                    }
                } else if (posInicialI < posFinalI) {

                    while (modelo.getTablero()[posIniX + 1][posInicialJ].getTipo().equals(".") || (while2 == false && modelo.getTablero()[posInicialI + 1][posInicialJ].getColor().equals("blanca") && posInicialI + 1 == posFinalI)) {
                        System.out.println("k" + posIniX);

                        posIniX++;
                        System.out.println("entro");
                        if (posIniX == posFinalI) {
                            modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            entro = true;
                            break;
                        } else if ((posIniX + 1 == posFinalI) && (modelo.getTablero()[posIniX + 1][posInicialJ].getColor().equals("blanca"))) {
                            modelo.getTablero()[posIniX + 1][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            entro = true;
                            break;
                        }
                        while2 = true;
                    }
                    if (entro == false) {
                        System.out.println("Movimiento invalido");
                    }
                }

            } else if (posInicialI == posFinalI) {
                if (posInicialJ > posFinalJ) {
                    while (modelo.getTablero()[posIniX][posInicialJ - 1].getTipo().equals(".") || (while2 == false && modelo.getTablero()[posInicialI][posInicialJ - 1].getColor().equals("blanca") && posInicialJ - 1 == posFinalJ)) {
                        posIniY--;
                        if (posIniY == posFinalJ) {
                            modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            entro = true;
                            break;
                        } else if ((posIniY - 1 == posFinalJ) && (modelo.getTablero()[posIniX][posInicialJ - 1].getColor().equals("blanca"))) {
                            modelo.getTablero()[posIniX][posIniY - 1] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            entro = true;
                            break;
                        }
                        while2 = true;
                    }
                    if (entro == false) {
                        System.out.println("Movimiento invalido");
                    }
                } else if (posInicialJ < posFinalJ) {

                    while (modelo.getTablero()[posIniX][posInicialJ + 1].getTipo().equals(".") || (while2 == false && modelo.getTablero()[posInicialI][posInicialJ + 1].getColor().equals("blanca") && posInicialJ + 1 == posFinalJ)) {
                        posIniY++;
                        if (posIniY == posFinalJ) {
                            modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            entro = true;
                            break;
                        } else if ((posIniY + 1 == posFinalJ) && (modelo.getTablero()[posIniX][posInicialJ + 1].getColor().equals("blanca"))) {
                            modelo.getTablero()[posIniX][posIniY + 1] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            entro = true;
                            break;
                        }
                        while2 = true;
                    }
                    if (entro == false) {
                        System.out.println("Movimiento invalido");
                    }
                }

            } else if ((posInicialI > posFinalI) && (posInicialJ > posFinalJ)) {
                while (modelo.getTablero()[posIniX - 1][posIniY - 1].getTipo().equals(".") || (while2 == false && modelo.getTablero()[posInicialI - 1][posInicialJ - 1].getColor().equals("blanca") && posInicialI - 1 == posFinalI && posInicialJ - 1 == posFinalJ)) {
                    posIniX--;
                    posIniY--;

                    if (posIniX == posFinalI && posIniY == posFinalJ) {
                        modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");

                        entro = true;
                        break;
                    } else if ((posIniX - 1 == posFinalI) && (posIniY - 1 == posFinalJ) && (modelo.getTablero()[posIniX - 1][posInicialJ - 1].getColor().equals("blanca"))) {
                        modelo.getTablero()[posIniX - 1][posIniY - 1] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        entro = true;
                        break;
                    }
                    while2 = true;
                    if (((posIniX == 0 || posIniY == 0) && entro == false) || ((posIniX == 7 || posIniY == 7) && entro == false)) {
                        break;
                    }

                }

                if (entro == false) {
                    System.out.println("Movimiento invalido");
                }
            } else if ((posInicialI > posFinalI) && (posInicialJ < posFinalJ)) {

                while (modelo.getTablero()[posIniX - 1][posIniY + 1].getTipo().equals(".") || (while2 == false && modelo.getTablero()[posInicialI - 1][posInicialJ + 1].getColor().equals("blanca") && posInicialI - 1 == posFinalI && posInicialJ + 1 == posFinalJ)) {
                    posIniX--;
                    posIniY++;

                    if (posIniX == posFinalI && posIniY == posFinalJ) {

                        modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        entro = true;
                        break;
                    } else if ((posIniX - 1 == posFinalI) && (posIniY + 1 == posFinalJ) && (modelo.getTablero()[posIniX - 1][posInicialJ + 1].getColor().equals("blanca"))) {

                        modelo.getTablero()[posIniX - 1][posIniY + 1] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        entro = true;
                        break;
                    }
                    while2 = true;
                    if (((posIniX == 0 || posIniY == 0) && entro == false) || ((posIniX == 7 || posIniY == 7) && entro == false)) {
                        break;
                    }

                }

                if (entro == false) {
                    System.out.println("Movimiento invalido");
                }
            } else if ((posInicialI < posFinalI) && (posInicialJ > posFinalJ)) {
                while (modelo.getTablero()[posIniX + 1][posIniY - 1].getTipo().equals(".") || (while2 == false && modelo.getTablero()[posInicialI + 1][posInicialJ - 1].getColor().equals("blanca") && posInicialI + 1 == posFinalI && posInicialJ - 1 == posFinalJ)) {
                    posIniX++;
                    posIniY--;

                    if (posIniX == posFinalI && posIniY == posFinalJ) {
                        modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");

                        entro = true;
                        break;
                    } else if ((posIniX + 1 == posFinalI) && (posIniY - 1 == posFinalJ) && (modelo.getTablero()[posIniX + 1][posInicialJ - 1].getColor().equals("blanca"))) {
                        modelo.getTablero()[posIniX + 1][posIniY - 1] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        entro = true;
                        break;
                    }
                    while2 = true;
                    if (((posIniX == 0 || posIniY == 0) && entro == false) || ((posIniX == 7 || posIniY == 7) && entro == false)) {
                        break;
                    }

                }

                if (entro == false) {
                    System.out.println("Movimiento invalido");
                }

            } else if ((posInicialI < posFinalI) && (posInicialJ < posFinalJ)) {
                while (modelo.getTablero()[posIniX + 1][posIniY + 1].getTipo().equals(".") || (while2 == false && modelo.getTablero()[posInicialI + 1][posInicialJ + 1].getColor().equals("blanca") && posInicialI + 1 == posFinalI && posInicialJ + 1 == posFinalJ)) {
                    posIniX++;
                    posIniY++;

                    if (posIniX == posFinalI && posIniY == posFinalJ) {
                        modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");

                        entro = true;
                        break;
                    } else if ((posIniX + 1 == posFinalI) && (posIniY + 1 == posFinalJ) && (modelo.getTablero()[posIniX + 1][posInicialJ + 1].getColor().equals("blanca"))) {
                        modelo.getTablero()[posIniX + 1][posIniY + 1] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        entro = true;
                        break;
                    }
                    while2 = true;
                    if (((posIniX == 0 || posIniY == 0) && entro == false) || ((posIniX == 7 || posIniY == 7) && entro == false)) {
                        break;
                    }

                }

                if (entro == false) {
                    System.out.println("Movimiento invalido");
                }

            } else if ((posInicialI > posFinalI) && (posInicialJ > posFinalJ)) {
                while (modelo.getTablero()[posIniX - 1][posIniY - 1].getTipo().equals(".") || (while2 == false && modelo.getTablero()[posInicialI - 1][posInicialJ - 1].getColor().equals("blanca") && posInicialI - 1 == posFinalI && posInicialJ - 1 == posFinalJ)) {
                    posIniX--;
                    posIniY--;

                    if (posIniX == posFinalI && posIniY == posFinalJ) {
                        modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");

                        entro = true;
                        break;
                    } else if ((posIniX - 1 == posFinalI) && (posIniY - 1 == posFinalJ) && (modelo.getTablero()[posIniX - 1][posInicialJ - 1].getColor().equals("blanca"))) {
                        modelo.getTablero()[posIniX - 1][posIniY - 1] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        entro = true;
                        break;
                    }
                    while2 = true;
                    if (((posIniX == 0 || posIniY == 0) && entro == false) || ((posIniX == 7 || posIniY == 7) && entro == false)) {
                        break;
                    }

                }

                if (entro == false) {
                    System.out.println("Movimiento invalido");
                }
            } else if ((posInicialI > posFinalI) && (posInicialJ < posFinalJ)) {

                while (modelo.getTablero()[posIniX - 1][posIniY + 1].getTipo().equals(".") || (while2 == false && modelo.getTablero()[posInicialI - 1][posInicialJ + 1].getColor().equals("blanca") && posInicialI - 1 == posFinalI && posInicialJ + 1 == posFinalJ)) {
                    posIniX--;
                    posIniY++;

                    if (posIniX == posFinalI && posIniY == posFinalJ) {

                        modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        entro = true;
                        break;
                    } else if ((posIniX - 1 == posFinalI) && (posIniY + 1 == posFinalJ) && (modelo.getTablero()[posIniX - 1][posInicialJ + 1].getColor().equals("blanca"))) {

                        modelo.getTablero()[posIniX - 1][posIniY + 1] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        entro = true;
                        break;
                    }
                    while2 = true;
                    if (((posIniX == 0 || posIniY == 0) && entro == false) || ((posIniX == 7 || posIniY == 7) && entro == false)) {
                        break;
                    }

                }

                if (entro == false) {
                    System.out.println("Movimiento invalido");
                }
            } else if ((posInicialI < posFinalI) && (posInicialJ > posFinalJ)) {
                while (modelo.getTablero()[posIniX + 1][posIniY - 1].getTipo().equals(".") || (while2 == false && modelo.getTablero()[posInicialI + 1][posInicialJ - 1].getColor().equals("blanca") && posInicialI + 1 == posFinalI && posInicialJ - 1 == posFinalJ)) {
                    posIniX++;
                    posIniY--;

                    if (posIniX == posFinalI && posIniY == posFinalJ) {
                        modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");

                        entro = true;
                        break;
                    } else if ((posIniX + 1 == posFinalI) && (posIniY - 1 == posFinalJ) && (modelo.getTablero()[posIniX + 1][posInicialJ - 1].getColor().equals("blanca"))) {
                        modelo.getTablero()[posIniX + 1][posIniY - 1] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        entro = true;
                        break;
                    }
                    while2 = true;
                    if (((posIniX == 0 || posIniY == 0) && entro == false) || ((posIniX == 7 || posIniY == 7) && entro == false)) {
                        break;
                    }

                }

                if (entro == false) {
                    System.out.println("Movimiento invalido");
                }

            } else if ((posInicialI < posFinalI) && (posInicialJ < posFinalJ)) {
                while (modelo.getTablero()[posIniX + 1][posIniY + 1].getTipo().equals(".") || (while2 == false && modelo.getTablero()[posInicialI + 1][posInicialJ + 1].getColor().equals("blanca") && posInicialI + 1 == posFinalI && posInicialJ + 1 == posFinalJ)) {
                    posIniX++;
                    posIniY++;

                    if (posIniX == posFinalI && posIniY == posFinalJ) {
                        modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");

                        entro = true;
                        break;
                    } else if ((posIniX + 1 == posFinalI) && (posIniY + 1 == posFinalJ) && (modelo.getTablero()[posIniX + 1][posInicialJ + 1].getColor().equals("blanca"))) {
                        modelo.getTablero()[posIniX + 1][posIniY + 1] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        entro = true;
                        break;
                    }
                    while2 = true;
                    if (((posIniX == 0 || posIniY == 0) && entro == false) || ((posIniX == 7 || posIniY == 7) && entro == false)) {
                        break;
                    }

                }

                if (entro == false) {
                    System.out.println("Movimiento invalido");
                }
            } else {
                System.out.println("Movimiento invalido");
            }

        } else if (tipo.equals("D")) {//Ficha blanca

            entro = false;
            if (posInicialJ == posFinalJ) {
                if (posInicialI > posFinalI) {
                    System.out.println("entro0");
                    while (modelo.getTablero()[posIniX - 1][posInicialJ].getTipo().equals(".") || (while2 == false && modelo.getTablero()[posInicialI - 1][posInicialJ].getColor().equals("negra") && posInicialI - 1 == posFinalI)) {

                        posIniX--;
                        if (posIniX == posFinalI) {
                            modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            System.out.println(modelo.getTablero()[posInicialI][posInicialJ]);
                            entro = true;
                            break;
                        } else if ((posIniX - 1 == posFinalI) && (modelo.getTablero()[posIniX - 1][posInicialJ].getColor().equals("negra"))) {
                            modelo.getTablero()[posIniX - 1][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            entro = true;
                            break;
                        }
                        while2 = true;
                    }
                    if (entro == false) {
                        System.out.println("Movimiento invalido");
                    }
                } else if (posInicialI < posFinalI) {

                    while (modelo.getTablero()[posIniX + 1][posInicialJ].getTipo().equals(".") || (while2 == false && modelo.getTablero()[posInicialI + 1][posInicialJ].getColor().equals("negra") && posInicialI + 1 == posFinalI)) {
                        System.out.println("k" + posIniX);

                        posIniX++;
                        System.out.println("entro");
                        if (posIniX == posFinalI) {
                            modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            entro = true;
                            break;
                        } else if ((posIniX + 1 == posFinalI) && (modelo.getTablero()[posIniX + 1][posInicialJ].getColor().equals("negra"))) {
                            modelo.getTablero()[posIniX + 1][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            entro = true;
                            break;
                        }
                        while2 = true;
                    }
                    if (entro == false) {
                        System.out.println("Movimiento invalido");
                    }
                }

            } else if (posInicialI == posFinalI) {
                if (posInicialJ > posFinalJ) {
                    while (modelo.getTablero()[posIniX][posInicialJ - 1].getTipo().equals(".") || (while2 == false && modelo.getTablero()[posInicialI][posInicialJ - 1].getColor().equals("negra") && posInicialJ - 1 == posFinalJ)) {
                        posIniY--;
                        if (posIniY == posFinalJ) {
                            modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            entro = true;
                            break;
                        } else if ((posIniY - 1 == posFinalJ) && (modelo.getTablero()[posIniX][posInicialJ - 1].getColor().equals("negra"))) {
                            modelo.getTablero()[posIniX][posIniY - 1] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            entro = true;
                            break;
                        }
                        while2 = true;
                    }
                    if (entro == false) {
                        System.out.println("Movimiento invalido");
                    }
                } else if (posInicialJ < posFinalJ) {

                    while (modelo.getTablero()[posIniX][posInicialJ + 1].getTipo().equals(".") || (while2 == false && modelo.getTablero()[posInicialI][posInicialJ + 1].getColor().equals("negra") && posInicialJ + 1 == posFinalJ)) {
                        posIniY++;
                        if (posIniY == posFinalJ) {
                            modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            entro = true;
                            break;
                        } else if ((posIniY + 1 == posFinalJ) && (modelo.getTablero()[posIniX][posInicialJ + 1].getColor().equals("negra"))) {
                            modelo.getTablero()[posIniX][posIniY + 1] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            entro = true;
                            break;
                        }
                        while2 = true;
                    }
                    if (entro == false) {
                        System.out.println("Movimiento invalido");
                    }
                } else {
                    System.out.println("Movimiento invalido");
                }

            } else if ((posInicialI > posFinalI) && (posInicialJ > posFinalJ)) {
                while (modelo.getTablero()[posIniX - 1][posIniY - 1].getTipo().equals(".") || (while2 == false && modelo.getTablero()[posInicialI - 1][posInicialJ - 1].getColor().equals("negra") && posInicialI - 1 == posFinalI && posInicialJ - 1 == posFinalJ)) {
                    posIniX--;
                    posIniY--;

                    if (posIniX == posFinalI && posIniY == posFinalJ) {
                        modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");

                        entro = true;
                        break;
                    } else if ((posIniX - 1 == posFinalI) && (posIniY - 1 == posFinalJ) && (modelo.getTablero()[posIniX - 1][posInicialJ - 1].getColor().equals("negra"))) {
                        modelo.getTablero()[posIniX - 1][posIniY - 1] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        entro = true;
                        break;
                    }
                    while2 = true;
                    if (((posIniX == 0 || posIniY == 0) && entro == false) || ((posIniX == 7 || posIniY == 7) && entro == false)) {
                        break;
                    }

                }

                if (entro == false) {
                    System.out.println("Movimiento invalido");
                }
            } else if ((posInicialI > posFinalI) && (posInicialJ < posFinalJ)) {

                while (modelo.getTablero()[posIniX - 1][posIniY + 1].getTipo().equals(".") || (while2 == false && modelo.getTablero()[posInicialI - 1][posInicialJ + 1].getColor().equals("negra") && posInicialI - 1 == posFinalI && posInicialJ + 1 == posFinalJ)) {
                    posIniX--;
                    posIniY++;

                    if (posIniX == posFinalI && posIniY == posFinalJ) {

                        modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        entro = true;
                        break;
                    } else if ((posIniX - 1 == posFinalI) && (posIniY + 1 == posFinalJ) && (modelo.getTablero()[posIniX - 1][posInicialJ + 1].getColor().equals("negra"))) {

                        modelo.getTablero()[posIniX - 1][posIniY + 1] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        entro = true;
                        break;
                    }
                    while2 = true;
                    if (((posIniX == 0 || posIniY == 0) && entro == false) || ((posIniX == 7 || posIniY == 7) && entro == false)) {
                        break;
                    }

                }

                if (entro == false) {
                    System.out.println("Movimiento invalido");
                }
            } else if ((posInicialI < posFinalI) && (posInicialJ > posFinalJ)) {
                while (modelo.getTablero()[posIniX + 1][posIniY - 1].getTipo().equals(".") || (while2 == false && modelo.getTablero()[posInicialI + 1][posInicialJ - 1].getColor().equals("negra") && posInicialI + 1 == posFinalI && posInicialJ - 1 == posFinalJ)) {

                    posIniX++;
                    posIniY--;

                    if (posIniX == posFinalI && posIniY == posFinalJ) {
                        modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        entro = true;
                        break;
                    } else if ((posIniX + 1 == posFinalI) && (posIniY - 1 == posFinalJ) && (modelo.getTablero()[posIniX + 1][posInicialJ - 1].getColor().equals("negra"))) {
                        modelo.getTablero()[posIniX + 1][posIniY - 1] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        entro = true;
                        break;
                    }
                    while2 = true;

                    if (((posIniX == 0 || posIniY == 0) && entro == false) || ((posIniX == 7 || posIniY == 7) && entro == false)) {
                        break;
                    }

                }

                if (entro == false) {
                    System.out.println("Movimiento invalido");
                }

            } else if ((posInicialI < posFinalI) && (posInicialJ < posFinalJ)) {
                while (modelo.getTablero()[posIniX + 1][posIniY + 1].getTipo().equals(".") || (while2 == false && modelo.getTablero()[posInicialI + 1][posInicialJ + 1].getColor().equals("negra") && posInicialI + 1 == posFinalI && posInicialJ + 1 == posFinalJ)) {
                    posIniX++;
                    posIniY++;

                    if (posIniX == posFinalI && posIniY == posFinalJ) {
                        modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");

                        entro = true;
                        break;
                    } else if ((posIniX + 1 == posFinalI) && (posIniY + 1 == posFinalJ) && (modelo.getTablero()[posIniX + 1][posInicialJ + 1].getColor().equals("negra"))) {
                        modelo.getTablero()[posIniX + 1][posIniY + 1] = modelo.getTablero()[posInicialI][posInicialJ];
                        modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        entro = true;
                        break;
                    }
                    while2 = true;
                    if (((posIniX == 0 || posIniY == 0) && entro == false) || ((posIniX == 7 || posIniY == 7) && entro == false)) {
                        break;
                    }

                }

                if (entro == false) {
                    System.out.println("Movimiento invalido");
                }
            }

        } else {
            System.out.println("Movimiento invalido");
        }
    }
}
