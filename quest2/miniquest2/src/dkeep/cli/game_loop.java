package dkeep.cli;
import java.util.Scanner;
import dkeep.logic.*;

public class game_loop {

    public static int loop=1, sword_finded=0, game_over=0, victory=0, dragon_killed=0;
    public String move_s;



    //running the game logic accordingly (to that command) and updating the game state;
    public void run_game_logic() {

        app app_game= new app();

        while (loop==1){

            print_map();
            info_to_gamer();
            enter_command();

            
            app_game.play(move_s);
           
            
            //app_game.run_app();
            
        }
    }
    
    


    //continuously asking the user to enter a command;
    void enter_command(){

        if(game_over==1 || victory==1)
            return;

        Scanner scan = new Scanner(System.in);

        move_s =scan.nextLine();

        //scan.close();

        System.out.println(scan);
    }

    void info_to_gamer(){

        if(game_over==1){
            loop=0;
            System.out.println();
            System.out.println("\t Dragon killed you!");
            System.out.println("\t GAME OVER !!!");
            System.out.println("\t NOOB!");
            System.out.println();
            return;
        }
        else if(victory==1){
            loop=0;
            System.out.println();
            System.out.println("\t GG WP");
            System.out.println("\t Victoy !!!");
            System.out.println("\t ");
            return;
        }
        else{
            System.out.println();
            System.out.println("\t Move your Hero(H) with w, a, s or d (and then enter)");
            System.out.println();
            
            
            if (sword_finded==1)
            {
                
                
                    if (dragon_killed==1){
                        System.out.println("\t Well done, you kill the Dragon(D)");
                        System.out.println("\t Go to the Exist(E) will open ");
                    }
                    if (dragon_killed==0){
                        System.out.println("\t You got the Sword(D)!");
                        System.out.println("\t ma men, you are Armed(A)");
                        System.out.println("\t Now you have to kill the Dragon(D)!");
                    }
                    
            }
            
            if (sword_finded==0)
            {
                System.out.println("\t Be careful with the Dragon(D)");
                System.out.print("\t Pick up the Sword(D) -> ");
                System.out.println("\t You don't have the Sword(D)!");
            }
            
            System.out.println("\t ");
            System.out.println("\t When reaching the open exit door, the game ends with victory");
            System.out.println("\t ");
            
        }


    }
    

    //printing the game screen; until the game is over
    void print_map(){

 

        System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println();
            System.out.println("\t Here Be Dragons (mini-quest II) ");            
            System.out.println();
            for(int r=0; r<map.array.length; r++)
            {
                System.out.print("  \t ");

                for(int c=0; c<map.array.length; c++)
                {
                    System.out.print(map.array[r][c]);
                    System.out.print("  ");
                    
                }
               System.out.println();
            }

    }


   
}
