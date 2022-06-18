/*class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}*/
class MyComparator implements Comparator<Item>{
    public int compare(Item i1,Item i2)
    {
        double r1=(double)i1.value/(double)i1.weight;
        double r2=(double)i2.value/(double)i2.weight;
        if(r1<r2)
        {
            return 1;
        }
        else if(r1>r2)
        return -1;
        else 
        return 0;
        
    }
}

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        Arrays.sort(arr,new MyComparator());
        int currWeight=0;
        double res=0.0;
        for(int i=0;i<n;i++)
        {
            if(currWeight+arr[i].weight<=W)
            {
                currWeight+=arr[i].weight;
                res=res+arr[i].value;
            }
            else 
            {
                int remain=W-currWeight;
                res+=(((double)arr[i].value/(double)arr[i].weight)*(double)remain);
                break;
            }
        }
        return res;
        // Your code here
    }
}
