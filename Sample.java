import java.awt.*;

class Sample extends Frame
{

Sample()
{
//Set the title of window

 //Set the size of the frame.  setVisible(true);	//Make window 
Label l=new Label("UserId: ");
TextField t = new TextField ("--- UserId Here ---");

Button button = new Button("login!");  
button.setBounds(80,60,140,40);  
l.setBounds(20, 80, 80, 30);
t.setBounds(20, 100, 80, 30);


add(button);
add(l);
add(t);
}
public static void main(String args[])
{
    Sample ml=new Sample();
    ml.setVisible(true);
    ml.setSize(300,140);
    ml.setTitle("my login window");
    
}}
