package com.daaw;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class y55 {
    public final zzbo a;
    public final ag b;
    public final Executor c;

    public y55(zzbo zzboVar, ag agVar, Executor executor) {
        this.a = zzboVar;
        this.b = agVar;
        this.c = executor;
    }

    public final /* synthetic */ Bitmap a(double d, boolean z, mf2 mf2Var) {
        byte[] bArr = mf2Var.b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) zzba.zzc().b(g93.B5)).booleanValue()) {
            options.inJustDecodeBounds = true;
            c(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) zzba.zzc().b(g93.C5)).intValue())) / 2);
            }
        }
        return c(bArr, options);
    }

    public final f77 b(String str, final double d, final boolean z) {
        return s67.m(this.a.zza(str), new ey6() { // from class: com.daaw.x55
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                return y55.this.a(d, z, (mf2) obj);
            }
        }, this.c);
    }

    public final Bitmap c(byte[] bArr, BitmapFactory.Options options) {
        long b = this.b.b();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long b2 = this.b.b();
        if (decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j = b2 - b;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            zze.zza("Decoded image w: " + width + " h:" + height + " bytes: " + allocationByteCount + " time: " + j + " on ui thread: " + z);
        }
        return decodeByteArray;
    }
}
