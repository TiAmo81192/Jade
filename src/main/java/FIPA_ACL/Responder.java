package FIPA_ACL;

import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;

public class Responder extends Agent{

    protected void setup() {
        addBehaviour(new CyclicBehaviour() {

            @Override
            public void action() {
                // TODO 自动生成的方法存根
                ACLMessage msg=receive();
                if(msg!=null) {
                    ACLMessage reply=msg.createReply();
                    reply.setPerformative(ACLMessage.INFORM);
                    reply.setContent("Performative style is inform.");
                    send(reply);

                    reply.setPerformative(ACLMessage.PROPOSE);
                    reply.setContent("Tell me your opition about "+reply.getSender().getLocalName());
                    send(reply);

                }

                block();

            }});
    }
}