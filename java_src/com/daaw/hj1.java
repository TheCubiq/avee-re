package com.daaw;

import android.annotation.TargetApi;
import android.view.View;
import com.daaw.gj1;
import org.conscrypt.NativeConstants;
@TargetApi(11)
/* loaded from: classes.dex */
public class hj1 extends gj1 {

    /* renamed from: e */
    public int f12598e;

    /* renamed from: f */
    public int f12599f;

    /* renamed from: g */
    public int f12600g;

    /* renamed from: h */
    public boolean f12601h;

    /* renamed from: i */
    public View.OnSystemUiVisibilityChangeListener f12602i;

    /* renamed from: com.daaw.hj1$a */
    /* loaded from: classes.dex */
    public class View$OnSystemUiVisibilityChangeListenerC1576a implements View.OnSystemUiVisibilityChangeListener {
        public View$OnSystemUiVisibilityChangeListenerC1576a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            gj1.InterfaceC1427b interfaceC1427b;
            boolean z;
            if ((i & hj1.this.f12600g) != 0) {
                interfaceC1427b = hj1.this.f11361c;
                z = false;
            } else {
                hj1 hj1Var = hj1.this;
                hj1Var.f11359a.setSystemUiVisibility(hj1Var.f12598e);
                interfaceC1427b = hj1.this.f11361c;
                z = true;
            }
            interfaceC1427b.mo14171a(z);
            hj1.this.f12601h = z;
        }
    }

    public hj1(View view, int i) {
        super(view, i);
        this.f12601h = true;
        this.f12602i = new View$OnSystemUiVisibilityChangeListenerC1576a();
        this.f12598e = 0;
        this.f12599f = 1;
        this.f12600g = 1;
        int i2 = this.f11360b;
        if ((i2 & 2) != 0) {
            this.f12598e = NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
            this.f12599f = 1028;
            this.f12600g = 4;
        }
        if ((i2 & 6) != 0) {
            this.f12598e |= 512;
            this.f12599f |= 514;
            this.f12600g |= 2;
        }
    }

    @Override // com.daaw.gj1
    /* renamed from: a */
    public void mo19755a() {
        this.f11359a.setSystemUiVisibility(this.f12599f);
    }

    @Override // com.daaw.gj1
    /* renamed from: c */
    public void mo19754c() {
        this.f11359a.setOnSystemUiVisibilityChangeListener(this.f12602i);
    }

    @Override // com.daaw.gj1
    /* renamed from: d */
    public void mo19753d() {
        this.f11359a.setSystemUiVisibility(this.f12598e);
    }
}
