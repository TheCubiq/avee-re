package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public class ae1 {

    /* renamed from: e */
    public static ae1 f3115e;

    /* renamed from: a */
    public final Object f3116a = new Object();

    /* renamed from: b */
    public final Handler f3117b = new Handler(Looper.getMainLooper(), new C0617a());

    /* renamed from: c */
    public C0619c f3118c;

    /* renamed from: d */
    public C0619c f3119d;

    /* renamed from: com.daaw.ae1$a */
    /* loaded from: classes2.dex */
    public class C0617a implements Handler.Callback {
        public C0617a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            ae1.this.m27513c((C0619c) message.obj);
            return true;
        }
    }

    /* renamed from: com.daaw.ae1$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC0618b {
        /* renamed from: a */
        void m27508a(int i);
    }

    /* renamed from: com.daaw.ae1$c */
    /* loaded from: classes2.dex */
    public static class C0619c {

        /* renamed from: a */
        public final WeakReference<InterfaceC0618b> f3121a;

        /* renamed from: b */
        public int f3122b;

        /* renamed from: c */
        public boolean f3123c;

        /* renamed from: a */
        public boolean m27507a(InterfaceC0618b interfaceC0618b) {
            return interfaceC0618b != null && this.f3121a.get() == interfaceC0618b;
        }
    }

    /* renamed from: b */
    public static ae1 m27514b() {
        if (f3115e == null) {
            f3115e = new ae1();
        }
        return f3115e;
    }

    /* renamed from: a */
    public final boolean m27515a(C0619c c0619c, int i) {
        InterfaceC0618b interfaceC0618b = c0619c.f3121a.get();
        if (interfaceC0618b != null) {
            this.f3117b.removeCallbacksAndMessages(c0619c);
            interfaceC0618b.m27508a(i);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m27513c(C0619c c0619c) {
        synchronized (this.f3116a) {
            if (this.f3118c == c0619c || this.f3119d == c0619c) {
                m27515a(c0619c, 2);
            }
        }
    }

    /* renamed from: d */
    public final boolean m27512d(InterfaceC0618b interfaceC0618b) {
        C0619c c0619c = this.f3118c;
        return c0619c != null && c0619c.m27507a(interfaceC0618b);
    }

    /* renamed from: e */
    public void m27511e(InterfaceC0618b interfaceC0618b) {
        synchronized (this.f3116a) {
            if (m27512d(interfaceC0618b)) {
                C0619c c0619c = this.f3118c;
                if (!c0619c.f3123c) {
                    c0619c.f3123c = true;
                    this.f3117b.removeCallbacksAndMessages(c0619c);
                }
            }
        }
    }

    /* renamed from: f */
    public void m27510f(InterfaceC0618b interfaceC0618b) {
        synchronized (this.f3116a) {
            if (m27512d(interfaceC0618b)) {
                C0619c c0619c = this.f3118c;
                if (c0619c.f3123c) {
                    c0619c.f3123c = false;
                    m27509g(c0619c);
                }
            }
        }
    }

    /* renamed from: g */
    public final void m27509g(C0619c c0619c) {
        int i = c0619c.f3122b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        this.f3117b.removeCallbacksAndMessages(c0619c);
        Handler handler = this.f3117b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c0619c), i);
    }
}
