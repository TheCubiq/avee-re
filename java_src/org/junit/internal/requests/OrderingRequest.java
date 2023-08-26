package org.junit.internal.requests;

import org.junit.internal.runners.ErrorReportingRunner;
import org.junit.runner.Request;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.InvalidOrderingException;
import org.junit.runner.manipulation.Ordering;
/* loaded from: classes2.dex */
public class OrderingRequest extends MemoizingRequest {
    private final Ordering ordering;
    private final Request request;

    public OrderingRequest(Request request, Ordering ordering) {
        this.request = request;
        this.ordering = ordering;
    }

    @Override // org.junit.internal.requests.MemoizingRequest
    protected Runner createRunner() {
        Runner runner = this.request.getRunner();
        try {
            this.ordering.apply(runner);
            return runner;
        } catch (InvalidOrderingException e) {
            return new ErrorReportingRunner(this.ordering.getClass(), e);
        }
    }
}
