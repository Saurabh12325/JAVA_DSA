package AllocationOfNoOfPages;

public class BinarySearch {

    public static void main(String[] args) {


    }
    public static  int bookAllocation(int book[] ,  int students){
        if(book.length < students){
            return -1;
        }
        //now find the range of the max of the array and sum of the array
        int start = Integer.MIN_VALUE;
        int end = 0;
        for(int i = 0 ; i<book.length;i++){
            if (book[i] > start) {
                start = book[i];
            }
            end += book[i]; // find sum
        }
        int res = -1;
        while(start <= end){
            //max pages that can be allocated to the single student
            int mid = start + (end-start)/2;
            // if allocation is possible than minimize the no of the pages
            if(isAllocationPossible(book,mid,students)){
                res = mid;
                end = mid-1;
            }
            else {
                start = mid + 1;
            }

        }
        return res;

    }
    static boolean isAllocationPossible(int book[], int maxpages, int student){
        int currentStudent = 1;
        int pages = 0;
       for(int i = 0; i < book.length;i++){
           pages += book[i];
           // if pages exceed to the maximum pages
           if(pages > maxpages){
               // allocate to the next student
               currentStudent++;
               pages = book[i];
           }
       }
       if(currentStudent > student){
           return false;
       }
       return true;
    }

}
