import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Girin: ");
        heat = input.nextInt();
        if (heat < 5) {
            System.out.println("Kayak için güzel hava!");
        }
        else if (heat <= 25) {
           if (heat <= 15) {
               System.out.println("Sinemaya gidebilirisniz!");
           }
           if (heat >= 10) {
               System.out.println("Pikniğe gidebilirsiniz!");
           }
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz!!");
        }

    }
}