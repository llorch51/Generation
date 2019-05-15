//console.log(HolaMundo());
//saludituu("Hola hola hola!!!");
//console.log(suma(10,20));
//var num1=parseInt(prompt("Introduce un número"));
//console.log(isPrimo(num1));


//********************PAR o IMPAR ***************************/
var num1=0;
var contadorPar=0;
var contadorImpar=0;
var contadorNAN=0;
var miArray = new Array(num1);
num1=parseInt(prompt("Cuantos números en array?"))
for(var i=0;i<num1;i++){
    miArray[i]=prompt("Introduce #"+(i+1));

    if(miArray[i]%2==0){
        contadorPar++;
    }else{
        contadorImpar++;
    }
     if(isNaN(miArray[i])){
        contadorNAN++;
    }
}
console.log(miArray);
console.log("Hay "+contadorPar+" Pares, "+contadorImpar+" Impares y "+contadorNAN+" NaN");

/****************FACTORIAL*************************/
var fac=1;
num1=parseInt(prompt("Introduce número: "));
for(var i=num1;i>0;i--){
    fac=fac*i;
}
console.log("El factorial de "+num1+" es "+fac);


/*
for(var i=0;i<miArray.length;i++){
    console.log(miArray[i]);
}*/




function HolaMundo(){
    return "Hola Mundo";
}

function saludituu(mensaje){
    console.log(mensaje);
}
function suma(num1,num2){
    return num1+num2;
}

function isPrimo(num1){
    var isprimo=true;
    for(var i=num1-1;i>1;i--){
        if(num1%i==0){
            isprimo=false;
        }
    }
    return isprimo;
}
