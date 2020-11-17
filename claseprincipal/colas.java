package claseprincipal;


public class colas {
     int tamanio;
     nodo inicio, fin;
     
     public colas(){
         inicio=fin=null;
         tamanio=0;
     }
 
    public boolean estaVacia() {
        return inicio == null;
    }
    public void insertarCola(int elemento) {
        nodo nuevo = new nodo(elemento);
        if (estaVacia()) {
            inicio = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tamanio++;
    }
 
    public int eliminarCola() {
        int auxiliar = inicio.dato;
        inicio = inicio.siguiente;
        tamanio--;
        return auxiliar;
    }
    public int inicioCola(){
        return inicio.dato;
    }
    public int tamanioCola(){
        return tamanio;
    }
    
     public void mostrarCola() {
        nodo aux = inicio;
        System.out.println();
        while (aux != null) {
            System.out.print("[" + aux.dato + "]");
            aux = aux.siguiente;
        }
    }
 }
 
