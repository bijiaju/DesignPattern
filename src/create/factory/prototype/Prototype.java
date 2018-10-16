package create.factory.prototype;

public class Prototype implements Cloneable{

	/**
	 * ԭ��ģʽ��Ҫ������ĸ���
	 */
	public Prototype clone(){  
        Prototype prototype = null;  
        try{  
            prototype = (Prototype)super.clone();  
        }catch(CloneNotSupportedException e){  
            e.printStackTrace();  
        }  
        return prototype;   
    }  


}


class ConcretePrototype extends Prototype{  
    public void show(){  
        System.out.println("ԭ��ģʽʵ����");  
    }  
}  
