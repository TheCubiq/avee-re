package com.daaw;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zh8 {

    /* renamed from: a */
    public static final AudioAttributes f35106a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    /* renamed from: a */
    public static int m2285a(int i, int i2) {
        for (int i3 = 8; i3 > 0; i3--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(it5.m19412T(i3)).build(), f35106a)) {
                return i3;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static int[] m2284b() {
        b27 b27Var;
        v17 m4266o = y17.m4266o();
        b27Var = bi8.f4843e;
        c47 it = b27Var.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f35106a)) {
                m4266o.m7548f(Integer.valueOf(intValue));
            }
        }
        m4266o.m7548f(2);
        Object[] array = m4266o.m7546h().toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            Objects.requireNonNull(obj);
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
