package week3;

class week3{

    // Spanning tree for given houses
    static void MST(int houses[][], int i, int j)
    {
        int distance,dis=0,path=0;
        int shortest=houses[1][0]+houses[1][1]-(houses[0][0]+houses[0][1]);
        distance=shortest;
        for(int a=0;a<i;a++){
            for(int b=0;b<j;b++){
                path=houses[a][b]+path;
            }
            dis=path-shortest;
            distance=distance+dis;
            if(dis<shortest){
                shortest=dis;
            }
            path=0;
        }
        System.out.println(distance);
    }




    public static void main(String args[])
    {

        // Graph in form of 2D array
        int houses[][] = {{0,0}, {2,2}, {3,10}, {5,2},{7,10}};
        int i = houses.length;
        int j = houses[0].length;

        // Function Call
        MST(houses, i,j);
    }
}