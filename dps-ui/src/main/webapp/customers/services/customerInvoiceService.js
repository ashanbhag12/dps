var customerInvoiceApp = angular.module('customerInvoiceApp');

customerInvoiceApp.factory('getCustomersForInvoiceService', function ($resource) {
    return $resource('http://localhost:8080/dps-web-service-0.0.1/rest/customer/find');
})

.factory('getProductsForInvoiceService', function ($resource) {
    return $resource('http://localhost:8080/dps-web-service-0.0.1/rest/product/find');
})

.factory('getSuppliersForInvoiceService', function ($resource) {
    return $resource('http://localhost:8080/dps-web-service-0.0.1/rest/supplier/find');
})

.factory('buildInvoiceCalculateService', function ($resource) {
    return $resource('http://localhost:8080/dps-web-service-0.0.1/rest/bill/calculate');
})

.factory('imageInvoiceService', function ($resource) {
    return $resource('http://localhost:8080/dps-web-service-0.0.1/rest/customerorder/lastimginv');
})

.factory('pdfInvoiceService', function ($resource) {
    return $resource('http://localhost:8080/dps-web-service-0.0.1/rest/customerorder/lasttxtinv');
});