package com.daaw;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class gx1 implements th1 {
    public final List<bx1> p;
    public final int q;
    public final long[] r;
    public final long[] s;

    public gx1(List<bx1> list) {
        this.p = list;
        int size = list.size();
        this.q = size;
        this.r = new long[size * 2];
        for (int i = 0; i < this.q; i++) {
            bx1 bx1Var = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.r;
            jArr[i2] = bx1Var.D;
            jArr[i2 + 1] = bx1Var.E;
        }
        long[] jArr2 = this.r;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.s = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.daaw.th1
    public int a(long j) {
        int c = sq1.c(this.s, j, false, false);
        if (c < this.s.length) {
            return c;
        }
        return -1;
    }

    @Override // com.daaw.th1
    public long b(int i) {
        s6.a(i >= 0);
        s6.a(i < this.s.length);
        return this.s[i];
    }

    @Override // com.daaw.th1
    public List<ln> c(long j) {
        SpannableStringBuilder append;
        SpannableStringBuilder spannableStringBuilder = null;
        bx1 bx1Var = null;
        ArrayList arrayList = null;
        for (int i = 0; i < this.q; i++) {
            long[] jArr = this.r;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                bx1 bx1Var2 = this.p.get(i);
                if (!bx1Var2.a()) {
                    arrayList.add(bx1Var2);
                } else if (bx1Var == null) {
                    bx1Var = bx1Var2;
                } else {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        append = spannableStringBuilder.append(bx1Var.p).append((CharSequence) "\n");
                    } else {
                        append = spannableStringBuilder.append((CharSequence) "\n");
                    }
                    append.append(bx1Var2.p);
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new bx1(spannableStringBuilder));
        } else if (bx1Var != null) {
            arrayList.add(bx1Var);
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    @Override // com.daaw.th1
    public int d() {
        return this.s.length;
    }
}
