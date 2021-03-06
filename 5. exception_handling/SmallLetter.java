class SmallLetterExceptionHandler extends Exception {
    SmallLetterExceptionHandler(String mssg) {
        System.out.print(mssg);
    }
}

class SmallLetter{
    void checkLetter(String s) throws SmallLetterExceptionHandler{
        char ab;

        ab = s.charAt(0);

        if(ab >= 97 && ab <= 122)
            throw new SmallLetterExceptionHandler("First Letter is lowercase : ");
        else   
            System.out.println("\n"+s);
    }
    public static void main(String args[]){
        SmallLetter obj = new SmallLetter();

        for(int i = 0; i < args.length; i++){
            try{
                obj.checkLetter(args[i]);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}