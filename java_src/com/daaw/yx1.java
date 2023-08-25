package com.daaw;
/* loaded from: classes.dex */
public enum yx1 {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    /* renamed from: a */
    public boolean m3106a() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
