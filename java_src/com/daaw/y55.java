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

    /* renamed from: a */
    public final zzbo f33377a;

    /* renamed from: b */
    public final InterfaceC0623ag f33378b;

    /* renamed from: c */
    public final Executor f33379c;

    public y55(zzbo zzboVar, InterfaceC0623ag interfaceC0623ag, Executor executor) {
        this.f33377a = zzboVar;
        this.f33378b = interfaceC0623ag;
        this.f33379c = executor;
    }

    /* renamed from: a */
    public final /* synthetic */ Bitmap m4094a(double d, boolean z, mf2 mf2Var) {
        byte[] bArr = mf2Var.f18850b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10376B5)).booleanValue()) {
            options.inJustDecodeBounds = true;
            m4092c(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) zzba.zzc().m23658b(g93.f10387C5)).intValue())) / 2);
            }
        }
        return m4092c(bArr, options);
    }

    /* renamed from: b */
    public final f77 m4093b(String str, final double d, final boolean z) {
        return s67.m10630m(this.f33377a.zza(str), new ey6() { // from class: com.daaw.x55
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                return y55.this.m4094a(d, z, (mf2) obj);
            }
        }, this.f33379c);
    }

    /* renamed from: c */
    public final Bitmap m4092c(byte[] bArr, BitmapFactory.Options options) {
        long mo15859b = this.f33378b.mo15859b();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long mo15859b2 = this.f33378b.mo15859b();
        if (decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j = mo15859b2 - mo15859b;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            zze.zza("Decoded image w: " + width + " h:" + height + " bytes: " + allocationByteCount + " time: " + j + " on ui thread: " + z);
        }
        return decodeByteArray;
    }
}
