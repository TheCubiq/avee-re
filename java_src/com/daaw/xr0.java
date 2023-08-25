package com.daaw;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes2.dex */
public class xr0 {
    /* renamed from: a */
    public static void m4788a(InputStream inputStream, File file) {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        gZIPOutputStream2.finish();
                        C1279fh.m22661f(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    C1279fh.m22661f(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: b */
    public static void m4787b(File file, List<wr0> list) {
        for (wr0 wr0Var : list) {
            InputStream inputStream = null;
            try {
                inputStream = wr0Var.mo5841b();
                if (inputStream != null) {
                    m4788a(inputStream, new File(file, wr0Var.mo5840c()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                C1279fh.m22661f(null);
                throw th;
            }
            C1279fh.m22661f(inputStream);
        }
    }
}
