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
	// 7 × 9 block-style letters
    String[] O = {
            "  *****  ",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "  *****  "
    };

    String[] P = {
            " ******  ",
            " **    ** ",
            " **    ** ",
            " ******  ",
            " **       ",
            " **       ",
            " **       "
    };

    String[] S = {
            "  *****  ",
            " **       ",
            " **       ",
            "  *****  ",
            "      **  ",
            "      **  ",
            "  *****  "
    };


    // Final banner rows
    String[] banner = new String[7];

    // Build banner line by line
    for (int i = 0; i < 7; i++) {
        banner[i] = String.join("  ", O[i], O[i], P[i], S[i]);
    }

    // Print banner
    for (String line : banner) {
        System.out.println(line);
    }
}
	
}
