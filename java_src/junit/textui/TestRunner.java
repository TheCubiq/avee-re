package junit.textui;

import java.io.PrintStream;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import junit.runner.BaseTestRunner;
import junit.runner.Version;
/* loaded from: classes2.dex */
public class TestRunner extends BaseTestRunner {
    public static final int EXCEPTION_EXIT = 2;
    public static final int FAILURE_EXIT = 1;
    public static final int SUCCESS_EXIT = 0;
    private ResultPrinter fPrinter;

    @Override // junit.runner.BaseTestRunner
    public void testEnded(String str) {
    }

    @Override // junit.runner.BaseTestRunner
    public void testFailed(int i, Test test, Throwable th) {
    }

    @Override // junit.runner.BaseTestRunner
    public void testStarted(String str) {
    }

    public TestRunner() {
        this(System.out);
    }

    public TestRunner(PrintStream printStream) {
        this(new ResultPrinter(printStream));
    }

    public TestRunner(ResultPrinter resultPrinter) {
        this.fPrinter = resultPrinter;
    }

    public static void run(Class<? extends TestCase> cls) {
        run(new TestSuite(cls));
    }

    public static TestResult run(Test test) {
        return new TestRunner().doRun(test);
    }

    public static void runAndWait(Test test) {
        new TestRunner().doRun(test, true);
    }

    protected TestResult createTestResult() {
        return new TestResult();
    }

    public TestResult doRun(Test test) {
        return doRun(test, false);
    }

    public TestResult doRun(Test test, boolean z) {
        TestResult createTestResult = createTestResult();
        createTestResult.addListener(this.fPrinter);
        long currentTimeMillis = System.currentTimeMillis();
        test.run(createTestResult);
        this.fPrinter.print(createTestResult, System.currentTimeMillis() - currentTimeMillis);
        pause(z);
        return createTestResult;
    }

    protected void pause(boolean z) {
        if (z) {
            this.fPrinter.printWaitPrompt();
            try {
                System.in.read();
            } catch (Exception unused) {
            }
        }
    }

    public static void main(String[] strArr) {
        try {
            if (!new TestRunner().start(strArr).wasSuccessful()) {
                System.exit(1);
            }
            System.exit(0);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(2);
        }
    }

    public TestResult start(String[] strArr) throws Exception {
        String str = "";
        String str2 = str;
        int i = 0;
        boolean z = false;
        while (i < strArr.length) {
            if (strArr[i].equals("-wait")) {
                z = true;
            } else if (strArr[i].equals("-c")) {
                i++;
                str = extractClassName(strArr[i]);
            } else if (strArr[i].equals("-m")) {
                i++;
                String str3 = strArr[i];
                int lastIndexOf = str3.lastIndexOf(46);
                String substring = str3.substring(0, lastIndexOf);
                str2 = str3.substring(lastIndexOf + 1);
                str = substring;
            } else if (strArr[i].equals("-v")) {
                PrintStream printStream = System.err;
                printStream.println("JUnit " + Version.id() + " by Kent Beck and Erich Gamma");
            } else {
                str = strArr[i];
            }
            i++;
        }
        if (str.equals("")) {
            throw new Exception("Usage: TestRunner [-wait] testCaseName, where name is the name of the TestCase class");
        }
        try {
            if (!str2.equals("")) {
                return runSingleMethod(str, str2, z);
            }
            return doRun(getTest(str), z);
        } catch (Exception e) {
            throw new Exception("Could not create and run test suite: " + e);
        }
    }

    protected TestResult runSingleMethod(String str, String str2, boolean z) throws Exception {
        return doRun(TestSuite.createTest(loadSuiteClass(str).asSubclass(TestCase.class), str2), z);
    }

    @Override // junit.runner.BaseTestRunner
    protected void runFailed(String str) {
        System.err.println(str);
        System.exit(1);
    }

    public void setPrinter(ResultPrinter resultPrinter) {
        this.fPrinter = resultPrinter;
    }
}
