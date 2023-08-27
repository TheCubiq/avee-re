package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes2.dex */
final class zzaew implements Runnable {
    private final /* synthetic */ OutputStream zzcfw;
    private final /* synthetic */ byte[] zzcfx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaew(zzaev zzaevVar, OutputStream outputStream, byte[] bArr) {
        this.zzcfw = outputStream;
        this.zzcfx = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.DataOutputStream, java.io.Closeable] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ?? r1;
        Throwable th;
        IOException e;
        try {
            r1 = new DataOutputStream(this.zzcfw);
            try {
                try {
                    r1.writeInt(this.zzcfx.length);
                    r1.write(this.zzcfx);
                    IOUtils.closeQuietly((Closeable) r1);
                } catch (IOException e2) {
                    e = e2;
                    zzakb.zzb("Error transporting the ad response", e);
                    com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "LargeParcelTeleporter.pipeData.1");
                    if (r1 == 0) {
                        IOUtils.closeQuietly(this.zzcfw);
                    } else {
                        IOUtils.closeQuietly((Closeable) r1);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (r1 == 0) {
                    r1 = this.zzcfw;
                }
                IOUtils.closeQuietly((Closeable) r1);
                throw th;
            }
        } catch (IOException e3) {
            r1 = 0;
            e = e3;
        } catch (Throwable th3) {
            r1 = 0;
            th = th3;
            if (r1 == 0) {
            }
            IOUtils.closeQuietly((Closeable) r1);
            throw th;
        }
    }
}
