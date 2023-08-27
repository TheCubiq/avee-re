package org.junit.internal.runners.model;

import java.util.List;
@Deprecated
/* loaded from: classes2.dex */
public class MultipleFailureException extends org.junit.runners.model.MultipleFailureException {
    private static final long serialVersionUID = 1;

    public MultipleFailureException(List<Throwable> list) {
        super(list);
    }
}
