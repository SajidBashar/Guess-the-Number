

import java.time.LocalDate;


/*
 * -VERSION HISTORY-
*V1.0 (2019.11.8): 1. Basic constructor to instantiate objects LB class is created - {SCORE, NAME, DATE}
                               2. Setters and getters are created for score, name, & date
                               3. Method to display plain text of LB object created 
*V2.0 (2019.12.11): LB class is extended to instantiate records by parsing and indexing string records read via FileReader in Leaderboard.java
*V3.0(2019.12.12): New method - "displayText()" - created to return LB object as string for FileWriter in Leaderboard.java
 */
/**
 *
 * constructor class that defines array record
 * @bashsaji161@granderie.ca 2019.11.18
 * 
 * References:
 * https://beginnersbook.com/2013/03/constructors-in-java/
 */
public class LB {

     double score;  //Double value used for the LB constructor in leaderboard record comparison.
     String playerusername; //String value used for the LB constructor in leaderboard record comparison.
     LocalDate gamedate; // LocalDate value used for the LB constructor in leaderboard record comparison.

    public LB(double in_score, String in_Name, LocalDate in_date) {
        
        score = in_score;
        playerusername = in_Name;
        gamedate = in_date;
    }

    LB(String line) {
        //parse a string to create a record
        int[] cposition;    //integer array that indexes for constructor 
        cposition = new int[2]; //only 3 fields= 2 colons embedded in string
        cposition[0] = line.indexOf(":");
        cposition[1] = line.lastIndexOf(":");
        if (cposition[0] >= 0 && cposition[1] > 0) {
            score = Double.parseDouble(line.substring(0, cposition[0]));//could use split if regular expression used
            playerusername = line.substring(cposition[0] + 1, cposition[1]);
            //NOTE that potential parse errors not handled yet
            gamedate = LocalDate.parse(line.substring(cposition[1] + 1));
        }
    }

    //Setters and getters
    
    public void setScore(double in_score) {
        //takes score parameter to set variable as numerical score 
        score = in_score;
    }

    public double getScore() {
        //returns score that was set via setScore function 
        return score;
    }

    public void setUsername(String in_Name) {
        //sets private username variable via username parameter 
        playerusername = in_Name;
    }

    public  String getUsername() {
        //returns username that was set with setUsername function
        return playerusername;
    }

    public void setDate(LocalDate in_date) {
        //sets private gamedate variable with date parameter
        gamedate = in_date;
    }

    public LocalDate getDate() {
        //returns private gamedate value that was set with setDate function
        return gamedate;
    }

    public void display() {
        //displays text of an array to formatted style of leaderboard
        System.out.println(score + ":" + playerusername + ":" + gamedate);
    }

    String displayText() {
        //returns String of formatted style of leaderboard 
        if (score>0){
           return (score + ":" + playerusername + ":" + gamedate);
        }
        else return "";
    }

}
