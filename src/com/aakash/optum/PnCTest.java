package com.aakash.optum;

public class PnCTest {


	public static void main(String arg[]){

	String str = "abcde";
	//output: abced, abecd, aebcd 
	int n = str.length(); 
	PnCTest permutation = new PnCTest(); 
    permutation.permute(str, 0, n-1); 
	
//		if(str.length()>2){
//			for(int i=0; i<str.length(); i++){
//				char combinationInitialValue = str.charAt(i);
//				String remainingStr = str.replace(i,i+1, "");
//				String output = combinationInitialValue + getPossibleCombination(remainingStr);
//			}
//		}
	}
	
//	public static String getPossibleCombination(String str){
//		if(str.length()>2){
//			char combinationInitialValue = str.charAt(0);
//			String remainingStr = str.replace(0,1, "");
//			return combinationInitialValue + getPossibleCombination(remainingStr);
//		}else{			
//			return String.valueOf(str.charAt(1)) + String.valueOf(str.charAt(0));
//		}
//	}
	/** 
     * permutation function 
     * @param str string to calculate permutation for 
     * @param l starting index 
     * @param r end index 
     */
    private void permute(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 
  
    /** 
     * Swap Characters at position 
     * @param a string value 
     * @param i position 1 
     * @param j position 2 
     * @return swapped string 
     */
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
  
} 


