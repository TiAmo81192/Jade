package FSMBehaviour;

import jade.core.*;
import jade.core.behaviours.*;

public class L5 extends Agent {

    public void setup() {
        FSMBehaviour fsm=new FSMBehaviour() {
            @Override
            public int onEnd() {
                // TODO 自动生成的方法存根
                System.out.println("FSMBehaviour finished");
                myAgent.doDelete();
                return super.onEnd();
            }
        };
        fsm.registerFirstState(new OperationA(), "A");//初始行为
        fsm.registerState(new OperationB(), "B");//中间行为
        fsm.registerLastState(new OperationC(), "C");//终止行为
        fsm.registerTransition("A", "B", 0);//转换规则
        fsm.registerTransition("A", "C", 1);
        fsm.registerDefaultTransition("B","A");//默认转换
        addBehaviour(fsm);
    }

    private class OperationA extends OneShotBehaviour{

        private int num;

        @Override
        public void action() {
            // TODO 自动生成的方法存根
            num=(int)(Math.random()*100+1);
            System.out.println("Here is A,and the random num is : "+num);
        }
        @Override
        public int onEnd() {
            // TODO 自动生成的方法存根
            return num%2;
        }
    }

    private class OperationB extends OneShotBehaviour{

        @Override
        public void action() {
            // TODO 自动生成的方法存根
            System.out.println("Here is B");
        }

    }

    private class OperationC extends OneShotBehaviour{

        @Override
        public void action() {
            // TODO 自动生成的方法存根
            System.out.println("Here is C");
        }

    }
}