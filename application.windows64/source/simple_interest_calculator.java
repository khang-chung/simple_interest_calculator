import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import controlP5.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class simple_interest_calculator extends PApplet {

public void setup() {
  
  textBox(); //creates all the textboxes for users to input numbers as well as calculate the interest and total
}

public void draw() {
  background(0);  //black background
  textStuff();  //all of the words
  
  
}


ControlP5 cp5;

String p;
String r;
String t;
float i;
float ti;
float np;
float nr;
float nt;


public void textBox() {
  
  cp5 = new ControlP5(this); //so that "new ControlP5(this);" can be shortened to "cp5" -- mainly for efficiency
  
  cp5.addTextfield("p").setPosition(10, 100).setSize(50, 15).setAutoClear(false);  //create textbox for p
  
  cp5.addTextfield("r").setPosition(10, 160).setSize(50, 15).setAutoClear(false);  //create textbox for r
  
  cp5.addTextfield("t").setPosition(10, 220).setSize(50, 15).setAutoClear(false);  //create textbox for t
  
  cp5.addBang("Submit").setPosition(10, 300).setSize(50, 20);  //create submit button
}

public void Submit() {
  p = cp5.get(Textfield.class, "p").getText();  //get the text inputted into the textbox and store value as p
  np = PApplet.parseFloat(p);  //turn string p value into float value np
  r = cp5.get(Textfield.class, "r").getText();
  nr = PApplet.parseFloat(r)/100;  //turn string r value into float nr
  t = cp5.get(Textfield.class, "t").getText();
  nt = PApplet.parseFloat(t);  //turn string t value into float nt
  
  i = np * nr * nt;  //interest equation
  ti = np *(1 + (nr * nt));  //total equation
  
  println(i);  //print in console
  println(ti);  //print in console
 

}
PFont f;
String title = "Simple Interest Calculator";
String des = "Interest = P x r x t";
String desCont = "Total = P x (1 + (r x t))";
String desContagain = "Total is the principal amount + interest";
String pdes = "Principle Amount- The amount of money loaned/borrowed";
String rdes = "Percent Interest Rate- The rate of interest anually(yearly) in percent";
String tdes = "Time(years)- If half a year, use 0.5, etc.";


public void textStuff() {
  f = createFont("Arial",36,true); //create the font class

  textFont(f, 24); //title
  fill(255);
  textAlign(LEFT);
  text(title, 1, 20);
  
  textFont(f, 12);  //description line 1
  fill(255);
  textAlign(LEFT);
  text(des, 10, 40);
  
  textFont(f, 12);  //description line 2
  fill(255);
  textAlign(LEFT);
  text(desCont, 10, 52);
  
  textFont(f, 12);  //description line 3
  fill(255);
  textAlign(LEFT);
  text(desContagain, 10, 64);
  
  
  textFont(f, 12);  //principle amount description
  fill(255);
  textAlign(LEFT);
  text(pdes, 10, 95);
  
  textFont(f, 12);  //interest rate description
  fill(255);
  textAlign(LEFT);
  text(rdes, 10, 155);
  
  textFont(f, 12);  //time description
  fill(255);
  textAlign(LEFT);
  text(tdes, 10, 215);

  textFont(f, 24);  //interest calculated
  fill(255);
  textAlign(CENTER);
  text("Interest: $" + i, width/2, 350);
  
  textFont(f, 24);  //total calculated
  fill(255);
  textAlign(CENTER);
  text("Total: $" + ti, width/2, 380);
}
  public void settings() {  size(400, 400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "simple_interest_calculator" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
