// //////////////////////////////    Question 1   /////////////////////////////////////////



// import java.util.*;
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("HELLO WORLD");
        
//     }
// }



// //////////////////////////////    Question 2   /////////////////////////////////////////


// import java.util.*;
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter  Number 1:");
//         int a=sc.nextInt();
//         System.out.println("Enter  Number 2:");
//         int b=sc.nextInt();
//         System.out.println("Sum:"+(a+b));
//         System.out.println("Product:"+(a*b));
//         System.out.println("Difference:"+(a-b));
//         System.out.println("Quotient:"+(a/b)); 
//     }
// }



// //////////////////////////////    Question 3   /////////////////////////////////////////



// import java.util.*;
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Your Name:");
//         String name=sc.nextLine();
//         System.out.println("Welcome :"+name);  
//     }
// }



// //////////////////////////////    Question 4   /////////////////////////////////////////




// import java.util.*;
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Radius");
//         float r=sc.nextFloat();
//         float area=3.14f*r*r;
//         float circumference=2*3.14f*r;
//         System.out.println("Area of Circle is: "+area);
//         System.out.println("Circumference of Circle is: "+circumference);
        
//     }
// }



// //////////////////////////////    Question 5   /////////////////////////////////////////



// import java.util.*;
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Width:");
//         float width=sc.nextFloat();
//         System.out.println("Enter Height:");
//         float height=sc.nextFloat();
//         float area=width*height;
//         float perimeter=2*(width+height);
//         System.out.println("Area of Rectangle is: "+area);
//         System.out.println("Perimeter of Rectangle is: "+perimeter);
//     }
// }




// //////////////////////////////    Question 6   /////////////////////////////////////////




// import java.util.*;
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Principal Amount:");
//         int principal=sc.nextInt();
//         System.out.println("Enter Rate of Interest:");
//         float rate=sc.nextFloat();
//         System.out.println("Enter Time in Month:");
//         int time=sc.nextInt();
//         int interest=(int)((principal*rate*time)/100);
//         System.out.println("Simple Interest is: "+interest);
//         System.out.println("Compund Interest :"+(principal+interest));
        
        
//     }
// }



// //////////////////////////////    Question 7   /////////////////////////////////////////




// import java.util.*;
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Your Name:");
//         String name=sc.nextLine();
//         System.out.println("Enter Your Address:");
//         String address=sc.nextLine();
//         System.out.println("Enter Your Phone Number:");
//         String phoneNumber=sc.nextLine();
//         System.out.println("Name: "+name);
//         System.out.println("Address: "+address);
//         System.out.println("Phone Number: "+phoneNumber);
        
//     }
// }





// //////////////////////////////    Question 8   /////////////////////////////////////////



// import java.util.*;
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Second value:");
//         int secondValue=sc.nextInt();
//         int hours=secondValue/3600;
//         int minutes=(secondValue%3600)/60;
//         int seconds=secondValue%60;
//         System.out.println("Hours: "+hours);
//         System.out.println("Minutes: "+minutes);
//         System.out.println("Seconds: "+seconds);
        
//     }
// }



// //////////////////////////////    Question 9   /////////////////////////////////////////




// import java.util.*;
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter no of days:");
//         int days=sc.nextInt();
//         int years=days/365;
//         int months=(days%365)/30;
//         int day=days%30;
//         System.out.println(years+" year(S)");
//         System.out.println(months+" month(S)");
//         System.out.println(day+" day(S)");
        
//     }
// }




// //////////////////////////////    Question 10   /////////////////////////////////////////




// import java.util.*;
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter 5 Numbers:");
//         int n1,n2,n3,n4,n5;
//         System.out.println("Enter the first number:");
//         n1=sc.nextInt();
//         System.out.println("Enter the second number:");
//         n2=sc.nextInt();
//         System.out.println("Enter the third number:");
//         n3=sc.nextInt();
//         System.out.println("Enter the fourth number:");
//         n4=sc.nextInt();
//         System.out.println("Enter the fifth number:");
//         n5=sc.nextInt();

//         int sum = 0; 
//         sum += (n1 % 2 == 0) ? n1 : 0;
//         sum += (n2 % 2 == 0) ? n2 : 0;
//         sum += (n3 % 2 == 0) ? n3 : 0;
//         sum += (n4 % 2 == 0) ? n4 : 0;
//         sum += (n5 % 2 == 0) ? n5 : 0;
      
//         System.out.println("Sum of all odd values:"+sum);
        
//     }
// }



// //////////////////////////////    Question 11   /////////////////////////////////////////




// import java.util.*;
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Two Numbers:");
//         System.out.println("Enter First Number:");
//         int n1=sc.nextInt();
//         System.out.println("Enter Second Number:");
//         int n2=sc.nextInt();
//         String result;
//         result=(n2%n1==0)?"Multiplied":"Not Multiplied";
//         System.out.println(result);
        
//     }
// }




