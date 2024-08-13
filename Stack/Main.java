package Stack;

public class Main {
    public static void main(String[] args) {
        DynamicStack dynamicStack = new DynamicStack();

        dynamicStack.push(1);
        dynamicStack.push(2);
        dynamicStack.push(3);
        dynamicStack.push(4);
        dynamicStack.push(5);
        dynamicStack.push(5);
        dynamicStack.push(5);
        dynamicStack.push(5);

        System.out.println("Stack length: " + dynamicStack.len());
        System.out.println("vazio: " + dynamicStack.isEmpty());

        dynamicStack.clear();
        System.out.println("Stack length: " + dynamicStack.len());
        System.out.println("vazio: " + dynamicStack.isEmpty());

        dynamicStack.push(2);
        System.out.println("Stack length: " + dynamicStack.len());
        System.out.println("vazio: " + dynamicStack.isEmpty());
    }
}
