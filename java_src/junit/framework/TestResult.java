package junit.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
/* loaded from: classes2.dex */
public class TestResult {
    protected List<TestFailure> fFailures = new ArrayList();
    protected List<TestFailure> fErrors = new ArrayList();
    protected List<TestListener> fListeners = new ArrayList();
    protected int fRunTests = 0;
    private boolean fStop = false;

    public synchronized void addError(Test test, Throwable th) {
        this.fErrors.add(new TestFailure(test, th));
        for (TestListener testListener : cloneListeners()) {
            testListener.addError(test, th);
        }
    }

    public synchronized void addFailure(Test test, AssertionFailedError assertionFailedError) {
        this.fFailures.add(new TestFailure(test, assertionFailedError));
        for (TestListener testListener : cloneListeners()) {
            testListener.addFailure(test, assertionFailedError);
        }
    }

    public synchronized void addListener(TestListener testListener) {
        this.fListeners.add(testListener);
    }

    public synchronized void removeListener(TestListener testListener) {
        this.fListeners.remove(testListener);
    }

    private synchronized List<TestListener> cloneListeners() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.fListeners);
        return arrayList;
    }

    public void endTest(Test test) {
        for (TestListener testListener : cloneListeners()) {
            testListener.endTest(test);
        }
    }

    public synchronized int errorCount() {
        return this.fErrors.size();
    }

    public synchronized Enumeration<TestFailure> errors() {
        return Collections.enumeration(this.fErrors);
    }

    public synchronized int failureCount() {
        return this.fFailures.size();
    }

    public synchronized Enumeration<TestFailure> failures() {
        return Collections.enumeration(this.fFailures);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void run(final TestCase testCase) {
        startTest(testCase);
        runProtected(testCase, new Protectable() { // from class: junit.framework.TestResult.1
            @Override // junit.framework.Protectable
            public void protect() throws Throwable {
                testCase.runBare();
            }
        });
        endTest(testCase);
    }

    public synchronized int runCount() {
        return this.fRunTests;
    }

    public void runProtected(Test test, Protectable protectable) {
        try {
            protectable.protect();
        } catch (ThreadDeath e) {
            throw e;
        } catch (AssertionFailedError e2) {
            addFailure(test, e2);
        } catch (Throwable th) {
            addError(test, th);
        }
    }

    public synchronized boolean shouldStop() {
        return this.fStop;
    }

    public void startTest(Test test) {
        int countTestCases = test.countTestCases();
        synchronized (this) {
            this.fRunTests += countTestCases;
        }
        for (TestListener testListener : cloneListeners()) {
            testListener.startTest(test);
        }
    }

    public synchronized void stop() {
        this.fStop = true;
    }

    public synchronized boolean wasSuccessful() {
        boolean z;
        if (failureCount() == 0) {
            z = errorCount() == 0;
        }
        return z;
    }
}
