package junit.extensions;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;
/* loaded from: classes2.dex */
public class ActiveTestSuite extends TestSuite {
    private volatile int fActiveTestDeathCount;

    public ActiveTestSuite() {
    }

    public ActiveTestSuite(Class<? extends TestCase> cls) {
        super(cls);
    }

    public ActiveTestSuite(String str) {
        super(str);
    }

    public ActiveTestSuite(Class<? extends TestCase> cls, String str) {
        super(cls, str);
    }

    @Override // junit.framework.TestSuite, junit.framework.Test
    public void run(TestResult testResult) {
        this.fActiveTestDeathCount = 0;
        super.run(testResult);
        waitUntilFinished();
    }

    @Override // junit.framework.TestSuite
    public void runTest(final Test test, final TestResult testResult) {
        new Thread() { // from class: junit.extensions.ActiveTestSuite.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    test.run(testResult);
                } finally {
                    ActiveTestSuite.this.runFinished();
                }
            }
        }.start();
    }

    synchronized void waitUntilFinished() {
        while (this.fActiveTestDeathCount < testCount()) {
            try {
                wait();
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public synchronized void runFinished() {
        this.fActiveTestDeathCount++;
        notifyAll();
    }
}