// //////////////////////////////    Question 12   /////////////////////////////////////////






// import java.util.*;
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a Number between 1 to 12:");
//         int no=sc.nextInt();
//         String monthName;
//         monthName=(no==1)?"January":(no==2)?"February":(no==3)?"March":(no==4)?"April":(no==5)?"May":(no==6)?"June":(no==7)?"July":(no==8)?"August":(no==9)?"September":(no==10)?"October":(no==11)?"November":"December";
//         System.out.println(monthName);
//     }
// }



// //////////////////////////////    Question 13   /////////////////////////////////////////
// /// 
//  import java.util.*;
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter 5 Numbers:");
//         int n1,n2,n3,n4,n5;
//         System.out.println("Enter the first number:");
//         n1=sc.nextInt();    
//         System.out.println("Enter the second number:");
//         n2=sc.nextInt();
//         System.out.println("Enter the third number:");
//         n3=sc.nextInt();
//         System.out.println("Enter the fourth number:");
//         n4=sc.nextInt();
//         System.out.println("Enter the fifth number:");
//         n5=sc.nextInt();
      
//       int pos=0;
//       int neg=0;
//       pos+=(n1>0)?1:0;
//       pos+=(n2>0)?1:0;  
//         pos+=(n3>0)?1:0;
//         pos+=(n4>0)?1:0;
//         pos+=(n5>0)?1:0;
//         neg+=(n1<0)?1:0;
//         neg+=(n2<0)?1:0;
//         neg+=(n3<0)?1:0;
//         neg+=(n4<0)?1:0;
//         neg+=(n5<0)?1:0;
//         System.out.println("Positive Numbers: "+pos);
//         System.out.println("Negative Numbers: "+neg);

       
        
//     }
// }




// //////////////////////////////    Question 14  /////////////////////////////////////////



// import java.util.*;
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter 5 Numbers:");
//         int n1,n2,n3,n4,n5;
//         System.out.println("Enter the first number:");
//         n1=sc.nextInt();    
//         System.out.println("Enter the second number:");
//         n2=sc.nextInt();
//         System.out.println("Enter the third number:");
//         n3=sc.nextInt();
//         System.out.println("Enter the fourth number:");
//         n4=sc.nextInt();
//         System.out.println("Enter the fifth number:");
//         n5=sc.nextInt();
      
//        int pos=0; 
//        int sum=0;
//        sum+=(n1>0)?n1:0;
//        sum+=(n2>0)?n2:0;
//          sum+=(n3>0)?n3:0;
//             sum+=(n4>0)?n4:0;
//             sum+=(n5>0)?n5:0;
//        pos+=(n1>0)?1:0;
//        pos+=(n2>0)?1:0;
//          pos+=(n3>0)?1:0;
//          pos+=(n4>0)?1:0;
//         pos+=(n5>0)?1:0;
//        float avg=(float)sum/pos;
//        System.out.println("Average of all positive values:"+avg);
//        System.out.println(pos);

       
        
//     }
// }





// //////////////////////////////    Question 15   /////////////////////////////////////////




// import java.util.*;
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 5 Number:");
//         int n1, n2, n3, n4, n5;
//         System.out.println("Enter the first number:");
//         n1 = sc.nextInt();
//         System.out.println("Enter the second number:");
//         n2 = sc.nextInt();
//         System.out.println("Enter the third number:");
//         n3 = sc.nextInt();
//         System.out.println("Enter the fourth number:");
//         n4 = sc.nextInt();
//         System.out.println("Enter the fifth number:");
//         n5 = sc.nextInt();
//         int sum = 0;
//         sum+=(n1%2==0)?0:n1;
//         sum+=(n2%2==0)?0:n2;
//         sum+=(n3%2==0)?0:n3;
//         sum+=(n4%2==0)?0:n4;
//         sum+=(n5%2==0)?0:n5;
//         System.out.println("Sum of all odd values:" + sum);
       
//     }
// }



// //////////////////////////////    Question 16  /////////////////////////////////////////




// import java.util.*;
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Centigrade value:");
//         int centigrade = sc.nextInt();
//         float fahrenheit = (centigrade * 9 / 5) + 32;
//         System.out.println("Fahrenheit value is: " + fahrenheit);
//         System.out.println("Enter Fahrenheit value:");
//         fahrenheit = sc.nextInt();
//         centigrade = (int) ((fahrenheit - 32) * 5 / 9);
//         System.out.println("Centigrade value is: " + centigrade);
       
//     }
// }




// //////////////////////////////    Question 17   /////////////////////////////////////////



// import java.util.*;
// public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter input numrator:");
//         int numrator = sc.nextInt();
//         System.out.println("Enter input denominator:");
//         int denominator = sc.nextInt();
//         int Quotient= numrator / denominator;
//         int Remainder= numrator % denominator;
//         System.out.println("Quotient is: " + Quotient);
//         System.out.println("Remainder is: " + Remainder);
       
//     }
// }