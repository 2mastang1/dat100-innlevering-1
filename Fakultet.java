import java.util.Scanner;

public class Fakultet {
    public static void main(String args[]){
        Scanner fakultetnum = new Scanner(System.in);
        System.out.print("skriv inn tallet du vil fakultere ");
        int n= fakultetnum.nextInt();
        int fakultet = 1;
        fakultetnum.close();

        for (int i = 1;i<=n;i++){
            fakultet *= i;
        }
    
    System.out.println(fakultet);
    }
}
