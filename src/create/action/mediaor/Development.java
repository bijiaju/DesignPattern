package create.action.mediaor;

/**
 * �з���
 */
public class Development implements Department{
    private Mediator m;//�����н��߶�������
    public Development(Mediator m){
        this.m=m;
        m.register("development", this);
    }

    @Override
    public void ownWork() {
        System.out.println("�з����������з�������");
    }

    @Override
    public void outWork() {
        System.out.println("�з��������������ϣ�");
        m.command("finacial");
    }
}