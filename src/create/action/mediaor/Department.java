package create.action.mediaor;
/**
 * 抽象同事类：部门
 */
public interface Department {
    void ownWork();//本部门自己的工作
    void outWork();//需要其他部门配合的工作
}
