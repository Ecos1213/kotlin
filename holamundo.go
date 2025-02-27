package main

import (
	"fmt"

	"rsc.io/quote"
)

// Las constantes en go podemos declararlas de igual manera dentro de una funcio de go o fuera de ellas si la declaramos fuera de ellas, quedan declaradas como constantes de paquete osea que podemos incluso usarlos en otros archivos de go
const pi float32 = 3.14 // recuerda que los constantes no se pueden modificar o dara un error
// los constantes pueden ser de cualquier tipo de dato e incluso podemos declararlo de la siguiente forma
const PI = 3.14 // y go interpretara que es un float32
// Recuerda que las constantes son sensibles a minusculas y mayusculas osea que una variable en mayusculas no sera lo mismo que una variable en minusculas
// las constantes no necesitan imprimirse o usarse, no nos dara un error a cambio las variables si

// asi como var podemos declarar varias constantes
const (
	//las constantes puede tener valores desde numeros hasta octales o binarios
	x = 100
	y = 0b1010 //binario
	z = 0o12   //octal
	w = 0xFF   //hexadecimal
)

const ( // recuerda que las constantes se debe declarar cuando los valores no son cambiante si son cambientes declara mejor una variable, y lo otro es que si queremos colocar los dias de la semana y darle un numero de 1 a 7 dias de la semana podemos usar algo llamado iota que lo que hace es que iota comienza la primera variable en 0 (podemos sumarle un numero y comnenzara de ahi en adelante) y comenzara de ahi en adelante a asignarle un valor segun el iota o la suma del iota por ejemplo:
	Lunes = iota + 1 // como iota vale 0 al sumarle 1 empezara a asignarle un valor desde 1, por ende domiengo sera 7
	Martes
	Miercoles
	Jueves
	Viernes
	Sabado
	Domingo
)

var estaFuera, estaDentro = true, false

func main() {
	fmt.Println("Hola Mundo")
	fmt.Println(quote.Hello())

	//Declaracion de variables
	var firstName string
	var edad, apellido string
	var age int

	var (
		dia, año string = "1", "2020"
		mes      int    = 1
		esMayor         = true
	)

	var identidad, telefono, correo, diaInicial = "123456", "3169035844", "diasflac1213@gmail.com", 22

	firstName = "Alex"
	apellido = "Rodel"
	edad = "27"
	age = 27

	fmt.Println(identidad, estaFuera, estaDentro, telefono, correo, diaInicial, firstName, apellido, age, edad, dia, año, mes, esMayor)

	esPaco, cedula, celular := false, "1143829274", 11
	celular = 3168035844
	fmt.Println(esPaco, cedula, celular)
	fmt.Println(x, y, z, Domingo)
}
