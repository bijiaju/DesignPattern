package create.action.mediaor;
/**
 * 中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。
 * 这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。中介者模式属于行为型模式。
 * @author bee
 *
 */
public class Test {
	
	public static void main(String[] args) {
        Mediator president=new President();//中介者

        Development devp=new Development(president);
        Finacial fin=new Finacial(president);
        Market mar=new Market(president);

        devp.ownWork();
        devp.outWork();
        
        System.out.println("-------------------------------");
        
        fin.ownWork();
        fin.outWork();
        
        System.out.println("-------------------------------");
        
        mar.ownWork();
        mar.outWork();

    }

}
