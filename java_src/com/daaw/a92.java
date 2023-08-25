package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class a92 extends c92 {
    public final long b;
    public final List c;
    public final List d;

    public a92(int i, long j) {
        super(i);
        this.b = j;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final a92 c(int i) {
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            a92 a92Var = (a92) this.d.get(i2);
            if (a92Var.a == i) {
                return a92Var;
            }
        }
        return null;
    }

    public final b92 d(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b92 b92Var = (b92) this.c.get(i2);
            if (b92Var.a == i) {
                return b92Var;
            }
        }
        return null;
    }

    public final void e(a92 a92Var) {
        this.d.add(a92Var);
    }

    public final void f(b92 b92Var) {
        this.c.add(b92Var);
    }

    @Override // com.daaw.c92
    public final String toString() {
        String b = c92.b(this.a);
        String arrays = Arrays.toString(this.c.toArray());
        String arrays2 = Arrays.toString(this.d.toArray());
        return b + " leaves: " + arrays + " containers: " + arrays2;
    }
}
