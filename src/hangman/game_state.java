package hangman;

import java.util.Arrays;

public class game_state {
	public String target_word;
	public boolean[] word_mask;
	public int turn;
	public int misses;
	public boolean win_state;
	public boolean lose_state;
	public String guesses;
	
	public game_state(String word) {
		this.target_word=word.toLowerCase();
		this.word_mask=new boolean[word.length()];
		Arrays.fill(this.word_mask, false);
		this.turn=0;
		this.misses=0;
		this.win_state=false;
		this.lose_state=false;
		this.guesses="";
	}
	public boolean take_turn(game_state game, String letters) {
		if(letters.length()==1) {
			char ch = letters.charAt(0);
			//Check if input is a letter.
			if( "abcdefghijklmnopqrstuvwxyz".indexOf(Character.toLowerCase(ch)) == -1) {
				System.out.printf("The symbol \'%c\' is not a recognized letter!\n",ch);
				return false;
			}
			else {
				//Check if said letter was already guessed.
				if(game.guesses.indexOf(Character.toLowerCase(ch)) != -1) {
					System.out.printf("The letter \'%c\' was already guessed!\n",ch);
					return false;
				}
				else {
					//Check if letter is in target word.
					if(game.target_word.indexOf(Character.toLowerCase(ch)) != -1) {
						game.guesses+=ch;
						System.out.printf("Good guess!\n",ch);
						//Update the mask.
						for(int i=0; i<game.target_word.length(); i++) {
							if(ch==game.target_word.toCharArray()[i]) {
								game.word_mask[i]=true;
							}
						}
					}
					else {
						game.guesses+=ch;
						System.out.printf("Sorry, you guessed wrong!\n",ch);
						game.misses++;
					}
					game.turn++;
				}
			}
			return true;
		}
		else {
			System.out.println("You entered more letters than one!\n"
					.concat("I can only process one letter at a time!")
			);
			return false;
		}
	}
	public boolean win_check(game_state game) {
		for(int i=0; i<game.word_mask.length; i++) {
			if(this.word_mask[i]==false) {
				return false;
			}
		}
		game.display_game(game);
		System.out.println("Congratulations, you won!");
		return true;
	}
	public boolean lose_check(game_state game) {
		if(game.misses>9) {
			game.display_game(game);
			System.out.println("Aww, you lost.");
			System.out.println("Gaze upon your dangling body and weep.");
			return true;
		}
		else {
			return false;
		}
	}
	public String print_mask(game_state game) {
		char[] display_char = game.target_word.toCharArray();
		String display_line = "";
		for(int i=0; i<display_char.length;i++) {
			if(game.word_mask[i] == false) {
				display_char[i]='_';
			}
			else {
				display_char[i]=Character.toUpperCase(display_char[i]);
			}
			display_line=display_line+display_char[i]+' ';
		}
		return display_line;
	}
	public String print_guesses(game_state game) {
		char[] display_char = game.guesses.toCharArray();
		String display_line = "";
		for(int i=0; i<display_char.length;i++) {
			display_line=display_line+Character.toUpperCase(display_char[i])+' ';
		}
		return display_line;
	}
	public void display_game(game_state game) {
		game_image.print_image(game.misses);
		System.out.println("Word to guess:");
		System.out.println(game.print_mask(game));
		System.out.println();
		System.out.println("Letters guessed:");
		System.out.println(game.print_guesses(game));
		System.out.println();
	}
}
