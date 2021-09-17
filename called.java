public class called {
    listnode head;

    static class listnode{
        int data;
        listnode next;

        public listnode(int data){
            this.data=data;
            this.next=null;
        }

    }
    public void display(){
        listnode current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current= current.next;
        }
        System.out.print("null\n");
    }
    public static void main(String[] args){
        called l = new called();
        l.head= new listnode(10);
        listnode second= new listnode(1);
        listnode third= new listnode(8);
        listnode fourth= new listnode(11);

        l.head.next=second;
        second.next= third;
        third.next= fourth;
        l.display();
    }
}