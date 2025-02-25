/*
En golang podemos usar el comando
go version #para mirar que version tenemos de golang
go env # para ver todas las caracteristicas y path que tiene golang
esto es importante porque sucede que si queremos trabajar con proyecto tenemos que dejarlo en el GOPATH
y si es la primera vez que instalamos golang tenemos que crear la carpeta go y dentro de go creamos la carpeta src
esta carpeta de go es importante porque aca estara todos los bins inclusos librerias externas como las librerias de golang
tambien si queremos trabajar solo con golang sin github tendriamos que crear esta carpeta aunque tambien podriamos trabajar con github

todas las extensiones de go es .go
*/
package main // con package le decimos a que paquete pertenece este archivo de go y en este caso tiene main y le estamos diciendo que este archivo pertenece al paquete main, este paquete main hace referencia que este archivo es el archivo principal, este archivo principal es el primero en ejecutarse
import "fmt" // asi importamos librerias internas de golang

func main() { // esta funcion main es la funcion principal es la funcion que se ejecuta primero
	fmt.Println("Hola Mundo") // para imprimir en consola con salto de linea usamos la funcion Println y esta viene del paquete fmt

}

// con go run nombrearchivo.go ejecutamos el archivo en la terminal
// con go build nombrearchivo.go construimos un bin o .exe para producion
