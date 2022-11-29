package part1;

public class Route implements Comparable<Route> {
    //-----------------------------------------------------
    // Title: Route
    // Author: Yüksel Çağlar Baypınar
    // ID: 43951623744
    // Section: 02
    // Assignment: 2
    // Description: A comparable object that has two variables and a compareTo method that works based on both those variables
    //  the class also includes a toString method to help get rid of redundant print commands
    //-----------------------------------------------
    public String source;
    public String destination;

    public Route(String a, String b) {
        source = a;
        destination = b;
    }


    public int compareTo(Route o) {
        if (this.source.compareTo(o.source) != 0) return this.source.compareTo(o.source);
        else return this.destination.compareTo(o.destination);
    }


    public String toString() {
        return source + " " + destination;
    }
}
