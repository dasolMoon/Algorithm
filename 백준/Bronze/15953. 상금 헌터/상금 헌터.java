import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        for(int i = 0; i<cnt; i++) {
            int amount = 0;
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if(num1 <= 21 && num1!=0) {
                if (num1 == 1) {
                    amount += 500;
                }else if (num1 <= 3) {
                    amount += 300;
                } else if (num1 <= 6) {
                    amount += 200;
                } else if (num1 <= 10) {
                    amount += 50;
                } else if (num1 <= 15) {
                    amount += 30;
                } else{
                    amount += 10;

                }
            }

            if(num2 <= 31 && num2!=0) {
                if (num2 == 1) {
                    amount += 512;
                }else if (num2 <= 3) {
                    amount += 256;
                } else if (num2 <= 7) {
                    amount += 128;
                } else if (num2 <= 15) {
                    amount += 64;
                } else {
                    amount += 32;
                }
            }
            System.out.println(amount*10000);
        }
    }
}
