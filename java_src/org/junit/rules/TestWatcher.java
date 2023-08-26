package org.junit.rules;

import java.util.ArrayList;
import java.util.List;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.Statement;
/* loaded from: classes2.dex */
public abstract class TestWatcher implements TestRule {
    protected void failed(Throwable th, Description description) {
    }

    protected void finished(Description description) {
    }

    @Deprecated
    protected void skipped(AssumptionViolatedException assumptionViolatedException, Description description) {
    }

    protected void starting(Description description) {
    }

    protected void succeeded(Description description) {
    }

    @Override // org.junit.rules.TestRule
    public Statement apply(final Statement statement, final Description description) {
        return new Statement() { // from class: org.junit.rules.TestWatcher.1
            @Override // org.junit.runners.model.Statement
            public void evaluate() throws Throwable {
                ArrayList arrayList = new ArrayList();
                TestWatcher.this.startingQuietly(description, arrayList);
                try {
                    try {
                        statement.evaluate();
                        TestWatcher.this.succeededQuietly(description, arrayList);
                    } finally {
                        TestWatcher.this.finishedQuietly(description, arrayList);
                    }
                } catch (AssumptionViolatedException e) {
                    arrayList.add(e);
                    TestWatcher.this.skippedQuietly(e, description, arrayList);
                    MultipleFailureException.assertEmpty(arrayList);
                } catch (Throwable th) {
                    arrayList.add(th);
                    TestWatcher.this.failedQuietly(th, description, arrayList);
                    MultipleFailureException.assertEmpty(arrayList);
                }
                MultipleFailureException.assertEmpty(arrayList);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void succeededQuietly(Description description, List<Throwable> list) {
        try {
            succeeded(description);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void failedQuietly(Throwable th, Description description, List<Throwable> list) {
        try {
            failed(th, description);
        } catch (Throwable th2) {
            list.add(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void skippedQuietly(AssumptionViolatedException assumptionViolatedException, Description description, List<Throwable> list) {
        try {
            if (assumptionViolatedException instanceof org.junit.AssumptionViolatedException) {
                skipped((org.junit.AssumptionViolatedException) assumptionViolatedException, description);
            } else {
                skipped(assumptionViolatedException, description);
            }
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startingQuietly(Description description, List<Throwable> list) {
        try {
            starting(description);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishedQuietly(Description description, List<Throwable> list) {
        try {
            finished(description);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    protected void skipped(org.junit.AssumptionViolatedException assumptionViolatedException, Description description) {
        skipped((AssumptionViolatedException) assumptionViolatedException, description);
    }
}
