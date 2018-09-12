/**
 * Routing the products calls
 */
module.exports = function(app)
{
    app.get('/products',function(req,res){
        /**
         * Render redirects to the especified content
         */
        res.render("products/list")
    });
}