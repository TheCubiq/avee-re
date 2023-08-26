package org.junit.rules;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.function.ThrowingRunnable;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runners.model.MultipleFailureException;
/* loaded from: classes2.dex */
public class ErrorCollector extends Verifier {
    private List<Throwable> errors = new ArrayList();

    @Override // org.junit.rules.Verifier
    protected void verify() throws Throwable {
        MultipleFailureException.assertEmpty(this.errors);
    }

    public void addError(Throwable th) {
        if (th == null) {
            throw new NullPointerException("Error cannot be null");
        }
        if (th instanceof AssumptionViolatedException) {
            AssertionError assertionError = new AssertionError(th.getMessage());
            assertionError.initCause(th);
            this.errors.add(assertionError);
            return;
        }
        this.errors.add(th);
    }

    public <T> void checkThat(T t, Matcher<T> matcher) {
        checkThat("", t, matcher);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void checkThat(final String str, final T t, final Matcher<T> matcher) {
        checkSucceeds(new Callable<Object>() { // from class: org.junit.rules.ErrorCollector.1
            @Override // java.util.concurrent.Callable
            public Object call() throws Exception {
                Assert.assertThat(str, t, matcher);
                return t;
            }
        });
    }

    public <T> T checkSucceeds(Callable<T> callable) {
        try {
            return callable.call();
        } catch (AssumptionViolatedException e) {
            AssertionError assertionError = new AssertionError("Callable threw AssumptionViolatedException");
            assertionError.initCause(e);
            addError(assertionError);
            return null;
        } catch (Throwable th) {
            addError(th);
            return null;
        }
    }

    public void checkThrows(Class<? extends Throwable> cls, ThrowingRunnable throwingRunnable) {
        try {
            Assert.assertThrows(cls, throwingRunnable);
        } catch (AssertionError e) {
            addError(e);
        }
    }
}
