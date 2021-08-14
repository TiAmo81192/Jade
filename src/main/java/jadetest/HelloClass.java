package jadetest;

import jade.core.Agent;
import jade.core.Location;

public class HelloClass extends Agent{

    public void setup(){
        System.out.println("Hello World!");
        System.out.println("-----About Me:-----");
        System.out.println("My local name is:"+getAID().getLocalName());//由于本地agent,getAID()此时也可以省略
        System.out.println("My globally unique name is:"+getName() );
        System.out.println("-----About Here:-----");
        Location l = here();//主容器信息
        System.out.println("I am running in a location called:"+l.getName());
        System.out.println("Which is identified uniquely as:"+l.getID());
        System.out.println("And is contactable at:"+l.getAddress());
        System.out.println("Using the protocol:"+l.getProtocol());
        this.doDelete();
    }
    public void takeDown(){
        System.out.println("Agent takedown!");
    }

}