import java.util.Scanner;

public class quest1 {
    static int row_E=5, col_E=9 ;  //posiçoes da exit
    static int row_D=3, col_D=1 ;  //posiçoes do dragon


    public static void exit_position_change(int option) {
        if(option==1){
            row_E=0; 
            col_E=1   ;          
        }
        else if(option==2){
            row_E=0; 
            col_E=2   ;          
        }
        else if(option==3){
            row_E=0; 
            col_E=3   ;          
        }
        else if(option==4){
            row_E=0; 
            col_E=4   ;          
        }
        else if(option==5){
            row_E=0; 
            col_E=5   ;          
        }
        else if(option==6){
            row_E=0; 
            col_E=6   ;          
        }
        else if(option==7){
            row_E=0; 
            col_E=7  ;          
        }
        else if(option==8){
            row_E=0; 
            col_E=8   ;          
        }
        else if(option==9){
            row_E=1; 
            col_E=9   ;          
        }        
        else if(option==10){
            row_E=2; 
            col_E=9   ;          
        }
        else if(option==11){
            row_E=3; 
            col_E=9   ;          
        }
        else if(option==12){
            row_E=4; 
            col_E=9   ;          
        }
        else if(option==13){ 
            //row_E=5;      nao pode repetir esta
            //col_E=9;          
            row_E=0;      
            col_E=1;          
            
        }
        else if(option==14){
            row_E=6; 
            col_E=9   ;          
        }
        else if(option==15){
            row_E=7; 
            col_E=9   ;          
        }
        else if(option==16){
            row_E=8; 
            col_E=9   ;          
        }
        else if(option==17){
            row_E=9; 
            col_E=8   ;          
        }
        else if(option==18){
            row_E=9; 
            col_E=7   ;          
        }
        else if(option==19){
            row_E=9; 
            col_E=6   ;          
        }        
        else if(option==20){
            row_E=9; 
            col_E=5   ;          
        }
        else if(option==21){
            row_E=9; 
            col_E=4   ;          
        }
        else if(option==22){
            row_E=9; 
            col_E=1  ;          
        }
        else if(option==23){
            row_E=8; 
            col_E=0   ;          
        }
        else if(option==24){
            row_E=7; 
            col_E=0   ;          
        }
        else if(option==25){
            row_E=6; 
            col_E=0   ;          
        }
        else if(option==26){
            row_E=5; 
            col_E=0   ;          
        }
        else if(option==27){
            row_E=4; 
            col_E=0   ;          
        }
        else if(option==28){
            row_E=3; 
            col_E=0   ;          
        }
        else if(option==29){
            row_E=2; 
            col_E=0   ;          
        }        
        else if(option==30){
            row_E=1; 
            col_E=0   ;          
        }
    
    }

    public static void dragon_position_change(int option) {
        if(option==1){
            row_D=1; 
            col_D=1   ;          
        }
        else if(option==2){
            row_D=1; 
            col_D=2   ;          
        }
        else if(option==3){
            row_D=1; 
            col_D=3   ;          
        }
        else if(option==4){
            row_D=1; 
            col_D=4   ;          
        }
        else if(option==5){
            row_D=1; 
            col_D=5   ;          
        }
        else if(option==6){
            row_D=1; 
            col_D=6   ;          
        }
        else if(option==7){
            row_D=1; 
            col_D=7  ;          
        }
        else if(option==8){
            row_D=1; 
            col_D=8   ;          
        }
        else if(option==9){
            row_D=2; 
            col_D=1   ;          
        }        
        else if(option==10){
            row_D=2; 
            col_D=4   ;          
        }
        else if(option==11){
            row_D=2; 
            col_D=6   ;          
        }
        else if(option==12){
            row_D=2; 
            col_D=8   ;          
        }
        else if(option==13){
           // row_D=3;    nao pode repetir
           // col_D=1   ; 
           row_D=8;
           col_D=8;         
        }
        else if(option==14){
            row_D=3; 
            col_D=4   ;          
        }
        else if(option==15){
            row_D=3; 
            col_D=6   ;          
        }
        else if(option==16){
            row_D=3; 
            col_D=8   ;          
        }
        else if(option==17){
            row_D=4; 
            col_D=4   ;            
        }
        else if(option==18){
            row_D=4; 
            col_D=6   ;       
        }
        else if(option==19){
            row_D=4; 
            col_D=8   ;        
        }        
        else if(option==20){
            row_D=5; 
            col_D=3   ;          
        }
        else if(option==21){
            row_D=5; 
            col_D=4   ;          
        }
        else if(option==22){
            row_D=5; 
            col_D=5   ;      
        }
        else if(option==23){
            row_D=5; 
            col_D=6   ;        
        }
        else if(option==24){
            row_D=5; 
            col_D=8   ;         
        }
        else if(option==25){
            row_D=6; 
            col_D=4   ;          
        }
        else if(option==26){
            row_D=6; 
            col_D=6   ;          
        }
        else if(option==27){
            row_D=6; 
            col_D=8   ;          
        }
        else if(option==28){
            row_D=7; 
            col_D=4   ;        
        }
        else if(option==29){
            row_D=7; 
            col_D=6  ;          
        }        
        else if(option==30){
            row_D=7; 
            col_D=8   ;          
        }
        else if(option==31){
            row_D=8; 
            col_D=4   ;          
        }
        else if(option==32){
            row_D=8; 
            col_D=5   ;          
        }
        else if(option==33){
            row_D=8; 
            col_D=6   ;          
        }
        else if(option==34){
            row_D=8; 
            col_D=8   ;         
        }
   

    
    }

