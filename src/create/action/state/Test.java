package create.action.state;
/**
 * ������switch
 * @author bee
 *
 */
public class Test {
	public static void main(String[] args) {  
        Context context = new Context();  
        context.setLiftState(new RunningState());  //���벻ͬ��״̬�в�ͬ�Ľ��I
        context.open();  
        context.close();  
        context.run();  
        context.stop();  
    }  
}
