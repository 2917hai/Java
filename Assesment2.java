// import java.util.*;
// public class Assesment2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         for(int i=-5; i<=5; i++)
//         {
//             System.out.println(i);
//         }
//     }
// }






// import java.util.*;
// public class Assesment2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         for(int i=100; i>=91; i--)
//         {
//             System.out.println(i);
//         }
        
//     }
// }







// import java.util.*;
// public class Assesment2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         for(int i=80; i>=70; i=i-2)
//         {
//             System.out.println(i);
//         }
        
//     }
// }







// import java.util.*;
// public class Assesment2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         for(int i=10; i<=20; i++)
//         {
//             if(i%2==0)
//             {
//                 System.out.println(i*i);
//             }
//         }
        
//     }
// }







// import java.util.*;
// public class Assesment2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         for(int i=1; i<=10; i++)
//         {
//             if(i%2!=0)
//             {
//                 System.out.println(i*i*i);
//             }
//         }
        
//     }
// }




// import java.util.*;
// public class Assesment2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int no;
//         System.out.println("Enter a number: ");
//         no = sc.nextInt();
//         int sum=0; 
//         int product=1;
//         while (no>0) {
//             int r = no % 10; 
//             sum = sum + r; 
//             product = product * r; 
//             no = no / 10; 
            
//         }
//         if(sum==product)
//         {
//             System.out.println("The number is a spy number.");
//         }
//         else
//         {
//             System.out.println("The number is not a spy number.");
//         }
        
//     }
// }







// import java.util.*;
// public class Assesment2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int[5];
//         System.out.println("Enter 5 numbers: ");
//         for(int i=0; i<5; i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         boolean check=true;
//         for(int i=0; i<arr.length; i++)
//         {
//             for(int j=i+1; j<arr.length; j++)
//             {
//                 if(arr[i]==arr[j])
//                 {
//                     check=false;
//                     break;
//                 }
//             }
//         }
//         if(check)
//         {
//             System.out.println("All numbers are unique.");
//         }
//         else
//         {
//             System.out.println("There are duplicate numbers.");
//         }
//     }
// }










// import java.util.*;
// public class Assesment2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
         
//             // find prime or not 1 to 100
//             for(int i=1; i<=100; i++)
//             {
//                 boolean isPrime = true;
//                 for(int j=2; j<i; j++)
//                 {
//                     if(i%j==0)
//                     {
//                         isPrime = false;
//                         break;
//                     }
//                 }
//                 if(isPrime && i>1)
//                 {
//                     System.out.println(i);
//                 }
//             }
        
//     }
// }






// leap year
//  import java.util.*;
//  public class Assesment2 {
//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a year: ");
//         int year = sc.nextInt();
//         if((year%4==0 && year%100!=0) || (year%400==0))
//         {
//             System.out.println(year + " is a leap year.");
//         }
//         else
//         {
//             System.out.println(year + " is not a leap year.");
//         }
//     }}









// import java.util.*;
// public class Assesment2 {
//    public static void main(String[] args) { 
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a charector: ");
//       char ch=sc.next().charAt(0);
//       for(char i='a'; i<='z'; i++)
//       {
//           if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
//           {
//               System.out.println(ch + " is a vowel.");
//               break;
//           }
//           else if(ch>='a' && ch<='z')
//           {
//               System.out.println(ch + " is a consonant.");
//               break;
//           }
//           else
//           {
//               System.out.println("Invalid input.");
//               break;
//           }
//       }
//    }}





//   narcissistic numbers between 1 and 1000
// import java.util.*;
// public class Assesment2 {
//    public static void main(String[] args) { 
//        Scanner sc = new Scanner(System.in);
//        for(int no=1; no<=1000; no++)
//        {
//          int sum=0;
//             int temp = no;
//             int digits = 0;
//             while(temp>0)
//             {
//                 temp = temp / 10;
//                 digits++;
//             }
//             temp = no;
//             while(temp>0)
//             {
//                 int mult=1;
//                 int r = temp % 10;
//                 for(int i=1; i<=digits; i++)
//                 {
//                     mult = mult * r;
//                 }
//                 sum = sum + mult;
//                 temp = temp / 10;
//             }
//             if(sum==no)
//             {
//                 System.out.println(no + " is a narcissistic number.");
//             }
//             else
//             {
//                 System.out.println(no + " is not a narcissistic number.");
//             }
//         }
//    }}






// import java.util.*;
// public class Assesment2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("select choice");
//        System.out.println("1.) Area of Triangle");
//        System.out.println("2.) Area of Equilateral Triangle");
//          System.out.println("3.) Area of Circle");

//          System.out.println("4.) Area of Rectangle");
//             System.out.println("5.) Area of Square");
//             System.out.println("enter your choice:");

//             int choice = sc.nextInt();
//             switch (choice) {
//                 case 1:
//                 {
//                     System.out.println("Enter base and height of triangle: ");
//                     double base = sc.nextDouble();
//                     double height = sc.nextDouble();
//                     double area = (base * height) / 2;
//                     System.out.println("Area of triangle is: " + area);
//                     break;
//                 }
                    
//                 case 2:
//                 {
//                     System.out.println("Enter side of equilateral triangle: ");
//                     double side = sc.nextDouble();
//                     double area = (Math.sqrt(3) / 4) * side * side;
//                     System.out.println("Area of equilateral triangle is: " + area);
//                     break;
//                 }
//                 case 3:
//                 {
//                     System.out.println("Enter radius of circle: ");
//                     double radius = sc.nextDouble();
//                     double area = Math.PI * radius * radius;
//                     System.out.println("Area of circle is: " + area);
//                     break;
//                 }
//                 case 4:
//                 {
//                     System.out.println("Enter length and breadth of rectangle: ");
//                     double length = sc.nextDouble();
//                     double breadth = sc.nextDouble();
//                     double area = length * breadth;
//                     System.out.println("Area of rectangle is: " + area);
//                     break;
//                 }
//                 case 5:
//                 {
//                     System.out.println("Enter side of square: ");
//                     double side = sc.nextDouble();
//                     double area = side * side;
//                     System.out.println("Area of square is: " + area);
//                     break;
//                 }
            
