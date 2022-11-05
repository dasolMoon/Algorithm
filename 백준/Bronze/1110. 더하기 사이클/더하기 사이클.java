import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        sc.close();
        
        int cnt  = 0;
        int tmp1 = 0;
        int tmp2 = 0;
        int tmp  = num;
        
        while(true){
            cnt++;
            
            tmp1 = tmp/10;
            tmp2 = tmp%10;
            
            tmp = tmp1 + tmp2;
            tmp = (tmp2*10) + (tmp%10);
            
            if(tmp == num) break;
        }
       
        System.out.println(cnt);
 
    }
    
    
}