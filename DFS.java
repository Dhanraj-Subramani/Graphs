import java.util.*;
public class DFS {

    int v;
    List<List<Integer>> adj;
    public DFS(int v)
    {
        this.v = v;
        this.adj = new ArrayList<>();
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<>());
        }
    }

    void tree(int s)
    {
        boolean[] vis = new boolean[v];
        dfshlp(s,vis);
    }
    void Edge(int u,int v)
    {
        adj.get(u).add(v);
    }
    void dfshlp(int vr,boolean[] vis)
    {
        vis[vr] = true;
        System.out.println(vr+" ");
        for(int p:adj.get(vr))
        {
            if(!vis[p])
            {
                dfshlp(p,vis);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Vertices");
        int v = sc.nextInt();
        DFS d = new DFS(v);
        System.out.println("Enter the no of Edges");
        int e = sc.nextInt();
        for(int i=0;i<e;i++)
        {
            d.Edge(sc.nextInt(), sc.nextInt());

        }
        System.out.println("Enter Start Vertex");
        int j = sc.nextInt();
        System.out.println(d.adj);
        d.tree(j);
    }
}
