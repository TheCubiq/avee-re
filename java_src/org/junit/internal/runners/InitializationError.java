package org.junit.internal.runners;

import java.util.Arrays;
import java.util.List;
@Deprecated
/* loaded from: classes2.dex */
public class InitializationError extends Exception {
    private static final long serialVersionUID = 1;
    private final List<Throwable> fErrors;

    public InitializationError(List<Throwable> list) {
        this.fErrors = list;
    }

    public InitializationError(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public InitializationError(String str) {
        this(new Exception(str));
    }

    public List<Throwable> getCauses() {
        return this.fErrors;
    }
}
