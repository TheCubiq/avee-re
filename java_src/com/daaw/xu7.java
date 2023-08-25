package com.daaw;

import java.util.ArrayDeque;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class xu7 {

    /* renamed from: a */
    public final ArrayDeque f32966a = new ArrayDeque();

    public /* synthetic */ xu7(wu7 wu7Var) {
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ yq7 m4500a(xu7 xu7Var, yq7 yq7Var, yq7 yq7Var2) {
        xu7Var.m4499b(yq7Var);
        xu7Var.m4499b(yq7Var2);
        yq7 yq7Var3 = (yq7) xu7Var.f32966a.pop();
        while (!xu7Var.f32966a.isEmpty()) {
            yq7Var3 = new bv7((yq7) xu7Var.f32966a.pop(), yq7Var3);
        }
        return yq7Var3;
    }

    /* renamed from: c */
    public static final int m4498c(int i) {
        int binarySearch = Arrays.binarySearch(bv7.f5213y, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* renamed from: b */
    public final void m4499b(yq7 yq7Var) {
        yq7 yq7Var2;
        yq7 yq7Var3;
        if (!yq7Var.mo3408r()) {
            if (!(yq7Var instanceof bv7)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(yq7Var.getClass())));
            }
            bv7 bv7Var = (bv7) yq7Var;
            yq7Var2 = bv7Var.f5215u;
            m4499b(yq7Var2);
            yq7Var3 = bv7Var.f5216v;
            m4499b(yq7Var3);
            return;
        }
        int m4498c = m4498c(yq7Var.mo3411o());
        int m25802N = bv7.m25802N(m4498c + 1);
        if (this.f32966a.isEmpty() || ((yq7) this.f32966a.peek()).mo3411o() >= m25802N) {
            this.f32966a.push(yq7Var);
            return;
        }
        int m25802N2 = bv7.m25802N(m4498c);
        yq7 yq7Var4 = (yq7) this.f32966a.pop();
        while (!this.f32966a.isEmpty() && ((yq7) this.f32966a.peek()).mo3411o() < m25802N2) {
            yq7Var4 = new bv7((yq7) this.f32966a.pop(), yq7Var4);
        }
        bv7 bv7Var2 = new bv7(yq7Var4, yq7Var);
        while (!this.f32966a.isEmpty()) {
            if (((yq7) this.f32966a.peek()).mo3411o() >= bv7.m25802N(m4498c(bv7Var2.mo3411o()) + 1)) {
                break;
            }
            bv7Var2 = new bv7((yq7) this.f32966a.pop(), bv7Var2);
        }
        this.f32966a.push(bv7Var2);
    }
}
