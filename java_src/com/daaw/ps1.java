package com.daaw;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
@TargetApi(16)
/* loaded from: classes.dex */
public final class ps1 {
    public final WindowManager a;
    public final b b;
    public final a c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public long j;
    public long k;
    public long l;

    @TargetApi(17)
    /* loaded from: classes.dex */
    public final class a implements DisplayManager.DisplayListener {
        public final DisplayManager a;

        public a(DisplayManager displayManager) {
            this.a = displayManager;
        }

        public void a() {
            this.a.registerDisplayListener(this, null);
        }

        public void b() {
            this.a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            if (i == 0) {
                ps1.this.h();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Choreographer.FrameCallback, Handler.Callback {
        public static final b u = new b();
        public volatile long p = -9223372036854775807L;
        public final Handler q;
        public final HandlerThread r;
        public Choreographer s;
        public int t;

        public b() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.r = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.q = handler;
            handler.sendEmptyMessage(0);
        }

        public static b d() {
            return u;
        }

        public void a() {
            this.q.sendEmptyMessage(1);
        }

        public final void b() {
            int i = this.t + 1;
            this.t = i;
            if (i == 1) {
                this.s.postFrameCallback(this);
            }
        }

        public final void c() {
            this.s = Choreographer.getInstance();
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.p = j;
            this.s.postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.q.sendEmptyMessage(2);
        }

        public final void f() {
            int i = this.t - 1;
            this.t = i;
            if (i == 0) {
                this.s.removeFrameCallback(this);
                this.p = -9223372036854775807L;
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                c();
                return true;
            } else if (i == 1) {
                b();
                return true;
            } else if (i != 2) {
                return false;
            } else {
                f();
                return true;
            }
        }
    }

    public ps1(Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.a = (WindowManager) context.getSystemService("window");
        } else {
            this.a = null;
        }
        if (this.a != null) {
            this.c = sq1.a >= 17 ? g(context) : null;
            this.b = b.d();
        } else {
            this.c = null;
            this.b = null;
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
    }

    public static long c(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (f(r0, r13) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long b(long r11, long r13) {
        /*
            r10 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r11
            boolean r2 = r10.i
            if (r2 == 0) goto L41
            long r2 = r10.f
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L19
            long r2 = r10.l
            r4 = 1
            long r2 = r2 + r4
            r10.l = r2
            long r2 = r10.h
            r10.g = r2
        L19:
            long r2 = r10.l
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L3a
            long r4 = r10.k
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r10.g
            long r2 = r2 + r4
            boolean r4 = r10.f(r2, r13)
            if (r4 == 0) goto L33
        L30:
            r10.i = r6
            goto L41
        L33:
            long r4 = r10.j
            long r4 = r4 + r2
            long r6 = r10.k
            long r4 = r4 - r6
            goto L43
        L3a:
            boolean r2 = r10.f(r0, r13)
            if (r2 == 0) goto L41
            goto L30
        L41:
            r4 = r13
            r2 = r0
        L43:
            boolean r6 = r10.i
            if (r6 != 0) goto L52
            r10.k = r0
            r10.j = r13
            r13 = 0
            r10.l = r13
            r13 = 1
            r10.i = r13
        L52:
            r10.f = r11
            r10.h = r2
            com.daaw.ps1$b r11 = r10.b
            if (r11 == 0) goto L77
            long r12 = r10.d
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r14 != 0) goto L66
            goto L77
        L66:
            long r6 = r11.p
            int r11 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r11 != 0) goto L6d
            return r4
        L6d:
            long r8 = r10.d
            long r11 = c(r4, r6, r8)
            long r13 = r10.e
            long r11 = r11 - r13
            return r11
        L77:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ps1.b(long, long):long");
    }

    public void d() {
        if (this.a != null) {
            a aVar = this.c;
            if (aVar != null) {
                aVar.b();
            }
            this.b.e();
        }
    }

    public void e() {
        this.i = false;
        if (this.a != null) {
            this.b.a();
            a aVar = this.c;
            if (aVar != null) {
                aVar.a();
            }
            h();
        }
    }

    public final boolean f(long j, long j2) {
        return Math.abs((j2 - this.j) - (j - this.k)) > 20000000;
    }

    @TargetApi(17)
    public final a g(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new a(displayManager);
    }

    public final void h() {
        Display defaultDisplay = this.a.getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = defaultDisplay.getRefreshRate();
            Double.isNaN(refreshRate);
            long j = (long) (1.0E9d / refreshRate);
            this.d = j;
            this.e = (j * 80) / 100;
        }
    }
}
