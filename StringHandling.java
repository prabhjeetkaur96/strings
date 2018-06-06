/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

/**
 *
 * @author jeetp
 */
public class StringHandling {
    public static void main(String args[]){
        String str1 = "Test";
        String str2 = new String("java");
        System.out.println("str1 : "+ str1);
         System.out.println("str1 : "+ str2);
         String str3 = str1+str2;
         str3 = str2.concat(str1);
          System.out.println("str3 : "+ str3);
           int len = str2.length();
            System.out.println("len : "+ len);
            str2 = "Test String";
            for(int i=0; i<=str2.length()-1; i+=2){
                // System.out.println("i :" +i);
                 System.out.println(str2.charAt(i)+" ");
            }
             System.out.println("");
    
    for(int i=str2.length()-1  ; i>=0; i--){
         System.out.println(str2.charAt(i)+ " ");
    }
     System.out.println("");
     //str.reverse();
     str2 ="java";
     str3 ="java";
    // if (str2.equals(str3)){
     if( str2.equalsIgnoreCase(str3)){
          System.out.println("equal strings");
     }else{
          System.out.println("different strings");
     }
      str2 ="Java";
     str3 ="java";
     System.out.println(str2.compareTo(str3));
             
     System.out.println(str2.endsWith("vb"));
     
     str2 = "this is a test string";
     int p;
    p = str2.indexOf("i");
    
     p = str2.indexOf("test");
     
      p = str2.indexOf('i',4);
      
       p = str2.lastIndexOf('i');
     System.out.println("p : " + p);
    
     System.out.println(str2.replace('i','$'));
    
      str2 = "this is a test string";
      int wordCount =0;
    for(int i=0; i<str2.length(); i++){
        
        if(Character.isWhitespace(str2.charAt(i))){
            wordCount++;
        }
    }
    System.out.println("wordCount : " + wordCount++);
    
    StringBuffer str4 = new StringBuffer("hello there");
    int len1 = str4.length();
      System.out.println("str4 : " + str4);
      str4.append("good afternoon");
      
      str4.setCharAt(3,'&');
      str4.insert(4,"@@@");
      System.out.println("str4 : " +str4);
      //str4 = (StringBuffer)"this is a boring class";
            System.out.println( str4.reverse());
    }
}
