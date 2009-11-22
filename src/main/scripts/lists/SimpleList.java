package lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Steve Levine
 * Date: Nov 21, 2009
 * Copyright 2009 blue64.net. All rights reserved.
 */


/**
 * Code sample used for blog post
 *  http://blue64.net/2009/11/scala-sugar-lists
 *  http://blue64.net/2009/11/scala-sugar-iteration
 */
public class SimpleList {

    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("a");
        l.add("b");
        l.add("c");

        for (String s : l) {
            System.out.print(s.toUpperCase());
        }

    }
}
