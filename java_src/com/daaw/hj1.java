package com.daaw;

import android.annotation.TargetApi;
import android.view.View;
import com.daaw.gj1;
import org.conscrypt.NativeConstants;
@TargetApi(11)
/* loaded from: classes.dex */
public class hj1 extends gj1 {
    public int e;
    public int f;
    public int g;
    public boolean h;
    public View.OnSystemUiVisibilityChangeListener i;

    /* loaded from: classes.dex */
    public class a implements View.OnSystemUiVisibilityChangeListener {
        public a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            gj1.b bVar;
            boolean z;
            if ((i & hj1.this.g) != 0) {
                bVar = hj1.this.c;
                z = false;
            } else {
                hj1 hj1Var = hj1.this;
                hj1Var.a.setSystemUiVisibility(hj1Var.e);
                bVar = hj1.this.c;
                z = true;
            }
            bVar.a(z);
            hj1.this.h = z;
        }
    }

    public hj1(View view, int i) {
        super(view, i);
        this.h = true;
        this.i = new a();
        this.e = 0;
        this.f = 1;
        this.g = 1;
        int i2 = this.b;
        if ((i2 & 2) != 0) {
            this.e = NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
            this.f = 1028;
            this.g = 4;
        }
        if ((i2 & 6) != 0) {
            this.e |= 512;
            this.f |= 514;
            this.g |= 2;
        }
    }

    @Override // com.daaw.gj1
    public void a() {
        this.a.setSystemUiVisibility(this.f);
    }

    @Override // com.daaw.gj1
    public void c() {
        this.a.setOnSystemUiVisibilityChangeListener(this.i);
    }

    @Override // com.daaw.gj1
    public void d() {
        this.a.setSystemUiVisibility(this.e);
    }
}
