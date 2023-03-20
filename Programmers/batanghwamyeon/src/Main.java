import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        int minx , miny;
        int maxx, maxy;
        minx = miny = Integer.MAX_VALUE;
        maxx = maxy = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if(wallpaper[i].charAt(j) == '#'){
                    minx = Math.min(minx,i);
                    miny = Math.min(miny,j);
                    maxx = Math.max(maxx,i);
                    maxy = Math.max(maxy,j);
                }
            }
        }

        int[] answer = {minx,miny,maxx+1,maxy+1};

        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(String[] wallpaper){
        int[] answer = {};

        return answer;
    }
}