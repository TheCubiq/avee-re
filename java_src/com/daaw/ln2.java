package com.daaw;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class ln2 extends no2 {

    /* renamed from: j */
    public static final oo2 f17562j = new oo2();

    /* renamed from: i */
    public final Context f17563i;

    public ln2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2, Context context, ai2 ai2Var) {
        super(wm2Var, "JcyGK+UJP268FQFtTaGhQAzoKUodZulOKvzraNGT5p3xvR5cM9kMk5tDQLTCBUij", "f+92zzsRq9nsZjabs/oaBlCH7RtiJvk62T7dPsPTbRg=", hi2Var, i, 27);
        this.f17563i = context;
    }

    @Override // com.daaw.no2
    /* renamed from: a */
    public final void mo2099a() {
        int i;
        vj2 vj2Var;
        AtomicReference m14116a = f17562j.m14116a(this.f17563i.getPackageName());
        synchronized (m14116a) {
            vj2 vj2Var2 = (vj2) m14116a.get();
            if (vj2Var2 == null || an2.m27324g(vj2Var2.f30263a) || vj2Var2.f30263a.equals("E") || vj2Var2.f30263a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (an2.m27324g(null)) {
                    an2.m27324g(null);
                    i = (Boolean.FALSE.booleanValue() && this.f20525b.m5990p()) ? 4 : 3;
                } else {
                    i = 5;
                }
                Boolean valueOf = Boolean.valueOf(i == 3);
                Boolean bool = (Boolean) zzba.zzc().m23658b(g93.f10624a2);
                String m16717c = ((Boolean) zzba.zzc().m23658b(g93.f10613Z1)).booleanValue() ? m16717c() : null;
                if (bool.booleanValue() && this.f20525b.m5990p() && an2.m27324g(m16717c)) {
                    m16717c = m16716d();
                }
                vj2 vj2Var3 = new vj2((String) this.f20529f.invoke(null, this.f17563i, valueOf, m16717c));
                if (an2.m27324g(vj2Var3.f30263a) || vj2Var3.f30263a.equals("E")) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String m16716d = m16716d();
                        if (!an2.m27324g(m16716d)) {
                            vj2Var3.f30263a = m16716d;
                        }
                    } else if (i2 == 4) {
                        throw null;
                    }
                }
                m14116a.set(vj2Var3);
            }
            vj2Var = (vj2) m14116a.get();
        }
        synchronized (this.f20528e) {
            if (vj2Var != null) {
                this.f20528e.m20740v0(vj2Var.f30263a);
                this.f20528e.m20776P(vj2Var.f30264b);
                this.f20528e.m20774R(vj2Var.f30265c);
                this.f20528e.m20759g0(vj2Var.f30266d);
                this.f20528e.m20742u0(vj2Var.f30267e);
            }
        }
    }

    /* renamed from: c */
    public final String m16717c() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] m27322i = an2.m27322i((String) zzba.zzc().m23658b(g93.f10635b2));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(m27322i)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(an2.m27322i((String) zzba.zzc().m23658b(g93.f10646c2)))));
            }
            Context context = this.f17563i;
            String packageName = context.getPackageName();
            this.f20525b.m5995k();
            if (Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
                final o77 m14487D = o77.m14487D();
                context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.daaw.po2
                    @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                    public final void onChecksumsReady(List list) {
                        o77 o77Var = o77.this;
                        if (list == null) {
                            o77Var.mo14486h(null);
                            return;
                        }
                        try {
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                ApkChecksum apkChecksum = (ApkChecksum) list.get(i);
                                if (apkChecksum.getType() == 8) {
                                    o77Var.mo14486h(an2.m27328c(apkChecksum.getValue()));
                                    return;
                                }
                            }
                            o77Var.mo14486h(null);
                        } catch (Throwable unused) {
                            o77Var.mo14486h(null);
                        }
                    }
                });
                return (String) m14487D.get();
            }
            return null;
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final String m16716d() {
        try {
            if (this.f20525b.m5994l() != null) {
                this.f20525b.m5994l().get();
            }
            fj2 m6003c = this.f20525b.m6003c();
            if (m6003c == null || !m6003c.m22538v0()) {
                return null;
            }
            return m6003c.m22593J0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }
}
