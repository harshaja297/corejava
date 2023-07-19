package pack;

public class TextDec {

	  // Reset
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BOLDBLACK = "\033[1;30m";  // BLACK
    public static final String BOLDRED= "\033[1;31m";    // RED
    public static final String BOLDGREEN = "\033[1;32m";  // GREEN
    public static final String BOLDYELLOW = "\033[1;33m"; // YELLOW
    public static final String BOLDBLUE= "\033[1;34m";   // BLUE
    public static final String BOLDPURPLE= "\033[1;35m"; // PURPLE
    public static final String BOLDCYAN= "\033[1;36m";   // CYAN
    public static final String BOLDWHITE = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACKUL = "\033[4;30m";  // BLACK
    public static final String REDUL = "\033[4;31m";    // RED
    public static final String GREENUL = "\033[4;32m";  // GREEN
    public static final String YELLOWUL = "\033[4;33m"; // YELLOW
    public static final String BLUEUL = "\033[4;34m";   // BLUE
    public static final String PURPLEUL = "\033[4;35m"; // PURPLE
    public static final String CYANUL = "\033[4;36m";   // CYAN
    public static final String WHITEUL = "\033[4;37m";  // WHITE

    // Background
    public static final String BLACKBG = "\033[40m";  // BLACK
    public static final String REDBG = "\033[41m";    // RED
    public static final String GREENBG = "\033[42m";  // GREEN
    public static final String YELLOWBG = "\033[43m"; // YELLOW
    public static final String BLUEBG = "\033[44m";   // BLUE
    public static final String PURPLEBG = "\033[45m"; // PURPLE
    public static final String CYANBG = "\033[46m";   // CYAN
    public static final String WHITEBG = "\033[47m";  // WHITE

    // High Intensity
    public static final String LIGHTBLACK = "\033[0;90m";  // BLACK
    public static final String LIGHTRED = "\033[0;91m";    // RED
    public static final String LIGHTGREEN = "\033[0;92m";  // GREEN
    public static final String LIGHTYELLOW = "\033[0;93m"; // YELLOW
    public static final String LIGHTBLUE = "\033[0;94m";   // BLUE
    public static final String LIGHTPURPLE = "\033[0;95m"; // PURPLE
    public static final String LIGHTCYAN = "\033[0;96m";   // CYAN
    public static final String LIGHTWHITE = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BOLDLIGHTBLACK = "\033[1;90m"; // BLACK
    public static final String BOLDLIGHTRED = "\033[1;91m";   // RED
    public static final String BOLDLIGHTGREEN = "\033[1;92m"; // GREEN
    public static final String BOLDLIGHTYELLOW = "\033[1;93m";// YELLOW
    public static final String BOLDLIGHTBLUE = "\033[1;94m";  // BLUE
    public static final String BOLDLIGHTPURPLE = "\033[1;95m";// PURPLE
    public static final String BOLDLIGHTCYAN = "\033[1;96m";  // CYAN
    public static final String BOLDLIGHTWHITE = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String LIGHTBLACKBG = "\033[0;100m";// BLACK
    public static final String LIGHTREDBG= "\033[0;101m";// RED
    public static final String LIGHTGREENBG= "\033[0;102m";// GREEN
    public static final String LIGHTYELLOWBG= "\033[0;103m";// YELLOW
    public static final String LIGHTBLUEBG= "\033[0;104m";// BLUE
    public static final String LIGHTPURPLEBG= "\033[0;105m"; // PURPLE
    public static final String LIGHTCYANBG= "\033[0;106m";  // CYAN
    public static final String LIGHTWHITEBG= "\033[0;107m";   // WHITE

	
	public static void main(String[] args) {
	
		//System.out.println(LIGHTREDBG+" - lightred");
		System.out.println(RED+"red");
		System.out.println(BOLDRED+"red");
//		System.out.println(RED+" - Cyan");
//		System.out.println(CYAN+" - Cyan");
		System.out.println(LIGHTBLUE+" - lightblue");
		System.out.println(BLUE+" - blue");
		System.out.println(BOLDGREEN+" - boldgreen");
//		System.out.println(YELLOWUL+" - yellow");

	}
	
}
