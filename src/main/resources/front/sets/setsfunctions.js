$(document).ready(function () {
    $('.add').click(function () {
        $.ajax({
            contentType: 'application/json',
            url: "http://localhost:8080/sets",
            type: 'POST',
            data: JSON.stringify({
                "chair_id": document.getElementById("1").value,
                "table_id": document.getElementById("2").value,
                "set_id": document.getElementById("3").value,
            }),
            dataType: 'json',
            success: alert("Pomyślnie dodano zestaw")
        }).then(function (data) {
        });
    });

    $('.del').click(function () {
        $.ajax({
            url: "http://localhost:8080/sets/" + document.getElementById("deletion").value,
            type: 'DELETE',
            success: function(){
                if(!alert("Pomyślnie usunięto zestaw")){window.location.reload();}
            }
        }).then(function (data) {

        });
    });
});