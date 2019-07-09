import controlP5.*;

ControlP5 cp5;

String p;
String r;
String t;
float i;
float ti;
float np;
float nr;
float nt;


void textBox() {
  
  cp5 = new ControlP5(this); //so that "new ControlP5(this);" can be shortened to "cp5" -- mainly for efficiency
  
  cp5.addTextfield("p").setPosition(10, 100).setSize(50, 15).setAutoClear(false);  //create textbox for p
  
  cp5.addTextfield("r").setPosition(10, 160).setSize(50, 15).setAutoClear(false);  //create textbox for r
  
  cp5.addTextfield("t").setPosition(10, 220).setSize(50, 15).setAutoClear(false);  //create textbox for t
  
  cp5.addBang("Submit").setPosition(10, 300).setSize(50, 20);  //create submit button
}

void Submit() {
  p = cp5.get(Textfield.class, "p").getText();  //get the text inputted into the textbox and store value as p
  np = float(p);  //turn string p value into float value np
  r = cp5.get(Textfield.class, "r").getText();
  nr = float(r)/100;  //turn string r value into float nr
  t = cp5.get(Textfield.class, "t").getText();
  nt = float(t);  //turn string t value into float nt
  
  i = np * nr * nt;  //interest equation
  ti = np *(1 + (nr * nt));  //total equation
  
  println(i);  //print in console
  println(ti);  //print in console
 

}
