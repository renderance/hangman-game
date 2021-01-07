package hangman;

public class game_image {
	public static void print_image(int misses) {
		if(misses == 0) {
			System.out.println(image00());
		}
		else if(misses == 1) {
			System.out.println(image01());
		}
		else if(misses == 2) {
			System.out.println(image02());
		}
		else if(misses == 3) {
			System.out.println(image03());
		}
		else if(misses == 4) {
			System.out.println(image04());
		}
		else if(misses == 5) {
			System.out.println(image05());
		}
		else if(misses == 6) {
			System.out.println(image06());
		}
		else if(misses == 7) {
			System.out.println(image07());
		}
		else if(misses == 8) {
			System.out.println(image08());
		}
		else if(misses == 9) {
			System.out.println(image09());
		}
		else if(misses >= 10) {
			System.out.println(image10());
		}
	}
	
	public static String image10()	{
		return  "\n"
		.concat("  -+-------+  \n")
		.concat("   |      \\|  \n")
		.concat("   O       |  \n")
		.concat("  /|\\      |  \n")
		.concat("  / \\      |  \n")
		.concat("           |  \n")
		.concat("-----------+--\n");
	}
	public static String image09()	{
		return  "\n"
		.concat("  -+-------+  \n")
		.concat("   |      \\|  \n")
		.concat("   O       |  \n")
		.concat("  /|\\      |  \n")
		.concat("  /        |  \n")
		.concat("           |  \n")
		.concat("-----------+--\n");
	}
	public static String image08()	{
		return  "\n"
		.concat("  -+-------+  \n")
		.concat("   |      \\|  \n")
		.concat("   O       |  \n")
		.concat("  /|\\      |  \n")
		.concat("           |  \n")
		.concat("           |  \n")
		.concat("-----------+--\n\n\n");
	}
	public static String image07()	{
		return  "\n"
		.concat("  -+-------+  \n")
		.concat("   |      \\|  \n")
		.concat("   O       |  \n")
		.concat("  /|       |  \n")
		.concat("           |  \n")
		.concat("           |  \n")
		.concat("-----------+--\n\n\n");
	}
	public static String image06()	{
		return  "\n"
		.concat("  -+-------+  \n")
		.concat("   |      \\|  \n")
		.concat("   O       |  \n")
		.concat("   |       |  \n")
		.concat("           |  \n")
		.concat("           |  \n")
		.concat("-----------+--\n\n\n");
	}
	public static String image05()	{
		return  "\n"
		.concat("  -+-------+  \n")
		.concat("   |      \\|  \n")
		.concat("   O       |  \n")
		.concat("           |  \n")
		.concat("           |  \n")
		.concat("           |  \n")
		.concat("-----------+--\n\n\n");
	}
	public static String image04()	{
		return  "\n"
		.concat("  -+-------+  \n")
		.concat("   |      \\|  \n")
		.concat("           |  \n")
		.concat("           |  \n")
		.concat("           |  \n")
		.concat("           |  \n")
		.concat("-----------+--\n\n\n");
	}
	public static String image03()	{
		return  "\n"
		.concat("  ---------+  \n")
		.concat("          \\|  \n")
		.concat("           |  \n")
		.concat("           |  \n")
		.concat("           |  \n")
		.concat("           |  \n")
		.concat("-----------+--\n\n\n");
	}
	public static String image02()	{
		return  "\n"
		.concat("           |  \n")
		.concat("           |  \n")
		.concat("           |  \n")
		.concat("           |  \n")
		.concat("           |  \n")
		.concat("           |  \n")
		.concat("-----------+--\n\n\n");
	}
	public static String image01()	{
		return  "\n"
		.concat("              \n")
		.concat("              \n")
		.concat("              \n")
		.concat("              \n")
		.concat("              \n")
		.concat("              \n")
		.concat("--------------\n\n\n");
	}
	public static String image00()	{
		return  "\n"
		.concat("              \n")
		.concat("              \n")
		.concat("              \n")
		.concat("              \n")
		.concat("              \n")
		.concat("              \n")
		.concat("              \n\n\n");
	}		
}
