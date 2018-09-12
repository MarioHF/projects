function ProductsDAO(conn)
{
    //using the underscore warn the developer that this field should not be used outside the class
    this._conn = conn;
}

//The prototype include default setting to the class
ProductsDAO.prototype.list = function(callback)
{
    this._conn.query('select * from books',callback);
};

module.exports = function()
{
    return ProductsDAO;   
};