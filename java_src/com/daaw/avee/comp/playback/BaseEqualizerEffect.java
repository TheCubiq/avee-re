package com.daaw.avee.comp.playback;

import android.media.audiofx.AudioEffect;
import android.media.audiofx.Equalizer;
import android.media.audiofx.Virtualizer;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.tlog;
/* loaded from: classes.dex */
public abstract class BaseEqualizerEffect {
    private EqualizerDesc desc;
    private IEqualizerEffectListener equalizerEffectListener;
    private String name;
    private int lastKnownAudioSession = 0;
    private boolean shouldBeEnabled = false;
    private int audioSessionEqualizer = 0;
    private boolean equalizerHasControl = false;
    private int audioSessionVirtualizer = 0;
    private Equalizer equalizer = null;
    private Virtualizer virtualizer = null;

    /* loaded from: classes.dex */
    public static class EqualizerSettings {
        public float[] bandLevels;
        public boolean enabled;
        public int preset;
        public boolean usePreset;
        public float virtualizerStrength;
    }

    /* loaded from: classes.dex */
    public interface IEqualizerEffectListener {
        EqualizerSettings getEqualizerSettings(String str);

        boolean isEqualizerEnabled(String str);

        void onEqualizerDescChanged(EqualizerDesc equalizerDesc);
    }

    public BaseEqualizerEffect(IEqualizerEffectListener iEqualizerEffectListener, String str) {
        this.equalizerEffectListener = iEqualizerEffectListener;
        this.name = str;
        this.desc = new EqualizerDesc(str);
    }

    public void release() {
        releaseEqualizer();
        releaseVirtualizer();
    }

    private void releaseEqualizer() {
        try {
            if (this.equalizer != null) {
                this.equalizer.setControlStatusListener(null);
                this.equalizer.release();
            }
        } catch (Exception unused) {
        }
        this.equalizerHasControl = false;
        this.equalizer = null;
        this.audioSessionEqualizer = 0;
    }

    private void releaseVirtualizer() {
        try {
            if (this.virtualizer != null) {
                this.virtualizer.release();
            }
        } catch (Exception unused) {
        }
        this.virtualizer = null;
        this.audioSessionVirtualizer = 0;
    }

    public void onAudioSessionChanged(int i) {
        this.lastKnownAudioSession = i;
        boolean z = false;
        if (this.equalizerEffectListener.isEqualizerEnabled(getEqualizerName())) {
            EqualizerSettings equalizerSettings = this.equalizerEffectListener.getEqualizerSettings(getEqualizerName());
            this.shouldBeEnabled = equalizerSettings.enabled;
            initializeEqualizer(equalizerSettings.enabled, i);
            applySettings(equalizerSettings, this.desc);
            if (equalizerSettings.enabled && equalizerSettings.virtualizerStrength > 0.0f) {
                z = true;
            }
            initializeVirtualizer(z, i);
            applyVirtualizerSettings(equalizerSettings);
        } else {
            initializeEqualizer(false, i);
            initializeVirtualizer(false, i);
        }
        this.equalizerEffectListener.onEqualizerDescChanged(this.desc);
    }

    public void onCheckEqualizerLife() {
        if (this.shouldBeEnabled) {
            return;
        }
        releaseEqualizer();
    }

    public String getEqualizerName() {
        return this.name;
    }

