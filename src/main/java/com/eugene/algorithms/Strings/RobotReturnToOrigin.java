package main.java.com.eugene.algorithms.Strings;

public class RobotReturnToOrigin {
    // There is a robot starting at the position (0, 0), the origin, on a 2D plane. Given a sequence of its moves,
    // judge if this robot ends up at (0, 0) after it completes its moves.

    // You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move.
    // Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).

    // Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.

    //Note: The way that the robot is "facing" is irrelevant. 'R' will always make the robot move to the right once, 'L' will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.



    //Example 1:

    //Input: moves = "UD"
    //Output: true
    //Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.

    //Example 2:

    //Input: moves = "LL"
    //Output: false
    //Explanation: The robot moves left twice. It ends up two "moves" to the left of the origin. We return false because it is not at the origin at the end of its moves.

    public static boolean judgeCircle (String moves){
        int[] point = new int[]{0,0};
        int[][] move = new int[][]{{0,1},{0,-1},{-1,0},{1,0}};
        for(Character m: moves.toCharArray()){
            int ind = 0;
            switch(m){
                case 'U':{
                    ind =0;
                    break;
                }
                case 'D':{
                    ind =1;
                    break;
                }
                case 'L':{
                    ind =2;
                    break;
                }
                case 'R':{
                    ind =3;
                    break;
                }
            }
            point[0] += move[ind][0];
            point[1] += move[ind][1];
        }
        return point[0] ==0 && point[1] ==0;
    }

    public static void main(String[] args){
        String input = "UDLR";

        boolean result = judgeCircle(input);
        System.out.println(result? "Robot returns to origin": "Robot is elsewhere");
    }
}
