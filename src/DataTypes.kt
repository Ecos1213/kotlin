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

    //Enteros
    println("Enteros: ")
    val trabajo: Byte = 3 // Byte se usa para numeros pequeños
    print("Trabajos: ")
    println(trabajo)

    val diastrabajados: Short = 500 // Short se usa para numeros un pocos mas largos que Byte
    print("Dias trabajados: ")
    println(diastrabajados)

    val minutostrabajados: Int =  300_430 // como python podemos separar los enteros con un _ para hacerlos mas legibles de grupos en 3 en 3, el Int es el tipo de dato entero mas usado y se usa para ints medianos
    print("Minutos trabajdos: ")
    println(minutostrabajados)

    val segundostrabajados: Long = 200_000_000_000L //el long se usa para grandes cantidades de enteros, este hace algo parecido con el float, para el float se coloca una f minuscula para indicarle que el dato es float pero para el long es opcional y tenemos que colocar una l mayuscula
    print("Segundos trabajados: ")
    println(segundostrabajados)

    println("Decimales: ")
    val estatura: Float = 1.75f // el float se usa para puntos decimales medianos y el float el dato tiene que ir al final una f para indicarle que es un decimal float
    print("Estatura: ")
    println(estatura)

    val estaturareal: Double = 1.733_333_333_333// el double se usa para puntos decimal muchos mas grandes, sirve para tener mas precision y ademas como el float el dato tiene que tener una d para decirle que ese dato es double
}