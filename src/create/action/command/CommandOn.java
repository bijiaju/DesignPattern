package create.action.command;

public class CommandOn implements Command{
	
	private Tv myTv;
	
	public CommandOn(Tv tv){
		this.myTv = tv;
	}

	@Override
	public void execute() {
		this.myTv.turnOn();
	}

}
