package com.daaw;

import android.util.Log;
import com.daaw.C3741yt;
import com.daaw.InterfaceC3255ut;
import java.io.File;
import java.io.IOException;
/* renamed from: com.daaw.au */
/* loaded from: classes.dex */
public class C0674au implements InterfaceC3255ut {

    /* renamed from: f */
    public static C0674au f3595f;

    /* renamed from: a */
    public final C3590xt f3596a = new C3590xt();

    /* renamed from: b */
    public final w71 f3597b = new w71();

    /* renamed from: c */
    public final File f3598c;

    /* renamed from: d */
    public final int f3599d;

    /* renamed from: e */
    public C3741yt f3600e;

    public C0674au(File file, int i) {
        this.f3598c = file;
        this.f3599d = i;
    }

    /* renamed from: d */
    public static synchronized InterfaceC3255ut m27030d(File file, int i) {
        C0674au c0674au;
        synchronized (C0674au.class) {
            if (f3595f == null) {
                f3595f = new C0674au(file, i);
            }
            c0674au = f3595f;
        }
        return c0674au;
    }

    @Override // com.daaw.InterfaceC3255ut
    /* renamed from: a */
    public void mo6809a(hi0 hi0Var) {
        try {
            m27029e().m3263c0(this.f3597b.m6466a(hi0Var));
        } catch (IOException unused) {
        }
    }

    @Override // com.daaw.InterfaceC3255ut
    /* renamed from: b */
    public void mo6808b(hi0 hi0Var, InterfaceC3255ut.InterfaceC3257b interfaceC3257b) {
        String m6466a = this.f3597b.m6466a(hi0Var);
        this.f3596a.m4531a(hi0Var);
        try {
            try {
                C3741yt.C3743b m3272T = m27029e().m3272T(m6466a);
                if (m3272T != null) {
                    try {
                        if (interfaceC3257b.mo7739a(m3272T.m3249f(0))) {
                            m3272T.m3250e();
                        }
                        m3272T.m3253b();
                    } catch (Throwable th) {
                        m3272T.m3253b();
                        throw th;
                    }
                }
            } finally {
                this.f3596a.m4530b(hi0Var);
            }
        } catch (IOException unused) {
            Log.isLoggable("DiskLruCacheWrapper", 5);
        }
    }

    @Override // com.daaw.InterfaceC3255ut
    /* renamed from: c */
    public File mo6807c(hi0 hi0Var) {
        try {
            C3741yt.C3745d m3270V = m27029e().m3270V(this.f3597b.m6466a(hi0Var));
            if (m3270V != null) {
                return m3270V.m3234a(0);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final synchronized C3741yt m27029e() {
        if (this.f3600e == null) {
            this.f3600e = C3741yt.m3268X(this.f3598c, 1, 1, this.f3599d);
        }
        return this.f3600e;
    }
}
