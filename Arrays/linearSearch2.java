public class linearSearch2{
    public static void main(String[] args) {
    String str="omkar";
    char target='o';
    System.out.println(checkChar(str,target));
    }

    static Boolean checkChar(String str,char target ){
        if(str.length() == 0){
            return false;
        }
        for(int i =0; i<str.length();i++){
            if(target == str.charAt(i)){git
                return true;
            };
            
        }
        return false;
    }
}