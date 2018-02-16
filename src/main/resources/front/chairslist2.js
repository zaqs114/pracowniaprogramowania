function arrayToTable(tableData) {
    var table = $('<table></table>');
    $(tableData).each(function (i, rowData) {
        var row = $('<tr></tr>');
        $(rowData).each(function (j, cellData) {
            row.append($('<td>'+cellData+'</td>'));
        });
        table.append(row);
    });
    return table;
}

$(document).ready(function () {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/chair",
        dataType: 'json',
        success: function (data) {
            $('table').append(arrayToTable(data));
        }
    });
});

$.ajax({
    type: "GET",
    url: "http://localhost:8080/chair",
    dataType: 'json',
    success: function (data) {
        ("#dataTable").jsonTable({
            head: ['id', 'height', 'width', 'color', 'name'], // Goes on the <thead>
            json: ['id', 'height', 'width', 'color', 'name'] //json identities from the loaded json object
        });
        $("#dataTable").jsonTableUpdate(data);
    }