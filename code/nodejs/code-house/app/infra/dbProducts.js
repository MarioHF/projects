module.exports = function()
{
    this.list = function(conn,callback)
    {
        conn.query('select * from books',callback);
    };
    return this;
};