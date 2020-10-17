package com;

import org.junit.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StringLoopsTest {

    private ByteArrayOutputStream output;
    final static private PrintStream sysout = System.out;

    @Before
    public void setup(){
        output = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(output);
        System.setOut(newPrintStream);
    }

    @Test
    public void updogOne() {
        String expected = "1\n2\nWhat's\n4\nUpdog\n";
        StringLoops.updog(5);
        Assert.assertEquals(expected, output.toString());
    }

    @Test
    public void updogTwo() {
        String expected = "1\n2\nWhat's\n4\nUpdog\nWhat's\n7\n8\nWhat's\nUpdog\n11\nWhat's\n13\n14\nWhat's Updog\n16\n17\nWhat's\n19\nUpdog\nWhat's\n22\n"+
                "23\nWhat's\nUpdog\n26\nWhat's\n28\n29\nWhat's Updog\n31\n32\nWhat's\n34\nUpdog\nWhat's\n37\n38\nWhat's\nUpdog\n";;
        StringLoops.updog(40);
        Assert.assertEquals(expected, output.toString());
    }

    @Test
    public void diamondOne() {
        String expected = " * \n* *\n * \n";
        StringLoops.diamond(2);
        Assert.assertEquals(expected, output.toString());
    }

    @Test
    public void diamondTwo() {
        String expected = "      *      \n     * *     \n    * * *    \n   * * * *   \n  * * * * *  \n * * * * * * \n* * * * * * *\n" +
                " * * * * * * \n  * * * * *  \n   * * * *   \n    * * *    \n     * *     \n      *      \n";
        StringLoops.diamond(7);
        Assert.assertEquals(expected, output.toString());
    }

    @Test
    public void invertedDiamondOne() {
        String expected = "* * * * *\n* *   * *\n*       *\n* *   * *\n* * * * *\n";
        StringLoops.invertedDiamond(3);
        Assert.assertEquals(expected, output.toString());
    }

    @Test
    public void invertedDiamondTwo() {
        String expected = "* * * * * * *\n* * *   * * *\n* *       * *\n*           *\n* *       * *\n* * *   * * *\n* * * * * * *\n";
        StringLoops.invertedDiamond(5);
        Assert.assertEquals(expected, output.toString());
    }

    @Test
    public void checkerboard() {
        String expected = "R B R B R B R B\nB R B R B R B R\nR B R B R B R B\nB R B R B R B R\nR B R B R B R B\nB R B R B R B R\nR B R B R B R B\nB R B R B R B R\n";
        StringLoops.checkerboard();
        Assert.assertEquals(expected, output.toString());
    }

    @AfterClass
    public static void cleanupAll(){
        System.out.flush();
        System.setOut(sysout);
    }

}