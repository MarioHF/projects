var config = require('express')();
//Setting the view engine in the express
config.set('view engine','ejs');
config.set('views','./app/views')

/**
 * Using module exports in order to make the express configuration avaliable
 */
module.exports = function ()
{
    return config
}