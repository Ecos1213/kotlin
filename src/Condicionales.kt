fun main() {
    println("Sentencias condicionales")
    if (false) println("Condicion exitosa") //asi podemos colocar un if en una sola linea sin llaves pero solo peude ejecutar una operacion
    if (true) { // si (if) la condicion se cumple(boolean), entonces ejecuta la siguiente linea, o bloque de codigo {}
        println("Condicion exitosa")
        println(":)")
    }

    println("Operadores de igualdad")

    if (1 == 1)
        println("1 es igual a 1") // asi tambien podemos ejecutar un if podemos dejar el proceso en un salto de linea pero con sangria para que interprete que ese unico proceso se va a ejecutar

    val nombre = "Alain"
    if (nombre.equals("Alain")) // Con el metodo anidado equals podemos realizar una comparacion de string, donde la variable es igual que al texto que pasamos como parametro entonces devolvera true
        println("Es igual!")

    if (1 == 1) {
        println("Es igual a 1")
        if (1 == 2) {
            // no abusar de este tipo de estructuras
            println("No es igual")
        }
    }

    println("Operadores logicos")
    // not !, negacion una operacion logica, tambien se puede leer como diferente de
    if (1 != 2) println("1 es diferente de 2")

    // or || = uno u otro, con que una accion, sea valida entonces procedemos
    // true o true = true, true o false = true, false o true = true, false o false = false
    if (1 == 1 || 1 == 2) println("Al menos una condicion fue valida")

    //and && = si y solo si los 2 son positivo entonces procede..
    // true y true = true, true y false = false, false y true = false, false y false = false
    if (1 == 1 && 1 != 2) println("las dos condiciones fueron validas")


}