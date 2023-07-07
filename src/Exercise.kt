// Scrivere due diverse implementazioni di 1 classe padre e 2 classi figlio che sostituiscono un metodo,
// una utilizzando l'ereditarietà e un'altra utilizzando le interfacce.


interface implementazioni {
    fun myWeight()
}

// Qui sopra cre un'interfaccia con un metodo astratto.


open class Padre {
    var myEyesColorPadre = "Brown"
    open fun eyesColor() {
        println("My eye color is ${myEyesColorPadre}")

    }
}

// Qui sopra creo la classe padre "Padre" open.


class Figlio : Padre() {
    var myAge = 17
    var eyesColorFiglio = "Blue"
    fun myAgeIs() {
        println("My age is ${myAge} y.o.")
    }

    override fun eyesColor() {
        println("My eyes color is ${eyesColorFiglio}")
    }
}


// Qui sopra creo la classe figlio, che eredita dalla classe padre il metodo eyesColor e lo sovrascrive.

class Figlio2 : implementazioni {

    var myPersonalWeight = 67.55

    override fun myWeight() {
        println("My weight is ${myPersonalWeight}")
    }
}

// Qui sopra la classe Figlio2 usa un'interfaccia con un metodo astratto MyWeight e lo sovrascrive.


