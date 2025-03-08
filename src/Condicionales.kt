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

    println("Operadores de comparacion y sentencia if-else")
    val a = 16
    val b = 10
    //menor que b
    if (a < b) println("A es menor que B")
    // mayor que b
    if (a > b) println("A es mayor que B")
    val c = 15
    // mayor igual a c
    if (a >= c) println("A es mayor o igual que C")

    //menor igual a c
    if (a <= c) println("A es menor o igual que C") // tambien con else podemos escribir en una sola linea tanto el if como el else
    else println("A es mayor que c")

    if (a < b) { // si esto se cumple
        println("A es menor que B")
    } else if (a > b) { //o si esto se cumple. asi se crea un else if en kotlin
        println("A es mayor que B")
    } else { // si no entonces
        println("A es igual que B")
    }

    println("Sentencia When")
    println("Para consultar tu saldo, ingresa tu tarjeta: ")
    // la expresion when sirve para ocasiones de seleccion multiple
    val tarjeta = readln()
    // el when es muy parecido al switch case e incluso si no encuentra el resultado no mostrara nada a menos que tengamos un default que es en este caso el else
    when(tarjeta) { // cuando(when) lo evaluado(tarjeta) coincida con alguna opcion, ejecuta el codigo correspondiente -> ....
        "001" -> println("$10.0 USD")
        "011" -> println("$11.0 USD")
        "201" -> println("$210.0 USD")
        "300", "301" -> println("$130.0 usd") // si un caso muestra lo mismo para no repetir otra linea de codigo con el mismo resultado lo que podemos hacer es colocar varias comparaciones en una misma linea separados con coma como el ejemplo
        "320" -> { // e incluso podemos colocar un bloque de codigo, para que ejecute to_do lo que hay dentro del bloque de codigo
            println("$21.0 usd")
            println("$10.0 usd")
        }
        // si no coincide con nada, entonces ejecuta el caso else(default)
        else -> println("Tarjeta no encontrada") // el else en when es el default de switch case
    }

}