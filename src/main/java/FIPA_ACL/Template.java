package FIPA_ACL;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;


public class Template extends Agent{   //消息模板

    MessageTemplate mt=MessageTemplate.and(MessageTemplate.MatchPerformative(ACLMessage.PROPOSE),
            MessageTemplate.MatchSender(new AID("a1",AID.ISLOCALNAME)));

    protected void setup() {
        ACLMessage acl=new ACLMessage(ACLMessage.INFORM);
        acl.setContent("Ping!");
        acl.setSender(getAID());
        acl.addReceiver(new AID("a1",AID.ISLOCALNAME));
        acl.addReceiver(new AID("a2",AID.ISLOCALNAME));
        send(acl);
		/*addBehaviour(new CyclicBehaviour() {

			@Override
			public void action() {
				// TODO 自动生成的方法存根
				System.out.println("Behaviour one.");
				ACLMessage msg=receive(mt);
				if(msg!=null) {
					System.out.println("Performative is: "+msg.getPerformative());
					System.out.println("The message is from  "+msg.getSender().getLocalName());
					System.out.println("The content is: "+msg.getContent());
				}
				else {
					System.out.println("Null");
				}
				block();
			}

		});*/

        addBehaviour(new CyclicBehaviour() {

            @Override
            public void action() {
                // TODO 自动生成的方法存根
                System.out.println("Behaviour two.");
                ACLMessage msg=receive();
                if(msg!=null) {
                    System.out.println("Performative is: "+msg.getPerformative());
                    System.out.println("The message is from  "+msg.getSender().getLocalName());
                    System.out.println("The content is: "+msg.getContent());
                }
                else {
                    System.out.println("Null");
                }
                block();
            }

        });

    }
}