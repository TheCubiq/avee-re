package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class qk0<T> implements ip<T> {
    public final Uri a;
    public final Context b;
    public T c;

    public qk0(Context context, Uri uri) {
        this.b = context.getApplicationContext();
        this.a = uri;
    }

    @Override // com.daaw.ip
    public final T a(dz0 dz0Var) {
        T d = d(this.a, this.b.getContentResolver());
        this.c = d;
        return d;
    }

    @Override // com.daaw.ip
    public void b() {
        T t = this.c;
        if (t != null) {
            try {
                c(t);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t);

    @Override // com.daaw.ip
    public void cancel() {
    }

    public abstract T d(Uri uri, ContentResolver contentResolver);

    @Override // com.daaw.ip
    public String getId() {
        return this.a.toString();
    }
}
