package org.junit.internal;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class ArrayComparisonFailure extends AssertionError {
    private static final long serialVersionUID = 1;
    private final AssertionError fCause;
    private final List<Integer> fIndices = new ArrayList();
    private final String fMessage;

    public ArrayComparisonFailure(String str, AssertionError assertionError, int i) {
        this.fMessage = str;
        this.fCause = assertionError;
        initCause(assertionError);
        addDimension(i);
    }

    public void addDimension(int i) {
        this.fIndices.add(0, Integer.valueOf(i));
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        return super.getCause() == null ? this.fCause : super.getCause();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        String str = this.fMessage;
        if (str != null) {
            sb.append(str);
        }
        sb.append("arrays first differed at element ");
        for (Integer num : this.fIndices) {
            int intValue = num.intValue();
            sb.append("[");
            sb.append(intValue);
            sb.append("]");
        }
        sb.append("; ");
        sb.append(getCause().getMessage());
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getMessage();
    }
}
