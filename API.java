import java.util.*;
import java.beans.*;
import java.awt.*;

public class API {

    static int c = 12;
    private API(){
        System.out.println("c = " + c);
    }

    public static void main(String[] args){
        API w1 = c();
        System.out.println(w1);

        API w2 = c(w1);
        System.out.println("w2 ---> " + c);
        System.out.println("w2" + w2);
        API w3 = c(w2);
        System.out.println("w2 ---> " + c);
        System.out.println("w2 " + w3);
        API w4 = c(w3);
        System.out.println("w2 ---> " + c);
        System.out.println("w2 " + w3);
    }

    static API c(){
        return c++ <= 0 ? new API() : null;
    }
    static API c(API w){
        return w.c++ == 1 ? new API() : null;
    }





}
