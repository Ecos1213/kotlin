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

    println("Entrada de datos(readline): ")
    val nombre = readln() // la funcion readln sirve para tomar la entrada de datos por consola del usuario, esto puede llevar como argumento un string para mostrar en consola, entrada de datos de datos
    println(nombre)
    println("Concatenacion: ")
    println("Hola " + nombre) // en kotlin podemos concatenar los textos con +, juntar 2 o mas cadenas de caracteres

    println("String Templates: ") // para concactenar strings de forma optimizada
    // string tamplates es la manera mas moderna para concatenar cadenas de texto pero totalmente optimizado
    println("Hola $nombre!") // con signo de pesos y la variable podemos concatenar en el texto a esto se le llama string templates
    val longitud = nombre.length // toma la cantidad de caracteres de una cadena, esto lo veremos mas adelante a detalle
    println("longitud: $longitud") // requiere el simbolo de $ antes de llamar a la variable

    // encapsular en caso de acceder a propiedades o funciones con {}
    println("Longitud: ${nombre.length}") // como es un proceso que saca la cantidad de caracteres tenemos que cubrirlo con llaves {} despues del signo $

    println("Multiline String: ") // Raw String
    val lineasmultiples: String = """
        Hola, estoy "escribiendo"
                con sangria!
    """ // de esta forma como en python podemos crear un string con multilineas
    println(lineasmultiples) // Multilines string permite cadenas de texto con formato o estilos mas completos
    /*
    * esta es una de las caracteristicas mas importante de kotlin que son los nullable
    * su antecesor java tiene problemas con ello y no en la compilacion, en un programa en su ejecucion puede aparecer
    * una variable nullable ( osea quede vacia) y sucede que da un error critico y esto genera problemas por eso es una de las mejores
    * caracteristicas que tiene kotlin y el problema es que los nullables puede ser un texto o un numero o culquier tipo de dato
    * */

    print("Nulos en kotlin: ")
    // siempre que algo puede ser nulo debe ser marcado con signo ?
    var ganancia: Int? = null // para que kotlin acepte tipo de datos nulos donde definimos el tipo de dato tenemos que darle un signo de pregunta al final del tipo de dato y entendera que esto puede ser nulo, esto lo hacemos como ejemplo
    println("Salario: $ganancia") // aca no sucedera algun error solo mostrara null
    var nombredeusuario: String? = null
    //println("Longitud de nombre de usuario ${nombredeusuario.length}") // Esto dara error porque al ser null no pude sacar la longitud de caracteres o de array en estos casos tenemos que verificar si es null o no
    // el simbolo de ? al lado de la variable signficia que l oque esta a la derecha no se ejecutara si es null
    println("Longitud de nombre de usuario ? ${nombredeusuario?.length}") // Para que no suceda el error podemos decirle que esa variable puede ser null al final de la variable podemos colocarle un signo de pregunta

    // una forma de evitar el caso de error con !! es simplemente asignandole una variable que este definido con un string
    var apellido: String = null!!
    var nombreRandom: String? = "CursosANT"
    // estamos asegurandole a kotlin que la variable no sera null, esto quiere decir que esta bajo nuestra responsabilidad
    apellido = nombreRandom!! // aca le estamos diciendo igual que esto no va a ser null y si llega a ser null muestre un mensaje de error
    println("Longitud de nombre de usuario con !! ${apellido.length}") // aca parara el programa por que dara un error debido al simbolo !!

    var apellidousuario: String = null!! // aca le estamos diciendo que si o si esto no va a ser null y si es null que ejecute un error y pare el programa eso significa los dos simbolso de !!
    println("Longitud de nombre de usuario con !! ${apellidousuario.length}") // aca parara el programa por que dara un error debido al simbolo !!
}
