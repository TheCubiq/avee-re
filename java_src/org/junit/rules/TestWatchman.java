package org.junit.rules;

import org.junit.internal.AssumptionViolatedException;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;
@Deprecated
/* loaded from: classes2.dex */
public class TestWatchman implements MethodRule {
    public void failed(Throwable th, FrameworkMethod frameworkMethod) {
    }

    public void finished(FrameworkMethod frameworkMethod) {
    }

    public void starting(FrameworkMethod frameworkMethod) {
    }

    public void succeeded(FrameworkMethod frameworkMethod) {
    }

    @Override // org.junit.rules.MethodRule
    public Statement apply(final Statement statement, final FrameworkMethod frameworkMethod, Object obj) {
        return new Statement() { // from class: org.junit.rules.TestWatchman.1
            @Override // org.junit.runners.model.Statement
            public void evaluate() throws Throwable {
                TestWatchman.this.starting(frameworkMethod);
                try {
                    try {
                        statement.evaluate();
                        TestWatchman.this.succeeded(frameworkMethod);
                    } finally {
                        TestWatchman.this.finished(frameworkMethod);
                    }
                } catch (AssumptionViolatedException e) {
                    throw e;
                } catch (Throwable th) {
                    TestWatchman.this.failed(th, frameworkMethod);
                    throw th;
                }
            }
        };
    }
}
