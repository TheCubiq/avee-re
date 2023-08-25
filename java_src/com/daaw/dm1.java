package com.daaw;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.C0082e;
import androidx.appcompat.view.menu.InterfaceC0091i;
import androidx.appcompat.widget.C0171d;
import androidx.appcompat.widget.Toolbar;
import com.daaw.AbstractC1643i0;
import com.daaw.LayoutInflater$Factory2C0573a4;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class dm1 extends AbstractC1643i0 {

    /* renamed from: a */
    public final InterfaceC1745iq f7463a;

    /* renamed from: b */
    public final Window.Callback f7464b;

    /* renamed from: c */
    public final LayoutInflater$Factory2C0573a4.InterfaceC0582h f7465c;

    /* renamed from: d */
    public boolean f7466d;

    /* renamed from: e */
    public boolean f7467e;

    /* renamed from: f */
    public boolean f7468f;

    /* renamed from: g */
    public ArrayList<AbstractC1643i0.InterfaceC1645b> f7469g = new ArrayList<>();

    /* renamed from: h */
    public final Runnable f7470h = new RunnableC1108a();

    /* renamed from: i */
    public final Toolbar.InterfaceC0160f f7471i;

    /* renamed from: com.daaw.dm1$a */
    /* loaded from: classes.dex */
    public class RunnableC1108a implements Runnable {
        public RunnableC1108a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            dm1.this.m24220B();
        }
    }

    /* renamed from: com.daaw.dm1$b */
    /* loaded from: classes.dex */
    public class C1109b implements Toolbar.InterfaceC0160f {
        public C1109b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.InterfaceC0160f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return dm1.this.f7464b.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: com.daaw.dm1$c */
    /* loaded from: classes.dex */
    public final class C1110c implements InterfaceC0091i.InterfaceC0092a {

        /* renamed from: p */
        public boolean f7474p;

        public C1110c() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091i.InterfaceC0092a
        /* renamed from: b */
        public void mo24218b(C0082e c0082e, boolean z) {
            if (this.f7474p) {
                return;
            }
            this.f7474p = true;
            dm1.this.f7463a.mo19521h();
            dm1.this.f7464b.onPanelClosed(p21.f22364Z0, c0082e);
            this.f7474p = false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091i.InterfaceC0092a
        /* renamed from: c */
        public boolean mo24217c(C0082e c0082e) {
            dm1.this.f7464b.onMenuOpened(p21.f22364Z0, c0082e);
            return true;
        }
    }

    /* renamed from: com.daaw.dm1$d */
    /* loaded from: classes.dex */
    public final class C1111d implements C0082e.InterfaceC0083a {
        public C1111d() {
        }

        @Override // androidx.appcompat.view.menu.C0082e.InterfaceC0083a
        /* renamed from: a */
        public boolean mo330a(C0082e c0082e, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0082e.InterfaceC0083a
        /* renamed from: b */
        public void mo329b(C0082e c0082e) {
            if (dm1.this.f7463a.mo19527b()) {
                dm1.this.f7464b.onPanelClosed(p21.f22364Z0, c0082e);
            } else if (dm1.this.f7464b.onPreparePanel(0, null, c0082e)) {
                dm1.this.f7464b.onMenuOpened(p21.f22364Z0, c0082e);
            }
        }
    }

    /* renamed from: com.daaw.dm1$e */
    /* loaded from: classes.dex */
    public class C1112e implements LayoutInflater$Factory2C0573a4.InterfaceC0582h {
        public C1112e() {
        }

        @Override // com.daaw.LayoutInflater$Factory2C0573a4.InterfaceC0582h
        /* renamed from: a */
        public boolean mo24216a(int i) {
            if (i == 0) {
                dm1 dm1Var = dm1.this;
                if (dm1Var.f7466d) {
                    return false;
                }
                dm1Var.f7463a.mo19526c();
                dm1.this.f7466d = true;
                return false;
            }
            return false;
        }

        @Override // com.daaw.LayoutInflater$Factory2C0573a4.InterfaceC0582h
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(dm1.this.f7463a.getContext());
            }
            return null;
        }
    }

    public dm1(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        C1109b c1109b = new C1109b();
        this.f7471i = c1109b;
        ty0.m8699f(toolbar);
        C0171d c0171d = new C0171d(toolbar, false);
        this.f7463a = c0171d;
        this.f7464b = (Window.Callback) ty0.m8699f(callback);
        c0171d.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(c1109b);
        c0171d.setWindowTitle(charSequence);
        this.f7465c = new C1112e();
    }

    /* renamed from: A */
    public final Menu m24221A() {
        if (!this.f7467e) {
            this.f7463a.mo19511r(new C1110c(), new C1111d());
            this.f7467e = true;
        }
        return this.f7463a.mo19515n();
    }

    /* renamed from: B */
    public void m24220B() {
        Menu m24221A = m24221A();
        C0082e c0082e = m24221A instanceof C0082e ? (C0082e) m24221A : null;
        if (c0082e != null) {
            c0082e.m30234h0();
        }
        try {
            m24221A.clear();
            if (!this.f7464b.onCreatePanelMenu(0, m24221A) || !this.f7464b.onPreparePanel(0, null, m24221A)) {
                m24221A.clear();
            }
        } finally {
            if (c0082e != null) {
                c0082e.m30235g0();
            }
        }
    }

    /* renamed from: C */
    public void m24219C(int i, int i2) {
        this.f7463a.mo19517l((i & i2) | ((i2 ^ (-1)) & this.f7463a.mo19507v()));
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: f */
    public boolean mo20284f() {
        return this.f7463a.mo19523f();
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: g */
    public boolean mo15698g() {
        if (this.f7463a.mo19518k()) {
            this.f7463a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: h */
    public void mo15697h(boolean z) {
        if (z == this.f7468f) {
            return;
        }
        this.f7468f = z;
        int size = this.f7469g.size();
        for (int i = 0; i < size; i++) {
            this.f7469g.get(i).m20279a(z);
        }
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: i */
    public int mo15696i() {
        return this.f7463a.mo19507v();
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: j */
    public Context mo15695j() {
        return this.f7463a.getContext();
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: k */
    public boolean mo20283k() {
        this.f7463a.mo19509t().removeCallbacks(this.f7470h);
        xs1.m4718j0(this.f7463a.mo19509t(), this.f7470h);
        return true;
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: l */
    public boolean mo15694l() {
        return this.f7463a.mo19519j() == 0;
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: m */
    public void mo15693m(Configuration configuration) {
        super.mo15693m(configuration);
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: n */
    public void mo20282n() {
        this.f7463a.mo19509t().removeCallbacks(this.f7470h);
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: o */
    public boolean mo15692o(int i, KeyEvent keyEvent) {
        Menu m24221A = m24221A();
        if (m24221A != null) {
            m24221A.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            return m24221A.performShortcut(i, keyEvent, 0);
        }
        return false;
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: p */
    public boolean mo20281p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo20280q();
        }
        return true;
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: q */
    public boolean mo20280q() {
        return this.f7463a.mo19522g();
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: r */
    public void mo15691r(boolean z) {
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: s */
    public void mo15690s(boolean z) {
        m24219C(z ? 4 : 0, 4);
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: t */
    public void mo15689t(boolean z) {
        m24219C(z ? 2 : 0, 2);
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: u */
    public void mo15688u(boolean z) {
        m24219C(z ? 8 : 0, 8);
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: v */
    public void mo15687v(boolean z) {
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: w */
    public void mo15686w(CharSequence charSequence) {
        this.f7463a.mo19516m(charSequence);
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: x */
    public void mo15685x(CharSequence charSequence) {
        this.f7463a.setTitle(charSequence);
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: y */
    public void mo15684y(CharSequence charSequence) {
        this.f7463a.setWindowTitle(charSequence);
    }
}
