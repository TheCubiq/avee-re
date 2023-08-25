package com.daaw;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class wo5 implements vz4 {

    /* renamed from: b */
    public static final List f31425b = new ArrayList(50);

    /* renamed from: a */
    public final Handler f31426a;

    public wo5(Handler handler) {
        this.f31426a = handler;
    }

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ void m5887h(qn5 qn5Var) {
        List list = f31425b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(qn5Var);
            }
        }
    }

    /* renamed from: j */
    public static qn5 m5885j() {
        qn5 qn5Var;
        List list = f31425b;
        synchronized (list) {
            qn5Var = list.isEmpty() ? new qn5(null) : (qn5) list.remove(list.size() - 1);
        }
        return qn5Var;
    }

    @Override // com.daaw.vz4
    /* renamed from: a */
    public final sy4 mo5894a(int i) {
        qn5 m5885j = m5885j();
        m5885j.m12323a(this.f31426a.obtainMessage(i), this);
        return m5885j;
    }

    @Override // com.daaw.vz4
    /* renamed from: b */
    public final boolean mo5893b(Runnable runnable) {
        return this.f31426a.post(runnable);
    }

    @Override // com.daaw.vz4
    /* renamed from: c */
    public final sy4 mo5892c(int i, Object obj) {
        qn5 m5885j = m5885j();
        m5885j.m12323a(this.f31426a.obtainMessage(i, obj), this);
        return m5885j;
    }

    @Override // com.daaw.vz4
    /* renamed from: d */
    public final boolean mo5891d(sy4 sy4Var) {
        return ((qn5) sy4Var).m12322b(this.f31426a);
    }

    @Override // com.daaw.vz4
    /* renamed from: e */
    public final void mo5890e(Object obj) {
        this.f31426a.removeCallbacksAndMessages(null);
    }

    @Override // com.daaw.vz4
    /* renamed from: f */
    public final sy4 mo5889f(int i, int i2, int i3) {
        qn5 m5885j = m5885j();
        m5885j.m12323a(this.f31426a.obtainMessage(1, i2, i3), this);
        return m5885j;
    }

    @Override // com.daaw.vz4
    /* renamed from: g */
    public final boolean mo5888g(int i, long j) {
        return this.f31426a.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.daaw.vz4
    /* renamed from: i */
    public final boolean mo5886i(int i) {
        return this.f31426a.sendEmptyMessage(i);
    }

    @Override // com.daaw.vz4
    public final void zze(int i) {
        this.f31426a.removeMessages(2);
    }

    @Override // com.daaw.vz4
    public final boolean zzf(int i) {
        return this.f31426a.hasMessages(0);
    }
}
