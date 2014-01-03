import collection.immutable.HashMap
import java.util.ArrayList

class Game {
    var players:ArrayList[Player]=null
    var successRate:HashMap[Player,Double]=null //Represents how successful a player has been.
    var choiceSuccess:HashMap[Choice,Double]=null //Represents the success of strategies players can pursue.

    /**
     * Adds a player to the game.
     */
    def addPlayer(){

    }

    /**
     * Removes a player from the game.
     */
    def removePlayer(){

    }

    /**
     * Adds a choice to the game.
     * @param name The name of the choice.
     */
    def addChoice(name:String){

    }

    /**
     * This sets the interaction level between two players.
     * @param p1 The first player.
     * @param p2 The second player.
     * @param c The level of interaction between two players. The value is between 0 and 1.
     */
    def setInteractionLevel(p1:Player, p2:Player,c:Double){

    }

    /**
     * This adds data about a session
     * @param playerSuccess How successful a player has been. If no value is specified for a player, the value here defaults to 1.
     * @param choiceSuccess How successful a choice has been. If no value is specified for a choice, the value here defaults to 1.
     */
    def addSessionData(playerSuccess:HashMap[Player,Double],choiceSuccess:HashMap[Choice,Double]){

    }

    /**
     * This resets stats about the game.
     */
    def resetStats(){

    }

    /**
     * This method loads game data.
     * @param loc
     */
    def loadData(loc:String){

    }

    /**
     * This method outputs data about the game to a location.
     * @param outLoc
     */
    def outputData(outLoc:String){

    }

    /**
     * This method automatically balances the game based on session data.
     */
    def balanceGame(){
        /*
            High success rate: Nerf
            Low success rate: Buff

            Interaction rate
                -If you buff one player, make sure to buff players with high interaction rate.
                -If you nerf one player, make sure to nerf players with a low interaction rate.
            For choices, do something similar
                -If a choice is not being used often enough, buff it.
                -If a choice is being used too often, nerf it.

                -Buff or nerf a choice based on its success rate.
         */
    }
}

