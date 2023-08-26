package org.junit.runners.model;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.TestCouldNotBeSkippedException;
import org.junit.internal.AssumptionViolatedException;
import org.junit.internal.Throwables;
/* loaded from: classes2.dex */
public class MultipleFailureException extends Exception {
    private static final long serialVersionUID = 1;
    private final List<Throwable> fErrors;

    public MultipleFailureException(List<Throwable> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List of Throwables must not be empty");
        }
        this.fErrors = new ArrayList(list.size());
        for (Throwable th : list) {
            if (th instanceof AssumptionViolatedException) {
                th = new TestCouldNotBeSkippedException((AssumptionViolatedException) th);
            }
            this.fErrors.add(th);
        }
    }

    public List<Throwable> getFailures() {
        return Collections.unmodifiableList(this.fErrors);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(String.format("There were %d errors:", Integer.valueOf(this.fErrors.size())));
        for (Throwable th : this.fErrors) {
            sb.append(String.format("%n  %s(%s)", th.getClass().getName(), th.getMessage()));
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        for (Throwable th : this.fErrors) {
            th.printStackTrace();
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        for (Throwable th : this.fErrors) {
            th.printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        for (Throwable th : this.fErrors) {
            th.printStackTrace(printWriter);
        }
    }

    public static void assertEmpty(List<Throwable> list) throws Exception {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() == 1) {
            throw Throwables.rethrowAsException(list.get(0));
        }
        throw new org.junit.internal.runners.model.MultipleFailureException(list);
    }
}
