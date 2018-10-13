package create.action.command;
//�ػ�����ConcreteCommand 
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
