$(document).ready(function () {
    $('.add').click(function () {
        $.ajax({
            contentType: 'application/json;charset=utf-8',
            url: "http://localhost:8080/sets",
            type: 'POST',
            data: JSON.stringify({
                "name": document.getElementById("nme").value,
                "chair_id": document.getElementById("chr").value,
                "table_id": document.getElementById("tbl").value
            }),
            success: function() {
                alert("Zestaw został pomyślnie dodany")
            },
            error: function(){
                alert("Coś poszło nie tak. Spróbuj ponownie");
            }
        }).then(function (data) {
        });
    });

    $('.del').click(function () {
        $.ajax({
            url: "http://localhost:8080/sets/" + document.getElementById("deletion").value,
            type: 'DELETE',
            success: function () {
                if (!alert("Pomyślnie usunięto zestaw")) {
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
