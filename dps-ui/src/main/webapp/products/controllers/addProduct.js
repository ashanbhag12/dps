angular.module('addProductApp', ['ngMessages'])
        .controller('addProductController', function ($scope, addProductsService) {
            $scope.showSuccessBox = true;
            $scope.showErrorBox = true;
            // WebService should be called to fetch initials for Suppliers
            $scope.allSupplierInitials = ['aa','bb'].map(function (initial) { return { abbrev: initial }; });

            $scope.product = {                	
            		productCode:"",
            		cartoonQuantity:"",
            		cbm:"",
            		price:"",
            		weight:"",
            		description:"",
            		moq:"",
            		defaultMargin:"",
            		supplierInitials:"",
            		supplierProductCode:"",
            		isValid:"no"
            };

            $scope.submitForm = function (addProduct) {
                if (addProduct.$valid) {
                	$scope.productJson = angular.toJson($scope.product);
        		    //alert($scope.productJson);
        		    response = addProductsService.save($scope.productJson);
        		    //alert(response);
        		    $scope.reset();
                }
                else{                    
                    console.log("form invalid");
                }                
            };

            $scope.reset = function () {
                $scope.product = {};
                $scope.product.isValid="no";
                $scope.addProduct.$setPristine();
                $scope.addProduct.productCode.$touched = false;
                $scope.addProduct.cartoonQuantity.$touched = false;
                $scope.addProduct.cbm.$touched = false;
                $scope.addProduct.price.$touched = false;
                $scope.addProduct.weight.$touched = false;
                $scope.addProduct.description.$touched = false;
                $scope.addProduct.moq.$touched = false;
                $scope.addProduct.defaultMargin.$touched = false;
                $scope.addProduct.supplierInitials.$touched = false;
                $scope.addProduct.supplierProductCode.$touched = false;
                $scope.addProduct.isValid.$touched = false;
                $scope.showSuccessBox = false;
            };
        });