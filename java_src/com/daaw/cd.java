package com.daaw;

import com.daaw.lm;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes2.dex */
public class cd implements wr0 {
    public final byte[] a;
    public final String b;
    public final String c;

    public cd(String str, String str2, byte[] bArr) {
        this.b = str;
        this.c = str2;
        this.a = bArr;
    }

    public final byte[] a() {
        if (e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.daaw.wr0
    public InputStream b() {
        if (e()) {
            return null;
        }
        return new ByteArrayInputStream(this.a);
    }

    @Override // com.daaw.wr0
    public String c() {
        return this.c;
    }

    @Override // com.daaw.wr0
    public lm.d.b d() {
        byte[] a = a();
        if (a == null) {
            return null;
        }
        return lm.d.b.a().b(a).c(this.b).a();
    }

    public final boolean e() {
        byte[] bArr = this.a;
        return bArr == null || bArr.length == 0;
    }
}
