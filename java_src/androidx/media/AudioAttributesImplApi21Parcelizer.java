package androidx.media;

import android.media.AudioAttributes;
import com.daaw.is1;
/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(is1 is1Var) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) is1Var.r(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = is1Var.p(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, is1 is1Var) {
        is1Var.x(false, false);
        is1Var.H(audioAttributesImplApi21.a, 1);
        is1Var.F(audioAttributesImplApi21.b, 2);
    }
}
