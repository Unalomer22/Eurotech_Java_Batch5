package Day7_Review;

public class AdditionVSConcatanation2 {

    public static void main(String[] args) {

        // String + Number + Number
        // Carpma islemi precedence dan dolayi compiler tarafindan oncelikli islenip daha sonra concatanation uygulaniyor
        System.out.println("EurotechStudy " + 5 * 4);

        // String + Number + Number
        // Ancak cikarma islemi toplamaya gore oncelikli olmadigi icin artihmetic olarak islme alinmiyor
        // Compiler String "-" operatorunu islem olarak tanimlayamayip hataya dusuyor
        //System.out.println("EurotechStudy " + 5 - 4);

    }
}
