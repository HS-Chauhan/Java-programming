class Example {
    public static void main(String[] args){
        String str = "Hello World";
        String rev = reverse(str);
        System.out.println("Reversed sentence: " + rev);
  }

    public static String reverse(String s) {
    int x = s.indexOf(" ");
    
    //Base condition
    if(x == -1)
      return s;
      
    return reverse(s.substring(x+1)) +" "+ s.substring(0, x);
     }
}
