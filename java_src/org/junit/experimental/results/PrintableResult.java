package org.junit.experimental.results;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
/* loaded from: classes2.dex */
public class PrintableResult {
    private Result result;

    public static PrintableResult testResult(Class<?> cls) {
        return testResult(Request.aClass(cls));
    }

    public static PrintableResult testResult(Request request) {
        return new PrintableResult(new JUnitCore().run(request));
    }

    public PrintableResult(List<Failure> list) {
        this(new FailureList(list).result());
    }

    private PrintableResult(Result result) {
        this.result = result;
    }

    public int failureCount() {
        return this.result.getFailures().size();
    }

    public List<Failure> failures() {
        return this.result.getFailures();
    }

    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new TextListener(new PrintStream(byteArrayOutputStream)).testRunFinished(this.result);
        return byteArrayOutputStream.toString();
    }
}
