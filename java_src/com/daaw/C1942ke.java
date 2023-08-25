package com.daaw;

import android.text.Layout;
/* renamed from: com.daaw.ke */
/* loaded from: classes.dex */
public final class C1942ke extends C2099ln implements Comparable<C1942ke> {

    /* renamed from: D */
    public final int f16321D;

    public C1942ke(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.f16321D = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C1942ke c1942ke) {
        int i = c1942ke.f16321D;
        int i2 = this.f16321D;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }
}
