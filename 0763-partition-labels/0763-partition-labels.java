class Solution {
    public List<Integer> partitionLabels(String s) {
        int n=s.length(),i=0,lastindex=-1,count=0;
        int arr[][]=new int[26][2];
        for(i=0;i<26;i++)
        {
            arr[i][0]=-1;
        }
        i=0;
        for(char c:s.toCharArray())
        {   
            if(arr[c-'a'][0]==-1)
            {
                arr[c-'a'][0]=i;
            }
            arr[c-'a'][1]=i++;
        }
        i=0;
        List<Integer> l=new ArrayList<>();
        for(char c:s.toCharArray())
        { // System.out.println(lastindex+" "+i);
            if(lastindex<i && lastindex!=-1)
            {
                l.add(count);
                count=0;
            }
            if(lastindex<arr[c-'a'][1])
            {
                lastindex=arr[c-'a'][1];
            }
            count++;
           i++;
        } 
        l.add(count);
        return l;
    }
}