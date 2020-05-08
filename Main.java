package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	char Name = "T";
	int Position = 2;
	int Result = 0;
	int Score = 0;
		displayHighScorePosition(Name, Position);
		//if (Score == 10000 && levelComplete == 8) {
	 //   if (bonus == 200)
		//System.out.println("It's alright mama");
        }
    }
    	public static int displayHighScorePosition (char Name, int Position){
    	System.out.println("managet to get into posision" + Name + Position + "and the Position");
	}
	public static int calculateHighScorePosition (int Score, int Result){
		if (Score > 1000) {
			Result = 1;
		}
		if (Score > 500 || Score < 1000){
			Result = 2;}
		if 	(Score > 100 || Score < 500){
			Result = 3;}
		 	else Result = 4;
		}
	}
