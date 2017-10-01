import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class Login extends JFrame implements ActionListener
{
Container c;
JButton b1;
JLabel j,j1,j2,j3,j4;
 JTextField t1,t2; 
  Login()
   {
 c = this.getContentPane();
j=new JLabel(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg"));
j1=new JLabel("THINK AND FOUND.. ^.^");
j2=new JLabel("Please login with your account.");
j3=new JLabel("Username");
j4=new JLabel("Password");
t1= new JTextField();
t2 =  new JPasswordField();
b1=new JButton("Login");
j1.setBounds(180,20,400,100);
j3.setBounds(50,140,100,20);
t1.setBounds(180,140,100,20);
j4.setBounds(50,270,100,20);
t2.setBounds(180,270,100,20);
b1.setBounds(50,320,100,20);
b1.addActionListener(this);
Font f = new Font("Comic Sans MS",Font.BOLD,30);
Font f1 = new Font("Arial",Font.BOLD,20);
j1.setFont(f);
j2.setFont(f);
j3.setFont(f1);
j4.setFont(f1);
j.setBounds(0,0,1024,768);
c.setLayout(null);
c.setBackground(Color.BLACK);
j.add(j1);
j.add(j3);
j.add(j4);
j.add(t1);
j.add(t2);
j.add(b1);  
c.add(j); 
 }
 public void actionPerformed(ActionEvent e)
{
 if(t1.getText().equals("rishabh@gmail.com")&& t2.getText().equals("javagame"))
  {
	Game1 g1= new Game1();
	g1.setBackground(Color.RED);
	setVisible(false);
  }
  else
  {
  	JOptionPane.showMessageDialog(null, "Incorrect ID or Password");
  }
}
}
class Game
 {
public static void main(String[] s)
{
Login L=new Login();
L.setSize(1024,768);
L.setVisible(true);
L.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}
  }
class Game1 extends JFrame implements ActionListener
{
JButton b[][];
Object op = new Object();

Container c1,c2;
int li=1,m=2,n=3,o=4,p=5;
boolean bo,b1,b2,b3,b4;
JPanel l,l2;
JList jl;
JLabel l1;
String f,a,a1,a2,a3,a4,w=" ",e1,s3=" ";
Game1()
 {
  b = new JButton[8][8];

int i,j;
l= new JPanel(new  GridLayout(8,8,1,1));
c1 = this.getContentPane();
c2 = this.getContentPane();
Font f1 = new Font("Algerian",Font.BOLD,15);
Font f2 = new Font("Algerian",Font.BOLD,35);
l1= new JLabel("CHECK YOUR EYES MIND..");
String s1[][]={
	 { "X","L","M","E","E","F","O","P"},
	 { "C","B","R","R","S","P","R","C"},
	 {  "Z","I","A","I","Z","E","I","E"},
	 { "F","U","V","A","A","S","S","R"},
  	 { "L","M","N","T","I","H","H","E"},
	 { "B","O","H","L","E","G","A","T"},
	 { "U","E","A","R","T","H","B","A"},
	 { "R","H","E","Y","M","A","H","W"},
	};

String list[]={"Clue 1. Albert Einstien formulated first postulate for this 'space' Hypothesis..?","Clue 2. I get bigger when I eat,but die weaker when I Drink..?","Clue 3. Three Lives have I Gentle enough to soothe the skin,Light enough to float in sky,Hard enough to crack rocks..?","Clue 4.I am always around you but often forgotten.I am pure and clean most time,but occasionally rotten..?","Clue 5.Yes.It is Sphere full of all the things you fill find above"};
jl = new JList(list);
jl.setVisibleRowCount(4);
jl.setBackground(Color.YELLOW);
jl.setFont(f1);
JScrollPane lp = new JScrollPane(jl); 
l2 = new JPanel();
l2.add(lp);
for(i=0;i<b.length;i++)
 {
  for(j=0;j<b.length;j++)
{
b[i][j]=new JButton(s1[i][j]);
op=b[0][0];
b[i][j].addActionListener(this);
l.add(b[i][j]);
b[i][j].setFont(f1);
b[i][j].setForeground(Color.WHITE);
b[i][j].setBackground(Color.BLACK);
}
 }
l1.setFont(f2);
//l2.setLayout(new BorderLayout(0,10));
c2.setLayout(new FlowLayout());
//c1.setPreferredSize(new Dimension(200,200));
c1.setBackground(Color.RED);
c1.add(l1,BorderLayout.NORTH);
c2.add(l);
c2.add(l2,BorderLayout.SOUTH);
c2.setBackground(Color.RED);
setSize(1200,1200);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
 public void actionPerformed(ActionEvent e)
 {
Object ob=e.getSource();
w=w+ob+" ";
a=(" "+(b[3][0])+" "+(b[2][1])+" "+(b[1][2])+" "+(b[0][3])+" ");
a1=" "+b[3][3]+" "+b[2][3]+" "+b[1][3]+" ";
a2=" "+b[7][7]+" "+b[6][7]+" "+b[5][7]+" "+b[4][7]+" "+b[3][7]+" ";
a3=(" "+(b[6][1])+" "+(b[6][2])+" "+(b[6][3])+" "+(b[6][4])+" "+(b[6][5])+" ");
a4=(" "+(b[2][5])+" "+(b[3][4])+" "+(b[4][3])+" "+(b[5][2])+" "+b[6][1]+" "+b[7][0]+" ");
bo =w.contains(a);
b1 =w.contains(a1);
b2 =w.contains(a2);
b3 =w.contains(a3);
b4 =w.contains(a4);
if(bo==true)
{ 
b[3][0].setBackground(Color.RED);
b[2][1].setBackground(Color.RED);
b[1][2].setBackground(Color.RED);
b[0][3].setBackground(Color.RED);
w=" ";
 }
if(b1==true)
 {
b[3][3].setBackground(Color.LIGHT_GRAY);
b[2][3].setBackground(Color.LIGHT_GRAY);
b[1][3].setBackground(Color.LIGHT_GRAY);
w=" ";
 }
if(b2==true)
{
b[7][7].setBackground(Color.BLUE);
b[6][7].setBackground(Color.BLUE);
b[5][7].setBackground(Color.BLUE);
b[3][7].setBackground(Color.BLUE);
b[4][7].setBackground(Color.BLUE);
w=" "; 
}
if(b3==true)
  {
b[6][1].setBackground(Color.GREEN);
b[6][2].setBackground(Color.GREEN);
b[6][3].setBackground(Color.GREEN);
b[6][4].setBackground(Color.GREEN);
b[6][5].setBackground(Color.GREEN);
w=" ";
 }
if(b4==true)
  {
b[2][5].setBackground(Color.YELLOW);
b[3][4].setBackground(Color.YELLOW);
b[4][3].setBackground(Color.YELLOW);
b[5][2].setBackground(Color.YELLOW);
b[6][1].setBackground(Color.YELLOW);
b[7][0].setBackground(Color.YELLOW);
w=" ";
}
}
}