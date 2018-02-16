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
            dataType: 'json'
        }).then(function (data) {
        });
    });
});
