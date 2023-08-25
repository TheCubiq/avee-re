package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class cw2 implements yv2 {

    /* renamed from: p */
    public final yv2[] f6220p;

    /* renamed from: q */
    public final ArrayList f6221q;

    /* renamed from: s */
    public xv2 f6223s;

    /* renamed from: t */
    public mq2 f6224t;

    /* renamed from: v */
    public bw2 f6226v;

    /* renamed from: r */
    public final lq2 f6222r = new lq2();

    /* renamed from: u */
    public int f6225u = -1;

    public cw2(yv2... yv2VarArr) {
        this.f6220p = yv2VarArr;
        this.f6221q = new ArrayList(Arrays.asList(yv2VarArr));
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m24946d(cw2 cw2Var, int i, mq2 mq2Var, Object obj) {
        bw2 bw2Var;
        if (cw2Var.f6226v == null) {
            for (int i2 = 0; i2 <= 0; i2++) {
                mq2Var.m15848g(i2, cw2Var.f6222r, false);
            }
            int i3 = cw2Var.f6225u;
            if (i3 == -1) {
                cw2Var.f6225u = 1;
            } else if (i3 != 1) {
                bw2Var = new bw2(1);
                cw2Var.f6226v = bw2Var;
            }
            bw2Var = null;
            cw2Var.f6226v = bw2Var;
        }
        if (cw2Var.f6226v != null) {
            return;
        }
        cw2Var.f6221q.remove(cw2Var.f6220p[i]);
        if (i == 0) {
            cw2Var.f6224t = mq2Var;
        }
        if (cw2Var.f6221q.isEmpty()) {
            cw2Var.f6223s.mo4485d(cw2Var.f6224t, null);
        }
    }

    @Override // com.daaw.yv2
    /* renamed from: a */
    public final void mo3169a(wv2 wv2Var) {
        zv2 zv2Var = (zv2) wv2Var;
        int i = 0;
        while (true) {
            yv2[] yv2VarArr = this.f6220p;
            if (i >= yv2VarArr.length) {
                return;
            }
            yv2VarArr[i].mo3169a(zv2Var.f35585p[i]);
            i++;
        }
    }

    @Override // com.daaw.yv2
    /* renamed from: b */
    public final void mo3168b(op2 op2Var, boolean z, xv2 xv2Var) {
        this.f6223s = xv2Var;
        int i = 0;
        while (true) {
            yv2[] yv2VarArr = this.f6220p;
            if (i >= yv2VarArr.length) {
                return;
            }
            yv2VarArr[i].mo3168b(op2Var, false, new aw2(this, i));
            i++;
        }
    }

    @Override // com.daaw.yv2
    /* renamed from: c */
    public final wv2 mo3167c(int i, nx2 nx2Var) {
        int length = this.f6220p.length;
        wv2[] wv2VarArr = new wv2[length];
        for (int i2 = 0; i2 < length; i2++) {
            wv2VarArr[i2] = this.f6220p[i2].mo3167c(i, nx2Var);
        }
        return new zv2(wv2VarArr);
    }

    @Override // com.daaw.yv2
    public final void zza() {
        bw2 bw2Var = this.f6226v;
        if (bw2Var != null) {
            throw bw2Var;
        }
        for (yv2 yv2Var : this.f6220p) {
            yv2Var.zza();
        }
    }

    @Override // com.daaw.yv2
    public final void zzd() {
        for (yv2 yv2Var : this.f6220p) {
            yv2Var.zzd();
        }
    }
}
