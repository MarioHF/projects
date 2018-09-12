/**
 * Routing the products calls
 */
module.exports = function(app)
{
    app.get('/products',function(req,res){
        
        var conn =  app.infra.connectionFactory();
        //using new operator to create a new object instance
        var dbProducts =  new app.infra.dbProducts(conn);

        //using a callback function to expect the query result
        dbProducts.list(
            function(err,results)
            {
                res.render('products/list',{list:results})
            }
        );


        conn.end()
    });
}