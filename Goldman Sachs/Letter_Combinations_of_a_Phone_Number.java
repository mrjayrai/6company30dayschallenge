class Solution {
    
    String[] combination = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    public void comboRecursive(String digits, String empty, List<String> ans){
        
        if(digits.length()==0){
            ans.add(empty);
            return;
        }

        char firstDigit = digits.charAt(0);
        String digitLeft = digits.substring(1);
        
        String key = combination[Integer.parseInt(""+firstDigit)];
        for(char ch : key.toCharArray()){
            comboRecursive(digitLeft,""+empty+ch,ans);
        }
        
    }
    
    public List<String> letterCombinations(String digits) {
       
        List<String> range = new ArrayList<>();
         if(digits.equals("")){
             return range;
         }
        
        comboRecursive(digits,"",range);
        return range;
        
    }
}
