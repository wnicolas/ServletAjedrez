package com.mycompany.logica.figuras;

import com.mycompany.logica.modelo.Modelo;

public class Peon extends Figura {

    boolean posicionInicial = true;

    public Peon(String color, Modelo modelo) {
        super(color, modelo);
        if (color.equals("negra")) {
            tipo = "p";
        } else if (color.equals("blanca")) {
            tipo = "P";
        }
    }

    public Peon(String color) {
        super(color);
        if (color.equals("negra")) {
            tipo = "p";
        } else if (color.equals("blanca")) {
            tipo = "P";
        }
    }

    @Override
    public void evaluaCasillas(int posInicialI, int posInicialJ, int posFinalI, int posFinalJ) {

        if (!posicionInicial) {
            if (tipo.equals("p")) {//FICHA NEGRA

                if (posInicialJ == 0 || posInicialJ == 7) {
                    if (posInicialJ == 0) {
                        if (modelo.getTablero()[posInicialI + 1][posInicialJ + 1].getColor().equals("blanca") && posFinalI == posInicialI + 1 && posFinalJ == posInicialJ + 1) {
                            modelo.getTablero()[posInicialI + 1][posInicialJ + 1] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        } else if (modelo.getTablero()[posInicialI + 1][posInicialJ].getTipo().equals(".") && posFinalI == posInicialI + 1 && posFinalJ == posInicialJ) {
                            modelo.getTablero()[posInicialI + 1][posInicialJ] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        }
                    } else if (posInicialJ == 7) {
                        if (modelo.getTablero()[posInicialI + 1][posInicialJ - 1].getColor().equals("blanca") && posFinalI == posInicialI + 1 && posFinalJ == posInicialJ - 1) {
                            modelo.getTablero()[posInicialI + 1][posInicialJ - 1] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        } else if (modelo.getTablero()[posInicialI + 1][posInicialJ].getTipo().equals(".") && posFinalI == posInicialI + 1 && posFinalJ == posInicialJ) {
                            modelo.getTablero()[posInicialI + 1][posInicialJ] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");

                        }
                    }
                } else if (modelo.getTablero()[posInicialI + 1][posInicialJ + 1].getColor().equals("blanca") && posFinalI == posInicialI + 1 && posFinalJ == posInicialJ + 1) {
                    modelo.getTablero()[posInicialI + 1][posInicialJ + 1] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");

                } else if (modelo.getTablero()[posInicialI + 1][posInicialJ - 1].getColor().equals("blanca") && posFinalI == posInicialI + 1 && posFinalJ == posInicialJ - 1) {
                    modelo.getTablero()[posInicialI + 1][posInicialJ - 1] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                } else if (modelo.getTablero()[posInicialI + 1][posInicialJ].getTipo().equals(".") && posFinalI == posInicialI + 1 && posFinalJ == posInicialJ) {
                    modelo.getTablero()[posInicialI + 1][posInicialJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");

                }
            } else {//FICHA BLANCA

                if (posInicialJ == 0 || posInicialJ == 7) {
                    if (posInicialJ == 0) {
                        if (modelo.getTablero()[posInicialI - 1][posInicialJ + 1].getColor().equals("negra") && posFinalI == posInicialI - 1 && posFinalJ == posInicialJ + 1) {
                            modelo.getTablero()[posInicialI - 1][posInicialJ + 1] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        } else if (modelo.getTablero()[posInicialI - 1][posInicialJ].getTipo().equals(".") && posFinalI == posInicialI - 1 && posFinalJ == posInicialJ) {
                            modelo.getTablero()[posInicialI - 1][posInicialJ] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        }
                    } else if (posInicialJ == 7) {
                        if (modelo.getTablero()[posInicialI - 1][posInicialJ - 1].getColor().equals("negra") && posFinalI == posInicialI - 1 && posFinalJ == posInicialJ - 1) {
                            modelo.getTablero()[posInicialI - 1][posInicialJ - 1] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                        } else if (modelo.getTablero()[posInicialI - 1][posInicialJ].getTipo().equals(".") && posFinalI == posInicialI - 1 && posFinalJ == posInicialJ) {
                            modelo.getTablero()[posInicialI - 1][posInicialJ] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");

                        }
                    }
                } else if (modelo.getTablero()[posInicialI - 1][posInicialJ + 1].getColor().equals("negra") && posFinalI == posInicialI - 1 && posFinalJ == posInicialJ + 1) {
                    modelo.getTablero()[posInicialI - 1][posInicialJ + 1] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");

                } else if (modelo.getTablero()[posInicialI - 1][posInicialJ - 1].getColor().equals("negra") && posFinalI == posInicialI - 1 && posFinalJ == posInicialJ - 1) {
                    modelo.getTablero()[posInicialI - 1][posInicialJ - 1] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                } else if (modelo.getTablero()[posInicialI - 1][posInicialJ].getTipo().equals(".") && posFinalI == posInicialI - 1 && posFinalJ == posInicialJ) {
                    modelo.getTablero()[posInicialI - 1][posInicialJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");

                }

            }

        } else {
            System.out.println("holi");

            if (tipo.equals("p")) {//FICHA NEGRA

                if (posInicialJ == 0 || posInicialJ == 7) {
                    if (posInicialJ == 0) {
                        if (modelo.getTablero()[posInicialI + 1][posInicialJ + 1].getColor().equals("blanca") && posFinalI == posInicialI + 1 && posFinalJ == posInicialJ + 1) {
                            modelo.getTablero()[posInicialI + 1][posInicialJ + 1] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            posicionInicial = false;
                        } else if (modelo.getTablero()[posInicialI + 1][posInicialJ].getTipo().equals(".") && posFinalI == posInicialI + 1 && posFinalJ == posInicialJ) {
                            modelo.getTablero()[posInicialI + 1][posInicialJ] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            posicionInicial = false;
                        } else if (modelo.getTablero()[posInicialI + 2][posInicialJ].getTipo().equals(".") && posFinalI == posInicialI + 2 && posFinalJ == posInicialJ) {
                            modelo.getTablero()[posInicialI + 2][posInicialJ] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            posicionInicial = false;
                        }

                    } else if (posInicialJ == 7) {
                        if (modelo.getTablero()[posInicialI + 1][posInicialJ - 1].getColor().equals("blanca") && posFinalI == posInicialI + 1 && posFinalJ == posInicialJ - 1) {
                            modelo.getTablero()[posInicialI + 1][posInicialJ - 1] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            posicionInicial = false;
                        } else if (modelo.getTablero()[posInicialI + 1][posInicialJ].getTipo().equals(".") && posFinalI == posInicialI + 1 && posFinalJ == posInicialJ) {
                            modelo.getTablero()[posInicialI + 1][posInicialJ] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            posicionInicial = false;

                        } else if (modelo.getTablero()[posInicialI + 2][posInicialJ].getTipo().equals(".") && posFinalI == posInicialI + 2 && posFinalJ == posInicialJ) {
                            modelo.getTablero()[posInicialI + 2][posInicialJ] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            posicionInicial = false;
                        }

                    }
                } else if (modelo.getTablero()[posInicialI + 1][posInicialJ + 1].getColor().equals("blanca") && posFinalI == posInicialI + 1 && posFinalJ == posInicialJ + 1) {
                    modelo.getTablero()[posInicialI + 1][posInicialJ + 1] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                    posicionInicial = false;
                } else if (modelo.getTablero()[posInicialI + 1][posInicialJ - 1].getColor().equals("blanca") && posFinalI == posInicialI + 1 && posFinalJ == posInicialJ - 1) {
                    modelo.getTablero()[posInicialI + 1][posInicialJ - 1] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                    posicionInicial = false;
                } else if (modelo.getTablero()[posInicialI + 1][posInicialJ].getTipo().equals(".") && posFinalI == posInicialI + 1 && posFinalJ == posInicialJ) {
                    modelo.getTablero()[posInicialI + 1][posInicialJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                    posicionInicial = false;
                } else if (modelo.getTablero()[posInicialI + 2][posInicialJ].getTipo().equals(".") && posFinalI == posInicialI + 2 && posFinalJ == posInicialJ) {
                    modelo.getTablero()[posInicialI + 2][posInicialJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                    posicionInicial = false;
                }

            } else {//FICHA BLANCA

                if (posInicialJ == 0 || posInicialJ == 7) {
                    if (posInicialJ == 0) {
                        if (modelo.getTablero()[posInicialI - 1][posInicialJ + 1].getColor().equals("negra") && posFinalI == posInicialI - 1 && posFinalJ == posInicialJ + 1) {
                            modelo.getTablero()[posInicialI - 1][posInicialJ + 1] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            posicionInicial = false;
                        } else if (modelo.getTablero()[posInicialI - 1][posInicialJ].getTipo().equals(".") && posFinalI == posInicialI - 1 && posFinalJ == posInicialJ) {
                            modelo.getTablero()[posInicialI - 1][posInicialJ] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            posicionInicial = false;
                        } else if (modelo.getTablero()[posInicialI - 2][posInicialJ].getTipo().equals(".") && posFinalI == posInicialI - 2 && posFinalJ == posInicialJ) {
                            modelo.getTablero()[posInicialI - 2][posInicialJ] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            posicionInicial = false;
                        }

                    } else if (posInicialJ == 7) {
                        if (modelo.getTablero()[posInicialI - 1][posInicialJ - 1].getColor().equals("negra") && posFinalI == posInicialI - 1 && posFinalJ == posInicialJ - 1) {
                            modelo.getTablero()[posInicialI - 1][posInicialJ - 1] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            posicionInicial = false;
                        } else if (modelo.getTablero()[posInicialI - 1][posInicialJ].getTipo().equals(".") && posFinalI == posInicialI - 1 && posFinalJ == posInicialJ) {
                            modelo.getTablero()[posInicialI - 1][posInicialJ] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            posicionInicial = false;
                        } else if (modelo.getTablero()[posInicialI - 2][posInicialJ].getTipo().equals(".") && posFinalI == posInicialI - 2 && posFinalJ == posInicialJ) {
                            modelo.getTablero()[posInicialI - 2][posInicialJ] = modelo.getTablero()[posInicialI][posInicialJ];
                            modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                            posicionInicial = false;
                        }

                    }
                } else if (modelo.getTablero()[posInicialI - 1][posInicialJ + 1].getColor().equals("negra") && posFinalI == posInicialI - 1 && posFinalJ == posInicialJ + 1) {
                    modelo.getTablero()[posInicialI - 1][posInicialJ + 1] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                    posicionInicial = false;

                } else if (modelo.getTablero()[posInicialI - 1][posInicialJ - 1].getColor().equals("negra") && posFinalI == posInicialI - 1 && posFinalJ == posInicialJ - 1) {
                    modelo.getTablero()[posInicialI - 1][posInicialJ - 1] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                    posicionInicial = false;
                } else if (modelo.getTablero()[posInicialI - 1][posInicialJ].getTipo().equals(".") && posFinalI == posInicialI - 1 && posFinalJ == posInicialJ) {
                    modelo.getTablero()[posInicialI - 1][posInicialJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                    posicionInicial = false;
                } else if (modelo.getTablero()[posInicialI - 2][posInicialJ].getTipo().equals(".") && posFinalI == posInicialI - 2 && posFinalJ == posInicialJ) {
                    modelo.getTablero()[posInicialI - 2][posInicialJ] = modelo.getTablero()[posInicialI][posInicialJ];
                    modelo.getTablero()[posInicialI][posInicialJ] = new FiguraVacia("vacia");
                    posicionInicial = false;
                }

            }

        }

    }

}
