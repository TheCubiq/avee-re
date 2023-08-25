package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
/* loaded from: classes.dex */
public class f51<T> implements mq0<Integer, T> {

    /* renamed from: a */
    public final mq0<Uri, T> f9111a;

    /* renamed from: b */
    public final Resources f9112b;

    public f51(Context context, mq0<Uri, T> mq0Var) {
        this(context.getResources(), mq0Var);
    }

    public f51(Resources resources, mq0<Uri, T> mq0Var) {
        this.f9112b = resources;
        this.f9111a = mq0Var;
    }

    @Override // com.daaw.mq0
    /* renamed from: b */
    public InterfaceC1744ip<T> mo3764a(Integer num, int i, int i2) {
        Uri uri;
        try {
            uri = Uri.parse("android.resource://" + this.f9112b.getResourcePackageName(num.intValue()) + '/' + this.f9112b.getResourceTypeName(num.intValue()) + '/' + this.f9112b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Received invalid resource id: ");
                sb.append(num);
            }
            uri = null;
        }
        if (uri != null) {
            return this.f9111a.mo3764a(uri, i, i2);
        }
        return null;
    }
}
