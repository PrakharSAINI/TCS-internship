'use strict'

var app = angular.module("myapp", [])

app.controller('Formctrl', function($scope){
    $scope.tablebutton= function() {
        var name = $scope.name;
        var email = $scope.email;
        console.log(name);
        var markup = "<tr><td>" + name + "</td><td>" + email + "</td></tr>";
        jQuery('#table1').find('tbody').append(markup);
    }

});

// jQuery('#btn2').click(function(){
//     var name = $('#InputName').val();
//     var email = $('#InputEmail').val();
//     console.log(name);
//     var markup = "<tr><td>" + name + "</td><td>" + email + "</td></tr>";

//     $('#table1').find('tbody').append(markup);
// });