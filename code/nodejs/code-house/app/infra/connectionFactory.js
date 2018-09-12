/**
 * Provide the MySql connection object
 */
var mysql = require('mysql');

function createDBConnection()
{
    return mysql.createConnection
    (
        {
            host : 'localhost',
            user : 'root',
            password : 'password',
            database : 'codehouse'
        }
    );
};

//Wrapper
module.exports = function()
{
    return createDBConnection;
};