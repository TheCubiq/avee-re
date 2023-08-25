package com.daaw;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;
import org.conscrypt.NativeConstants;
@Deprecated
/* loaded from: classes.dex */
public final class xd0 {
    /* renamed from: a */
    public static void m5227a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    /* renamed from: b */
    public static long m5226b(InputStream inputStream, OutputStream outputStream) {
        return m5225c(inputStream, outputStream, false, NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
    }

    @Deprecated
    /* renamed from: c */
    public static long m5225c(InputStream inputStream, OutputStream outputStream, boolean z, int i) {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z) {
                    m5227a(inputStream);
                    m5227a(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            m5227a(inputStream);
            m5227a(outputStream);
        }
        return j;
    }

    @Deprecated
    /* renamed from: d */
    public static byte[] m5224d(InputStream inputStream, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m5225c(inputStream, byteArrayOutputStream, z, NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
        return byteArrayOutputStream.toByteArray();
    }
}
