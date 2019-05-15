window.onload=function(){
    document.getElementById("txtNum1").focus();

    var miParrafo=document.getElementById("pLorem");
    miParrafo.addEventListener("click",mandarFormulario);
}

function mandarFormulario(){
    alert("Se dio click en el párrafo");
    var miFormulario=document.forms["loquesea"];
    miFormulario.submit();
}
