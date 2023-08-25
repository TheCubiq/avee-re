package com.daaw;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class vt6 {

    /* renamed from: a */
    public final ap2 f30581a;

    /* renamed from: b */
    public final File f30582b;

    /* renamed from: c */
    public final File f30583c;

    /* renamed from: d */
    public final File f30584d;

    /* renamed from: e */
    public byte[] f30585e;

    public vt6(ap2 ap2Var, File file, File file2, File file3) {
        this.f30581a = ap2Var;
        this.f30582b = file;
        this.f30583c = file3;
        this.f30584d = file2;
    }

    /* renamed from: a */
    public final ap2 m6796a() {
        return this.f30581a;
    }

    /* renamed from: b */
    public final File m6795b() {
        return this.f30583c;
    }

    /* renamed from: c */
    public final File m6794c() {
        return this.f30582b;
    }

    /* renamed from: d */
    public final boolean m6793d(long j) {
        return this.f30581a.m27264M() - (System.currentTimeMillis() / 1000) < 3600;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] m6792e() {
        byte[] bArr;
        FileInputStream fileInputStream;
        byte[] bArr2;
        FileInputStream fileInputStream2 = null;
        if (this.f30585e == null) {
            try {
                fileInputStream = new FileInputStream(this.f30584d);
                try {
                    bArr2 = yq7.m3421I(fileInputStream).m3415j();
                    xd0.m5227a(fileInputStream);
                } catch (IOException unused) {
                    xd0.m5227a(fileInputStream);
                    bArr2 = null;
                    this.f30585e = bArr2;
                    bArr = this.f30585e;
                    if (bArr != null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    xd0.m5227a(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.f30585e = bArr2;
        }
        bArr = this.f30585e;
        if (bArr != null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
