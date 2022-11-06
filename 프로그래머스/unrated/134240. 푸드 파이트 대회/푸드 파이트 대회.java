class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        String tmp  = "";
        String tmp2 = "";
        
        for(int i = 1; i<food.length; i++) {
           for(int j = 0; j<food[i]/2; j++) {
                tmp+= i;
           }
        }
        
        int cnt = tmp.length()-1;
        
        
        
        for(int i = cnt; i >= 0; i--) {
            tmp2 += tmp.charAt(i);
        }
        
        answer = tmp + "0" + tmp2;
        
        
        
        
        return answer;
    }
}