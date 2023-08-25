package com.daaw;

import java.util.ArrayDeque;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class xu7 {
    public final ArrayDeque a = new ArrayDeque();

    public /* synthetic */ xu7(wu7 wu7Var) {
    }

    public static /* bridge */ /* synthetic */ yq7 a(xu7 xu7Var, yq7 yq7Var, yq7 yq7Var2) {
        xu7Var.b(yq7Var);
        xu7Var.b(yq7Var2);
        yq7 yq7Var3 = (yq7) xu7Var.a.pop();
        while (!xu7Var.a.isEmpty()) {
            yq7Var3 = new bv7((yq7) xu7Var.a.pop(), yq7Var3);
        }
        return yq7Var3;
    }

    public static final int c(int i) {
        int binarySearch = Arrays.binarySearch(bv7.y, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    public final void b(yq7 yq7Var) {
        yq7 yq7Var2;
        yq7 yq7Var3;
        if (!yq7Var.r()) {
            if (!(yq7Var instanceof bv7)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(yq7Var.getClass())));
            }
            bv7 bv7Var = (bv7) yq7Var;
            yq7Var2 = bv7Var.u;
            b(yq7Var2);
            yq7Var3 = bv7Var.v;
            b(yq7Var3);
            return;
        }
        int c = c(yq7Var.o());
        int N = bv7.N(c + 1);
        if (this.a.isEmpty() || ((yq7) this.a.peek()).o() >= N) {
            this.a.push(yq7Var);
            return;
        }
        int N2 = bv7.N(c);
        yq7 yq7Var4 = (yq7) this.a.pop();
        while (!this.a.isEmpty() && ((yq7) this.a.peek()).o() < N2) {
            yq7Var4 = new bv7((yq7) this.a.pop(), yq7Var4);
        }
        bv7 bv7Var2 = new bv7(yq7Var4, yq7Var);
        while (!this.a.isEmpty()) {
            if (((yq7) this.a.peek()).o() >= bv7.N(c(bv7Var2.o()) + 1)) {
                break;
            }
            bv7Var2 = new bv7((yq7) this.a.pop(), bv7Var2);
        }
        this.a.push(bv7Var2);
    }
}
