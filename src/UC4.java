public class UC4{
    public static void method(){
        double hour = (Math.random()*10);
        System.out.println("total work time is "+hour);
        if(hour<=9)
        {
            System.out.println("Part time Hour is  " +hour);
            System.out.println("Total salery for Part time Hour is 8 " +hour*78);

        }else{
            System.out.println("salary is for full time hrs "+hour*78);
        }

    }
    public static void main(String[] args) {
        method();
    }
}

