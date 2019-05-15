var temporal=0;
window.onload=function(){

    var miBotoncito=0;
    miBotoncito=document.getElementById("btnBoton");
    miBotoncito.addEventListener("click",miFuncion);

    document.getElementById("btnBorrar").addEventListener("click",borrarTexto);
    document.getElementById("btnBack").addEventListener("click",regresar);
    document.getElementById("btnRojo").addEventListener("click",cambiarRojo);
    document.getElementById("btnAparecer").addEventListener("click",aparecerText);
}

function miFuncion(){
    console.log("Diste en elbotón");
}
function borrarTexto(){
    temporal=document.getElementById("parrafo").innerHTML;
    document.getElementById("parrafo").innerHTML="Se borró,putín!!";
}
function regresar(){
    document.getElementById("parrafo").innerHTML=window.location.reload(false);
}
function cambiarRojo(){
    document.getElementById("parrafo").style.backgroundColor="red";
}
function aparecerText(){
    document.getElementById("parrafo").innerHTML=temporal;
}