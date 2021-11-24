package dkeep.logic;

import dkeep.cli.game_loop;

public class dragon extends element{


    public dragon(int row, int col, char symbol) {
        super(row, col, 'D');
    }

    public void check_dragon_killed(hero hero){
        
        if(game_loop.sword_finded==1){            
            if(map.array[this.row-1][this.col]==hero.symbol){
                map.array[this.row][this.col]=' ';
                game_loop.dragon_killed=1;
                return;
            }
            
            if(map.array[this.row][this.col-1]==hero.symbol){
                map.array[this.row][this.col]=' ';
                game_loop.dragon_killed=1;
                return;
            } 
            if(map.array[this.row+1][this.col]==hero.symbol){
                map.array[this.row][this.col]=' ';
                game_loop.dragon_killed=1;
                return;
            }  
            if(map.array[this.row][this.col+1]==hero.symbol){
                map.array[this.row][this.col]=' ';
                game_loop.dragon_killed=1;
                return;
            }
        }
    }




}
