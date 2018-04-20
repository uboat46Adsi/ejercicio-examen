package mx.com.itam.adsi.ejercicio;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPrincipal {
    private final static Logger LOG = Logger.getLogger(TestPrincipal.class);
    
    private static final String CODIGO = "System.out.println('Hello')// => Hello";
    
    private Principal p = new Principal();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        System.out.println("Before Test Case");
    }

    @Test
    public void isCorrectCuentaTest() {
        LOG.info("Ejecutando la prueba");
        int[] res = new int[3];

        res[0] = 1;
        res[1] = 1;
        res[2] = 1;
        assertTrue("Cuenta para '"+CODIGO+"':", cuenta(CODIGO, res));
    }
    
    private boolean cuenta(String codigo, int[] res) {
        int[] count = p.cuenta(codigo);
        System.out.println(count);
        return res == count;
    }

    @After
    public void after() {
        System.out.println("After Test Case");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}