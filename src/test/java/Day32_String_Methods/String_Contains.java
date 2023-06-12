package Day32_String_Methods;

public class String_Contains {

    public static void main(String[] args) {

        String email = "test@mail.com";
        System.out.println(email.contains("@"));

        String liste = "domates,patates,sogan,havuc";
        if(liste.contains("muz")){
            System.out.println("Urun listede mevcut");
        }else{
            System.out.println("Urun listede mevcut degil");
        }

        boolean havucVarmi = liste.contains("havuc");
        System.out.println("havucVarmi = " + havucVarmi);
        
        boolean muzVarmi = liste.contains("muz");
        System.out.println("muzVarmi = " + muzVarmi);
    }
}
