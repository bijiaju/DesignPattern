package create.struct.decorator;
/**
 * Java IO����װ����ģʽ
 * @author bee
 *
 */
public class Test {
	
	 /**  
     * @param args  
     */    
    public static void main(String[] args) {    
        Humburger humburger = new ChickenBurger();    
        System.out.println(humburger.getName()+"  ��Ǯ��"+humburger.getPrice());    
        Lettuce lettuce = new Lettuce(humburger);    
        System.out.println(lettuce.getName()+"  ��Ǯ��"+lettuce.getPrice());    
        Chilli chilli = new Chilli(humburger);    
        System.out.println(chilli.getName()+"  ��Ǯ��"+chilli.getPrice());    
        Chilli chilli2 = new Chilli(humburger);    
        System.out.println(chilli2.getName()+"  ��Ǯ��"+chilli2.getPrice());    
    }    

}
