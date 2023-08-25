package com.daaw;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class wo5 implements vz4 {
    public static final List b = new ArrayList(50);
    public final Handler a;

    public wo5(Handler handler) {
        this.a = handler;
    }

    public static /* bridge */ /* synthetic */ void h(qn5 qn5Var) {
        List list = b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(qn5Var);
            }
        }
    }

    public static qn5 j() {
        qn5 qn5Var;
        List list = b;
        synchronized (list) {
            qn5Var = list.isEmpty() ? new qn5(null) : (qn5) list.remove(list.size() - 1);
        }
        return qn5Var;
    }

    @Override // com.daaw.vz4
    public final sy4 a(int i) {
        qn5 j = j();
        j.a(this.a.obtainMessage(i), this);
        return j;
    }

    @Override // com.daaw.vz4
    public final boolean b(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // com.daaw.vz4
    public final sy4 c(int i, Object obj) {
        qn5 j = j();
        j.a(this.a.obtainMessage(i, obj), this);
        return j;
    }

    @Override // com.daaw.vz4
    public final boolean d(sy4 sy4Var) {
        return ((qn5) sy4Var).b(this.a);
    }

    @Override // com.daaw.vz4
    public final void e(Object obj) {
        this.a.removeCallbacksAndMessages(null);
    }

    @Override // com.daaw.vz4
    public final sy4 f(int i, int i2, int i3) {
        qn5 j = j();
        j.a(this.a.obtainMessage(1, i2, i3), this);
        return j;
    }

    @Override // com.daaw.vz4
    public final boolean g(int i, long j) {
        return this.a.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.daaw.vz4
    public final boolean i(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // com.daaw.vz4
    public final void zze(int i) {
        this.a.removeMessages(2);
    }

    @Override // com.daaw.vz4
    public final boolean zzf(int i) {
        return this.a.hasMessages(0);
    }
}
