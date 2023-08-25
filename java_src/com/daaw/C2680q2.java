package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.daaw.InterfaceC2505p2;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* renamed from: com.daaw.q2 */
/* loaded from: classes2.dex */
public class C2680q2 implements InterfaceC2505p2 {

    /* renamed from: c */
    public static volatile InterfaceC2505p2 f23614c;

    /* renamed from: a */
    public final C1361g5 f23615a;

    /* renamed from: b */
    public final Map f23616b;

    /* renamed from: com.daaw.q2$a */
    /* loaded from: classes2.dex */
    public class C2681a implements InterfaceC2505p2.InterfaceC2506a {

        /* renamed from: a */
        public final /* synthetic */ String f23617a;

        public C2681a(String str) {
            this.f23617a = str;
        }
    }

    public C2680q2(C1361g5 c1361g5) {
        ry0.m10830j(c1361g5);
        this.f23615a = c1361g5;
        this.f23616b = new ConcurrentHashMap();
    }

    /* renamed from: c */
    public static InterfaceC2505p2 m12799c(s10 s10Var, Context context, sh1 sh1Var) {
        ry0.m10830j(s10Var);
        ry0.m10830j(context);
        ry0.m10830j(sh1Var);
        ry0.m10830j(context.getApplicationContext());
        if (f23614c == null) {
            synchronized (C2680q2.class) {
                if (f23614c == null) {
                    Bundle bundle = new Bundle(1);
                    if (s10Var.m10776t()) {
                        sh1Var.mo1817a(C1453gp.class, new Executor() { // from class: com.daaw.f32
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new InterfaceC0780ay() { // from class: com.daaw.cy2
                            @Override // com.daaw.InterfaceC0780ay
                            /* renamed from: a */
                            public final void mo24882a(C3478wx c3478wx) {
                                C2680q2.m12798d(c3478wx);
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", s10Var.m10777s());
                    }
                    f23614c = new C2680q2(gk5.m21515u(context, null, null, null, bundle).m21518r());
                }
            }
        }
        return f23614c;
    }

    /* renamed from: d */
    public static /* synthetic */ void m12798d(C3478wx c3478wx) {
        boolean z = ((C1453gp) c3478wx.m5741a()).f11552a;
        synchronized (C2680q2.class) {
            ((C2680q2) ry0.m10830j(f23614c)).f23615a.m21944v(z);
        }
    }

    @Override // com.daaw.InterfaceC2505p2
    /* renamed from: a */
    public InterfaceC2505p2.InterfaceC2506a mo12801a(String str, InterfaceC2505p2.InterfaceC2507b interfaceC2507b) {
        ry0.m10830j(interfaceC2507b);
        if (yr3.m3376f(str) && !m12797e(str)) {
            C1361g5 c1361g5 = this.f23615a;
            Object fe5Var = "fiam".equals(str) ? new fe5(c1361g5, interfaceC2507b) : "clx".equals(str) ? new z07(c1361g5, interfaceC2507b) : null;
            if (fe5Var != null) {
                this.f23616b.put(str, fe5Var);
                return new C2681a(str);
            }
            return null;
        }
        return null;
    }

    @Override // com.daaw.InterfaceC2505p2
    /* renamed from: b */
    public void mo12800b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (yr3.m3376f(str) && yr3.m3378d(str2, bundle) && yr3.m3379c(str, str2, bundle)) {
            yr3.m3380b(str, str2, bundle);
            this.f23615a.m21952n(str, str2, bundle);
        }
    }

    /* renamed from: e */
    public final boolean m12797e(String str) {
        return (str.isEmpty() || !this.f23616b.containsKey(str) || this.f23616b.get(str) == null) ? false : true;
    }
}
