package create.action.mediaor;
/**
 * �����н���
 * @author bee
 *
 */
public interface Mediator {
    void register(String name,Department d);//��¼����ͬ����
    void command(String name);//��������
} 
