
package nidhi;


public class Nidhi {
   public static void main(String[] args) {
      String name = "nidhi";
      int i=0, j=0,count;char ch;
      String nm="";
      System.out.println("len: "+name.length());
      for(i=0;i<name.length(); i++){
          count=0;
          for(j=0;j<name.length(); j++){
              if(name.charAt(i)== name.charAt(j)){
                  count++;
              }
          }if(!(count>1)){
                nm +=name.charAt(i);
                System.out.println("nm= "+nm);}
      }
      System.out.println("nm= "+nm+" actual string: "+name);
    }
}