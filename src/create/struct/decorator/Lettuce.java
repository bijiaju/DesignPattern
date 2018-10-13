package create.struct.decorator;
/**
 * ���ˣ�װ���ߵĵ�һ�㣬�൱�������decorator_zero��
 * @author bee
 * �Ժ�����������
 */
public class Lettuce extends Condiment{
	
	Humburger humburger;    
    
    public Lettuce(Humburger humburger){    
        this.humburger = humburger;    
    }

	@Override
	public String getName() {
		 return humburger.getName()+" ������";    
	}    
    
	public double getPrice() {    
        return humburger.getPrice()+1.5;    
    }   
	
}
