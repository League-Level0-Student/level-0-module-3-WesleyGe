void draw() {
  circle(100);
}
  void circle(int xLoc){
    int x=0;
for( int k=0; k<= 20; k++){
  

     noFill();
    ellipse(xLoc,150,120-x,120-x);
  
    x=x+15;
}
  }

void setup(){
size(1000,1000);
}
