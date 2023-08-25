package com.daaw;

import android.content.Context;
import java.io.InputStream;
import java.net.URL;
/* loaded from: classes.dex */
public class wg1 extends jq1<InputStream> {

    /* loaded from: classes.dex */
    public static class a implements nq0<URL, InputStream> {
        @Override // com.daaw.nq0
        public mq0<URL, InputStream> a(Context context, d60 d60Var) {
            return new wg1(d60Var.a(o70.class, InputStream.class));
        }

        @Override // com.daaw.nq0
        public void b() {
        }
    }

    public wg1(mq0<o70, InputStream> mq0Var) {
        super(mq0Var);
    }
}
