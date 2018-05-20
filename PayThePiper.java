import java.awt.Graphics;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Label;
import java.awt.Color;
import java.util.*;
 
class PayThePiper extends Frame implements ActionListener 
{
	Button b1,b2,b3,b4,b5;
	TextField tf1,tf2;
	Label l1,l2;
	public Piper()
	{

		b1=new Button("1 rupee");
		b2=new Button("2 rupee");
		b3=new Button("5 rupee");
		b4=new Button("10 rupee");
		b5=new Button("reset");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		l1=new Label("number");
		l1.setBounds(50,50,100,30);
		add(l1);
		tf1=new TextField(" ");
		tf1.setBounds(150,50,100,30);
		add(tf1);
		tf1.setText(""+Math.random());
		l2=new Label("result");
		l2.setBounds(50,100,100,30);
		add(l2);
		tf2=new TextField(" ");
		tf2.setBounds(150,100,100,30);
		add(tf2);
		tf2.setText("0");
		setSize(450,450);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int z;
		
		if(ae.getSource()==b1)
		{
			z=Integer.parseInt(tf2.getText());
			tf2.setText(""+(z+1));
			if(tf1.getText()==tf2.getText())
				setBackground(Color.green);
			else
				setBackground(Color.white);
		}
		if(ae.getSource()==b2)
		{
			z=Integer.parseInt(tf2.getText());
			tf2.setText(""+(z+2));
			if(tf1.getText()==tf2.getText())
				setBackground(Color.green);
			else
				setBackground(Color.white);
		}
		if(ae.getSource()==b3)
		{
			z=Integer.parseInt(tf2.getText());
			tf2.setText(""+(z+5));
			if(tf1.getText()==tf2.getText())
				setBackground(Color.green);
			else
				setBackground(Color.white);
		}
		if(ae.getSource()==b4)
		{
			z=Integer.parseInt(tf2.getText());
			tf2.setText(""+(z+10));
			if(tf1.getText()==tf2.getText())
				setBackground(Color.green);
			else
				setBackground(Color.white);
		}
		if(ae.getSource()==b5)
		{
			
			tf1.setText(""+Math.random());
			tf2.setText(""+0);
			setBackground(Color.white);
			
		}
	}

	public static void main(String[]args)
	{
		Piper p=new Piper();
	}
}
