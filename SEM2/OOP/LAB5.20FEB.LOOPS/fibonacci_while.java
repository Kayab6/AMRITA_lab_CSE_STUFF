package loops;
public class fibonnaci_while {
    public static void main(String[] args) {
        System.out.println("fibonacci");
        int first=0;
        int second=1;
        int next= first+second;
        int i=0;
        while(i<=6){
            next=first+second;
            System.out.println(next);
            first = second;
            second = next;
            i++;
        }
    }
}
