package com.daaw;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
/* loaded from: classes.dex */
public class tg1 extends yg1<InputStream> {

    /* loaded from: classes.dex */
    public static class a implements nq0<String, InputStream> {
        @Override // com.daaw.nq0
        public mq0<String, InputStream> a(Context context, d60 d60Var) {
            return new tg1(d60Var.a(Uri.class, InputStream.class));
        }

        @Override // com.daaw.nq0
        public void b() {
        }
    }

    public tg1(mq0<Uri, InputStream> mq0Var) {
        super(mq0Var);
    }
}
