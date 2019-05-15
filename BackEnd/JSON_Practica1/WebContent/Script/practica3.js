//****************************************** */AJAX nivel 2

//objeto AJAX
var xhr =new XMLHttpRequest();

window.onload=function(){
//evento a boton
    document.getElementById("btnAceptar").addEventListener("click",mySubmit);
}

function mySubmit(){
    //Nivel 2 AJAX
    //Preparo mis datos
    //.value porque es por metodo GET, no se hace objeto FORM
     var nombre=document.getElementById("txtNombre").value;
     var apellidoPat=document.getElementById("txtApellidoPat").value;
     var apellidoMat=document.getElementById("txtApellidoMat").value;
     var domicilio=document.getElementById("txtDomicilio").value;
     var edad=document.getElementById("txtEdad").value;
     var sexo=document.getElementById("txtSexo").value;
     var estatura=document.getElementById("txtEstatura").value;
 

     xhr.open("get","Practica3Servlet?txtNombre="+nombre+"&txtApellidoPat="+apellidoPat+"&txtApellidoMat="+apellidoMat+
     "&txtDomicilio="+domicilio+"&txtEdad="+edad+"&txtSexo="+sexo+"&txtEstatura="+estatura);
     xhr.onload= callback;
     xhr.send(null);
}
function callback(){
    if(xhr.status==200){
        document.getElementById("divResultado").innerHTML=xhr.response;
    }
}