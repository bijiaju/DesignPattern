package create.struct.decorator;
/**
 * 配料的基类（装饰者，用来对汉堡进行多层装饰，每层装饰增加一些配料，相当于上面Decorator）
 * @author bee
 *
 */
public abstract class Condiment {
	public abstract String getName();   
}
