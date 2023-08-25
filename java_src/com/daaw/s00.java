package com.daaw;

import com.daaw.AbstractC2057lm;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes2.dex */
public class s00 implements wr0 {

    /* renamed from: a */
    public final File f25747a;

    /* renamed from: b */
    public final String f25748b;

    /* renamed from: c */
    public final String f25749c;

    public s00(String str, String str2, File file) {
        this.f25748b = str;
        this.f25749c = str2;
        this.f25747a = file;
    }

    /* renamed from: a */
    public final byte[] m10804a() {
        byte[] bArr = new byte[8192];
        try {
            InputStream mo5841b = mo5841b();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            if (mo5841b == null) {
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                if (mo5841b != null) {
                    mo5841b.close();
                }
                return null;
            }
            while (true) {
                try {
                    int read = mo5841b.read(bArr);
                    if (read <= 0) {
                        gZIPOutputStream.finish();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        mo5841b.close();
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
    /* renamed from: b */
    public InputStream mo5841b() {
        if (this.f25747a.exists() && this.f25747a.isFile()) {
            try {
                return new FileInputStream(this.f25747a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // com.daaw.wr0
    /* renamed from: c */
    public String mo5840c() {
        return this.f25749c;
    }

    @Override // com.daaw.wr0
    /* renamed from: d */
    public AbstractC2057lm.AbstractC2063d.AbstractC2065b mo5839d() {
        byte[] m10804a = m10804a();
        if (m10804a != null) {
            return AbstractC2057lm.AbstractC2063d.AbstractC2065b.m16795a().mo16791b(m10804a).mo16790c(this.f25748b).mo16792a();
        }
        return null;
    }
}
