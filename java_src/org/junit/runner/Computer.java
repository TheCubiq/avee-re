package org.junit.runner;

import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;
/* loaded from: classes2.dex */
public class Computer {
    public static Computer serial() {
        return new Computer();
    }

    public Runner getSuite(final RunnerBuilder runnerBuilder, Class<?>[] clsArr) throws InitializationError {
        return new Suite(new RunnerBuilder() { // from class: org.junit.runner.Computer.1
            @Override // org.junit.runners.model.RunnerBuilder
            public Runner runnerForClass(Class<?> cls) throws Throwable {
                return Computer.this.getRunner(runnerBuilder, cls);
            }
        }, clsArr) { // from class: org.junit.runner.Computer.2
            @Override // org.junit.runners.ParentRunner
            protected String getName() {
                return "classes";
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Runner getRunner(RunnerBuilder runnerBuilder, Class<?> cls) throws Throwable {
        return runnerBuilder.runnerForClass(cls);
    }
}
