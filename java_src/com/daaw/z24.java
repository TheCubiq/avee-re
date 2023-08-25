package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.daaw.gv6;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbc;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zzbf;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class z24 {
    public final Context a;
    public final String b;
    public final zzchu c;
    public final s93 d;
    public final v93 e;
    public final zzbf f;
    public final long[] g;
    public final String[] h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public e24 n;
    public boolean o;
    public boolean p;
    public long q;

    public z24(Context context, zzchu zzchuVar, String str, v93 v93Var, s93 s93Var) {
        zzbd zzbdVar = new zzbd();
        zzbdVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbdVar.zza("1_5", 1.0d, 5.0d);
        zzbdVar.zza("5_10", 5.0d, 10.0d);
        zzbdVar.zza("10_20", 10.0d, 20.0d);
        zzbdVar.zza("20_30", 20.0d, 30.0d);
        zzbdVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.f = zzbdVar.zzb();
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.q = -1L;
        this.a = context;
        this.c = zzchuVar;
        this.b = str;
        this.e = v93Var;
        this.d = s93Var;
        String str2 = (String) zzba.zzc().b(g93.y);
        if (str2 == null) {
            this.h = new String[0];
            this.g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.h = new String[length];
        this.g = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                k04.zzk("Unable to parse frame hash target time number.", e);
                this.g[i] = -1;
            }
        }
    }

    public final void a(e24 e24Var) {
        n93.a(this.e, this.d, "vpc2");
        this.i = true;
        this.e.d("vpn", e24Var.p());
        this.n = e24Var;
    }

    public final void b() {
        if (!this.i || this.j) {
            return;
        }
        n93.a(this.e, this.d, "vfr2");
        this.j = true;
    }

    public final void c() {
        this.m = true;
        if (!this.j || this.k) {
            return;
        }
        n93.a(this.e, this.d, "vfp2");
        this.k = true;
    }

    public final void d() {
        if (!((Boolean) tb3.a.e()).booleanValue() || this.o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.b);
        bundle.putString("player", this.n.p());
        for (zzbc zzbcVar : this.f.zza()) {
            bundle.putString("fps_c_".concat(String.valueOf(zzbcVar.zza)), Integer.toString(zzbcVar.zze));
            bundle.putString("fps_p_".concat(String.valueOf(zzbcVar.zza)), Double.toString(zzbcVar.zzd));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.g;
            if (i >= jArr.length) {
                zzt.zzp();
                final Context context = this.a;
                final String str = this.c.p;
                zzt.zzp();
                bundle.putString("device", zzs.zzq());
                bundle.putString("eids", TextUtils.join(",", g93.a()));
                zzay.zzb();
                d04.C(context, str, "gmob-apps", bundle, true, new c04() { // from class: com.google.android.gms.ads.internal.util.zzk
                    @Override // com.daaw.c04
                    public final boolean zza(String str2) {
                        Context context2 = context;
                        String str3 = str;
                        gv6 gv6Var = zzs.zza;
                        com.google.android.gms.ads.internal.zzt.zzp();
                        zzs.zzH(context2, str3, str2);
                        return true;
                    }
                });
                this.o = true;
                return;
            }
            String str2 = this.h[i];
            if (str2 != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i]).toString()), str2);
            }
            i++;
        }
    }

    public final void e() {
        this.m = false;
    }

    public final void f(e24 e24Var) {
        if (this.k && !this.l) {
            if (zze.zzc() && !this.l) {
                zze.zza("VideoMetricsMixin first frame");
            }
            n93.a(this.e, this.d, "vff2");
            this.l = true;
        }
        long c = zzt.zzB().c();
        if (this.m && this.p && this.q != -1) {
            long nanos = TimeUnit.SECONDS.toNanos(1L);
            long j = this.q;
            zzbf zzbfVar = this.f;
            double d = nanos;
            double d2 = c - j;
            Double.isNaN(d);
            Double.isNaN(d2);
            zzbfVar.zzb(d / d2);
        }
        this.p = this.m;
        this.q = c;
        long longValue = ((Long) zzba.zzc().b(g93.z)).longValue();
        long h = e24Var.h();
        int i = 0;
        while (true) {
            String[] strArr = this.h;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && longValue > Math.abs(h - this.g[i])) {
                String[] strArr2 = this.h;
                int i2 = 8;
                Bitmap bitmap = e24Var.getBitmap(8, 8);
                long j2 = 63;
                long j3 = 0;
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j3 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j2);
                        i4++;
                        j2--;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = String.format("%016X", Long.valueOf(j3));
                return;
            }
            i++;
        }
    }
}
