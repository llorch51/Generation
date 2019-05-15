var xhr=new XMLHttpRequest();

window.onload=function(){
    alert(".l.");
    document.getElementById("btnPressMe").addEventListener("click",procesaAjaxL2);
   
}

function procesaAjaxL2(){
    xhr.open("get","resultado.html");
    xhr.onload=funcionCallBack;
    xhr.send(null);
}

function funcionCallBack(){

    if(xhr.status==200){
        console.log("Petición procesada con éxito");
        document.getElementById("divResultado").innerHTML=xhr.responseText;
    }

}