import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class CalculatorUi extends Frame implements ActionListener{

    private TextField display;
    private Font font1,font2; 
    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,del,clear,dot,modulo,plus,minus,multiply,divide,equal;
    public CalculatorUi(){
        display = new TextField();
        font1 = new Font("Arial",Font.PLAIN,26);
        font2 = new Font("Arial",Font.PLAIN,20);

        display.setBounds(45,50,260,80);
        display.setFont(font1);
        display.setBackground(Color.decode("#202020"));
        display.setForeground(Color.WHITE);

        btn7 = new Button("7");
        btn7.setBounds(45,220,50,50);
        btn7.setBackground(Color.decode("#CFD0D3"));

        btn8 = new Button("8");
        btn8.setBounds(115,220,50,50);
        btn8.setBackground(Color.decode("#CFD0D3"));


        btn9 = new Button("9");
        btn9.setBounds(185,220,50,50);
        btn9.setBackground(Color.decode("#CFD0D3"));


        del = new Button("del");
        del.setBounds(255, 150, 50, 50);
        del.setForeground(Color.BLUE);
       
        multiply = new Button("x");
        multiply.setBounds(185,150,50,50);
        multiply.setForeground(Color.BLUE);
       
        divide = new Button("÷");
        divide.setBounds(115,150,50,50);
        divide.setForeground(Color.BLUE);
        divide.setFont(font2);

        clear = new Button("AC");
        clear.setBounds(45,150,50,50);
        clear.setForeground(Color.BLUE);


        btn4 = new Button("4");
        btn4.setBounds(45,290,50,50);
        btn4.setBackground(Color.decode("#CFD0D3"));


        btn5 = new Button("5");
        btn5.setBounds(115,290,50,50);
        btn5.setBackground(Color.decode("#CFD0D3"));

        btn6 = new Button("6");
        btn6.setBounds(185,290,50,50);
        btn6.setBackground(Color.decode("#CFD0D3"));

        minus = new Button("-");
        minus.setBounds(255, 220, 50, 50);
        minus.setBackground(Color.decode("#CFD0D3"));

        btn1 = new Button("1");
        btn1.setBounds(45,360,50,50);
        btn1.setBackground(Color.decode("#CFD0D3"));

        btn2 = new Button("2");
        btn2.setBounds(115,360,50,50);
        btn2.setBackground(Color.decode("#CFD0D3"));

        btn3 = new Button("3");
        btn3.setBounds(185,360,50,50);
        btn3.setBackground(Color.decode("#CFD0D3"));

        plus = new Button("+");
        plus.setBounds(255, 290, 50, 50);
        plus.setForeground(Color.BLUE);

        modulo = new Button("%");
        modulo.setBounds(45,430,50,50);
        modulo.setForeground(Color.BLUE);

        btn0 = new Button("0");
        btn0.setBounds(115,430,50,50);
        btn0.setBackground(Color.decode("#CFD0D3"));
        
        dot = new Button(".");
        dot.setBounds(185,430,50,50);
        dot.setBackground(Color.decode("#CFD0D3"));

        equal = new Button("=");
        equal.setBounds(255, 360, 50, 120);
        equal.setBackground(Color.BLUE);
        equal.setForeground(Color.WHITE);

        add(display);
        add(btn9);
        add(btn8);
        add(btn7);
        add(btn6);
        add(btn5);
        add(btn4);
        add(btn3);
        add(btn2);
        add(btn1);
        add(btn0);
        add(multiply);
        add(divide);
        add(plus);
        add(minus);
        add(clear);
        add(equal);
        add(del);
        add(dot);
        add(modulo);
        setBackground(Color.decode("#202020"));
        setLayout(null);
        setSize(350,530 );
        setVisible(true);
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        dot.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        modulo.addActionListener(this);
        clear.addActionListener(this);
        del.addActionListener(this);
        equal.addActionListener(this);
        addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
              System.exit(0);
            }
        });
    }



    @Override
    public void actionPerformed(ActionEvent e) {
       final Object src= e.getSource();
       if(src == btn1){
        display.setText(display.getText()+"1");
       }
       if(src == btn2){
        display.setText(display.getText()+"2");
       }
       if(src == btn3){
        display.setText(display.getText()+"3");
       }
       if(src == btn4){
        display.setText(display.getText()+"4");
       }
       if(src == btn5){
        display.setText(display.getText()+"5");
       }
       if(src == btn6){
        display.setText(display.getText()+"6");
       }
       if(src == btn7){
        display.setText(display.getText()+"7");
       }
       if(src == btn8){
        display.setText(display.getText()+"8");
       }
       if(src == btn9){
        display.setText(display.getText()+"9");
       }
       if(src == btn0){
        display.setText(display.getText()+"0");
       }
       if(src == plus){
        display.setText(display.getText()+"+");
       }
       if(src == minus){
        display.setText(display.getText()+"-");
       }
       if(src == multiply){
        display.setText(display.getText()+"x");
       }
       if(src == divide){
        display.setText(display.getText()+"÷");
       }
       if(src == modulo){
        display.setText(display.getText()+"%");
       }
       if(src == dot){
        display.setText(display.getText()+".");
       }
       if(src == del){
        if(!display.getText().isEmpty()){
            String new_str =display.getText().substring(0,display.getText().length()-1);
            display.setText(new_str);
        }
       }
       if(src == clear){
        display.setText("");
       }
       if(src == equal){
        SimpleCalculator sc = new SimpleCalculator(display.getText());
        display.setText(sc.evaluate());
       }

    } 
}

