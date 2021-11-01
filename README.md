# Here_be_dragon

a) Let's start with the game map. Store in memory and print out (on console) the following map (no colours, textual characters only). Hint: Use a two-dimensional array, initialised on the declaration.![image](https://user-images.githubusercontent.com/78873689/139711592-44b2a762-5331-42b4-b1ae-65f5e95510d5.png)


b) The user should be asked to enter single-character commands to move the main character ("hero") in 4 possible directions (up, down, left, right). If there is a wall or door in that direction, the hero remains in the same position. Upon entering each command, the program should update the game and reprint the game map. Hint: For the Java version, use the Scanner class for input. For the C++ version, use cin for input and cout for output.

c) The hero needs to pick up (walkover) the key ('K') to open the dungeon exit door ('E'). If the hero reaches the exit without the key, it cannot leave the dungeon (the exit is closed). If the hero gets anywhere near the dragon (any adjacent square, except diagonals), it is immediately killed, and the game is over. At this point, the dragon is asleep and does not move, so the hero should be safe, as long as it keeps away from him. When reaching (stepping over) the open exit door, the game ends with victory.

d) The game starts normally, but the moment the hero picks up the key, both dragon and exit randomly change positions. These new positions must be valid and allow for the hero to reach the exit.
