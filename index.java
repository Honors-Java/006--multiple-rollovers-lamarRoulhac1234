void setup() {
    size(400, 400);
}

void draw() {
    background(255);
    stroke(0);

  //start creating the lines
line(200, 0, 200, 400);
line(0, 200, 400, 200);

  //Fill a black color
  fill(0);

  //Build your conditional statement 
if (mouseX <= 200 & mouseY <= 200){
    rect(0, 0, 200, 200);

}


if (mouseX >= 200 & mouseY <= 200){
    rect(200, 0, 200, 200);

}

if (mouseX <= 200 & mouseY >= 200){
    rect(0, 200, 200, 200);

}

if (mouseX >= 200 & mouseY >= 200){
    rect(200, 200, 200, 200);
}

}