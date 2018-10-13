package create.action.mediaor;

/**
 * �г���
 */
public class Market implements Department{
    private Mediator m;//�����н��߶�������
    public Market(Mediator m){
        this.m=m;
        m.register("market", this);
    }

    @Override
    public void ownWork() {
        System.out.println("�г�����������Ŀ�нӹ�����");
    }

    @Override
    public void outWork() {
        System.out.println("�г����������з�������ϣ�");
        m.command("development");
    }
}
