package jadetest;

import jade.core.Agent;
import jade.core.behaviours.SimpleBehaviour;

public class Agent1 extends Agent {
    public void setup() {
        SimpleBehaviour b=new SimpleBehaviour() {
            boolean finished = false;
            @Override
            public boolean done() {
                // TODO 自动生成的方法存根
                System.out.println("Finished!");
                return finished;
            }

            @Override
            public void action() {
                // TODO 自动生成的方法存根
                System.out.println("Hello!");
                System.out.println("The local name is :"+getLocalName());
                System.out.println("The unique name is :"+getName());
                System.out.println("The AID is :"+getAID());
                finished = true;
            }
        };
        addBehaviour(b);
    }
}