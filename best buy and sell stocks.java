class Main {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,1};
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < minPrice){
                minPrice = arr[i];
            }else{
                maxProfit = Math.max(maxProfit, arr[i] - minPrice);

            }
        }
        System.out.println(maxProfit);
    }
}
