package com.daaw;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class vo6 implements Runnable {

    /* renamed from: y */
    public static Boolean f30394y;

    /* renamed from: p */
    public final Context f30395p;

    /* renamed from: q */
    public final zzchu f30396q;

    /* renamed from: s */
    public String f30398s;

    /* renamed from: t */
    public int f30399t;

    /* renamed from: u */
    public final sa5 f30400u;

    /* renamed from: w */
    public final vn5 f30402w;

    /* renamed from: x */
    public final yu3 f30403x;

    /* renamed from: r */
    public final dp6 f30397r = gp6.m21357M();

    /* renamed from: v */
    public boolean f30401v = false;

    public vo6(Context context, zzchu zzchuVar, sa5 sa5Var, vn5 vn5Var, yu3 yu3Var, byte[] bArr) {
        this.f30395p = context;
        this.f30396q = zzchuVar;
        this.f30400u = sa5Var;
        this.f30402w = vn5Var;
        this.f30403x = yu3Var;
    }

    /* renamed from: a */
    public static synchronized boolean m6970a() {
        boolean booleanValue;
        Boolean valueOf;
        synchronized (vo6.class) {
            if (f30394y == null) {
                if (((Boolean) ta3.f27157b.m16137e()).booleanValue()) {
                    valueOf = Boolean.valueOf(Math.random() < ((Double) ta3.f27156a.m16137e()).doubleValue());
                } else {
                    valueOf = Boolean.FALSE;
                }
                f30394y = valueOf;
            }
            booleanValue = f30394y.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: b */
    public final synchronized void m6969b(mo6 mo6Var) {
        if (!this.f30401v) {
            m6968c();
        }
        if (m6970a()) {
            if (mo6Var == null) {
                return;
            }
            if (this.f30397r.m24099s() >= ((Integer) zzba.zzc().m23658b(g93.f10529Q7)).intValue()) {
                return;
            }
            dp6 dp6Var = this.f30397r;
            ep6 m22422L = fp6.m22422L();
            ap6 m25947L = bp6.m25947L();
            m25947L.m27240J(mo6Var.m15874k());
            m25947L.m27244F(mo6Var.m15875j());
            m25947L.m27232x(mo6Var.m15883b());
            m25947L.m27238L(3);
            m25947L.m27246D(this.f30396q.f36993p);
            m25947L.m27237s(this.f30398s);
            m25947L.m27248B(Build.VERSION.RELEASE);
            m25947L.m27243G(Build.VERSION.SDK_INT);
            m25947L.m27239K(mo6Var.m15872m());
            m25947L.m27249A(mo6Var.m15884a());
            m25947L.m27234v(this.f30399t);
            m25947L.m27241I(mo6Var.m15873l());
            m25947L.m27236t(mo6Var.m15882c());
            m25947L.m27233w(mo6Var.m15880e());
            m25947L.m27231y(mo6Var.m15879f());
            m25947L.m27230z(this.f30400u.m10478c(mo6Var.m15879f()));
            m25947L.m27247C(mo6Var.m15878g());
            m25947L.m27235u(mo6Var.m15881d());
            m25947L.m27242H(mo6Var.m15876i());
            m25947L.m27245E(mo6Var.m15877h());
            m22422L.m23315s(m25947L);
            dp6Var.m24098t(m22422L);
        }
    }

    /* renamed from: c */
    public final synchronized void m6968c() {
        if (this.f30401v) {
            return;
        }
        this.f30401v = true;
        if (m6970a()) {
            zzt.zzp();
            this.f30398s = zzs.zzo(this.f30395p);
            this.f30399t = x70.m5492f().m5497a(this.f30395p);
            long intValue = ((Integer) zzba.zzc().m23658b(g93.f10519P7)).intValue();
            z04.f34308d.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: d */
    public final synchronized void m6967d() {
        try {
            new un5(this.f30395p, this.f30396q.f36993p, this.f30403x, Binder.getCallingUid(), null).zza(new on5((String) zzba.zzc().m23658b(g93.f10509O7), 60000, new HashMap(), ((gp6) this.f30397r.m22315n()).mo4516a(), "application/x-protobuf", false));
            this.f30397r.m24097u();
        } catch (Exception e) {
            if ((e instanceof gi5) && ((gi5) e).m21570a() == 3) {
                this.f30397r.m24097u();
            } else {
                zzt.zzo().m11903t(e, "CuiMonitor.sendCuiPing");
            }
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (m6970a()) {
            if (this.f30397r.m24099s() == 0) {
                return;
            }
            m6967d();
        }
    }
}
