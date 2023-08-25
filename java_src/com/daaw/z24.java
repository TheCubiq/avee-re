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

    /* renamed from: a */
    public final Context f34363a;

    /* renamed from: b */
    public final String f34364b;

    /* renamed from: c */
    public final zzchu f34365c;

    /* renamed from: d */
    public final s93 f34366d;

    /* renamed from: e */
    public final v93 f34367e;

    /* renamed from: f */
    public final zzbf f34368f;

    /* renamed from: g */
    public final long[] f34369g;

    /* renamed from: h */
    public final String[] f34370h;

    /* renamed from: i */
    public boolean f34371i;

    /* renamed from: j */
    public boolean f34372j;

    /* renamed from: k */
    public boolean f34373k;

    /* renamed from: l */
    public boolean f34374l;

    /* renamed from: m */
    public boolean f34375m;

    /* renamed from: n */
    public e24 f34376n;

    /* renamed from: o */
    public boolean f34377o;

    /* renamed from: p */
    public boolean f34378p;

    /* renamed from: q */
    public long f34379q;

    public z24(Context context, zzchu zzchuVar, String str, v93 v93Var, s93 s93Var) {
        zzbd zzbdVar = new zzbd();
        zzbdVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbdVar.zza("1_5", 1.0d, 5.0d);
        zzbdVar.zza("5_10", 5.0d, 10.0d);
        zzbdVar.zza("10_20", 10.0d, 20.0d);
        zzbdVar.zza("20_30", 20.0d, 30.0d);
        zzbdVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.f34368f = zzbdVar.zzb();
        this.f34371i = false;
        this.f34372j = false;
        this.f34373k = false;
        this.f34374l = false;
        this.f34379q = -1L;
        this.f34363a = context;
        this.f34365c = zzchuVar;
        this.f34364b = str;
        this.f34367e = v93Var;
        this.f34366d = s93Var;
        String str2 = (String) zzba.zzc().m23658b(g93.f10885y);
        if (str2 == null) {
            this.f34370h = new String[0];
            this.f34369g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.f34370h = new String[length];
        this.f34369g = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f34369g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                k04.zzk("Unable to parse frame hash target time number.", e);
                this.f34369g[i] = -1;
            }
        }
    }

    /* renamed from: a */
    public final void m2964a(e24 e24Var) {
        n93.m15381a(this.f34367e, this.f34366d, "vpc2");
        this.f34371i = true;
        this.f34367e.m7314d("vpn", e24Var.mo9557p());
        this.f34376n = e24Var;
    }

    /* renamed from: b */
    public final void m2963b() {
        if (!this.f34371i || this.f34372j) {
            return;
        }
        n93.m15381a(this.f34367e, this.f34366d, "vfr2");
        this.f34372j = true;
    }

    /* renamed from: c */
    public final void m2962c() {
        this.f34375m = true;
        if (!this.f34372j || this.f34373k) {
            return;
        }
        n93.m15381a(this.f34367e, this.f34366d, "vfp2");
        this.f34373k = true;
    }

    /* renamed from: d */
    public final void m2961d() {
        if (!((Boolean) tb3.f27212a.m16137e()).booleanValue() || this.f34377o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f34364b);
        bundle.putString("player", this.f34376n.mo9557p());
        for (zzbc zzbcVar : this.f34368f.zza()) {
            bundle.putString("fps_c_".concat(String.valueOf(zzbcVar.zza)), Integer.toString(zzbcVar.zze));
            bundle.putString("fps_p_".concat(String.valueOf(zzbcVar.zza)), Double.toString(zzbcVar.zzd));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.f34369g;
            if (i >= jArr.length) {
                zzt.zzp();
                final Context context = this.f34363a;
                final String str = this.f34365c.f36993p;
                zzt.zzp();
                bundle.putString("device", zzs.zzq());
                bundle.putString("eids", TextUtils.join(",", g93.m21881a()));
                zzay.zzb();
                d04.m24834C(context, str, "gmob-apps", bundle, true, new c04() { // from class: com.google.android.gms.ads.internal.util.zzk
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
                this.f34377o = true;
                return;
            }
            String str2 = this.f34370h[i];
            if (str2 != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i]).toString()), str2);
            }
            i++;
        }
    }

    /* renamed from: e */
    public final void m2960e() {
        this.f34375m = false;
    }

    /* renamed from: f */
    public final void m2959f(e24 e24Var) {
        if (this.f34373k && !this.f34374l) {
            if (zze.zzc() && !this.f34374l) {
                zze.zza("VideoMetricsMixin first frame");
            }
            n93.m15381a(this.f34367e, this.f34366d, "vff2");
            this.f34374l = true;
        }
        long mo15858c = zzt.zzB().mo15858c();
        if (this.f34375m && this.f34378p && this.f34379q != -1) {
            long nanos = TimeUnit.SECONDS.toNanos(1L);
            long j = this.f34379q;
            zzbf zzbfVar = this.f34368f;
            double d = nanos;
            double d2 = mo15858c - j;
            Double.isNaN(d);
            Double.isNaN(d2);
            zzbfVar.zzb(d / d2);
        }
        this.f34378p = this.f34375m;
        this.f34379q = mo15858c;
        long longValue = ((Long) zzba.zzc().m23658b(g93.f10896z)).longValue();
        long mo9565h = e24Var.mo9565h();
        int i = 0;
        while (true) {
            String[] strArr = this.f34370h;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && longValue > Math.abs(mo9565h - this.f34369g[i])) {
                String[] strArr2 = this.f34370h;
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
