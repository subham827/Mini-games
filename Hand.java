import java.util.*;
public class Hand{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" HANDCRICKET ");
       System.out.println("You will have 1 wicket and you will be batting first, you can bat as long as you're not out");
       Random rand = new Random();
       System.out.println("Let's start , enter number");
       int s =0;
       for(;;){
       int t = sc.nextInt();
       int rand1 = rand.nextInt(11);
       System.out.println(rand1);
       if(t!=rand1){
       s+=t;
       }
       else  if (t==rand1) {
           break;
           
        }
        System.out.println("Present score: "+s);
       
       



        
    }
    System.out.println("OUT! Target for computer: " +(s+1));
    int target = s+1;
    int s1 = 0;
    System.out.println("Enter a number to kickstart bowling");
    int h=0;
    for(;;){
        int w = sc.nextInt();
        int rand2 = rand.nextInt(11);
        System.out.println(rand2);
        s1+=rand2;
        if (w==rand2) {
            h++;
            break;
            
            
        }else if(s1>target){
            break;
        }else if(s1<target){
            System.out.println("Present score: " +s1+ " ,more " +(target-s1)+ " runs required to defend");

        }

    }
    if (h!=0) {
        
        System.out.println("Congrats you won!");
    }else{
        System.out.println("YOU LOST");
    }

}

}
