package org.junit.internal.runners.model;

import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
/* loaded from: classes2.dex */
public class EachTestNotifier {
    private final Description description;
    private final RunNotifier notifier;

    public EachTestNotifier(RunNotifier runNotifier, Description description) {
        this.notifier = runNotifier;
        this.description = description;
    }

    public void addFailure(Throwable th) {
        if (th instanceof org.junit.runners.model.MultipleFailureException) {
            addMultipleFailureException((org.junit.runners.model.MultipleFailureException) th);
        } else {
            this.notifier.fireTestFailure(new Failure(this.description, th));
        }
    }

    private void addMultipleFailureException(org.junit.runners.model.MultipleFailureException multipleFailureException) {
        for (Throwable th : multipleFailureException.getFailures()) {
            addFailure(th);
        }
    }

    public void addFailedAssumption(AssumptionViolatedException assumptionViolatedException) {
        this.notifier.fireTestAssumptionFailed(new Failure(this.description, assumptionViolatedException));
    }

    public void fireTestFinished() {
        this.notifier.fireTestFinished(this.description);
    }

    public void fireTestStarted() {
        this.notifier.fireTestStarted(this.description);
    }

    public void fireTestIgnored() {
        this.notifier.fireTestIgnored(this.description);
    }

    public void fireTestSuiteStarted() {
        this.notifier.fireTestSuiteStarted(this.description);
    }

    public void fireTestSuiteFinished() {
        this.notifier.fireTestSuiteFinished(this.description);
    }
}
