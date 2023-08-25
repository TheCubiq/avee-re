package androidx.media;

import android.media.AudioAttributes;
import com.daaw.is1;
/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(is1 is1Var) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f1792a = (AudioAttributes) is1Var.m19453r(audioAttributesImplApi21.f1792a, 1);
        audioAttributesImplApi21.f1793b = is1Var.m19454p(audioAttributesImplApi21.f1793b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, is1 is1Var) {
        is1Var.m19449x(false, false);
        is1Var.m19468H(audioAttributesImplApi21.f1792a, 1);
        is1Var.m19469F(audioAttributesImplApi21.f1793b, 2);
    }
}
