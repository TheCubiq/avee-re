package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public class ae1 {
    public static ae1 e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new a());
    public c c;
    public c d;

    /* loaded from: classes2.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            ae1.this.c((c) message.obj);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(int i);
    }

    /* loaded from: classes2.dex */
    public static class c {
        public final WeakReference<b> a;
        public int b;
        public boolean c;

        public boolean a(b bVar) {
            return bVar != null && this.a.get() == bVar;
        }
    }

    public static ae1 b() {
        if (e == null) {
            e = new ae1();
        }
        return e;
    }

    public final boolean a(c cVar, int i) {
        b bVar = cVar.a.get();
        if (bVar != null) {
            this.b.removeCallbacksAndMessages(cVar);
            bVar.a(i);
            return true;
        }
        return false;
    }

    public void c(c cVar) {
        synchronized (this.a) {
            if (this.c == cVar || this.d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public final boolean d(b bVar) {
        c cVar = this.c;
        return cVar != null && cVar.a(bVar);
    }

    public void e(b bVar) {
        synchronized (this.a) {
            if (d(bVar)) {
                c cVar = this.c;
                if (!cVar.c) {
                    cVar.c = true;
                    this.b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.a) {
            if (d(bVar)) {
                c cVar = this.c;
                if (cVar.c) {
                    cVar.c = false;
                    g(cVar);
                }
            }
        }
    }

    public final void g(c cVar) {
        int i = cVar.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        this.b.removeCallbacksAndMessages(cVar);
        Handler handler = this.b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
    }
}
