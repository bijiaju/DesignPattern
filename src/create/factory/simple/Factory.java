package create.factory.simple;
/**
 * PS:
 * 需要注意的地方，返回的类型  abstract类型
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
