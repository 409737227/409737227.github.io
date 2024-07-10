import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
    
        int days;
    
        switch(month){
            case 1: case 3: case 7: case 8: case 10: case 12:
               days = 31;
               break;
            case 4: case 6: case 9: case 11:
               days = 30;
               break;
            case 2:
               //檢查是否為閏年   
               if((year% 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                 days = 29;
               }else{
                 days = 28;
               }
               break;
               default:
                 days = -1; //處理無效的月份輸入
        }
        System.out.println(days);
    }
   
    
}
