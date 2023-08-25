package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public class ImageHeaderParser {
    public static final byte[] b;
    public static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    public final b a;

    /* loaded from: classes.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        PNG_A(true),
        PNG(false),
        UNKNOWN(false);
        
        public final boolean p;

        ImageType(boolean z) {
            this.p = z;
        }

        public boolean hasAlpha() {
            return this.p;
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public final ByteBuffer a;

        public a(byte[] bArr) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.a = wrap;
            wrap.order(ByteOrder.BIG_ENDIAN);
        }

        public short a(int i) {
            return this.a.getShort(i);
        }

        public int b(int i) {
            return this.a.getInt(i);
        }

        public int c() {
            return this.a.array().length;
        }

        public void d(ByteOrder byteOrder) {
            this.a.order(byteOrder);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final InputStream a;

        public b(InputStream inputStream) {
            this.a = inputStream;
        }

        public int a() {
            return this.a.read();
        }

        public int b() {
            return ((this.a.read() << 8) & 65280) | (this.a.read() & 255);
        }

        public short c() {
            return (short) (this.a.read() & 255);
        }

        public int d(byte[] bArr) {
            int length = bArr.length;
            while (length > 0) {
                int read = this.a.read(bArr, bArr.length - length, length);
                if (read == -1) {
                    break;
                }
                length -= read;
            }
            return bArr.length - length;
        }

        public long e(long j) {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.a.skip(j2);
                if (skip <= 0) {
                    if (this.a.read() == -1) {
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
        b = bArr;
    }

    public ImageHeaderParser(InputStream inputStream) {
        this.a = new b(inputStream);
    }

    public static int a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    public static boolean e(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int g(com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.a r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.g(com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$a):int");
    }

    public final byte[] b() {
        short c2;
        int b2;
        long j;
        long e;
        do {
            short c3 = this.a.c();
            if (c3 != 255) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append((int) c3);
                }
                return null;
            }
            c2 = this.a.c();
            if (c2 == 218 || c2 == 217) {
                return null;
            }
            b2 = this.a.b() - 2;
            if (c2 == 225) {
                byte[] bArr = new byte[b2];
                int d = this.a.d(bArr);
                if (d != b2) {
                    if (Log.isLoggable("ImageHeaderParser", 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unable to read segment data, type: ");
                        sb2.append((int) c2);
                        sb2.append(", length: ");
                        sb2.append(b2);
                        sb2.append(", actually read: ");
                        sb2.append(d);
                    }
                    return null;
                }
                return bArr;
            }
            j = b2;
            e = this.a.e(j);
        } while (e == j);
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to skip enough data, type: ");
            sb3.append((int) c2);
            sb3.append(", wanted to skip: ");
            sb3.append(b2);
            sb3.append(", but actually skipped: ");
            sb3.append(e);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c() {
        /*
            r7 = this;
            com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$b r0 = r7.a
            int r0 = r0.b()
            boolean r0 = e(r0)
            r1 = -1
            if (r0 != 0) goto Le
            return r1
        Le:
            byte[] r0 = r7.b()
            r2 = 0
            if (r0 == 0) goto L1d
            int r3 = r0.length
            byte[] r4 = com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.b
            int r4 = r4.length
            if (r3 <= r4) goto L1d
            r3 = 1
            goto L1e
        L1d:
            r3 = 0
        L1e:
            if (r3 == 0) goto L30
            r4 = 0
        L21:
            byte[] r5 = com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.b
            int r6 = r5.length
            if (r4 >= r6) goto L30
            r6 = r0[r4]
            r5 = r5[r4]
            if (r6 == r5) goto L2d
            goto L31
        L2d:
            int r4 = r4 + 1
            goto L21
        L30:
            r2 = r3
        L31:
            if (r2 == 0) goto L3d
            com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$a r1 = new com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$a
            r1.<init>(r0)
            int r0 = g(r1)
            return r0
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.c():int");
    }

    public ImageType d() {
        int b2 = this.a.b();
        if (b2 == 65496) {
            return ImageType.JPEG;
        }
        int b3 = ((b2 << 16) & (-65536)) | (this.a.b() & 65535);
        if (b3 != -1991225785) {
            return (b3 >> 8) == 4671814 ? ImageType.GIF : ImageType.UNKNOWN;
        }
        this.a.e(21L);
        return this.a.a() >= 3 ? ImageType.PNG_A : ImageType.PNG;
    }

    public boolean f() {
        return d().hasAlpha();
    }
}
