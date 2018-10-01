import java.awt.*;  
class First{  
First(){  
	Frame f=new Frame();  
	Button b=new Button("Start");  
	b.setBounds(30,50,80,30);  
	f.add(b);  
	f.setSize(300,300);  
	f.setLayout(null);  
	f.setVisible(true);

	Button b1=new Button("Reset");  
	b1.setBounds(30,80,80,30);  
	f.add(b1);  
	f.setSize(300,300);  
	f.setLayout(null);  
	f.setVisible(true);  
}  
	public static void main(String args[]){  
		First f=new First();  
	}
}  