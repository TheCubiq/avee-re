package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
/* loaded from: classes.dex */
public class y00 extends d10<ParcelFileDescriptor> {

    /* renamed from: com.daaw.y00$a */
    /* loaded from: classes.dex */
    public static class C3659a implements nq0<File, ParcelFileDescriptor> {
        @Override // com.daaw.nq0
        /* renamed from: a */
        public mq0<File, ParcelFileDescriptor> mo3945a(Context context, d60 d60Var) {
            return new y00(d60Var.m24637a(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // com.daaw.nq0
        /* renamed from: b */
        public void mo3944b() {
        }
    }

    public y00(mq0<Uri, ParcelFileDescriptor> mq0Var) {
        super(mq0Var);
    }
}
