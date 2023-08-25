package com.daaw;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class so8 {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public Handler c;
    public final AtomicReference d;
    public final ds4 e;
    public boolean f;

    public so8(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ds4 ds4Var = new ds4(xp4.a);
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = ds4Var;
        this.d = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ void a(com.daaw.so8 r9, android.os.Message r10) {
        /*
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L3e
            r2 = 1
            if (r0 == r2) goto L22
            r2 = 2
            if (r0 == r2) goto L1c
            java.util.concurrent.atomic.AtomicReference r9 = r9.d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            com.daaw.ho8.a(r9, r1, r0)
            goto L58
        L1c:
            com.daaw.ds4 r9 = r9.e
            r9.e()
            goto L58
        L22:
            java.lang.Object r10 = r10.obj
            com.daaw.jo8 r10 = (com.daaw.jo8) r10
            int r3 = r10.a
            android.media.MediaCodec$CryptoInfo r5 = r10.d
            long r6 = r10.e
            int r8 = r10.f
            java.lang.Object r0 = com.daaw.so8.h     // Catch: java.lang.RuntimeException -> L3c
            monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L3c
            android.media.MediaCodec r2 = r9.a     // Catch: java.lang.Throwable -> L39
            r4 = 0
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            goto L57
        L39:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r2     // Catch: java.lang.RuntimeException -> L3c
        L3c:
            r0 = move-exception
            goto L52
        L3e:
            java.lang.Object r10 = r10.obj
            com.daaw.jo8 r10 = (com.daaw.jo8) r10
            int r3 = r10.a
            int r5 = r10.c
            long r6 = r10.e
            int r8 = r10.f
            android.media.MediaCodec r2 = r9.a     // Catch: java.lang.RuntimeException -> L51
            r4 = 0
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.RuntimeException -> L51
            goto L57
        L51:
            r0 = move-exception
        L52:
            java.util.concurrent.atomic.AtomicReference r9 = r9.d
            com.daaw.ho8.a(r9, r1, r0)
        L57:
            r1 = r10
        L58:
            if (r1 == 0) goto L65
            java.util.ArrayDeque r9 = com.daaw.so8.g
            monitor-enter(r9)
            r9.add(r1)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L62
            return
        L62:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L62
            throw r10
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.so8.a(com.daaw.so8, android.os.Message):void");
    }

    public static jo8 g() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new jo8();
            }
            return (jo8) arrayDeque.removeFirst();
        }
    }

    public static byte[] i(byte[] bArr, byte[] bArr2) {
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

    public static int[] j(int[] iArr, int[] iArr2) {
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

    public final void b() {
        if (this.f) {
            try {
                Handler handler = this.c;
                Objects.requireNonNull(handler);
                handler.removeCallbacksAndMessages(null);
                this.e.c();
                Handler handler2 = this.c;
                Objects.requireNonNull(handler2);
                handler2.obtainMessage(2).sendToTarget();
                this.e.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void c(int i, int i2, int i3, long j, int i4) {
        h();
        jo8 g2 = g();
        g2.a(i, 0, i3, j, i4);
        Handler handler = this.c;
        int i5 = it5.a;
        handler.obtainMessage(0, g2).sendToTarget();
    }

    public final void d(int i, int i2, d77 d77Var, long j, int i3) {
        h();
        jo8 g2 = g();
        g2.a(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = g2.d;
        cryptoInfo.numSubSamples = d77Var.f;
        cryptoInfo.numBytesOfClearData = j(d77Var.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = j(d77Var.e, cryptoInfo.numBytesOfEncryptedData);
        byte[] i4 = i(d77Var.b, cryptoInfo.key);
        Objects.requireNonNull(i4);
        cryptoInfo.key = i4;
        byte[] i5 = i(d77Var.a, cryptoInfo.iv);
        Objects.requireNonNull(i5);
        cryptoInfo.iv = i5;
        cryptoInfo.mode = d77Var.c;
        if (it5.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(d77Var.g, d77Var.h));
        }
        this.c.obtainMessage(1, g2).sendToTarget();
    }

    public final void e() {
        if (this.f) {
            b();
            this.b.quit();
        }
        this.f = false;
    }

    public final void f() {
        if (this.f) {
            return;
        }
        this.b.start();
        this.c = new io8(this, this.b.getLooper());
        this.f = true;
    }

    public final void h() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
