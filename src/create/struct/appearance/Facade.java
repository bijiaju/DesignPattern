package create.struct.appearance;
/**
 * 所有过程都封装好，只需要找她
 * @author bee
 *
 */
public class Facade {

	//示意方法，满足客户端需要的功能  
    public void test(){  
        ModuleA a = new ModuleA();  
        a.testA();  
        ModuleB b = new ModuleB();  
        b.testB();  
        ModuleC c = new ModuleC();  
        c.testC();  
    }  
}
