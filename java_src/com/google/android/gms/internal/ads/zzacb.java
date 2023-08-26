package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.util.PlatformVersion;
import java.io.InputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzacb implements zzalz<zzon> {
    private final /* synthetic */ String zzbwo;
    private final /* synthetic */ zzabv zzcal;
    private final /* synthetic */ boolean zzcav;
    private final /* synthetic */ double zzcaw;
    private final /* synthetic */ boolean zzcax;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacb(zzabv zzabvVar, boolean z, double d, boolean z2, String str) {
        this.zzcal = zzabvVar;
        this.zzcav = z;
        this.zzcaw = d;
        this.zzcax = z2;
        this.zzbwo = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzalz
    /* renamed from: zzd */
    public final zzon zze(InputStream inputStream) {
        Bitmap bitmap;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (this.zzcaw * 160.0d);
        if (!this.zzcax) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            bitmap = BitmapFactory.decodeStream(inputStream, null, options);
        } catch (Exception e) {
            zzakb.zzb("Error grabbing image.", e);
            bitmap = null;
        }
        if (bitmap == null) {
            this.zzcal.zzd(2, this.zzcav);
            return null;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (PlatformVersion.isAtLeastKitKat() && zzakb.zzqp()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int allocationByteCount = bitmap.getAllocationByteCount();
            long j = uptimeMillis2 - uptimeMillis;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            zzakb.v(sb.toString());
        }
        return new zzon(new BitmapDrawable(Resources.getSystem(), bitmap), Uri.parse(this.zzbwo), this.zzcaw);
    }

    @Override // com.google.android.gms.internal.ads.zzalz
    public final /* synthetic */ zzon zzny() {
        this.zzcal.zzd(2, this.zzcav);
        return null;
    }
}
