$(document).ready(function(){
    init()

});

function init(){
    $("b").click(function(){
        var idValue=$("#id").val();
        var adressValue=$("#adress").val();
        var descriptioValue=$("#description")
        var obj={
            id: idValue,
            adress: adressValue
        }
        var request={
            type:"POST",
            url:"http://localhost:8080/registration",
            data:JSON.stringify(obj),
            success:function(returnval){
                console.log(returnval);
            },
            contentType:'application/json',
        }
        $.ajax(request);
    });
}
