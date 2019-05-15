
// **********************************AJAX nivel 1
 
var xhr =new XMLHttpRequest();
window.onload=function(){
    
    document.getElementById("btnAceptar").addEventListener("click",mySubmit);
    
}

function mySubmit(){
    //Nivel 1 AJAX
    //Preparo mis datos
    var nombre=document.getElementById("txtNombre");
    var miform=new FormData();
    //primer parámetro de append debe ser igual en el servlet getParameter("txtNombre")
    miform.append("txtNombre",nombre.value);

    //Preparo mi proceso asíncrono
    xhr.onreadystatechange=callback;
    //alert("Tu nombre es: "+nombre.value);
    xhr.open("post","Practica2Servlet",true);
    xhr.send(miform);
}

function callback(){
    if(xhr.readyState==4 && xhr.status==200){
        document.getElementById("divResultado").innerHTML=xhr.responseText;
    }
}