
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {



    Random rand = new Random();

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj najmniejszą liczbę z przediału");
        int a = scan.nextInt();
        System.out.println("Podaj najwiekszą liczbę z przediału");
        int b = scan.nextInt();

        int x = rand.nextInt(b-a+1)+a;
        int y = rand.nextInt(b-a+1)+a;
        int z = rand.nextInt(b-a+1)+a;
        System.out.println("Bok a"+ x +" Bok b: "+y+"Bok c:"+z);
        System.out.println(prostokatny(x,y,z));
    }




    private static boolean prostokatny(double bok1, double bok2, double bok3) {
        if (bok1 < 0 || bok2 < 0 || bok3 < 0 ){
            return false;
        }


        double najdluzszy = bok1;
        double krotki1 = bok2;
        double krotki2 = bok3;

        if (bok2 > bok1 && bok2 > bok3){
            najdluzszy = bok2;
            krotki1 = bok1;
            krotki2 = bok3;
        }
        else if (bok3 > bok1 && bok3 > bok2){
            najdluzszy = bok3;
            krotki1 = bok1;
            krotki2 = bok2;
        }


        return krotki1 * krotki1 + krotki2 * krotki2 == najdluzszy * najdluzszy;
    }

}