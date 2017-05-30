jQuery('#btn2').click(function(){
    var name = $('#InputName').val();
    var email = $('#InputEmail').val();
    console.log(name);
    var markup = "<tr><td>" + name + "</td><td>" + email + "</td></tr>";

    $('#table1').find('tbody').append(markup);
});