package create.struct.decorator;
/**
 * 鸡腿堡类（被装饰者的初始状态，有些自己的简单装饰，相当于上面的Person）
 * @author bee
 *
 */
public class ChickenBurger extends Humburger{
	

	 public ChickenBurger(){    
	        name = "鸡腿堡";    
	 }    
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 10;
	}

}
