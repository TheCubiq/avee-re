package com.daaw.avee.Design;

import android.os.Handler;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.ContextData;
import com.daaw.avee.MainActivity;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.EqualizerUI.EQPreset;
import com.daaw.avee.comp.EqualizerUI.Equalization;
import com.daaw.avee.comp.EqualizerUI.EqualizerDialog;
import com.daaw.avee.comp.EqualizerUI.EqualizerUIDesc;
import com.daaw.avee.comp.EqualizerUI.EqualizerUISettings;
import com.daaw.avee.comp.MediaControlsUI.MediaControlsUI;
import com.daaw.avee.comp.playback.BaseEqualizerEffect;
import com.daaw.avee.comp.playback.EventsPlaybackService;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class AudioEffectsDesign {
    private EQPreset bassBoost;
    private EQPreset[] eqPresets;
    private List<Object> listenerRefHolder = new LinkedList();
    private Handler threadHandler = new Handler();
    private EQPreset trebleBoost;

    public AudioEffectsDesign() {
        EQPreset eQPreset = new EQPreset("Bass Boost", 2);
        this.bassBoost = eQPreset;
        eQPreset.points[0] = new EQPreset.Point(100.0f, 1.0f);
        this.bassBoost.points[1] = new EQPreset.Point(500.0f, 0.0f);
        EQPreset eQPreset2 = new EQPreset("Treble Boost", 2);
        this.trebleBoost = eQPreset2;
        eQPreset2.points[0] = new EQPreset.Point(1000.0f, 0.0f);
        this.trebleBoost.points[1] = new EQPreset.Point(20000.0f, 1.0f);
        this.trebleBoost.points[1] = new EQPreset.Point(20000.0f, 1.0f);
        initEqPresets();
        MainActivity.onMainUIAction.subscribeWeak(new WeakEvent2.Handler<Integer, ContextData>() { // from class: com.daaw.avee.Design.AudioEffectsDesign.1
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Integer num, ContextData contextData) {
                if (num.intValue() == 3) {
                    EqualizerDialog.createAndShowEqualizerDialog(contextData);
                }
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onActionEq.subscribeWeak(new WeakEvent1.Handler<ContextData>() { // from class: com.daaw.avee.Design.AudioEffectsDesign.2
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(ContextData contextData) {
                EqualizerDialog.createAndShowEqualizerDialog(contextData);
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onRequestEqState.subscribeWeak(new WeakEventR.Handler<Boolean>() { // from class: com.daaw.avee.Design.AudioEffectsDesign.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Boolean invoke() {
                return Boolean.valueOf(AppPreferences.createOrGetInstance().getBool(AppPreferences.PREF_Bool_equalizerEnabled));
            }
        }, this.listenerRefHolder);
        EqualizerDialog.onRequestEqualizerDesc.subscribeWeak(new WeakEventR.Handler<EqualizerUIDesc>() { // from class: com.daaw.avee.Design.AudioEffectsDesign.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public EqualizerUIDesc invoke() {
                BaseEqualizerEffect.EqualizerDesc invoke = EventsPlaybackService.Receive.onRequestEqualizerDesc.invoke(null);
                if (invoke == null) {
                    return null;
                }
                return AudioEffectsDesign.this.getEqualizerUIDesc(invoke);
            }
        }, this.listenerRefHolder);
        AppPreferences.onBoolPreferenceChanged.subscribeWeak(new WeakEvent2.Handler<Integer, Boolean>() { // from class: com.daaw.avee.Design.AudioEffectsDesign.5
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Integer num, Boolean bool) {
                MediaControlsUI mediaControlsUI;
                if (num.intValue() != AppPreferences.PREF_Bool_equalizerEnabled || (mediaControlsUI = MediaControlsUI.getInstance()) == null) {
                    return;
                }
                mediaControlsUI.onEqStateChanged(bool.booleanValue());
            }
        }, this.listenerRefHolder);
        EqualizerDialog.onSubmitEqualizerSettings.subscribeWeak(new WeakEvent2.Handler<EqualizerUISettings, EqualizerUIDesc>() { // from class: com.daaw.avee.Design.AudioEffectsDesign.6
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(EqualizerUISettings equalizerUISettings, EqualizerUIDesc equalizerUIDesc) {
                AppPreferences.createOrGetInstance().setBool(AppPreferences.PREF_Bool_equalizerEnabled, equalizerUISettings.enabled);
                AppPreferences.createOrGetInstance().setInt(AppPreferences.PREF_Int_equalizerPreset, equalizerUISettings.presetIndex);
                AppPreferences.createOrGetInstance().setString(AppPreferences.PREF_String_equalizerBarsValues, EQPreset.serialize(equalizerUISettings.currentBands));
                AppPreferences.createOrGetInstance().setInt(AppPreferences.PREF_Int_equalizerBassValue, (int) (equalizerUISettings.bassValue * 1000.0f));
                AppPreferences.createOrGetInstance().setInt(AppPreferences.PREF_Int_equalizerTrebleValue, (int) (equalizerUISettings.trebleValue * 1000.0f));
                AppPreferences.createOrGetInstance().setInt(AppPreferences.PREF_Int_virtualizerStrength, (int) (equalizerUISettings.virtualizerStrength * 1000.0f));
                BaseEqualizerEffect.EqualizerSettings equalizerSettings = new BaseEqualizerEffect.EqualizerSettings();
                float[] fArr = new float[equalizerUISettings.bandsFinal.points.length];
                float[] fArr2 = new float[equalizerUISettings.bandsFinal.points.length];
                for (int i = 0; i < equalizerUISettings.bandsFinal.points.length; i++) {
                    fArr2[i] = equalizerUISettings.bandsFinal.points[i].freq;
                }
                Equalization.getEqBandsBassTrebleControl(equalizerUISettings.bandsFinal, AudioEffectsDesign.this.bassBoost, AudioEffectsDesign.this.trebleBoost, equalizerUISettings.bassValue, equalizerUISettings.trebleValue, fArr, fArr2);
                equalizerSettings.enabled = equalizerUISettings.enabled;
                equalizerSettings.usePreset = false;
                equalizerSettings.preset = -1;
                equalizerSettings.bandLevels = fArr;
                equalizerSettings.virtualizerStrength = equalizerUISettings.virtualizerStrength;
                EventsPlaybackService.Receive.setEqualizerSettings.invoke(equalizerSettings);
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onRequestEqualizerSettings.subscribeWeak(new WeakEventR1.Handler<String, BaseEqualizerEffect.EqualizerSettings>() { // from class: com.daaw.avee.Design.AudioEffectsDesign.7
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public BaseEqualizerEffect.EqualizerSettings invoke(String str) {
                BaseEqualizerEffect.EqualizerSettings equalizerSettings = new BaseEqualizerEffect.EqualizerSettings();
                EQPreset deserialize = EQPreset.deserialize(AppPreferences.createOrGetInstance().getString(AppPreferences.PREF_String_equalizerBarsValues));
                float f = AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_equalizerBassValue) * 0.001f;
                float f2 = AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_equalizerTrebleValue) * 0.001f;
                float[] fArr = new float[deserialize.points.length];
                float[] fArr2 = new float[deserialize.points.length];
                for (int i = 0; i < deserialize.points.length; i++) {
                    fArr2[i] = deserialize.points[i].freq;
                }
                Equalization.getEqBandsBassTrebleControl(deserialize, AudioEffectsDesign.this.bassBoost, AudioEffectsDesign.this.trebleBoost, f, f2, fArr, fArr2);
                equalizerSettings.enabled = AppPreferences.createOrGetInstance().getBool(AppPreferences.PREF_Bool_equalizerEnabled);
                equalizerSettings.usePreset = false;
                equalizerSettings.preset = -1;
                equalizerSettings.bandLevels = fArr;
                equalizerSettings.virtualizerStrength = AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_virtualizerStrength) * 0.001f;
                return equalizerSettings;
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onRequestEqualizerIsEnabled.subscribeWeak(new WeakEventR1.Handler<String, Boolean>() { // from class: com.daaw.avee.Design.AudioEffectsDesign.8
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public Boolean invoke(String str) {
                return Boolean.valueOf(AppPreferences.createOrGetInstance().getBool(AppPreferences.PREF_Bool_equalizerEnabled));
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onEqualizerDescChanged.subscribeWeak(new WeakEvent1.Handler<BaseEqualizerEffect.EqualizerDesc>() { // from class: com.daaw.avee.Design.AudioEffectsDesign.9
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(final BaseEqualizerEffect.EqualizerDesc equalizerDesc) {
                AudioEffectsDesign.this.threadHandler.post(new Runnable() { // from class: com.daaw.avee.Design.AudioEffectsDesign.9.1
                    @Override // java.lang.Runnable
                    public void run() {
                        EqualizerDialog.onReceiveEqualizerDescChanged.invoke(AudioEffectsDesign.this.getEqualizerUIDesc(equalizerDesc));
                    }
                });
            }
        }, this.listenerRefHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EqualizerUIDesc getEqualizerUIDesc(BaseEqualizerEffect.EqualizerDesc equalizerDesc) {
        if (equalizerDesc == null) {
            equalizerDesc = BaseEqualizerEffect.EqualizerDesc.empty;
        }
        EqualizerUIDesc equalizerUIDesc = new EqualizerUIDesc();
        equalizerUIDesc.name = equalizerDesc.name;
        EQPreset deserialize = EQPreset.deserialize(AppPreferences.createOrGetInstance().getString(AppPreferences.PREF_String_equalizerBarsValues));
        if (deserialize.points.length != equalizerDesc.currentBandLevels.length) {
            deserialize = new EQPreset("", equalizerDesc.currentBandLevels.length);
            for (int i = 0; i < equalizerDesc.currentBandLevels.length; i++) {
                deserialize.points[i] = new EQPreset.Point(0.0f, 0.0f);
            }
        }
        for (int i2 = 0; i2 < equalizerDesc.currentBandLevels.length; i2++) {
            deserialize.points[i2].freq = equalizerDesc.bandsFreq[i2] * 0.001f;
        }
        equalizerUIDesc.currentBands = deserialize;
        equalizerUIDesc.enabled = AppPreferences.createOrGetInstance().getBool(AppPreferences.PREF_Bool_equalizerEnabled);
        equalizerUIDesc.currentPreset = AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_equalizerPreset);
        equalizerUIDesc.bassBoostValue = AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_equalizerBassValue) * 0.001f;
        equalizerUIDesc.trebleBoostValue = AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_equalizerTrebleValue) * 0.001f;
        equalizerUIDesc.bassBoost = this.bassBoost;
        equalizerUIDesc.trebleBoost = this.trebleBoost;
        equalizerUIDesc.presets = this.eqPresets;
        equalizerUIDesc.virtualizerStrength = AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_virtualizerStrength) * 0.001f;
        return equalizerUIDesc;
    }

    private void initEqPresets() {
        this.eqPresets = new EQPreset[15];
        EQPreset eQPreset = new EQPreset("Default", 2);
        eQPreset.points[0] = new EQPreset.Point(20.0f, 0.0f);
        eQPreset.points[1] = new EQPreset.Point(20000.0f, 0.0f);
        this.eqPresets[0] = eQPreset;
        EQPreset eQPreset2 = new EQPreset("Classical", 18);
        eQPreset2.points[0] = new EQPreset.Point(55.0f, 3.0f);
        eQPreset2.points[1] = new EQPreset.Point(77.0f, 2.0f);
        eQPreset2.points[2] = new EQPreset.Point(110.0f, 1.0f);
        eQPreset2.points[3] = new EQPreset.Point(156.0f, 0.0f);
        eQPreset2.points[4] = new EQPreset.Point(220.0f, 2.0f);
        eQPreset2.points[5] = new EQPreset.Point(311.0f, 1.0f);
        eQPreset2.points[6] = new EQPreset.Point(440.0f, 2.0f);
        eQPreset2.points[7] = new EQPreset.Point(622.0f, 1.0f);
        eQPreset2.points[8] = new EQPreset.Point(880.0f, 2.0f);
        eQPreset2.points[9] = new EQPreset.Point(1200.0f, 3.0f);
        eQPreset2.points[10] = new EQPreset.Point(1800.0f, 1.0f);
        eQPreset2.points[11] = new EQPreset.Point(2500.0f, 1.0f);
        eQPreset2.points[12] = new EQPreset.Point(3500.0f, 1.0f);
        eQPreset2.points[13] = new EQPreset.Point(5000.0f, 2.0f);
        eQPreset2.points[14] = new EQPreset.Point(7000.0f, 4.0f);
        eQPreset2.points[15] = new EQPreset.Point(10000.0f, 3.0f);
        eQPreset2.points[16] = new EQPreset.Point(14000.0f, 2.0f);
        eQPreset2.points[17] = new EQPreset.Point(20000.0f, 1.0f);
        eQPreset2.normalizeValues(10.0f);
        this.eqPresets[1] = eQPreset2;
        EQPreset eQPreset3 = new EQPreset("Club", 18);
        eQPreset3.points[0] = new EQPreset.Point(55.0f, 0.0f);
        eQPreset3.points[1] = new EQPreset.Point(77.0f, 0.0f);
        eQPreset3.points[2] = new EQPreset.Point(110.0f, 0.0f);
        eQPreset3.points[3] = new EQPreset.Point(156.0f, 2.0f);
        eQPreset3.points[4] = new EQPreset.Point(220.0f, 2.0f);
        eQPreset3.points[5] = new EQPreset.Point(311.0f, 5.0f);
        eQPreset3.points[6] = new EQPreset.Point(440.0f, 5.0f);
        eQPreset3.points[7] = new EQPreset.Point(622.0f, 8.0f);
        eQPreset3.points[8] = new EQPreset.Point(880.0f, 8.0f);
        eQPreset3.points[9] = new EQPreset.Point(1200.0f, 8.0f);
        eQPreset3.points[10] = new EQPreset.Point(1800.0f, 8.0f);
        eQPreset3.points[11] = new EQPreset.Point(2500.0f, 8.0f);
        eQPreset3.points[12] = new EQPreset.Point(3500.0f, 8.0f);
        eQPreset3.points[13] = new EQPreset.Point(5000.0f, 5.0f);
        eQPreset3.points[14] = new EQPreset.Point(7000.0f, 5.0f);
        eQPreset3.points[15] = new EQPreset.Point(10000.0f, 2.0f);
        eQPreset3.points[16] = new EQPreset.Point(14000.0f, 0.0f);
        eQPreset3.points[17] = new EQPreset.Point(20000.0f, 0.0f);
        eQPreset3.normalizeValues(10.0f);
        this.eqPresets[2] = eQPreset3;
        EQPreset eQPreset4 = new EQPreset("Dance", 18);
        eQPreset4.points[0] = new EQPreset.Point(55.0f, 11.0f);
        eQPreset4.points[1] = new EQPreset.Point(77.0f, 11.0f);
        eQPreset4.points[2] = new EQPreset.Point(110.0f, 8.0f);
        eQPreset4.points[3] = new EQPreset.Point(156.0f, 8.0f);
        eQPreset4.points[4] = new EQPreset.Point(220.0f, 8.0f);
        eQPreset4.points[5] = new EQPreset.Point(311.0f, 5.0f);
        eQPreset4.points[6] = new EQPreset.Point(440.0f, 5.0f);
        eQPreset4.points[7] = new EQPreset.Point(622.0f, 0.0f);
        eQPreset4.points[8] = new EQPreset.Point(880.0f, 0.0f);
        eQPreset4.points[9] = new EQPreset.Point(1200.0f, 0.0f);
        eQPreset4.points[10] = new EQPreset.Point(1800.0f, 0.0f);
        eQPreset4.points[11] = new EQPreset.Point(2500.0f, -5.0f);
        eQPreset4.points[12] = new EQPreset.Point(3500.0f, -5.0f);
        eQPreset4.points[13] = new EQPreset.Point(5000.0f, -5.0f);
        eQPreset4.points[14] = new EQPreset.Point(7000.0f, -8.0f);
        eQPreset4.points[15] = new EQPreset.Point(10000.0f, -8.0f);
        eQPreset4.points[16] = new EQPreset.Point(14000.0f, 0.0f);
        eQPreset4.points[17] = new EQPreset.Point(20000.0f, 0.0f);
        eQPreset4.normalizeValues(13.0f);
        this.eqPresets[3] = eQPreset4;
        EQPreset eQPreset5 = new EQPreset("Disco", 18);
        eQPreset5.points[0] = new EQPreset.Point(55.0f, 3.0f);
        eQPreset5.points[1] = new EQPreset.Point(77.0f, 3.0f);
        eQPreset5.points[2] = new EQPreset.Point(110.0f, 1.0f);
        eQPreset5.points[3] = new EQPreset.Point(156.0f, 1.0f);
        eQPreset5.points[4] = new EQPreset.Point(220.0f, 3.0f);
        eQPreset5.points[5] = new EQPreset.Point(311.0f, 1.0f);
        eQPreset5.points[6] = new EQPreset.Point(440.0f, 1.0f);
        eQPreset5.points[7] = new EQPreset.Point(622.0f, 1.0f);
        eQPreset5.points[8] = new EQPreset.Point(880.0f, 2.0f);
        eQPreset5.points[9] = new EQPreset.Point(1200.0f, 6.0f);
        eQPreset5.points[10] = new EQPreset.Point(1800.0f, 5.0f);
        eQPreset5.points[11] = new EQPreset.Point(2500.0f, 4.0f);
        eQPreset5.points[12] = new EQPreset.Point(3500.0f, 3.0f);
        eQPreset5.points[13] = new EQPreset.Point(5000.0f, 2.0f);
        eQPreset5.points[14] = new EQPreset.Point(7000.0f, 2.0f);
        eQPreset5.points[15] = new EQPreset.Point(10000.0f, 2.0f);
        eQPreset5.points[16] = new EQPreset.Point(14000.0f, 2.0f);
        eQPreset5.points[17] = new EQPreset.Point(20000.0f, 1.0f);
        eQPreset5.normalizeValues(10.0f);
        this.eqPresets[4] = eQPreset5;
        EQPreset eQPreset6 = new EQPreset("Drum & Bass", 18);
        eQPreset6.points[0] = new EQPreset.Point(55.0f, 3.0f);
        eQPreset6.points[1] = new EQPreset.Point(77.0f, 4.0f);
        eQPreset6.points[2] = new EQPreset.Point(110.0f, 3.0f);
        eQPreset6.points[3] = new EQPreset.Point(156.0f, 2.0f);
        eQPreset6.points[4] = new EQPreset.Point(220.0f, 2.0f);
        eQPreset6.points[5] = new EQPreset.Point(311.0f, 1.0f);
        eQPreset6.points[6] = new EQPreset.Point(440.0f, 0.0f);
        eQPreset6.points[7] = new EQPreset.Point(622.0f, 0.0f);
        eQPreset6.points[8] = new EQPreset.Point(880.0f, 1.0f);
        eQPreset6.points[9] = new EQPreset.Point(1200.0f, 3.0f);
        eQPreset6.points[10] = new EQPreset.Point(1800.0f, 5.0f);
        eQPreset6.points[11] = new EQPreset.Point(2500.0f, 3.0f);
        eQPreset6.points[12] = new EQPreset.Point(3500.0f, 2.0f);
        eQPreset6.points[13] = new EQPreset.Point(5000.0f, 1.0f);
        eQPreset6.points[14] = new EQPreset.Point(7000.0f, 2.0f);
        eQPreset6.points[15] = new EQPreset.Point(10000.0f, 2.0f);
        eQPreset6.points[16] = new EQPreset.Point(14000.0f, 1.0f);
        eQPreset6.points[17] = new EQPreset.Point(20000.0f, 2.0f);
        eQPreset6.normalizeValues(10.0f);
        this.eqPresets[5] = eQPreset6;
        EQPreset eQPreset7 = new EQPreset("Heavy Metal", 18);
        eQPreset7.points[0] = new EQPreset.Point(55.0f, 4.0f);
        eQPreset7.points[1] = new EQPreset.Point(77.0f, 3.0f);
        eQPreset7.points[2] = new EQPreset.Point(110.0f, 2.0f);
        eQPreset7.points[3] = new EQPreset.Point(156.0f, 3.0f);
        eQPreset7.points[4] = new EQPreset.Point(220.0f, 6.0f);
        eQPreset7.points[5] = new EQPreset.Point(311.0f, 6.0f);
        eQPreset7.points[6] = new EQPreset.Point(440.0f, 6.0f);
        eQPreset7.points[7] = new EQPreset.Point(622.0f, 6.0f);
        eQPreset7.points[8] = new EQPreset.Point(880.0f, 6.0f);
        eQPreset7.points[9] = new EQPreset.Point(1200.0f, 5.0f);
        eQPreset7.points[10] = new EQPreset.Point(1800.0f, 4.0f);
        eQPreset7.points[11] = new EQPreset.Point(2500.0f, 3.0f);
        eQPreset7.points[12] = new EQPreset.Point(3500.0f, 3.0f);
        eQPreset7.points[13] = new EQPreset.Point(5000.0f, 3.0f);
        eQPreset7.points[14] = new EQPreset.Point(7000.0f, 2.0f);
        eQPreset7.points[15] = new EQPreset.Point(10000.0f, 2.0f);
        eQPreset7.points[16] = new EQPreset.Point(14000.0f, 2.0f);
        eQPreset7.points[17] = new EQPreset.Point(20000.0f, 1.0f);
        eQPreset7.normalizeValues(10.0f);
        this.eqPresets[6] = eQPreset7;
        EQPreset eQPreset8 = new EQPreset("Jazz", 18);
        eQPreset8.points[0] = new EQPreset.Point(55.0f, 0.0f);
        eQPreset8.points[1] = new EQPreset.Point(77.0f, 1.0f);
        eQPreset8.points[2] = new EQPreset.Point(110.0f, 2.0f);
        eQPreset8.points[3] = new EQPreset.Point(156.0f, 2.0f);
        eQPreset8.points[4] = new EQPreset.Point(220.0f, 3.0f);
        eQPreset8.points[5] = new EQPreset.Point(311.0f, 1.0f);
        eQPreset8.points[6] = new EQPreset.Point(440.0f, 2.0f);
        eQPreset8.points[7] = new EQPreset.Point(622.0f, 0.0f);
        eQPreset8.points[8] = new EQPreset.Point(880.0f, 0.0f);
        eQPreset8.points[9] = new EQPreset.Point(1200.0f, 2.0f);
        eQPreset8.points[10] = new EQPreset.Point(1800.0f, 1.0f);
        eQPreset8.points[11] = new EQPreset.Point(2500.0f, 2.0f);
        eQPreset8.points[12] = new EQPreset.Point(3500.0f, 4.0f);
        eQPreset8.points[13] = new EQPreset.Point(5000.0f, 3.0f);
        eQPreset8.points[14] = new EQPreset.Point(7000.0f, 3.0f);
        eQPreset8.points[15] = new EQPreset.Point(10000.0f, 2.0f);
        eQPreset8.points[16] = new EQPreset.Point(14000.0f, 1.0f);
        eQPreset8.points[17] = new EQPreset.Point(20000.0f, 0.0f);
        eQPreset8.normalizeValues(10.0f);
        this.eqPresets[7] = eQPreset8;
        EQPreset eQPreset9 = new EQPreset("Latin", 18);
        eQPreset9.points[0] = new EQPreset.Point(55.0f, 0.0f);
        eQPreset9.points[1] = new EQPreset.Point(77.0f, -2.0f);
        eQPreset9.points[2] = new EQPreset.Point(110.0f, -1.0f);
        eQPreset9.points[3] = new EQPreset.Point(156.0f, 0.0f);
        eQPreset9.points[4] = new EQPreset.Point(220.0f, 1.0f);
        eQPreset9.points[5] = new EQPreset.Point(311.0f, 1.0f);
        eQPreset9.points[6] = new EQPreset.Point(440.0f, 2.0f);
        eQPreset9.points[7] = new EQPreset.Point(622.0f, 2.0f);
        eQPreset9.points[8] = new EQPreset.Point(880.0f, 3.0f);
        eQPreset9.points[9] = new EQPreset.Point(1200.0f, 4.0f);
        eQPreset9.points[10] = new EQPreset.Point(1800.0f, 1.0f);
        eQPreset9.points[11] = new EQPreset.Point(2500.0f, 2.0f);
        eQPreset9.points[12] = new EQPreset.Point(3500.0f, 2.0f);
        eQPreset9.points[13] = new EQPreset.Point(5000.0f, 2.0f);
        eQPreset9.points[14] = new EQPreset.Point(7000.0f, 3.0f);
        eQPreset9.points[15] = new EQPreset.Point(10000.0f, 2.0f);
        eQPreset9.points[16] = new EQPreset.Point(14000.0f, 1.0f);
        eQPreset9.points[17] = new EQPreset.Point(20000.0f, 1.0f);
        eQPreset9.normalizeValues(10.0f);
        this.eqPresets[8] = eQPreset9;
        EQPreset eQPreset10 = new EQPreset("New Age", 18);
        eQPreset10.points[0] = new EQPreset.Point(55.0f, 3.0f);
        eQPreset10.points[1] = new EQPreset.Point(77.0f, 1.0f);
        eQPreset10.points[2] = new EQPreset.Point(110.0f, 3.0f);
        eQPreset10.points[3] = new EQPreset.Point(156.0f, 2.0f);
        eQPreset10.points[4] = new EQPreset.Point(220.0f, 2.0f);
        eQPreset10.points[5] = new EQPreset.Point(311.0f, 2.0f);
        eQPreset10.points[6] = new EQPreset.Point(440.0f, 3.0f);
        eQPreset10.points[7] = new EQPreset.Point(622.0f, 2.0f);
        eQPreset10.points[8] = new EQPreset.Point(880.0f, 0.0f);
        eQPreset10.points[9] = new EQPreset.Point(1200.0f, 2.0f);
        eQPreset10.points[10] = new EQPreset.Point(1800.0f, 4.0f);
        eQPreset10.points[11] = new EQPreset.Point(2500.0f, 1.0f);
        eQPreset10.points[12] = new EQPreset.Point(3500.0f, 3.0f);
        eQPreset10.points[13] = new EQPreset.Point(5000.0f, 2.0f);
        eQPreset10.points[14] = new EQPreset.Point(7000.0f, 4.0f);
        eQPreset10.points[15] = new EQPreset.Point(10000.0f, 2.0f);
        eQPreset10.points[16] = new EQPreset.Point(14000.0f, 1.0f);
        eQPreset10.points[17] = new EQPreset.Point(20000.0f, 1.0f);
        eQPreset10.normalizeValues(10.0f);
        this.eqPresets[9] = eQPreset10;
        EQPreset eQPreset11 = new EQPreset("Party", 18);
        eQPreset11.points[0] = new EQPreset.Point(55.0f, 7.0f);
        eQPreset11.points[1] = new EQPreset.Point(77.0f, 6.0f);
        eQPreset11.points[2] = new EQPreset.Point(110.0f, 5.0f);
        eQPreset11.points[3] = new EQPreset.Point(156.0f, 3.0f);
        eQPreset11.points[4] = new EQPreset.Point(220.0f, 2.0f);
        eQPreset11.points[5] = new EQPreset.Point(311.0f, 1.0f);
        eQPreset11.points[6] = new EQPreset.Point(440.0f, 0.0f);
        eQPreset11.points[7] = new EQPreset.Point(622.0f, 0.0f);
        eQPreset11.points[8] = new EQPreset.Point(880.0f, 0.0f);
        eQPreset11.points[9] = new EQPreset.Point(1200.0f, 0.0f);
        eQPreset11.points[10] = new EQPreset.Point(1800.0f, 0.0f);
        eQPreset11.points[11] = new EQPreset.Point(2500.0f, 0.0f);
        eQPreset11.points[12] = new EQPreset.Point(3500.0f, 0.0f);
        eQPreset11.points[13] = new EQPreset.Point(5000.0f, 1.0f);
        eQPreset11.points[14] = new EQPreset.Point(7000.0f, 2.0f);
        eQPreset11.points[15] = new EQPreset.Point(10000.0f, 4.0f);
        eQPreset11.points[16] = new EQPreset.Point(14000.0f, 5.0f);
        eQPreset11.points[17] = new EQPreset.Point(20000.0f, 5.0f);
        eQPreset11.normalizeValues(10.0f);
        this.eqPresets[10] = eQPreset11;
        EQPreset eQPreset12 = new EQPreset("Pop", 18);
        eQPreset12.points[0] = new EQPreset.Point(55.0f, 1.0f);
        eQPreset12.points[1] = new EQPreset.Point(77.0f, -1.0f);
        eQPreset12.points[2] = new EQPreset.Point(110.0f, -3.0f);
        eQPreset12.points[3] = new EQPreset.Point(156.0f, 0.0f);
        eQPreset12.points[4] = new EQPreset.Point(220.0f, 1.0f);
        eQPreset12.points[5] = new EQPreset.Point(311.0f, 2.0f);
        eQPreset12.points[6] = new EQPreset.Point(440.0f, 3.0f);
        eQPreset12.points[7] = new EQPreset.Point(622.0f, 1.0f);
        eQPreset12.points[8] = new EQPreset.Point(880.0f, 1.0f);
        eQPreset12.points[9] = new EQPreset.Point(1200.0f, 2.0f);
        eQPreset12.points[10] = new EQPreset.Point(1800.0f, 0.0f);
        eQPreset12.points[11] = new EQPreset.Point(2500.0f, -1.0f);
        eQPreset12.points[12] = new EQPreset.Point(3500.0f, -2.0f);
        eQPreset12.points[13] = new EQPreset.Point(5000.0f, 0.0f);
        eQPreset12.points[14] = new EQPreset.Point(7000.0f, 1.0f);
        eQPreset12.points[15] = new EQPreset.Point(10000.0f, 2.0f);
        eQPreset12.points[16] = new EQPreset.Point(14000.0f, 2.0f);
        eQPreset12.points[17] = new EQPreset.Point(20000.0f, 2.0f);
        eQPreset12.normalizeValues(10.0f);
        this.eqPresets[11] = eQPreset12;
        EQPreset eQPreset13 = new EQPreset("Rock", 18);
        eQPreset13.points[0] = new EQPreset.Point(55.0f, 3.0f);
        eQPreset13.points[1] = new EQPreset.Point(77.0f, -3.0f);
        eQPreset13.points[2] = new EQPreset.Point(110.0f, -2.0f);
        eQPreset13.points[3] = new EQPreset.Point(156.0f, -2.0f);
        eQPreset13.points[4] = new EQPreset.Point(220.0f, -2.0f);
        eQPreset13.points[5] = new EQPreset.Point(311.0f, -2.0f);
        eQPreset13.points[6] = new EQPreset.Point(440.0f, -2.0f);
        eQPreset13.points[7] = new EQPreset.Point(622.0f, -2.0f);
        eQPreset13.points[8] = new EQPreset.Point(880.0f, -1.0f);
        eQPreset13.points[9] = new EQPreset.Point(1200.0f, -1.0f);
        eQPreset13.points[10] = new EQPreset.Point(1800.0f, -1.0f);
        eQPreset13.points[11] = new EQPreset.Point(2500.0f, -1.0f);
        eQPreset13.points[12] = new EQPreset.Point(3500.0f, 0.0f);
        eQPreset13.points[13] = new EQPreset.Point(5000.0f, 1.0f);
        eQPreset13.points[14] = new EQPreset.Point(7000.0f, 2.0f);
        eQPreset13.points[15] = new EQPreset.Point(10000.0f, 3.0f);
        eQPreset13.points[16] = new EQPreset.Point(14000.0f, 4.0f);
        eQPreset13.points[17] = new EQPreset.Point(20000.0f, 5.0f);
        eQPreset13.normalizeValues(10.0f);
        this.eqPresets[12] = eQPreset13;
        EQPreset eQPreset14 = new EQPreset("Techno", 18);
        eQPreset14.points[0] = new EQPreset.Point(55.0f, 3.0f);
        eQPreset14.points[1] = new EQPreset.Point(77.0f, 5.0f);
        eQPreset14.points[2] = new EQPreset.Point(110.0f, 3.0f);
        eQPreset14.points[3] = new EQPreset.Point(156.0f, 1.0f);
        eQPreset14.points[4] = new EQPreset.Point(220.0f, -1.0f);
        eQPreset14.points[5] = new EQPreset.Point(311.0f, 0.0f);
        eQPreset14.points[6] = new EQPreset.Point(440.0f, 1.0f);
        eQPreset14.points[7] = new EQPreset.Point(622.0f, 1.0f);
        eQPreset14.points[8] = new EQPreset.Point(880.0f, 2.0f);
        eQPreset14.points[9] = new EQPreset.Point(1200.0f, 5.0f);
        eQPreset14.points[10] = new EQPreset.Point(1800.0f, 3.0f);
        eQPreset14.points[11] = new EQPreset.Point(2500.0f, 2.0f);
        eQPreset14.points[12] = new EQPreset.Point(3500.0f, 5.0f);
        eQPreset14.points[13] = new EQPreset.Point(5000.0f, 1.0f);
        eQPreset14.points[14] = new EQPreset.Point(7000.0f, 2.0f);
        eQPreset14.points[15] = new EQPreset.Point(10000.0f, 3.0f);
        eQPreset14.points[16] = new EQPreset.Point(14000.0f, 4.0f);
        eQPreset14.points[17] = new EQPreset.Point(20000.0f, 4.0f);
        eQPreset14.normalizeValues(10.0f);
        this.eqPresets[13] = eQPreset14;
        EQPreset eQPreset15 = new EQPreset("Vocal", 18);
        eQPreset15.points[0] = new EQPreset.Point(55.0f, 2.0f);
        eQPreset15.points[1] = new EQPreset.Point(77.0f, -1.0f);
        eQPreset15.points[2] = new EQPreset.Point(110.0f, -1.0f);
        eQPreset15.points[3] = new EQPreset.Point(156.0f, -1.0f);
        eQPreset15.points[4] = new EQPreset.Point(220.0f, 2.0f);
        eQPreset15.points[5] = new EQPreset.Point(311.0f, 2.0f);
        eQPreset15.points[6] = new EQPreset.Point(440.0f, 4.0f);
        eQPreset15.points[7] = new EQPreset.Point(622.0f, 3.0f);
        eQPreset15.points[8] = new EQPreset.Point(880.0f, 4.0f);
        eQPreset15.points[9] = new EQPreset.Point(1200.0f, 4.0f);
        eQPreset15.points[10] = new EQPreset.Point(1800.0f, 3.0f);
        eQPreset15.points[11] = new EQPreset.Point(2500.0f, 2.0f);
        eQPreset15.points[12] = new EQPreset.Point(3500.0f, 0.0f);
        eQPreset15.points[13] = new EQPreset.Point(5000.0f, 0.0f);
        eQPreset15.points[14] = new EQPreset.Point(7000.0f, 0.0f);
        eQPreset15.points[15] = new EQPreset.Point(10000.0f, 0.0f);
        eQPreset15.points[16] = new EQPreset.Point(14000.0f, -1.0f);
        eQPreset15.points[17] = new EQPreset.Point(20000.0f, -1.0f);
        eQPreset15.normalizeValues(10.0f);
        this.eqPresets[14] = eQPreset15;
    }
}
