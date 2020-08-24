package com.mycompany.logica.figuras;

import com.mycompany.logica.modelo.Modelo;

public class Alfil extends Figura {

    public Alfil(String color, Modelo modelo) {
        super(color, modelo);
        if (color.equals("negra")) {
            tipo = "a";
        } else if (color.equals("blanca")) {
            tipo = "A";
        }
    }

    public Alfil(String color) {
        super(color);
        if (color.equals("negra")) {
            tipo = "a";
        } else if (color.equals("blanca")) {
            tipo = "A";
        }
    }

    @Override
    public void evaluaCasillas(int posInicialX, int posInicialY, int posFinalX, int posFinalY) {
        
        Boolean entro=false;
        int posIniX = posInicialX;
        int posIniY = posInicialY;
        Boolean while2=false;
        
        if (tipo.equals("a")) {//Ficha negra
            //System.out.println("soy un alfil negro");
            if (posInicialX == posFinalX ||posInicialY==posFinalY) {
                System.out.println("Movimiento invalido");
            }
            else if((posInicialX>posFinalX) &&(posInicialY>posFinalY)){
                while (modelo.getTablero()[posIniX - 1][posIniY-1].getTipo().equals(".")||(while2==false&&modelo.getTablero()[posInicialX-1][posInicialY-1].getColor().equals("blanca")&&posInicialX-1==posFinalX&&posInicialY-1==posFinalY)){
                            posIniX--;
                            posIniY--; 
                    
                            if (posIniX == posFinalX&&posIniY==posFinalY) {
                                modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialX][posInicialY];                                
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");  
                                
                                entro = true;
                                break;
                            } else if ((posIniX - 1 == posFinalX) && (posIniY - 1 == posFinalY) &&(modelo.getTablero()[posIniX-1][posIniY-1].getColor().equals("blanca"))){
                                modelo.getTablero()[posIniX-1][posIniY-1] = modelo.getTablero()[posInicialX][posInicialY];
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            }
                            while2=true;
                            if(((posIniX==0||posIniY==0)&&entro==false)||((posIniX==7||posIniY==7)&&entro==false))
                            {
                                break;
                            }
                            
                        }
                    
                        if (entro == false) {
                            System.out.println("Movimiento invalido");
                        }
                }
            else if((posInicialX>posFinalX) &&(posInicialY<posFinalY)){
                
                while (modelo.getTablero()[posIniX - 1][posIniY+1].getTipo().equals(".")||(while2==false&&modelo.getTablero()[posInicialX-1][posInicialY+1].getColor().equals("blanca")&&posInicialX-1==posFinalX&&posInicialY+1==posFinalY)){
                            posIniX--;
                            posIniY++; 
                            
                            if (posIniX == posFinalX&&posIniY==posFinalY) {
                                
                                modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialX][posInicialY];                                
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");                               
                                entro = true;
                                break;
                            } else if ((posIniX - 1 == posFinalX) && (posIniY + 1 == posFinalY) &&(modelo.getTablero()[posIniX-1][posIniY+1].getColor().equals("blanca"))){
                                
                                modelo.getTablero()[posIniX-1][posIniY+1] = modelo.getTablero()[posInicialX][posInicialY];
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            }
                            while2=true;
                            if(((posIniX==0||posIniY==0)&&entro==false)||((posIniX==7||posIniY==7)&&entro==false))
                            {
                                break;
                            }
                            
                        }
                    
                        if (entro == false) {
                            System.out.println("Movimiento invalido");
                        }
                }                      
            else if((posInicialX<posFinalX) &&(posInicialY>posFinalY)){
                while (modelo.getTablero()[posIniX + 1][posIniY-1].getTipo().equals(".")||(while2==false&&modelo.getTablero()[posInicialX+1][posInicialY-1].getColor().equals("blanca")&&posInicialX+1==posFinalX&&posInicialY-1==posFinalY)){
                            posIniX++;
                            posIniY--; 
                    
                            if (posIniX == posFinalX&&posIniY==posFinalY) {
                                modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialX][posInicialY];                                
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");  
                                
                                entro = true;
                                break;
                            } else if ((posIniX + 1 == posFinalX) && (posIniY - 1 == posFinalY) &&(modelo.getTablero()[posIniX+1][posIniY-1].getColor().equals("blanca"))){
                                modelo.getTablero()[posIniX+1][posIniY-1] = modelo.getTablero()[posInicialX][posInicialY];
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            }
                            while2=true;
                            if(((posIniX==0||posIniY==0)&&entro==false)||((posIniX==7||posIniY==7)&&entro==false))
                            {
                                break;
                            }
                            
                        }
                    
