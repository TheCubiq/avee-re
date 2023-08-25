package com.daaw;

import android.content.Context;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class lp4 implements fs4, jr4 {

    /* renamed from: p */
    public final Context f17596p;

    /* renamed from: q */
    public final th6 f17597q;

    /* renamed from: r */
    public final mr3 f17598r;

    public lp4(Context context, th6 th6Var, mr3 mr3Var, byte[] bArr) {
        this.f17596p = context;
        this.f17597q = th6Var;
        this.f17598r = mr3Var;
    }

    @Override // com.daaw.jr4
    /* renamed from: f */
    public final void mo5173f(Context context) {
    }

    @Override // com.daaw.jr4
    /* renamed from: l */
    public final void mo5171l(Context context) {
    }

    @Override // com.daaw.jr4
    /* renamed from: s */
    public final void mo5169s(Context context) {
    }

    @Override // com.daaw.fs4
    public final void zzn() {
        nr3 nr3Var = this.f17597q.f27689e0;
        if (nr3Var == null || !nr3Var.f20604a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f17597q.f27689e0.f20605b.isEmpty()) {
            return;
        }
        arrayList.add(this.f17597q.f27689e0.f20605b);
    }
}
