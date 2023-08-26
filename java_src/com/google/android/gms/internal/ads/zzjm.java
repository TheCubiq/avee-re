package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
@zzadh
/* loaded from: classes2.dex */
public final class zzjm {
    public static final zzjm zzara = new zzjm();

    protected zzjm() {
    }

    public static zzjj zza(Context context, zzlw zzlwVar) {
        Context context2;
        List list;
        String str;
        Date birthday = zzlwVar.getBirthday();
        long time = birthday != null ? birthday.getTime() : -1L;
        String contentUrl = zzlwVar.getContentUrl();
        int gender = zzlwVar.getGender();
        Set<String> keywords = zzlwVar.getKeywords();
        if (keywords.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(keywords));
            context2 = context;
        }
        boolean isTestDevice = zzlwVar.isTestDevice(context2);
        int zzit = zzlwVar.zzit();
        Location location = zzlwVar.getLocation();
        Bundle networkExtrasBundle = zzlwVar.getNetworkExtrasBundle(AdMobAdapter.class);
        boolean manualImpressionsEnabled = zzlwVar.getManualImpressionsEnabled();
        String publisherProvidedId = zzlwVar.getPublisherProvidedId();
        SearchAdRequest zziq = zzlwVar.zziq();
        zzmq zzmqVar = zziq != null ? new zzmq(zziq) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzkb.zzif();
            str = zzamu.zza(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        return new zzjj(7, time, networkExtrasBundle, gender, list, isTestDevice, zzit, manualImpressionsEnabled, publisherProvidedId, zzmqVar, location, contentUrl, zzlwVar.zzis(), zzlwVar.getCustomTargeting(), Collections.unmodifiableList(new ArrayList(zzlwVar.zziu())), zzlwVar.zzip(), str, zzlwVar.isDesignedForFamilies());
    }
}
