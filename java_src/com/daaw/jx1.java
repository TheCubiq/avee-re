package com.daaw;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class jx1 extends qj {
    public ArrayList<qj> w0 = new ArrayList<>();

    public void H0() {
        ArrayList<qj> arrayList = this.w0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qj qjVar = this.w0.get(i);
            if (qjVar instanceof jx1) {
                ((jx1) qjVar).H0();
            }
        }
    }

    public void I0(qj qjVar) {
        this.w0.remove(qjVar);
        qjVar.t0(null);
    }

    public void J0() {
        this.w0.clear();
    }

    @Override // com.daaw.qj
    public void W() {
        this.w0.clear();
        super.W();
    }

    @Override // com.daaw.qj
    public void X(gd gdVar) {
        super.X(gdVar);
        int size = this.w0.size();
        for (int i = 0; i < size; i++) {
            this.w0.get(i).X(gdVar);
        }
    }

    public void c(qj qjVar) {
        this.w0.add(qjVar);
        if (qjVar.E() != null) {
            ((jx1) qjVar.E()).I0(qjVar);
        }
        qjVar.t0(this);
    }
}
