fun main() {
    println("Bucles")
    //ciclo for
    println("For") // for = por cada elemento
    for (i in 1..10) { // el for en kotlin se usa el indice que es i colocamos in y desde donde queremos recorrer despues dos veces punto osea .. y numero hasta donde queremos recorrer
        println(i)
    }

    for (i in 10 .. 20) {
        println(i)
    }

    // tambien podemos hacer que un ciclo avance de 2 en 2 con la palabra reservada step
    for (i in 1 .. 8 step 2) { // despues del step podemos colcoar un numero para decirle de cuanto en cuanto queremos que avanze el ciclo
        println("step 2 $i") // esto mostrara numeros impares por que comienza en 1 si comenzara en 2 seria 2, despues avanzaria otros dos seria 4 y asi hasta llegar a 8 si se pasa de 8 entonces imprime el anterior y termina el ciclo
    }

    // Si queremos imprimir cada letra de un string podemos usar un for de la siguiente manera
    val bocales: String = "aeiou"
    for (i in 0..bocales.length - 1) {
        println("$i = ${bocales.get(i)}") // el metodo get es un metodo para los tipos string y nos permite acceder a un caracter del string anidado y como parametro lleva el indice del caracter que queremos acceder, recuerda que los string comienza de 0 hasta i -1 osea que si son 5 letras seria 0,1,2,3,4 por eso seria i-1 y por eso restamos en length - 1 para que no nos aparezca un error de que ese indice no existe por que se paso de rango de limite de strings
    }

    // hay una manera mas rapida y optima de hacer lo anterior y es de la siguiente forma (es como seria un for each)
    for (bocal in bocales) { // lo unico malo es que aca no hay indice
        println(bocal)
    }

    println("Operdores de incremento")
    val nombre: String = "Rosa"
    var longitud: Int = 0
    var saldo: Int = 100
    for (letra in nombre) {
        println(letra)
        longitud++//longitud += 1 //longitud = longitud + 1 // esta es la manera de incrementar y podemos optimizarlo
        saldo--
    }
    println("Longitud: $longitud")
    println("Saldo: $saldo")

    println("While y Do While")
    var indice = 0
    // evalua primero y hace despues, while evalua primero y si se sigue cumpliendo entonces repite el bloque de codigo
    while (indice < nombre.length) {
        println("Indice: $indice")
        println("Letra en el indice: ${nombre.get(indice)}")
        indice++ // incrementamos, para que en algun punto, la condicion sea false y termine el bucle while
    }

    // ejecuta primero y despues evalua
    do { // ejecuta una vez el bloque de codigo y despues, verifica la condicion
        indice--
        println("indice: $indice")
        println("Letra en el indice: ${nombre.get(indice)}")
    } while (indice > 0)

}