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

ProductsDAO.prototype.save = function(product,callback)
{
    this._conn.query('insert into books set ?',product,callback);
};

module.exports = function()
{
    return ProductsDAO;   
};