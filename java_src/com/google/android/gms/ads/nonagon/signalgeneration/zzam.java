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

    /* renamed from: a */
    public final Executor f36523a;

    /* renamed from: b */
    public final ij5 f36524b;

    public zzam(Executor executor, ij5 ij5Var) {
        this.f36523a = executor;
        this.f36524b = ij5Var;
    }

    @Override // com.daaw.w57
    public final /* bridge */ /* synthetic */ f77 zza(Object obj) {
        final zzccb zzccbVar = (zzccb) obj;
        return s67.m10629n(this.f36524b.m19746b(zzccbVar), new w57() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzal
            @Override // com.daaw.w57
            public final f77 zza(Object obj2) {
                zzccb zzccbVar2 = zzccb.this;
                zzao zzaoVar = new zzao(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    zzaoVar.zzb = zzay.zzb().m24818n(zzccbVar2.f36964p).toString();
                } catch (JSONException unused) {
                    zzaoVar.zzb = "{}";
                }
                return s67.m10634i(zzaoVar);
            }
        }, this.f36523a);
    }
}
