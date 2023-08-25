package com.daaw;

import android.content.Context;
import com.daaw.uw1;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ix1 {
    public static ix1 b = new ix1();
    public List<Object> a = new ArrayList();

    /* loaded from: classes.dex */
    public class a implements uw1.a<Context, i2, af0, Integer, Integer> {
        public a() {
        }

        @Override // com.daaw.uw1.a
        /* renamed from: b */
        public void a(Context context, i2 i2Var, af0 af0Var, Integer num, Integer num2) {
            new g2().v(false, i2Var.a, i2Var.b, i2Var.c, af0Var, num.intValue(), num2.intValue(), 0, -1, true, null, null);
        }
    }

    public ix1() {
        wo0.a.b(new a(), this.a);
    }

    public static ix1 a() {
        return b;
    }
}
