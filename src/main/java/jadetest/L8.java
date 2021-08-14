package jadetest;

import jade.core.*;
import jade.core.behaviours.*;

public class L8 extends Agent{

    class behaviour1 extends Behaviour{

        private int step=1;
        boolean finished = false;

        @Override
        public void action() {
            // TODO 自动生成的方法存根
            switch(step) {
                case 1:
                    System.out.println("step 1");
                    break;
                case 2:
                    myAgent.addBehaviour(new OneShotBehaviour() {

                        @Override
                        public void action() {
                            // TODO 自动生成的方法存根
                            System.out.println("step 2");
                        }
                    });
                    break;
                case 3:
                    myAgent.addBehaviour(new WakerBehaviour(myAgent,2000) {
                        @Override
                        protected void onWake() {
                            // TODO 自动生成的方法存根
                            System.out.println("step 3");
                        }
                    });
                    break;
                case 4:
                    System.out.println("step 4");
                    break;
            }
            step++;
        }

        @Override
        public boolean done() {
            // TODO 自动生成的方法存根
            if(step==5)finished=true;
            return finished;
        }

        @Override
        public int onEnd() {  //done()方法返回真时调用
            // TODO 自动生成的方法存根
            myAgent.doDelete();
            System.out.println("finished");
            return super.onEnd();
        }
    }

    public void setup() {
        System.out.println("start");
        this.addBehaviour(new CyclicBehaviour() {

            @Override
            public void action() {
                // TODO 自动生成的方法存根
                System.out.println("cyclicing");
            }
        });
        this.addBehaviour(new behaviour1());
    }

}