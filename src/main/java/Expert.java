public class Expert {

    public static String reverse(String string){
        String result = "";
        if(string == null){
            result = "Die Eingabe darf nicht null sein!";
        }else{
            char[] c = string.toCharArray();
            if(c.length == 1){
                result = string;
            }else{
                for(int i = c.length-1; i>=0 ; i--){
                    result += c[i];
                }
            }
        }

        return result;
    }
}
