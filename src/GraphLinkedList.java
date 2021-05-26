import java.util.LinkedList;

public class GraphLinkedList {
    private  LinkedList<Integer>[] adj;
    private int V;
    private int E;
    public GraphLinkedList(int node){
        this.V=node;
        this.E=0;
        this.adj=new LinkedList[node];
        for (int v=0;v<V;v++){
            adj[v]=new LinkedList<>();
        }
    }
    public void addEdge(int u,int v){
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices " + E + " edges" +"\n");
        for (int v=0;v<V;v++){
            sb.append(v + ": ");
            for (int w:adj[v]){
                sb.append(w +" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        GraphLinkedList gl =new GraphLinkedList(4);
        gl.addEdge(0,1);
        gl.addEdge(1,2);
        gl.addEdge(2,3);
        gl.addEdge(3,0);
        System.out.println(gl);


    }
}
