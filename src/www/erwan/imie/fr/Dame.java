package www.erwan.imie.fr;

/**
 * Created by Erwan on 16/04/2015.
 * cours CDPN 06
 */
public class Dame {
    public static int dep(int x, int y, int xD, int yD, int[][] tab){
        if (tab[xD][yD] == 0){
            return 0;
        }
        else{
            return 1 + dep(x, y, xD+x, yD+y, tab);
        }
    }

}
