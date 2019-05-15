//Variables globales
var miVariable = 0;
var miVariable2 = "Hola";
var miVariable3 = 2.3;
var miVariable4 = true;
var miVariable5 = 'O';

/*alert(miVariable);
alert(miVariable2);
alert(miVariable3);
alert(miVariable4);
alert(miVariable5);
*/
var num1 = 0;
var num2 = 0;
var suma = 0;
//ventana emergente para introducir datos
num1 = prompt("Dame un número");
num2 = prompt("Dame otro número");
suma = parseInt(num1) + parseInt(num2);


if (isNaN(suma)) {
    console.log("No estés inventando cosas");
} else {
    console.log("La suma es: " + suma);
}
//variables locales dentro de funciones
for (var i = 0; i < 10; i++) {
    console.log("" + i);
}

var dia = 0;
dia = parseInt(prompt("Introduce num de 1-7"));
switch (dia) {
    case 1:
        alert("Lunes");
        break;
    case 2:
        alert("Martes");
        break;
    case 3:
        alert("Miércoles");
        break;
    case 4:
        alert("Jueves");
        break;
    case 5:
        alert("Viernes");
        break;
    case 6:
        alert("Sábado");
        break;
    case 7:
        alert("Domingo");
        break;
    default:
        alert("no mms!!");
}

