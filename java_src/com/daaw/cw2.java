package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class cw2 implements yv2 {
    public final yv2[] p;
    public final ArrayList q;
    public xv2 s;
    public mq2 t;
    public bw2 v;
    public final lq2 r = new lq2();
    public int u = -1;

    public cw2(yv2... yv2VarArr) {
        this.p = yv2VarArr;
        this.q = new ArrayList(Arrays.asList(yv2VarArr));
    }

    public static /* bridge */ /* synthetic */ void d(cw2 cw2Var, int i, mq2 mq2Var, Object obj) {
        bw2 bw2Var;
        if (cw2Var.v == null) {
            for (int i2 = 0; i2 <= 0; i2++) {
                mq2Var.g(i2, cw2Var.r, false);
            }
            int i3 = cw2Var.u;
            if (i3 == -1) {
                cw2Var.u = 1;
            } else if (i3 != 1) {
                bw2Var = new bw2(1);
                cw2Var.v = bw2Var;
            }
            bw2Var = null;
            cw2Var.v = bw2Var;
        }
        if (cw2Var.v != null) {
            return;
        }
        cw2Var.q.remove(cw2Var.p[i]);
        if (i == 0) {
            cw2Var.t = mq2Var;
        }
        if (cw2Var.q.isEmpty()) {
            cw2Var.s.d(cw2Var.t, null);
        }
    }

    @Override // com.daaw.yv2
    public final void a(wv2 wv2Var) {
        zv2 zv2Var = (zv2) wv2Var;
        int i = 0;
        while (true) {
            yv2[] yv2VarArr = this.p;
            if (i >= yv2VarArr.length) {
                return;
            }
            yv2VarArr[i].a(zv2Var.p[i]);
            i++;
        }
    }

    @Override // com.daaw.yv2
    public final void b(op2 op2Var, boolean z, xv2 xv2Var) {
        this.s = xv2Var;
        int i = 0;
        while (true) {
            yv2[] yv2VarArr = this.p;
            if (i >= yv2VarArr.length) {
                return;
            }
            yv2VarArr[i].b(op2Var, false, new aw2(this, i));
            i++;
        }
    }

    @Override // com.daaw.yv2
    public final wv2 c(int i, nx2 nx2Var) {
        int length = this.p.length;
        wv2[] wv2VarArr = new wv2[length];
        for (int i2 = 0; i2 < length; i2++) {
            wv2VarArr[i2] = this.p[i2].c(i, nx2Var);
        }
        return new zv2(wv2VarArr);
    }

    @Override // com.daaw.yv2
    public final void zza() {
        bw2 bw2Var = this.v;
        if (bw2Var != null) {
            throw bw2Var;
        }
        for (yv2 yv2Var : this.p) {
            yv2Var.zza();
        }
    }

    @Override // com.daaw.yv2
    public final void zzd() {
        for (yv2 yv2Var : this.p) {
            yv2Var.zzd();
        }
    }
}
