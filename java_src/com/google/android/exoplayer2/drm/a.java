package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.daaw.dd;
import com.daaw.hx1;
import com.daaw.ji0;
import com.daaw.nz;
import com.daaw.sf;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.drm.f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
@TargetApi(18)
/* loaded from: classes.dex */
public class a<T extends nz> implements d<T> {
    public final f<T> a;
    public final c<T> b;
    public final byte[] c;
    public final String d;
    public final int e;
    public final HashMap<String, String> f;
    public final int g;
    public final g h;
    public final UUID i;
    public final a<T>.b j;
    public int k = 2;
    public int l;
    public HandlerThread m;
    public a<T>.HandlerC0093a n;
    public T o;
    public d.a p;
    public byte[] q;
    public byte[] r;

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class HandlerC0093a extends Handler {
        public HandlerC0093a(Looper looper) {
            super(looper);
        }

        public final long a(int i) {
            return Math.min((i - 1) * 1000, 5000);
        }

        public final boolean b(Message message) {
            int i;
            if ((message.arg1 == 1) && (i = message.arg2 + 1) <= a.this.g) {
                Message obtain = Message.obtain(message);
                obtain.arg2 = i;
                sendMessageDelayed(obtain, a(i));
                return true;
            }
            return false;
        }

        public Message c(int i, Object obj, boolean z) {
            return obtainMessage(i, z ? 1 : 0, 0, obj);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                int i = message.what;
                if (i == 0) {
                    a aVar = a.this;
                    e = aVar.h.b(aVar.i, (f.c) message.obj);
                } else if (i != 1) {
                    throw new RuntimeException();
                } else {
                    a aVar2 = a.this;
                    e = aVar2.h.a(aVar2.i, (f.b) message.obj);
                }
            } catch (Exception e) {
                e = e;
                if (b(message)) {
                    return;
                }
            }
            a.this.j.obtainMessage(message.what, e).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                a.this.t(message.obj);
            } else if (i != 1) {
            } else {
                a.this.n(message.obj);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c<T extends nz> {
        void b(a<T> aVar);

        void c(Exception exc);

        void e();
    }

    public a(UUID uuid, f<T> fVar, c<T> cVar, byte[] bArr, String str, int i, byte[] bArr2, HashMap<String, String> hashMap, g gVar, Looper looper, b.a aVar, int i2) {
        this.i = uuid;
        this.b = cVar;
        this.a = fVar;
        this.e = i;
        this.r = bArr2;
        this.f = hashMap;
        this.h = gVar;
        this.g = i2;
        this.j = new b(looper);
        HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
        this.m = handlerThread;
        handlerThread.start();
        this.n = new HandlerC0093a(this.m.getLooper());
        if (bArr2 == null) {
            this.c = bArr;
            this.d = str;
            return;
        }
        this.c = null;
        this.d = null;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public Map<String, String> a() {
        byte[] bArr = this.q;
        if (bArr == null) {
            return null;
        }
        return this.a.a(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final T b() {
        return this.o;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final d.a c() {
        if (this.k == 1) {
            return this.p;
        }
        return null;
    }

    public void g() {
        int i = this.l + 1;
        this.l = i;
        if (i == 1 && this.k != 1 && u(true)) {
            h(true);
        }
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final int getState() {
        return this.k;
    }

    public final void h(boolean z) {
        int i = this.e;
        int i2 = 1;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.r != null && !y()) {
                    return;
                }
                v(2, z);
                return;
            }
            i2 = 3;
            if (i != 3 || !y()) {
                return;
            }
            v(i2, z);
        }
        if (this.r != null) {
            if (this.k == 4 || y()) {
                long i3 = i();
                if (this.e != 0 || i3 > 60) {
                    if (i3 <= 0) {
                        m(new ji0());
                        return;
                    } else {
                        this.k = 4;
                        throw null;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Offline license has expired or will expire soon. Remaining seconds: ");
                sb.append(i3);
                v(2, z);
                return;
            }
            return;
        }
        v(i2, z);
    }

    public final long i() {
        if (dd.e.equals(this.i)) {
            Pair<Long, Long> b2 = hx1.b(this);
            return Math.min(((Long) b2.first).longValue(), ((Long) b2.second).longValue());
        }
        return Long.MAX_VALUE;
    }

    public boolean j(byte[] bArr) {
        return Arrays.equals(this.c, bArr);
    }

    public boolean k(byte[] bArr) {
        return Arrays.equals(this.q, bArr);
    }

    public final boolean l() {
        int i = this.k;
        return i == 3 || i == 4;
    }

    public final void m(Exception exc) {
        this.p = new d.a(exc);
        throw null;
    }

    public final void n(Object obj) {
        if (l()) {
            if (obj instanceof Exception) {
                o((Exception) obj);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj;
                if (dd.d.equals(this.i)) {
                    bArr = sf.b(bArr);
                }
                if (this.e == 3) {
                    this.a.h(this.r, bArr);
                    throw null;
                }
                byte[] h = this.a.h(this.q, bArr);
                int i = this.e;
                if ((i == 2 || (i == 0 && this.r != null)) && h != null && h.length != 0) {
                    this.r = h;
                }
                this.k = 4;
                throw null;
            } catch (Exception e) {
                o(e);
            }
        }
    }

    public final void o(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.b.b(this);
        } else {
            m(exc);
        }
    }

    public final void p() {
        if (this.k == 4) {
            this.k = 3;
            m(new ji0());
        }
    }

    public void q(int i) {
        if (l()) {
            if (i == 1) {
                this.k = 3;
                this.b.b(this);
            } else if (i == 2) {
                h(false);
            } else if (i != 3) {
            } else {
                p();
            }
        }
    }

    public void r() {
        if (u(false)) {
            h(true);
        }
    }

    public void s(Exception exc) {
        m(exc);
    }

    public final void t(Object obj) {
        if (this.k == 2 || l()) {
            if (obj instanceof Exception) {
                this.b.c((Exception) obj);
                return;
            }
            try {
                this.a.i((byte[]) obj);
                this.b.e();
            } catch (Exception e) {
                this.b.c(e);
            }
        }
    }

    public final boolean u(boolean z) {
        if (l()) {
            return true;
        }
        try {
            byte[] e = this.a.e();
            this.q = e;
            this.o = this.a.b(e);
            this.k = 3;
            return true;
        } catch (NotProvisionedException e2) {
            if (z) {
                this.b.b(this);
                return false;
            }
            m(e2);
            return false;
        } catch (Exception e3) {
            m(e3);
            return false;
        }
    }

    public final void v(int i, boolean z) {
        try {
            f.b d = this.a.d(i == 3 ? this.r : this.q, this.c, this.d, i, this.f);
            if (dd.d.equals(this.i)) {
                d = new f.a(sf.a(d.b()), d.a());
            }
            this.n.c(1, d, z).sendToTarget();
        } catch (Exception e) {
            o(e);
        }
    }

    public void w() {
        this.n.c(0, this.a.c(), true).sendToTarget();
    }

    public boolean x() {
        int i = this.l - 1;
        this.l = i;
        if (i == 0) {
            this.k = 0;
            this.j.removeCallbacksAndMessages(null);
            this.n.removeCallbacksAndMessages(null);
            this.n = null;
            this.m.quit();
            this.m = null;
            this.o = null;
            this.p = null;
            byte[] bArr = this.q;
            if (bArr != null) {
                this.a.g(bArr);
                this.q = null;
            }
            return true;
        }
        return false;
    }

    public final boolean y() {
        try {
            this.a.f(this.q, this.r);
            return true;
        } catch (Exception e) {
            m(e);
            return false;
        }
    }
}
