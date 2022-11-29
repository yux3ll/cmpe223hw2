package part1and2;

public class Route implements Comparable<Route> {
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


}
