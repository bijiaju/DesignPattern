package create.action.responsibilitychain;
/**
 * 申请聚餐费用的管理，申请聚餐费用的大致流程一般是，由申请人先填写申请单，然后交给领导审批，如果申请批准下来，领导会通知申请人审批通过，然后申请人去财务领取费用，如果没有批准下来，领导会通知申请人审批未通过，此事也就此作罢。
不同级别的领导，对于审批的额度是不一样的，比如，项目经理只能审批500元以内的申请；部门经理能审批1000元以内的申请；而总经理可以审核任意额度的申请。
--------------------- 
作者：炸斯特 
来源：CSDN 
原文：https://blog.csdn.net/jason0539/article/details/45091639?utm_source=copy 
版权声明：本文为博主原创文章，转载请附上博文链接！
 * @author bee
 *
 */
public class Client {
	public static void main(String[] args) {  
        //先要组装责任链  ！！！
        Handler h1 = new GeneralManager();  
        Handler h2 = new DeptManager();  
        Handler h3 = new ProjectManager();  
        h3.setSuccessor(h2);  
        h2.setSuccessor(h1);  
          
        //开始测试  
        String test1 = h3.handleFeeRequest("张三1", 10000);  
        System.out.println("test1 = " + test1);  
        String test2 = h3.handleFeeRequest("李四", 300);  
        System.out.println("test2 = " + test2);  
        System.out.println("---------------------------------------");  
          
        String test3 = h3.handleFeeRequest("张三", 700);  
        System.out.println("test3 = " + test3);  
        String test4 = h3.handleFeeRequest("李四", 700);  
        System.out.println("test4 = " + test4);  
        System.out.println("---------------------------------------");  
          
        String test5 = h3.handleFeeRequest("张三", 1500);  
        System.out.println("test5 = " + test5);  
        String test6 = h3.handleFeeRequest("李四", 1500);  
        System.out.println("test6 = " + test6);  
    }  
}
