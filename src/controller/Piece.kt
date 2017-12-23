package controller

import javafx.scene.image.Image


abstract class Piece(private var colour: Boolean){
    protected val imgString: String = ("assets/pieces/" + this.colour.toString() + this.javaClass.simpleName + ".png")
    internal val image: Image = Image(imgString)

    override fun toString(): String {
        var c = "white"
        if(!colour) c = "black"
        return "Piece(colour=$c, Type='${javaClass.name.substringAfterLast(".")}')"
    }
    fun getColour(): Boolean {
        return colour
    }


    //promise to implement these methods
    protected abstract fun getPieceMoves(): Array<MoveList>
    protected abstract fun getRange():Int


}






