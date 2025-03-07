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
}