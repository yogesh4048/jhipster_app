(function() {
    'use strict';

    angular
        .module('blogApp')
        .controller('StudentController', StudentController);

    StudentController.$inject = ['Student'];

    function StudentController(Student) {

        var vm = this;

        vm.students = [];

        loadAll();

        function loadAll() {
            Student.query(function(result) {
                vm.students = result;
                vm.searchQuery = null;
            });
        }
    }
})();
