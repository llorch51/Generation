window.onload=function(){
    var miBotoncitoMatar=0;
    miBotoncitoMatar=document.getElementById("btnmatar");
    console.log(miBotoncitoMatar);
    miBotoncitoMatar.onclick=mensajematar;

    document.getElementById("divParrafo").onmouseenter=mensajeConsola;

    document.getElementById("divParrafo").onmouseleave=function(){
        console.log("Saliste del div");
    }

    document.getElementById("divParrafo").ondblclick=()=>{
        console.log("diste doble click!!");
    }


}

function mensajematar(){
    alert("patria o muerte!!")
}

function mensajeConsola(){
    console.log("Entraste al div!");
}




//Jquery con función flecha
$(()=>
{
    alert("testoo!!")
})


/*Forma Jquery
$(function(){
    alert("testo!!");
});
*/

/*Función flecha ECMAscript6
window.onload=()=>{
    alert("testo!!");
}
*/


/* Método clásico
window.onload=function(){
    alert
}
*/
/*
método vieja escuela
window.onload=main();

function main(){
    alert("Testo!!!");
}
*/