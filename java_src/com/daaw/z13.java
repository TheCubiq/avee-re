package com.daaw;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public final class z13 {
    public ByteArrayOutputStream a = new ByteArrayOutputStream(4096);
    public Base64OutputStream b = new Base64OutputStream(this.a, 10);

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.ByteArrayOutputStream, android.util.Base64OutputStream] */
    public final String toString() {
        String str;
        try {
            this.b.close();
        } catch (IOException e) {
            k04.zzh("HashManager: Unable to convert to Base64.", e);
        }
        try {
            try {
                this.a.close();
                str = this.a.toString();
            } catch (IOException e2) {
                k04.zzh("HashManager: Unable to convert to Base64.", e2);
                str = "";
            }
            return str;
        } finally {
            this.a = null;
            this.b = null;
        }
    }
}
