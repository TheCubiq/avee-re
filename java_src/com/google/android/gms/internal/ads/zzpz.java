package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
@zzadh
/* loaded from: classes2.dex */
public final class zzpz extends NativeAd.Image {
    private final Drawable mDrawable;
    private final Uri mUri;
    private final double zzbhv;
    private final zzpw zzbkm;

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:2|3)|(9:5|6|7|8|9|10|11|12|13)|22|6|7|8|9|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        com.google.android.gms.internal.ads.zzane.zzb("", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        com.google.android.gms.internal.ads.zzane.zzb("", r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzpz(zzpw zzpwVar) {
        Drawable drawable;
        IObjectWrapper zzjy;
        this.zzbkm = zzpwVar;
        Uri uri = null;
        try {
            zzjy = zzpwVar.zzjy();
        } catch (RemoteException e) {
            zzane.zzb("", e);
        }
        if (zzjy != null) {
            drawable = (Drawable) ObjectWrapper.unwrap(zzjy);
            this.mDrawable = drawable;
            uri = this.zzbkm.getUri();
            this.mUri = uri;
            double d = 1.0d;
            d = this.zzbkm.getScale();
            this.zzbhv = d;
        }
        drawable = null;
        this.mDrawable = drawable;
        uri = this.zzbkm.getUri();
        this.mUri = uri;
        double d2 = 1.0d;
        d2 = this.zzbkm.getScale();
        this.zzbhv = d2;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.mDrawable;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.zzbhv;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.mUri;
    }
}
