
package breadth.first.search;

    
    class Node{
        int label; // vertex label
        Node next; // next node in list
        Node(int b){ //constructor
            label = b;
        }
    }
    
    class Graph{
        int size; 
        Node adjList[];
        int mark[];
        
        Graph(int n){ //constructor
            size = n;
            adjList = new Node[size];
            mark = new int[size];
            
        }
        
        public void createAdjList(int a[][]){ // create adjcent lists
            Node p; 
            int i,k;
            for( i = 0; i < size; k++){
                p = adjList[i] = new Node(i);
                for( k = 0; k < size; k++){
                    if( a[i][k] == 1){
                        p.next = new Node(k);
                        p = p.next;
                    }
                }// end of inner for-loop
            } // end of outer for-loop
        } // end of createAdjList()
        
        public void bfs(int head){
            int v;
            Node adj;
            Queue q = new Queue(size);
            v = head; 
            mark[v] = 1;
            System.out.print(v+" ");
            q.qinsert(v);
            
            while(!q.IsEmpty()){ // while (queue not empty
                
               v = q.qdelete();
               adj = adjList[v];
               
               while(adj != null){
                   v = adj.label;
                   if( mark[v] == 0){
                       q.qinsert(v);
                       mark [v] = 1;
                       System.out.print(v+" ");
                   }
                   adj=adj.next;
               }
            }
        }
    } // end of Graph class
    
    class Queue{
        private int maxSize; // max queue size
        private int[] que; // que is an array of integers
        private int front;
        private int rear;
        private int count; // count of items in queue
        public Queue(int s){ //constructor
            maxSize = s;
            que = new int[maxSize];
            front = rear =- 1;
        }
        
        public void qinsert(int item){
            if(rear == maxSize-1)
                System.out.println("Queue is Full");
            else{
                rear = rear+1;
                que[rear]=item;
                if(front ==-1)
                    front=0;
            }
        }
        
        public int qdelete(){
            int item;
            if(IsEmpty()){
                System.out.println("\n Queue is Empty");
                        return(-1);
            }
            
            item = que[front];
            if( front == rear)
                front = rear =- 1;
            else
                front = front+1;
            return(item);
        }
        
        public boolean IsEmpty(){
            return(front == -1);
        }
    }
    public class BreadthFirstSearch {
        
    public static void main(String[] args) {
        Graph g = new Graph(5);
        int a[][] = {{0,1,0,1,1}, {1,0,1,1,0}, {0,1,0,1,1}, {1,1,1,0,0}, {1,0,1,0,0}};
        g.createAdjList(a);
        g.bfs(0);
    }
}
