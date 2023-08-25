package com.daaw;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.InputStream;
/* loaded from: classes.dex */
public class og1 extends d10<InputStream> {

    /* loaded from: classes.dex */
    public static class a implements nq0<File, InputStream> {
        @Override // com.daaw.nq0
        public mq0<File, InputStream> a(Context context, d60 d60Var) {
            return new og1(d60Var.a(Uri.class, InputStream.class));
        }

        @Override // com.daaw.nq0
        public void b() {
        }
    }

    public og1(mq0<Uri, InputStream> mq0Var) {
        super(mq0Var);
    }
}
