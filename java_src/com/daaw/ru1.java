package com.daaw;

import com.daaw.gb;
/* loaded from: classes.dex */
public class ru1 extends bb0 {
    public int y0 = 0;
    public int z0 = 0;
    public int A0 = 0;
    public int B0 = 0;
    public int C0 = 0;
    public int D0 = 0;
    public int E0 = 0;
    public int F0 = 0;
    public boolean G0 = false;
    public int H0 = 0;
    public int I0 = 0;
    public gb.a J0 = new gb.a();
    public gb.b K0 = null;

    public void H0() {
        for (int i = 0; i < this.x0; i++) {
            qj qjVar = this.w0[i];
            if (qjVar != null) {
                qjVar.n0(true);
            }
        }
    }

    public boolean I0() {
        return this.G0;
    }

    @Override // com.daaw.bb0, com.daaw.za0
    public void b(rj rjVar) {
        H0();
    }
}
