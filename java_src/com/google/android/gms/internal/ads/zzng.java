package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzng {
    private final Collection<zzna<?>> zzats = new ArrayList();
    private final Collection<zzna<String>> zzatt = new ArrayList();
    private final Collection<zzna<String>> zzatu = new ArrayList();

    public final void zza(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzna<?> zznaVar : this.zzats) {
            if (zznaVar.getSource() == 1) {
                zznaVar.zza(editor, (SharedPreferences.Editor) zznaVar.zzb(jSONObject));
            }
        }
    }

    public final void zza(zzna zznaVar) {
        this.zzats.add(zznaVar);
    }

    public final void zzb(zzna<String> zznaVar) {
        this.zzatt.add(zznaVar);
    }

    public final void zzc(zzna<String> zznaVar) {
        this.zzatu.add(zznaVar);
    }

    public final List<String> zzjb() {
        ArrayList arrayList = new ArrayList();
        for (zzna<String> zznaVar : this.zzatt) {
            String str = (String) zzkb.zzik().zzd(zznaVar);
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final List<String> zzjc() {
        List<String> zzjb = zzjb();
        for (zzna<String> zznaVar : this.zzatu) {
            String str = (String) zzkb.zzik().zzd(zznaVar);
            if (str != null) {
                zzjb.add(str);
            }
        }
        return zzjb;
    }
}
