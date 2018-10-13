package create.action.visitor;

import java.util.List;

import create.action.visitor.Element;
import create.action.visitor.Visitor;

public class Client {
	public static void main(String[] args){    
        List<Element> list = ObjectStruture.getList();    
        for(Element e: list){    
            e.accept(new Visitor());    
        }    
    }    
}

