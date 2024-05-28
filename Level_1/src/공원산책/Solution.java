package 공원산책;
class Solution {
    static int x = 0;
    static int y = 0;
    public static int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        // 배열을 만들자.
        String [][] parkMap = new String[park[0].length()][park.length];

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length(); j++) {
                parkMap[i][j] = String.valueOf(park[i].charAt(j));
                if(park[i].charAt(j)=='S'){
                    x = i;
                    y = j;
                }
            }
        }
        ////////// 움직임 시작
        for(String s : routes){
            movable(parkMap,s);
        }


        return new int[]{y,x};
    }

    private static void movable(String[][] parkMap, String s) {
        String []split = s.split(" ");
        int x_temp = x;
        int y_temp = y;
        //
        int count = Integer.parseInt(split[1]);
        for (int i = 0; i < count; i++) {
            try{
                if(split[0].equals("N")){
                    if(parkMap[x][y-1].equals("X")){
                        throw new Exception();
                    }else{
                        y = y-1;
                        String test = parkMap[x][y];
                    }

                }
                if(split[0].equals("S")){
                    if(parkMap[x][y+1].equals("X")){
                        throw new Exception();
                    }else{
                        y = y+1;
                        String test = parkMap[x][y];
                    }
                }
                if(split[0].equals("E")){
                    System.out.println(parkMap[x+1][y]);
                    System.out.println(parkMap[x][y]);
                    System.out.println(parkMap[x+2][y]);
                    if(parkMap[x+1][y].equals("X")){
                        throw new Exception();
                    }
                    else{
                        x = x+1;
                        String test = parkMap[x][y];
                    }
                }
                if(split[0].equals("W")){
                    if(parkMap[x-1][y].equals("X")){
                        throw new Exception();
                    }else
                    {
                        x = x-1;
                        String test = parkMap[x][y];
                    }
                }
                System.out.println(parkMap[x][y]);
            }catch (Exception e){
                System.out.println("error "+x+" : "+y);
                x = x_temp ;
                y = y_temp ;
            }

        }
    }

    public static void main(String[] args) {
        String[] park ={"SOO","OOO","OOO"};
        String[] routes ={"E 2","S 2","W 1"};

        int [] a = solution(park,routes);
        for(int j : a){
            System.out.println(j);
        }
    }
}
