package androidx.multidex;

import android.app.Application;
import android.content.Context;
import com.daaw.cr0;
/* loaded from: classes.dex */
public class MultiDexApplication extends Application {
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        cr0.m25085l(this);
    }
}
