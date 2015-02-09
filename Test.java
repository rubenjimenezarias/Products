
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public int test1()
    {
        StockManager stockManager = new StockManager();
        Product producto1 = new Product(1,"a");
        Product producto2 = new Product(2,"b");
        Product producto3 = new Product(3,"c");
        Product producto4 = new Product(4,"d");
        Product producto5 = new Product(5,"e");
        Product producto6 = new Product(6,"f");
        
        
        
        stockManager.addProduct(producto1);
        stockManager.addProduct(producto2);
        stockManager.addProduct(producto3);
        stockManager.addProduct(producto4);
        stockManager.addProduct(producto5);
        stockManager.addProduct(producto6);
        
        stockManager.delivery(1,20);
        return stockManager.numberInStock(1);
    }
    
    
}