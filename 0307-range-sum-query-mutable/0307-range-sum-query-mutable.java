class NumArray {
    int tree[];
    int o[];
    int n;
    public int construct(int tree[],int ind,int nums[],int l,int r)
    {
        if(l==r)
        {
            tree[ind]=nums[l];
            return nums[l];
        }
        int mid=l+((r-l)/2);
        tree[ind]=construct(tree,2*ind+1,nums,l,mid)+construct(tree,2*ind+2,nums,mid+1,r);
        return tree[ind];
    }
    public NumArray(int[] nums) {
        n=nums.length;
        o=nums;
        tree=new int[4*n];
        construct(tree,0,nums,0,n-1);
    }
    
    public void change(int tree[],int ind,int diff,int index,int l,int r)
    {
        if(l==index && r==index)
        {
            tree[ind]+=diff;
            return ;
        }if(l<=index  && r>=index)
        { 
            tree[ind]+=diff;
            int mid=l+((r-l)/2);
            change(tree,2*ind+1,diff,index,l,mid);
            change(tree,2*ind+2,diff,index,mid+1,r);
        }
    }
    public void update(int index, int val) {
        int diff=val-o[index];
        o[index]=val;
        change(tree,0,diff,index,0,n);
        return ;
    }
    
    public int range(int tree[],int ind,int st,int end,int l,int r)
    {   
        if(st>=l && r<=end) return tree[ind];
        if(st>r || end<l) return 0;
        int mid=st+((end-st)/2);
        return range(tree,2*ind+1,st,mid,l,r)+range(tree,2*ind+2,mid+1,end,l,r);
    }
    public int sumRange(int left, int right) {
        return range(tree,0,0,n,left,right);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */