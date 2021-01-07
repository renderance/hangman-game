package hangman;

import java.util.Scanner;

public class hangman {
	public static void main(String[] args){
		System.out.println("Hello, welcome to Glenn's Hangman, v1!");
		boolean new_game = play_game();
		while(new_game == true) {
			new_game = play_game();
		}
		System.out.println("Goodbye!");
	}
	public static boolean play_game() {
		System.out.println("Would you like to start a new game? y/n");
		String answer = reply.nextLine();
		if(!answer.equals("y")) {
			return false;
		}
		else {
			game_player player1 = new game_player();
			game_state game = player1.begin_game();
			while(game.lose_state == false && game.win_state == false) {
				game.display_game(game);
				boolean turn_played = false;
				while(turn_played == false) {
					turn_played = player1.play_turn(game);
				}
				game.win_state = game.win_check(game);
				game.lose_state = game.lose_check(game);
			}
		}
		return true;
	}
	public static Scanner reply = new Scanner(System.in);
}
