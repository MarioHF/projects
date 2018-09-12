var express = require('express');
var load = require('express-load');

/**
 * Using module exports in order to make the express configuration avaliable
 */
module.exports = function ()
{
    var app = express()

    //Setting the view engine in the express
    app.set('view engine','ejs');
    app.set('views','./app/views');

    //Load dependencies
    load('routes',{cwd: 'app'})
        .then('infra')    
        .into(app)
    
    return app
}