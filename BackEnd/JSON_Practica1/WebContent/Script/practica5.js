window.onload=function(){
    var misVerduras=["platano","pepino","berenjena","caña"];

    var misVerdurasJson=JSON.stringify(misVerduras);

    console.log(misVerduras);
    console.log(misVerdurasJson);

    //ejercicio para convertir una cadena a Json 
    var miCadena=
    "{\" nombre\":\"Amy\","+
    "\"apellidoPaterno\":\"Luis\","+
    "\"apellidoMaterno\":\"Martinez\","+
    "\"domicilio\":\"Zapopan\","+
    "\"edad\":\33\,"+
    "\"sexo\":\"femenino\","+
    "\"estatura\":\1.60\,"+
    "}";

miCadenaObj=JSON.parse(miCadena);
console.log(miCadena);
console.log(miCadenaObj);

}