var express = require('express');
var load = require('express-load');
var bodyParser = require('body-parser');

/**
 * Using module exports in order to make the express configuration avaliable
 */
module.exports = function ()
{
    var app = express()

    //Setting the view engine in the express
    app.set('view engine','ejs');
    app.set('views','./app/views');

    //using bodyparser with extended true
    app.use(bodyParser.urlencoded({extended:true}));


    //Load dependencies
    load('routes',{cwd: 'app'})
        .then('infra')   
        .then('body-parser') 
        .into(app)
    
    return app
}