    public static void main(String[] args){

    //  char [][] array= new char[10][10];
       
    int row=1, col=1 ;  //posiçoes do hero

    int loop=1, key_finded=0, game_over=0, victory=0;
    
    Scanner scan = new Scanner(System.in);


    char[][] array={{'x','x','x','x','x','x','x','x','x','x'},
        {'x','H',' ',' ',' ',' ',' ',' ',' ','x'},
        {'x',' ','x','x',' ','x',' ','x',' ','x'},
        {'x','D','x','x',' ','x',' ','x',' ','x'},
        {'x',' ','x','x',' ','x',' ','x',' ','x'},
        {'x',' ',' ',' ',' ',' ',' ','x',' ','E'},
        {'x',' ','x','x',' ','x',' ','x',' ','x'},
        {'x',' ','x','x',' ','x',' ','x',' ','x'},
        {'x','K','x','x',' ',' ',' ',' ',' ','x'},
        {'x','x','x','x','x','x','x','x','x','x'}    };

    

   

        while(loop==1)
        {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println();
            System.out.println("\t Here Be Dragons (mini-quest I)");            
            System.out.println();
            for(int r=0; r<array.length; r++)
            {
                System.out.print("  \t ");

                for(int c=0; c<array.length; c++)
                {
                    System.out.print(array[r][c]);
                    System.out.print("  ");
                    
                }
               System.out.println();
            }

            if (row!=0 && col!=0 && row!=array.length-1 && col!=array.length-1){
                if(array[row-1][col]=='D'){
                    game_over=1;
                }
                
                if(array[row][col-1]=='D'){
                    game_over=1;
                } 
                if(array[row+1][col]=='D'){
                    game_over=1;
                }  
                if(array[row][col+1]=='D'){
                    game_over=1;
                }

            }
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
                System.out.println("\t Move your Hero with w, a, s or d (and then enter)");
                System.out.println("\t Pick up the Key, and then the exist will open ( E(closed), e(open) )");
                System.out.println("\t When reaching the open exit door, the game ends with victory");
                System.out.println("\t Be careful with the Dragon");
                System.out.println("\t ");
            }
            
           

        
        String move_s =scan.nextLine();
       
     

        if(move_s.equals("w")){
            if( (array[row-1][col]=='x') || (array[row-1][col]=='E')){ // se em cima está parede
                                        // nao faz nada
            }

            else{
                array[row][col]=' ';
                row--;                  //ja mudou indice da posiçao do heroi
                if(array[row][col]=='K'){   // se hero está em cima da key, saida abre
                    key_finded=1;
                }
                if(array[row][col]=='e'){   // se hero está em cima da saida aberta, vitoria
                    victory=1;
                }
                array[row][col]='H';
            } 
        }

        if (move_s.equals("a")){
            if( (array[row][col-1]=='x') || (array[row][col-1]=='E') ){ // se em cima está parede
                                        // nao faz nada
            }

            else{
                array[row][col]=' ';
                col--;                  //ja mudou indice da posiçao do heroi
                if(array[row][col]=='K'){   // se hero está em cima da key, saida abre
                    key_finded=1;
                }
                if(array[row][col]=='e'){   // se hero está em cima da saida aberta, vitoria
                    victory=1;
                }
                array[row][col]='H';
            } 
        }

        if (move_s.equals("s")){
            if( (array[row+1][col]=='x') || (array[row+1][col]=='E') ){ // se em cima está parede
                                        // nao faz nada
            }

            else{
                array[row][col]=' ';
                row++;                  //ja mudou indice da posiçao do heroi
                if(array[row][col]=='K'){   // se hero está em cima da key, saida abre
                    key_finded=1;
                }
                if(array[row][col]=='e'){   // se hero está em cima da saida aberta, vitoria
                    victory=1;
                }
                array[row][col]='H';
            } 
        }
        
        if (move_s.equals("d")){
            if( (array[row][col+1]=='x') || (array[row][col+1]=='E') ){ // se em cima está parede
                                        // nao faz nada          
            }

            else{
                array[row][col]=' ';  
                col++;                  //ja mudou indice da posiçao do heroi
                if(array[row][col]=='K'){   // se hero está em cima da key, saida abre
                    key_finded=1;
                }
                if(array[row][col]=='e'){   // se hero está em cima da saida aberta, vitoria
                    victory=1;
                }
                array[row][col]='H';              
            } 
        }

        
        if (key_finded==1){
            //mudança do sitio da exit (task: turma A5)
            array[row_E][col_E]='x';
            double random1 = Math.random();
            double r1=(random1*(30-1+1)+1);  //valor aleatorio entre max e min: random * (max-min+1) +1
            exit_position_change( (int)r1);  //define indice da matriz para a exit (30 opçoes)
            array[row_E][col_E]='e';

            //mudança do sitio do Dragao (task: turma A5)
            array[row_D][col_D]=' ';
            random1 = Math.random();
            r1=(random1*(34-1+1)+1);  //valor aleatorio entre max e min: random * (max-min+1) +1
            dragon_position_change( (int)r1);  //define indice da matriz para a dragao (34 opçoes)
            while((row_D+1==row_E || row_D-1==row_E || col_D+1==col_E ||col_D-1==col_E)|| (row_D+2==row_E || row_D-2==row_E || col_D+2==col_E ||col_D-2==col_E) ){   
                // se dragon estiver em posiçao adjacente à exit, volta a determinar a posiçao do dragon
                random1 = Math.random();
                r1=(random1*(34-1+1)+1);  //valor aleatorio entre max e min: random * (max-min+1) +1
                dragon_position_change( (int)r1);
            }            
            array[row_D][col_D]='D';
            
            
            key_finded=0;
        }

        }

        scan.close(); 
        

    } 



}

