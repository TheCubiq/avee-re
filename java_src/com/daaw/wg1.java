package com.daaw;

import android.content.Context;
import java.io.InputStream;
import java.net.URL;
/* loaded from: classes.dex */
public class wg1 extends jq1<InputStream> {

    /* renamed from: com.daaw.wg1$a */
    /* loaded from: classes.dex */
    public static class C3438a implements nq0<URL, InputStream> {
        @Override // com.daaw.nq0
        /* renamed from: a */
        public mq0<URL, InputStream> mo3945a(Context context, d60 d60Var) {
            return new wg1(d60Var.m24637a(o70.class, InputStream.class));
        }

        @Override // com.daaw.nq0
        /* renamed from: b */
        public void mo3944b() {
        }
    }

    public wg1(mq0<o70, InputStream> mq0Var) {
        super(mq0Var);
    }
}
