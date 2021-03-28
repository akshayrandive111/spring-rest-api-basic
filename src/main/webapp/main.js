angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('http://localhost:8080/RESTfullApp/webresources/hello').
        then(function(response) {
            $scope.greeting = response.data;
        });
});