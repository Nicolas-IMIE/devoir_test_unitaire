/**
 * 
 */
package devoir_test_unitaire;

import static org.junit.Assert.*;

import java.util.Arrays;

import main.TemplateBanner;

import org.junit.Test;

import com.github.javafaker.Faker;

/**
 * @author Edern
 *
 */
public class TemplateBannerTest {

	@Test
	public void asciiArtTest() {

		com.github.javafaker.Faker faker = new Faker();
		String fakeStr = faker.address().cityName();
		String[] alphabet = {"A", "B", "W", "U", "I", "O", "T", "Z"};
		Boolean isOk = true;
			
		String[] A = {"   ###    ", "  ## ##   ", " ##   ##  ", "##     ## ", "######### ", "##     ## ", "##     ## "};       
		String[] B = {"########  ", "##     ## ", "##     ## ", "########  ", "##     ## ", "##     ## ", "########  "};
		String[] C = {" ######  ", "##    ## ", "##       ", "##       ", "##       ", "##    ## ", " ######  "};
		String[] D = {"########  ", "##     ## ", "##     ## ", "##     ## ", "##     ## ", "##     ## ", "########  "};
		String[] E = {"######## ", "##       ", "##       ", "######   ", "##       ", "##       ", "######## "};
		String[] F = {"######## ", "##       ", "##       ", "######   ", "##       ", "##       ", "##       "};
		String[] G = {" ######   ", "##    ##  ", "##        ", "##   #### ", "##    ##  ", "##    ##  ", " ######   "};
		String[] H = {"##     ## ", "##     ## ", "##     ## ", "######### ", "##     ## ", "##     ## ", "##     ## "};
		String[] I = {"#### ", " ##  ", " ##  ", " ##  ", " ##  ", " ##  ", "#### "};
		String[] J = {"      ## ", "      ## ", "      ## ", "      ## ", "##    ## ", "##    ## ", " ######  "};
		String[] K = {"##    ## ", "##   ##  ", "##  ##   ", "#####    ", "##  ##   ", "##   ##  ", "##    ## "};
		String[] L = {"##       ", "##       ", "##       ", "##       ", "##       ", "##       ", "######## "};
		String[] M = {"##     ## ", "###   ### ", "#### #### ", "## ### ## ", "##     ## ", "##     ## ", "##     ## "};
		String[] N = {"##    ## ", "###   ## ", "####  ## ", "## ## ## ", "##  #### ", "##   ### ", "##    ## "};
		String[] O = {" #######  ", "##     ## ", "##     ## ", "##     ## ", "##     ## ", "##     ## ", " #######  "};
		String[] P = {"########  ", "##     ## ", "##     ## ", "########  ", "##        ", "##        ", "##        "};
		String[] Q = {" #######  ", "##     ## ", "##     ## ", "##     ## ", "##  ## ## ", "##    ##  ", " ##### ## "};
		String[] R = {"########  ", "##     ## ", "##     ## ", "########  ", "##   ##   ", "##    ##  ", "##     ## "};
		String[] S = {" ######  ", "##    ## ", "##       ", " ######  ", "      ## ", "##    ## ", " ######  "};
		String[] T = {"######## ", "   ##    ", "   ##    ", "   ##    ", "   ##    ", "   ##    ", "   ##    "};
		String[] U = {"##     ## ", "##     ## ", "##     ## ", "##     ## ", "##     ## ", "##     ## ", " #######  "};
		String[] V = {"##     ## ", "##     ## ", "##     ## ", "##     ## ", " ##   ##  ", "  ## ##   ", "   ###    "};
		String[] W = {"##      ## ", "##  ##  ## ", "##  ##  ## ", "##  ##  ## ", "##  ##  ## ", "##  ##  ## ", " ###  ###  "};
		String[] X = {"##     ## ", " ##   ##  ", "  ## ##   ", "   ###    ", "  ## ##   ", " ##   ##  ", "##     ## "};
		String[] Y = {"##    ## ", " ##  ##  ", "  ####   ", "   ##    ", "   ##    ", "   ##    ", "   ##    "};
		String[] Z = {"######## ", "     ##  ", "    ##   ", "   ##    ", "  ##     ", " ##      ", "######## "};
		String[] questionMark = {" #######  ", "##     ## ", "      ##  ", "    ###   ", "   ##     ", "          ", "   ##     "};
		
		
		String[] allChar = fakeStr.split("(?!^)");
		
		TemplateBanner template = new TemplateBanner();
		String outTurn = template.asciiArt(fakeStr, alphabet);
			
		String lineOut = "";
		
		for(int i = 0; i < 7; i++)
		{
			
			for(int j = 0; j < (allChar.length); j++)
			{
				String singleChar = allChar[j];
				
				if(Arrays.asList(alphabet).contains(singleChar))
				{
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
				}else
				{
					lineOut += " " + questionMark[i];
				}
				
				if(j == allChar.length -1)
				{
					lineOut += "\n";
				}
			}
//				System.out.println(lineOut);
		}
		
		if(lineOut.equals(outTurn))
		{
			isOk = true;
		}else
			isOk = false;
		
		assertTrue(isOk);
		
	}
}
