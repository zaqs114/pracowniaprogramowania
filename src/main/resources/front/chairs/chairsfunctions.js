$(document).ready(function () {
    $('.add').click(function () {
        $.ajax({
            contentType: 'application/json',
            url: "http://localhost:8080/chair",
            type: 'POST',
            data: JSON.stringify({
                "height": document.getElementById("1").value,
                "width": document.getElementById("2").value,
                "color": document.getElementById("3").value,
                "name": document.getElementById("4").value,
            }),
            dataType: 'json',
            success: alert("Pomyślnie dodano krzesło")
        }).then(function (data) {
        });
    });

    $('.del').click(function () {
        $.ajax({
            url: "http://localhost:8080/chair/" + document.getElementById("deletion").value,
            type: 'DELETE',
            success: function(){
                if(!alert("Pomyślnie usunięto krzesło")){window.location.reload();}
            }
        }).then(function (data) {

        });
    });
});
