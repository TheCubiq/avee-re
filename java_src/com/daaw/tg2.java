package com.daaw;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class tg2 {

    /* renamed from: a */
    public final int f27616a;

    /* renamed from: b */
    public final List f27617b;

    /* renamed from: c */
    public final int f27618c;

    /* renamed from: d */
    public final InputStream f27619d;

    public tg2(int i, List list, int i2, InputStream inputStream) {
        this.f27616a = i;
        this.f27617b = list;
        this.f27618c = i2;
        this.f27619d = inputStream;
    }

    /* renamed from: a */
    public final int m9183a() {
        return this.f27618c;
    }

    /* renamed from: b */
    public final int m9182b() {
        return this.f27616a;
    }

    /* renamed from: c */
    public final InputStream m9181c() {
        InputStream inputStream = this.f27619d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    /* renamed from: d */
    public final List m9180d() {
        return Collections.unmodifiableList(this.f27617b);
    }
}
