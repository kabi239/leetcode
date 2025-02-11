public class RotateString {
    public static String shiftCharToEnd(String s){
        if(s.length()<=1){
            return s;
        }
        return s.substring(1)+s.charAt(0);
    }
    public boolean rotateString(String s, String goal) {
        int i=0;
        while(i< s.length()){
            if(s.equals(goal)){
                return true;
            }
            else{
                s=shiftCharToEnd(s);
            }
           i++; 
        }
        return false;
    }
    //          OR
    public boolean rotateString1(String s, String goal) {
        return s.length()==goal.length() && (s+s).contains(goal);
    }
}
