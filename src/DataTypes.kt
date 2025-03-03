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
    // el rango de byte es de 127 a -128
    val trabajo: Byte = 3 // Byte se usa para numeros pequeños
    print("Trabajos: ")
    println(trabajo)
    // con tipo de dato y MAX_VALUE nos dice el rango que tiene el tipo de dato y podemos darle ctrl y click para que intelijil nos envie a el valor de max_value y vemos que el maximo de byte es de 127
    val max = Byte.MAX_VALUE // y con MIN_VALUE nos da el rango mas pequeño del tipo dato y el de byte es -128
    // val max = Short.MAX_VALUE

    // el valor maximo de shor es 32767 y el menor es -32768
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
    print("Estatura real: ")
    println(estaturareal)

    println("Textos: ")
    // El tipo char solo permite colocar un caracter y se usa comillas simple para definir su valor, pero hay casos especiales como es \n
    val inicial1: Char = 'A'
    val inicial2: Char = 'N'
    val inicial3: Char = 'T'
    val casosespeciales: Char = '\n'
    print(inicial1)
    print(inicial2)
    print(inicial3)
    print(casosespeciales) // salto de linea

    val iniciales: String = "ANT" // los string se manejan en comillas dobles
    println(iniciales) // los strings en programacion como se ve en python y otros lenguajes los string es una cadena de caracteres
    val casosespecialescadenas: String = "\tA\'N\"T\\ \$ $" // en casos especiales podemos usar barra invertida y t colocamos tabulaciones y podemos colocar ciertos simbolos con barrita invertida
    println(casosespecialescadenas)



}