/**
 * Routing the products calls
 */
module.exports = function(app)
{
    var listProducts = function(req,res){
        
        var conn =  app.infra.connectionFactory();
        //using new operator to create a new object instance
        var productsDAO =  new app.infra.ProductsDAO(conn);

        //using a callback function to expect the query result
        productsDAO.list(
            function(err,results)
            {
                res.format({
                    html: function()
                    {
                        res.render('products/list',{list:results})
                    },
                    json: function()
                    {
                        res.json(results);
                    }
                })
                
            }
        );
        conn.end()
    };
    app.get('/products',listProducts);

    app.get('/products/form',function(req,res){
        res.render('products/form')
    });

    app.post('/products',function(req,res){

        //Getting the content from body
        var product = req.body;

        var conn = app.infra.connectionFactory();
        var productsDAO = new app.infra.ProductsDAO(conn);
        productsDAO.save(product,function(err,results){
            res.redirect('/products');
        });
    });
}