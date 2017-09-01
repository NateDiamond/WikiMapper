import java.util.HashSet;


public class WikiLink {

    private String name;
    private HashSet<WikiLink> connections;
    private int depth;

    //Iff depth == MAX_DEPTH then connections == null;
    public final static int MAX_DEPTH = 3;

    public WikiLink(String name) {
        this(name, 0);
    }

    public WikiLink(String name, int depth) {
        //TODO #1 (and with it will come other methods)
    }

    public WikiLink(String name, HashSet<WikiLink> connections) {
        this(name, connections, 0);
    }

    public WikiLink(String name, HashSet<WikiLink> connections, int depth) {
        this.name = name;
        this.connections = connections;
        this.depth = depth;
    }

    public String getName() {
        return name;
    }

    public HashSet<WikiLink> getConnections() {
        return connections;
    }

    //TODO #2
    public boolean isConnected(WikiLink otherLink) {
        return false;
    }
}
