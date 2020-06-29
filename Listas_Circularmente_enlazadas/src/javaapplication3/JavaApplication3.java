package javaapplication3;

class nodo{
    String cedula;
    String nombre;
    int edad;
    nodo siguiente;
    nodo(String ced, String nom, int ed){
        this.cedula = ced;
        this.nombre = nom;
        this.edad = ed;
    }
    nodo(String ced, String nom, int ed,nodo sig){
        this.cedula = ced;
        this.nombre = nom;
        this.edad = ed;
        this.siguiente = sig;
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
            L = new nodo(cedula, nombre, edad);
            L.siguiente = L;
        }else{
            aux = L;
            while (aux.siguiente!=L)
                aux=aux.siguiente;
            aux.siguiente = new nodo(cedula, nombre, edad,L);
        }
    }
    void search(String nombre){
        if (!this.isEmpty()) {
            aux = L;
            nodo aux2 = aux;
            while (aux.siguiente!=L && !aux.nombre.equals(nombre)){
                aux2 = aux;
                aux=aux.siguiente;
            }
            if (aux.nombre.equals(nombre)){
                System.out.println(aux.nombre + " Existe en la lista.");
            }else{
                if (aux.siguiente == L){
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
            nodo aux2 = aux;
            while (aux.siguiente!=L && !aux.nombre.equals(nombre)){
                aux2 = aux;
                aux=aux.siguiente;
            }
            if (aux.nombre.equals(nombre)){
                String Nom = aux.nombre;
                aux.nombre = nombre;
                System.out.println(Nom + "Cambia de nombre a : " + aux.nombre);
            }else{
                if (aux.siguiente == L){
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
            while (aux.siguiente!=L && !aux.nombre.equals(nombre)){
                aux2 = aux;
                aux=aux.siguiente;
            }
            if (aux.nombre.equals(nombre)){
                if (aux==L && L.siguiente==L){
                    L=null;
                }else{
                    aux2.siguiente = aux.siguiente;
                }
                System.out.println("Sale: " + aux.nombre);
            }else{
                if (aux.siguiente == L){
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
        E.search("Patricia");
        E.insert("123456789", "Gabriel", 22);
        E.insert("123456789", "Victor", 22);
        
    }
    
}
