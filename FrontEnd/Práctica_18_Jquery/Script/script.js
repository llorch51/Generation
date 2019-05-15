// $(document).ready(
//     function(){
//         alert("testo en Jquery");
//         $("#primero").hide();
//         $(".tercero").hide();
//     }
// );

$(
    function(){
        alert("testo en Jquery");
        $(".botoncitos").click
        (
            function()
            {
                alert("mi testo");
            }
        )
        $("#btnBoton1").click(msgOtroTesto);
        $("#btnBoton3").click(msgOtroTesto);
    }
)
function msgOtroTesto(){
    alert("Otro testo");
}

