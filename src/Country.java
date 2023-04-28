import java.util.*;

public class Country {

    private Map<String, String> map = new HashMap<>();

    public Country(){

    }

    public void countryCapital() {
        Scanner ask = new Scanner(System.in);
        System.out.println("Wpisz stolica, a dalej kraj do którego ona odnosi się. Oby skończyć wpiś \"/\"");

        while(true) {
            String askRes = ask.nextLine();
            if(askRes.equals("/")){
                break;
            }

            String[] value = askRes.split(" ");
            if(value.length != 2){
                System.out.println("Złe wprowadzone danne!");
                continue;
            }

            String key = value[0];
            String data = value[1];

            map.put(key, data);
        }

        for(Map.Entry<String, String> el : map.entrySet()){
            System.out.println(el.getKey() + " : " + el.getValue());
        }

    }

    public void cityCountry() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz stolice, a my damy Ci kraj! Oby przerwać natisni \"/\"");

        while(true){
            String res = scan.nextLine();

            if(res.equals("/")){
                break;
            }

            for(Map.Entry<String, String> el : map.entrySet()) {
                if (res.equals(el.getKey())) {
                    System.out.println("Kraj: " + el.getValue());
                }
            }
        }
    }
}