//                 default:
//                     break;
//             }

//    }
// }






// import java.util.*;
// public class Assesment2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter out of marks");
//          int outOfMarks = sc.nextInt();
//          System.out.println("enter math marks");
//          int mathMarks = sc.nextInt();
//             System.out.println("enter english marks");
//             int englishMarks = sc.nextInt();
//             System.out.println("enter hindi marks");
//             int hindiMarks = sc.nextInt();
//             System.out.println("enter science marks");
//             int scienceMarks = sc.nextInt();
//             System.out.println("enter social marks");
//             int socialMarks = sc.nextInt();
//             int totalMarks = mathMarks + englishMarks + hindiMarks + scienceMarks + socialMarks;
//             double percentage = (totalMarks * 100) / outOfMarks;
//             System.out.println("total marks: " + totalMarks);
//             System.out.println("percentage: " + percentage);
//    }
// }




// import java.util.*;
// public class Assesment2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cp,sp;
//          System.out.println("Enter cost price: ");
//             cp = sc.nextInt();
//             System.out.println("Enter selling price: ");
//             sp = sc.nextInt();
//             if(sp>cp)
//             {
//                 System.out.println("profit: " + (sp-cp));
//             }
//             else if(sp<cp)
//             {
//                 System.out.println("loss: " + (cp-sp));
//             }
//             else
//             {
//                 System.out.println("no profit no loss.");
//             }
//    }
// }





// import java.util.*;
// public class Assesment2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int age; 
//        System.out.println("Enter your age: ");
//        age = sc.nextInt();
//        if(age>=18)
//        {
//            System.out.println("You are eligible to vote.");
//        }
//        else
//        {
//            System.out.println("You are not eligible to vote.");
//        }
//    }
// }



// import java.util.*;
//     public class Assesment2 {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("enter salary amount");
//               double salary = sc.nextDouble();
//               double hra= (salary*10)/100;
//               double da= (salary*5)/100;
//               double pf= (salary*12)/100;
//               double grossSalary = salary + hra + da + pf;
//                 System.out.println("salary: " + salary);
//                 System.out.println("hra: " + hra);
//                 System.out.println("da: " + da);
//                 System.out.println("pf: " + pf);
//                 System.out.println("gross salary: " + grossSalary);
//                 System.out.println("net salary: " + (grossSalary - pf));
//                 System.out.println("net salary after tax: " + (grossSalary - pf - ((grossSalary*10)/100)));
//                 System.out.println("net salary after tax and pf: " + (grossSalary - pf - ((grossSalary*10)/100) - pf));

//        }
//     }





// import java.util.*;
// public class Assesment2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String gender;
//        int age;
//        System.out.println("Enter your gender");
//        gender = sc.nextLine();
//        if(gender.equals("male"))
//        {
//         System.out.println("Enter your age: ");
//         age = sc.nextInt();
//         if(age>=1 && age<=60)
//         {
//             System.out.println("interesrt rate is 9.2%");
//         }
       
//        else if(age>=61 && age<=120)
//        {
//         System.out.println("interesrt rate is 8.3%");
//        }
//        else 
//        {
//         System.out.println("invalid input.");
//        }
//     }
//     else if (gender.equals("female"))
//     {
//         System.out.println("Enter your age: ");
//         age = sc.nextInt();
//         if(age>=1 && age<=58)
//         {
//             System.out.println("interesrt rate is 8.2%");
//         }
//         else if(age>=59 && age<=120)
//         {
//             System.out.println("interesrt rate is 7.6%");
//         }
//         else 
//         {
//             System.out.println("invalid input.");
//         }
//     }
//     else
//     {
//         System.out.println("invalid input.");
        
//     }
   
//    }
// }




// import java.util.*;
// public class Assesment2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("ENter charector");
//        String ch=sc.nextLine();
//        System.out.println(ch.toUpperCase());
//    }
// }




// import java.util.*;
// public class Assesment2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int no;
//        System.out.println("enter no of month");
//        no=sc.nextInt();
//        switch (no) {
//         case 1:
//         {
//            System.out.println("January");
//            break;
//         }
//         case 2:
//         {
//            System.out.println("February");
//            break;
//         }
//         case 3:
//         {
//            System.out.println("March");
//            break;
//         }
//         case 4:
//         {
//            System.out.println("April");
//            break;
//         }
//         case 5:
//         {
//            System.out.println("May");
//            break;
//         }
//         case 6:
//         {
//            System.out.println("June");
//            break;
//         }
//         case 7:
//         {
//            System.out.println("July");
//            break;
//         }
//         case 8:
//         {
//            System.out.println("August");
//            break;
//         }
//         case 9:
//         {
//            System.out.println("September");
//            break;
//         }
//         case 10:
//         {
//            System.out.println("October");
//            break;
//         }
//         case 11:
//         {
//            System.out.println("November");
//            break;
//         }
//         case 12:
//         {
//            System.out.println("December");
//            break;
//         }

            
            
       
//         default:
//             break;
//        }
//    }
// }






// import java.util.*;
// public class Assesment2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int no=1;
//        int digit=1;
//        while (digit<=5) {
        
//        if(no%2==0 && no%3==0 && no%5==0 && digit<=5)
//        {
//         System.out.println(no);
//         digit++;
       
//        }
//        no++;
//     }
//    }

// }
