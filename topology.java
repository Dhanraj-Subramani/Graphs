import java.util.*;
class topology extends DFS{


    public topology(int v) {
        super(v);
    }

    void top(int v)
    {
        Stack<Integer> st = new Stack<>();
        boolean vis[] = new boolean[v];
        for(int i=0;i<v;i++)
        {
            if(vis[i]==false)
            {
                tophlp(i,vis,st);
            }
            
        }
        while(!st.isEmpty())
        {
            System.out.println(st.pop());
        }
    }
    void tophlp(int k,boolean[] vis,Stack<Integer> st)
    {
        Integer i;
        vis[k] = true;
        Iterator<Integer> it = adj.get(k).iterator();
        while(it.hasNext())
        {
            i = it.next();
            tophlp(k, vis, st);
        }
        st.push(k);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DFS d = new DFS(7);
        int e=6;
        while(e>0)
        {
            d.Edge(sc.nextInt(), sc.nextInt());
            e--;
        }
        topology t = new topology(7);
        t.top(7);
    }
    
}
