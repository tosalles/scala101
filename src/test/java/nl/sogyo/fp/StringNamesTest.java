package nl.sogyo.fp;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class StringNamesTest {
    String expected = "Ralf, Kevin, Kwok Wha";

    @Test
    public void testImp() throws Exception {
        List<String> names = Arrays.asList("tos", "ralf", "kevin", "kwok Wha");
        String result = StringNames.namesImp(names);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testFun() throws Exception {
        List<String> names = Arrays.asList("tos", "ralf", "kevin", "kwok Wha");
        String result = StringNames.namesFun(names);

        Assert.assertEquals(expected, result);
    }
}
