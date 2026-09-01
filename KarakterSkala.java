public class KarakterSkala {
    public static void main(String args[]){
        int poengsum = 89;

        String[] karakterer = {
            "A",
            "B",
            "C",
            "D",
            "E",
            "F",
        };

        int[] poeng = {
            100,90,
            89,80,
            79,60,
            59,50,
            49,40,
            39,0,};

        for (int i=0; i<poeng.length; i+=2){
            int ovreGrense = poeng[i];
            int nedreGrense = poeng[i+1];

            if (poengsum >= nedreGrense && poengsum <= ovreGrense ){
                System.out.println(karakterer[i/2]);
                break;
            }
        }
}
}