$(document).ready(function () {
    $.get("http://localhost:8080/chair", function (data) {
        var tbl_body = "";
        var odd_even = false;
        $.each(data, function () {
            var tbl_row = "";
            $.each(this, function (k, v) {
                tbl_row += "<td>" + v + "</td>";
            })
            tbl_body += "<tr class=\"" + (odd_even ? "odd" : "even") + "\">" + tbl_row + "</tr>";
            odd_even = !odd_even;
        })
        $("table").html(tbl_body);
    });
});