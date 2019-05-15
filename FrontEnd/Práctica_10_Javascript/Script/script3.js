var arreglo=new Array();
var contVoc=0;
var contEsp=0;
arreglo=prompt("Introduzca la frase:");

for(var i=0;i<=arreglo.length;i++){
    if(arreglo.charAt(i).toLowerCase()=='a' || arreglo.charAt(i).toLowerCase()=='e' || arreglo.charAt(i).toLowerCase()=='i'
    || arreglo.charAt(i).toLowerCase()=='o' || arreglo.charAt(i).toLowerCase()=='u'){
            contVoc++;
    }
    if(arreglo.charAt(i).toLowerCase()=='.' || arreglo.charAt(i).toLowerCase()==',' || arreglo.charAt(i).toLowerCase()==';' 
    || arreglo.charAt(i).toLowerCase()==':' || arreglo.charAt(i).toLowerCase()=='!' || arreglo.charAt(i).toLowerCase()=='@'){
            contEsp++;
    }
}
console.log(devolver());



function devolver(){
    return "Hay "+contVoc+" vocales y "+contEsp+" caracteres especiales";
}