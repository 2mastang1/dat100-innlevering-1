public class TrinnSkatt{
    public static void main(String args[]){
        int inntekt = 11000000;
        int[] nedregrenser = {
            226100,
            318300,
            725050,
            980100,
            1467200};
        double[] satser = {           
            0.017,
            0.04,
            0.137,
            0.168,
            0.178};

        double skatt = 0;

        for (int i=0; i < nedregrenser.length; i++) { 

            if (inntekt <= nedregrenser[i]) {
                break;
            }

            int ovreGrense;
            
            if (i<nedregrenser.length-1){
                ovreGrense =nedregrenser[i+1];
            } else {
                ovreGrense = inntekt;
            }

        int skattetrinn = 
            Math.min(inntekt, ovreGrense)-nedregrenser[i];
            
        double skattITrinn = skattetrinn * satser[i];
        skatt += skattITrinn;

                    System.out.println(
                    "Trinn " + (i + 1)
                    + ": " + skattetrinn
                    + " kr beskattes med "
                    + (satser[i] * 100)
                    + "%"
            );
    }
    System.out.printf("du må betale %.2f kr%n", skatt);
    }
}