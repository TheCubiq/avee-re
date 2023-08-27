package com.daaw.avee.comp.EqualizerUI;
/* loaded from: classes.dex */
public class EqualizerUIDesc {
    public static final EqualizerUIDesc empty = new EqualizerUIDesc(0);
    public EQPreset bassBoost;
    public float bassBoostValue;
    public EQPreset currentBands;
    public int currentPreset;
    public boolean enabled;
    public String name;
    public EQPreset[] presets;
    public EQPreset trebleBoost;
    public float trebleBoostValue;
    public float virtualizerStrength;

    private EqualizerUIDesc(int i) {
        this.name = "";
        this.currentBands = EQPreset.empty;
        this.currentPreset = -1;
        this.presets = new EQPreset[i];
        this.bassBoostValue = 0.0f;
        this.bassBoost = EQPreset.clone(EQPreset.empty);
        this.trebleBoostValue = 0.0f;
        this.trebleBoost = EQPreset.clone(EQPreset.empty);
        this.virtualizerStrength = 0.0f;
    }

    public EqualizerUIDesc() {
    }
}
