package androidx.activity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.AbstractC0344c;
import androidx.lifecycle.InterfaceC0348d;
import com.daaw.InterfaceC3057td;
import com.daaw.InterfaceC3222uj;
import com.daaw.sj0;
import com.daaw.wt0;
import java.util.ArrayDeque;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    public final Runnable f107a;

    /* renamed from: c */
    public InterfaceC3222uj<Boolean> f109c;

    /* renamed from: d */
    public OnBackInvokedCallback f110d;

    /* renamed from: e */
    public OnBackInvokedDispatcher f111e;

    /* renamed from: b */
    public final ArrayDeque<wt0> f108b = new ArrayDeque<>();

    /* renamed from: f */
    public boolean f112f = false;

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements InterfaceC0348d, InterfaceC3057td {

        /* renamed from: a */
        public final AbstractC0344c f113a;

        /* renamed from: b */
        public final wt0 f114b;

        /* renamed from: c */
        public InterfaceC3057td f115c;

        public LifecycleOnBackPressedCancellable(AbstractC0344c abstractC0344c, wt0 wt0Var) {
            this.f113a = abstractC0344c;
            this.f114b = wt0Var;
            abstractC0344c.mo29048a(this);
        }

        @Override // androidx.lifecycle.InterfaceC0348d
        /* renamed from: a */
        public void mo18735a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b) {
            if (enumC0346b == AbstractC0344c.EnumC0346b.ON_START) {
                this.f115c = OnBackPressedDispatcher.this.m30372c(this.f114b);
            } else if (enumC0346b != AbstractC0344c.EnumC0346b.ON_STOP) {
                if (enumC0346b == AbstractC0344c.EnumC0346b.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC3057td interfaceC3057td = this.f115c;
                if (interfaceC3057td != null) {
                    interfaceC3057td.cancel();
                }
            }
        }

        @Override // com.daaw.InterfaceC3057td
        public void cancel() {
            this.f113a.mo29046c(this);
            this.f114b.m5813e(this);
            InterfaceC3057td interfaceC3057td = this.f115c;
            if (interfaceC3057td != null) {
                interfaceC3057td.cancel();
                this.f115c = null;
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    /* loaded from: classes.dex */
    public class C0045a implements OnBackInvokedCallback {
        public C0045a() {
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$b */
    /* loaded from: classes.dex */
    public static class C0046b {
        /* renamed from: a */
        public static void m30366a(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, OnBackInvokedCallback onBackInvokedCallback) {
            onBackInvokedDispatcher.registerOnBackInvokedCallback(i, onBackInvokedCallback);
        }

        /* renamed from: b */
        public static void m30365b(OnBackInvokedDispatcher onBackInvokedDispatcher, OnBackInvokedCallback onBackInvokedCallback) {
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$c */
    /* loaded from: classes.dex */
    public class C0047c implements InterfaceC3057td {

        /* renamed from: a */
        public final wt0 f118a;

        public C0047c(wt0 wt0Var) {
            this.f118a = wt0Var;
        }

        @Override // com.daaw.InterfaceC3057td
        public void cancel() {
            OnBackPressedDispatcher.this.f108b.remove(this.f118a);
            this.f118a.m5813e(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f118a.m5811g(null);
                OnBackPressedDispatcher.this.m30367h();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f107a = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.f109c = new InterfaceC3222uj() { // from class: com.daaw.xt0
                @Override // com.daaw.InterfaceC3222uj
                /* renamed from: a */
                public final void mo2971a(Object obj) {
                    OnBackPressedDispatcher.this.m30370e((Boolean) obj);
                }
            };
            this.f110d = new C0045a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m30370e(Boolean bool) {
        if (Build.VERSION.SDK_INT >= 33) {
            m30367h();
        }
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: b */
    public void m30373b(sj0 sj0Var, wt0 wt0Var) {
        AbstractC0344c mo2327a = sj0Var.mo2327a();
        if (mo2327a.mo29047b() == AbstractC0344c.EnumC0347c.DESTROYED) {
            return;
        }
        wt0Var.m5817a(new LifecycleOnBackPressedCancellable(mo2327a, wt0Var));
        if (Build.VERSION.SDK_INT >= 33) {
            m30367h();
            wt0Var.m5811g(this.f109c);
        }
    }

    /* renamed from: c */
    public InterfaceC3057td m30372c(wt0 wt0Var) {
        this.f108b.add(wt0Var);
        C0047c c0047c = new C0047c(wt0Var);
        wt0Var.m5817a(c0047c);
        if (Build.VERSION.SDK_INT >= 33) {
            m30367h();
            wt0Var.m5811g(this.f109c);
        }
        return c0047c;
    }

    /* renamed from: d */
    public boolean m30371d() {
        Iterator<wt0> descendingIterator = this.f108b.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().m5815c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void m30369f() {
        Iterator<wt0> descendingIterator = this.f108b.descendingIterator();
        while (descendingIterator.hasNext()) {
            wt0 next = descendingIterator.next();
            if (next.m5815c()) {
                next.mo5816b();
                return;
            }
        }
        Runnable runnable = this.f107a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: g */
    public void m30368g(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.f111e = onBackInvokedDispatcher;
        m30367h();
    }

    /* renamed from: h */
    public void m30367h() {
        boolean z;
        boolean m30371d = m30371d();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f111e;
        if (onBackInvokedDispatcher != null) {
            if (m30371d && !this.f112f) {
                C0046b.m30366a(onBackInvokedDispatcher, 1000000, this.f110d);
                z = true;
            } else if (m30371d || !this.f112f) {
                return;
            } else {
                C0046b.m30365b(onBackInvokedDispatcher, this.f110d);
                z = false;
            }
            this.f112f = z;
        }
    }
}
