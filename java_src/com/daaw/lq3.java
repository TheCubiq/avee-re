package com.daaw;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
/* loaded from: classes.dex */
public final class lq3 extends NativeAd.Image {

    /* renamed from: a */
    public final vc3 f17632a;

    /* renamed from: b */
    public final Drawable f17633b;

    /* renamed from: c */
    public final Uri f17634c;

    /* renamed from: d */
    public final double f17635d;

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:2|3)|(4:(13:5|6|7|8|9|10|11|12|13|14|16|17|18)|16|17|18)|33|6|7|8|9|10|11|12|13|14|(1:(0))) */
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
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
        com.daaw.k04.zzh("", r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lq3(vc3 vc3Var) {
        Drawable drawable;
        yd0 zzf;
        this.f17632a = vc3Var;
        Uri uri = null;
        try {
            zzf = vc3Var.zzf();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        try {
            if (zzf != null) {
                drawable = (Drawable) nt0.m14831M(zzf);
                this.f17633b = drawable;
                uri = this.f17632a.zze();
                this.f17634c = uri;
                double d = this.f17632a.zzb();
                this.f17635d = d;
                this.f17632a.zzd();
                this.f17632a.zzc();
                return;
            }
            this.f17632a.zzc();
            return;
        } catch (RemoteException e2) {
            k04.zzh("", e2);
            return;
        }
        drawable = null;
        this.f17633b = drawable;
        uri = this.f17632a.zze();
        this.f17634c = uri;
        double d2 = this.f17632a.zzb();
        this.f17635d = d2;
        this.f17632a.zzd();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Drawable getDrawable() {
        return this.f17633b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.f17635d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Uri getUri() {
        return this.f17634c;
    }
}
