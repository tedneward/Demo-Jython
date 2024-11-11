/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.newardassociates.demo;

import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    // {{## BEGIN resultFromPython ##}}
    @Test public void canGetResultFromPython() {
        try(PythonInterpreter pyInterp = new PythonInterpreter()) {
            PyObject result = pyInterp.eval("2+2");

            assertEquals(4, result.asInt());
            assertEquals("4", result.__str__().toString());
        }
    }
    // {{## END resultFromPython ##}}
}
