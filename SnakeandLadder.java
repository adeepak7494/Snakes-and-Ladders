import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.awt.color.*;
import sun.audio.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;


class SnakeandLadder{
	JFrame f=new JFrame("Snake & Ladder"); //window
	JLabel tf,a3,l[],m[],k;                //normal text 
	JTextField tf1,tf2,screen;             //text in textfield
	JButton b1,au,reset,start;             //creates button with no text
	JLabel myimage=new JLabel(" ");        //creating instance of JLabel
	Listener1 o=new Listener1(this);
	SnakeandLadder(){
		JLabel bg=new JLabel(new ImageIcon(".//bg.jpg"));
	 	bg.setBounds(0,0,0,735);
		l=new JLabel[101];
		m=new JLabel[6];
		m[1]=new JLabel();
	    m[1].setBounds(140,650,20,52);
	    m[1].setIcon(new ImageIcon(".//player2.png"));
	    f.add(m[1]);

		m[2]=new JLabel();
	    m[2].setBounds(70,650,20,52);
		m[2].setIcon(new ImageIcon(".//player1.png"));
		f.add(m[2]);

		m[3]=new JLabel();
		m[3].setBounds(50,570,150,150);
		m[3].setIcon(new ImageIcon(".//start.jpg"));
		f.add(m[3]);

		m[4]=new JLabel();
	    m[4].setBounds(5,290,20,52);
	    m[4].setIcon(new ImageIcon(".//player2.png"));
	    f.add(m[4]);

		m[5]=new JLabel();
	    m[5].setBounds(5,340,20,52);
		m[5].setIcon(new ImageIcon(".//player1.png"));
		f.add(m[5]);									

		int j=0;
		for(int i=100;i>90;i--){
			l[i]=new JLabel();
			l[i].setBounds((200+j*70),0,70,70);
			l[i].setIcon(new ImageIcon(".//cut/"+i+".jpg"));
			f.add(l[i]);
			j++;
		}

		j=0;
		for(int i=80;i>70;i--){
			l[i]=new JLabel();
			l[i].setBounds((200+j*70),140,70,70);
			l[i].setIcon(new ImageIcon(".//cut/"+i+".jpg"));
			f.add(l[i]);
			j++;
		}


		j=0;
		for(int i=60;i>50;i--){
			l[i]=new JLabel();
			l[i].setBounds((200+j*70),280,70,70);
			l[i].setIcon(new ImageIcon(".//cut/"+i+".jpg"));
			f.add(l[i]);
			j++;
		}

		j=0;
		for(int i=40;i>30;i--){
			l[i]=new JLabel();
			l[i].setBounds((200+j*70),420,70,70);
			l[i].setIcon(new ImageIcon(".//cut/"+i+".jpg"));
			f.add(l[i]);
			j++;
		}


		j=0;
		for(int i=20;i>10;i--){
			l[i]=new JLabel();
			l[i].setBounds((200+j*70),560,70,70);
			l[i].setIcon(new ImageIcon(".//cut/"+i+".jpg"));
			f.add(l[i]);
			j++;
		}


		j=0;
		for(int i=81;i<91;i++){
			l[i]=new JLabel();
			l[i].setBounds((200+j*70),70,70,70);
			l[i].setIcon(new ImageIcon(".//cut/"+i+".jpg"));
			f.add(l[i]);
			j++;
		}


		j=0;
		for(int i=61;i<71;i++){
			l[i]=new JLabel();
			l[i].setBounds((200+j*70),210,70,70);
			l[i].setIcon(new ImageIcon(".//cut/"+i+".jpg"));
			f.add(l[i]);
			j++;
		}


		j=0;
		for(int i=41;i<51;i++){
			l[i]=new JLabel();
			l[i].setBounds((200+j*70),350,70,70);
			l[i].setIcon(new ImageIcon(".//cut/"+i+".jpg"));
			f.add(l[i]);
			j++;
		}


		j=0;
		for(int i=21;i<31;i++){
			l[i]=new JLabel();
			l[i].setBounds((200+j*70),490,70,70);
			l[i].setIcon(new ImageIcon(".//cut/"+i+".jpg"));
			f.add(l[i]);
			j++;
		}


		j=0;
		for(int i=1;i<11;i++){
			l[i]=new JLabel();
			l[i].setBounds((200+j*70),630,70,70);
			l[i].setIcon(new ImageIcon(".//cut/"+i+".jpg"));
			f.add(l[i]);
			j++;
		}

		tf=new JLabel();
		tf.setBounds(920,0,37,663);
		tf.setIcon(new ImageIcon(".//aaaa.png"));
		f.add(tf);

		screen=new JTextField("Roll the dice");
		screen.setBounds(25,250,150,40);
		screen.setBackground(Color.BLACK);
		screen.setForeground(Color.GREEN);
		f.add(screen);

		tf1=new JTextField();
		tf1.setBounds(25,310,150,35);
		tf1.setText("Player 1 ");
		f.add(tf1);
		tf1.setBackground(Color.YELLOW);

		tf2=new JTextField();
		tf2.setBounds(25,350,150,35);
		tf2.setText("Player 2");
		f.add(tf2);
		tf2.setBackground(Color.YELLOW);

	    k=new JLabel();
	    k.setBounds(60,400,100,100);
		f.add(k);

		 a3=new JLabel();
		 a3.setBounds(50,400,100,100);
		 a3.setText("");
		 a3.setIcon(new ImageIcon(".//dice.gif"));
		 f.add(a3);

		 b1=new JButton();
		 b1.setBounds(25,490,150,40);
		 b1.setText("Roll");
		 b1.addActionListener(o);
		 f.add(b1);

		 myimage=new JLabel("");
		 myimage.setForeground(Color.WHITE);
		 myimage.setBounds(120,400,100,100);
		 f.add(myimage);

		Font font = new Font("Book Antiqua", Font.BOLD,20);
		Font font1 = new Font("Tecton Pro", Font.BOLD,26);
		Font font2=new Font("Comic Sans MS",Font.BOLD,18);
		Font font3=new Font("forte",Font.BOLD,30);

		tf.setFont(font1);
		tf1.setFont(font);
		screen.setFont(font2);
		tf2.setFont(font);
		myimage.setFont(font3);

		a3.setFont(font1);
		b1.setFont(font3);
	    f.setLayout(null);

		 start=new JButton();
		 start.setIcon(new ImageIcon(".//start.gif"));
		 start.setBounds(50,580,150,60);
		 start.addActionListener(o);
		 f.add(start);

		 reset=new JButton("Reset");
		 reset.setIcon(new ImageIcon(".//reset.png"));
		 reset.setBounds(40,170,120,40);
		 reset.setBackground(Color.BLACK);
		 reset.setForeground(Color.GREEN);
		 reset.addActionListener(o);
		 f.add(reset);

		 f.setLayout(null);
		 f.setLayout(null);
		 f.setVisible(true);
		 f.setResizable(false);
		 f.setSize(990,735);
		 f.getContentPane().setBackground(new Color(243, 156, 18));
	}

