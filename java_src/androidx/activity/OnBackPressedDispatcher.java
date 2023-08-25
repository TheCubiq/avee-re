package androidx.activity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.c;
import androidx.lifecycle.d;
import com.daaw.sj0;
import com.daaw.td;
import com.daaw.uj;
import com.daaw.wt0;
import java.util.ArrayDeque;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    public final Runnable a;
    public uj<Boolean> c;
    public OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public final ArrayDeque<wt0> b = new ArrayDeque<>();
    public boolean f = false;

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements d, td {
        public final androidx.lifecycle.c a;
        public final wt0 b;
        public td c;

        public LifecycleOnBackPressedCancellable(androidx.lifecycle.c cVar, wt0 wt0Var) {
            this.a = cVar;
            this.b = wt0Var;
            cVar.a(this);
        }

        @Override // androidx.lifecycle.d
        public void a(sj0 sj0Var, c.b bVar) {
            if (bVar == c.b.ON_START) {
                this.c = OnBackPressedDispatcher.this.c(this.b);
            } else if (bVar != c.b.ON_STOP) {
                if (bVar == c.b.ON_DESTROY) {
                    cancel();
                }
            } else {
                td tdVar = this.c;
                if (tdVar != null) {
                    tdVar.cancel();
                }
            }
        }

        @Override // com.daaw.td
        public void cancel() {
            this.a.c(this);
            this.b.e(this);
            td tdVar = this.c;
            if (tdVar != null) {
                tdVar.cancel();
                this.c = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements OnBackInvokedCallback {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, OnBackInvokedCallback onBackInvokedCallback) {
            onBackInvokedDispatcher.registerOnBackInvokedCallback(i, onBackInvokedCallback);
        }

        public static void b(OnBackInvokedDispatcher onBackInvokedDispatcher, OnBackInvokedCallback onBackInvokedCallback) {
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
        }
    }

    /* loaded from: classes.dex */
    public class c implements td {
        public final wt0 a;

        public c(wt0 wt0Var) {
            this.a = wt0Var;
        }

        @Override // com.daaw.td
        public void cancel() {
            OnBackPressedDispatcher.this.b.remove(this.a);
            this.a.e(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.a.g(null);
                OnBackPressedDispatcher.this.h();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.c = new uj() { // from class: com.daaw.xt0
                @Override // com.daaw.uj
                public final void a(Object obj) {
                    OnBackPressedDispatcher.this.e((Boolean) obj);
                }
            };
            this.d = new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Boolean bool) {
        if (Build.VERSION.SDK_INT >= 33) {
            h();
        }
    }

    @SuppressLint({"LambdaLast"})
    public void b(sj0 sj0Var, wt0 wt0Var) {
        androidx.lifecycle.c a2 = sj0Var.a();
        if (a2.b() == c.EnumC0020c.DESTROYED) {
            return;
        }
        wt0Var.a(new LifecycleOnBackPressedCancellable(a2, wt0Var));
        if (Build.VERSION.SDK_INT >= 33) {
            h();
            wt0Var.g(this.c);
        }
    }

    public td c(wt0 wt0Var) {
        this.b.add(wt0Var);
        c cVar = new c(wt0Var);
        wt0Var.a(cVar);
        if (Build.VERSION.SDK_INT >= 33) {
            h();
            wt0Var.g(this.c);
        }
        return cVar;
    }

    public boolean d() {
        Iterator<wt0> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().c()) {
                return true;
            }
        }
        return false;
    }

    public void f() {
        Iterator<wt0> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            wt0 next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void g(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.e = onBackInvokedDispatcher;
        h();
    }

    public void h() {
        boolean z;
        boolean d = d();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher != null) {
            if (d && !this.f) {
                b.a(onBackInvokedDispatcher, 1000000, this.d);
                z = true;
            } else if (d || !this.f) {
                return;
            } else {
                b.b(onBackInvokedDispatcher, this.d);
                z = false;
            }
            this.f = z;
        }
    }
}
