boolean happy = true;
int a=1;
int b=2;
String x = "Hello";
String y = "World!";

void setup() {
   if (iAmHappy())
   {
     println("I clap my hands");
   }
   else
   {
     println("I don't clap my hands"); 
   }
sum(200,350 );
CAPS("abc");
println (CAPS("abc"));
}


boolean iAmHappy()
{
  return(happy);
  
}

void draw(){
returnUpper("hello","world");

}

int sum(int a, int b ){
int total= a +b;
println(a+b);
return(a+b);
}  

void returnUpper(String x , String y){

x= x.toUpperCase();
y = y.toUpperCase();
println(x+y);
}

boolean CAPS(String ZZ){
  char O = ZZ.charAt(0);   
  if (Character.isUpperCase(O))   {   
  return true;   
}   
  return false; 

}
  
  
  
