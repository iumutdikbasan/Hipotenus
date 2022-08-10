import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int akenar,bkenar;

        Scanner inp = new Scanner(System.in);

        System.out.print("A kenari Giriniz : ");
        akenar = inp.nextInt();

        System.out.print("B kenari Giriniz : ");
        bkenar = inp.nextInt();

        double hipotenus = (akenar*akenar) + (bkenar*bkenar);

        double hipotenuss = Math.sqrt((akenar*akenar) + (bkenar*bkenar));

        double alan = (akenar*bkenar) / 2;

        System.out.println("Hipotenus : "+hipotenuss);

        System.out.println("Alan : "+ alan);
    }
}
