/**
 * Created by shian_mac on 8/16/15.
 */
'use strict';

var AngularSpringApp = {};

var App = angular.module('AngularUserManagementApp', []);

// Declare app level module which depends on filters, and services

App.controller('GreetingController', ['$scope', '$http', function($scope, $http) {
	$scope.greeting = 'hello';
	$scope.test1 = 'test1';
	$http.get('/index').
		then(function(response) {
			$scope.test2 = 'success';
			$scope.data = response.data;
		},
		function(response) {
			$scope.test3 = 'error';
			$scope.error = response.data;
		});
}]);