                        if (entro == false) {
                            System.out.println("Movimiento invalido");
                    }
                        
            }   
            else if((posInicialX<posFinalX) &&(posInicialY<posFinalY)){
                while (modelo.getTablero()[posIniX + 1][posIniY+1].getTipo().equals(".")||(while2==false&&modelo.getTablero()[posInicialX+1][posInicialY+1].getColor().equals("blanca")&&posInicialX+1==posFinalX&&posInicialY+1==posFinalY)){
                            posIniX++;
                            posIniY++; 
                    
                            if (posIniX == posFinalX&&posIniY==posFinalY) {
                                modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialX][posInicialY];                                
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");  
                                
                                entro = true;
                                break;
                            } else if ((posIniX + 1 == posFinalX) && (posIniY + 1 == posFinalY) &&(modelo.getTablero()[posIniX+1][posIniY+1].getColor().equals("blanca"))){
                                modelo.getTablero()[posIniX+1][posIniY+1] = modelo.getTablero()[posInicialX][posInicialY];
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            }
                            while2=true;
                            if(((posIniX==0||posIniY==0)&&entro==false)||((posIniX==7||posIniY==7)&&entro==false))
                            {
                                break;
                            }
                            
                        }
                        
                    
                        if (entro == false) {
                            System.out.println("Movimiento invalido");
                        }
                }
            else{
                System.out.println("Movimiento invalido");
            }
        } else if (tipo.equals("A")) {//Ficha blanca
            //System.out.println("soy un alfil blanco");                    
            if (posInicialX == posFinalX ||posInicialY==posFinalY) {
                System.out.println("Movimiento invalido");
            }
            else if((posInicialX>posFinalX) &&(posInicialY>posFinalY)){
                while (modelo.getTablero()[posIniX - 1][posIniY-1].getTipo().equals(".")||(while2==false&&modelo.getTablero()[posInicialX-1][posInicialY-1].getColor().equals("negra")&&posInicialX-1==posFinalX&&posInicialY-1==posFinalY)){
                            posIniX--;
                            posIniY--; 
                    
                            if (posIniX == posFinalX&&posIniY==posFinalY) {
                                modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialX][posInicialY];                                
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");  
                                
                                entro = true;
                                break;
                            } else if ((posIniX - 1 == posFinalX) && (posIniY - 1 == posFinalY) &&(modelo.getTablero()[posIniX-1][posIniY-1].getColor().equals("negra"))){
                                modelo.getTablero()[posIniX-1][posIniY-1] = modelo.getTablero()[posInicialX][posInicialY];
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            }
                            while2=true;
                            if(((posIniX==0||posIniY==0)&&entro==false)||((posIniX==7||posIniY==7)&&entro==false))
                            {
                                break;
                            }
                            
                        }
                    
                        if (entro == false) {
                            System.out.println("Movimiento invalido");
                        }
                }
            else if((posInicialX>posFinalX) &&(posInicialY<posFinalY)){
                
                while (modelo.getTablero()[posIniX - 1][posIniY+1].getTipo().equals(".")||(while2==false&&modelo.getTablero()[posInicialX-1][posInicialY+1].getColor().equals("negra")&&posInicialX-1==posFinalX&&posInicialY+1==posFinalY)){
                            posIniX--;
                            posIniY++; 
                            
                            if (posIniX == posFinalX&&posIniY==posFinalY) {
                                
                                modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialX][posInicialY];                                
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");                               
                                entro = true;
                                break;
                            } else if ((posIniX - 1 == posFinalX) && (posIniY + 1 == posFinalY) &&(modelo.getTablero()[posIniX-1][posIniY+1].getColor().equals("negra"))){
                                
                                modelo.getTablero()[posIniX-1][posIniY+1] = modelo.getTablero()[posInicialX][posInicialY];
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            }
                            while2=true;
                            if(((posIniX==0||posIniY==0)&&entro==false)||((posIniX==7||posIniY==7)&&entro==false))
                            {
                                break;
                            }
                            
                        }
                    
                        if (entro == false) {
                            System.out.println("Movimiento invalido");
                        }
                }                      
            else if((posInicialX<posFinalX) &&(posInicialY>posFinalY)){
                while (modelo.getTablero()[posIniX + 1][posIniY-1].getTipo().equals(".")||(while2==false&&modelo.getTablero()[posInicialX+1][posInicialY-1].getColor().equals("negra")&&posInicialX+1==posFinalX&&posInicialY-1==posFinalY)){
                                                        
                            posIniX++;
                            posIniY--;                                                       
                    
                            if (posIniX == posFinalX&&posIniY==posFinalY) {
                                modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialX][posInicialY];                                
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia"); 
                                entro = true;
                                break;
                            } else if ((posIniX + 1 == posFinalX) && (posIniY - 1 == posFinalY) &&(modelo.getTablero()[posIniX+1][posIniY-1].getColor().equals("negra"))){
                                modelo.getTablero()[posIniX+1][posIniY-1] = modelo.getTablero()[posInicialX][posInicialY];
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            }
                            while2=true;
                            
                            if(((posIniX==0||posIniY==0)&&entro==false)||((posIniX==7||posIniY==7)&&entro==false))
                            {
                                break;
                            }
                            
                        }
                    
                    if (entro == false) {
                            System.out.println("Movimiento invalido");
                    }
                        
            }   
            else if((posInicialX<posFinalX) &&(posInicialY<posFinalY)){
                while (modelo.getTablero()[posIniX + 1][posIniY+1].getTipo().equals(".")||(while2==false&&modelo.getTablero()[posInicialX+1][posInicialY+1].getColor().equals("negra")&&posInicialX+1==posFinalX&&posInicialY+1==posFinalY)){
                            posIniX++;
                            posIniY++; 
                    
                            if (posIniX == posFinalX&&posIniY==posFinalY) {
                                modelo.getTablero()[posIniX][posIniY] = modelo.getTablero()[posInicialX][posInicialY];                                
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");  
                                
                                entro = true;
                                break;
                            } else if ((posIniX + 1 == posFinalX) && (posIniY + 1 == posFinalY) &&(modelo.getTablero()[posIniX+1][posIniY+1].getColor().equals("negra"))){
                                modelo.getTablero()[posIniX+1][posIniY+1] = modelo.getTablero()[posInicialX][posInicialY];
                                modelo.getTablero()[posInicialX][posInicialY] = new FiguraVacia("vacia");
                                entro = true;
                                break;
                            }
                            while2=true;
                            if(((posIniX==0||posIniY==0)&&entro==false)||((posIniX==7||posIniY==7)&&entro==false))
                            {
                                break;
                            }
                            
                        }
                    
                        if (entro == false) {
                            System.out.println("Movimiento invalido");
                        }
                }
            else{
                System.out.println("Movimiento invalido");
            }
        }             

    }
}
