package create.factory.abstract1;

//±¦Âí523ÏµÁÐ  
public class FactoryBMW523 implements AbstractFactory {    
  
   @Override    
  public Engine createEngine() {      
      return new EngineA();    
  }    
  @Override    
  public Aircondition createAircondition() {    
      return new AirconditionB();    
  }    


}   