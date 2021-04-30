/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author ESTEFANIA TAMAY
 */
public class GRAFOS {

        public static GRAPH getCities() {
        NODO_G du = new NODO_G("Duango");
        NODO_G slp = new NODO_G("San Luis Potosi");
        NODO_G tl = new NODO_G("Tlaxcala");
        NODO_G ta = new NODO_G("Tabasco");
        NODO_G gue = new NODO_G("Guerrero");
        NODO_G co = new NODO_G("Colima");
        NODO_G nay = new NODO_G("Nayarit");

        du.addEdge(new Edge(du, slp, 475));
        slp.addEdge(new Edge(slp, tl, 512));
        tl.addEdge(new Edge(tl, ta, 707));
        ta.addEdge(new Edge(ta, gue, 1042));
        gue.addEdge(new Edge(gue, co, 748));
        co.addEdge(new Edge(co, nay, 404));
        nay.addEdge(new Edge(nay, du, 519));
        
        GRAPH graph = new GRAPH();
        graph.addNode(du);
        graph.addNode(slp);
        graph.addNode(tl);
        graph.addNode(ta);
        graph.addNode(gue);
        graph.addNode(co);
        graph.addNode(nay);

        return graph;
        
        
    }
    public static void main(String[] args) {
        GRAPH graph = getCities();
        System.out.println(graph);


    }
}
