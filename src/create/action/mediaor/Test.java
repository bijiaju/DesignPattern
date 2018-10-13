package create.action.mediaor;

public class Test {
	
	public static void main(String[] args) {
        Mediator president=new President();

        Development devp=new Development(president);
        Finacial fin=new Finacial(president);
        Market mar=new Market(president);

        devp.ownWork();
        devp.outWork();

    }

}
