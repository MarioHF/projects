/**
 * Routing the products calls
 */
module.exports = function(app)
{
    app.get('/products',function(req,res){
        
        var conn = app.infra.connectionFactory();
        var dbProducts = app.infra.dbProducts;
        //using a callback function to expect the query result
        dbProducts.list(conn,
            function(err,results)
            {
                res.render('products/list',{list:results})
            }
        );


        conn.end()
    });
}