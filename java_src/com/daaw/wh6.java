package com.daaw;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbu;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class wh6 {

    /* renamed from: a */
    public final List f31251a;

    /* renamed from: b */
    public final String f31252b;

    /* renamed from: c */
    public final int f31253c;

    /* renamed from: d */
    public final String f31254d;

    /* renamed from: e */
    public final int f31255e;

    /* renamed from: f */
    public final long f31256f;

    /* renamed from: g */
    public final boolean f31257g;

    /* renamed from: h */
    public final String f31258h;

    /* renamed from: i */
    public final vh6 f31259i;

    /* renamed from: j */
    public final Bundle f31260j;

    /* renamed from: k */
    public final String f31261k;

    /* renamed from: l */
    public final String f31262l;

    public wh6(JsonReader jsonReader) {
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        int i = 0;
        String str = "";
        String str2 = str;
        String str3 = str2;
        long j = 0;
        vh6 vh6Var = null;
        boolean z = false;
        String str4 = str3;
        String str5 = str4;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = zzbu.zzd(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str4 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str5 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j = jsonReader.nextLong();
            } else {
                String str6 = str3;
                if (((Boolean) zzba.zzc().m23658b(g93.f10882x7)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    vh6Var = new vh6(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str = jsonReader.nextString();
                } else if ("response_info_extras".equals(nextName)) {
                    if (((Boolean) zzba.zzc().m23658b(g93.f10749l6)).booleanValue()) {
                        try {
                            Bundle zza = zzbu.zza(zzbu.zzh(jsonReader));
                            if (zza != null) {
                                bundle = zza;
                            }
                        } catch (IOException | JSONException unused) {
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    jsonReader.skipValue();
                } else {
                    if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) zzba.zzc().m23658b(g93.f10806q8)).booleanValue()) {
                            str3 = jsonReader.nextString();
                        }
                    } else if ("adRequestUrl".equals(nextName)) {
                        if (((Boolean) zzba.zzc().m23658b(g93.f10806q8)).booleanValue()) {
                            str2 = jsonReader.nextString();
                        }
                    }
                    jsonReader.skipValue();
                }
                str3 = str6;
            }
        }
        jsonReader.endObject();
        this.f31251a = emptyList;
        this.f31253c = i;
        this.f31252b = str4;
        this.f31254d = str5;
        this.f31255e = i2;
        this.f31256f = j;
        this.f31259i = vh6Var;
        this.f31257g = z;
        this.f31258h = str;
        this.f31260j = bundle;
        this.f31261k = str2;
        this.f31262l = str3;
    }
}
