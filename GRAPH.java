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
public class GRAPH {
    private List<NODO_G> nodes;

    public void addNode(NODO_G node) {
        if (nodes == null) {
            nodes = new ArrayList<>();
        }
        nodes.add(node);
    }
    
    public List<NODO_G> getNodes() {
        return nodes;
    }

    @Override
    public String toString() {
        return "Graph{" + "nodes= " + nodes + '}';
    }
    
  
}
