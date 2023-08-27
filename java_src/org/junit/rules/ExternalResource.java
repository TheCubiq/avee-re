package org.junit.rules;

import java.util.ArrayList;
import org.junit.runner.Description;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.Statement;
/* loaded from: classes2.dex */
public abstract class ExternalResource implements TestRule {
    protected void after() {
    }

    protected void before() throws Throwable {
    }

    @Override // org.junit.rules.TestRule
    public Statement apply(Statement statement, Description description) {
        return statement(statement);
    }

    private Statement statement(final Statement statement) {
        return new Statement() { // from class: org.junit.rules.ExternalResource.1
            @Override // org.junit.runners.model.Statement
            public void evaluate() throws Throwable {
                ExternalResource.this.before();
                ArrayList arrayList = new ArrayList();
                try {
                    statement.evaluate();
                    ExternalResource.this.after();
                } catch (Throwable th) {
                    arrayList.add(th);
                }
                MultipleFailureException.assertEmpty(arrayList);
            }
        };
    }
}
