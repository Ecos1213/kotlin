// fun = palabra reservada para las funciones
// main = funcion principal necesaria para ejecutar kotlin
// print = es una funcion interna que imprime un dato en consola
// \n diagonal invertida es salto de linea
// val = variable de solo lectura e inmutable
// println() = imprime un dato y añade al final un salto de linea
// var = variable de lectura y escritura (mutable)
fun main() { // para poder ejecutar codigo principal puro necesitamos una funcion principal, por eso declaramos la funcion main con la palabra reservada fun
    print("Daniel") // print se puede invocar sin necesidad de librerias ya que esta en el estandard de la libreria de kotlin

    print("\n") // podemos hacer saltos de lineas imprimiendo estos caracteres especiales

    // existe dos formas de declarar una variable, una es de solo lectura y es inmutable y la otra es de lectura y mutable
    val fechaNacimiento = "18 de junio de 1990"// esta forma de declarar la variable es de solo lectura y es inmutable, una vez asignada la variable no podra modificarse, estas variables existe para varaibles que no necesiten modificarse como por ejemplo fecha de nacimiento
    //fechaNacimiento = "21 de junio 2025" // esto da error porque es inmutable
    print(fechaNacimiento)

    println()

    var edad = "35 años"// con var podemos declarar una variable que es mutable y de lectura, podemos modificarla infinitamente
    edad = "36 años" // se puede reasignar su valor gracias a que se delcaro con var
    println(edad) // ten encuenta que los println tienen un problema y es que su salto de linea viene despues osea que primero coloca la edad y despues el salto de linea, por eso toca dejarle un println antes de esta linea
}