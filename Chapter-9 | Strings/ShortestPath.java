public class ShortestPath {
    public static double findShortestPath(String route){
        int x = 0;
        int y = 0;

        for(int i=0; i<route.length(); i++){
            if(route.charAt(i)=='E'){
                x++;
            }
            if(route.charAt(i)=='N'){
                y++;
            }
            if(route.charAt(i)=='W'){
                x--;
            }
            if(route.charAt(i)=='S'){
                y--;
            }
        }

        double path = Math.sqrt((x*x)+(y*y));
        return path;
    }
    public static void main(String[] args) {
        String route = "WNEENESENNN";
        System.out.println(findShortestPath(route));
    }    
}
