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
    public static void a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    public static long b(InputStream inputStream, OutputStream outputStream) {
        return c(inputStream, outputStream, false, NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
    }

    @Deprecated
    public static long c(InputStream inputStream, OutputStream outputStream, boolean z, int i) {
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
                    a(inputStream);
                    a(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            a(inputStream);
            a(outputStream);
        }
        return j;
    }

    @Deprecated
    public static byte[] d(InputStream inputStream, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c(inputStream, byteArrayOutputStream, z, NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
        return byteArrayOutputStream.toByteArray();
    }
}
