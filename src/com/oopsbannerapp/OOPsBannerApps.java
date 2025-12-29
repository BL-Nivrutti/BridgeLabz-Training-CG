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
	
	String[] banner = buildBanner();
	printBanner(banner);
}

private static String[] buildBanner() {
	String[] O = getOPattern();
	String[] P = getPPattern();
	String[] S = getSPattern();
	
	String[] banner = new String[7];
	
	//construct banner line by line
	for(int i=0; i<7;i++)
	{
		banner[i] = O[i]+"  "+O[i]+"  "+P[i]+"  "+S[i];
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
private static String[] getOPattern() {
return new String[]{
        "  *****  ",
        "**     **",
        "**     **",
        "**     **",
        "**     **",
        "**     **",
        "  *****  "
};
}

private static String[] getPPattern() {
return new String[]{
        " ******  ",
        " **    ** ",
        " **    ** ",
        " ******  ",
        " **       ",
        " **       ",
        " **       "
};
}
private static String[] getSPattern() {
return new String[]{
        "  *****  ",
        " **       ",
        " **       ",
        "  *****  ",
        "      **  ",
        "      **  ",
        "  *****  "
};
}
	
}
