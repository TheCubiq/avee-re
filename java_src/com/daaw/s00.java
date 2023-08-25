package com.daaw;

import com.daaw.lm;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes2.dex */
public class s00 implements wr0 {
    public final File a;
    public final String b;
    public final String c;

    public s00(String str, String str2, File file) {
        this.b = str;
        this.c = str2;
        this.a = file;
    }

    public final byte[] a() {
        byte[] bArr = new byte[8192];
        try {
            InputStream b = b();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            if (b == null) {
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                if (b != null) {
                    b.close();
                }
                return null;
            }
            while (true) {
                try {
                    int read = b.read(bArr);
                    if (read <= 0) {
                        gZIPOutputStream.finish();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        b.close();
                        return byteArray;
                    }
                    gZIPOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.daaw.wr0
    public InputStream b() {
        if (this.a.exists() && this.a.isFile()) {
            try {
                return new FileInputStream(this.a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // com.daaw.wr0
    public String c() {
        return this.c;
    }

    @Override // com.daaw.wr0
    public lm.d.b d() {
        byte[] a = a();
        if (a != null) {
            return lm.d.b.a().b(a).c(this.b).a();
        }
        return null;
    }
}
