package org.junit.internal.runners;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InvalidTestClassError;
/* loaded from: classes2.dex */
public class ErrorReportingRunner extends Runner {
    private final List<Throwable> causes;
    private final String classNames;

    public ErrorReportingRunner(Class<?> cls, Throwable th) {
        this(th, cls);
    }

    public ErrorReportingRunner(Throwable th, Class<?>... clsArr) {
        if (clsArr == null || clsArr.length == 0) {
            throw new NullPointerException("Test classes cannot be null or empty");
        }
        for (Class<?> cls : clsArr) {
            if (cls == null) {
                throw new NullPointerException("Test class cannot be null");
            }
        }
        this.classNames = getClassNames(clsArr);
        this.causes = getCauses(th);
    }

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        Description createSuiteDescription = Description.createSuiteDescription(this.classNames, new Annotation[0]);
        for (Throwable th : this.causes) {
            createSuiteDescription.addChild(describeCause());
        }
        return createSuiteDescription;
    }

    @Override // org.junit.runner.Runner
    public void run(RunNotifier runNotifier) {
        for (Throwable th : this.causes) {
            runCause(th, runNotifier);
        }
    }

    private String getClassNames(Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder();
        for (Class<?> cls : clsArr) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(cls.getName());
        }
        return sb.toString();
    }

    private List<Throwable> getCauses(Throwable th) {
        if (th instanceof InvocationTargetException) {
            return getCauses(th.getCause());
        }
        if (th instanceof InvalidTestClassError) {
            return Collections.singletonList(th);
        }
        if (th instanceof org.junit.runners.model.InitializationError) {
            return ((org.junit.runners.model.InitializationError) th).getCauses();
        }
        if (th instanceof InitializationError) {
            return ((InitializationError) th).getCauses();
        }
        return Collections.singletonList(th);
    }

    private Description describeCause() {
        return Description.createTestDescription(this.classNames, "initializationError", new Annotation[0]);
    }

    private void runCause(Throwable th, RunNotifier runNotifier) {
        Description describeCause = describeCause();
        runNotifier.fireTestStarted(describeCause);
        runNotifier.fireTestFailure(new Failure(describeCause, th));
        runNotifier.fireTestFinished(describeCause);
    }
}
