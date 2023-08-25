package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class lt2 extends nt2 {

    /* renamed from: P0 */
    public final long f17739P0;

    /* renamed from: Q0 */
    public final List f17740Q0;

    /* renamed from: R0 */
    public final List f17741R0;

    public lt2(int i, long j) {
        super(i);
        this.f17739P0 = j;
        this.f17740Q0 = new ArrayList();
        this.f17741R0 = new ArrayList();
    }

    /* renamed from: d */
    public final lt2 m16570d(int i) {
        int size = this.f17741R0.size();
        for (int i2 = 0; i2 < size; i2++) {
            lt2 lt2Var = (lt2) this.f17741R0.get(i2);
            if (lt2Var.f20723a == i) {
                return lt2Var;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final mt2 m16569e(int i) {
        int size = this.f17740Q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            mt2 mt2Var = (mt2) this.f17740Q0.get(i2);
            if (mt2Var.f20723a == i) {
                return mt2Var;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void m16568f(lt2 lt2Var) {
        this.f17741R0.add(lt2Var);
    }

    /* renamed from: g */
    public final void m16567g(mt2 mt2Var) {
        this.f17740Q0.add(mt2Var);
    }

    @Override // com.daaw.nt2
    public final String toString() {
        String m14827c = nt2.m14827c(this.f20723a);
        String arrays = Arrays.toString(this.f17740Q0.toArray());
        String arrays2 = Arrays.toString(this.f17741R0.toArray());
        return m14827c + " leaves: " + arrays + " containers: " + arrays2;
    }
}
