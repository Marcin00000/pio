import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int a ;
        int b =rd.nextInt(7);
        System.out.println(b);
        System.out.println("Odgadnij wylosowaną liczbę");

        do{
            System.out.println("Podaj wartość");
//            a = sc.nextInt();
            a = rd.nextInt(7);
            System.out.println(a);
            if (a==b){
                System.out.println("Dobrze, podałeś prwidłową wartość");
            }
            else{
                System.out.println("Źle, spróbuj ponownie");
            }
        }
        while (a!=b);

    }
}