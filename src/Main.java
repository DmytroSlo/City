import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Wpisz nazwe miast. Oby skończyć wprowadzenie dannych wpisz \"/\"");
        String action = scan.nextLine();


        while(!action.equals("/")) {
            list.add(action);
            action = scan.nextLine();
        }

        System.out.println("błędny znak");

        for(String name : list){
            System.out.println(name);
        }
    }
}