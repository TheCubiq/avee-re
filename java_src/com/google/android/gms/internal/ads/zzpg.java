package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzpg implements com.google.android.gms.ads.internal.gmsg.zzv<Object> {
    private final /* synthetic */ zzacm zzbji;
    final /* synthetic */ zzpf zzbjj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpg(zzpf zzpfVar, zzacm zzacmVar) {
        this.zzbjj = zzpfVar;
        this.zzbji = zzacmVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final void zza(Object obj, final Map<String, String> map) {
        WeakReference weakReference;
        weakReference = this.zzbjj.zzbjg;
        zzaqw zzaqwVar = (zzaqw) weakReference.get();
        if (zzaqwVar == null) {
            this.zzbji.zzb("/loadHtml", this);
            return;
        }
        zzasc zzuf = zzaqwVar.zzuf();
        final zzacm zzacmVar = this.zzbji;
        zzuf.zza(new zzasd(this, map, zzacmVar) { // from class: com.google.android.gms.internal.ads.zzph
            private final zzpg zzbjk;
            private final Map zzbjl;
            private final zzacm zzbjm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbjk = this;
                this.zzbjl = map;
                this.zzbjm = zzacmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzasd
            public final void zze(boolean z) {
                String str;
                zzpg zzpgVar = this.zzbjk;
                Map map2 = this.zzbjl;
                zzacm zzacmVar2 = this.zzbjm;
                zzpgVar.zzbjj.zzbjh = (String) map2.get(TtmlNode.ATTR_ID);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("messageType", "htmlLoaded");
                    str = zzpgVar.zzbjj.zzbjh;
                    jSONObject.put(TtmlNode.ATTR_ID, str);
                    zzacmVar2.zza("sendMessageToNativeJs", jSONObject);
                } catch (JSONException e) {
                    zzakb.zzb("Unable to dispatch sendMessageToNativeJs event", e);
                }
            }
        });
        String str = map.get("overlayHtml");
        String str2 = map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            zzaqwVar.loadData(str, "text/html", "UTF-8");
        } else {
            zzaqwVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        }
    }
}
