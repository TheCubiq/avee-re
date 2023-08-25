package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
/* loaded from: classes.dex */
public class a10 extends f51<ParcelFileDescriptor> {

    /* renamed from: com.daaw.a10$a */
    /* loaded from: classes.dex */
    public static class C0565a implements nq0<Integer, ParcelFileDescriptor> {
        @Override // com.daaw.nq0
        /* renamed from: a */
        public mq0<Integer, ParcelFileDescriptor> mo3945a(Context context, d60 d60Var) {
            return new a10(context, d60Var.m24637a(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // com.daaw.nq0
        /* renamed from: b */
        public void mo3944b() {
        }
    }

    public a10(Context context, mq0<Uri, ParcelFileDescriptor> mq0Var) {
        super(context, mq0Var);
    }
}
