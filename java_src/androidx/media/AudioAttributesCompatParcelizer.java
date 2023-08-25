package androidx.media;

import com.daaw.is1;
/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(is1 is1Var) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.a = (AudioAttributesImpl) is1Var.v(audioAttributesCompat.a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, is1 is1Var) {
        is1Var.x(false, false);
        is1Var.M(audioAttributesCompat.a, 1);
    }
}
