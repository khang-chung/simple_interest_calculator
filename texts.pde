PFont f;
String title = "Simple Interest Calculator";
String des = "Interest = P x r x t";
String desCont = "Total = P x (1 + (r x t))";
String desContagain = "Total is the principal amount + interest";
String pdes = "Principle Amount- The amount of money loaned/borrowed";
String rdes = "Percent Interest Rate- The rate of interest anually(yearly) in percent";
String tdes = "Time(years)- If half a year, use 0.5, etc.";


void textStuff() {
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
