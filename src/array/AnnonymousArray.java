package array;

class AnnonymousArray {
    public static void Main(String[] args){

        AnnonymousArray.sum(new int[][] {{10,20,30},{30,40,50}});
    }
    static void sum(int[][] no){
        int total=0;
        for(int ii[]:no)
        {

            for (int i:ii)
            {
                total = total+i;

            }


        }
        System.out.println(total);
    }




}
