package com.daaw;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class rd2 {

    /* renamed from: a */
    public final int f25163a;

    /* renamed from: b */
    public final String f25164b;

    /* renamed from: c */
    public final List f25165c;

    /* renamed from: d */
    public final byte[] f25166d;

    public rd2(int i, String str, List list, byte[] bArr) {
        this.f25163a = i;
        this.f25164b = str;
        this.f25165c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f25166d = bArr;
    }
}
