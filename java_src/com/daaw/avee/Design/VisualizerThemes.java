package com.daaw.avee.Design;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.UtilsFileSys;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
import com.daaw.avee.comp.Common.MeasureDefs;
import com.daaw.avee.comp.Common.VisualizerThemeInfo;
import com.daaw.avee.comp.Visualizer.CustomScene;
import com.daaw.avee.comp.Visualizer.Elements.AudioDataProviderElement;
import com.daaw.avee.comp.Visualizer.Elements.Base.IFrameDataProvider;
import com.daaw.avee.comp.Visualizer.Elements.Base.MeasuredVar;
import com.daaw.avee.comp.Visualizer.Elements.BlurEffectElement;
import com.daaw.avee.comp.Visualizer.Elements.Composition;
import com.daaw.avee.comp.Visualizer.Elements.ImageElement;
import com.daaw.avee.comp.Visualizer.Elements.Particles.AreaHorizontalLine;
import com.daaw.avee.comp.Visualizer.Elements.Particles.AreaRect;
import com.daaw.avee.comp.Visualizer.Elements.Particles.BasicParticleFactory;
import com.daaw.avee.comp.Visualizer.Elements.Particles.VortexForceField;
import com.daaw.avee.comp.Visualizer.Elements.ParticlesElement;
import com.daaw.avee.comp.Visualizer.Elements.RootElement;
import com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentAudioSpectrumData;
import com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentAudioWaveformData;
import com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentPathCircle;
import com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentPathHorizontalLine;
import com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentPathLetter;
import com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentPathSided;
import com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentRendererBar;
import com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentRendererLine;
import com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentRendererRoundBar;
import com.daaw.avee.comp.Visualizer.Elements.Segment.SegmentRendererSharpBar;
import com.daaw.avee.comp.Visualizer.Elements.SegmentElement;
import com.daaw.avee.comp.Visualizer.Elements.TextElement;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class VisualizerThemes {
    public static String ACTUAL_ROOT_VERSION = "10";
    private static int color1 = -1;
    private static int color2 = 1616928864;
    private static VisualizerThemes instance = null;
    private static int textBlendMode = 4;
    private List<Tuple2<VisualizerThemeInfo, IVisualizerFactory>> themesList = new ArrayList();
    private List<Tuple2<VisualizerThemeInfo, IVisualizerFactory2>> themesList2 = new ArrayList();

    /* loaded from: classes.dex */
    interface IVisualizerFactory {
        RootElement create(int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface IVisualizerFactory2 {
        CustomScene create(int i);
    }

    private static RootElement onFinishedDefaultRoot(RootElement rootElement, IFrameDataProvider iFrameDataProvider, boolean z) {
        return rootElement;
    }

    static String templateName(int i, String str) {
        return "T" + i + "_" + str;
    }

    public static VisualizerThemes s() {
        if (instance == null) {
            new VisualizerThemes();
        }
        return instance;
    }

    private VisualizerThemes() {
        instance = this;
        List<Tuple2<VisualizerThemeInfo, IVisualizerFactory>> list = this.themesList;
        list.add(new Tuple2<>(new VisualizerThemeInfo(list.size()), new IVisualizerFactory() { // from class: com.daaw.avee.Design.VisualizerThemes.1
            @Override // com.daaw.avee.Design.VisualizerThemes.IVisualizerFactory
            public RootElement create(int i) {
                return VisualizerThemes.createVisPreset0(i, "");
            }
        }));
        List<Tuple2<VisualizerThemeInfo, IVisualizerFactory>> list2 = this.themesList;
        list2.add(new Tuple2<>(new VisualizerThemeInfo(list2.size()), new IVisualizerFactory() { // from class: com.daaw.avee.Design.VisualizerThemes.2
            @Override // com.daaw.avee.Design.VisualizerThemes.IVisualizerFactory
            public RootElement create(int i) {
                return VisualizerThemes.createVisPreset1(i);
            }
        }));
        List<Tuple2<VisualizerThemeInfo, IVisualizerFactory>> list3 = this.themesList;
        list3.add(new Tuple2<>(new VisualizerThemeInfo(list3.size()), new IVisualizerFactory() { // from class: com.daaw.avee.Design.VisualizerThemes.3
            @Override // com.daaw.avee.Design.VisualizerThemes.IVisualizerFactory
            public RootElement create(int i) {
                return VisualizerThemes.createVisPreset2(i);
            }
        }));
        List<Tuple2<VisualizerThemeInfo, IVisualizerFactory>> list4 = this.themesList;
        list4.add(new Tuple2<>(new VisualizerThemeInfo(list4.size()), new IVisualizerFactory() { // from class: com.daaw.avee.Design.VisualizerThemes.4
            @Override // com.daaw.avee.Design.VisualizerThemes.IVisualizerFactory
            public RootElement create(int i) {
                return VisualizerThemes.createVisPreset3(i);
            }
        }));
        List<Tuple2<VisualizerThemeInfo, IVisualizerFactory>> list5 = this.themesList;
        list5.add(new Tuple2<>(new VisualizerThemeInfo(list5.size()), new IVisualizerFactory() { // from class: com.daaw.avee.Design.VisualizerThemes.5
            @Override // com.daaw.avee.Design.VisualizerThemes.IVisualizerFactory
            public RootElement create(int i) {
                return VisualizerThemes.createVisPreset4(i);
            }
        }));
        List<Tuple2<VisualizerThemeInfo, IVisualizerFactory>> list6 = this.themesList;
        list6.add(new Tuple2<>(new VisualizerThemeInfo(list6.size()), new IVisualizerFactory() { // from class: com.daaw.avee.Design.VisualizerThemes.6
            @Override // com.daaw.avee.Design.VisualizerThemes.IVisualizerFactory
            public RootElement create(int i) {
                return VisualizerThemes.createVisPreset5(i);
            }
        }));
        List<Tuple2<VisualizerThemeInfo, IVisualizerFactory>> list7 = this.themesList;
        list7.add(new Tuple2<>(new VisualizerThemeInfo(list7.size()), new IVisualizerFactory() { // from class: com.daaw.avee.Design.VisualizerThemes.7
            @Override // com.daaw.avee.Design.VisualizerThemes.IVisualizerFactory
            public RootElement create(int i) {
                return VisualizerThemes.createVisPreset6(i);
            }
        }));
        List<Tuple2<VisualizerThemeInfo, IVisualizerFactory>> list8 = this.themesList;
        list8.add(new Tuple2<>(new VisualizerThemeInfo(list8.size()), new IVisualizerFactory() { // from class: com.daaw.avee.Design.VisualizerThemes.8
            @Override // com.daaw.avee.Design.VisualizerThemes.IVisualizerFactory
            public RootElement create(int i) {
                return VisualizerThemes.createVisPreset7(i);
            }
        }));
        List<Tuple2<VisualizerThemeInfo, IVisualizerFactory>> list9 = this.themesList;
        list9.add(new Tuple2<>(new VisualizerThemeInfo(list9.size()), new IVisualizerFactory() { // from class: com.daaw.avee.Design.VisualizerThemes.9
            @Override // com.daaw.avee.Design.VisualizerThemes.IVisualizerFactory
            public RootElement create(int i) {
                return VisualizerThemes.createVisPreset8(i);
            }
        }));
        List<Tuple2<VisualizerThemeInfo, IVisualizerFactory>> list10 = this.themesList;
        list10.add(new Tuple2<>(new VisualizerThemeInfo(list10.size()), new IVisualizerFactory() { // from class: com.daaw.avee.Design.VisualizerThemes.10
            @Override // com.daaw.avee.Design.VisualizerThemes.IVisualizerFactory
            public RootElement create(int i) {
                return VisualizerThemes.createVisPreset9(i);
            }
        }));
        List<Tuple2<VisualizerThemeInfo, IVisualizerFactory>> list11 = this.themesList;
        list11.add(new Tuple2<>(new VisualizerThemeInfo(list11.size()), new IVisualizerFactory() { // from class: com.daaw.avee.Design.VisualizerThemes.11
            @Override // com.daaw.avee.Design.VisualizerThemes.IVisualizerFactory
            public RootElement create(int i) {
                return VisualizerThemes.createVisPreset10(i);
            }
        }));
        List<Tuple2<VisualizerThemeInfo, IVisualizerFactory>> list12 = this.themesList;
        list12.add(new Tuple2<>(new VisualizerThemeInfo(list12.size()), new IVisualizerFactory() { // from class: com.daaw.avee.Design.VisualizerThemes.12
            @Override // com.daaw.avee.Design.VisualizerThemes.IVisualizerFactory
            public RootElement create(int i) {
                return VisualizerThemes.createVisPreset11(i);
            }
        }));
        List<Tuple2<VisualizerThemeInfo, IVisualizerFactory>> list13 = this.themesList;
        list13.add(new Tuple2<>(new VisualizerThemeInfo(list13.size()), new IVisualizerFactory() { // from class: com.daaw.avee.Design.VisualizerThemes.13
            @Override // com.daaw.avee.Design.VisualizerThemes.IVisualizerFactory
            public RootElement create(int i) {
                return VisualizerThemes.createVisPreset12(i);
            }
        }));
        List<Tuple2<VisualizerThemeInfo, IVisualizerFactory>> list14 = this.themesList;
        list14.add(new Tuple2<>(new VisualizerThemeInfo(list14.size()), new IVisualizerFactory() { // from class: com.daaw.avee.Design.VisualizerThemes.14
            @Override // com.daaw.avee.Design.VisualizerThemes.IVisualizerFactory
            public RootElement create(int i) {
                return VisualizerThemes.createVisPreset13(i);
            }
        }));
        List<Tuple2<VisualizerThemeInfo, IVisualizerFactory>> list15 = this.themesList;
        list15.add(new Tuple2<>(new VisualizerThemeInfo(list15.size()), new IVisualizerFactory() { // from class: com.daaw.avee.Design.VisualizerThemes.15
            @Override // com.daaw.avee.Design.VisualizerThemes.IVisualizerFactory
            public RootElement create(int i) {
                return VisualizerThemes.createVisPreset14(i);
            }
        }));
        List<Tuple2<VisualizerThemeInfo, IVisualizerFactory>> list16 = this.themesList;
        list16.add(new Tuple2<>(new VisualizerThemeInfo(list16.size()), new IVisualizerFactory() { // from class: com.daaw.avee.Design.VisualizerThemes.16
            @Override // com.daaw.avee.Design.VisualizerThemes.IVisualizerFactory
            public RootElement create(int i) {
                return VisualizerThemes.createVisPreset15(i);
            }
        }));
        List<Tuple2<VisualizerThemeInfo, IVisualizerFactory>> list17 = this.themesList;
        list17.add(new Tuple2<>(new VisualizerThemeInfo(list17.size()), new IVisualizerFactory() { // from class: com.daaw.avee.Design.VisualizerThemes.17
            @Override // com.daaw.avee.Design.VisualizerThemes.IVisualizerFactory
            public RootElement create(int i) {
                return VisualizerThemes.createVisPreset16(i);
            }
        }));
        List<Tuple2<VisualizerThemeInfo, IVisualizerFactory>> list18 = this.themesList;
        list18.add(new Tuple2<>(new VisualizerThemeInfo(list18.size()), new IVisualizerFactory() { // from class: com.daaw.avee.Design.VisualizerThemes.18
            @Override // com.daaw.avee.Design.VisualizerThemes.IVisualizerFactory
            public RootElement create(int i) {
                return VisualizerThemes.createVisPreset17(i);
            }
        }));
        for (int i = 0; i < 18; i++) {
            List<Tuple2<VisualizerThemeInfo, IVisualizerFactory2>> list19 = this.themesList2;
            list19.add(new Tuple2<>(new VisualizerThemeInfo(list19.size()), new IVisualizerFactory2() { // from class: com.daaw.avee.Design.VisualizerThemes.19
                @Override // com.daaw.avee.Design.VisualizerThemes.IVisualizerFactory2
                public CustomScene create(int i2) {
                    return VisualizerThemes.this.getThemeObject2(i2, false);
                }
            }));
        }
    }

    public boolean isTemplateIndex(int i) {
        return i < this.themesList2.size();
    }

    public List<Tuple2<VisualizerThemeInfo, IVisualizerFactory2>> getThemesList() {
        return this.themesList2;
    }

    private RootElement getThemeObject(int i, boolean z) {
        if (i < 0 || i >= this.themesList.size()) {
            return null;
        }
        return this.themesList.get(i).obj2.create(i);
    }

    public CustomScene getThemeObject2(int i) {
        return getThemeObject2(i, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CustomScene getThemeObject2(int i, boolean z) {
        CustomScene themeObject2Pure = getThemeObject2Pure(i, z);
        if (themeObject2Pure != null) {
            themeObject2Pure.setBasedOnTemplate(i);
        }
        return themeObject2Pure;
    }

    private CustomScene getThemeObject2Pure(int i, boolean z) {
        Context appContext = PlayerCore.s().getAppContext();
        if (appContext == null) {
            return null;
        }
        Resources resources = appContext.getResources();
        switch (i) {
            case 0:
                return CustomScene.CreateFromString(UtilsFileSys.readResource(resources, R.raw.visualizer_0));
            case 1:
                return CustomScene.CreateFromString(UtilsFileSys.readResource(resources, R.raw.visualizer_1));
            case 2:
                return CustomScene.CreateFromString(UtilsFileSys.readResource(resources, R.raw.visualizer_2));
            case 3:
                return CustomScene.CreateFromString(UtilsFileSys.readResource(resources, R.raw.visualizer_3));
            case 4:
                return CustomScene.CreateFromString(UtilsFileSys.readResource(resources, R.raw.visualizer_4));
            case 5:
                return CustomScene.CreateFromString(UtilsFileSys.readResource(resources, R.raw.visualizer_5));
            case 6:
                return CustomScene.CreateFromString(UtilsFileSys.readResource(resources, R.raw.visualizer_6));
            case 7:
                return CustomScene.CreateFromString(UtilsFileSys.readResource(resources, R.raw.visualizer_7));
            case 8:
                return CustomScene.CreateFromString(UtilsFileSys.readResource(resources, R.raw.visualizer_8));
            case 9:
                return CustomScene.CreateFromString(UtilsFileSys.readResource(resources, R.raw.visualizer_9));
            case 10:
                return CustomScene.CreateFromString(UtilsFileSys.readResource(resources, R.raw.visualizer_10));
            case 11:
                return CustomScene.CreateFromString(UtilsFileSys.readResource(resources, R.raw.visualizer_11));
            case 12:
                return CustomScene.CreateFromString(UtilsFileSys.readResource(resources, R.raw.visualizer_12));
            case 13:
                return CustomScene.CreateFromString(UtilsFileSys.readResource(resources, R.raw.visualizer_13));
            case 14:
                return CustomScene.CreateFromString(UtilsFileSys.readResource(resources, R.raw.visualizer_14));
            case 15:
                return CustomScene.CreateFromString(UtilsFileSys.readResource(resources, R.raw.visualizer_15));
            case 16:
                return CustomScene.CreateFromString(UtilsFileSys.readResource(resources, R.raw.visualizer_16));
            case 17:
                return CustomScene.CreateFromString(UtilsFileSys.readResource(resources, R.raw.visualizer_17));
            default:
                return null;
        }
    }

    public RootElement getThemeObjectForLoading(int i, boolean z, String str) {
        return onFinishedDefaultRoot(createDefaultRoot(i), null, false);
    }

    public RootElement getThemeObjectForLoading2(int i, boolean z, String str) {
        return onFinishedDefaultRoot(createDefaultRoot(i), null, false);
    }

    static RootElement createDefaultRoot(int i) {
        RootElement rootElement = new RootElement(ACTUAL_ROOT_VERSION, i);
        rootElement.addChildAtEnd(new Composition(true));
        return rootElement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RootElement createVisPreset0(int i, String str) {
        RootElement createDefaultRoot = createDefaultRoot(i);
        AudioDataProviderElement audioDataProviderElement = new AudioDataProviderElement();
        SegmentAudioWaveformData segmentAudioWaveformData = new SegmentAudioWaveformData();
        segmentAudioWaveformData.setSampleInCountPower(13);
        audioDataProviderElement.setSegmentDataProvider(segmentAudioWaveformData);
        ImageElement imageElement = new ImageElement();
        imageElement.setBlurAmount(false);
        imageElement.setPosition(0.0f, 0.0f);
        imageElement.setLocalPosition(0.0f, 0.0f);
        imageElement.setScale(1.0f, 1.0f);
        SegmentElement segmentElement = new SegmentElement();
        segmentElement.setSegmentPath(new SegmentPathHorizontalLine());
        segmentElement.setSegmentRenderer(new SegmentRendererLine().setColor(ViewCompat.MEASURED_SIZE_MASK, -1, ViewCompat.MEASURED_SIZE_MASK));
        segmentElement.setSegmentRenderer2(new SegmentRendererLine().setColor(ViewCompat.MEASURED_SIZE_MASK, -1, -1).setBarHeightMultiplier(0.3f));
        segmentElement.setPosition(0.0f, 0.5f);
        segmentElement.setLocalPosition(0.0f, 0.5f);
        segmentElement.setScale(1.0f, 0.8f);
        segmentElement.setBlendMode(0);
        createDefaultRoot.addToCompositionAtEnd(audioDataProviderElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement);
        createDefaultRoot.addToCompositionAtEnd(segmentElement);
        return onFinishedDefaultRoot(createDefaultRoot, null, true);
    }

    static RootElement createVisPreset1(int i) {
        RootElement createDefaultRoot = createDefaultRoot(i);
        AudioDataProviderElement audioDataProviderElement = new AudioDataProviderElement();
        SegmentAudioSpectrumData segmentAudioSpectrumData = new SegmentAudioSpectrumData();
        segmentAudioSpectrumData.setDataMode(1);
        segmentAudioSpectrumData.setSampleOutCount(63, 0.06f, 4);
        audioDataProviderElement.setSegmentDataProvider(segmentAudioSpectrumData);
        ImageElement imageElement = new ImageElement();
        imageElement.setBlurAmount(false);
        imageElement.setScale(1.0f, 1.0f);
        ParticlesElement particlesElement = new ParticlesElement();
        particlesElement.setPosition(0.5f, 0.5f);
        particlesElement.setScale(1.0f, 1.0f);
        particlesElement.setParticlesCountLimit(1000);
        particlesElement.setParticlesSpawnTime(0.05f);
        particlesElement.setArea(new AreaRect().setVectorAngle(270.0f).setUseRandomVectorInstead(false));
        particlesElement.setBlendMode(2);
        BasicParticleFactory particlesFactory = particlesElement.getParticlesFactory();
        particlesFactory.setSideSineWaveFreq(4.0f);
        particlesFactory.setSideSineWaveFreqRandom(2.0f);
        particlesFactory.setSideSineWaveMag(2.0f);
        particlesFactory.setSideSineWaveMagRandom(2.0f);
        particlesFactory.setLifetime(1.5f);
        particlesFactory.setFadeInAndOutTime(0.3f);
        particlesFactory.setStartSize(4.0f);
        particlesFactory.setFadeInSize(4.0f);
        particlesFactory.setEndSize(4.0f);
        particlesFactory.setColorBoth(-858993460);
        particlesFactory.setSpeed(150.0f);
        particlesFactory.setTrailLength(0.3f);
        SegmentElement segmentElement = new SegmentElement();
        segmentElement.setSegmentPath(new SegmentPathHorizontalLine());
        segmentElement.setSegmentRenderer(new SegmentRendererRoundBar().setBarWidth(0.8f).setColor(-2130706433, -1, -2130706433));
        segmentElement.setPosition(0.5f, 0.975f);
        segmentElement.setPositionUniform(false, false);
        segmentElement.setLocalPosition(0.5f, 0.5f);
        segmentElement.setScale(1.0f, 1.0f);
        segmentElement.setMinBarHeightScale(0.003f);
        segmentElement.setSoftness(5);
        segmentElement.setBarHeightScale(2.5f);
        createDefaultRoot.addToCompositionAtEnd(audioDataProviderElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement);
        createDefaultRoot.addToCompositionAtEnd(segmentElement);
        createDefaultRoot.addToCompositionAtEnd(particlesElement);
        return onFinishedDefaultRoot(createDefaultRoot, segmentAudioSpectrumData, true);
    }

    static RootElement createVisPreset2(int i) {
        RootElement createDefaultRoot = createDefaultRoot(i);
        AudioDataProviderElement audioDataProviderElement = new AudioDataProviderElement();
        SegmentAudioSpectrumData segmentAudioSpectrumData = new SegmentAudioSpectrumData();
        segmentAudioSpectrumData.setDataMode(1);
        segmentAudioSpectrumData.setSampleOutCount(160, 0.2f, 0);
        segmentAudioSpectrumData.setSampleInCountPower(11);
        segmentAudioSpectrumData.setFftFilter(1, 0.6f);
        audioDataProviderElement.setSegmentDataProvider(segmentAudioSpectrumData);
        ImageElement imageElement = new ImageElement();
        imageElement.setScale(1.0f, 1.0f);
        imageElement.setAlbumArtGenerateHint(1);
        ImageElement imageElement2 = new ImageElement();
        imageElement2.setBlurAmount(false);
        imageElement2.setPosition(0.5f, 0.5f);
        imageElement2.setLocalPosition(0.5f, -0.3f);
        imageElement2.setScale(0.35f, 0.35f);
        imageElement2.setLocalPositionUniform(true, true);
        imageElement2.setScaleUniform(true, true);
        TextElement textElement = new TextElement();
        textElement.setColor(color1);
        textElement.setBlendMode(textBlendMode);
        textElement.setFontSize(56);
        textElement.setText(MeasureDefs.textArtist);
        textElement.setPosition(0.5f, 0.5f);
        textElement.setLocalPosition(0.5f, 1.4f);
        TextElement textElement2 = new TextElement();
        textElement2.setColor(color1);
        textElement2.setBlendMode(textBlendMode);
        textElement2.setFontSize(28);
        textElement2.setText(MeasureDefs.textTitle);
        textElement2.setPosition(0.5f, 0.5f);
        textElement2.setLocalPosition(0.5f, 1.4f);
        ParticlesElement particlesElement = new ParticlesElement();
        particlesElement.setPosition(0.5f, 0.5f);
        particlesElement.setScale(1.0f, 1.0f);
        particlesElement.setParticlesCountLimit(1000);
        particlesElement.setParticlesSpawnTime(0.05f);
        particlesElement.setArea(new AreaHorizontalLine().setVectorAngle(270.0f).setUseRandomVectorInstead(false));
        particlesElement.setBlendMode(2);
        BasicParticleFactory particlesFactory = particlesElement.getParticlesFactory();
        particlesFactory.setLifetime(0.7f);
        particlesFactory.setFadeInAndOutTime(0.3f);
        particlesFactory.setStartSize(10.0f);
        particlesFactory.setFadeInSize(10.0f);
        particlesFactory.setEndSize(0.5f);
        particlesFactory.setEndSizeRandom(6.0f);
        particlesFactory.setColorBoth(-858993460);
        particlesFactory.setSpeed(50.0f);
        particlesFactory.setSpeedRandom(50.0f);
        SegmentElement segmentElement = new SegmentElement();
        segmentElement.setSegmentPath(new SegmentPathHorizontalLine());
        segmentElement.setSegmentRenderer(new SegmentRendererBar());
        segmentElement.setPosition(0.5f, 0.5f);
        segmentElement.setScale(1.0f, -1.0f);
        segmentElement.setMinBarHeightScale(0.003f);
        BlurEffectElement blurEffectElement = new BlurEffectElement();
        blurEffectElement.setRenderContentOnTop(true);
        blurEffectElement.setBlendMode(2);
        Composition composition = new Composition();
        createDefaultRoot.addChildAtEnd(composition);
        composition.addChildAtEnd(segmentElement);
        composition.addChildAtEnd(particlesElement);
        createDefaultRoot.addToCompositionAtEnd(audioDataProviderElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement);
        createDefaultRoot.addToCompositionAtEnd(textElement);
        createDefaultRoot.addToCompositionAtEnd(textElement2);
        createDefaultRoot.addToCompositionAtEnd(imageElement2);
        createDefaultRoot.addToCompositionAtEnd(blurEffectElement);
        return onFinishedDefaultRoot(createDefaultRoot, segmentAudioSpectrumData, true);
    }

    static RootElement createVisPreset3(int i) {
        RootElement createDefaultRoot = createDefaultRoot(i);
        AudioDataProviderElement audioDataProviderElement = new AudioDataProviderElement();
        SegmentAudioSpectrumData segmentAudioSpectrumData = new SegmentAudioSpectrumData();
        segmentAudioSpectrumData.setSampleOutCount(160, 20.0f, 18000.0f, false, 4, 0.15f, 3, 3, 0.0f);
        segmentAudioSpectrumData.setSampleInCountPower(11);
        audioDataProviderElement.setSegmentDataProvider(segmentAudioSpectrumData);
        ImageElement imageElement = new ImageElement();
        imageElement.setBlurAmount(false);
        imageElement.setScale(1.1f, 1.1f);
        imageElement.setAlbumArtGenerateHint(1);
        imageElement.setGeneratedAlbumArtColor(ViewCompat.MEASURED_STATE_MASK);
        imageElement.setBlendMode(0);
        imageElement.setMeasurePos(new MeasuredVar(MeasureDefs.constantCamShakeLess, 0.6f, 0.2f));
        imageElement.setMeasureRot(new MeasuredVar(MeasureDefs.constantCamShakeRotLess, 0.25f, 0.2f));
        ImageElement imageElement2 = new ImageElement();
        imageElement2.setBlurAmount(false);
        imageElement2.setBlurredBorder(true);
        imageElement2.setPosition(0.5f, 0.5f);
        imageElement2.setScale(0.4f, 0.4f);
        imageElement2.setLocalPositionUniform(true, true);
        imageElement2.setScaleUniform(true, true);
        SegmentElement segmentElement = new SegmentElement();
        segmentElement.setSegmentPath(new SegmentPathSided().setSides(4).setRadius(1.433f));
        segmentElement.setSegmentRenderer(new SegmentRendererRoundBar().setBarWidth(0.8f).setMirror(false).setColor(SupportMenu.CATEGORY_MASK, SupportMenu.CATEGORY_MASK).setBarHeightMultiplier(1.6f));
        segmentElement.setSegmentRenderer2(new SegmentRendererRoundBar().setBarWidth(0.8f).setColor(ViewCompat.MEASURED_STATE_MASK, ViewCompat.MEASURED_STATE_MASK, ViewCompat.MEASURED_STATE_MASK));
        segmentElement.setBlendMode(0);
        segmentElement.setRot(0.125f);
        segmentElement.setPosition(0.5f, 0.5f);
        segmentElement.setScale(0.4f, 0.4f);
        segmentElement.setBarHeightScale(2.0f);
        segmentElement.setMinBarHeightScale(0.006f);
        BlurEffectElement blurEffectElement = new BlurEffectElement();
        blurEffectElement.setRenderContentOnTop(true);
        blurEffectElement.setBlendMode(0);
        blurEffectElement.setBlendModeContent(0);
        blurEffectElement.setColor2(ViewCompat.MEASURED_STATE_MASK);
        Composition composition = new Composition();
        createDefaultRoot.addChildAtEnd(composition);
        composition.addChildAtEnd(segmentElement);
        createDefaultRoot.addToCompositionAtEnd(audioDataProviderElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement);
        createDefaultRoot.addToCompositionAtEnd(blurEffectElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement2);
        return onFinishedDefaultRoot(createDefaultRoot, segmentAudioSpectrumData, true);
    }

    static RootElement createVisPreset4(int i) {
        RootElement createDefaultRoot = createDefaultRoot(i);
        AudioDataProviderElement audioDataProviderElement = new AudioDataProviderElement();
        SegmentAudioSpectrumData segmentAudioSpectrumData = new SegmentAudioSpectrumData();
        segmentAudioSpectrumData.setDataMode(2);
        segmentAudioSpectrumData.setAweightFft(0.5f);
        audioDataProviderElement.setSegmentDataProvider(segmentAudioSpectrumData);
        ImageElement imageElement = new ImageElement();
        imageElement.setScale(1.0f, 1.0f);
        imageElement.setAlbumArtGenerateHint(1);
        SegmentElement segmentElement = new SegmentElement();
        segmentElement.setSegmentPath(new SegmentPathCircle());
        segmentElement.setSegmentRenderer(new SegmentRendererRoundBar().setBarWidth(0.9f));
        segmentElement.setPosition(0.5f, 0.5f);
        segmentElement.setScale(0.4f, 0.4f);
        segmentElement.setBarHeightScale(4.0f);
        segmentElement.setMinBarHeightScale(0.0f);
        segmentElement.setSoftness(3);
        BlurEffectElement blurEffectElement = new BlurEffectElement();
        blurEffectElement.setRenderContentOnTop(true);
        blurEffectElement.setColor2(0);
        blurEffectElement.setBlendMode(2);
        blurEffectElement.setBlurLayerScale(0, 0.0f, 0.0f);
        blurEffectElement.setBlurLayerScale(1, 1.9f, 1.9f);
        ImageElement imageElement2 = new ImageElement();
        imageElement2.setBlurAmount(false);
        imageElement2.setBlurredBorder(false);
        imageElement2.setPosition(0.5f, 0.5f);
        imageElement2.setScale(0.4f, 0.4f);
        imageElement2.setLocalPositionUniform(true, true);
        imageElement2.setScaleUniform(true, true);
        imageElement2.setCircleShape(true);
        Composition composition = new Composition();
        createDefaultRoot.addChildAtEnd(composition);
        composition.addChildAtEnd(segmentElement);
        createDefaultRoot.addToCompositionAtEnd(audioDataProviderElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement);
        createDefaultRoot.addToCompositionAtEnd(blurEffectElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement2);
        return onFinishedDefaultRoot(createDefaultRoot, segmentAudioSpectrumData, true);
    }

    static RootElement createVisPreset5(int i) {
        RootElement createDefaultRoot = createDefaultRoot(i);
        AudioDataProviderElement audioDataProviderElement = new AudioDataProviderElement();
        SegmentAudioSpectrumData segmentAudioSpectrumData = new SegmentAudioSpectrumData();
        segmentAudioSpectrumData.setSampleOutCount(64, 20.0f, 18000.0f, false, 0, 0.3f);
        segmentAudioSpectrumData.setDataMode(2);
        segmentAudioSpectrumData.setAweightFft(1.0f);
        segmentAudioSpectrumData.setFftFilter(2, 1.0f);
        audioDataProviderElement.setSegmentDataProvider(segmentAudioSpectrumData);
        ImageElement imageElement = new ImageElement();
        imageElement.setScale(1.0f, 1.0f);
        imageElement.setColor(-5197648);
        imageElement.setAlbumArtGenerateHint(1);
        SegmentElement segmentElement = new SegmentElement();
        segmentElement.setSegmentPath(new SegmentPathCircle());
        segmentElement.setSegmentRenderer(new SegmentRendererSharpBar().setColor(-27830, -2130734262, -27830));
        segmentElement.setPosition(0.5f, 0.5f);
        segmentElement.setScale(0.4f, 0.4f);
        segmentElement.setMinBarHeightScale(0.01f);
        segmentElement.setBarHeightScale(8.0f);
        segmentElement.setSoftness(1);
        BlurEffectElement blurEffectElement = new BlurEffectElement();
        blurEffectElement.setRenderContentOnTop(true);
        blurEffectElement.setColor2(-6090736);
        blurEffectElement.setBlendMode(2);
        blurEffectElement.setBlurLayerScale(0, 1.0f, 1.0f);
        blurEffectElement.setBlurLayerScale(1, 1.9f, 1.9f);
        ImageElement imageElement2 = new ImageElement();
        imageElement2.setBlurAmount(false);
        imageElement2.setBlurredBorder(false);
        imageElement2.setPosition(0.5f, 0.5f);
        imageElement2.setScale(0.4f, 0.4f);
        imageElement2.setLocalPositionUniform(true, true);
        imageElement2.setScaleUniform(true, true);
        imageElement2.setCircleShape(true);
        Composition composition = new Composition();
        createDefaultRoot.addChildAtEnd(composition);
        composition.addChildAtEnd(segmentElement);
        createDefaultRoot.addToCompositionAtEnd(audioDataProviderElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement);
        createDefaultRoot.addToCompositionAtEnd(blurEffectElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement2);
        return onFinishedDefaultRoot(createDefaultRoot, segmentAudioSpectrumData, true);
    }

    static RootElement createVisPreset6(int i) {
        RootElement createDefaultRoot = createDefaultRoot(i);
        AudioDataProviderElement audioDataProviderElement = new AudioDataProviderElement();
        SegmentAudioSpectrumData segmentAudioSpectrumData = new SegmentAudioSpectrumData();
        segmentAudioSpectrumData.setDataMode(2);
        segmentAudioSpectrumData.setSampleInCountPower(11);
        segmentAudioSpectrumData.setSampleOutCount(150, 20.0f, 18000.0f, false, 0, 0.15f);
        segmentAudioSpectrumData.setAweightFft(0.5f);
        audioDataProviderElement.setSegmentDataProvider(segmentAudioSpectrumData);
        ImageElement imageElement = new ImageElement();
        imageElement.setScale(1.0f, 1.0f);
        imageElement.setColor(-5197648);
        imageElement.setAlbumArtGenerateHint(1);
        ParticlesElement particlesElement = new ParticlesElement();
        particlesElement.setPosition(0.5f, 0.5f);
        particlesElement.setScale(1.0f, 1.0f);
        particlesElement.setParticlesCountLimit(1000);
        particlesElement.setParticlesSpawnTime(0.03f);
        particlesElement.setArea(new AreaRect());
        particlesElement.setBlendMode(2);
        particlesElement.setPerspectiveDepth(900.0f);
        particlesElement.setPerspectiveFov(150.0f);
        BasicParticleFactory particlesFactory = particlesElement.getParticlesFactory();
        particlesFactory.setColorBoth(-858993460);
        particlesFactory.setLifetime(8.0f);
        particlesFactory.setFadeInAndOutTime(0.1f);
        particlesFactory.setStartSize(4.0f);
        particlesFactory.setFadeInSize(4.0f);
        particlesFactory.setEndSize(4.0f);
        particlesFactory.setEndSizeRandom(8.0f);
        particlesFactory.setSpeed(100.0f);
        particlesFactory.setSpeedRandom(60.0f);
        SegmentElement segmentElement = new SegmentElement();
        segmentElement.setSegmentPath(new SegmentPathCircle());
        segmentElement.setSegmentRenderer(new SegmentRendererLine().setMirror(false).setColor(-16776961, -16711681, -16776961));
        segmentElement.setPosition(0.5f, 0.5f);
        segmentElement.setScale(0.4f, 0.4f);
        segmentElement.setScaleMeasure(new MeasuredVar(MeasureDefs.beat, 0.15f));
        segmentElement.setMinBarHeightScale(0.01f);
        segmentElement.setBarHeightScale(4.0f);
        segmentElement.setSoftness(3);
        BlurEffectElement blurEffectElement = new BlurEffectElement();
        blurEffectElement.setRenderContentOnTop(true);
        blurEffectElement.setColor2(-14862427);
        blurEffectElement.setBlendMode(2);
        blurEffectElement.setBlurLayerScale(0, 1.0f, 1.0f);
        ImageElement imageElement2 = new ImageElement();
        imageElement2.setBlurAmount(false);
        imageElement2.setBlurredBorder(false);
        imageElement2.setPosition(0.5f, 0.5f);
        imageElement2.setScale(0.4f, 0.4f);
        imageElement2.setLocalPositionUniform(true, true);
        imageElement2.setScaleUniform(true, true);
        imageElement2.setCircleShape(true);
        imageElement2.setScaleMeasure(new MeasuredVar(MeasureDefs.beat, 0.15f));
        Composition composition = new Composition();
        createDefaultRoot.addChildAtEnd(composition);
        composition.addChildAtEnd(particlesElement);
        composition.addChildAtEnd(segmentElement);
        createDefaultRoot.addToCompositionAtEnd(audioDataProviderElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement);
        createDefaultRoot.addToCompositionAtEnd(blurEffectElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement2);
        return onFinishedDefaultRoot(createDefaultRoot, segmentAudioSpectrumData, true);
    }

    static RootElement createVisPreset7(int i) {
        RootElement createDefaultRoot = createDefaultRoot(i);
        AudioDataProviderElement audioDataProviderElement = new AudioDataProviderElement();
        SegmentAudioSpectrumData segmentAudioSpectrumData = new SegmentAudioSpectrumData();
        segmentAudioSpectrumData.setDataMode(2);
        segmentAudioSpectrumData.setSampleOutCount(128, 25.0f, 18000.0f, false, 3, 0.0f);
        audioDataProviderElement.setSegmentDataProvider(segmentAudioSpectrumData);
        ImageElement imageElement = new ImageElement();
        imageElement.setScale(1.0f, 1.0f);
        imageElement.setColor(-12566464);
        imageElement.setKeepAspectRatio(false);
        imageElement.setAlbumArtGenerateHint(1);
        imageElement.setGeneratedAlbumArtColor(ViewCompat.MEASURED_STATE_MASK);
        ParticlesElement particlesElement = new ParticlesElement();
        particlesElement.setColor(-1);
        particlesElement.setPosition(0.5f, 0.5f);
        particlesElement.setScale(1.0f, 1.0f);
        particlesElement.setParticlesCountLimit(1000);
        particlesElement.setParticlesSpawnTime(0.05f);
        particlesElement.setParticlesScale(5.0f);
        particlesElement.setArea(new AreaRect().setUseRandomVectorInstead(true));
        particlesElement.setBlendMode(2);
        particlesElement.setMeasureOverallSpeed(new MeasuredVar(MeasureDefs.beat, 0.05f));
        particlesElement.setCustomImage(ParticlesElement.internalParticles[2]);
        BasicParticleFactory particlesFactory = particlesElement.getParticlesFactory();
        particlesFactory.setSideSineWaveFreq(1.5f);
        particlesFactory.setSideSineWaveFreqRandom(0.0f);
        particlesFactory.setSideSineWaveMag(3.5f);
        particlesFactory.setSideSineWaveMagRandom(0.0f);
        particlesFactory.setColorFrom(-16736256);
        particlesFactory.setColorTo(0.5f, 1.0f, 0.0f, 0.0f);
        particlesFactory.setLifetime(1.0f);
        particlesFactory.setFadeInAndOutTime(0.1f);
        particlesFactory.setSpeed(3.0f);
        particlesFactory.setStartSize(10.0f);
        particlesFactory.setFadeInSize(0.9f);
        particlesFactory.setEndSize(5.0f);
        particlesFactory.setEndSizeRandom(2.0f);
        particlesFactory.setSpeed(30.0f);
        particlesFactory.setSpeedRandom(0.0f);
        ImageElement imageElement2 = new ImageElement();
        imageElement2.setBlurAmount(false);
        imageElement2.setBlurredBorder(false);
        imageElement2.setPosition(0.5f, 0.5f);
        imageElement2.setScale(0.5f, 0.5f);
        imageElement2.setLocalPositionUniform(true, true);
        imageElement2.setScaleUniform(true, true);
        imageElement2.setCircleShape(true);
        imageElement2.setSegmentPath(new SegmentPathSided().setSides(3).setRadius(1.433f));
        SegmentElement segmentElement = new SegmentElement();
        segmentElement.setSegmentPath(new SegmentPathSided().setSides(3).setRadius(1.5f));
        segmentElement.setSegmentRenderer(new SegmentRendererSharpBar().setBarWidth(0.3f).setFixedLineHeight(0.0f).setColor(-16711936));
        segmentElement.setSegmentRenderer2(new SegmentRendererBar().setBarWidth(0.6f).setBarHeightMultiplier(0.0f).setFixedLineHeight(-5.0f).setColor(1073807104));
        segmentElement.setPosition(0.5f, 0.5f);
        segmentElement.setScale(0.5f, 0.5f);
        segmentElement.setMinBarHeightScale(0.005f);
        segmentElement.setBarHeightScale(2.0f);
        BlurEffectElement blurEffectElement = new BlurEffectElement();
        blurEffectElement.setRenderContentOnTop(true);
        blurEffectElement.setColor2(-16711776);
        blurEffectElement.setBlendMode(2);
        blurEffectElement.setBlurLayerScale(0, 1.0f, 1.0f);
        Composition composition = new Composition();
        createDefaultRoot.addChildAtEnd(composition);
        composition.addChildAtEnd(segmentElement);
        composition.addChildAtEnd(particlesElement);
        createDefaultRoot.addToCompositionAtEnd(audioDataProviderElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement);
        createDefaultRoot.addToCompositionAtEnd(blurEffectElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement2);
        return onFinishedDefaultRoot(createDefaultRoot, segmentAudioSpectrumData, true);
    }

    static RootElement createVisPreset8(int i) {
        RootElement createDefaultRoot = createDefaultRoot(i);
        AudioDataProviderElement audioDataProviderElement = new AudioDataProviderElement();
        SegmentAudioSpectrumData segmentAudioSpectrumData = new SegmentAudioSpectrumData();
        segmentAudioSpectrumData.setDataMode(1);
        segmentAudioSpectrumData.setSampleOutCount(180, 0.25f, 5);
        audioDataProviderElement.setSegmentDataProvider(segmentAudioSpectrumData);
        ImageElement imageElement = new ImageElement();
        imageElement.setColor(-65396);
        imageElement.setScale(1.0f, 1.0f);
        TextElement textElement = new TextElement();
        textElement.setColor(-2140872560);
        textElement.setBlendMode(textBlendMode);
        textElement.setFontSize(60);
        textElement.setText(MeasureDefs.textArtist);
        textElement.setPosition(0.5f, 0.5f);
        textElement.setLocalPosition(0.5f, 1.4f);
        TextElement textElement2 = new TextElement();
        textElement2.setColor(-2140872560);
        textElement2.setBlendMode(textBlendMode);
        textElement2.setFontSize(40);
        textElement2.setText(MeasureDefs.textTitle);
        textElement2.setPosition(0.5f, 0.5f);
        textElement2.setLocalPosition(0.5f, -2.1f);
        SegmentElement segmentElement = new SegmentElement();
        segmentElement.setSegmentPath(new SegmentPathHorizontalLine());
        segmentElement.setSegmentRenderer(new SegmentRendererBar().setBarWidth(0.7f).setMirror(true).setColor(-2130706433));
        segmentElement.setPosition(0.5f, 0.5f);
        segmentElement.setScale(1.0f, -1.0f);
        segmentElement.setMinBarHeightScale(0.003f);
        segmentElement.setBarHeightScale(2.0f);
        BlurEffectElement blurEffectElement = new BlurEffectElement();
        blurEffectElement.setColor2(-14255940);
        blurEffectElement.setRenderContentOnTop(true);
        blurEffectElement.setBlurLayerScale(0, 1.0f, 1.0f);
        blurEffectElement.setBlurLayerScale(1, 6.5f, 10.0f);
        blurEffectElement.setBlurLayerScale(2, 9.5f, 20.0f);
        blurEffectElement.setBlendMode(2);
        Composition composition = new Composition();
        createDefaultRoot.addChildAtEnd(composition);
        composition.addChildAtEnd(segmentElement);
        composition.addChildAtEnd(textElement);
        composition.addChildAtEnd(textElement2);
        createDefaultRoot.addToCompositionAtEnd(audioDataProviderElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement);
        createDefaultRoot.addToCompositionAtEnd(blurEffectElement);
        return onFinishedDefaultRoot(createDefaultRoot, segmentAudioSpectrumData, true);
    }

    static RootElement createVisPreset9(int i) {
        RootElement createDefaultRoot = createDefaultRoot(i);
        AudioDataProviderElement audioDataProviderElement = new AudioDataProviderElement();
        SegmentAudioSpectrumData segmentAudioSpectrumData = new SegmentAudioSpectrumData();
        segmentAudioSpectrumData.setDataMode(2);
        segmentAudioSpectrumData.setSampleInCountPower(11);
        segmentAudioSpectrumData.setSampleOutCount(ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION, 15.0f, 1100.0f, true, 1, 1.0f, 15, 15, 0.0f);
        segmentAudioSpectrumData.setSteadySmooth(70.0f);
        segmentAudioSpectrumData.setFftFilter(4, 2.0f);
        segmentAudioSpectrumData.setAweightFft(0.3f);
        audioDataProviderElement.setSegmentDataProvider(segmentAudioSpectrumData);
        ImageElement imageElement = new ImageElement();
        imageElement.setScale(1.2f, 1.2f);
        imageElement.setColor(-1);
        imageElement.setColorTo(ViewCompat.MEASURED_STATE_MASK);
        imageElement.setAlbumArtGenerateHint(1);
        imageElement.setScaleMeasure(new MeasuredVar(MeasureDefs.beat, -0.1f, -0.1f));
        imageElement.setMeasureColor(new MeasuredVar(MeasureDefs.beat, 1.0f));
        imageElement.setBlurAmount(false);
        ParticlesElement particlesElement = new ParticlesElement();
        particlesElement.setPosition(0.5f, 0.5f);
        particlesElement.setParticlesCountLimit(1000);
        particlesElement.setParticlesSpawnTime(0.02f);
        particlesElement.setArea(new AreaRect().setVectorZ(1.0f));
        particlesElement.setBlendMode(2);
        particlesElement.setMeasureOverallSpeed(new MeasuredVar(MeasureDefs.beat, 0.05f));
        particlesElement.setMirrorX(true);
        particlesElement.setParticlesScale(0.5f);
        particlesElement.setCustomImage(ParticlesElement.internalParticles[1]);
        particlesElement.setPerspectiveDepth(900.0f);
        particlesElement.setPerspectiveFov(90.0f);
        BasicParticleFactory particlesFactory = particlesElement.getParticlesFactory();
        particlesFactory.setColorBoth(-858993460);
        particlesFactory.setLifetime(8.0f);
        particlesFactory.setFadeInAndOutTime(0.1f);
        particlesFactory.setStartSize(0.0f);
        particlesFactory.setFadeInSize(4.0f);
        particlesFactory.setEndSize(4.0f);
        particlesFactory.setEndSizeRandom(0.0f);
        particlesFactory.setSpeed(100.0f);
        particlesFactory.setSpeedRandom(100.0f);
        particlesFactory.setTrailLength(0.1f);
        SegmentElement segmentElement = new SegmentElement();
        segmentElement.setSegmentPath(new SegmentPathCircle());
        segmentElement.setSegmentRenderer(new SegmentRendererLine().setMirror(false).setColor(-1441792, -3355648));
        segmentElement.setSegmentRenderer2(new SegmentRendererLine().setMirror(false).setColor(-1063168, -2430464).setFixedLineHeight(5.0f));
        segmentElement.setPosition(0.5f, 0.5f);
        segmentElement.setScale(0.395f, 0.395f);
        segmentElement.setScaleMeasure(new MeasuredVar(MeasureDefs.beat, 0.15f));
        segmentElement.setMinBarHeightScale(0.01f);
        segmentElement.setBarHeightScale(3.0f);
        segmentElement.setSoftness(10);
        segmentElement.setMeasurePos(new MeasuredVar(MeasureDefs.constantCamShakeLess, 0.3f, 1.0f));
        segmentElement.setMeasureRot(new MeasuredVar(MeasureDefs.constantCamShakeRotLess, 0.25f, 0.2f));
        BlurEffectElement blurEffectElement = new BlurEffectElement();
        blurEffectElement.setRenderContentOnTop(true);
        blurEffectElement.setColor2(ViewCompat.MEASURED_STATE_MASK);
        blurEffectElement.setBlendMode(2);
        blurEffectElement.setBlurLayerScale(0, 1.0f, 1.0f);
        ImageElement imageElement2 = new ImageElement();
        imageElement2.setBlurAmount(false);
        imageElement2.setBlurredBorder(false);
        imageElement2.setMeasurePos(new MeasuredVar(MeasureDefs.constantCamShakeLess, 0.3f, 1.0f));
        imageElement2.setPosition(0.5f, 0.5f);
        imageElement2.setScale(0.4f, 0.4f);
        imageElement2.setLocalPositionUniform(true, true);
        imageElement2.setScaleUniform(true, true);
        imageElement2.setCircleShape(true);
        imageElement2.setScaleMeasure(new MeasuredVar(MeasureDefs.beat, 0.15f));
        imageElement2.setMeasureRot(new MeasuredVar(MeasureDefs.constantCamShakeRotLess, 0.25f, 0.2f));
        Composition composition = new Composition();
        createDefaultRoot.addChildAtEnd(composition);
        composition.addChildAtEnd(particlesElement);
        createDefaultRoot.addToCompositionAtEnd(audioDataProviderElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement);
        createDefaultRoot.addToCompositionAtEnd(blurEffectElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement2);
        createDefaultRoot.addToCompositionAtEnd(segmentElement);
        return onFinishedDefaultRoot(createDefaultRoot, segmentAudioSpectrumData, true);
    }

    static RootElement createVisPreset10(int i) {
        RootElement createDefaultRoot = createDefaultRoot(i);
        AudioDataProviderElement audioDataProviderElement = new AudioDataProviderElement();
        SegmentAudioSpectrumData segmentAudioSpectrumData = new SegmentAudioSpectrumData();
        segmentAudioSpectrumData.setDataMode(2);
        segmentAudioSpectrumData.setSampleInCountPower(11);
        segmentAudioSpectrumData.setSampleOutCount(TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 0.05f, 0);
        audioDataProviderElement.setSegmentDataProvider(segmentAudioSpectrumData);
        ImageElement imageElement = new ImageElement();
        imageElement.setScale(1.0f, 1.0f);
        imageElement.setColor(-5197648);
        imageElement.setAlbumArtGenerateHint(1);
        ParticlesElement particlesElement = new ParticlesElement();
        particlesElement.setPosition(0.5f, 0.5f);
        particlesElement.setScale(1.0f, 1.0f);
        particlesElement.setParticlesCountLimit(1000);
        particlesElement.setParticlesSpawnTime(0.05f);
        particlesElement.setArea(new AreaRect().setUseRandomVectorInstead(true));
        particlesElement.setBlendMode(2);
        particlesElement.setForceField(new VortexForceField());
        particlesElement.setCustomImage(ParticlesElement.internalParticles[2]);
        BasicParticleFactory particlesFactory = particlesElement.getParticlesFactory();
        particlesFactory.setColorTo(-856424448);
        particlesFactory.setColorFrom(-855700893);
        particlesFactory.setLifetime(8.0f);
        particlesFactory.setFadeInAndOutTime(0.1f);
        particlesFactory.setStartSize(4.0f);
        particlesFactory.setFadeInSize(4.0f);
        particlesFactory.setEndSize(5.5f);
        particlesFactory.setEndSizeRandom(0.0f);
        particlesFactory.setSpeed(0.0f);
        particlesFactory.setSpeedRandom(0.0f);
        particlesFactory.setTrailLength(0.2f);
        SegmentElement segmentElement = new SegmentElement();
        segmentElement.setBlendMode(4);
        segmentElement.setSegmentPath(new SegmentPathCircle());
        segmentElement.setSegmentRenderer(new SegmentRendererBar().setBarWidth(0.3f).setMirror(true).setColor(-2130771968, -2147418113, -2130837504));
        segmentElement.setSegmentRenderer2(new SegmentRendererBar().setBarWidth(0.9f).setMirror(true).setBarHeightMultiplier(0.2f).setColor(-2130771968, -2147418113, -2130837504));
        segmentElement.setPosition(0.5f, 0.5f);
        segmentElement.setScale(0.5f, 0.5f);
        segmentElement.setMinBarHeightScale(0.01f);
        segmentElement.setBarHeightScale(3.0f);
        segmentElement.setMeasureRot(new MeasuredVar(MeasureDefs.totalTimeWhenPlaying, 0.03f));
        segmentElement.setSoftness(6);
        BlurEffectElement blurEffectElement = new BlurEffectElement();
        blurEffectElement.setRenderContentOnTop(true);
        blurEffectElement.setColor2(-14862427);
        blurEffectElement.setBlendMode(0);
        blurEffectElement.setBlendModeContent(4);
        blurEffectElement.setBlurLayerScale(0, 1.0f, 1.0f);
        blurEffectElement.setBlurLayerScale(1, 1.03f, 1.03f);
        blurEffectElement.setBlurLayerScale(2, 1.06f, 1.06f);
        ImageElement imageElement2 = new ImageElement();
        imageElement2.setBlurAmount(false);
        imageElement2.setBlurredBorder(false);
        imageElement2.setPosition(0.5f, 0.5f);
        imageElement2.setScale(0.5f, 0.5f);
        imageElement2.setLocalPositionUniform(true, true);
        imageElement2.setScaleUniform(true, true);
        imageElement2.setCircleShape(true);
        Composition composition = new Composition();
        createDefaultRoot.addChildAtEnd(composition);
        composition.addChildAtEnd(segmentElement);
        createDefaultRoot.addToCompositionAtEnd(audioDataProviderElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement);
        createDefaultRoot.addToCompositionAtEnd(particlesElement);
        createDefaultRoot.addToCompositionAtEnd(blurEffectElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement2);
        return onFinishedDefaultRoot(createDefaultRoot, segmentAudioSpectrumData, true);
    }

    static RootElement createVisPreset11(int i) {
        RootElement createDefaultRoot = createDefaultRoot(i);
        AudioDataProviderElement audioDataProviderElement = new AudioDataProviderElement();
        SegmentAudioSpectrumData segmentAudioSpectrumData = new SegmentAudioSpectrumData();
        segmentAudioSpectrumData.setDataMode(1);
        segmentAudioSpectrumData.setAweightFft(0.5f);
        segmentAudioSpectrumData.setSampleOutCount(180, 0.0f, 18000.0f, false, 2, 0.1f);
        audioDataProviderElement.setSegmentDataProvider(segmentAudioSpectrumData);
        ImageElement imageElement = new ImageElement();
        imageElement.setColor(-1);
        imageElement.setScale(1.0f, 1.0f);
        imageElement.setBlurAmount(true, 7, 7);
        TextElement textElement = new TextElement();
        textElement.setColor(-1);
        textElement.setBlendMode(textBlendMode);
        textElement.setFontSize(70);
        textElement.setText(MeasureDefs.textArtist);
        textElement.setPosition(0.5f, 0.8f);
        textElement.setLocalPosition(0.5f, 0.0f);
        TextElement textElement2 = new TextElement();
        textElement2.setColor(-1);
        textElement2.setBlendMode(textBlendMode);
        textElement2.setFontSize(40);
        textElement2.setText(MeasureDefs.textTitle);
        textElement2.setPosition(0.5f, 0.8f);
        textElement2.setLocalPosition(0.5f, -1.0f);
        SegmentElement segmentElement = new SegmentElement();
        segmentElement.setSegmentPath(new SegmentPathLetter());
        segmentElement.setSegmentRenderer(new SegmentRendererLine().setMirror(false).setColor(-1));
        segmentElement.setSegmentRenderer2(new SegmentRendererLine().setMirror(false).setColor(-8388608).setBarHeightMultiplier(0.6f));
        segmentElement.setPosition(0.5f, 0.5f);
        segmentElement.setScale(1.0f, 1.0f);
        segmentElement.setBarHeightScale(3.0f);
        segmentElement.setMinBarHeightScale(0.003f);
        BlurEffectElement blurEffectElement = new BlurEffectElement();
        blurEffectElement.setColor2(-14255940);
        blurEffectElement.setRenderContentOnTop(true);
        blurEffectElement.setBlurLayerScale(0, 1.0f, 1.0f);
        blurEffectElement.setBlurRadius(0.7f);
        blurEffectElement.setBlendMode(0);
        Composition composition = new Composition();
        createDefaultRoot.addChildAtEnd(composition);
        composition.addChildAtEnd(segmentElement);
        composition.addChildAtEnd(textElement);
        composition.addChildAtEnd(textElement2);
        createDefaultRoot.addToCompositionAtEnd(audioDataProviderElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement);
        createDefaultRoot.addToCompositionAtEnd(blurEffectElement);
        return onFinishedDefaultRoot(createDefaultRoot, segmentAudioSpectrumData, true);
    }

    static RootElement createVisPreset12(int i) {
        RootElement createDefaultRoot = createDefaultRoot(i);
        AudioDataProviderElement audioDataProviderElement = new AudioDataProviderElement();
        SegmentAudioSpectrumData segmentAudioSpectrumData = new SegmentAudioSpectrumData();
        segmentAudioSpectrumData.setDataMode(2);
        segmentAudioSpectrumData.setSampleInCountPower(11);
        segmentAudioSpectrumData.setSampleOutCount(230, 15.0f, 1100.0f, true, 1, 1.0f, 15, 15, 0.4f);
        segmentAudioSpectrumData.setSteadySmooth(70.0f);
        segmentAudioSpectrumData.setAweightFft(0.3f);
        segmentAudioSpectrumData.setFftFilter(3, 2.0f);
        segmentAudioSpectrumData.setBeatRangeCorners(0.0f, 0.25f, 0.7f, 35.0f);
        audioDataProviderElement.setSegmentDataProvider(segmentAudioSpectrumData);
        ImageElement imageElement = new ImageElement();
        imageElement.setScale(1.0f, 1.0f);
        imageElement.setScale(1.1f, 1.1f);
        imageElement.setColor(-1);
        imageElement.setBlurAmount(false);
        imageElement.setAlbumArtGenerateHint(1);
        SegmentElement segmentElement = new SegmentElement();
        segmentElement.setMeasurePos(new MeasuredVar(MeasureDefs.beatRandomShake, 0.3f, 1.0f));
        segmentElement.setSegmentPath(new SegmentPathCircle());
        segmentElement.setSegmentRenderer(new SegmentRendererBar().setBarWidth(2.0f).setMirror(false).setColor(ViewCompat.MEASURED_STATE_MASK, ViewCompat.MEASURED_STATE_MASK, ViewCompat.MEASURED_STATE_MASK));
        segmentElement.setPosition(0.5f, 0.5f);
        segmentElement.setScale(0.395f, 0.395f);
        segmentElement.setScaleMeasure(new MeasuredVar(MeasureDefs.beat, 0.15f));
        segmentElement.setMinBarHeightScale(0.01f);
        segmentElement.setBarHeightScale(4.0f);
        segmentElement.setRot(0.16666667f);
        segmentElement.setSoftness(10);
        BlurEffectElement blurEffectElement = new BlurEffectElement();
        blurEffectElement.setRenderContentOnTop(true);
        blurEffectElement.setColor2(ViewCompat.MEASURED_STATE_MASK);
        blurEffectElement.setBlendMode(2);
        blurEffectElement.setBlurLayerScale(0, 1.0f, 1.0f);
        ImageElement imageElement2 = new ImageElement();
        imageElement2.setBlurAmount(false);
        imageElement2.setBlurredBorder(false);
        imageElement2.setMeasurePos(new MeasuredVar(MeasureDefs.beatRandomShake, 0.3f, 1.0f));
        imageElement2.setPosition(0.5f, 0.5f);
        imageElement2.setScale(0.4f, 0.4f);
        imageElement2.setLocalPositionUniform(true, true);
        imageElement2.setScaleUniform(true, true);
        imageElement2.setCircleShape(true);
        imageElement2.setScaleMeasure(new MeasuredVar(MeasureDefs.beat, 0.15f));
        imageElement2.setGeneratedAlbumArtColor(ViewCompat.MEASURED_STATE_MASK);
        createDefaultRoot.addToCompositionAtEnd(audioDataProviderElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement);
        createDefaultRoot.addToCompositionAtEnd(blurEffectElement);
        createDefaultRoot.addToCompositionAtEnd(segmentElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement2);
        return onFinishedDefaultRoot(createDefaultRoot, segmentAudioSpectrumData, true);
    }

    static RootElement createVisPreset13(int i) {
        RootElement createDefaultRoot = createDefaultRoot(i);
        AudioDataProviderElement audioDataProviderElement = new AudioDataProviderElement();
        SegmentAudioSpectrumData segmentAudioSpectrumData = new SegmentAudioSpectrumData();
        segmentAudioSpectrumData.setDataMode(2);
        segmentAudioSpectrumData.setSampleOutCount(100, 0.06f, 0);
        audioDataProviderElement.setSegmentDataProvider(segmentAudioSpectrumData);
        ImageElement imageElement = new ImageElement();
        imageElement.setScale(1.0f, 1.0f);
        imageElement.setBlurAmount(false);
        imageElement.setAlbumArtGenerateHint(3);
        imageElement.setColor(-5197648);
        TextElement textElement = new TextElement();
        textElement.setColor(color1);
        textElement.setBlendMode(textBlendMode);
        textElement.setFontSize(40);
        textElement.setText(MeasureDefs.textTimeCurrent);
        textElement.setPosition(0.5f, 0.5f);
        textElement.setLocalPosition(0.5f, -3.0f);
        SegmentElement segmentElement = new SegmentElement();
        segmentElement.setSegmentPath(new SegmentPathHorizontalLine());
        segmentElement.setSegmentRenderer(new SegmentRendererBar().setMirror(true).setColor(-1, ViewCompat.MEASURED_SIZE_MASK, -1));
        segmentElement.setPosition(0.5f, 0.5f);
        segmentElement.setScale(1.0f, -1.0f);
        segmentElement.setMinBarHeightScale(0.003f);
        SegmentElement segmentElement2 = new SegmentElement();
        segmentElement2.setSegmentPath(new SegmentPathCircle());
        segmentElement2.setSegmentRenderer(new SegmentRendererLine().setFlipEveryOther(true).setFixedLineHeight(5.0f).setBarHeightMultiplier(0.5f));
        segmentElement2.setPosition(0.5f, 0.5f);
        segmentElement2.setScale(0.6f, 0.6f);
        segmentElement2.setBarHeightScale(2.0f);
        segmentElement2.setMinBarHeightScale(0.0f);
        BlurEffectElement blurEffectElement = new BlurEffectElement();
        blurEffectElement.setRenderContentOnTop(true);
        blurEffectElement.setColor2(0);
        blurEffectElement.setBlendMode(0);
        blurEffectElement.setBlendModeContent(4);
        blurEffectElement.setBlurLayerScale(0, 1.0f, 1.0f);
        blurEffectElement.setBlurRadius(0.4f);
        ImageElement imageElement2 = new ImageElement();
        imageElement2.setBlurAmount(false);
        imageElement2.setBlurredBorder(false);
        imageElement2.setPosition(0.5f, 0.5f);
        imageElement2.setScale(0.3f, 0.3f);
        imageElement2.setLocalPositionUniform(true, true);
        imageElement2.setScaleUniform(true, true);
        imageElement2.setCircleShape(true);
        imageElement2.setGeneratedAlbumArtColor(0);
        imageElement2.setAlbumArtGenerateHint(4);
        Composition composition = new Composition();
        createDefaultRoot.addChildAtEnd(composition);
        composition.addChildAtEnd(segmentElement);
        composition.addChildAtEnd(segmentElement2);
        createDefaultRoot.addToCompositionAtEnd(audioDataProviderElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement);
        createDefaultRoot.addToCompositionAtEnd(textElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement2);
        createDefaultRoot.addToCompositionAtEnd(blurEffectElement);
        return onFinishedDefaultRoot(createDefaultRoot, segmentAudioSpectrumData, true);
    }

    static RootElement createVisPreset14(int i) {
        RootElement createDefaultRoot = createDefaultRoot(i);
        AudioDataProviderElement audioDataProviderElement = new AudioDataProviderElement();
        SegmentAudioSpectrumData segmentAudioSpectrumData = new SegmentAudioSpectrumData();
        segmentAudioSpectrumData.setDataMode(2);
        segmentAudioSpectrumData.setSampleInCountPower(11);
        segmentAudioSpectrumData.setSampleOutCount(180, 15.0f, 1100.0f, true, 1, 1.0f, 25, 25, 0.0f);
        segmentAudioSpectrumData.setSteadySmooth(70.0f);
        segmentAudioSpectrumData.setFftFilter(4, 2.0f);
        audioDataProviderElement.setSegmentDataProvider(segmentAudioSpectrumData);
        ImageElement imageElement = new ImageElement();
        imageElement.setScale(1.0f, 1.0f);
        imageElement.setScale(1.1f, 1.1f);
        imageElement.setColor(-5197648);
        imageElement.setGeneratedAlbumArtColor(ViewCompat.MEASURED_STATE_MASK);
        imageElement.setAlbumArtGenerateHint(1);
        ParticlesElement particlesElement = new ParticlesElement();
        particlesElement.setPosition(0.5f, 0.5f);
        particlesElement.setScale(1.0f, 0.3f);
        particlesElement.setParticlesCountLimit(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        particlesElement.setParticlesSpawnTime(0.02f);
        particlesElement.setArea(new AreaRect().setVectorZ(1.0f));
        particlesElement.setBlendMode(2);
        particlesElement.setMeasureOverallSpeed(new MeasuredVar(MeasureDefs.beat, 1.5f));
        particlesElement.setMirrorX(true);
        particlesElement.setParticlesScale(2.0f);
        particlesElement.setCustomImage(ParticlesElement.internalParticles[0]);
        particlesElement.setPerspectiveDepth(900.0f);
        particlesElement.setPerspectiveFov(150.0f);
        BasicParticleFactory particlesFactory = particlesElement.getParticlesFactory();
        particlesFactory.setSideSineWaveFreq(0.5f);
        particlesFactory.setSideSineWaveMag(0.25f);
        particlesFactory.setColorFrom(-1);
        particlesFactory.setColorTo(-858993460);
        particlesFactory.setLifetime(8.0f);
        particlesFactory.setFadeInAndOutTime(0.1f);
        particlesFactory.setStartSize(0.0f);
        particlesFactory.setFadeInSize(4.0f);
        particlesFactory.setEndSize(4.0f);
        particlesFactory.setEndSizeRandom(10.0f);
        particlesFactory.setSpeed(100.0f);
        particlesFactory.setSpeedRandom(60.0f);
        particlesFactory.setTrailLength(0.2f);
        SegmentElement segmentElement = new SegmentElement();
        segmentElement.setSegmentPath(new SegmentPathCircle());
        segmentElement.setSegmentRenderer(new SegmentRendererLine().setMirror(false).setColor(ViewCompat.MEASURED_STATE_MASK, ViewCompat.MEASURED_STATE_MASK, ViewCompat.MEASURED_STATE_MASK).setBarHeightMultiplier(0.5f));
        segmentElement.setPosition(0.5f, 0.5f);
        segmentElement.setScale(0.395f, 0.395f);
        segmentElement.setScaleMeasure(new MeasuredVar(MeasureDefs.beat, 0.15f));
        segmentElement.setMinBarHeightScale(0.01f);
        segmentElement.setBarHeightScale(3.5f);
        segmentElement.setReactionDelay(0);
        segmentElement.setReactionAccumulatedDelay(0);
        segmentElement.setSoftness(7);
        SegmentElement segmentElement2 = new SegmentElement();
        segmentElement2.setSegmentPath(new SegmentPathCircle());
        segmentElement2.setSegmentRenderer(new SegmentRendererLine().setMirror(false).setColor(-52480, -24576, -24576).setBarHeightMultiplier(0.5f));
        segmentElement2.setPosition(0.5f, 0.5f);
        segmentElement2.setScale(0.395f, 0.395f);
        segmentElement2.setScaleMeasure(new MeasuredVar(MeasureDefs.beat, 0.15f));
        segmentElement2.setMinBarHeightScale(0.01f);
        segmentElement2.setBarHeightScale(3.5f);
        segmentElement2.setReactionAccumulatedDelay(2);
        segmentElement2.setSoftness(10);
        SegmentElement segmentElement3 = new SegmentElement();
        segmentElement3.setSegmentPath(new SegmentPathCircle());
        segmentElement3.setSegmentRenderer(new SegmentRendererLine().setMirror(false).setColor(ViewCompat.MEASURED_STATE_MASK, ViewCompat.MEASURED_STATE_MASK, ViewCompat.MEASURED_STATE_MASK).setBarHeightMultiplier(0.5f));
        segmentElement3.setPosition(0.5f, 0.5f);
        segmentElement3.setScale(0.395f, 0.395f);
        segmentElement3.setScaleMeasure(new MeasuredVar(MeasureDefs.beat, 0.15f));
        segmentElement3.setMinBarHeightScale(0.01f);
        segmentElement3.setBarHeightScale(3.5f);
        segmentElement3.setReactionAccumulatedDelay(4);
        segmentElement3.setSoftness(13);
        SegmentElement segmentElement4 = new SegmentElement();
        segmentElement4.setSegmentPath(new SegmentPathCircle());
        segmentElement4.setSegmentRenderer(new SegmentRendererLine().setMirror(false).setColor(-64768, -32768, -24576).setBarHeightMultiplier(0.5f));
        segmentElement4.setPosition(0.5f, 0.5f);
        segmentElement4.setScale(0.395f, 0.395f);
        segmentElement4.setScaleMeasure(new MeasuredVar(MeasureDefs.beat, 0.15f));
        segmentElement4.setMinBarHeightScale(0.01f);
        segmentElement4.setBarHeightScale(3.5f);
        segmentElement4.setReactionAccumulatedDelay(6);
        segmentElement4.setSoftness(16);
        BlurEffectElement blurEffectElement = new BlurEffectElement();
        blurEffectElement.setRenderContentOnTop(true);
        blurEffectElement.setColor2(ViewCompat.MEASURED_STATE_MASK);
        blurEffectElement.setBlendMode(4);
        blurEffectElement.setBlendModeContent(4);
        blurEffectElement.setBlurLayerScale(0, 1.0f, 1.0f);
        ImageElement imageElement2 = new ImageElement();
        imageElement2.setBlurAmount(false);
        imageElement2.setBlurredBorder(false);
        imageElement2.setPosition(0.5f, 0.5f);
        imageElement2.setScale(0.4f, 0.4f);
        imageElement2.setLocalPositionUniform(true, true);
        imageElement2.setScaleUniform(true, true);
        imageElement2.setCircleShape(true);
        imageElement2.setScaleMeasure(new MeasuredVar(MeasureDefs.beat, 0.15f));
        createDefaultRoot.addToCompositionAtEnd(audioDataProviderElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement);
        createDefaultRoot.addToCompositionAtEnd(particlesElement);
        createDefaultRoot.addToCompositionAtEnd(segmentElement4);
        createDefaultRoot.addToCompositionAtEnd(segmentElement3);
        createDefaultRoot.addToCompositionAtEnd(segmentElement2);
        createDefaultRoot.addToCompositionAtEnd(segmentElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement2);
        return onFinishedDefaultRoot(createDefaultRoot, segmentAudioSpectrumData, true);
    }

    static RootElement createVisPreset15(int i) {
        RootElement createDefaultRoot = createDefaultRoot(i);
        AudioDataProviderElement audioDataProviderElement = new AudioDataProviderElement();
        SegmentAudioSpectrumData segmentAudioSpectrumData = new SegmentAudioSpectrumData();
        segmentAudioSpectrumData.setDataMode(2);
        segmentAudioSpectrumData.setSampleOutCount(128, 25.0f, 18000.0f, false, 3, 0.0f);
        segmentAudioSpectrumData.setFftFilter(4, 1.0f);
        audioDataProviderElement.setSegmentDataProvider(segmentAudioSpectrumData);
        ImageElement imageElement = new ImageElement();
        imageElement.setScale(1.0f, 1.0f);
        imageElement.setColor(ViewCompat.MEASURED_STATE_MASK);
        imageElement.setAlbumArtGenerateHint(1);
        ParticlesElement particlesElement = new ParticlesElement();
        particlesElement.setPosition(0.5f, 0.5f);
        particlesElement.setScale(1.0f, 1.0f);
        particlesElement.setParticlesCountLimit(1000);
        particlesElement.setParticlesSpawnTime(0.05f);
        particlesElement.setArea(new AreaRect().setVectorRelativeToCenter(true).setVectorAngle(0.0f));
        particlesElement.setBlendMode(2);
        particlesElement.setForceField(new VortexForceField());
        particlesElement.setCustomImage(ParticlesElement.internalParticles[2]);
        BasicParticleFactory particlesFactory = particlesElement.getParticlesFactory();
        particlesFactory.setColorTo(-1);
        particlesFactory.setColorFrom(0);
        particlesFactory.setLifetime(8.0f);
        particlesFactory.setFadeInAndOutTime(0.1f);
        particlesFactory.setStartSize(0.0f);
        particlesFactory.setFadeInSize(6.0f);
        particlesFactory.setEndSize(6.0f);
        particlesFactory.setEndSizeRandom(16.0f);
        particlesFactory.setSpeed(-300.0f);
        particlesFactory.setSpeedRandom(30.0f);
        particlesFactory.setTrailLength(0.1f);
        SegmentElement segmentElement = new SegmentElement();
        segmentElement.setSegmentPath(new SegmentPathSided().setSides(3).setRadius(1.5f));
        segmentElement.setSegmentRenderer(new SegmentRendererLine().setFixedLineHeight(4.0f).setColor(1194787071, 1079312639).setBarHeightMultiplier(0.4f));
        segmentElement.setSegmentRenderer2(new SegmentRendererLine().setFixedLineHeight(-4.0f).setColor(1207983615, 1627429375).setBarHeightMultiplier(-0.4f));
        segmentElement.setPosition(0.5f, 0.5f);
        segmentElement.setScale(0.2f, 0.2f);
        segmentElement.setMinBarHeightScale(0.005f);
        segmentElement.setBarHeightScale(1.0f);
        segmentElement.setReactionDelay(6);
        segmentElement.setSoftness(4);
        SegmentElement segmentElement2 = new SegmentElement();
        segmentElement2.setSegmentPath(new SegmentPathSided().setSides(3).setRadius(1.5f));
        segmentElement2.setSegmentRenderer(new SegmentRendererLine().setFixedLineHeight(4.0f).setColor(2132934911, 2137653503).setBarHeightMultiplier(0.4f));
        segmentElement2.setSegmentRenderer2(new SegmentRendererLine().setFixedLineHeight(-4.0f).setColor(2130739199, 2130767359).setBarHeightMultiplier(-0.4f));
        segmentElement2.setPosition(0.5f, 0.5f);
        segmentElement2.setScale(0.3f, 0.3f);
        segmentElement2.setMinBarHeightScale(0.005f);
        segmentElement2.setBarHeightScale(1.0f);
        segmentElement2.setReactionDelay(4);
        segmentElement2.setSoftness(4);
        SegmentElement segmentElement3 = new SegmentElement();
        segmentElement3.setSegmentPath(new SegmentPathSided().setSides(3).setRadius(1.5f));
        segmentElement3.setSegmentRenderer(new SegmentRendererLine().setFixedLineHeight(4.0f).setColor(-1347026689, -1354563329).setBarHeightMultiplier(0.4f));
        segmentElement3.setSegmentRenderer2(new SegmentRendererLine().setFixedLineHeight(-4.0f).setColor(-1358913025, -1358906369).setBarHeightMultiplier(-0.4f));
        segmentElement3.setPosition(0.5f, 0.5f);
        segmentElement3.setScale(0.4f, 0.4f);
        segmentElement3.setMinBarHeightScale(0.005f);
        segmentElement3.setBarHeightScale(1.0f);
        segmentElement3.setReactionDelay(2);
        segmentElement3.setSoftness(4);
        SegmentElement segmentElement4 = new SegmentElement();
        segmentElement4.setSegmentPath(new SegmentPathSided().setSides(3).setRadius(1.5f));
        segmentElement4.setSegmentRenderer(new SegmentRendererLine().setFixedLineHeight(4.0f).setColor(-7339777, -917249).setBarHeightMultiplier(0.4f));
        segmentElement4.setSegmentRenderer2(new SegmentRendererLine().setFixedLineHeight(-4.0f).setColor(-16724993, -16756481).setBarHeightMultiplier(-0.4f));
        segmentElement4.setPosition(0.5f, 0.5f);
        segmentElement4.setScale(0.5f, 0.5f);
        segmentElement4.setMinBarHeightScale(0.005f);
        segmentElement4.setBarHeightScale(1.0f);
        segmentElement4.setSoftness(4);
        BlurEffectElement blurEffectElement = new BlurEffectElement();
        blurEffectElement.setRenderContentOnTop(true);
        blurEffectElement.setColor2(-15466252);
        blurEffectElement.setBlendMode(2);
        blurEffectElement.setBlurLayerScale(0, 1.0f, 1.0f);
        blurEffectElement.setBlurLayerScale(1, 1.0f, 1.0f);
        Composition composition = new Composition();
        createDefaultRoot.addChildAtEnd(composition);
        composition.addChildAtEnd(segmentElement);
        composition.addChildAtEnd(segmentElement2);
        composition.addChildAtEnd(segmentElement3);
        composition.addChildAtEnd(segmentElement4);
        composition.addChildAtEnd(particlesElement);
        createDefaultRoot.addToCompositionAtEnd(audioDataProviderElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement);
        createDefaultRoot.addToCompositionAtEnd(blurEffectElement);
        return onFinishedDefaultRoot(createDefaultRoot, segmentAudioSpectrumData, true);
    }

    static RootElement createVisPreset16(int i) {
        RootElement createDefaultRoot = createDefaultRoot(i);
        AudioDataProviderElement audioDataProviderElement = new AudioDataProviderElement();
        SegmentAudioSpectrumData segmentAudioSpectrumData = new SegmentAudioSpectrumData();
        segmentAudioSpectrumData.setDataMode(2);
        segmentAudioSpectrumData.setSampleInCountPower(11);
        segmentAudioSpectrumData.setSampleOutCount(230, 15.0f, 20000.0f, false, 1, 1.0f, 0, 0, 0.0f);
        segmentAudioSpectrumData.setSteadySmooth(70.0f);
        segmentAudioSpectrumData.setFftFilter(1, 0.4f);
        segmentAudioSpectrumData.setBeatRangeCorners(0.0f, 0.25f, 0.7f, 90.0f);
        segmentAudioSpectrumData.setAweightFft(1.0f);
        audioDataProviderElement.setSegmentDataProvider(segmentAudioSpectrumData);
        ImageElement imageElement = new ImageElement();
        imageElement.setScale(1.0f, 1.0f);
        imageElement.setScale(1.1f, 1.1f);
        imageElement.setColor(-1);
        imageElement.setBlurAmount(false);
        imageElement.setAlbumArtGenerateHint(1);
        ImageElement imageElement2 = new ImageElement();
        imageElement2.setBlendMode(2);
        imageElement2.setScale(1.0f, 1.0f);
        imageElement2.setScale(1.1f, 1.1f);
        imageElement2.setColor(ViewCompat.MEASURED_STATE_MASK);
        imageElement2.setColorTo(-8355712);
        imageElement2.setBlurAmount(true, 6, 5);
        imageElement2.setMeasureColor(new MeasuredVar(MeasureDefs.beat, 1.0f));
        imageElement2.setAlbumArtGenerateHint(1);
        ImageElement imageElement3 = new ImageElement();
        imageElement3.setBlurAmount(false);
        imageElement3.setBlurredBorder(false);
        imageElement3.setPosition(0.5f, 0.5f);
        imageElement3.setScale(0.75f, 0.75f);
        imageElement3.setLocalPositionUniform(true, true);
        imageElement3.setScaleUniform(true, true);
        imageElement3.setScaleMeasure(new MeasuredVar(MeasureDefs.beat, 0.01f));
        imageElement3.setGeneratedAlbumArtColor(ViewCompat.MEASURED_STATE_MASK);
        imageElement3.setColor(ViewCompat.MEASURED_STATE_MASK);
        imageElement3.setCustomImage("internalres:particle_circle_blur4");
        SegmentElement segmentElement = new SegmentElement();
        segmentElement.setSegmentPath(new SegmentPathCircle());
        segmentElement.setSegmentRenderer(new SegmentRendererBar().setBarWidth(0.7f).setMirror(false).setColor(-1, -1, -1));
        segmentElement.setPosition(0.5f, 0.5f);
        segmentElement.setScale(0.6f, 0.6f);
        segmentElement.setMinBarHeightScale(-0.003f);
        segmentElement.setBarHeightScale(-4.0f);
        segmentElement.setSoftness(0);
        BlurEffectElement blurEffectElement = new BlurEffectElement();
        blurEffectElement.setRenderContentOnTop(true);
        blurEffectElement.setColor2(ViewCompat.MEASURED_STATE_MASK);
        blurEffectElement.setBlendMode(2);
        blurEffectElement.setBlurLayerScale(0, 1.0f, 1.0f);
        ImageElement imageElement4 = new ImageElement();
        imageElement4.setBlurAmount(false);
        imageElement4.setBlurredBorder(false);
        imageElement4.setPosition(0.5f, 0.5f);
        imageElement4.setScale(0.6f, 0.6f);
        imageElement4.setLocalPositionUniform(true, true);
        imageElement4.setScaleUniform(true, true);
        imageElement4.setCircleShape(true);
        imageElement4.setGeneratedAlbumArtColor(ViewCompat.MEASURED_STATE_MASK);
        createDefaultRoot.addToCompositionAtEnd(audioDataProviderElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement2);
        createDefaultRoot.addToCompositionAtEnd(blurEffectElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement3);
        createDefaultRoot.addToCompositionAtEnd(imageElement4);
        createDefaultRoot.addToCompositionAtEnd(segmentElement);
        return onFinishedDefaultRoot(createDefaultRoot, segmentAudioSpectrumData, true);
    }

    static RootElement createVisPreset17(int i) {
        RootElement createDefaultRoot = createDefaultRoot(i);
        AudioDataProviderElement audioDataProviderElement = new AudioDataProviderElement();
        SegmentAudioSpectrumData segmentAudioSpectrumData = new SegmentAudioSpectrumData();
        segmentAudioSpectrumData.setDataMode(2);
        segmentAudioSpectrumData.setSampleInCountPower(11);
        segmentAudioSpectrumData.setAweightFft(0.3f);
        audioDataProviderElement.setSegmentDataProvider(segmentAudioSpectrumData);
        BlurEffectElement blurEffectElement = new BlurEffectElement();
        blurEffectElement.setBlendMode(0);
        blurEffectElement.setBlendModeContent(4);
        blurEffectElement.setRenderContentUnder(true);
        blurEffectElement.setColor2(ViewCompat.MEASURED_STATE_MASK);
        blurEffectElement.setBlurLayerScale(0, 1.0f, 1.0f);
        blurEffectElement.setReferenceComposition(1);
        blurEffectElement.setMaskCustomImage(Composition.makeIndexStringPath(2));
        blurEffectElement.setBlurMultiplier(3.2f);
        ImageElement imageElement = new ImageElement();
        imageElement.setBlurAmount(false);
        imageElement.setBlurredBorder(false);
        imageElement.setPosition(0.5f, 0.5f);
        imageElement.setScale(0.4f, 0.4f);
        imageElement.setLocalPositionUniform(true, true);
        imageElement.setScaleUniform(true, true);
        imageElement.setCircleShape(true);
        imageElement.setMeasurePos(new MeasuredVar(MeasureDefs.constantCamShakeLess, 0.7f, 0.5f));
        ImageElement imageElement2 = new ImageElement();
        imageElement2.setScale(1.1f, 1.1f);
        imageElement2.setAlbumArtGenerateHint(1);
        imageElement2.setBlurAmount(false);
        imageElement2.setKeepAspectRatioAndCropToFit(true);
        imageElement2.setMeasurePos(new MeasuredVar(MeasureDefs.constantCamShakeLess, 0.3f, 0.5f));
        SegmentElement segmentElement = new SegmentElement();
        segmentElement.setSegmentPath(new SegmentPathCircle());
        segmentElement.setSegmentRenderer(new SegmentRendererRoundBar().setBarWidth(0.9f).setColor(-16776961, -65376).setBarHeightMultiplier(0.7f));
        segmentElement.setPosition(0.5f, 0.5f);
        segmentElement.setScale(0.4f, 0.4f);
        segmentElement.setBarHeightScale(5.0f);
        segmentElement.setMinBarHeightScale(0.0f);
        segmentElement.setSoftness(2);
        segmentElement.setMeasurePos(new MeasuredVar(MeasureDefs.constantCamShakeLess, 0.5f, 0.5f));
        ParticlesElement particlesElement = new ParticlesElement();
        particlesElement.setPosition(0.5f, 0.5f);
        particlesElement.setScale(0.5f, 0.5f);
        particlesElement.setScaleUniform(true);
        particlesElement.setParticlesCountLimit(1000);
        particlesElement.setParticlesSpawnTime(0.03f);
        particlesElement.setArea(new AreaRect().setUseRandomVectorInstead(true));
        particlesElement.setBlendMode(2);
        particlesElement.setCustomImage(ParticlesElement.internalParticles[2]);
        particlesElement.setParticlesScale(2.0f);
        particlesElement.setMeasureOverallSpeed(new MeasuredVar(MeasureDefs.beat, 0.75f));
        BasicParticleFactory particlesFactory = particlesElement.getParticlesFactory();
        particlesFactory.setColorBoth(-1);
        particlesFactory.setLifetime(3.5f);
        particlesFactory.setFadeInAndOutTime(0.35f);
        particlesFactory.setStartSize(7.0f);
        particlesFactory.setFadeInSize(3.0f);
        particlesFactory.setEndSize(2.0f);
        particlesFactory.setEndSizeRandom(16.0f);
        particlesFactory.setSpeed(30.0f);
        particlesFactory.setSpeedRandom(30.0f);
        ImageElement imageElement3 = new ImageElement();
        imageElement3.setBlurAmount(false);
        imageElement3.setBlurredBorder(false);
        imageElement3.setPosition(0.5f, 0.5f);
        imageElement3.setScale(0.52f, 0.52f);
        imageElement3.setLocalPositionUniform(true, true);
        imageElement3.setScaleUniform(true, true);
        imageElement3.setCircleShape(true);
        imageElement3.setMeasurePos(new MeasuredVar(MeasureDefs.constantCamShakeLess, 0.7f, 0.5f));
        ImageElement imageElement4 = new ImageElement();
        imageElement4.setBlurAmount(false);
        imageElement4.setBlurredBorder(false);
        imageElement4.setPosition(0.5f, 0.0f);
        imageElement4.setLocalPosition(0.5f, 0.2f);
        imageElement4.setScale(1.1f, 0.1f);
        imageElement4.setKeepAspectRatio(false);
        imageElement4.setLocalPositionUniform(true, true);
        imageElement4.setMeasurePos(new MeasuredVar(MeasureDefs.constantCamShakeLess, 0.7f, 0.5f));
        ImageElement imageElement5 = new ImageElement();
        imageElement5.setBlurAmount(false);
        imageElement5.setBlurredBorder(false);
        imageElement5.setPosition(0.5f, 1.0f);
        imageElement5.setLocalPosition(0.5f, 0.8f);
        imageElement5.setScale(1.1f, 0.1f);
        imageElement5.setKeepAspectRatio(false);
        imageElement5.setLocalPositionUniform(true, true);
        imageElement5.setMeasurePos(new MeasuredVar(MeasureDefs.constantCamShakeLess, 0.7f, 0.5f));
        Composition composition = new Composition();
        createDefaultRoot.addChildAtEnd(composition);
        composition.addChildAtEnd(imageElement2);
        composition.addChildAtEnd(segmentElement);
        Composition composition2 = new Composition();
        createDefaultRoot.addChildAtEnd(composition2);
        composition2.addChildAtEnd(particlesElement);
        composition2.addChildAtEnd(imageElement3);
        composition2.addChildAtEnd(imageElement5);
        composition2.addChildAtEnd(imageElement4);
        createDefaultRoot.addToCompositionAtEnd(audioDataProviderElement);
        createDefaultRoot.addToCompositionAtEnd(blurEffectElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement);
        return onFinishedDefaultRoot(createDefaultRoot, segmentAudioSpectrumData, true);
    }

    static RootElement createVisPreset18(int i) {
        RootElement createDefaultRoot = createDefaultRoot(i);
        AudioDataProviderElement audioDataProviderElement = new AudioDataProviderElement();
        SegmentAudioSpectrumData segmentAudioSpectrumData = new SegmentAudioSpectrumData();
        segmentAudioSpectrumData.setDataMode(2);
        segmentAudioSpectrumData.setSampleInCountPower(11);
        segmentAudioSpectrumData.setSampleOutCount(230, 15.0f, 1100.0f, true, 1, 1.0f, 15, 15, 0.4f);
        segmentAudioSpectrumData.setSteadySmooth(70.0f);
        segmentAudioSpectrumData.setFftFilter(3, 2.0f);
        segmentAudioSpectrumData.setBeatRangeCorners(0.0f, 0.25f, 0.7f, 35.0f);
        audioDataProviderElement.setSegmentDataProvider(segmentAudioSpectrumData);
        ImageElement imageElement = new ImageElement();
        imageElement.setScale(1.0f, 1.0f);
        imageElement.setScale(1.1f, 1.1f);
        imageElement.setColor(-1);
        imageElement.setBlurAmount(false);
        imageElement.setAlbumArtGenerateHint(1);
        SegmentElement segmentElement = new SegmentElement();
        segmentElement.setMeasurePos(new MeasuredVar(MeasureDefs.beatRandomShake, 0.3f, 1.0f));
        segmentElement.setSegmentPath(new SegmentPathCircle());
        segmentElement.setSegmentRenderer(new SegmentRendererBar().setBarWidth(2.0f).setMirror(false).setColor(ViewCompat.MEASURED_STATE_MASK, ViewCompat.MEASURED_STATE_MASK, ViewCompat.MEASURED_STATE_MASK));
        segmentElement.setPosition(0.5f, 0.5f);
        segmentElement.setScale(0.395f, 0.395f);
        segmentElement.setScaleMeasure(new MeasuredVar(MeasureDefs.beat, 0.15f));
        segmentElement.setMinBarHeightScale(0.01f);
        segmentElement.setBarHeightScale(3.0f);
        segmentElement.setRot(0.16666667f);
        segmentElement.setSoftness(10);
        BlurEffectElement blurEffectElement = new BlurEffectElement();
        blurEffectElement.setRenderContentOnTop(true);
        blurEffectElement.setColor2(ViewCompat.MEASURED_STATE_MASK);
        blurEffectElement.setBlendMode(2);
        blurEffectElement.setBlurLayerScale(0, 1.0f, 1.0f);
        ImageElement imageElement2 = new ImageElement();
        imageElement2.setBlurAmount(false);
        imageElement2.setBlurredBorder(false);
        imageElement2.setMeasurePos(new MeasuredVar(MeasureDefs.beatRandomShake, 0.3f, 1.0f));
        imageElement2.setPosition(0.5f, 0.5f);
        imageElement2.setScale(0.4f, 0.4f);
        imageElement2.setLocalPositionUniform(true, true);
        imageElement2.setScaleUniform(true, true);
        imageElement2.setCircleShape(true);
        imageElement2.setScaleMeasure(new MeasuredVar(MeasureDefs.beat, 0.15f));
        imageElement2.setGeneratedAlbumArtColor(ViewCompat.MEASURED_STATE_MASK);
        createDefaultRoot.addToCompositionAtEnd(audioDataProviderElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement);
        createDefaultRoot.addToCompositionAtEnd(blurEffectElement);
        createDefaultRoot.addToCompositionAtEnd(segmentElement);
        createDefaultRoot.addToCompositionAtEnd(imageElement2);
        return onFinishedDefaultRoot(createDefaultRoot, segmentAudioSpectrumData, true);
    }
}
