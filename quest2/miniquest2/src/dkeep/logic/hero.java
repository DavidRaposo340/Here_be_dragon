package dkeep.logic;

import dkeep.cli.game_loop;

public class hero extends element {
        
    
    public hero(int row, int col, char symbol) {
        super(row, col, 'H');
    }

    public void check_game_over(){
        
        
        if (this.row!=0 && this.col!=0 && this.row!=map.array.length-1 && this.col!=map.array.length-1){
            if(game_loop.sword_finded==0){            
                if(map.array[this.row-1][this.col]=='D'){
                    game_loop.game_over=1;
                    return;
                }
                
                if(map.array[this.row][this.col-1]=='D'){
                    game_loop.game_over=1;
                    return;
                } 
                if(map.array[this.row+1][this.col]=='D'){
                    game_loop.game_over=1;
                    return;
                }  
                if(map.array[this.row][this.col+1]=='D'){
                    game_loop.game_over=1;
                    return;
                }
            }

            else{
                return;
            }

        }

    }


    public void hero_movement(String movement, sword sword){

        if(game_loop.game_over==1||game_loop.victory==1)
        {
            return;
        }
        if(movement.equals("w")){
            if( (map.array[this.row-1][this.col]=='x') || ( map.array[this.row-1][this.col]=='E' && (game_loop.sword_finded==0 || game_loop.dragon_killed==0) )){ // se em cima está parede
                                        // nao faz nada
            }

            else{
                map.array[this.row][this.col]=' ';
                this.row--;                  //ja mudou indice da posiçao do heroi
                if(map.array[this.row][this.col]==sword.symbol){   // se hero está em cima da key, saida abre
                    game_loop.sword_finded=1;
                    this.symbol='A';
                }
                if(map.array[this.row][this.col]=='E' && game_loop.sword_finded==1 && game_loop.dragon_killed==1){   // se hero está em cima da saida aberta, vitoria
                    game_loop.victory=1;
                }
                map.array[this.row][this.col]=this.symbol;
            } 
        }

        if (movement.equals("a")){
            if( (map.array[this.row][this.col-1]=='x')  || ( map.array[this.row][this.col-1]=='E' && (game_loop.sword_finded==0 || game_loop.dragon_killed==0) ) ){ // se em cima está parede
                                        // nao faz nada
            }

            else{
                map.array[this.row][this.col]=' ';
                this.col--;                  //ja mudou indice da posiçao do heroi
                if(map.array[this.row][this.col]==sword.symbol){   // se hero está em cima da key, saida abre
                    game_loop.sword_finded=1;
                    this.symbol='A';
                }
                if(map.array[this.row][this.col]=='E' && game_loop.sword_finded==1 && game_loop.dragon_killed==1){   // se hero está em cima da saida aberta, vitoria
                    game_loop.victory=1;
                }
                map.array[this.row][this.col]=this.symbol;
            } 
        }

        if (movement.equals("s")){
            if( (map.array[this.row+1][this.col]=='x')  || ( map.array[this.row+1][this.col]=='E' && (game_loop.sword_finded==0 || game_loop.dragon_killed==0) ) ){ // se em cima está parede
                                        // nao faz nada
            }

            else{
                map.array[this.row][this.col]=' ';
                this.row++;                  //ja mudou indice da posiçao do heroi
                if(map.array[this.row][this.col]==sword.symbol){   // se hero está em cima da key, saida abre
                    game_loop.sword_finded=1;
                    this.symbol='A';
                }
                if(map.array[this.row][this.col]=='E'&& game_loop.sword_finded==1 && game_loop.dragon_killed==1){   // se hero está em cima da saida aberta, vitoria
                    game_loop.victory=1;
                }
                map.array[this.row][this.col]=this.symbol;
            } 
        }
        
        if (movement.equals("d")){
            if( (map.array[this.row][this.col+1]=='x')  || ( map.array[this.row][this.col+1]=='E' && (game_loop.sword_finded==0 || game_loop.dragon_killed==0) ) ){ // se em cima está parede
                                        // nao faz nada          
            }

            else{
                map.array[this.row][this.col]=' ';  
                this.col++;                  //ja mudou indice da posiçao do heroi
                if(map.array[this.row][this.col]==sword.symbol){   // se hero está em cima da key, saida abre
                    game_loop.sword_finded=1;
                    this.symbol='A';
                }
                if(map.array[this.row][this.col]=='E' && game_loop.sword_finded==1 && game_loop.dragon_killed==1){   // se hero está em cima da saida aberta, vitoria
                    game_loop.victory=1;
                }
                map.array[this.row][this.col]=this.symbol;              
            } 
        }

        return;
    }

}
