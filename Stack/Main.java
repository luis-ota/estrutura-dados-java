package Stack;

public class Main {
    public static void main(String[] args) {
        StaticStack<Integer> staticStack = new StaticStack<Integer>(5);

        staticStack.push(1);
        staticStack.push(2);
        staticStack.push(3);
        staticStack.push(4);
        staticStack.push(5);

        System.out.println("Stack length: " + staticStack.len());
        System.out.println("vazio: " + staticStack.isEmpty());
        System.out.println("cheio: " + staticStack.isFull());

        staticStack.clear();
        System.out.println("Stack length: " + staticStack.len());
        System.out.println("vazio: " + staticStack.isEmpty());
        System.out.println("cheio: " + staticStack.isFull());

        staticStack.push(2);
        System.out.println("Stack length: " + staticStack.len());
        System.out.println("vazio: " + staticStack.isEmpty());
        System.out.println("cheio: " + staticStack.isFull());
    }
}
