class TrappingRain {
    public int maxArea(int[] height) {
        int maxar=0;
        int l = 0, r = height.length - 1;
        while(l <= r)
        {
            int ar = Math.min(height[l],height[r])*(r-l);
            if(ar>maxar)
                maxar=ar;
            if(height[l]<height[r])
                l++;
            else
                r--;
        }
        return maxar;
    }
}