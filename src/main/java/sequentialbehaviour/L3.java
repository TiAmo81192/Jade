package sequentialbehaviour;

import jade.core.Agent;
import jade.core.behaviours.*;

public class L3 extends Agent{
    public void setup() {
        SequentialBehaviour s=new SequentialBehaviour(this);
        s.addSubBehaviour(new OneShotBehaviour() {

            @Override
            public void action() {
                // TODO 自动生成的方法存根
                System.out.println("this is a oneshotbehaviour");
            }
        });
        s.addSubBehaviour(new WakerBehaviour(this,4000) {
            @Override
            protected void onWake() {
                // TODO 自动生成的方法存根
                System.out.println("this is a wakerbehaviour");
            }
        });
        s.addSubBehaviour(new SimpleBehaviour(this) {
            boolean fin=false;
            @Override
            public void action() {
                // TODO 自动生成的方法存根
                System.out.println("this is a simplebehaviour");
                fin=true;
            }

            @Override
            public boolean done() {
                // TODO 自动生成的方法存根
                return fin;
            }

        });
        this.addBehaviour(s);
    }
}