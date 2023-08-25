package com.daaw;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes2.dex */
public class xr0 {
    public static void a(InputStream inputStream, File file) {
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
                        fh.f(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    fh.f(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void b(File file, List<wr0> list) {
        for (wr0 wr0Var : list) {
            InputStream inputStream = null;
            try {
                inputStream = wr0Var.b();
                if (inputStream != null) {
                    a(inputStream, new File(file, wr0Var.c()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                fh.f(null);
                throw th;
            }
            fh.f(inputStream);
        }
    }
}
