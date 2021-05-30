package Laboni; // operator type

public class dataVariable {
	
	int numberx=16; //instance or global variable
	int numbery=3;
	 
	static String Green= "The tree leaf is green";//static variable
     
	public void Target() {  //custom method
		int a=20;
		int b= 6;
		float fl=(float)(a/b);
		
		System.out.println("My favourite store name is target");
		System.out.println("The value is: "+fl);
		
	}

	
	public static void main(String[] args) {
		
		String name= "sultana";
		int id=21;
		int age=29;
		double weight=60.23;
		float wealth=2054.654f;
		
		System.out.println("My name is "+name );
		System.out.println("My id is "+id );
		System.out.println("My age is "+age );
		System.out.println("My weight is "+weight);
		System.out.println("My wealth is "+ wealth);
		
		dataVariable color=new dataVariable(); //object creating
		color.Target(); //calling custom method
		System.out.println(Green); //printing static variable
	 
		//Arithmetic
		int c=15;
		int d=4;
		int result=0;
		
	  result=c+d; //addition
		System.out.println("the value is: "+ result);
	result= c-d;
	System.out.println("the value is: "+ result);
	
	result= c*d;
	System.out.println("the value is: "+ result);
	
	float fo= (float)c/d;
	System.out.println("the value is: "+ fo);
	
	 boolean bl=false; 
	 //relational operator
		  bl=c<d;
		  System.out.println("the value is: "+ bl);
		  bl=c>=d;
		  System.out.println("the value is: "+ bl);
		  bl=c!=d;
		  System.out.println("the value is: "+ bl);
		  bl=c==d;
		  System.out.println("the value is: "+ bl);
	 //logical operator(&&||)and or
		  bl=(c<d)&& (c>=d);
		  System.out.println("the value is: "+ bl);
		  bl=(c>=d)&& (c!=d);
		  System.out.println("the value is: "+ bl);
		  bl=(c<d)|| (c>=d);
		  System.out.println("the value is: "+ bl);
		  bl=(d>=c)|| (c<=d);
		  System.out.println("the value is: "+ bl);
		  bl=(d>=c)|| (c<=d)&&(c==d);
		  System.out.println("the value is: "+ bl);
     
		  //assignment operator
		   
		 c+=d; //c=c+d    (c=15,d=4)
		 System.out.println(c);
		 
		  c+=d;//c=c+d
		  System.out.println(c);
		  
		  c*=d; //c= c*d
		  System.out.println(c);
		 
		  c-=d; //c= c-d
		  System.out.println(c);
		  
		  
		  //precedence of operator
		  int e=10;
		  int f= 9;
		  int g=8;
		  
		  int h = (e+f-g*g)*((e-f+g)+f+g); //(10+9-8*8)*((10-9+8)+9+8)=-45*
		  
		  System.out.println("the value is: "+h);
		 
		  

	}

}
