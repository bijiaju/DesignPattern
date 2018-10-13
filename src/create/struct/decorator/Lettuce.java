package create.struct.decorator;
/**
 * 生菜（装饰者的第一层，相当于上面的decorator_zero）
 * @author bee
 * 对汉堡包加生菜
 */
public class Lettuce extends Condiment{
	
	Humburger humburger;    
    
    public Lettuce(Humburger humburger){    
        this.humburger = humburger;    
    }

	@Override
	public String getName() {
		 return humburger.getName()+" 加生菜";    
	}    
    
	public double getPrice() {    
        return humburger.getPrice()+1.5;    
    }   
	
}
