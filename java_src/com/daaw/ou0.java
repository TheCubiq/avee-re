package com.daaw;

import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import com.daaw.oy1;
/* loaded from: classes.dex */
public final class ou0 extends oy1 {

    /* renamed from: com.daaw.ou0$a */
    /* loaded from: classes.dex */
    public static final class C2482a extends oy1.AbstractC2494a<C2482a, ou0> {
        public C2482a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f22108c.f24627d = OverwritingInputMerger.class.getName();
        }

        @Override // com.daaw.oy1.AbstractC2494a
        /* renamed from: g */
        public ou0 mo13865c() {
            if (this.f22106a && Build.VERSION.SDK_INT >= 23 && this.f22108c.f24633j.m10316h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new ou0(this);
        }

        @Override // com.daaw.oy1.AbstractC2494a
        /* renamed from: h */
        public C2482a mo13864d() {
            return this;
        }
    }

    public ou0(C2482a c2482a) {
        super(c2482a.f22107b, c2482a.f22108c, c2482a.f22109d);
    }

    /* renamed from: d */
    public static ou0 m13932d(Class<? extends ListenableWorker> cls) {
        return new C2482a(cls).m13866b();
    }
}
