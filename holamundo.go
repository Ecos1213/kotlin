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
//import "fmt" // asi importamos una libreria interna de golang
import ( // asi importamos multiples librerias internas como externas de golnag
	"fmt"

	"rsc.io/quote" // como vemos para importar una libreria externa simplemente colocamos toda nuestra ruta externas despues de usar go get
)

func main() { // esta funcion main es la funcion principal es la funcion que se ejecuta primero
	fmt.Println("Hola Mundo")  // para imprimir en consola con salto de linea usamos la funcion Println y esta viene del paquete fmt
	fmt.Println(quote.Hello()) // ahora podemos invocar metodos de nuestra libreria externa
}

// con go run nombrearchivo.go ejecutamos el archivo en la terminal
// con go build nombrearchivo.go construimos un bin o .exe para producion

// para poder usar paquetes de terceros necesitamos un inicializador de paquetes,
// con go mod init nombreconquevamosamanejarlosmodulos #inicializamos el manejador de paquetes
// esto creara un archivo llamado go.mod este contiene module nombreconquevamosamanejarlosmodulos este es el nombre del manejador de modulo y aparece la version de golang
// cuando empezemos a trabajar con los archivos externos tambien aparecera un archivo que es go.sum, este es un archivo que se utiliza para la suma de verificacion de los modulos y dependencias de nuestro proyecto

//si queremos descargar un paquete usamos el siguiente comando
// go get rutadelrepositoriodelpaquete
//este repositorio puede estar en github o rsc el go get esto descargara el repositorio y se encargara de configurarlo todo, incluso lo agregara automaticamente al manejador de modulos osea go.mod

// instalamos go get rsc.io/quote quote lo que hace es un paquete con las frases mas famosas
// si vemos el go.mod veremos que dice require() y dentro de require veremos que estan los paquetes que agrego go get
