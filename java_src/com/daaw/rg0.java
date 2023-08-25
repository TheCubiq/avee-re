package com.daaw;

import android.content.Context;
import com.daaw.zt;
import java.io.File;
/* loaded from: classes.dex */
public final class rg0 extends zt {

    /* loaded from: classes.dex */
    public class a implements zt.a {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;

        public a(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // com.daaw.zt.a
        public File a() {
            File cacheDir = this.a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.b != null ? new File(cacheDir, this.b) : cacheDir;
        }
    }

    public rg0(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public rg0(Context context, String str, int i) {
        super(new a(context, str), i);
    }
}
