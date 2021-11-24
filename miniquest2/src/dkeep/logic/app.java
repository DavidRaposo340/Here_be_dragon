package dkeep.logic;

import dkeep.cli.game_loop;

public class app {

    hero hero;
    dragon dragon;
    exit exit;
    sword sword;
    public app(){
        hero= new hero(1, 1, 'H');
        if(game_loop.sword_finded==1)
            hero.symbol='A';
        dragon= new dragon(3, 1, 'D');
        exit= new exit(9, 5, 'E');
        sword= new sword(8, 1, 'S');
    }

    public void play(String move_s) {
        //game state


        
        hero.hero_movement(move_s, sword);   
        hero.check_game_over();
        dragon.check_dragon_killed(hero);
    }

    
    }





    //state of the game, 
    //storing the current map and the game elements (hero, dragon, sword, etc.)




