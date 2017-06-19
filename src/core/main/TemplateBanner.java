package main;

public class TemplateBanner {

	private String[] A = {"   ###    ", "  ## ##   ", " ##   ##  ", "##     ## ", "######### ", "##     ## ", "##     ## "};       
	private String[] B = {"########  ", "##     ## ", "##     ## ", "########  ", "##     ## ", "##     ## ", "########  "};
	private String[] C = {" ######  ", "##    ## ", "##       ", "##       ", "##       ", "##    ## ", " ######  "};
	
	

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
				}
			}
			
			System.out.println(lineOut);
		}
		
	}
	
	
}
