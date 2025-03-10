class Solution {
    public void duplicateZeros(int[] arr) {
        //calculate number of zeros
        int len = arr.length-1;
        int possibleDups = 0;
        for(int i=0;i<=len-possibleDups;i++){
            if(arr[i] == 0){
                if(i == len-possibleDups){
                    arr[len] = 0;
                    len -= 1;
                    break;
                }
               possibleDups++; 
            }
        }
        //copy zeros twice and non-zero once
        int last = len-possibleDups;
        for(int i=last;i>=0;i--){
            if(arr[i] == 0){
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            }
            else {
                arr[i + possibleDups] = arr[i];
            }
        }

    }
}

// TC --> O(N), SC --> O(1)