	public static void main(String[] args) {
		SnakeandLadder skl=new SnakeandLadder();
	}
}


class Listener1 implements ActionListener{
	SnakeandLadder d;
	int rno,x1,y1;
	static int ps1,ps2;
	static int w;
	Rectangle r=new Rectangle();
	double y,z;

	Listener1(SnakeandLadder d){
		this.d=d;
	}
	void randomNumber()
	{
		Random generator = new Random();
		rno = generator.nextInt(6) + 1;                // random number storing to rno
		d.myimage.setText(String.valueOf(rno));
		playSound("RollDie.wav");
		d.a3.setVisible(true);
	}

 public static synchronized void playSound(String url1) {
    new Thread(new Runnable() { // the wrapper thread is unnecessary, unless it blocks on the Clip finishing, see comments
      public void run() {
        try {
        	  URL url = this.getClass().getClassLoader().getResource(url1);
          Clip clip = AudioSystem.getClip();
          AudioInputStream inputStream = AudioSystem.getAudioInputStream(url);
          // System.out.println("hello");
          clip.open(inputStream);
          clip.start(); 
        } catch (Exception e) {
          System.err.println(e.getMessage());
        }
      }
    }).start();
  }
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==d.reset){
			d.m[1].setBounds(140,650,20,52);
		    d.m[2].setBounds(70,650,20,52);
		    d.myimage.setText(" ");
			ps1=0;
			w=0;
			ps2=0;
		}
		// else if(e.getSource()==d.au)
		// {
		// 	JFrame jn=new JFrame("About Us");
		// 	jn.setBounds(20,20,900,562);
		// 	jn.setSize(900,600);
		// 	jn.setVisible(true);
		// 	JLabel 	a4=new JLabel();
	 //  		a4.setBounds(0,0,900,562);
	 //  		a4.setText("");
	 //  		a4.setIcon(new ImageIcon(".//ma.jpg"));
		// 	jn.add(a4);
		// }
		else if(e.getSource()==d.b1)
        {
        	randomNumber();
        	int[] su={27,40,43,54,66,76,89,99};
			int[] sd={5,3,18,31,45,58,53,41};
			int[] ld={4,13,33,42,50,62,74};
			int[] lu={25,46,49,63,69,81,92};
        	if(ps1<100 && ps2<100){
				if(w%2==0){
					d.screen.setText("Player 2 chance");
					w++;
					if((ps1+rno)<101){
						ps1=ps1+rno;
						r=d.l[ps1].getBounds();
				   		y=r.getX();
						z=r.getY();
					 	x1=(int)Math.round(y);
					 	y1=(int)Math.round(z);
						d.m[1].setBounds((x1+10),(y1+20),20,52);
						for(int i=0;i<su.length;i++){
							if(ps1==su[i]){
								playSound("Snake.wav");
								r=d.l[sd[i]].getBounds();
								y=r.getX();
								z=r.getY();
								x1=(int)Math.round(y);
								y1=(int)Math.round(z);
								d.m[1].setBounds((x1+10),(y1+17),20,52);
								ps1=sd[i];
							}
						}
						for(int i=0;i<ld.length;i++){
							if(ps1==ld[i]){
								playSound("Ladder.wav");
								r=d.l[lu[i]].getBounds();
							   y=r.getX();
							   z=r.getY();
							   x1=(int)Math.round(y);
							   y1=(int)Math.round(z);
							   d.m[1].setBounds((x1+10),(y1+16),20,52);
								ps1=lu[i];

							}
						}
					}
					// else{
					// 	d.screen.setText("Player1 wins");
					//     return;

					// }

				}
				else{
					d.screen.setText("Player 1 chance");
					w++;
					if((ps2+rno)<101){
						ps2=ps2+rno;
						r=d.l[ps2].getBounds();
						y=r.getX();
						z=r.getY();
						x1=(int)Math.round(y);
						y1=(int)Math.round(z);
						d.m[2].setBounds((x1+30),(y1+20),20,52);

						for(int i=0;i<su.length;i++){
							if(ps2==su[i]){
								playSound("Snake.wav");
								r=d.l[sd[i]].getBounds();
								y=r.getX();
								z=r.getY();
								x1=(int)Math.round(y);
								y1=(int)Math.round(z);
								d.m[2].setBounds((x1+30),(y1+17),20,52);
								ps2=sd[i];

							}
						}
						for(int i=0;i<ld.length;i++){
							if(ps2==ld[i]){
								playSound("Ladder.wav");
								r=d.l[lu[i]].getBounds();
							    y=r.getX();
							    z=r.getY();
							    x1=(int)Math.round(y);
							    y1=(int)Math.round(z);
							    d.m[2].setBounds((x1+30),(y1+16),20,52);
								ps2=lu[i];

							}
						}
					}
					// else{
					// 	d.screen.setText("Player 2 wins");
					// 	return;
					// }

				}
				if(ps1==100)
					d.screen.setText("Player1 wins");
				else if(ps2==100)
					d.screen.setText("Player2 wins");
			}
        }
	
	}
}