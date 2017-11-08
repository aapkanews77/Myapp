import java.awt.*;
import java.awt.event.*;
class LoginFrame extends Frame implements ActionListener
{
Button b1=null;
Button b2=null;
TextField tf1=null;
TextField tf2=null;
Label l1=null;
Label l2=null;
LoginFrame()
{
setSize(500,500);
setTitle("LoginPage");
Button b1=new Button("Login");
Button b2=new Button("Register");
TextField tf1=new TextField();
TextField tf2=new TextField();
Label l1=new Label("User Name");
Label l2=new Label("Password");
b1.addActionListener(this);
b2.addActionListener(this);

add(b1);
add(b2);
add(tf1);
add(tf2);
add(l1);
add(l2);

setLayout(null);
l1.setBounds(100,200,80,20);
l2.setBounds(100,250,80,20);
tf1.setBounds(250,200,120,20);
tf2.setBounds(250,250,120,20);
b1.setBounds(300,300,80,20);
b2.setBounds(150,300,80,20);
}

public void actionPerformed(ActionEvent ae)
{
	String s =ae.getActionCommand();
	if (s.equals("Register"))
	{
		this.setVisible(false);
		new RegisterFrame().setVisible(true);
		
	}
	else if (s.equals("Login"))
	{
       System.out.println("Welcome");//this.tf1.getText()
		this.setVisible(false);
		new WelcomeFrame().setVisible(true);
	   
	}
}

}
class Login
{
	public static void main (String arg[])
	{
		LoginFrame lf =new LoginFrame();
		lf.setVisible(true);
		
	}
}
class WelcomeFrame extends Frame
{
	WelcomeFrame()
	{
         setSize(500,500);
        // setTitle("Welcome");		 
		 TextField tf3=new TextField("You are Welcome");
		 add(tf3);
	 
	}


	
}
class RegisterFrame extends Frame
{
	Label lb1=null;
	Label lb2=null;
	Label lb3=null;
	TextField t1=null;
	TextField t2=null;
	TextField t3=null;
	Button bt1=null;
	
	
	RegisterFrame()
	{
		setSize(500,500);
		setTitle("RegisterPage");
		setLayout(null);
		lb1=new Label("First Name");
		lb2=new Label("Last Name");
		lb3=new Label("Roll number");
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		bt1=new Button("Submit");
		add(lb1);
		add(lb2);
		add(lb3);
		add(t1);
		add(t2);
		add(t3);
		add(bt1);
       // bt1.addActionListener(this);		
		lb1.setBounds(100,100,80,20);
		lb2.setBounds(100,150,80,20);
		lb3.setBounds(100,200,80,20);
		t1.setBounds(200,100,120,20);
		t2.setBounds(200,150,120,20);
		t3.setBounds(200,200,120,20);
		bt1.setBounds(200,250,80,20);
	}
}
