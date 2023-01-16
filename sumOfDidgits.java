class Solution {
    public int getLucky(String s, int k) {
        String res="";
        for(char ch:s.toCharArray())res+=ch &31;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=0;
            for(int j=res.length()-1;j>=0;j--){
                sum+=(int)(res.charAt(j)-'0');
            }
            res=String.valueOf(sum);
        }
        return sum;
    }
}
