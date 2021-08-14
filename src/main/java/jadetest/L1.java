package jadetest;
/*
    OneShotBehaviour类：单次简单行为。
    其action()方法只执行一次，done()
    方法始终返回true值。看一下简单例子。
 */
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.OneShotBehaviour;

public class L1 extends Agent{

    public void setup() {
        Behaviour b1=new OneShotBehaviour() {

            @Override
            public void action() {
                // TODO 自动生成的方法存根
                System.out.println("this is a oneshotbehaviour");
            }
        };
        this.addBehaviour(b1);
    }
}