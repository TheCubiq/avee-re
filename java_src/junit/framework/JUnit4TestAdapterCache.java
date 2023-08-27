package junit.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.junit.runner.notification.RunNotifier;
/* loaded from: classes2.dex */
public class JUnit4TestAdapterCache extends HashMap<Description, Test> {
    private static final JUnit4TestAdapterCache fInstance = new JUnit4TestAdapterCache();
    private static final long serialVersionUID = 1;

    public static JUnit4TestAdapterCache getDefault() {
        return fInstance;
    }

    public Test asTest(Description description) {
        if (description.isSuite()) {
            return createTest(description);
        }
        if (!containsKey(description)) {
            put(description, createTest(description));
        }
        return get(description);
    }

    Test createTest(Description description) {
        if (description.isTest()) {
            return new JUnit4TestCaseFacade(description);
        }
        TestSuite testSuite = new TestSuite(description.getDisplayName());
        Iterator<Description> it = description.getChildren().iterator();
        while (it.hasNext()) {
            testSuite.addTest(asTest(it.next()));
        }
        return testSuite;
    }

    public RunNotifier getNotifier(final TestResult testResult, JUnit4TestAdapter jUnit4TestAdapter) {
        RunNotifier runNotifier = new RunNotifier();
        runNotifier.addListener(new RunListener() { // from class: junit.framework.JUnit4TestAdapterCache.1
            @Override // org.junit.runner.notification.RunListener
            public void testFailure(Failure failure) throws Exception {
                testResult.addError(JUnit4TestAdapterCache.this.asTest(failure.getDescription()), failure.getException());
            }

            @Override // org.junit.runner.notification.RunListener
            public void testFinished(Description description) throws Exception {
                testResult.endTest(JUnit4TestAdapterCache.this.asTest(description));
            }

            @Override // org.junit.runner.notification.RunListener
            public void testStarted(Description description) throws Exception {
                testResult.startTest(JUnit4TestAdapterCache.this.asTest(description));
            }
        });
        return runNotifier;
    }

    public List<Test> asTestList(Description description) {
        if (description.isTest()) {
            return Arrays.asList(asTest(description));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Description> it = description.getChildren().iterator();
        while (it.hasNext()) {
            arrayList.add(asTest(it.next()));
        }
        return arrayList;
    }
}
