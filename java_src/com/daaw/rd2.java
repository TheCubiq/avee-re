package com.daaw;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class rd2 {
    public final int a;
    public final String b;
    public final List c;
    public final byte[] d;

    public rd2(int i, String str, List list, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.d = bArr;
    }
}
