package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class lt2 extends nt2 {
    public final long P0;
    public final List Q0;
    public final List R0;

    public lt2(int i, long j) {
        super(i);
        this.P0 = j;
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
    }

    public final lt2 d(int i) {
        int size = this.R0.size();
        for (int i2 = 0; i2 < size; i2++) {
            lt2 lt2Var = (lt2) this.R0.get(i2);
            if (lt2Var.a == i) {
                return lt2Var;
            }
        }
        return null;
    }

    public final mt2 e(int i) {
        int size = this.Q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            mt2 mt2Var = (mt2) this.Q0.get(i2);
            if (mt2Var.a == i) {
                return mt2Var;
            }
        }
        return null;
    }

    public final void f(lt2 lt2Var) {
        this.R0.add(lt2Var);
    }

    public final void g(mt2 mt2Var) {
        this.Q0.add(mt2Var);
    }

    @Override // com.daaw.nt2
    public final String toString() {
        String c = nt2.c(this.a);
        String arrays = Arrays.toString(this.Q0.toArray());
        String arrays2 = Arrays.toString(this.R0.toArray());
        return c + " leaves: " + arrays + " containers: " + arrays2;
    }
}
