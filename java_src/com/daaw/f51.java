package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
/* loaded from: classes.dex */
public class f51<T> implements mq0<Integer, T> {
    public final mq0<Uri, T> a;
    public final Resources b;

    public f51(Context context, mq0<Uri, T> mq0Var) {
        this(context.getResources(), mq0Var);
    }

    public f51(Resources resources, mq0<Uri, T> mq0Var) {
        this.b = resources;
        this.a = mq0Var;
    }

    @Override // com.daaw.mq0
    /* renamed from: b */
    public ip<T> a(Integer num, int i, int i2) {
        Uri uri;
        try {
            uri = Uri.parse("android.resource://" + this.b.getResourcePackageName(num.intValue()) + '/' + this.b.getResourceTypeName(num.intValue()) + '/' + this.b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Received invalid resource id: ");
                sb.append(num);
            }
            uri = null;
        }
        if (uri != null) {
            return this.a.a(uri, i, i2);
        }
        return null;
    }
}
