package main;

public class TemplateBanner {

	private String[] A = {"   ###    ", "  ## ##   ", " ##   ##  ", "##     ## ", "######### ", "##     ## ", "##     ## "};       
	private String[] B = {"########  ", "##     ## ", "##     ## ", "########  ", "##     ## ", "##     ## ", "########  "};
	private String[] C = {" ######  ", "##    ## ", "##       ", "##       ", "##       ", "##    ## ", " ######  "};
	private String[] D = {"########  ", "##     ## ", "##     ## ", "##     ## ", "##     ## ", "##     ## ", "########  "};
	private String[] E = {"######## ", "##       ", "##       ", "######   ", "##       ", "##       ", "######## "};
	private String[] F = {"######## ", "##       ", "##       ", "######   ", "##       ", "##       ", "##       "};
	private String[] G = {" ######   ", "##    ##  ", "##        ", "##   #### ", "##    ##  ", "##    ##  ", " ######   "};
	private String[] H = {"##     ## ", "##     ## ", "##     ## ", "######### ", "##     ## ", "##     ## ", "##     ## "};
	private String[] I = {"#### ", " ##  ", " ##  ", " ##  ", " ##  ", " ##  ", "#### "};
	private String[] J = {"      ## ", "      ## ", "      ## ", "      ## ", "##    ## ", "##    ## ", " ######  "};
	private String[] K = {"##    ## ", "##   ##  ", "##  ##   ", "#####    ", "##  ##   ", "##   ##  ", "##    ## "};
	private String[] L = {"##       ", "##       ", "##       ", "##       ", "##       ", "##       ", "######## "};
	private String[] M = {"##     ## ", "###   ### ", "#### #### ", "## ### ## ", "##     ## ", "##     ## ", "##     ## "};
	private String[] N = {"##    ## ", "###   ## ", "####  ## ", "## ## ## ", "##  #### ", "##   ### ", "##    ## "};
	private String[] O = {" #######  ", "##     ## ", "##     ## ", "##     ## ", "##     ## ", "##     ## ", " #######  "};
	private String[] P = {"########  ", "##     ## ", "##     ## ", "########  ", "##        ", "##        ", "##        "};
	private String[] Q = {" #######  ", "##     ## ", "##     ## ", "##     ## ", "##  ## ## ", "##    ##  ", " ##### ## "};
	private String[] R = {"########  ", "##     ## ", "##     ## ", "########  ", "##   ##   ", "##    ##  ", "##     ## "};
	private String[] S = {" ######  ", "##    ## ", "##       ", " ######  ", "      ## ", "##    ## ", " ######  "};
	private String[] T = {"######## ", "   ##    ", "   ##    ", "   ##    ", "   ##    ", "   ##    ", "   ##    "};
	private String[] U = {"##     ## ", "##     ## ", "##     ## ", "##     ## ", "##     ## ", "##     ## ", " #######  "};
	private String[] V = {"##     ## ", "##     ## ", "##     ## ", "##     ## ", " ##   ##  ", "  ## ##   ", "   ###    "};
	private String[] W = {"##      ## ", "##  ##  ## ", "##  ##  ## ", "##  ##  ## ", "##  ##  ## ", "##  ##  ## ", " ###  ###  "};
	private String[] X = {"##     ## ", " ##   ##  ", "  ## ##   ", "   ###    ", "  ## ##   ", " ##   ##  ", "##     ## "};
	private String[] Y = {"##    ## ", " ##  ##  ", "  ####   ", "   ##    ", "   ##    ", "   ##    ", "   ##    "};
	private String[] Z = {"######## ", "     ##  ", "    ##   ", "   ##    ", "  ##     ", " ##      ", "######## "};
	private String[] questionMark = {" #######  ", "##     ## ", "      ##  ", "    ###   ", "   ##     ", "          ", "   ##     "};
	
	

	public void asciiArt(String input) {
		
		String[] allChar = input.split("(?!^)");
		
		
		
		for(int i = 0; i < 7; i++)
		{
			String lineOut = "";
			
			for(int j = 0; j < (allChar.length); j++)
			{
				String singleChar = allChar[j];
				
				switch(singleChar)
				{
				case "A":
					lineOut += " " + A[i];
					break;
				
				case "B":
					lineOut += " " + B[i];
					break;
					
				case "C":
					lineOut += " " + C[i];
					break;
					
				case "D":
					lineOut += " " + D[i];
					break;
					
				case "E":
					lineOut += " " + E[i];
					break;
					
				case "F":
					lineOut += " " + F[i];
					break;
					
				case "G":
					lineOut += " " + G[i];
					break;
					
				case "H":
					lineOut += " " + H[i];
					break;
					
				case "I":
					lineOut += " " + I[i];
					break;
					
				case "J":
					lineOut += " " + J[i];
					break;
					
				case "K":
					lineOut += " " + K[i];
					break;
					
				case "L":
					lineOut += " " + L[i];
					break;
					
				case "M":
					lineOut += " " + M[i];
					break;
					
				case "N":
					lineOut += " " + N[i];
					break;
					
				case "O":
					lineOut += " " + O[i];
					break;
					
				case "P":
					lineOut += " " + P[i];
					break;
					
				case "Q":
					lineOut += " " + Q[i];
					break;
					
				case "R":
					lineOut += " " + R[i];
					break;
					
				case "S":
					lineOut += " " + S[i];
					break;
					
				case "T":
					lineOut += " " + T[i];
					break;
					
				case "U":
					lineOut += " " + U[i];
					break;
					
				case "V":
					lineOut += " " + V[i];
					break;
					
				case "W":
					lineOut += " " + W[i];
					break;
					
				case "X":
					lineOut += " " + X[i];
					break;
					
				case "Y":
					lineOut += " " + Y[i];
					break;
					
				case "Z":
					lineOut += " " + Z[i];
					break;
					
				default:
					lineOut += " " + questionMark[i];
					break;
				}
			}
			
			System.out.println(lineOut);
		}
		
	}
	
	
}
