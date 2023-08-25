package com.daaw;

import com.daaw.AbstractC2057lm;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
/* renamed from: com.daaw.cd */
/* loaded from: classes2.dex */
public class C0947cd implements wr0 {

    /* renamed from: a */
    public final byte[] f5723a;

    /* renamed from: b */
    public final String f5724b;

    /* renamed from: c */
    public final String f5725c;

    public C0947cd(String str, String str2, byte[] bArr) {
        this.f5724b = str;
        this.f5725c = str2;
        this.f5723a = bArr;
    }

    /* renamed from: a */
    public final byte[] m25448a() {
        if (m25447e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.f5723a);
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
    /* renamed from: b */
    public InputStream mo5841b() {
        if (m25447e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f5723a);
    }

    @Override // com.daaw.wr0
    /* renamed from: c */
    public String mo5840c() {
        return this.f5725c;
    }

    @Override // com.daaw.wr0
    /* renamed from: d */
    public AbstractC2057lm.AbstractC2063d.AbstractC2065b mo5839d() {
        byte[] m25448a = m25448a();
        if (m25448a == null) {
            return null;
        }
        return AbstractC2057lm.AbstractC2063d.AbstractC2065b.m16795a().mo16791b(m25448a).mo16790c(this.f5724b).mo16792a();
    }

    /* renamed from: e */
    public final boolean m25447e() {
        byte[] bArr = this.f5723a;
        return bArr == null || bArr.length == 0;
    }
}
