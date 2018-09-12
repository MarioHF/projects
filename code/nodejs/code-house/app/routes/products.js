var connectionFactory = require('../infra/connectionFactory');

/**
 * Routing the products calls
 */
module.exports = function(app)
{
    app.get('/products',function(req,res){
        
        var conn = connectionFactory()
        //using a callback function to expect the query result
        conn.query('select * from books',
            function(err,results)
            {
                res.render('products/list',{list:results})
            }
        );


        conn.end()
    });
}