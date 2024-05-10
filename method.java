class method{
    static int[] AddPrize(int currentprize[],int idx,int changeprize){
        
        int newprize[] = new int[currentprize.length+1];
        for(int i=0; i < newprize.length; i++){
            if(i < idx){
                newprize[i] = currentprize[i];
            }
            else if(i <= idx){
                newprize[i] =  changeprize;
            }
            else{
                newprize[i] = currentprize[i-1];
            }
        }
        return newprize;
    }
        // Add Method for Add Items
        static String[] AddItem(String s[], int idx, String additem){
            String newitem[] = new String[s.length+1];
            for(int i=0; i < newitem.length; i++){
                if(i < idx){
                    newitem[i] = s[i];
                }
                else if(i <= idx){
                    newitem[i] = additem;
                }else{
                    newitem[i] = s[i-1];
                }
            }
            return newitem;
        }

        // Method for DeletePrize
        
    static int[] Deleteprize(int currentprize[],int idx){
        int newprize[] = new int[currentprize.length-1];
        for(int i=0; i < currentprize.length; i++){
            if(i < idx){
                newprize[i] = currentprize[i];
            }
            else if(i == idx){
                continue;
            }else{
                newprize[i-1] = currentprize[i];
            }
        }
        return newprize;  
    }
     
    // Add Delete Item Method 
    
    static String[] DeleteItem(String currItem[], int idx){
        String[] newItems = new String[currItem.length-1];
        for (int i = 0; i < currItem.length; i++) {
            if(i < idx){
                newItems[i] = currItem[i];
            }
            else if(i == idx){
                continue;
            }else{
                newItems[i-1] = currItem[i];
            }
        }
        return newItems;
    }

     // Add Method for Total Amount 

     static int TotalAmount(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    
}