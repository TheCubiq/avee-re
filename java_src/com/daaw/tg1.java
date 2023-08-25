package com.daaw;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
/* loaded from: classes.dex */
public class tg1 extends yg1<InputStream> {

    /* renamed from: com.daaw.tg1$a */
    /* loaded from: classes.dex */
    public static class C3074a implements nq0<String, InputStream> {
        @Override // com.daaw.nq0
        /* renamed from: a */
        public mq0<String, InputStream> mo3945a(Context context, d60 d60Var) {
            return new tg1(d60Var.m24637a(Uri.class, InputStream.class));
        }

        @Override // com.daaw.nq0
        /* renamed from: b */
        public void mo3944b() {
        }
    }

    public tg1(mq0<Uri, InputStream> mq0Var) {
        super(mq0Var);
    }
}
