package com.daaw;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
/* loaded from: classes.dex */
public class sg1 extends f51<InputStream> {

    /* loaded from: classes.dex */
    public static class a implements nq0<Integer, InputStream> {
        @Override // com.daaw.nq0
        public mq0<Integer, InputStream> a(Context context, d60 d60Var) {
            return new sg1(context, d60Var.a(Uri.class, InputStream.class));
        }

        @Override // com.daaw.nq0
        public void b() {
        }
    }

    public sg1(Context context, mq0<Uri, InputStream> mq0Var) {
        super(context, mq0Var);
    }
}
