package com.daaw;

import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class c18 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ ox3 f5375p;

    /* renamed from: q */
    public final /* synthetic */ p28 f5376q;

    public c18(p28 p28Var, ox3 ox3Var) {
        this.f5376q = p28Var;
        this.f5375p = ox3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        hk5 m14154x;
        String str;
        Long l;
        ca8 m24046M = this.f5376q.f25143a.m24046M();
        tm8.m8959b();
        if (!m24046M.f25143a.m24020z().m12677B(null, m75.f18564w0)) {
            m14154x = m24046M.f25143a.mo3895i().m14154x();
            str = "getSessionId has been disabled.";
        } else if (m24046M.f25143a.m24053F().m17174p().m25423i(vb2.ANALYTICS_STORAGE)) {
            if (!m24046M.f25143a.m24053F().m17169v(m24046M.f25143a.mo3909b().mo15860a()) && m24046M.f25143a.m24053F().f17014p.m4400a() != 0) {
                l = Long.valueOf(m24046M.f25143a.m24053F().f17014p.m4400a());
                if (l != null) {
                    this.f5376q.f25143a.m24045N().m24506I(this.f5375p, l.longValue());
                    return;
                }
                try {
                    this.f5375p.mo13884T0(null);
                    return;
                } catch (RemoteException e) {
                    this.f5376q.f25143a.mo3895i().m14160q().m20652b("getSessionId failed with exception", e);
                    return;
                }
            }
            l = null;
            if (l != null) {
            }
        } else {
            m14154x = m24046M.f25143a.mo3895i().m14154x();
            str = "Analytics storage consent denied; will not get session id";
        }
        m14154x.m20653a(str);
        l = null;
        if (l != null) {
        }
    }
}
