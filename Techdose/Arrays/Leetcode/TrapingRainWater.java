class Solution {
    public int trap(int[] height) {
        int count=0,i=0;
        Stack<Integer> stack=new Stack<>();
        while(i<height.length){
            while(!stack.isEmpty()&&height[i]>height[stack.peek()]){
                int top=stack.peek();
                stack.pop();
                if(stack.isEmpty())break;
                int dis=i-stack.peek()-1;
                int bon=Math.min(height[i],height[stack.peek()])-height[top];
                count+=dis*bon;
            }
            stack.push(i++);
        }
        return count;
    }
}