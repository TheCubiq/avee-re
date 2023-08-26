package org.junit.runner;

import java.util.Comparator;
import org.junit.internal.builders.AllDefaultPossibilitiesBuilder;
import org.junit.internal.requests.ClassRequest;
import org.junit.internal.requests.FilterRequest;
import org.junit.internal.requests.OrderingRequest;
import org.junit.internal.requests.SortingRequest;
import org.junit.internal.runners.ErrorReportingRunner;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.Ordering;
import org.junit.runners.model.InitializationError;
/* loaded from: classes2.dex */
public abstract class Request {
    public abstract Runner getRunner();

    public static Request method(Class<?> cls, String str) {
        return aClass(cls).filterWith(Description.createTestDescription(cls, str));
    }

    public static Request aClass(Class<?> cls) {
        return new ClassRequest(cls);
    }

    public static Request classWithoutSuiteMethod(Class<?> cls) {
        return new ClassRequest(cls, false);
    }

    public static Request classes(Computer computer, Class<?>... clsArr) {
        try {
            return runner(computer.getSuite(new AllDefaultPossibilitiesBuilder(), clsArr));
        } catch (InitializationError e) {
            return runner(new ErrorReportingRunner(e, clsArr));
        }
    }

    public static Request classes(Class<?>... clsArr) {
        return classes(JUnitCore.defaultComputer(), clsArr);
    }

    public static Request errorReport(Class<?> cls, Throwable th) {
        return runner(new ErrorReportingRunner(cls, th));
    }

    public static Request runner(final Runner runner) {
        return new Request() { // from class: org.junit.runner.Request.1
            @Override // org.junit.runner.Request
            public Runner getRunner() {
                return Runner.this;
            }
        };
    }

    public Request filterWith(Filter filter) {
        return new FilterRequest(this, filter);
    }

    public Request filterWith(Description description) {
        return filterWith(Filter.matchMethodDescription(description));
    }

    public Request sortWith(Comparator<Description> comparator) {
        return new SortingRequest(this, comparator);
    }

    public Request orderWith(Ordering ordering) {
        return new OrderingRequest(this, ordering);
    }
}
