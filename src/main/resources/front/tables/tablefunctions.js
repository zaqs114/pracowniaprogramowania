$(document).ready(function () {
    $('.add').click(function () {
        $.ajax({
            contentType: 'application/json',
            url: "http://localhost:8080/table",
            type: 'POST',
            data: JSON.stringify({
                "height": document.getElementById("hgt").value,
                "width": document.getElementById("wid").value,
                "lenght": document.getElementById("lgt").value,
                "shape": document.getElementById("shp").value,
                "name": document.getElementById("nme").value
            }),
            success: function(){
                alert("Stół został pomyślnie dodany");
            },
            error: function(){
                alert("Coś poszło nie tak. Spróbuj ponownie");
            }
        }).then(function (data) {
        });
    });

    $('.del').click(function () {
        $.ajax({
            url: "http://localhost:8080/table/" + document.getElementById("deletion").value,
            type: 'DELETE',
            success: function(){
                if(!alert("Pomyślnie usunięto stół")){window.location.reload();}
            },
            error: function(){
                alert("Coś poszło nie tak. Spróbuj ponownie");
            }
        }).then(function (data) {

        });
    });
});
