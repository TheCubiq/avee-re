package com.daaw;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.InputStream;
/* loaded from: classes.dex */
public class og1 extends d10<InputStream> {

    /* renamed from: com.daaw.og1$a */
    /* loaded from: classes.dex */
    public static class C2439a implements nq0<File, InputStream> {
        @Override // com.daaw.nq0
        /* renamed from: a */
        public mq0<File, InputStream> mo3945a(Context context, d60 d60Var) {
            return new og1(d60Var.m24637a(Uri.class, InputStream.class));
        }

        @Override // com.daaw.nq0
        /* renamed from: b */
        public void mo3944b() {
        }
    }

    public og1(mq0<Uri, InputStream> mq0Var) {
        super(mq0Var);
    }
}
