package day4;

public class CaseChange {
	 public static void main(String[] args) {    
         
	        String str1="how are you ";   
	        char[] charArray = str1.toCharArray();
	        boolean caseChange = true;

	        for(int i = 0; i < charArray.length; i++) {

	          if(Character.isLetter(charArray[i])) {

	            if(caseChange) {

	              charArray[i] = Character.toUpperCase(charArray[i]);
	              caseChange = false;
	            }
	          }

	          else {

	        	  caseChange = true;
	          }
	        }
	        str1 = String.valueOf(charArray);
	        System.out.println(str1);
	      }
}
