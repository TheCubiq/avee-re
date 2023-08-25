package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
/* loaded from: classes.dex */
public class c10 extends hq1<ParcelFileDescriptor> {

    /* renamed from: com.daaw.c10$a */
    /* loaded from: classes.dex */
    public static class C0910a implements nq0<Uri, ParcelFileDescriptor> {
        @Override // com.daaw.nq0
        /* renamed from: a */
        public mq0<Uri, ParcelFileDescriptor> mo3945a(Context context, d60 d60Var) {
            return new c10(context, d60Var.m24637a(o70.class, ParcelFileDescriptor.class));
        }

        @Override // com.daaw.nq0
        /* renamed from: b */
        public void mo3944b() {
        }
    }

    public c10(Context context, mq0<o70, ParcelFileDescriptor> mq0Var) {
        super(context, mq0Var);
    }

    @Override // com.daaw.hq1
    /* renamed from: b */
    public InterfaceC1744ip<ParcelFileDescriptor> mo7190b(Context context, String str) {
        return new v00(context.getApplicationContext().getAssets(), str);
    }

    @Override // com.daaw.hq1
    /* renamed from: c */
    public InterfaceC1744ip<ParcelFileDescriptor> mo7189c(Context context, Uri uri) {
        return new z00(context, uri);
    }
}
