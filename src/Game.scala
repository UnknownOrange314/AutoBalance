import collection.immutable.HashMap
import java.util.ArrayList

class Game {
    var players:ArrayList[Player]=null
    var successRate:HashMap[Player,Double]=null //Represents how successful a player has been.

    var choiceSuccess:HashMap[Player,Double]=null //Represents the success of strategies players can pursue.
    def runGame(){

    }

    def resetStats(){

    }

    def balanceGame(){
        runGame()
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

class Choice {
    var successRate:Double=0.5
    /**
     * Measuring success rate
     * -Track how often a player picks a certain choice and how well a player does.
     *  successRate=(how often player picks choice)*(how successful a player is).
     */
    var popularity:Double=0.5  //Is this necessary.
    var power:Double=1.0
}

