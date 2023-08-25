package com.daaw;

import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import com.daaw.oy1;
/* loaded from: classes.dex */
public final class ou0 extends oy1 {

    /* loaded from: classes.dex */
    public static final class a extends oy1.a<a, ou0> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.c.d = OverwritingInputMerger.class.getName();
        }

        @Override // com.daaw.oy1.a
        /* renamed from: g */
        public ou0 c() {
            if (this.a && Build.VERSION.SDK_INT >= 23 && this.c.j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new ou0(this);
        }

        @Override // com.daaw.oy1.a
        /* renamed from: h */
        public a d() {
            return this;
        }
    }

    public ou0(a aVar) {
        super(aVar.b, aVar.c, aVar.d);
    }

    public static ou0 d(Class<? extends ListenableWorker> cls) {
        return new a(cls).b();
    }
}
