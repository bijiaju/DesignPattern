package create.action.state;
/**
 * 类似于switch
 * @author bee
 *
 */
public class Test {
	public static void main(String[] args) {  
        Context context = new Context();  
        context.setLiftState(new RunningState());  //输入不同的状态有不同的结果I
        context.open();  
        context.close();  
        context.run();  
        context.stop();  
    }  
}
