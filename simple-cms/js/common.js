var zuul_server = {
    url: 'http://localhost/jwt'
}
var global_opt = {
    setSign: function (data) {
        sessionStorage.setItem('sign', data);
    },
    getSignHeader: function () {
        return 'Bearer ' + sessionStorage.getItem('sign');
    }
}