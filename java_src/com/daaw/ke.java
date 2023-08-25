package com.daaw;

import android.text.Layout;
/* loaded from: classes.dex */
public final class ke extends ln implements Comparable<ke> {
    public final int D;

    public ke(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.D = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(ke keVar) {
        int i = keVar.D;
        int i2 = this.D;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }
}
