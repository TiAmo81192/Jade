package parallelbehaviour;
import jade.core.*;
import jade.core.behaviours.*;

public class L4 extends Agent{
    public void setup() {
        ParallelBehaviour p1=new ParallelBehaviour(this,
                ParallelBehaviour.WHEN_ALL);
        p1.addSubBehaviour(new OneShotBehaviour() {

            @Override
            public void action() {
                // TODO 自动生成的方法存根
                System.out.println("oneshotbehaviour");
            }
        });
        p1.addSubBehaviour(new WakerBehaviour(this,5000) {

            @Override
            protected void onWake() {
                // TODO 自动生成的方法存根
                System.out.println("wakerbehaviour");
            }

        });
        p1.addSubBehaviour(new SimpleBehaviour(this) {

            boolean finished =false;
            @Override
            public boolean done() {
                // TODO 自动生成的方法存根
                return finished;
            }

            @Override
            public void action() {
                // TODO 自动生成的方法存根
                System.out.println("simple behaviour");
                finished = true;
            }
        });
        this.addBehaviour(p1);
    }
}