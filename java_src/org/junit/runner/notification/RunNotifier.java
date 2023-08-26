package org.junit.runner.notification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;
/* loaded from: classes2.dex */
public class RunNotifier {
    private final List<RunListener> listeners = new CopyOnWriteArrayList();
    private volatile boolean pleaseStop = false;

    public void addListener(RunListener runListener) {
        if (runListener == null) {
            throw new NullPointerException("Cannot add a null listener");
        }
        this.listeners.add(wrapIfNotThreadSafe(runListener));
    }

    public void removeListener(RunListener runListener) {
        if (runListener == null) {
            throw new NullPointerException("Cannot remove a null listener");
        }
        this.listeners.remove(wrapIfNotThreadSafe(runListener));
    }

    RunListener wrapIfNotThreadSafe(RunListener runListener) {
        return runListener.getClass().isAnnotationPresent(RunListener.ThreadSafe.class) ? runListener : new SynchronizedRunListener(runListener, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public abstract class SafeNotifier {
        private final List<RunListener> currentListeners;

        protected abstract void notifyListener(RunListener runListener) throws Exception;

        SafeNotifier(RunNotifier runNotifier) {
            this(runNotifier.listeners);
        }

        SafeNotifier(List<RunListener> list) {
            this.currentListeners = list;
        }

        void run() {
            int size = this.currentListeners.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (RunListener runListener : this.currentListeners) {
                try {
                    notifyListener(runListener);
                    arrayList.add(runListener);
                } catch (Exception e) {
                    arrayList2.add(new Failure(Description.TEST_MECHANISM, e));
                }
            }
            RunNotifier.this.fireTestFailures(arrayList, arrayList2);
        }
    }

    public void fireTestRunStarted(final Description description) {
        new SafeNotifier() { // from class: org.junit.runner.notification.RunNotifier.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RunNotifier.this);
            }

            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            protected void notifyListener(RunListener runListener) throws Exception {
                runListener.testRunStarted(description);
            }
        }.run();
    }

    public void fireTestRunFinished(final Result result) {
        new SafeNotifier() { // from class: org.junit.runner.notification.RunNotifier.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RunNotifier.this);
            }

            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            protected void notifyListener(RunListener runListener) throws Exception {
                runListener.testRunFinished(result);
            }
        }.run();
    }

    public void fireTestSuiteStarted(final Description description) {
        new SafeNotifier() { // from class: org.junit.runner.notification.RunNotifier.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RunNotifier.this);
            }

            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            protected void notifyListener(RunListener runListener) throws Exception {
                runListener.testSuiteStarted(description);
            }
        }.run();
    }

    public void fireTestSuiteFinished(final Description description) {
        new SafeNotifier() { // from class: org.junit.runner.notification.RunNotifier.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RunNotifier.this);
            }

            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            protected void notifyListener(RunListener runListener) throws Exception {
                runListener.testSuiteFinished(description);
            }
        }.run();
    }

    public void fireTestStarted(final Description description) throws StoppedByUserException {
        if (this.pleaseStop) {
            throw new StoppedByUserException();
        }
        new SafeNotifier() { // from class: org.junit.runner.notification.RunNotifier.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RunNotifier.this);
            }

            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            protected void notifyListener(RunListener runListener) throws Exception {
                runListener.testStarted(description);
            }
        }.run();
    }

    public void fireTestFailure(Failure failure) {
        fireTestFailures(this.listeners, Arrays.asList(failure));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fireTestFailures(List<RunListener> list, final List<Failure> list2) {
        if (list2.isEmpty()) {
            return;
        }
        new SafeNotifier(list) { // from class: org.junit.runner.notification.RunNotifier.6
            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            protected void notifyListener(RunListener runListener) throws Exception {
                for (Failure failure : list2) {
                    runListener.testFailure(failure);
                }
            }
        }.run();
    }

    public void fireTestAssumptionFailed(final Failure failure) {
        new SafeNotifier() { // from class: org.junit.runner.notification.RunNotifier.7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RunNotifier.this);
            }

            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            protected void notifyListener(RunListener runListener) throws Exception {
                runListener.testAssumptionFailure(failure);
            }
        }.run();
    }

    public void fireTestIgnored(final Description description) {
        new SafeNotifier() { // from class: org.junit.runner.notification.RunNotifier.8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RunNotifier.this);
            }

            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            protected void notifyListener(RunListener runListener) throws Exception {
                runListener.testIgnored(description);
            }
        }.run();
    }

    public void fireTestFinished(final Description description) {
        new SafeNotifier() { // from class: org.junit.runner.notification.RunNotifier.9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RunNotifier.this);
            }

            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            protected void notifyListener(RunListener runListener) throws Exception {
                runListener.testFinished(description);
            }
        }.run();
    }

    public void pleaseStop() {
        this.pleaseStop = true;
    }

    public void addFirstListener(RunListener runListener) {
        if (runListener == null) {
            throw new NullPointerException("Cannot add a null listener");
        }
        this.listeners.add(0, wrapIfNotThreadSafe(runListener));
    }
}
