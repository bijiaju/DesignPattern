package create.action.command;

public class CommandChange implements Command{
	
	private Tv myTv;
	private int channel;
	
	public CommandChange(Tv tv,int channel){
		this.myTv = tv;
		this.channel = channel;
	}

	@Override
	public void execute() {
		this.myTv.changeChannel(channel);
	}

}
