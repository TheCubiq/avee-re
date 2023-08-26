package org.junit.runner;

import org.junit.runner.notification.RunNotifier;
/* loaded from: classes.dex */
public abstract class Runner implements Describable {
    @Override // org.junit.runner.Describable
    public abstract Description getDescription();

    public abstract void run(RunNotifier runNotifier);

    public int testCount() {
        return getDescription().testCount();
    }
}
