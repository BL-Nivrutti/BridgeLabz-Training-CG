package com.oopsbannerapp;
/**
 * OOPSBannerApp UC1 – OOPS Banner Display Application
 *
 * This class demonstrates a simple Java application
 * that prints the OOPS acronym to the console.
 *
 * @author Developer
 * @version 1.0
 */
public class OOPsBannerApps {
	 /**
     * Entry point of the Java application.
     *
     * @param args command-line arguments
     */
public static void main(String[] args) {
	
	System.out.println("OOPS");
	
	CharacterPattern[] patterns = createCharacterPatterns();
	String[] banner = buildBanner(patterns);
	printBanner(banner);
}

private static String[] buildBanner(CharacterPattern[] patterns) {
	String[] banner = new String[7];

    for (int i = 0; i < 7; i++) {
        banner[i] =
                patterns[0].getPattern()[i] + "  " +
                patterns[1].getPattern()[i] + "  " +
                patterns[2].getPattern()[i] + "  " +
                patterns[3].getPattern()[i];
    }

    return banner;
}

//print the banner
private static void printBanner(String[] banner) {
	for(String line : banner) {
		System.out.println(line);
	}
}

//7 × 9 block-style letters
private static CharacterPattern[] createCharacterPatterns() {

    return new CharacterPattern[] {

        new CharacterPattern('O', new String[] {
            "  *****  ",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "  *****  "
        }),

        new CharacterPattern('O', new String[] {
            "  *****  ",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "  *****  "
        }),

        new CharacterPattern('P', new String[] {
            " ******  ",
            " **    **",
            " **    **",
            " ******  ",
            " **      ",
            " **      ",
            " **      "
        }),

        new CharacterPattern('S', new String[] {
            "  *****  ",
            " **      ",
            " **      ",
            "  *****  ",
            "      ** ",
            "      ** ",
            "  *****  "
        })
    };
}


private static class CharacterPattern {

    private final char character;
    private final String[] pattern;

    /**
     * Constructs a CharacterPattern object.
     *
     * @param character banner character
     * @param pattern 7×9 pattern for the character
     */
    public CharacterPattern(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

 //returns the banner pattern row
    public String[] getPattern() {
        return pattern;
    }

//returns the Character
    public char getCharacter() {
        return character;
    }
}
	
}
