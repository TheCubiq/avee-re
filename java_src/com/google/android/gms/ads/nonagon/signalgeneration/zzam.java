package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.daaw.f77;
import com.daaw.ij5;
import com.daaw.s67;
import com.daaw.w57;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzccb;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class zzam implements w57 {
    public final Executor a;
    public final ij5 b;

    public zzam(Executor executor, ij5 ij5Var) {
        this.a = executor;
        this.b = ij5Var;
    }

    @Override // com.daaw.w57
    public final /* bridge */ /* synthetic */ f77 zza(Object obj) {
        final zzccb zzccbVar = (zzccb) obj;
        return s67.n(this.b.b(zzccbVar), new w57() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzal
            @Override // com.daaw.w57
            public final f77 zza(Object obj2) {
                zzccb zzccbVar2 = zzccb.this;
                zzao zzaoVar = new zzao(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    zzaoVar.zzb = zzay.zzb().n(zzccbVar2.p).toString();
                } catch (JSONException unused) {
                    zzaoVar.zzb = "{}";
                }
                return s67.i(zzaoVar);
            }
        }, this.a);
    }
}
