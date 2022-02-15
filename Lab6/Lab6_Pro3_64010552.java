package Lab6;

public class Lab6_Pro3_64010552 {
    public static void main(String[] args){
        Queue queue = new Queue();

        for(int i = 0; i < 20; i++){
            queue.enQueue(i);
        }
        System.out.println(queue.getSize());
        System.out.print("QUEUE : ");
        if(!queue.isEmpty()){
            queue.display();
        }

        for(int i = 0; i < 20; i++){
            queue.deQueue();
            queue.display();
        }
        System.out.println(queue.getSize());
        System.out.print("QUEUE : ");
        if(!queue.isEmpty()){
            queue.display();
        }
    }
}
