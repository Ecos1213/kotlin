package main

import (
	"fmt"

	"rsc.io/quote"
)

var estaFuera, estaDentro = true, false // se puede inicializar variables incluso afuerda de las funciones

func main() {
	fmt.Println("Hola Mundo")
	fmt.Println(quote.Hello())
	//Declaracion de variables
	var firstName string      // almacena cadena de caracteres, usamos la palabra reservada var para declarar una variable, las variables tienen que estar declaradas si no go no nos compilara incluso nos dara un error, ademas de esta forma se tiene que colocar el tipo de dato
	var edad, apellido string // en golang se puede hacer asignacion multiple como python, pero solo funciona si las variables van hacer del mismo tipo
	var age int

	var ( // asi tambien podemos declarar varias variables de diferente tipo, se puede asignar valores incluso dentro y despues pero recuerda que si no se asigna un valor dara un error
		dia, año string = "1", "2020" // incluso podemos declarar varias variables en una misma linea pero tiene que ser del mismo tipo
		mes      int    = 1
		esMayor         = true // tambien lo que podemos hacer es declarar la variable y a la vez asignar un valor sin su tipo de dato para que golang lo interprete pero esto solo lo podemos hacer si asignamos un valor si no nos dara un error
	)

	var identidad, telefono, correo, diaInicial = "123456", "3169035844", "diasflac1213@gmail.com", 22 // tambien podemos simplifcar mas la inicializacion y declaracion de variables como python

	firstName = "Alex"
	apellido = "Rodel"
	edad = "27"
	age = 27
	// en golang si no usamos una variable nos dara un error
	fmt.Println(identidad, estaFuera, estaDentro, telefono, correo, diaInicial, firstName, apellido, age, edad, dia, año, mes, esMayor) // asi podemos imprimir varias variables y es como python que deja un espacio

	// otra manera de inicializar las variables es de esta forma
	esPaco, cedula, celular := false, "1143829274", 11 //esta es la forma mas comun de declarar pero con la palabra var puedes declararla fuera de las funciones, mientras que el simbolo := que hace referencia a golang solo puede declarar variables de esta forma dentro de funciones
	celular = 3168035844
	fmt.Println(esPaco, cedula, celular)

}
