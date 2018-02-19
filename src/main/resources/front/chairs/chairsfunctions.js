$(document).ready(function () {
    $('.add').click(function () {
        $.ajax({
            contentType: 'application/json;charset=utf-8',
            url: "http://localhost:8080/chair",
            type: 'POST',
            data: JSON.stringify({
                "height": document.getElementById("hgh").value,
                "width": document.getElementById("wid").value,
                "color": document.getElementById("clr").value,
                "name": document.getElementById("nme").value
            }),
            success: function() {
                alert("Krzesło zostało pomyślnie dodane")
            },
            error: function(){
                alert("Coś poszło nie tak. Spróbuj ponownie");
            }


        }).then(function (data) {
        });
    });

    $('.del').click(function () {
        $.ajax({
            url: "http://localhost:8080/chair/" + document.getElementById("deletion").value,
            type: 'DELETE',
            success: function () {
                if (!alert("Pomyślnie usunięto krzesło")) {
                    window.location.reload();
                }
            },
            error: function(){
                alert("Coś poszło nie tak. Spróbuj ponownie");
            }
        }).then(function (data) {
        });
    });
});
