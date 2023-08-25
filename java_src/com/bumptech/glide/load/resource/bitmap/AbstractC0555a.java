package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import com.daaw.C0833bd;
import com.daaw.C3481wy;
import com.daaw.EnumC0988cq;
import com.daaw.InterfaceC0832bc;
import com.daaw.InterfaceC3684yb;
import com.daaw.dn0;
import com.daaw.gn1;
import com.daaw.k31;
import com.daaw.tq1;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;
import org.conscrypt.NativeConstants;
/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
/* loaded from: classes.dex */
public abstract class AbstractC0555a implements InterfaceC3684yb<InputStream> {

    /* renamed from: a */
    public static final Set<ImageHeaderParser.ImageType> f2647a = EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG);

    /* renamed from: b */
    public static final Queue<BitmapFactory.Options> f2648b = tq1.m8867d(0);

    /* renamed from: c */
    public static final AbstractC0555a f2649c = new C0556a();

    /* renamed from: d */
    public static final AbstractC0555a f2650d = new C0557b();

    /* renamed from: e */
    public static final AbstractC0555a f2651e = new C0558c();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$a */
    /* loaded from: classes.dex */
    public static class C0556a extends AbstractC0555a {
        @Override // com.daaw.InterfaceC3684yb
        public String getId() {
            return "AT_LEAST.com.bumptech.glide.load.data.bitmap";
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC0555a
        /* renamed from: h */
        public int mo27788h(int i, int i2, int i3, int i4) {
            return Math.min(i2 / i4, i / i3);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$b */
    /* loaded from: classes.dex */
    public static class C0557b extends AbstractC0555a {
        @Override // com.daaw.InterfaceC3684yb
        public String getId() {
            return "AT_MOST.com.bumptech.glide.load.data.bitmap";
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC0555a
        /* renamed from: h */
        public int mo27788h(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int max = Math.max(1, Integer.highestOneBit(ceil));
            return max << (max >= ceil ? 0 : 1);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$c */
    /* loaded from: classes.dex */
    public static class C0558c extends AbstractC0555a {
        @Override // com.daaw.InterfaceC3684yb
        public String getId() {
            return "NONE.com.bumptech.glide.load.data.bitmap";
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC0555a
        /* renamed from: h */
        public int mo27788h(int i, int i2, int i3, int i4) {
            return 0;
        }
    }

    /* renamed from: b */
    public static Bitmap m27798b(dn0 dn0Var, k31 k31Var, BitmapFactory.Options options) {
        if (options.inJustDecodeBounds) {
            dn0Var.mark(5242880);
        } else {
            k31Var.m18065n();
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

    /* renamed from: d */
    public static Bitmap.Config m27796d(InputStream inputStream, EnumC0988cq enumC0988cq) {
        if (enumC0988cq == EnumC0988cq.ALWAYS_ARGB_8888 || enumC0988cq == EnumC0988cq.PREFER_ARGB_8888) {
            return Bitmap.Config.ARGB_8888;
        }
        boolean z = false;
        inputStream.mark(NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
        try {
            try {
                z = new ImageHeaderParser(inputStream).m27810f();
            } catch (IOException unused) {
                if (Log.isLoggable("Downsampler", 5)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot determine whether the image has alpha or not from header for format ");
                    sb.append(enumC0988cq);
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
    /* renamed from: e */
    public static synchronized BitmapFactory.Options m27795e() {
        BitmapFactory.Options poll;
        synchronized (AbstractC0555a.class) {
            Queue<BitmapFactory.Options> queue = f2648b;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m27791j(poll);
            }
        }
        return poll;
    }

    /* renamed from: i */
    public static void m27792i(BitmapFactory.Options options) {
        m27791j(options);
        Queue<BitmapFactory.Options> queue = f2648b;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    @TargetApi(11)
    /* renamed from: j */
    public static void m27791j(BitmapFactory.Options options) {
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
    /* renamed from: k */
    public static void m27790k(BitmapFactory.Options options, Bitmap bitmap) {
        options.inBitmap = bitmap;
    }

    /* renamed from: l */
    public static boolean m27789l(InputStream inputStream) {
        return true;
    }

    /* renamed from: a */
    public Bitmap m27799a(InputStream inputStream, InterfaceC0832bc interfaceC0832bc, int i, int i2, EnumC0988cq enumC0988cq) {
        int i3;
        C0833bd m26226a = C0833bd.m26226a();
        byte[] m26225b = m26226a.m26225b();
        byte[] m26225b2 = m26226a.m26225b();
        BitmapFactory.Options m27795e = m27795e();
        k31 k31Var = new k31(inputStream, m26225b2);
        C3481wy m5719n = C3481wy.m5719n(k31Var);
        dn0 dn0Var = new dn0(m5719n);
        try {
            m5719n.mark(5242880);
            try {
                int m27813c = new ImageHeaderParser(m5719n).m27813c();
                try {
                    m5719n.reset();
                } catch (IOException unused) {
                    Log.isLoggable("Downsampler", 5);
                }
                i3 = m27813c;
            } catch (IOException unused2) {
                Log.isLoggable("Downsampler", 5);
                try {
                    m5719n.reset();
                } catch (IOException unused3) {
                    Log.isLoggable("Downsampler", 5);
                }
                i3 = 0;
            }
            m27795e.inTempStorage = m26225b;
            int[] m27794f = m27794f(dn0Var, k31Var, m27795e);
            int i4 = m27794f[0];
            int i5 = m27794f[1];
            Bitmap m27797c = m27797c(dn0Var, k31Var, m27795e, interfaceC0832bc, i4, i5, m27793g(gn1.m21445c(i3), i4, i5, i, i2), enumC0988cq);
            IOException m5720d = m5719n.m5720d();
            if (m5720d == null) {
                Bitmap bitmap = null;
                if (m27797c != null) {
                    bitmap = gn1.m21442f(m27797c, interfaceC0832bc, i3);
                    if (!m27797c.equals(bitmap) && !interfaceC0832bc.mo8071a(m27797c)) {
                        m27797c.recycle();
                    }
                }
                return bitmap;
            }
            throw new RuntimeException(m5720d);
        } finally {
            m26226a.m26224c(m26225b);
            m26226a.m26224c(m26225b2);
            m5719n.m5718q();
            m27792i(m27795e);
        }
    }

    /* renamed from: c */
    public final Bitmap m27797c(dn0 dn0Var, k31 k31Var, BitmapFactory.Options options, InterfaceC0832bc interfaceC0832bc, int i, int i2, int i3, EnumC0988cq enumC0988cq) {
        Bitmap.Config m27796d = m27796d(dn0Var, enumC0988cq);
        options.inSampleSize = i3;
        options.inPreferredConfig = m27796d;
        if (m27789l(dn0Var)) {
            double d = i;
            double d2 = i3;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = i2;
            Double.isNaN(d3);
            Double.isNaN(d2);
            m27790k(options, interfaceC0832bc.mo8067e((int) Math.ceil(d / d2), (int) Math.ceil(d3 / d2), m27796d));
        }
        return m27798b(dn0Var, k31Var, options);
    }

    /* renamed from: f */
    public int[] m27794f(dn0 dn0Var, k31 k31Var, BitmapFactory.Options options) {
        options.inJustDecodeBounds = true;
        m27798b(dn0Var, k31Var, options);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: g */
    public final int m27793g(int i, int i2, int i3, int i4, int i5) {
        if (i5 == Integer.MIN_VALUE) {
            i5 = i3;
        }
        if (i4 == Integer.MIN_VALUE) {
            i4 = i2;
        }
        int mo27788h = (i == 90 || i == 270) ? mo27788h(i3, i2, i4, i5) : mo27788h(i2, i3, i4, i5);
        return Math.max(1, mo27788h == 0 ? 0 : Integer.highestOneBit(mo27788h));
    }

    /* renamed from: h */
    public abstract int mo27788h(int i, int i2, int i3, int i4);
}
