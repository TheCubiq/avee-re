package org.junit.rules;

import org.junit.runner.Description;
/* loaded from: classes2.dex */
public class TestName extends TestWatcher {
    private volatile String name;

    @Override // org.junit.rules.TestWatcher
    protected void starting(Description description) {
        this.name = description.getMethodName();
    }

    public String getMethodName() {
        return this.name;
    }
}
