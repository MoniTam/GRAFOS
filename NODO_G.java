/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTEFANIA TAMAY
 */
public class NODO_G {
    private String city;
    private List<Edge> edges;

    public NODO_G(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    //addEdge
    public void addEdge(Edge edge) {
        if (edges == null) {
            edges = new ArrayList<>();
        }
        edges.add(edge);
    }
    
    
    @Override
    public String toString() {
        return "Node{" + "city=" + city + ", edges=" + edges + '}';
    }
   
}
//https://gitlab.com/Edcaamal/edigraphos/-/tree/master/EDIGraphos/src/edigraphos 