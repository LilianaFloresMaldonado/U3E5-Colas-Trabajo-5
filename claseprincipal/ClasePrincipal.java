package claseprincipal;

import java.util.Scanner;
public class ClasePrincipal {

public static void main(String[] atrgs) {
 Scanner leer=new Scanner(System.in);
        int opcion = 0, elemento;
        colas cola = new colas();
  
 do {
 System.out.println("       **************MENÚ*********");
 System.out.println("    1.-Insertar un elemento a la cola");
 System.out.println("    2.-Eliminar un elemento de la cola");
 System.out.println("    3.-¿La cola esta vacia?");
 System.out.println("    4.-¿Qué elemento esta en el inicio de la cola?");
 System.out.println("    5.-Tamaño de la cola");
 System.out.println("    6.-mostrar la cola");                      
 System.out.println("    7.-salir");                       
 System.out.println("Escoge alguna de estas opciones");            
                 opcion = leer.nextInt();
 
                switch (opcion) {
 
                    case 1:
                        System.out.println("Insertar un elemento");
                        elemento=leer.nextInt();
                        cola.insertarCola(elemento);
                        break;
 
                    case 2:
                        
                        if (!cola.estaVacia()) {
                            elemento = cola.eliminarCola();
                        System.out.println("El elemento sacado es: " + elemento);
                        
                        } else {
                            
                         System.out.println("La cola esta vacia");
                        }
                        break;
 
                    case 3:
                        if (cola.estaVacia()) {
                        System.out.println("La cola esta vacia.");
                                    
                        } else {
                            
                        System.out.println("La Cola no esta vacia.");
                                    
                        }
                        break;
 
                    case 4:
                        if (!cola.estaVacia()) {
                            elemento = cola.inicioCola();
                            System.out.println("El elemento que esta al incio de la cola: " + elemento);
                                    
                        } else {
                            System.out.println("La cola esta vacia.");
                                    
                        }
                        break;
 
                    case 5:
                        elemento = cola.tamanioCola();
                        System.out.println("El tamaño de la cola es: " + elemento);
                                
                        break;

 
                    case 6:
                        if (!cola.estaVacia()) {
                            cola.mostrarCola();
                            System.out.println("");
                        } else {
                           
                            System.out.println("La pila esta vacia, no hay nada que mostrar");
                            
                                  
                        }
                        break;
 
                    case 7:
                        System.out.println("Programa Finalizada");
                                
                        break;
 
                    default:
                        System.out.println("La opcion no esta en el menu");
                               
                }
 
            } while (opcion != 7);
         
            }
        }
 
