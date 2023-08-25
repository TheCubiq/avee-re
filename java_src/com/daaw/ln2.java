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
    public static final oo2 j = new oo2();
    public final Context i;

    public ln2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2, Context context, ai2 ai2Var) {
        super(wm2Var, "JcyGK+UJP268FQFtTaGhQAzoKUodZulOKvzraNGT5p3xvR5cM9kMk5tDQLTCBUij", "f+92zzsRq9nsZjabs/oaBlCH7RtiJvk62T7dPsPTbRg=", hi2Var, i, 27);
        this.i = context;
    }

    @Override // com.daaw.no2
    public final void a() {
        int i;
        vj2 vj2Var;
        AtomicReference a = j.a(this.i.getPackageName());
        synchronized (a) {
            vj2 vj2Var2 = (vj2) a.get();
            if (vj2Var2 == null || an2.g(vj2Var2.a) || vj2Var2.a.equals("E") || vj2Var2.a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (an2.g(null)) {
                    an2.g(null);
                    i = (Boolean.FALSE.booleanValue() && this.b.p()) ? 4 : 3;
                } else {
                    i = 5;
                }
                Boolean valueOf = Boolean.valueOf(i == 3);
                Boolean bool = (Boolean) zzba.zzc().b(g93.a2);
                String c = ((Boolean) zzba.zzc().b(g93.Z1)).booleanValue() ? c() : null;
                if (bool.booleanValue() && this.b.p() && an2.g(c)) {
                    c = d();
                }
                vj2 vj2Var3 = new vj2((String) this.f.invoke(null, this.i, valueOf, c));
                if (an2.g(vj2Var3.a) || vj2Var3.a.equals("E")) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String d = d();
                        if (!an2.g(d)) {
                            vj2Var3.a = d;
                        }
                    } else if (i2 == 4) {
                        throw null;
                    }
                }
                a.set(vj2Var3);
            }
            vj2Var = (vj2) a.get();
        }
        synchronized (this.e) {
            if (vj2Var != null) {
                this.e.v0(vj2Var.a);
                this.e.P(vj2Var.b);
                this.e.R(vj2Var.c);
                this.e.g0(vj2Var.d);
                this.e.u0(vj2Var.e);
            }
        }
    }

    public final String c() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] i = an2.i((String) zzba.zzc().b(g93.b2));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(i)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(an2.i((String) zzba.zzc().b(g93.c2)))));
            }
            Context context = this.i;
            String packageName = context.getPackageName();
            this.b.k();
            if (Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
                final o77 D = o77.D();
                context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.daaw.po2
                    @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                    public final void onChecksumsReady(List list) {
                        o77 o77Var = o77.this;
                        if (list == null) {
                            o77Var.h(null);
                            return;
                        }
                        try {
                            int size = list.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                ApkChecksum apkChecksum = (ApkChecksum) list.get(i2);
                                if (apkChecksum.getType() == 8) {
                                    o77Var.h(an2.c(apkChecksum.getValue()));
                                    return;
                                }
                            }
                            o77Var.h(null);
                        } catch (Throwable unused) {
                            o77Var.h(null);
                        }
                    }
                });
                return (String) D.get();
            }
            return null;
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public final String d() {
        try {
            if (this.b.l() != null) {
                this.b.l().get();
            }
            fj2 c = this.b.c();
            if (c == null || !c.v0()) {
                return null;
            }
            return c.J0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }
}
