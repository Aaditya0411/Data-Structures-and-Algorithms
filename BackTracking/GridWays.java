package BackTracking;

class GridWays {
    public static int grid(int i , int j , int n , int m ){

        int w1 = grid(i+1, j, n, m);
        int w2 = grid(i, j+1, n, m);
        return w1 + w2;
    }
    public static void main(String[] args) {
        int n = 3 , m = 3 ;
    }
}