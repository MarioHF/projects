var http = require('http');

var config = {
    hostname: 'localhost',
    port:3000,
    path: '/products',
    method: 'post',
    headers: {
        'Accept':'application/json',
        'Content-type':'application/json'
    }
}

var client = http.request(config,function(res){
    console.log(res.statusCode);
    res.on('data',function(body){
        console.log('Body'+body);
    });
});

var product = {
    title: 'about node',
    detail: 'javascript',
    price: 100
};

client.end(JSON.stringify(product));