module.exports = function()
{
    return function(conn)
    {  
        this.list = function(callback)
        {
            conn.query('select * from books',callback);
        };
        console.log(this)
        return this;
    }        
};