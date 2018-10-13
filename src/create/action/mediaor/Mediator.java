package create.action.mediaor;
/**
 * 抽象中介者
 * @author bee
 *
 */
public interface Mediator {
    void register(String name,Department d);//记录所有同事类
    void command(String name);//发出命令
} 
