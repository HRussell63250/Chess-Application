package Model.Game
/*this table is 1:1 with stats */
class Stats(var gameId: Int, var result: String) {
    override fun toString(): String {
        return "Stats(gameId=$gameId, result=$result)"
    }

}


