import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<String> humans = new LinkedList<>();


        humans.add("Logesh");
        humans.add("Niranjan");
        humans.add("Berin");


        System.out.println("LinkedList: " + humans);


        humans.add(1, "harish");
        System.out.println("Updated LinkedList: " + humans);
    }
}
