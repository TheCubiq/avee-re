package com.daaw;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
/* loaded from: classes.dex */
public final class wc3 extends NativeAd.Image {

    /* renamed from: a */
    public final vc3 f31161a;

    /* renamed from: b */
    public final Drawable f31162b;

    /* renamed from: c */
    public final Uri f31163c;

    /* renamed from: d */
    public final double f31164d;

    /* renamed from: e */
    public final int f31165e;

    /* renamed from: f */
    public final int f31166f;

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:2|3)|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        com.daaw.k04.zzh("", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        com.daaw.k04.zzh("", r4);
        r1 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
        com.daaw.k04.zzh("", r1);
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
        com.daaw.k04.zzh("", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wc3(vc3 vc3Var) {
        Drawable drawable;
        yd0 zzf;
        this.f31161a = vc3Var;
        Uri uri = null;
        try {
            zzf = vc3Var.zzf();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        if (zzf != null) {
            drawable = (Drawable) nt0.m14831M(zzf);
            this.f31162b = drawable;
            uri = this.f31161a.zze();
            this.f31163c = uri;
            double d = this.f31161a.zzb();
            this.f31164d = d;
            int i = -1;
            int i2 = this.f31161a.zzd();
            this.f31165e = i2;
            i = this.f31161a.zzc();
            this.f31166f = i;
        }
        drawable = null;
        this.f31162b = drawable;
        uri = this.f31161a.zze();
        this.f31163c = uri;
        double d2 = this.f31161a.zzb();
        this.f31164d = d2;
        int i3 = -1;
        int i22 = this.f31161a.zzd();
        this.f31165e = i22;
        i3 = this.f31161a.zzc();
        this.f31166f = i3;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.f31162b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.f31164d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.f31163c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zza() {
        return this.f31166f;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zzb() {
        return this.f31165e;
    }
}
