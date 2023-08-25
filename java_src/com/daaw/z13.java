package com.daaw;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public final class z13 {

    /* renamed from: a */
    public ByteArrayOutputStream f34331a = new ByteArrayOutputStream(4096);

    /* renamed from: b */
    public Base64OutputStream f34332b = new Base64OutputStream(this.f34331a, 10);

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.ByteArrayOutputStream, android.util.Base64OutputStream] */
    public final String toString() {
        String str;
        try {
            this.f34332b.close();
        } catch (IOException e) {
            k04.zzh("HashManager: Unable to convert to Base64.", e);
        }
        try {
            try {
                this.f34331a.close();
                str = this.f34331a.toString();
            } catch (IOException e2) {
                k04.zzh("HashManager: Unable to convert to Base64.", e2);
                str = "";
            }
            return str;
        } finally {
            this.f34331a = null;
            this.f34332b = null;
        }
    }
}
