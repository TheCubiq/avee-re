package com.daaw;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class jx1 extends C2716qj {

    /* renamed from: w0 */
    public ArrayList<C2716qj> f15492w0 = new ArrayList<>();

    /* renamed from: H0 */
    public void mo11273H0() {
        ArrayList<C2716qj> arrayList = this.f15492w0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2716qj c2716qj = this.f15492w0.get(i);
            if (c2716qj instanceof jx1) {
                ((jx1) c2716qj).mo11273H0();
            }
        }
    }

    /* renamed from: I0 */
    public void m18180I0(C2716qj c2716qj) {
        this.f15492w0.remove(c2716qj);
        c2716qj.m12402t0(null);
    }

    /* renamed from: J0 */
    public void m18179J0() {
        this.f15492w0.clear();
    }

    @Override // com.daaw.C2716qj
    /* renamed from: W */
    public void mo11260W() {
        this.f15492w0.clear();
        super.mo11260W();
    }

    @Override // com.daaw.C2716qj
    /* renamed from: X */
    public void mo12441X(C1395gd c1395gd) {
        super.mo12441X(c1395gd);
        int size = this.f15492w0.size();
        for (int i = 0; i < size; i++) {
            this.f15492w0.get(i).mo12441X(c1395gd);
        }
    }

    /* renamed from: c */
    public void m18178c(C2716qj c2716qj) {
        this.f15492w0.add(c2716qj);
        if (c2716qj.m12461E() != null) {
            ((jx1) c2716qj.m12461E()).m18180I0(c2716qj);
        }
        c2716qj.m12402t0(this);
    }
}
