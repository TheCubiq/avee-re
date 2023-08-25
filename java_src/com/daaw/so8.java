package com.daaw;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class so8 {

    /* renamed from: g */
    public static final ArrayDeque f26456g = new ArrayDeque();

    /* renamed from: h */
    public static final Object f26457h = new Object();

    /* renamed from: a */
    public final MediaCodec f26458a;

    /* renamed from: b */
    public final HandlerThread f26459b;

    /* renamed from: c */
    public Handler f26460c;

    /* renamed from: d */
    public final AtomicReference f26461d;

    /* renamed from: e */
    public final ds4 f26462e;

    /* renamed from: f */
    public boolean f26463f;

    public so8(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ds4 ds4Var = new ds4(xp4.f32865a);
        this.f26458a = mediaCodec;
        this.f26459b = handlerThread;
        this.f26462e = ds4Var;
        this.f26461d = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065 A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* bridge */ /* synthetic */ void m10106a(so8 so8Var, Message message) {
        jo8 jo8Var;
        int i = message.what;
        jo8 jo8Var2 = null;
        if (i == 0) {
            jo8Var = (jo8) message.obj;
            try {
                so8Var.f26458a.queueInputBuffer(jo8Var.f15287a, 0, jo8Var.f15289c, jo8Var.f15291e, jo8Var.f15292f);
            } catch (RuntimeException e) {
                e = e;
                ho8.m20566a(so8Var.f26461d, null, e);
                jo8Var2 = jo8Var;
                if (jo8Var2 == null) {
                }
            }
        } else if (i != 1) {
            if (i != 2) {
                ho8.m20566a(so8Var.f26461d, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                so8Var.f26462e.m24006e();
            }
            if (jo8Var2 == null) {
                ArrayDeque arrayDeque = f26456g;
                synchronized (arrayDeque) {
                    arrayDeque.add(jo8Var2);
                }
                return;
            }
            return;
        } else {
            jo8Var = (jo8) message.obj;
            int i2 = jo8Var.f15287a;
            MediaCodec.CryptoInfo cryptoInfo = jo8Var.f15290d;
            long j = jo8Var.f15291e;
            int i3 = jo8Var.f15292f;
            try {
                synchronized (f26457h) {
                    so8Var.f26458a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                }
            } catch (RuntimeException e2) {
                e = e2;
                ho8.m20566a(so8Var.f26461d, null, e);
                jo8Var2 = jo8Var;
                if (jo8Var2 == null) {
                }
            }
        }
        jo8Var2 = jo8Var;
        if (jo8Var2 == null) {
        }
    }

    /* renamed from: g */
    public static jo8 m10100g() {
        ArrayDeque arrayDeque = f26456g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new jo8();
            }
            return (jo8) arrayDeque.removeFirst();
        }
    }

    /* renamed from: i */
    public static byte[] m10098i(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null) {
            int length = bArr2.length;
            int length2 = bArr.length;
            if (length >= length2) {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
                return bArr2;
            }
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: j */
    public static int[] m10097j(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null) {
            int length = iArr2.length;
            int length2 = iArr.length;
            if (length >= length2) {
                System.arraycopy(iArr, 0, iArr2, 0, length2);
                return iArr2;
            }
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* renamed from: b */
    public final void m10105b() {
        if (this.f26463f) {
            try {
                Handler handler = this.f26460c;
                Objects.requireNonNull(handler);
                handler.removeCallbacksAndMessages(null);
                this.f26462e.m24008c();
                Handler handler2 = this.f26460c;
                Objects.requireNonNull(handler2);
                handler2.obtainMessage(2).sendToTarget();
                this.f26462e.m24010a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: c */
    public final void m10104c(int i, int i2, int i3, long j, int i4) {
        m10099h();
        jo8 m10100g = m10100g();
        m10100g.m18350a(i, 0, i3, j, i4);
        Handler handler = this.f26460c;
        int i5 = it5.f13991a;
        handler.obtainMessage(0, m10100g).sendToTarget();
    }

    /* renamed from: d */
    public final void m10103d(int i, int i2, d77 d77Var, long j, int i3) {
        m10099h();
        jo8 m10100g = m10100g();
        m10100g.m18350a(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = m10100g.f15290d;
        cryptoInfo.numSubSamples = d77Var.f6592f;
        cryptoInfo.numBytesOfClearData = m10097j(d77Var.f6590d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m10097j(d77Var.f6591e, cryptoInfo.numBytesOfEncryptedData);
        byte[] m10098i = m10098i(d77Var.f6588b, cryptoInfo.key);
        Objects.requireNonNull(m10098i);
        cryptoInfo.key = m10098i;
        byte[] m10098i2 = m10098i(d77Var.f6587a, cryptoInfo.iv);
        Objects.requireNonNull(m10098i2);
        cryptoInfo.iv = m10098i2;
        cryptoInfo.mode = d77Var.f6589c;
        if (it5.f13991a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(d77Var.f6593g, d77Var.f6594h));
        }
        this.f26460c.obtainMessage(1, m10100g).sendToTarget();
    }

    /* renamed from: e */
    public final void m10102e() {
        if (this.f26463f) {
            m10105b();
            this.f26459b.quit();
        }
        this.f26463f = false;
    }

    /* renamed from: f */
    public final void m10101f() {
        if (this.f26463f) {
            return;
        }
        this.f26459b.start();
        this.f26460c = new io8(this, this.f26459b.getLooper());
        this.f26463f = true;
    }

    /* renamed from: h */
    public final void m10099h() {
        RuntimeException runtimeException = (RuntimeException) this.f26461d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
