package org.junit.runners.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.internal.runners.ErrorReportingRunner;
import org.junit.runner.Description;
import org.junit.runner.OrderWith;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.InvalidOrderingException;
import org.junit.runner.manipulation.Ordering;
/* loaded from: classes2.dex */
public abstract class RunnerBuilder {
    private final Set<Class<?>> parents = new HashSet();

    public abstract Runner runnerForClass(Class<?> cls) throws Throwable;

    public Runner safeRunnerForClass(Class<?> cls) {
        try {
            Runner runnerForClass = runnerForClass(cls);
            if (runnerForClass != null) {
                configureRunner(runnerForClass);
            }
            return runnerForClass;
        } catch (Throwable th) {
            return new ErrorReportingRunner(cls, th);
        }
    }

    private void configureRunner(Runner runner) throws InvalidOrderingException {
        Description description = runner.getDescription();
        OrderWith orderWith = (OrderWith) description.getAnnotation(OrderWith.class);
        if (orderWith != null) {
            Ordering.definedBy(orderWith.value(), description).apply(runner);
        }
    }

    Class<?> addParent(Class<?> cls) throws InitializationError {
        if (this.parents.add(cls)) {
            return cls;
        }
        throw new InitializationError(String.format("class '%s' (possibly indirectly) contains itself as a SuiteClass", cls.getName()));
    }

    void removeParent(Class<?> cls) {
        this.parents.remove(cls);
    }

    public List<Runner> runners(Class<?> cls, Class<?>[] clsArr) throws InitializationError {
        addParent(cls);
        try {
            return runners(clsArr);
        } finally {
            removeParent(cls);
        }
    }

    public List<Runner> runners(Class<?> cls, List<Class<?>> list) throws InitializationError {
        return runners(cls, (Class[]) list.toArray(new Class[0]));
    }

    private List<Runner> runners(Class<?>[] clsArr) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls : clsArr) {
            Runner safeRunnerForClass = safeRunnerForClass(cls);
            if (safeRunnerForClass != null) {
                arrayList.add(safeRunnerForClass);
            }
        }
        return arrayList;
    }
}
