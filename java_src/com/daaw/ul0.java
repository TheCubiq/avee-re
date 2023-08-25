package com.daaw;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class ul0 implements InterfaceC0832bc {

    /* renamed from: k */
    public static final Bitmap.Config f29158k = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final xl0 f29159a;

    /* renamed from: b */
    public final Set<Bitmap.Config> f29160b;

    /* renamed from: c */
    public final int f29161c;

    /* renamed from: d */
    public final InterfaceC3236b f29162d;

    /* renamed from: e */
    public int f29163e;

    /* renamed from: f */
    public int f29164f;

    /* renamed from: g */
    public int f29165g;

    /* renamed from: h */
    public int f29166h;

    /* renamed from: i */
    public int f29167i;

    /* renamed from: j */
    public int f29168j;

    /* renamed from: com.daaw.ul0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3236b {
        /* renamed from: a */
        void mo8060a(Bitmap bitmap);

        /* renamed from: b */
        void mo8059b(Bitmap bitmap);
    }

    /* renamed from: com.daaw.ul0$c */
    /* loaded from: classes.dex */
    public static class C3237c implements InterfaceC3236b {
        public C3237c() {
        }

        @Override // com.daaw.ul0.InterfaceC3236b
        /* renamed from: a */
        public void mo8060a(Bitmap bitmap) {
        }

        @Override // com.daaw.ul0.InterfaceC3236b
        /* renamed from: b */
        public void mo8059b(Bitmap bitmap) {
        }
    }

    public ul0(int i) {
        this(i, m8062j(), m8063i());
    }

    public ul0(int i, xl0 xl0Var, Set<Bitmap.Config> set) {
        this.f29161c = i;
        this.f29163e = i;
        this.f29159a = xl0Var;
        this.f29160b = set;
        this.f29162d = new C3237c();
    }

    /* renamed from: i */
    public static Set<Bitmap.Config> m8063i() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: j */
    public static xl0 m8062j() {
        return new rd1();
    }

    @Override // com.daaw.InterfaceC0832bc
    /* renamed from: a */
    public synchronized boolean mo8071a(Bitmap bitmap) {
        if (bitmap != null) {
            if (bitmap.isMutable() && this.f29159a.mo5012e(bitmap) <= this.f29163e && this.f29160b.contains(bitmap.getConfig())) {
                int mo5012e = this.f29159a.mo5012e(bitmap);
                this.f29159a.mo5016a(bitmap);
                this.f29162d.mo8059b(bitmap);
                this.f29167i++;
                this.f29164f += mo5012e;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Put bitmap in pool=");
                    sb.append(this.f29159a.mo5011f(bitmap));
                }
                m8066f();
                m8064h();
                return true;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Reject bitmap from pool, bitmap: ");
                sb2.append(this.f29159a.mo5011f(bitmap));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f29160b.contains(bitmap.getConfig()));
            }
            return false;
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    @Override // com.daaw.InterfaceC0832bc
    /* renamed from: b */
    public synchronized Bitmap mo8070b(int i, int i2, Bitmap.Config config) {
        Bitmap mo8067e;
        mo8067e = mo8067e(i, i2, config);
        if (mo8067e != null) {
            mo8067e.eraseColor(0);
        }
        return mo8067e;
    }

    @Override // com.daaw.InterfaceC0832bc
    @SuppressLint({"InlinedApi"})
    /* renamed from: c */
    public void mo8069c(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("trimMemory, level=");
            sb.append(i);
        }
        if (i >= 60) {
            mo8068d();
        } else if (i >= 40) {
            m8061k(this.f29163e / 2);
        }
    }

    @Override // com.daaw.InterfaceC0832bc
    /* renamed from: d */
    public void mo8068d() {
        m8061k(0);
    }

    @Override // com.daaw.InterfaceC0832bc
    @TargetApi(12)
    /* renamed from: e */
    public synchronized Bitmap mo8067e(int i, int i2, Bitmap.Config config) {
        Bitmap mo5015b;
        mo5015b = this.f29159a.mo5015b(i, i2, config != null ? config : f29158k);
        if (mo5015b == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                sb.append(this.f29159a.mo5013d(i, i2, config));
            }
            this.f29166h++;
        } else {
            this.f29165g++;
            this.f29164f -= this.f29159a.mo5012e(mo5015b);
            this.f29162d.mo8060a(mo5015b);
            mo5015b.setHasAlpha(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            sb2.append(this.f29159a.mo5013d(i, i2, config));
        }
        m8066f();
        return mo5015b;
    }

    /* renamed from: f */
    public final void m8066f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m8065g();
        }
    }

    /* renamed from: g */
    public final void m8065g() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.f29165g);
        sb.append(", misses=");
        sb.append(this.f29166h);
        sb.append(", puts=");
        sb.append(this.f29167i);
        sb.append(", evictions=");
        sb.append(this.f29168j);
        sb.append(", currentSize=");
        sb.append(this.f29164f);
        sb.append(", maxSize=");
        sb.append(this.f29163e);
        sb.append("\nStrategy=");
        sb.append(this.f29159a);
    }

    /* renamed from: h */
    public final void m8064h() {
        m8061k(this.f29163e);
    }

    /* renamed from: k */
    public final synchronized void m8061k(int i) {
        while (this.f29164f > i) {
            Bitmap mo5014c = this.f29159a.mo5014c();
            if (mo5014c == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    m8065g();
                }
                this.f29164f = 0;
                return;
            }
            this.f29162d.mo8060a(mo5014c);
            this.f29164f -= this.f29159a.mo5012e(mo5014c);
            mo5014c.recycle();
            this.f29168j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Evicting bitmap=");
                sb.append(this.f29159a.mo5011f(mo5014c));
            }
            m8066f();
        }
    }
}
