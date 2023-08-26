package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* loaded from: classes2.dex */
final class zzgt {
    private ByteArrayOutputStream zzajc = new ByteArrayOutputStream(4096);
    private Base64OutputStream zzajd = new Base64OutputStream(this.zzajc, 10);

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.ByteArrayOutputStream, android.util.Base64OutputStream] */
    public final String toString() {
        String str;
        try {
            this.zzajd.close();
        } catch (IOException e) {
            zzakb.zzb("HashManager: Unable to convert to Base64.", e);
        }
        try {
            try {
                this.zzajc.close();
                str = this.zzajc.toString();
            } catch (IOException e2) {
                zzakb.zzb("HashManager: Unable to convert to Base64.", e2);
                str = "";
            }
            return str;
        } finally {
            this.zzajc = null;
            this.zzajd = null;
        }
    }

    public final void write(byte[] bArr) throws IOException {
        this.zzajd.write(bArr);
    }
}
