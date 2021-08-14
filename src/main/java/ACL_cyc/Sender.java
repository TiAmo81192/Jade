package ACL_cyc;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;

public class Sender extends Agent{
    public void setup() {
        addBehaviour(new Behaviour() {

            private boolean finished = false;

            @Override
            public void action() {
                // TODO 自动生成的方法存根
                doWait(5000);
                ACLMessage acl=new ACLMessage(ACLMessage.INFORM); //通知
                AID r=new AID();
                r.setLocalName("Rec");  //设置接收Agent的本地名
                acl.addReceiver(r);     //添加到ACL消息中
                acl.setSender(getAID());  //设置发送者本地名，这里可以省略
                acl.setContent("Hello,Rec"); //设置内容
                send(acl);   //向Rec发送消息
                System.out.println("local name is:" + getLocalName());
                System.out.println(getLocalName()+" send Hello to Rec");
                System.out.println("the content is : "+acl.getContent());
                System.out.println("send finished");
                doWait(5000);
                finished=true;
                doDelete();
            }

            @Override
            public boolean done() {
                // TODO 自动生成的方法存根
                return finished;
            }

        });
    }
}