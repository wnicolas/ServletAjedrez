package com.mycompany.logica.controlador;

import com.mycompany.logica.modelo.Modelo;
import javax.swing.JOptionPane;

public class ControladorMovimientos {

    public static boolean turnoBlancas = true;
    Modelo modelo;
    int posinii, posinij, posfini, posfinj;

    public ControladorMovimientos(Modelo modelo) {
        this.modelo = modelo;

    }

//Método de que hace toda la magia de los movimientos

    public boolean mover(int posInicialI, int posInicialJ, int posFinalI, int posFinalJ) {
        if (turnoBlancas && modelo.getTablero()[posInicialI][posInicialJ].getColor().equals("blanca")) {
            if (!modelo.getTablero()[posInicialI][posInicialJ].getTipo().equals(".")) {
                if (modelo.getTablero()[posFinalI][posFinalJ].getTipo().equals(".") || modelo.getTablero()[posFinalI][posFinalJ].getColor().equals("negra")) {
                    if (modelo.getTablero()[posFinalI][posFinalJ].getTipo().equals("r")) {
                        JOptionPane.showMessageDialog(null, "No puede matar al rey, solo con jacke");
                    } else {
                        modelo.getTablero()[posInicialI][posInicialJ].evaluaCasillas(posInicialI, posInicialJ, posFinalI, posFinalJ);
                        if (modelo.getTablero()[posFinalI][posFinalJ].getColor().equals("blanca")) {
                            turnoBlancas = false;
                            return true;
                        }
                    }

                }
            } else {
                System.out.println("Posición vacía");
            }
        } else if (!turnoBlancas && modelo.getTablero()[posInicialI][posInicialJ].getColor().equals("negra")) {
            if (!modelo.getTablero()[posInicialI][posInicialJ].getTipo().equals(".")) {
                if (modelo.getTablero()[posFinalI][posFinalJ].getTipo().equals(".") || modelo.getTablero()[posFinalI][posFinalJ].getColor().equals("blanca")) {
                    if (modelo.getTablero()[posFinalI][posFinalJ].getTipo().equals("R")) {
                        JOptionPane.showMessageDialog(null, "No puede matar al rey, solo con jacke");
                    } else {
                        modelo.getTablero()[posInicialI][posInicialJ].evaluaCasillas(posInicialI, posInicialJ, posFinalI, posFinalJ);
                        if (modelo.getTablero()[posFinalI][posFinalJ].getColor().equals("negra")) {
                            turnoBlancas = true;
                            return true;
                        }
                    }

                }

            } else {
                System.out.println("Posición vacía");
            }
        }
        return false;
    }
}
