$(document).ready(function(){
    $.get("http://localhost:8080/chair", function(data, status){
        $('.chair-id').html("The ID is " + data.id);
        $('.chair-height').html("The userName is " + data.userName);
        $('.chair-width').html("The firstName is " + data.firstName);
        $('.chair-color').html("The lastName is " + data.lastName);
        $('.chair-name').html("The emailAddress is " + data.emailAddress);
    });
});
