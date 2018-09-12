/**
 * Provide the MySql connection object
 */
var mysql = require('mysql');

module.exports = function ()
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
}