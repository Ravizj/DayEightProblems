public class CalculateDaily {

        public  void method1(){
            double hour = (Math.random()*100%25);
            System.out.println("total work time is "+hour);
            if(hour>=20)
            {
                System.out.println("salary is cradit total " +hour*78);

            }else{
                System.out.println("salary is for 8 hrs "+hour*78);
            }

        }
        public static void main(String[] args) {
            CalculateDaily calculateDaily=new CalculateDaily();
            calculateDaily.method1();


    }

}
