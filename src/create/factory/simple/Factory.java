package create.factory.simple;
/**
 * PS:
 * ��Ҫע��ĵط������ص�����  abstract����
 * @author bee
 *
 */
public class Factory {
	
	public BMW createBMW(int type){
		
		 switch (type) {  
         
	        case 320:  
	            return new BMW320();  
	  
	        case 523:  
	            return new BMW523();  
	  
	        default:  
	            break;  
	        }  
	        return null;  
		
	}

}