    public EqualizerDesc getEqualizerDesc() {
        initializeEqualizer(true, this.lastKnownAudioSession);
        this.equalizerEffectListener.onEqualizerDescChanged(this.desc);
        return this.desc;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean initializeEqualizer(boolean z, int i) {
        boolean z2;
        short s;
        this.equalizerHasControl = false;
        if (i != 0 && z) {
            if (this.equalizer == null || this.audioSessionEqualizer != i) {
                releaseEqualizer();
                this.audioSessionEqualizer = i;
                try {
                    Equalizer equalizer = new Equalizer(0, i);
                    this.equalizer = equalizer;
                    equalizer.setControlStatusListener(new AudioEffect.OnControlStatusChangeListener() { // from class: com.daaw.avee.comp.playback.BaseEqualizerEffect.1
                        @Override // android.media.audiofx.AudioEffect.OnControlStatusChangeListener
                        public void onControlStatusChange(AudioEffect audioEffect, boolean z3) {
                            BaseEqualizerEffect.this.equalizerHasControl = z3;
                        }
                    });
                } catch (Exception unused) {
                }
                z2 = true;
                if (this.equalizer != null) {
                    if (this.desc == null) {
                        this.desc = new EqualizerDesc(getEqualizerName());
                        return true;
                    }
                    return z2;
                }
                if (this.desc == null) {
                    this.desc = new EqualizerDesc();
                    z2 = true;
                }
                try {
                    this.desc.name = getEqualizerName();
                    this.desc.numBands = this.equalizer.getNumberOfBands();
                    this.desc.lowerBandLevel = this.equalizer.getBandLevelRange()[0];
                    this.desc.higherBandLevel = this.equalizer.getBandLevelRange()[1];
                    this.desc.currentBandLevels = new float[this.desc.numBands];
                    this.desc.bandsFreq = new int[this.desc.numBands];
                    float f = (this.desc.higherBandLevel - this.desc.lowerBandLevel) / 2;
                    for (int i2 = 0; i2 < this.desc.currentBandLevels.length; i2++) {
                        this.desc.currentBandLevels[i2] = ((this.equalizer.getBandLevel(s) - this.desc.lowerBandLevel) - f) / f;
                        this.desc.bandsFreq[i2] = this.equalizer.getCenterFreq((short) i2);
                    }
                } catch (Exception e) {
                    tlog.w("Equalizer parameter exception: " + e.getMessage());
                    e.printStackTrace();
                    releaseEqualizer();
                }
                return z2;
            }
        } else {
            releaseEqualizer();
        }
        z2 = false;
        if (this.equalizer != null) {
        }
    }

    private void applySettings(EqualizerSettings equalizerSettings, EqualizerDesc equalizerDesc) {
        Equalizer equalizer = this.equalizer;
        if (equalizer == null || equalizerSettings == null) {
            return;
        }
        if (equalizer.getEnabled() != equalizerSettings.enabled) {
            this.equalizer.setEnabled(equalizerSettings.enabled);
        }
        if (equalizerSettings.enabled) {
            try {
                if (equalizerSettings.usePreset) {
                    short s = (short) equalizerSettings.preset;
                    if (s < this.equalizer.getNumberOfPresets() && s >= 0) {
                        this.equalizer.usePreset(s);
                        return;
                    }
                    tlog.w("invalid preset: " + ((int) s));
                    return;
                }
                int i = (equalizerDesc.higherBandLevel - equalizerDesc.lowerBandLevel) / 2;
                if (equalizerSettings.bandLevels.length == this.equalizer.getNumberOfBands()) {
                    for (int i2 = 0; i2 < equalizerDesc.currentBandLevels.length; i2++) {
                        this.equalizer.setBandLevel((short) i2, (short) (Math.round(equalizerSettings.bandLevels[i2] * i) + i + equalizerDesc.lowerBandLevel));
                    }
                    return;
                }
                tlog.w("invalid band count " + equalizerSettings.bandLevels.length);
            } catch (Exception e) {
                tlog.w("Equalizer exception");
                e.printStackTrace();
            }
        }
    }

    private void initializeVirtualizer(boolean z, int i) {
        if (i != 0 && z) {
            if (this.virtualizer == null || this.audioSessionVirtualizer != i) {
                releaseVirtualizer();
                this.audioSessionVirtualizer = i;
                try {
                    this.virtualizer = new Virtualizer(0, i);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        releaseVirtualizer();
    }

    private void applyVirtualizerSettings(EqualizerSettings equalizerSettings) {
        Virtualizer virtualizer = this.virtualizer;
        if (virtualizer == null) {
            return;
        }
        virtualizer.setEnabled(equalizerSettings.enabled && equalizerSettings.virtualizerStrength > 0.0f);
        if (this.virtualizer.getStrengthSupported()) {
            this.virtualizer.setStrength((short) Utils.ensureRange(equalizerSettings.virtualizerStrength * 1000.0f, 0.0f, 1000.0f));
        }
    }

    public void setEqualizerSettings(EqualizerSettings equalizerSettings) {
        this.shouldBeEnabled = equalizerSettings.enabled;
        initializeEqualizer(equalizerSettings.enabled, this.lastKnownAudioSession);
        applySettings(equalizerSettings, this.desc);
        initializeVirtualizer(equalizerSettings.enabled && equalizerSettings.virtualizerStrength > 0.0f, this.lastKnownAudioSession);
        applyVirtualizerSettings(equalizerSettings);
    }

    /* loaded from: classes.dex */
    public static class EqualizerDesc {
        public static final EqualizerDesc empty = new EqualizerDesc("Default");
        public int[] bandsFreq;
        public float[] currentBandLevels;
        public int higherBandLevel;
        public int lowerBandLevel;
        public String name;
        public int numBands;

        public EqualizerDesc(String str) {
            this.name = str;
            this.numBands = 0;
            this.lowerBandLevel = -1000;
            this.higherBandLevel = 1000;
            this.bandsFreq = new int[0];
            this.currentBandLevels = new float[0];
        }

        public EqualizerDesc() {
        }
    }
}
