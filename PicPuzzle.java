import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class PicPuzzle extends JFrame implements ActionListener{
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,sample,sbut;
Icon temp;
int count,count1,gamepoint;
Icon samicon1=new ImageIcon("pic/main.jpg");
Icon samicon2=new ImageIcon("pic/main2.jpg");
Icon ic1=new ImageIcon("pic/1.jpg");
Icon ic2=new ImageIcon("pic/5.jpg");
Icon ic3=new ImageIcon("pic/2.jpg");
Icon ic4=new ImageIcon("pic/7.jpg");
Icon ic5=new ImageIcon("pic/4.jpg");
Icon ic6=new ImageIcon("pic/6.jpg");
Icon ic7=new ImageIcon("pic/8.jpg");
Icon ic8=new ImageIcon("pic/9.jpg");
Icon ic9=new ImageIcon("pic/3.jpg");

Icon ic11=new ImageIcon("pic/12.jpg");
Icon ic12=new ImageIcon("pic/13.jpg");
Icon ic13=new ImageIcon("pic/16.jpg");
Icon ic14=new ImageIcon("pic/11.jpg");
Icon ic15=new ImageIcon("pic/14.jpg");
Icon ic16=new ImageIcon("pic/19.jpg");
Icon ic17=new ImageIcon("pic/17.jpg");
Icon ic18=new ImageIcon("pic/15.jpg");
Icon ic19=new ImageIcon("pic/18.jpg");
JButton but;

public PicPuzzle(){

b1=new JButton(ic1);
b1.setBounds(10,80,100,100);
b2=new JButton(ic2);
b2.setBounds(110,80,100,100);
b3=new JButton(ic3);
b3.setBounds(210,80,100,100);
b4=new JButton(ic4);
b4.setBounds(10,180,100,100);
b5=new JButton(ic5);
b5.setBounds(110,180,100,100);
b6=new JButton(ic6);
b6.setBounds(210,180,100,100);
b7=new JButton(ic7);
b7.setBounds(10,280,100,100);
b8=new JButton(ic8);
b8.setBounds(110,280,100,100);
b9=new JButton(ic9);
b9.setBounds(210,280,100,100);
sample=new JButton(samicon1);
sample.setBounds(380,100,200,200);
sbut=new JButton("Submit");
sbut.setBounds(10,390,100,20);
JLabel l1=new JLabel("Actual Picture:");
l1.setBounds(390,80,100,20);
but=new JButton("Click to get next picture");
but.setBounds(400,390,180,20);

add(b1);add(b2);add(b3);
add(b4);add(b5);add(b6);
add(b7);add(b8);add(b9);
add(sample);add(l1);add(but);add(sbut);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this); 
but.addActionListener(this);
sbut.addActionListener(this);
setTitle("Picture Puzzle");
setLayout(null);
setSize(600,500);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent e){
count++;
if(e.getSource()==sbut){
	if(b1.getIcon()==ic1&&b2.getIcon()==ic3&&b3.getIcon()==ic9&&b4.getIcon()==ic5&&b5.getIcon()==ic2&&b6.getIcon()==ic6&&b7.getIcon()==ic4&&b8.getIcon()==ic7&&b9.getIcon()==ic8)
    {
	  JOptionPane.showMessageDialog(null,"Both picture match!! You took "+gamepoint+" moves");
    }
else if(b1.getIcon()==ic14&&b2.getIcon()==ic11&&b3.getIcon()==ic12&&b4.getIcon()==ic15&&b5.getIcon()==ic18&&b6.getIcon()==ic13&&b7.getIcon()==ic17&&b8.getIcon()==ic19&&b9.getIcon()==ic16)
     JOptionPane.showMessageDialog(null,"Both picture match!! You took "+gamepoint+" moves");
else
	 JOptionPane.showMessageDialog(null,"Both pictures dont match!!! Continue the game ...");
}
if(count==1)
{
 if(e.getSource()==b1)
  temp=b1.getIcon();
 if(e.getSource()==b2)
  temp=b2.getIcon();
 if(e.getSource()==b3)
  temp=b3.getIcon();
 if(e.getSource()==b4)
  temp=b4.getIcon();
 if(e.getSource()==b5)
  temp=b5.getIcon();
 if(e.getSource()==b6)
  temp=b6.getIcon();
 if(e.getSource()==b7)
  temp=b7.getIcon();
 if(e.getSource()==b8)
  temp=b8.getIcon();
 if(e.getSource()==b9)
  temp=b9.getIcon();
}
  if(count==2)
  {
	gamepoint++;
    count=0;
    if(e.getSource()==b1){
    Icon s1=b1.getIcon();
      if(b2.getIcon()==temp){
        b2.setIcon(s1);
        b1.setIcon(temp);
      } else if(b4.getIcon()==temp){
                    b4.setIcon(s1);
                    b1.setIcon(temp);
                   }
  }

if(e.getSource()==b2){
    Icon s1=b2.getIcon();
      if(b1.getIcon()==temp){
        b1.setIcon(s1);
        b2.setIcon(temp);
      } else if(b5.getIcon()==temp){
                    b5.setIcon(s1);
                    b2.setIcon(temp);
                   }
         else if(b3.getIcon()==temp){
                    b3.setIcon(s1);
                    b2.setIcon(temp);
                   }
  }

if(e.getSource()==b3){
    Icon s1=b3.getIcon();
      if(b2.getIcon()==temp){
        b2.setIcon(s1);
        b3.setIcon(temp);
      } else if(b6.getIcon()==temp){
                    b6.setIcon(s1);
                    b3.setIcon(temp);
                   }
  }

if(e.getSource()==b4){
    Icon s1=b4.getIcon();
      if(b1.getIcon()==temp){
        b1.setIcon(s1);
        b4.setIcon(temp);
      } else if(b5.getIcon()==temp){
                    b5.setIcon(s1);
                    b4.setIcon(temp);
                   }
         else if(b7.getIcon()==temp){
                    b7.setIcon(s1);
                    b4.setIcon(temp);
                   }
  }

if(e.getSource()==b5){
    Icon s1=b5.getIcon();
      if(b2.getIcon()==temp){
        b2.setIcon(s1);
        b5.setIcon(temp);
      } else if(b4.getIcon()==temp){
                    b4.setIcon(s1);
                    b5.setIcon(temp);
                   }
         else if(b6.getIcon()==temp){
                    b6.setIcon(s1);
                    b5.setIcon(temp);
                   }
          else if(b8.getIcon()==temp){
                    b8.setIcon(s1);
                    b5.setIcon(temp);
                   }
}

if(e.getSource()==b6){
    Icon s1=b6.getIcon();
      if(b3.getIcon()==temp){
        b3.setIcon(s1);
        b6.setIcon(temp);
      } else if(b5.getIcon()==temp){
                    b5.setIcon(s1);
                    b6.setIcon(temp);
                   }
         else if(b9.getIcon()==temp){
                    b9.setIcon(s1);
                    b6.setIcon(temp);
                   }
}

if(e.getSource()==b7){
    Icon s1=b7.getIcon();
      if(b4.getIcon()==temp){
        b4.setIcon(s1);
        b7.setIcon(temp);
      } else if(b8.getIcon()==temp){
                    b8.setIcon(s1);
                    b7.setIcon(temp);
                   }
 }

   if(e.getSource()==b8){
    Icon s1=b8.getIcon();
      if(b7.getIcon()==temp){
        b7.setIcon(s1);
        b8.setIcon(temp);
      } else if(b5.getIcon()==temp){
                    b5.setIcon(s1);
                    b8.setIcon(temp);
                   }
         else if(b9.getIcon()==temp){
                    b9.setIcon(s1);
                    b8.setIcon(temp);
                   }

  }//end of if

 if(e.getSource()==b9){
    Icon s1=b9.getIcon();
      if(b8.getIcon()==temp){
        b8.setIcon(s1);
        b9.setIcon(temp);
      } else if(b6.getIcon()==temp){
                    b6.setIcon(s1);
                    b9.setIcon(temp);
                   }
  }//end of if
  }
if(e.getSource()==but){
	count1++;
Icon s1=sample.getIcon();
if(count1==1){
sample.setIcon(samicon2);
b1.setIcon(ic11);
b2.setIcon(ic12);
b3.setIcon(ic13);
b4.setIcon(ic14);
b5.setIcon(ic15);
b6.setIcon(ic16);
b7.setIcon(ic17);
b8.setIcon(ic18);
b9.setIcon(ic19);
}//eof else
else{
	JOptionPane.showMessageDialog(null,"You have reached the end of the game");}
}
}//end of actionPerformed

public static void main(String args[])
{
new PicPuzzle();
}//end of main
}//end of class