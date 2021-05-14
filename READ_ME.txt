**GUESSING GAME PROGRAM VARIABLES INFO.**
_________________________
2019.11.18
BY: SAJID BASHAR
_________________________

*PLEASE NOTE THAT THERE IS A DEBUG LINE IN THE GAMEENVIRONMENT FORM THAT WILL SHOW YOU THE CORRECT GUESS IF NEEDED!*

MainScreen.Java:

user --> jFrame variable used to show user jFrame. 
help --> jFrame variable used to show help jFrame. 
lb --> jFrame variable used to show leaderboard jFrame. 

UsernameSubmit.Java: 

Username --> String variable (Public Static) that is used throughout the game; holds the username of player entered in jFrame.

GameEnvironment.Java:

GameScore --> Double value (Public Static) assigned to the user if game is won - holds the player's total score and is used in comparison with leaderboard once game is won.
GameDate --> LocalDate value (Public Static) assigned to the user if game is won, is created and used on leaderboard if high score achieved.

theGuess --> Integer value that holds value of user's input. 
theCount --> Integer value that holds value of how many available guesses are left for user till game is over.
theTarget --> Integer value that user must guess to win the game.

range--> Double value that holds the range of which user must guess between. *Range value changes based on control structure and user's choice of guess number.
GuessNumber--> Double value that holds number of guesses taken by user so far in the game.

countstring--> String value of "theCount" variable - displayed to user. 

LB.Java:

score --> Double value used for the LB constructor in leaderboard record comparison.
playerusername --> String value used for the LB constructor in leaderboard record comparison.
gamedate --> LocalDate value used for the LB constructor in leaderboard record comparison.

cposition--> Integer array used to index LB array for all three different variable types via separator of ":"; is an integer array that indexes for constructor of LB class.
Variable separates values of LB array to score, playerusername, and gamedate variables when read. 

Leaderboard.Java:
Leaders --> Empty LB array created via the LB constructor, has five slots that is filled used a score comparison method.
today --> LocalDate variable that represents today's date - fills Leaders variable if user's score is high enough.

fileName --> String variable that holds name of file (Scores.txt) that acts as file path for file reader/writer methods. 