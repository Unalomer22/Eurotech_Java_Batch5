package Day39_Wrapper_Class2;

public class PrimitiveToWrapper {

    public static void main(String[] args) {

        int num = 5;
        double num2 = 5.35;
        boolean b = true;

        Integer obj1 = Integer.valueOf(num);
        Double obj2 = Double.valueOf(num2);
        Boolean obj3 = Boolean.valueOf(b);

        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);
        System.out.println("obj3 = " + obj3);

        // 'instance of' operatoru
        if(obj1 instanceof Integer){
            System.out.println(obj1 + " is converted to wrapper Class Object");
        }else{
            System.out.println(obj1 + " is not converted to wrapper Class Object");
        }


        /*
        if(obj2 instanceof Integer){
            System.out.println(obj1 + " is converted to wrapper Class Object");
        }else{
            System.out.println(obj1 + " is not converted to wrapper Class Object");
        }
         */

    }
}
