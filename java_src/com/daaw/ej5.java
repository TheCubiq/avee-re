package com.daaw;

import android.util.Log;
import org.conscrypt.NativeConstants;
/* loaded from: classes2.dex */
public final class ej5 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ int f8517p;

    /* renamed from: q */
    public final /* synthetic */ String f8518q;

    /* renamed from: r */
    public final /* synthetic */ Object f8519r;

    /* renamed from: s */
    public final /* synthetic */ Object f8520s;

    /* renamed from: t */
    public final /* synthetic */ Object f8521t;

    /* renamed from: u */
    public final /* synthetic */ om5 f8522u;

    public ej5(om5 om5Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f8522u = om5Var;
        this.f8517p = i;
        this.f8518q = str;
        this.f8519r = obj;
        this.f8520s = obj2;
        this.f8521t = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        om5 om5Var;
        char c3;
        l36 m24053F = this.f8522u.f25143a.m24053F();
        if (!m24053F.m8307m()) {
            Log.println(6, this.f8522u.m14168C(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        om5 om5Var2 = this.f8522u;
        c = om5Var2.f21659c;
        if (c == 0) {
            if (om5Var2.f25143a.m24020z().m12671H()) {
                om5Var = this.f8522u;
                om5Var.f25143a.mo3911a();
                c3 = 'C';
            } else {
                om5Var = this.f8522u;
                om5Var.f25143a.mo3911a();
                c3 = 'c';
            }
            om5Var.f21659c = c3;
        }
        om5 om5Var3 = this.f8522u;
        j = om5Var3.f21660d;
        if (j < 0) {
            om5Var3.f25143a.m24020z().m12661p();
            om5Var3.f21660d = 74029L;
        }
        char charAt = "01VDIWEA?".charAt(this.f8517p);
        om5 om5Var4 = this.f8522u;
        c2 = om5Var4.f21659c;
        j2 = om5Var4.f21660d;
        String str = "2" + charAt + c2 + j2 + ":" + om5.m14170A(true, this.f8518q, this.f8519r, this.f8520s, this.f8521t);
        if (str.length() > 1024) {
            str = this.f8518q.substring(0, NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
        }
        e16 e16Var = m24053F.f17002d;
        if (e16Var != null) {
            e16Var.m23794b(str, 1L);
        }
    }
}
