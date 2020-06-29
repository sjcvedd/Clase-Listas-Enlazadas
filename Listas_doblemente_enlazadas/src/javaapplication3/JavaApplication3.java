package javaapplication3;

class nodo{
    String cedula;
    String nombre;
    int edad;
    nodo siguiente;
    nodo anterior;
    nodo(String ced, String nom, int ed,nodo ant){
        this.cedula = ced;
        this.nombre = nom;
        this.edad = ed;
        this.anterior = ant;
    }
}
class lista{
    nodo L;
    nodo aux;
    boolean isEmpty(){
        if (L == null) {
            return true;
        }else{
            return false;
        }
    }
    void insert(String cedula,String nombre, int edad){
        if (this.isEmpty()) {
            L = new nodo(cedula, nombre, edad, null);
        }else{
            aux = L;
            while (aux.siguiente!=null)
                aux=aux.siguiente;
            aux.siguiente = new nodo(cedula, nombre, edad, aux);
        }
    }
    void search(String nombre){
        if (!this.isEmpty()) {
            aux = L;
            while (aux.siguiente!=null && !aux.nombre.equals(nombre))
               aux=aux.siguiente;
            if (aux.nombre.equals(nombre)){
                System.out.println("Encontrad@ " + nombre);
            }else{
                if (aux.siguiente == null){
                    System.out.println("no pudo ser encontrado el estudiante buscado");
                }
            }
        }else{
            System.out.println("Lista Vacia!!");
        }
    }
    void reverse_search(String nombre){
        if (!this.isEmpty()) {
            aux = L;
            while (aux.siguiente!=null)
               aux=aux.siguiente;
            while (aux.anterior!=null && !aux.nombre.equals(nombre))
               aux=aux.anterior;
            if (aux.nombre.equals(nombre)){
                System.out.println("Encontrad@ " + nombre + "por busqueda reversa");
            }else{
                if (aux.anterior == null){
                    System.out.println("no pudo ser encontrado el estudiante buscado");
                }
            }
        }else{
            System.out.println("Lista Vacia!!");
        }
    }

    void update(String nombre){
        if (!this.isEmpty()) {
            aux = L;
            while (aux.siguiente!=null && !aux.nombre.equals(nombre))
               aux=aux.siguiente;
            if (aux.nombre.equals(nombre)){
                System.out.println("Encontrad@ " + nombre);
                aux.nombre = "Jose";
            }else{
                if (aux.siguiente == null){
                    System.out.println("no pudo ser encontrado el estudiante buscado");
                }
            }
        }else{
            System.out.println("Lista Vacia!!");
        }
    }
    void destroy(String nombre){
        if (!this.isEmpty()) {
            aux = L;
            nodo aux2 = aux;
            while (aux.siguiente!=null && !aux.nombre.equals(nombre)){
                aux2 = aux;
                aux=aux.siguiente;
            }
            if (aux.nombre.equals(nombre)){
                if (aux==L && L.siguiente==null){
                    L=null;
                }else{
                    aux2.siguiente = aux.siguiente;
                    if (aux.siguiente!=null) {
                        aux = aux.siguiente;
                        aux.anterior = aux2;
                    }else{
                        aux=null;
                    }
                }
            }else{
                if (aux.siguiente == null){
                    System.out.println("no pudo ser encontrado el estudiante buscado");
                }
            }
        }else{
            System.out.println("Lista Vacia!!");
        }
    }
}

public class JavaApplication3 {
    public static void main(String[] args) {
        lista E = new lista();
        E.insert("123456789", "Milkar", 20);
        E.insert("123456789", "Patricia", 22);
        E.insert("123456789", "Gabriel", 22);
        E.insert("123456789", "Victor", 22);
        E.reverse_search("a");
        
    }
    
}
