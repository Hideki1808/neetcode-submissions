class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int currRec = 0;
        int maxRec = 0;

        for (int i = 0; i < heights.length; i++){
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]){
                int popped = st.pop();
                int rWall = i;
                int leftWall;
                if (!st.isEmpty()){
                    leftWall = st.peek();
                } else {
                    leftWall = -1;
                }

                //calculate area
                int w = rWall - leftWall - 1;
                // "-1" is there because w = (rWall- 1) - (lWall +1) +1, which simplifies to w = rWall - lWall - 1; that -1 makes sure we account for the width of the collum we're counting right now, that is, we are not also deleting the roll we want to count.
                currRec = heights[popped]*w;

                //currRec = heights[popped]*i-1
                if (currRec > maxRec){
                    maxRec = currRec;
                }
                
            }
            st.push(i);
        }

        while (!st.isEmpty()){
            int popped = st.pop();
            int rWall = heights.length;
            int leftWall;
            if (!st.isEmpty()){
                leftWall = st.peek();
            } else {
                leftWall = -1;
            }

            int w = rWall - leftWall - 1;
            currRec = heights[popped] * w;

            if (currRec > maxRec){
                maxRec = currRec;
            }
        
    }return maxRec;
}
}