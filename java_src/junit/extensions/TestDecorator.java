package junit.extensions;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestResult;
/* loaded from: classes2.dex */
public class TestDecorator extends Assert implements Test {
    protected Test fTest;

    public TestDecorator(Test test) {
        this.fTest = test;
    }

    public void basicRun(TestResult testResult) {
        this.fTest.run(testResult);
    }

    public int countTestCases() {
        return this.fTest.countTestCases();
    }

    public void run(TestResult testResult) {
        basicRun(testResult);
    }

    public String toString() {
        return this.fTest.toString();
    }

    public Test getTest() {
        return this.fTest;
    }
}
