// Link : https://leetcode.com/problems/minimum-array-end/?envType=daily-question&envId=2024-11-09
// Last Practice on : 09-Nov-2024


class Solution {
    public long minEnd(int n, int x) {
        //Approach 3: Bitmasking with Logical Operations
        long result = x;
        long mask;
        n--;
        for(mask = 1; n > 0; mask <<= 1){
            if((mask & x) == 0){
                result |= (n & 1) * mask;
                n >>= 1;
            }
        }
        return result;
        //TC - O(log n)
        //SC - O(1)




        //Approach 2: Bit Manipulation and Binary Construction
        /*
        long result = 0, bit;
        --n;
        int[] binaryX = new int[64];
        int[] binaryN = new int[64];
        long longX = x;
        long longN = n;
        for(int i=0;i<64;i++){
            bit = (longX >> i) & 1;
            binaryX[i] = (int) bit;
            bit = (longN >> i) & 1;
            binaryN[i] = (int) bit;
        }
        int posX = 0, posN = 0;
        while(posX < 64){
            while(binaryX[posX] != 0 && posX < 64){
                ++posX;
            }
            binaryX[posX] = binaryN[posN];
            ++posX;
            ++posN;
        }
        for(int i = 0;i < 64; i++){
            if(binaryX[i] == 1){
                result += Math.pow(2,i);
            }
        }
        return result;
        //TC - O(log n)
        //SC - O(log n)
        */



        //Approach 1: Consecutive ORing
        /*
        int result = x;
        while(--n > 0){
            result = (result + 1) | x;
        }
        return result;
        //TC - O(n)
        //SC - O(1)
        */
    }
}
