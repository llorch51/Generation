window.onload=function(){
    document.getElementById("btnMensaje").addEventListener("click",mostrarMensaje);
    document.getElementById("btnSumar").addEventListener("click",sumarNum);
    //loadPractica3();
    document.addEventListener("load",loadPractica3());
    document.getElementById("myform").addEventListener("focus",focusPractica3,true);
    //document.getElementById("myform").addEventListener("load",loadPractica3);
    document.getElementById("btnGenerarAle").addEventListener("click",generarAleatorios);
    //genera_tabla();
}

function mostrarMensaje(){
    var mensaje=document.getElementById("txtMensaje").value;
    alert(mensaje);
}
function sumarNum(){
    var num1 = parseInt(document.getElementById("txtNum1").value);
    var num2 = parseInt(document.getElementById("txtNum2").value);
    var num3=(num1+num2);
    document.getElementById("mostrarSuma").innerHTML=num3;
    //alert("La suma de los números es: "+(num1+num2));
}
function loadPractica3(){

    document.getElementById("txtNom").style.backgroundColor="red";
    document.getElementById("txtApellidoMat").style.backgroundColor="red";
    document.getElementById("txtApellidoPat").style.backgroundColor="red";
}
function focusPractica3(){


    var nom=document.getElementById("txtNom");//.style.backgroundColor="blue";
    var mat=document.getElementById("txtApellidoMat");//.style.backgroundColor="blue";
    var pat=document.getElementById("txtApellidoPat");//.style.backgroundColor="blue";
}
function generarAleatorios(){

    /*var numAle=parseInt(document.getElementById("txtNumAle").value);
    var tope=100;
    var bajo=0
    for(var i=0;i<numAle;i++){
        var random=Math.floor(Math.random() * (tope - bajo)) + bajo;
        //console.log("Consecutivos: "+(i+1)+" Aleatorios: "+random);
    }*/

    //function genera_tabla() {
        var numAle=parseInt(document.getElementById("txtNumAle").value);
        // Obtener la referencia del elemento body
        var body = document.getElementById("tablatabla")[0];
       
        // Crea un elemento <table> y un elemento <tbody>
        var tabla   = document.createElement("table");
        var tcabeza=document.createElement("thead");
        var tblBody = document.createElement("tbody");

        
        var tope=100;
        var bajo=0;
        // Crea las celdas
        for (var i = 0; i < numAle; i++) {
            var random=Math.floor(Math.random() * (tope - bajo)) + bajo;
          // Crea las hileras de la tabla
          var hilera = document.createElement("tr");
          
          for (var j = 0; j < 2; j++) {
            // Crea un elemento <td> y un nodo de texto, haz que el nodo de
            // texto sea el contenido de <td>, ubica el elemento <td> al final
            // de la hilera de la tabla
            var Cabeza=document.createElement("th");
            var textoCabeza=document.createTextNode("Puto");
            var celda = document.createElement("td");
            var textoCelda = document.createTextNode((i+1)+" "+random);
            Cabeza.appendChild(textoCabeza);
            celda.appendChild(textoCelda);  
            hilera.appendChild(celda);
          }
       
          // agrega la hilera al final de la tabla (al final del elemento tblbody)
          tblBody.appendChild(hilera);
        }
       
        // posiciona el <tbody> debajo del elemento <table>
        tabla.appendChild(tblBody);
        tabla.appendChild(tcabeza);
        // appends <table> into <body>
        tablatabla.appendChild(tabla);
        // modifica el atributo "border" de la tabla y lo fija a "2";
        tabla.setAttribute("border", "2");
      //}

}

