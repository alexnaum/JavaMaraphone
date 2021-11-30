package sprint4;

public class Point {
        private int x;
        private int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int[] getXYPair(){
            int[] mas = {x,y};
            return mas;
        }

        public double distance(){
            return Math.sqrt(x*x+y*y);
        }
        public double distance(int x, int y){
            return Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2));
        }
        public double distance(Point point){
            //point = new Point(x,y);
            return Math.sqrt(Math.pow((x- point.x),2)+Math.pow((y-point.y),2));
        }
}
