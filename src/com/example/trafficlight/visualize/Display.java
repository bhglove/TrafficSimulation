package com.example.trafficlight.visualize;

import com.example.trafficlight.module.Lane;

/**
 * Created by Benjamin on 12/28/17.
 */
public class Display {
    private static int getOrigin(int x, int y){
        int origin = 0;
        int count = x + y + 1;

            if(count % 2 == 0){
                origin = count / 2;
            }
            else{
                if(x > y){
                    origin = Math.floorMod(x, y);
                }
                else {
                    origin = Math.floorMod(x, y) + 1;
                }
            }

        return origin;
    }

    public static void displayTextIntersection(Lane north, Lane south, Lane west, Lane east) {
        int height = north.size() + south.size() + 1;
        int width = west.size() + east.size() + 1;

        String table[][] = new String[height][width];



        for(int h = 0; h < height; h++){
            for(int w = 0; w < width; w++){
                System.out.println(table[h][w]);
            }
        }
        //print text representation of intersection
        //print height start x height end x width start x width end
        //print the west lane -
    }
}
