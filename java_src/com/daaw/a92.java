package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class a92 extends c92 {

    /* renamed from: b */
    public final long f3004b;

    /* renamed from: c */
    public final List f3005c;

    /* renamed from: d */
    public final List f3006d;

    public a92(int i, long j) {
        super(i);
        this.f3004b = j;
        this.f3005c = new ArrayList();
        this.f3006d = new ArrayList();
    }

    /* renamed from: c */
    public final a92 m27557c(int i) {
        int size = this.f3006d.size();
        for (int i2 = 0; i2 < size; i2++) {
            a92 a92Var = (a92) this.f3006d.get(i2);
            if (a92Var.f5641a == i) {
                return a92Var;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final b92 m27556d(int i) {
        int size = this.f3005c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b92 b92Var = (b92) this.f3005c.get(i2);
            if (b92Var.f5641a == i) {
                return b92Var;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m27555e(a92 a92Var) {
        this.f3006d.add(a92Var);
    }

    /* renamed from: f */
    public final void m27554f(b92 b92Var) {
        this.f3005c.add(b92Var);
    }

    @Override // com.daaw.c92
    public final String toString() {
        String m25487b = c92.m25487b(this.f5641a);
        String arrays = Arrays.toString(this.f3005c.toArray());
        String arrays2 = Arrays.toString(this.f3006d.toArray());
        return m25487b + " leaves: " + arrays + " containers: " + arrays2;
    }
}
