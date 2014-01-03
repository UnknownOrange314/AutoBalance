/**
 *
 * @param choiceName The name of the choice.
 * @param targetUseRate How often do we want a choice to be used.
 */
class Choice(val choiceName:String,val targetUseRate:Double) {



    var successRate:Double=1.0
    /**
     * Measuring success rate
     * -Track how often a player picks a certain choice and how well a player does.
     *  successRate=(how often player picks choice)*(how successful a player is).
     */
    var popularity:Double=1.0

    var power:Double=1.0


}
