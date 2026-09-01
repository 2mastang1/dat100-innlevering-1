import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class KarakterSkala {
    public static void main(String args[]){
        int poengsum = 89;

        String[] Elever = {
            "Mari",
            "Erik",
            "Kristin",
            "Thomas",
            "Sergiusz"
        };


        Map<String, Integer> poengsummer = new HashMap<>();
        Random random = new Random();

        for (String person : Elever) {
            int poeng = random.nextInt(101); // 0–100
            poengsummer.put(person, poeng);
        }

        for (String person : poengsummer.keySet()) {
            System.out.println(
                person + " har " + poengsummer.get(person) + " poeng"
            );

        String[] karakterer = {
            "A",
            "A-",
            "B+",
            "B",
            "B-",
            "C+",
            "C",
            "C-",
            "D+",
            "D",
            "E",
            "F"
        };

        int[] poeng = {
            97,90,
            87,84,
            80,76,
            70,65,
            62,55,
            40,0,
        };

        for (int i=0; i<poeng.length; i++){
            poengsum = poengsummer.get(person);
            int nedreGrense = poeng[i];

            if (poengsum >= nedreGrense){
                System.out.println(karakterer[i]);
                break;
            }
        }
    }
}
}