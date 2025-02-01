// Plus One (66)
class Solution {
    public int[] plusOne(int[] n) {
        for(int i=n.length-1;i>=0;i--){
            if(n[i]+1!=10){
                n[i]+=1;
                return n;
            }
            n[i]=0;
        }

        // This is for if all (or) elements > 9
        int a[]=new int[n.length+1];
        a[0]=1;
        return a;
    }
}
