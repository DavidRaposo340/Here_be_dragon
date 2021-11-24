import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        double random1 = Math.random();
        double random2 = Math.random();
        
        double r1=(random1*(30-1+1)+1);  //random * (max-min+1) +1
        double r2=(random2*(9-0+1)+1);
        
        int row_E=(int)r1;
        int col_E=(int)r2;
        
        System.out.println(row_E);
        System.out.println(col_E);


        String keypressed;
        Scanner input = new Scanner(System.in);
        
        
        keypressed=input.nextLine();
        if(keypressed.equals("w")){
            System.out.println("Hello, World!");
        }
        input.close();
        
    }
}
