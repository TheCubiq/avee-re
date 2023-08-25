package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import com.daaw.b30;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public class ap1 {

    /* renamed from: com.daaw.ap1$a */
    /* loaded from: classes.dex */
    public static class C0665a {
        /* renamed from: a */
        public static ParcelFileDescriptor m27266a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    /* renamed from: a */
    public static void m27274a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static ByteBuffer m27273b(Context context, Resources resources, int i) {
        File m27270e = m27270e(context);
        if (m27270e == null) {
            return null;
        }
        try {
            if (m27272c(m27270e, resources, i)) {
                return m27268g(m27270e);
            }
            return null;
        } finally {
            m27270e.delete();
        }
    }

    /* renamed from: c */
    public static boolean m27272c(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean m27271d = m27271d(file, inputStream);
                m27274a(inputStream);
                return m27271d;
            } catch (Throwable th) {
                th = th;
                m27274a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* renamed from: d */
    public static boolean m27271d(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    m27274a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            StringBuilder sb = new StringBuilder();
            sb.append("Error copying resource contents to temp file: ");
            sb.append(e.getMessage());
            m27274a(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            m27274a(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* renamed from: e */
    public static File m27270e(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static ByteBuffer m27269f(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor m27266a = C0665a.m27266a(context.getContentResolver(), uri, "r", cancellationSignal);
            if (m27266a == null) {
                if (m27266a != null) {
                    m27266a.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(m27266a.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                m27266a.close();
                return map;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static ByteBuffer m27268g(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
            fileInputStream.close();
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static Map<Uri, ByteBuffer> m27267h(Context context, b30.C0805b[] c0805bArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (b30.C0805b c0805b : c0805bArr) {
            if (c0805b.m26506b() == 0) {
                Uri m26504d = c0805b.m26504d();
                if (!hashMap.containsKey(m26504d)) {
                    hashMap.put(m26504d, m27269f(context, cancellationSignal, m26504d));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
