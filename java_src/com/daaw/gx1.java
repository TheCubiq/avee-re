package com.daaw;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class gx1 implements th1 {

    /* renamed from: p */
    public final List<bx1> f11827p;

    /* renamed from: q */
    public final int f11828q;

    /* renamed from: r */
    public final long[] f11829r;

    /* renamed from: s */
    public final long[] f11830s;

    public gx1(List<bx1> list) {
        this.f11827p = list;
        int size = list.size();
        this.f11828q = size;
        this.f11829r = new long[size * 2];
        for (int i = 0; i < this.f11828q; i++) {
            bx1 bx1Var = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f11829r;
            jArr[i2] = bx1Var.f5241D;
            jArr[i2 + 1] = bx1Var.f5242E;
        }
        long[] jArr2 = this.f11829r;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f11830s = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.daaw.th1
    /* renamed from: a */
    public int mo3753a(long j) {
        int m10014c = sq1.m10014c(this.f11830s, j, false, false);
        if (m10014c < this.f11830s.length) {
            return m10014c;
        }
        return -1;
    }

    @Override // com.daaw.th1
    /* renamed from: b */
    public long mo3752b(int i) {
        C2914s6.m10690a(i >= 0);
        C2914s6.m10690a(i < this.f11830s.length);
        return this.f11830s[i];
    }

    @Override // com.daaw.th1
    /* renamed from: c */
    public List<C2099ln> mo3751c(long j) {
        SpannableStringBuilder append;
        SpannableStringBuilder spannableStringBuilder = null;
        bx1 bx1Var = null;
        ArrayList arrayList = null;
        for (int i = 0; i < this.f11828q; i++) {
            long[] jArr = this.f11829r;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                bx1 bx1Var2 = this.f11827p.get(i);
                if (!bx1Var2.m25778a()) {
                    arrayList.add(bx1Var2);
                } else if (bx1Var == null) {
                    bx1Var = bx1Var2;
                } else {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        append = spannableStringBuilder.append(bx1Var.f17547p).append((CharSequence) "\n");
                    } else {
                        append = spannableStringBuilder.append((CharSequence) "\n");
                    }
                    append.append(bx1Var2.f17547p);
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
    /* renamed from: d */
    public int mo3750d() {
        return this.f11830s.length;
    }
}
