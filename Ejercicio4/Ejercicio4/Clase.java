package     Ejercicio4;

public class Clase {

    Nodo cima;
    int tam;

    public Clase () {
        this.cima = null;
        this.tam = 0;
    }

    public boolean EstaVacia () {
        if (cima == null) {
            return true;
        } 
        else 
            return false;
        
    }

    public void Agregar (int d) {
        Nodo nuevo = new Nodo (d);
        nuevo.siguiente = cima;
        cima = nuevo;
        tam ++;
    }

    public int eliminar () {
        int aux = cima.dato;
        cima = cima.siguiente;
        tam--;
        return aux;
    }

    public int cima () {
        return cima.dato;
    }

    public int tam () {
        return tam;
    }

    public void MostrarPila () {
        Nodo aux = cima;
        while (aux!= null) {
            System.out.println ("[" + aux.dato + "]");
            aux = aux.siguiente;
        }
        System.out.println ("");
    }

}
