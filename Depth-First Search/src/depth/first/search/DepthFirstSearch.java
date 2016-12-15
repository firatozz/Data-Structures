
package depth.first.search;

class Node{
    int label; /*vertex label*/
    Node next; /* next node in list*/
    Node(int b){
        label = b; //constructor
    }
}
    
    class Graph{
        int size;
        Node adjList[];
        int mark[];
        
        Graph(int n){//constructur
            size = n; 
            adjList = new Node[size];
            mark = new int[size]; //elements of mark are initialized to 0
    }
        public void createAdjList(int a[][]){//create adjacent lists
            
            Node p;
            int i,k;
            for(i = 0; i < size; i++){
                p = adjList[i] = new Node(i); //create first node of ith adj. list
                for(k = 0; k < size; k++ ){
                    if (a[i][k] == 1){
                        p.next = new Node(k); /** create next node of ith adj. List*/
                        
                    }
                }
            }
        }
        
        public void dfs(int head){  // recursive depth-first search
            
            Node w; 
            int v;
            mark[head] = 1;
            System.out.print(head + " ");
            w=adjList[head];
            while( w != null){
                v = w.label;
                if(mark[v] == 0)
                    dfs(v);
                w = w.next;
                
            }
        }     
    }
  
public class DepthFirstSearch {

    public static void main(String[] args) {
        Graph g= new Graph(5); // graph is created with 5 nodes
        
        int a[][] = {{0,1,0,1,1}, {1,0,1,1,0}, {0,1,0,1,1}, {1,1,1,0,0}, {1,0,1,0,0}};
        g.createAdjList(a);
        g.dfs(0); //starting node to dfs is0(i.e,.A)
        }
    }
    

