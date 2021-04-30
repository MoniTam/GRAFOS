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
public class Edge {
    private NODO_G origin;
    private NODO_G destination;
    private double distance;

    public Edge(NODO_G origin, NODO_G destination, double distance) {
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
    }

    
    public NODO_G getOrigin() {
        return origin;
    }

    public void setOrigin(NODO_G origin) {
        this.origin = origin;
    }

    public NODO_G getDestination() {
        return destination;
    }

    public void setDestination(NODO_G destination) {
        this.destination = destination;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    
    @Override
    public String toString() {
        //return "Edge{" + "origin=" + origin + ", destination=" + destination + ", distance=" + distance + '}';
        return "\n \t\t Edge {origin=" + origin.getCity() + ", destination=" + destination.getCity() + ", distance="+ distance + "}";
    }

    
}
