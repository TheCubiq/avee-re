package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public class ImageHeaderParser {

    /* renamed from: b */
    public static final byte[] f2641b;

    /* renamed from: c */
    public static final int[] f2642c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: a */
    public final C0554b f2643a;

    /* loaded from: classes.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        PNG_A(true),
        PNG(false),
        UNKNOWN(false);
        

        /* renamed from: p */
        public final boolean f2644p;

        ImageType(boolean z) {
            this.f2644p = z;
        }

        public boolean hasAlpha() {
            return this.f2644p;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$a */
    /* loaded from: classes.dex */
    public static class C0553a {

        /* renamed from: a */
        public final ByteBuffer f2645a;

        public C0553a(byte[] bArr) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.f2645a = wrap;
            wrap.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public short m27808a(int i) {
            return this.f2645a.getShort(i);
        }

        /* renamed from: b */
        public int m27807b(int i) {
            return this.f2645a.getInt(i);
        }

        /* renamed from: c */
        public int m27806c() {
            return this.f2645a.array().length;
        }

        /* renamed from: d */
        public void m27805d(ByteOrder byteOrder) {
            this.f2645a.order(byteOrder);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$b */
    /* loaded from: classes.dex */
    public static class C0554b {

        /* renamed from: a */
        public final InputStream f2646a;

        public C0554b(InputStream inputStream) {
            this.f2646a = inputStream;
        }

        /* renamed from: a */
        public int m27804a() {
            return this.f2646a.read();
        }

        /* renamed from: b */
        public int m27803b() {
            return ((this.f2646a.read() << 8) & 65280) | (this.f2646a.read() & 255);
        }

        /* renamed from: c */
        public short m27802c() {
            return (short) (this.f2646a.read() & 255);
        }

        /* renamed from: d */
        public int m27801d(byte[] bArr) {
            int length = bArr.length;
            while (length > 0) {
                int read = this.f2646a.read(bArr, bArr.length - length, length);
                if (read == -1) {
                    break;
                }
                length -= read;
            }
            return bArr.length - length;
        }

        /* renamed from: e */
        public long m27800e(long j) {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f2646a.skip(j2);
                if (skip <= 0) {
                    if (this.f2646a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    static {
        byte[] bArr = new byte[0];
        try {
            bArr = "Exif\u0000\u0000".getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        f2641b = bArr;
    }

    public ImageHeaderParser(InputStream inputStream) {
        this.f2643a = new C0554b(inputStream);
    }

    /* renamed from: a */
    public static int m27815a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: e */
    public static boolean m27811e(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m27809g(C0553a c0553a) {
        ByteOrder byteOrder;
        short m27808a;
        int i;
        StringBuilder sb;
        String str;
        short m27808a2 = c0553a.m27808a(6);
        if (m27808a2 != 19789) {
            if (m27808a2 == 18761) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
                c0553a.m27805d(byteOrder);
                int m27807b = c0553a.m27807b(10) + 6;
                m27808a = c0553a.m27808a(m27807b);
                for (i = 0; i < m27808a; i++) {
                    int m27815a = m27815a(m27807b, i);
                    short m27808a3 = c0553a.m27808a(m27815a);
                    if (m27808a3 == 274) {
                        short m27808a4 = c0553a.m27808a(m27815a + 2);
                        if (m27808a4 >= 1 && m27808a4 <= 12) {
                            int m27807b2 = c0553a.m27807b(m27815a + 4);
                            if (m27807b2 >= 0) {
                                if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Got tagIndex=");
                                    sb2.append(i);
                                    sb2.append(" tagType=");
                                    sb2.append((int) m27808a3);
                                    sb2.append(" formatCode=");
                                    sb2.append((int) m27808a4);
                                    sb2.append(" componentCount=");
                                    sb2.append(m27807b2);
                                }
                                int i2 = m27807b2 + f2642c[m27808a4];
                                if (i2 <= 4) {
                                    int i3 = m27815a + 8;
                                    if (i3 < 0 || i3 > c0553a.m27806c()) {
                                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("Illegal tagValueOffset=");
                                            sb3.append(i3);
                                            sb3.append(" tagType=");
                                            sb3.append((int) m27808a3);
                                        }
                                    } else if (i2 >= 0 && i2 + i3 <= c0553a.m27806c()) {
                                        return c0553a.m27808a(i3);
                                    } else {
                                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append("Illegal number of bytes for TI tag data tagType=");
                                            sb4.append((int) m27808a3);
                                        }
                                    }
                                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    sb = new StringBuilder();
                                    str = "Got byte count > 4, not orientation, continuing, formatCode=";
                                    sb.append(str);
                                    sb.append((int) m27808a4);
                                }
                            } else {
                                continue;
                            }
                        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                            sb = new StringBuilder();
                            str = "Got invalid format code=";
                            sb.append(str);
                            sb.append((int) m27808a4);
                        }
                    }
                }
                return -1;
            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Unknown endianness = ");
                sb5.append((int) m27808a2);
            }
        }
        byteOrder = ByteOrder.BIG_ENDIAN;
        c0553a.m27805d(byteOrder);
        int m27807b3 = c0553a.m27807b(10) + 6;
        m27808a = c0553a.m27808a(m27807b3);
        while (i < m27808a) {
        }
        return -1;
    }

    /* renamed from: b */
    public final byte[] m27814b() {
        short m27802c;
        int m27803b;
        long j;
        long m27800e;
        do {
            short m27802c2 = this.f2643a.m27802c();
            if (m27802c2 != 255) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append((int) m27802c2);
                }
                return null;
            }
            m27802c = this.f2643a.m27802c();
            if (m27802c == 218 || m27802c == 217) {
                return null;
            }
            m27803b = this.f2643a.m27803b() - 2;
            if (m27802c == 225) {
                byte[] bArr = new byte[m27803b];
                int m27801d = this.f2643a.m27801d(bArr);
                if (m27801d != m27803b) {
                    if (Log.isLoggable("ImageHeaderParser", 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unable to read segment data, type: ");
                        sb2.append((int) m27802c);
                        sb2.append(", length: ");
                        sb2.append(m27803b);
                        sb2.append(", actually read: ");
                        sb2.append(m27801d);
                    }
                    return null;
                }
                return bArr;
            }
            j = m27803b;
            m27800e = this.f2643a.m27800e(j);
        } while (m27800e == j);
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to skip enough data, type: ");
            sb3.append((int) m27802c);
            sb3.append(", wanted to skip: ");
            sb3.append(m27803b);
            sb3.append(", but actually skipped: ");
            sb3.append(m27800e);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d A[RETURN] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m27813c() {
        if (!m27811e(this.f2643a.m27803b())) {
            return -1;
        }
        byte[] m27814b = m27814b();
        boolean z = false;
        boolean z2 = m27814b != null && m27814b.length > f2641b.length;
        if (z2) {
            int i = 0;
            while (true) {
                byte[] bArr = f2641b;
                if (i >= bArr.length) {
                    break;
                } else if (m27814b[i] != bArr[i]) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return -1;
            }
            return m27809g(new C0553a(m27814b));
        }
        z = z2;
        if (z) {
        }
    }

    /* renamed from: d */
    public ImageType m27812d() {
        int m27803b = this.f2643a.m27803b();
        if (m27803b == 65496) {
            return ImageType.JPEG;
        }
        int m27803b2 = ((m27803b << 16) & (-65536)) | (this.f2643a.m27803b() & 65535);
        if (m27803b2 != -1991225785) {
            return (m27803b2 >> 8) == 4671814 ? ImageType.GIF : ImageType.UNKNOWN;
        }
        this.f2643a.m27800e(21L);
        return this.f2643a.m27804a() >= 3 ? ImageType.PNG_A : ImageType.PNG;
    }

    /* renamed from: f */
    public boolean m27810f() {
        return m27812d().hasAlpha();
    }
}
