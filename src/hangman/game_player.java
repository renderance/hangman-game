package hangman;
import java.util.Random;

public class game_player {
	public game_state begin_game() {
		Random random = new Random();
		int index = random.nextInt(word_list.hard.length);
		game_state game_in_play = new game_state(word_list.hard[index]);
		return game_in_play;
	}
	public boolean play_turn(game_state game_in_play) {
		boolean turn_complete = false;
		while(turn_complete == false) {
			System.out.println("Please type a letter and press [Enter]:");
			String letter = hangman.reply.nextLine(); 
			turn_complete = game_in_play.take_turn(game_in_play, letter.toLowerCase());
		}
		return turn_complete;
	}
}
