/**
 * Routing the products calls
 */
module.exports = function(app)
{
    app.get('/products',function(req,res){
        
        var conn =  app.infra.connectionFactory();
        //using new operator to create a new object instance
        var productsDAO =  new app.infra.ProductsDAO(conn);

        //using a callback function to expect the query result
        productsDAO.list(
            function(err,results)
            {
                res.render('products/list',{list:results})
            }
        );
        conn.end()
    });

    app.get('/products/form',function(req,res){
        res.render('products/form')
    });

    app.post('/products/save',function(req,res){

        //Getting the content from body
        var product = req.body;
        console.log(product);

        var conn = app.infra.connectionFactory();
        var productsDAO = new app.infra.ProductsDAO(conn);
        productsDAO.save(product,function(err,results){
            res.render('products/list');
        });
    });
}