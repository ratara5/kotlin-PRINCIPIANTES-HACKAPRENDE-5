fun main(args: Array<String>) {
    //22-24
    val movieName="Titanic"
    val duration=90
    val isAvailable=true
    var r=playMovie(movieName, duration, isAvailable)
    println("$movieName movie had played: $r")
    if(r){
        pause()
    }
    playMovie(movieName, duration) //26 sobrecarga de métodos
    playMovie(movieName, duration, otroArgumento = "otro") //26 sobrecarga de métodos
    //playMovie(duration=60, movieName = "Pocahontas", isAvailable = true) //argumentos se pueden enviar en desorden, pero hay que nombrarlos adecuadamente
    //pause()
}

fun playMovie(movieName: String, duration: Int, isAvailable: Boolean): Boolean{ //también se pueden asignar valores por defecto a los argumentos
    //valor de retorno Unit es como no poner nada es el equivalente al void de java
    //25
    //var v=false
    return if(isAvailable){ // return if es una simplificación de kotlin
        if(duration>0){
            for (i in 0 until duration step duration / 10) {
                println("Playing movie $movieName")
                //v = true
            }
            true
        }else {
            println("Playing movie duration is zero or less than zero")
            false
        }
    }else{
        println("Movie $movieName is not available")
        false
    }

}
//26 sobrecarga de métodos. La misma funión con menos argumentos. Se puede hacer casi lo mismo sobrecargando que dando valores por defecto
fun playMovie(movieName: String, duration: Int): Boolean{
    return if(true){ // return if es una simplificación de kotlin
        if(duration>0){
            for (i in 0 until duration step duration / 10) {
                println("Playing movie $movieName")
                //v = true
            }
            true
        }else {
            println("Playing movie duration is zero or less than zero")
            false
        }
    }else{
        println("Movie $movieName is not available")
        false
    }

}

fun playMovie(movieName: String, duration: Int, otroArgumento: String): Boolean{
    return if(true){ // return if es una simplificación de kotlin
        if(duration>0){
            for (i in 0 until duration step duration / 10) {
                println("Playing movie $movieName")
                //v = true
            }
            true
        }else {
            println("Playing movie duration is zero or less than zero")
            false
        }
    }else{
        println("Movie $movieName is not available")
        false
    }

}

fun pause(){
    println("Movie paused")
}
