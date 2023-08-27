package org.junit.internal.runners.statements;

import java.util.ArrayList;
import java.util.List;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.Statement;
/* loaded from: classes2.dex */
public class RunAfters extends Statement {
    private final List<FrameworkMethod> afters;
    private final Statement next;
    private final Object target;

    public RunAfters(Statement statement, List<FrameworkMethod> list, Object obj) {
        this.next = statement;
        this.afters = list;
        this.target = obj;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Throwable {
        ArrayList arrayList = new ArrayList();
        try {
            this.next.evaluate();
        } catch (Throwable th) {
            try {
                arrayList.add(th);
                for (FrameworkMethod frameworkMethod : this.afters) {
                    try {
                        invokeMethod(frameworkMethod);
                    } catch (Throwable th2) {
                        arrayList.add(th2);
                    }
                }
            } finally {
                for (FrameworkMethod frameworkMethod2 : this.afters) {
                    try {
                        invokeMethod(frameworkMethod2);
                    } catch (Throwable th3) {
                        arrayList.add(th3);
                    }
                }
            }
        }
        MultipleFailureException.assertEmpty(arrayList);
    }

    protected void invokeMethod(FrameworkMethod frameworkMethod) throws Throwable {
        frameworkMethod.invokeExplosively(this.target, new Object[0]);
    }
}
