angular.module('appRouters', [])

    .config(['$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.when('', '/');

        $urlRouterProvider.otherwise('', '/');

        $stateProvider
            .state('home', {
                url: '/',
                params: {
                    param1: null
                },
                templateUrl: 'paginas/home.html',
                controller: 'homeController'
            })

            .state('morador',{
                url: '/morador',
                params: {
                    param1: null
                },
                templateUrl: 'paginas/morador.html',
                controller: 'moradorController'
            })

            .state('visitante',{
                url: '/visitante',
                params: {
                    param1: null
                },
                templateUrl: 'paginas/visitante.html',
                controller: 'visitanteController'
            })

            .state('funcionario',{
                url: '/funcionario',
                params: {
                    param1: null
                },
                templateUrl: 'paginas/funcionario.html',
                controller: 'funcionarioController'
            })

            .state('relatorio',{
                url: '/relatorio',
                params: {
                    param1: null
                },
                templateUrl: 'paginas/relatorio.html',
                controller: 'relatorioController'
            })
    }]);