package com.daaw;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
/* loaded from: classes.dex */
public class sg1 extends f51<InputStream> {

    /* renamed from: com.daaw.sg1$a */
    /* loaded from: classes.dex */
    public static class C2938a implements nq0<Integer, InputStream> {
        @Override // com.daaw.nq0
        /* renamed from: a */
        public mq0<Integer, InputStream> mo3945a(Context context, d60 d60Var) {
            return new sg1(context, d60Var.m24637a(Uri.class, InputStream.class));
        }

        @Override // com.daaw.nq0
        /* renamed from: b */
        public void mo3944b() {
        }
    }

    public sg1(Context context, mq0<Uri, InputStream> mq0Var) {
        super(context, mq0Var);
    }
}
