package jadetest;

/*
    CyclicBehaviour类：循环简单行为。其action()方法循环执行，done()始终方法返回false。
 */

import jade.core.*;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;

public class L2 extends Agent{
    public void setup() {
        Behaviour b1=new CyclicBehaviour() {

            @Override
            public void action() {
                // TODO 自动生成的方法存根
                ACLMessage al=receive();
                if(al!=null) {
                    System.out.println("I receive a message:"+al.getContent()+",this message is from"+al.getSender());
                }
            }
        };
        this.addBehaviour(b1);
    }
}