//--------------------------------------------
   // // importing Java AWT class
    // import java.awt.*;
    // // class AWTExample2 directly creates instance of Frame class
    // class AWTExample2 {
    // // initializing using constructor  AWTExample2() {
    // // creating a Frame  Frame f = new Frame();
    // // creating a Label
    // Label l = new Label("Employee id:");
    // // creating a Button
    // Button b = new Button("Submit");
    // // creating a TextField  TextField t = new TextField();
    // // setting position of above components in the frame
    // l.setBounds(20, 80, 80,30);
    // t.setBounds(20, 100, 80, 30);
    // b.setBounds(100, 100, 80, 30);
    // // adding components into frame
    // f.add(b);
    // f.add(l);
    // f.add(t);
    // // frame size 300 width and 300 height
    // f.setSize(400,300);
    // // setting the title of frame  f.setTitle("Employee info");
    // // no layout  f.setLayout(null);
    // // setting visibility of frame  f.setVisible(true);
    // }
    // // main method
    // public static void main(String args[ ]) {
    //     // creating instance of Frame class  AWTExample2 awt_obj = new AWTExample2();
    //     }	}
        
//------------------------------------------------


import java.awt.*;
class MyLoginWindow extends Frame
{
    TextField name,pass;
    Button b1,b2;
    MyLoginWindow()
    {
        setLayout(new FlowLayout());
        this.setLayout(null);
        Label n=new Label("Name:",Label.CENTER);
        Label p=new Label("password:",Label.CENTER);
        name=new TextField(20);
        pass=new TextField(20);
        pass.setEchoChar('#');
        b1=new Button("submit");
        b2=new Button("cancel");
        this.add(n);
        this.add(name);
        this.add(p);
        this.add(pass);
        this.add(b1);
        this.add(b2);
        n.setBounds(70,90,90,60);
        p.setBounds(70,130,90,60);
        name.setBounds(200,100,90,20);
        pass.setBounds(200,140,90,20);
        b1.setBounds(100,260,70,40);
        b2.setBounds(180,260,70,40);
        System.out.println(name);
        System.out.println(pass);
    }
    public static void main(String args[])
    {
        MyLoginWindow ml=new MyLoginWindow();
        ml.setVisible(true);
        ml.setSize(400,400);
        ml.setTitle("my login window");
 
    }
}