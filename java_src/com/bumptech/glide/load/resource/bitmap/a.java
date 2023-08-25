package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import com.daaw.bc;
import com.daaw.bd;
import com.daaw.cq;
import com.daaw.dn0;
import com.daaw.gn1;
import com.daaw.k31;
import com.daaw.tq1;
import com.daaw.wy;
import com.daaw.yb;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public abstract class a implements yb<InputStream> {
    public static final Set<ImageHeaderParser.ImageType> a = EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG);
    public static final Queue<BitmapFactory.Options> b = tq1.d(0);
    public static final a c = new C0036a();
    public static final a d = new b();
    public static final a e = new c();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0036a extends a {
        @Override // com.daaw.yb
        public String getId() {
            return "AT_LEAST.com.bumptech.glide.load.data.bitmap";
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a
        public int h(int i, int i2, int i3, int i4) {
            return Math.min(i2 / i4, i / i3);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        @Override // com.daaw.yb
        public String getId() {
            return "AT_MOST.com.bumptech.glide.load.data.bitmap";
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a
        public int h(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int max = Math.max(1, Integer.highestOneBit(ceil));
            return max << (max >= ceil ? 0 : 1);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends a {
        @Override // com.daaw.yb
        public String getId() {
            return "NONE.com.bumptech.glide.load.data.bitmap";
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a
        public int h(int i, int i2, int i3, int i4) {
            return 0;
        }
    }

    public static Bitmap b(dn0 dn0Var, k31 k31Var, BitmapFactory.Options options) {
        if (options.inJustDecodeBounds) {
            dn0Var.mark(5242880);
        } else {
            k31Var.n();
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(dn0Var, null, options);
        try {
            if (options.inJustDecodeBounds) {
                dn0Var.reset();
            }
        } catch (IOException unused) {
            if (Log.isLoggable("Downsampler", 6)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception loading inDecodeBounds=");
                sb.append(options.inJustDecodeBounds);
                sb.append(" sample=");
                sb.append(options.inSampleSize);
            }
        }
        return decodeStream;
    }

    public static Bitmap.Config d(InputStream inputStream, cq cqVar) {
        if (cqVar == cq.ALWAYS_ARGB_8888 || cqVar == cq.PREFER_ARGB_8888) {
            return Bitmap.Config.ARGB_8888;
        }
        boolean z = false;
        inputStream.mark(NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
        try {
            try {
                z = new ImageHeaderParser(inputStream).f();
            } catch (IOException unused) {
                if (Log.isLoggable("Downsampler", 5)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot determine whether the image has alpha or not from header for format ");
                    sb.append(cqVar);
                }
            }
            try {
                inputStream.reset();
            } catch (IOException unused2) {
            }
            return z ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        } catch (Throwable th) {
            try {
                inputStream.reset();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }

    @TargetApi(11)
    public static synchronized BitmapFactory.Options e() {
        BitmapFactory.Options poll;
        synchronized (a.class) {
            Queue<BitmapFactory.Options> queue = b;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                j(poll);
            }
        }
        return poll;
    }

    public static void i(BitmapFactory.Options options) {
        j(options);
        Queue<BitmapFactory.Options> queue = b;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    @TargetApi(11)
    public static void j(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    @TargetApi(11)
    public static void k(BitmapFactory.Options options, Bitmap bitmap) {
        options.inBitmap = bitmap;
    }

    public static boolean l(InputStream inputStream) {
        return true;
    }

    public Bitmap a(InputStream inputStream, bc bcVar, int i, int i2, cq cqVar) {
        int i3;
        bd a2 = bd.a();
        byte[] b2 = a2.b();
        byte[] b3 = a2.b();
        BitmapFactory.Options e2 = e();
        k31 k31Var = new k31(inputStream, b3);
        wy n = wy.n(k31Var);
        dn0 dn0Var = new dn0(n);
        try {
            n.mark(5242880);
            try {
                int c2 = new ImageHeaderParser(n).c();
                try {
                    n.reset();
                } catch (IOException unused) {
                    Log.isLoggable("Downsampler", 5);
                }
                i3 = c2;
            } catch (IOException unused2) {
                Log.isLoggable("Downsampler", 5);
                try {
                    n.reset();
                } catch (IOException unused3) {
                    Log.isLoggable("Downsampler", 5);
                }
                i3 = 0;
            }
            e2.inTempStorage = b2;
            int[] f = f(dn0Var, k31Var, e2);
            int i4 = f[0];
            int i5 = f[1];
            Bitmap c3 = c(dn0Var, k31Var, e2, bcVar, i4, i5, g(gn1.c(i3), i4, i5, i, i2), cqVar);
            IOException d2 = n.d();
            if (d2 == null) {
                Bitmap bitmap = null;
                if (c3 != null) {
                    bitmap = gn1.f(c3, bcVar, i3);
                    if (!c3.equals(bitmap) && !bcVar.a(c3)) {
                        c3.recycle();
                    }
                }
                return bitmap;
            }
            throw new RuntimeException(d2);
        } finally {
            a2.c(b2);
            a2.c(b3);
            n.q();
            i(e2);
        }
    }

    public final Bitmap c(dn0 dn0Var, k31 k31Var, BitmapFactory.Options options, bc bcVar, int i, int i2, int i3, cq cqVar) {
        Bitmap.Config d2 = d(dn0Var, cqVar);
        options.inSampleSize = i3;
        options.inPreferredConfig = d2;
        if (l(dn0Var)) {
            double d3 = i;
            double d4 = i3;
            Double.isNaN(d3);
            Double.isNaN(d4);
            double d5 = i2;
            Double.isNaN(d5);
            Double.isNaN(d4);
            k(options, bcVar.e((int) Math.ceil(d3 / d4), (int) Math.ceil(d5 / d4), d2));
        }
        return b(dn0Var, k31Var, options);
    }

    public int[] f(dn0 dn0Var, k31 k31Var, BitmapFactory.Options options) {
        options.inJustDecodeBounds = true;
        b(dn0Var, k31Var, options);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public final int g(int i, int i2, int i3, int i4, int i5) {
        if (i5 == Integer.MIN_VALUE) {
            i5 = i3;
        }
        if (i4 == Integer.MIN_VALUE) {
            i4 = i2;
        }
        int h = (i == 90 || i == 270) ? h(i3, i2, i4, i5) : h(i2, i3, i4, i5);
        return Math.max(1, h == 0 ? 0 : Integer.highestOneBit(h));
    }

    public abstract int h(int i, int i2, int i3, int i4);
}
