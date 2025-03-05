fun main() { // recuerda cualquier numero puede ser convertido en otro tipo de numero, enteros a decimales
    println("Conversiones de numeros: ")
    val a: Byte = 10
    val b: Int = 5
    val c: Long = 20L
    // si intentamos darle un tipo de dato que no es de esta variable aparecera un error en este caso intentamos pasarle un byte a un long en algunos casos vamos a tener que convertir de un tipo de dato a otro y podemos convertir de ciertos tipos a otros tipos de datos, incluso podemos converter de un tipo de dato numerico a otro tipo de dato numerico
    var resultado: Long = a.toLong() // para poder convertir de byte a long simplemente podemos darle .toLong() este metodo nos convertira de byte a long a esto se le llama casteo
    var resultado2: Long = b.toLong() // incluso podemos hacerlo con los enteros, si no hacemos el caste a long nos dara error
    println(resultado)
    println(resultado2)

    var d: Double = 12.54
    resultado = d.toLong() // en algunos casos hay que tener cuidado porque se perdera la informacion por ejemplo en este caso se perdera el .54 debido que transformo un decimal a un entero y solo dejara el entero 12 por eso a veces tenemos que decidir si ser precisos o no
    println(resultado)
    println(a.toFloat()) // en otros casos al convertir un entero en este caso de un byte a float lo que hara es asignarle un decimal y le asigna un .0

    val numerotexto: String = "6.4"
    println(numerotexto.toDouble()) // en este caso el texto podra convertirse de un texto a numero debido a que el string tiene un numero pero si colocamos un texto o algo que no sea numero o decimal este nos dara un error

    /*val numerotexto2 = "6.4tar"
    println(numerotexto2.toDouble()) // esto dara error debido a que el texto tiene un contenido no solo de numeros si no tambien texto, lo cual el casteo a cualquier tipo de dato numerico sea decimal o numero el texto tiene que ser solo numeros o decimales
    */

    println("Operadores matematicos.\nInserte un numero: ")
    val x = readln()
    println("Inserte otro numero")
    val y = readln()

    var numerox = x.toInt()
    val numeroy = y.toInt()

    println("x + y = ${numerox + numeroy}") // suma
    println("x - y = ${numerox - numeroy}") // resta
    println("x * y = ${numerox * numeroy}") // multiplicacion
    println("x / y = ${numerox / numeroy}") // division
    println("x % y = ${numerox % numeroy}") // modulo

    println("Operadores con tareas aumentadas.")
    numerox += numeroy // lo mismo que: numerox = numerox + numeroy
    println("x + y = $numerox")
    numerox *= numeroy // y sirve para cualquier operador
    println("x * y = $numerox")
    numerox /= numeroy
    println("x / y = $numerox")
    numerox -= numeroy
    println("x - y = $numerox")
    numerox %= numeroy
    println("x % y = $numerox")

}