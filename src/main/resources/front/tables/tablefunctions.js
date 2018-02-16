$(document).ready(function () {
    $('.add').click(function () {
        $.ajax({
            contentType: 'application/json',
            url: "http://localhost:8080/table",
            type: 'POST',
            data: JSON.stringify({
                "height": document.getElementById("1").value,
                "width": document.getElementById("2").value,
                "lenght": document.getElementById("3").value,
                "shape": document.getElementById("4").value,
                "name": document.getElementById("5").value,
            }),
            dataType: 'json',
            success: alert("Pomyślnie dodano stół")
        }).then(function (data) {
        });
    });

    $('.del').click(function () {
        $.ajax({
            url: "http://localhost:8080/table/" + document.getElementById("deletion").value,
            type: 'DELETE',
            success: function(){
                if(!alert("Pomyślnie usunięto stół")){window.location.reload();}
            }
        }).then(function (data) {

        });
    });
});
