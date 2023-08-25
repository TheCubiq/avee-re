package com.daaw;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class tg2 {
    public final int a;
    public final List b;
    public final int c;
    public final InputStream d;

    public tg2(int i, List list, int i2, InputStream inputStream) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = inputStream;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.a;
    }

    public final InputStream c() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public final List d() {
        return Collections.unmodifiableList(this.b);
    }
}
