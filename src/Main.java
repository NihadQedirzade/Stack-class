public class Main {
    public static void main(String[] args) {
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("salam");
        stringStack.push("bu gun");
        stringStack.push("adgunudur");

        System.out.println("Stakin olcusu: " + stringStack.size());
        System.out.println("ust element: " + stringStack.peek());
        System.out.println("stak bosdur : " + stringStack.isEmpty());
    }

}