package org.junit.internal;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
/* loaded from: classes2.dex */
public class TextListener extends RunListener {
    private final PrintStream writer;

    public TextListener(JUnitSystem jUnitSystem) {
        this(jUnitSystem.out());
    }

    public TextListener(PrintStream printStream) {
        this.writer = printStream;
    }

    @Override // org.junit.runner.notification.RunListener
    public void testRunFinished(Result result) {
        printHeader(result.getRunTime());
        printFailures(result);
        printFooter(result);
    }

    @Override // org.junit.runner.notification.RunListener
    public void testStarted(Description description) {
        this.writer.append('.');
    }

    @Override // org.junit.runner.notification.RunListener
    public void testFailure(Failure failure) {
        this.writer.append('E');
    }

    @Override // org.junit.runner.notification.RunListener
    public void testIgnored(Description description) {
        this.writer.append('I');
    }

    private PrintStream getWriter() {
        return this.writer;
    }

    protected void printHeader(long j) {
        getWriter().println();
        PrintStream writer = getWriter();
        writer.println("Time: " + elapsedTimeAsString(j));
    }

    protected void printFailures(Result result) {
        List<Failure> failures = result.getFailures();
        if (failures.isEmpty()) {
            return;
        }
        int i = 1;
        if (failures.size() == 1) {
            PrintStream writer = getWriter();
            writer.println("There was " + failures.size() + " failure:");
        } else {
            PrintStream writer2 = getWriter();
            writer2.println("There were " + failures.size() + " failures:");
        }
        for (Failure failure : failures) {
            printFailure(failure, "" + i);
            i++;
        }
    }

    protected void printFailure(Failure failure, String str) {
        PrintStream writer = getWriter();
        writer.println(str + ") " + failure.getTestHeader());
        getWriter().print(failure.getTrimmedTrace());
    }

    protected void printFooter(Result result) {
        if (result.wasSuccessful()) {
            getWriter().println();
            getWriter().print("OK");
            PrintStream writer = getWriter();
            StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(result.getRunCount());
            sb.append(" test");
            sb.append(result.getRunCount() == 1 ? "" : "s");
            sb.append(")");
            writer.println(sb.toString());
        } else {
            getWriter().println();
            getWriter().println("FAILURES!!!");
            PrintStream writer2 = getWriter();
            writer2.println("Tests run: " + result.getRunCount() + ",  Failures: " + result.getFailureCount());
        }
        getWriter().println();
    }

    protected String elapsedTimeAsString(long j) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        double d = j;
        Double.isNaN(d);
        return numberFormat.format(d / 1000.0d);
    }
}
