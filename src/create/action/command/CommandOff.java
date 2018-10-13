package create.action.command;
//¹Ø»úÃüÁîConcreteCommand 
public class CommandOff implements Command{
	
	private Tv myTv;
	
	public CommandOff(Tv tv){
		this.myTv = tv;
	}

	@Override
	public void execute() {
		this.myTv.turnOff();
	}

}
