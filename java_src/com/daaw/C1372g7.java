package com.daaw;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;
@TargetApi(21)
/* renamed from: com.daaw.g7 */
/* loaded from: classes.dex */
public final class C1372g7 {

    /* renamed from: c */
    public static final C1372g7 f10313c = new C1372g7(new int[]{2}, 2);

    /* renamed from: a */
    public final int[] f10314a;

    /* renamed from: b */
    public final int f10315b;

    public C1372g7(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f10314a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f10314a = new int[0];
        }
        this.f10315b = i;
    }

    /* renamed from: a */
    public static C1372g7 m21899a(Context context) {
        return m21898b(context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: b */
    public static C1372g7 m21898b(Intent intent) {
        return (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f10313c : new C1372g7(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
    }

    /* renamed from: c */
    public boolean m21897c(int i) {
        return Arrays.binarySearch(this.f10314a, i) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1372g7) {
            C1372g7 c1372g7 = (C1372g7) obj;
            return Arrays.equals(this.f10314a, c1372g7.f10314a) && this.f10315b == c1372g7.f10315b;
        }
        return false;
    }

    public int hashCode() {
        return this.f10315b + (Arrays.hashCode(this.f10314a) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f10315b + ", supportedEncodings=" + Arrays.toString(this.f10314a) + "]";
    }
}
