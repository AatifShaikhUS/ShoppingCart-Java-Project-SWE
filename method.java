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
   
}