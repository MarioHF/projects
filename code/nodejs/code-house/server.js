var express = require('express');
var app = express();

app.get('/products',function(req,res){
    res.send("<html><body><h1>Products Listing</h1></body></html>")
});

app.listen(3000,function(){
    console.log("Server is running")
});