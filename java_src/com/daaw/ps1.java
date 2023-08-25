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

    /* renamed from: a */
    public final WindowManager f23231a;

    /* renamed from: b */
    public final Choreographer$FrameCallbackC2586b f23232b;

    /* renamed from: c */
    public final C2585a f23233c;

    /* renamed from: d */
    public long f23234d;

    /* renamed from: e */
    public long f23235e;

    /* renamed from: f */
    public long f23236f;

    /* renamed from: g */
    public long f23237g;

    /* renamed from: h */
    public long f23238h;

    /* renamed from: i */
    public boolean f23239i;

    /* renamed from: j */
    public long f23240j;

    /* renamed from: k */
    public long f23241k;

    /* renamed from: l */
    public long f23242l;

    @TargetApi(17)
    /* renamed from: com.daaw.ps1$a */
    /* loaded from: classes.dex */
    public final class C2585a implements DisplayManager.DisplayListener {

        /* renamed from: a */
        public final DisplayManager f23243a;

        public C2585a(DisplayManager displayManager) {
            this.f23243a = displayManager;
        }

        /* renamed from: a */
        public void m13170a() {
            this.f23243a.registerDisplayListener(this, null);
        }

        /* renamed from: b */
        public void m13169b() {
            this.f23243a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            if (i == 0) {
                ps1.this.m13171h();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: com.daaw.ps1$b */
    /* loaded from: classes.dex */
    public static final class Choreographer$FrameCallbackC2586b implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: u */
        public static final Choreographer$FrameCallbackC2586b f23245u = new Choreographer$FrameCallbackC2586b();

        /* renamed from: p */
        public volatile long f23246p = -9223372036854775807L;

        /* renamed from: q */
        public final Handler f23247q;

        /* renamed from: r */
        public final HandlerThread f23248r;

        /* renamed from: s */
        public Choreographer f23249s;

        /* renamed from: t */
        public int f23250t;

        public Choreographer$FrameCallbackC2586b() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.f23248r = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.f23247q = handler;
            handler.sendEmptyMessage(0);
        }

        /* renamed from: d */
        public static Choreographer$FrameCallbackC2586b m13165d() {
            return f23245u;
        }

        /* renamed from: a */
        public void m13168a() {
            this.f23247q.sendEmptyMessage(1);
        }

        /* renamed from: b */
        public final void m13167b() {
            int i = this.f23250t + 1;
            this.f23250t = i;
            if (i == 1) {
                this.f23249s.postFrameCallback(this);
            }
        }

        /* renamed from: c */
        public final void m13166c() {
            this.f23249s = Choreographer.getInstance();
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.f23246p = j;
            this.f23249s.postFrameCallbackDelayed(this, 500L);
        }

        /* renamed from: e */
        public void m13164e() {
            this.f23247q.sendEmptyMessage(2);
        }

        /* renamed from: f */
        public final void m13163f() {
            int i = this.f23250t - 1;
            this.f23250t = i;
            if (i == 0) {
                this.f23249s.removeFrameCallback(this);
                this.f23246p = -9223372036854775807L;
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m13166c();
                return true;
            } else if (i == 1) {
                m13167b();
                return true;
            } else if (i != 2) {
                return false;
            } else {
                m13163f();
                return true;
            }
        }
    }

    public ps1(Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.f23231a = (WindowManager) context.getSystemService("window");
        } else {
            this.f23231a = null;
        }
        if (this.f23231a != null) {
            this.f23233c = sq1.f26525a >= 17 ? m13172g(context) : null;
            this.f23232b = Choreographer$FrameCallbackC2586b.m13165d();
        } else {
            this.f23233c = null;
            this.f23232b = null;
        }
        this.f23234d = -9223372036854775807L;
        this.f23235e = -9223372036854775807L;
    }

    /* renamed from: c */
    public static long m13176c(long j, long j2, long j3) {
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
        if (m13173f(r0, r13) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long m13177b(long j, long j2) {
        long j3;
        long j4;
        Choreographer$FrameCallbackC2586b choreographer$FrameCallbackC2586b;
        long j5 = 1000 * j;
        if (this.f23239i) {
            if (j != this.f23236f) {
                this.f23242l++;
                this.f23237g = this.f23238h;
            }
            long j6 = this.f23242l;
            if (j6 >= 6) {
                j4 = this.f23237g + ((j5 - this.f23241k) / j6);
                if (!m13173f(j4, j2)) {
                    j3 = (this.f23240j + j4) - this.f23241k;
                    if (!this.f23239i) {
                        this.f23241k = j5;
                        this.f23240j = j2;
                        this.f23242l = 0L;
                        this.f23239i = true;
                    }
                    this.f23236f = j;
                    this.f23238h = j4;
                    choreographer$FrameCallbackC2586b = this.f23232b;
                    if (choreographer$FrameCallbackC2586b != null || this.f23234d == -9223372036854775807L) {
                        return j3;
                    }
                    long j7 = choreographer$FrameCallbackC2586b.f23246p;
                    return j7 == -9223372036854775807L ? j3 : m13176c(j3, j7, this.f23234d) - this.f23235e;
                }
            }
            this.f23239i = false;
        }
        j3 = j2;
        j4 = j5;
        if (!this.f23239i) {
        }
        this.f23236f = j;
        this.f23238h = j4;
        choreographer$FrameCallbackC2586b = this.f23232b;
        if (choreographer$FrameCallbackC2586b != null) {
        }
        return j3;
    }

    /* renamed from: d */
    public void m13175d() {
        if (this.f23231a != null) {
            C2585a c2585a = this.f23233c;
            if (c2585a != null) {
                c2585a.m13169b();
            }
            this.f23232b.m13164e();
        }
    }

    /* renamed from: e */
    public void m13174e() {
        this.f23239i = false;
        if (this.f23231a != null) {
            this.f23232b.m13168a();
            C2585a c2585a = this.f23233c;
            if (c2585a != null) {
                c2585a.m13170a();
            }
            m13171h();
        }
    }

    /* renamed from: f */
    public final boolean m13173f(long j, long j2) {
        return Math.abs((j2 - this.f23240j) - (j - this.f23241k)) > 20000000;
    }

    @TargetApi(17)
    /* renamed from: g */
    public final C2585a m13172g(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new C2585a(displayManager);
    }

    /* renamed from: h */
    public final void m13171h() {
        Display defaultDisplay = this.f23231a.getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = defaultDisplay.getRefreshRate();
            Double.isNaN(refreshRate);
            long j = (long) (1.0E9d / refreshRate);
            this.f23234d = j;
            this.f23235e = (j * 80) / 100;
        }
    }
}
