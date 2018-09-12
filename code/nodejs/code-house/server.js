var express = require('express');
var app = express();

//Setting the view engine in the express
app.set('view engine','ejs')

app.get('/products',function(req,res){
    /**
     * Render redirects to the especified content
     */
    res.render("products/list")
});

app.listen(3000,function(){
    console.log("Server is running")
});