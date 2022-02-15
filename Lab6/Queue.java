package Lab6;

public class Queue {
    private int[] elements;
    private int size;

    public Queue(){
        this.size = 0;
        this.elements = new int[this.size];
    }

    public void display(){
        if(this.size != 0){
            for(int i = 0; i < this.size;i++){
                if(i == this.size - 1)
                    System.out.println(this.elements[i]);
                else
                    System.out.print(this.elements[i] + " : ");
            }
        }
        else
            System.out.println(" -- ");
    }

    public void enQueue(int v){
        this.size++;
        int[] elementCopy = this.elements;
        this.elements = new int[this.size];
        System.arraycopy(elementCopy,0,this.elements,0,elementCopy.length);
        this.elements[size-1] = v;
    }

    public int deQueue(){
        if(this.size == 0){
            return 0;
        }
        int queueOut = this.elements[0];
        for(int i = 0 ; i < this.size; i++){
            if(i == this.size - 1)             // Last one = 0
                this.elements[i] = 0;
            else
                this.elements[i] = this.elements[i+1];  //Sort the next one up by one
        }
        this.size--;
        return queueOut;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public int getSize() {
        return size;
    }
}
