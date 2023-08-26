package org.junit.internal.runners.statements;

import java.util.List;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;
/* loaded from: classes2.dex */
public class RunBefores extends Statement {
    private final List<FrameworkMethod> befores;
    private final Statement next;
    private final Object target;

    public RunBefores(Statement statement, List<FrameworkMethod> list, Object obj) {
        this.next = statement;
        this.befores = list;
        this.target = obj;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Throwable {
        for (FrameworkMethod frameworkMethod : this.befores) {
            invokeMethod(frameworkMethod);
        }
        this.next.evaluate();
    }

    protected void invokeMethod(FrameworkMethod frameworkMethod) throws Throwable {
        frameworkMethod.invokeExplosively(this.target, new Object[0]);
    }
}
