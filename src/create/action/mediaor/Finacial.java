package create.action.mediaor;

/**
 * ����
 */
public class Finacial implements Department{
    private Mediator m;//�����н��߶�������
    public Finacial(Mediator m){
        this.m=m;
        m.register("finacial", this);
    }

    @Override
    public void ownWork() {
        System.out.println("���񲿣������������");
    }

    @Override
    public void outWork() {
        System.out.println("���񲿣������г�����ϣ�");
        m.command("market");        
    }
}