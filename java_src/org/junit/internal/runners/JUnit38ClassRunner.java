package org.junit.internal.runners;

import java.lang.annotation.Annotation;
import junit.extensions.TestDecorator;
import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestListener;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import org.junit.runner.Describable;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.InvalidOrderingException;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.manipulation.Orderable;
import org.junit.runner.manipulation.Orderer;
import org.junit.runner.manipulation.Sortable;
import org.junit.runner.manipulation.Sorter;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
/* loaded from: classes2.dex */
public class JUnit38ClassRunner extends Runner implements Filterable, Orderable {
    private volatile Test test;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class OldTestClassAdaptingListener implements TestListener {
        private final RunNotifier notifier;

        private OldTestClassAdaptingListener(RunNotifier runNotifier) {
            this.notifier = runNotifier;
        }

        @Override // junit.framework.TestListener
        public void endTest(Test test) {
            this.notifier.fireTestFinished(asDescription(test));
        }

        @Override // junit.framework.TestListener
        public void startTest(Test test) {
            this.notifier.fireTestStarted(asDescription(test));
        }

        @Override // junit.framework.TestListener
        public void addError(Test test, Throwable th) {
            this.notifier.fireTestFailure(new Failure(asDescription(test), th));
        }

        private Description asDescription(Test test) {
            if (test instanceof Describable) {
                return ((Describable) test).getDescription();
            }
            return Description.createTestDescription(getEffectiveClass(test), getName(test));
        }

        private Class<? extends Test> getEffectiveClass(Test test) {
            return test.getClass();
        }

        private String getName(Test test) {
            if (test instanceof TestCase) {
                return ((TestCase) test).getName();
            }
            return test.toString();
        }

        @Override // junit.framework.TestListener
        public void addFailure(Test test, AssertionFailedError assertionFailedError) {
            addError(test, assertionFailedError);
        }
    }

    public JUnit38ClassRunner(Class<?> cls) {
        this(new TestSuite(cls.asSubclass(TestCase.class)));
    }

    public JUnit38ClassRunner(Test test) {
        setTest(test);
    }

    @Override // org.junit.runner.Runner
    public void run(RunNotifier runNotifier) {
        TestResult testResult = new TestResult();
        testResult.addListener(createAdaptingListener(runNotifier));
        getTest().run(testResult);
    }

    public TestListener createAdaptingListener(RunNotifier runNotifier) {
        return new OldTestClassAdaptingListener(runNotifier);
    }

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        return makeDescription(getTest());
    }

    private static Description makeDescription(Test test) {
        if (test instanceof TestCase) {
            TestCase testCase = (TestCase) test;
            return Description.createTestDescription(testCase.getClass(), testCase.getName(), getAnnotations(testCase));
        } else if (test instanceof TestSuite) {
            TestSuite testSuite = (TestSuite) test;
            Description createSuiteDescription = Description.createSuiteDescription(testSuite.getName() == null ? createSuiteDescription(testSuite) : testSuite.getName(), new Annotation[0]);
            int testCount = testSuite.testCount();
            for (int i = 0; i < testCount; i++) {
                createSuiteDescription.addChild(makeDescription(testSuite.testAt(i)));
            }
            return createSuiteDescription;
        } else if (test instanceof Describable) {
            return ((Describable) test).getDescription();
        } else {
            if (test instanceof TestDecorator) {
                return makeDescription(((TestDecorator) test).getTest());
            }
            return Description.createSuiteDescription(test.getClass());
        }
    }

    private static Annotation[] getAnnotations(TestCase testCase) {
        try {
            return testCase.getClass().getMethod(testCase.getName(), new Class[0]).getDeclaredAnnotations();
        } catch (NoSuchMethodException | SecurityException unused) {
            return new Annotation[0];
        }
    }

    private static String createSuiteDescription(TestSuite testSuite) {
        int countTestCases = testSuite.countTestCases();
        return String.format("TestSuite with %s tests%s", Integer.valueOf(countTestCases), countTestCases == 0 ? "" : String.format(" [example: %s]", testSuite.testAt(0)));
    }

    @Override // org.junit.runner.manipulation.Filterable
    public void filter(Filter filter) throws NoTestsRemainException {
        if (getTest() instanceof Filterable) {
            ((Filterable) getTest()).filter(filter);
        } else if (getTest() instanceof TestSuite) {
            TestSuite testSuite = (TestSuite) getTest();
            TestSuite testSuite2 = new TestSuite(testSuite.getName());
            int testCount = testSuite.testCount();
            for (int i = 0; i < testCount; i++) {
                Test testAt = testSuite.testAt(i);
                if (filter.shouldRun(makeDescription(testAt))) {
                    testSuite2.addTest(testAt);
                }
            }
            setTest(testSuite2);
            if (testSuite2.testCount() == 0) {
                throw new NoTestsRemainException();
            }
        }
    }

    @Override // org.junit.runner.manipulation.Sortable
    public void sort(Sorter sorter) {
        if (getTest() instanceof Sortable) {
            ((Sortable) getTest()).sort(sorter);
        }
    }

    @Override // org.junit.runner.manipulation.Orderable
    public void order(Orderer orderer) throws InvalidOrderingException {
        if (getTest() instanceof Orderable) {
            ((Orderable) getTest()).order(orderer);
        }
    }

    private void setTest(Test test) {
        this.test = test;
    }

    private Test getTest() {
        return this.test;
    }
}
