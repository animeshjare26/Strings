public class ShortestPath {

    public static int shortestPath(String path){
        int x =0,y=0;

        for(int i = 0;i < path.length();i++){
            char dir = path.charAt(i);

            if (dir == 'N') {
                y++;
            }else if(dir == 'S'){
                y--;
            }else if(dir == 'W'){
                x--;
            }else{
                x++;
            }
        }
        int x1 = x *x;
        int y1 = y *y;

        return (int)Math.sqrt(x1 + y1);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(shortestPath(path));
    }
}
