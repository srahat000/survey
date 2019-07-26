//Sabahat Rahat
//Chapter 2-critical thinking question
//creating a user interface that asks the user to take a quiz 
//that allows users to click all the horror movies that they've 
//watched and from that information
//the program determines what type of horror movie fan they are

//classes required to run applet
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Proj2_Checkbox extends Applet implements ItemListener {
	
	Label prompt;
	
	
	Checkbox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11, cb12, cb13;
	int count = 0; //this counter keeps track of how many horror movies the user has watched
	Boolean state; //this keeps track of the checkbox state to see if it has been
	//clicked or not
	
	
	public void init() {
		
		this.setSize(550, 300); //sets the size of the applet
		prompt = new Label ("What level horror fan are you? "
				+ "Click all the movies you've seen to find out.");
		
	//The horror movie choices get assigned to the checkboxes and are set at 
		//false because they are not clicked by the user
		cb1= new Checkbox("The Conjuring", false);
		
		cb2= new Checkbox("The Conjuring 2", false);
		
		cb3= new Checkbox("Insidious", false);
		cb4= new Checkbox("A Nightmare on Elm Street", false);
		cb5= new Checkbox("Friday the 13th", false);
		cb6= new Checkbox("Children on the corn", false);
		cb7= new Checkbox("It", false);
		cb8= new Checkbox("Halloween", false);
		cb9= new Checkbox("A Quiet Place", false);
		cb10= new Checkbox("Get Out", false);
		cb11= new Checkbox("Paranormal Activity", false);
		cb12= new Checkbox("Texas Chainsaw", false);
		cb13= new Checkbox("The Cabin in the Woods", false);
		
		add(prompt);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		add(cb6);
		add(cb7);
		add(cb8);
		add(cb9);
		add(cb10);
		add(cb11);
		add(cb12);
		add(cb13);
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		cb5.addItemListener(this);
		cb6.addItemListener(this);
		cb7.addItemListener(this);
		cb8.addItemListener(this);
		cb9.addItemListener(this);
		cb10.addItemListener(this);
		cb11.addItemListener(this);
		cb12.addItemListener(this);
		cb13.addItemListener(this);
	}
	

	

	//different results get displayed based on the number of horror movies watched
	//the user is informed of what level horror movie fan they are
	public void paint(Graphics g) {
		
		
		if(count > 2 && count <= 5)
		g.drawString("You enjoy a good scare now and then. You're an casual horror movie fan.", 50, 200);
		if(count >= 6 && count <= 9)
			g.drawString("WOW you really into horror! You're an interested horror movie fan.", 50, 200);
		if(count > 9)
			{g.drawString("WHOA, you're a seriously dedicated fan!", 100, 200);
		g.drawString("Maybe you should watch something happier!", 100, 220);}
		if(count <= 2 && count > 0)
			g.drawString("You're really not into horror. You're not a fan.", 50, 200);



	}

@Override
public void itemStateChanged(ItemEvent e) {
	//when each checkbox is selected, one is added to the counter
	//keeping track of how many horror movies are watched
	if (cb1.getState() || cb2.getState() || cb3.getState() || cb4.getState()
			|| cb5.getState() || cb6.getState() || cb7.getState() || cb8.getState()
			|| cb9.getState() || cb10.getState() || cb11.getState() || cb12.getState() || cb13.getState())
		
		count++;
	//paint is called to display results to the screen
	repaint();
	
}
	
	

}
