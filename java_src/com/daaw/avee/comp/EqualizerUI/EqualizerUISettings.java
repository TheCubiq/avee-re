package com.daaw.avee.comp.EqualizerUI;
/* loaded from: classes.dex */
public class EqualizerUISettings {
    public int presetIndex;
    public boolean enabled = false;
    public EQPreset currentBands = EQPreset.clone(EQPreset.empty);
    public float bassValue = 0.0f;
    public float trebleValue = 0.0f;
    public EQPreset bandsFinal = EQPreset.clone(EQPreset.empty);
    public float virtualizerStrength = 0.0f;

    public EqualizerUISettings() {
        this.presetIndex = -1;
        this.presetIndex = -1;
    }
}
