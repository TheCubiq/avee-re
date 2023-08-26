package org.junit.internal.runners.statements;

import org.junit.internal.AssumptionViolatedException;
import org.junit.runners.model.Statement;
/* loaded from: classes2.dex */
public class ExpectException extends Statement {
    private final Class<? extends Throwable> expected;
    private final Statement next;

    public ExpectException(Statement statement, Class<? extends Throwable> cls) {
        this.next = statement;
        this.expected = cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // org.junit.runners.model.Statement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void evaluate() throws Exception {
        boolean z;
        try {
            this.next.evaluate();
            z = true;
        } catch (AssumptionViolatedException e) {
            if (!this.expected.isAssignableFrom(e.getClass())) {
                throw e;
            }
            z = false;
            if (z) {
            }
        } catch (Throwable th) {
            if (!this.expected.isAssignableFrom(th.getClass())) {
                throw new Exception("Unexpected exception, expected<" + this.expected.getName() + "> but was<" + th.getClass().getName() + ">", th);
            }
            z = false;
            if (z) {
            }
        }
        if (z) {
            throw new AssertionError("Expected exception: " + this.expected.getName());
        }
    }
}
