/**
 * 1 bit es la unidad basica del sistema informatico
 * 1 kb = 1024 bits = 2, 4, 8, 16, 32, 64 ,128, 256, 512, 1024 (2 elevado a la 10)
 * 1 Mb = 1024 kb
 * 1gb = 1024 Mb
 * 1 tb = 1024 Gb
 */

fun main() {
    println("Boolean")
    val soyInstructor = true //true = 1, false = 0
    print("soy instructor: ")
    println(soyInstructor)

    val soyChino: Boolean = false // en kotlin tambien podemos colocar el tipo dejar que lo interprete el codigo en este caso con : tipo de datos le decimos que va hacer de tipo booleano y en este caso no podemos colocar otro tipo porque nos dara error, asi como golang, python tenemos que asignarle un valor a la variables o nos dara un error
    print("soy de china: ")
    println(soyChino)
}