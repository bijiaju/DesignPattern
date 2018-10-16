package create.factory.prototype;
/**
 * 使用原型模式创建对象比直接new一个对象在性能上要好的多，因为Object类的clone方法是一个本地方法，
 * 它直接操作内存中的二进制流，特别是复制大对象时，性能的差别非常明显。
 * @author bee
 *
 */
public class Client {
	public static void main(String[] args){  
        ConcretePrototype cp = new ConcretePrototype();  
        for(int i=0; i< 10; i++){  
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();  //创造10个对象
            clonecp.show();  
        }  
    }  

}
