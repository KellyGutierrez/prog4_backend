package co.edu.umanizales.grafo.model;

import java.util.ArrayList;
import java.util.List;

public class Grafo{
    private List<Vertice> vertices;
    private List<Arista> aristas;
    private boolean direction;

    public List<Vertice> getVertices() {
        return vertices;
    }
    public void setVertices(List<Vertice> vertices) {
        this.vertices = vertices;
    }
    public List<Arista> getAristas() {
        return aristas;
    }
    public void setAristas(List<Arista> arista) {
        this.aristas = arista;
    }

    public void agregarVertice(Object dato, int codigo) {
        Vertice vertice = new Vertice(dato, codigo);
        if(verificarVertice(vertice)) {
            vertices.add(vertice);
        }
    }
    public void agregarArista(int peso, int origen, int destino) {
        Arista arista = new Arista(peso, origen, destino);
        if(verificarArista(arista)) {
            aristas.add(arista);
        }
    }
    public boolean verificarVertice(Vertice vertice) {
        for (Vertice vert: vertices) {
            if(vert.getCodigo() == vertice.getCodigo()) {
                return false;
            }
        }
        return true;
    }
    public boolean verificarArista(Arista arista) {
        for (Arista aris: aristas) {
            if(aris.getOrigen() == arista.getOrigen() && aris.getDestino() == arista.getDestino()) {
                return false;
            }
        }
        return true;
    }
}
