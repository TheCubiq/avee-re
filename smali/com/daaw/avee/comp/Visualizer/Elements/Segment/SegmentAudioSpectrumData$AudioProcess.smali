.class Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;
.super Ljava/lang/Object;
.source "SegmentAudioSpectrumData.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Base/ICustomizable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "AudioProcess"
.end annotation


# instance fields
.field private aweightFft:F

.field private barFreq:[F

.field private barFreqNext:[F

.field private barSmoothValues:[F

.field private barValues:[F

.field private barsCount:I

.field private beatBarValue:[F

.field private beatBarValueSmooth:F

.field beatRange:Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

.field private beatSmoothFactor:F

.field private dataCount:I

.field private endBar:I

.field fftFilter:Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;

.field private fftMag:[D

.field private fftMagSlide:[F

.field private fftMagSmooth:[F

.field fftResultAccess:Lcom/daaw/avee/Common/ISimpleListDouble;

.field fftResultDouble:[D

.field private fftSoftnessDivider:F

.field private fftSoftnessIndexes:[I

.field private fftSoftnessWeight:[F

.field private fftSoftnessWidth:I

.field fftTransform:Llomont/FFTBase;

.field fftTransformInitializeSize:I

.field fftWindowMultipliers:[F

.field private freqLinfactor:F

.field private freqShift:F

.field private frequencyBinSliding:Z

.field private hiFreq:F

.field private loFreq:F

.field private mirrorSampleValues:Z

.field private outputMultiplier:F

.field private pcmRangeTmp:[F

.field private peakBarIndex01:F

.field private peakBarIndex01Smooth:F

.field private peakBarSmoothFactor:F

.field private rangeHiSmooth:F

.field private rangeLoSmooth:F

.field private final rangeSmoothAttackFactor:F

.field private final rangeSmoothDecayFactor:F

.field private rangeSmoothMul:F

.field private final rangeTarget:F

.field private repeatSamples:I

.field private rmsTargetBar:I

.field private sampleInCountPower:I

.field private smoothFactor:F

.field private smoothFactor2:F

.field private starBar:I

.field private steadySmooth:F

.field private windowedRms:F


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    .line 38
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->sampleInCountPower:I

    const/16 v0, 0x400

    .line 39
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->dataCount:I

    const/4 v0, 0x1

    new-array v1, v0, [D

    .line 40
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftMag:[D

    new-array v1, v0, [F

    .line 41
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftMagSlide:[F

    new-array v1, v0, [F

    .line 42
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftMagSmooth:[F

    const/4 v1, 0x2

    new-array v2, v1, [F

    .line 43
    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->pcmRangeTmp:[F

    const/4 v2, 0x0

    .line 49
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->starBar:I

    .line 50
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->endBar:I

    const/4 v3, 0x0

    .line 51
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->freqShift:F

    const/16 v4, 0x40

    .line 52
    iput v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barsCount:I

    new-array v5, v0, [F

    .line 53
    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barSmoothValues:[F

    new-array v5, v0, [F

    .line 54
    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barValues:[F

    new-array v5, v0, [F

    .line 55
    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreq:[F

    new-array v5, v0, [F

    .line 56
    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreqNext:[F

    new-array v5, v0, [F

    .line 59
    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatBarValue:[F

    .line 60
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatBarValueSmooth:F

    .line 61
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->mirrorSampleValues:Z

    .line 62
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->repeatSamples:I

    const v5, 0x3f4ccccd    # 0.8f

    .line 65
    iput v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->smoothFactor:F

    const/high16 v5, 0x3f800000    # 1.0f

    .line 66
    iput v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->smoothFactor2:F

    const/high16 v6, 0x43960000    # 300.0f

    .line 67
    iput v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->rangeTarget:F

    const v6, 0x3f666666    # 0.9f

    .line 68
    iput v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->rangeSmoothAttackFactor:F

    const v6, 0x3c23d70a    # 0.01f

    .line 69
    iput v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->rangeSmoothDecayFactor:F

    const v6, 0x3ecccccd    # 0.4f

    .line 70
    iput v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatSmoothFactor:F

    const/4 v6, 0x4

    .line 72
    iput v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->rmsTargetBar:I

    .line 73
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->windowedRms:F

    const/high16 v6, 0x447a0000    # 1000.0f

    .line 74
    iput v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->rangeHiSmooth:F

    .line 75
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->rangeLoSmooth:F

    .line 76
    iput v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->rangeSmoothMul:F

    .line 78
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->steadySmooth:F

    new-array v6, v2, [I

    .line 83
    iput-object v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessIndexes:[I

    new-array v6, v2, [F

    .line 84
    iput-object v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessWeight:[F

    .line 85
    iput v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessDivider:F

    .line 86
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessWidth:I

    .line 87
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->freqLinfactor:F

    const v1, 0x3e4ccccd    # 0.2f

    .line 88
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->aweightFft:F

    .line 89
    iput v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->outputMultiplier:F

    .line 90
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->frequencyBinSliding:Z

    new-array v6, v2, [F

    .line 91
    iput-object v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftWindowMultipliers:[F

    const/high16 v6, 0x3f000000    # 0.5f

    .line 93
    iput v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->peakBarSmoothFactor:F

    .line 94
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->peakBarIndex01:F

    .line 95
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->peakBarIndex01Smooth:F

    .line 97
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

    invoke-direct {v7, v6}, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;-><init>(F)V

    iput-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatRange:Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

    .line 101
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;

    invoke-direct {v6}, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;-><init>()V

    invoke-virtual {v6, v0, v5}, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->createHighPass(IF)Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;

    move-result-object v6

    iput-object v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftFilter:Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;

    new-array v6, v2, [D

    .line 117
    iput-object v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftResultDouble:[D

    .line 118
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftTransformInitializeSize:I

    .line 119
    new-instance v6, Llomont/Lomont4FFT;

    invoke-direct {v6}, Llomont/Lomont4FFT;-><init>()V

    iput-object v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftTransform:Llomont/FFTBase;

    .line 121
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess$1;

    invoke-direct {v6, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess$1;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;)V

    iput-object v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftResultAccess:Lcom/daaw/avee/Common/ISimpleListDouble;

    const v6, 0x3d75c28f    # 0.06f

    .line 137
    invoke-direct {p0, v4, v6, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setSampleOutCount(IFI)V

    .line 138
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setFftSoftness(I)V

    const/16 v2, 0xb

    .line 139
    invoke-direct {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setSampleInCountPower(I)V

    const v2, 0x3f333333    # 0.7f

    const/high16 v4, 0x420c0000    # 35.0f

    .line 141
    invoke-direct {p0, v3, v1, v2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setBeatRangeCorners(FFFF)V

    .line 142
    invoke-direct {p0, v0, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setFftFilter(IF)V

    return-void
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;FLcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)[F
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->processTh(FLcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)[F

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;IFFZIFIIF)V
    .locals 0

    .line 36
    invoke-direct/range {p0 .. p9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setSampleOutCount(IFFZIFIIF)V

    return-void
.end method

.method static synthetic access$400(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;F)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setSmoothFactor(F)V

    return-void
.end method

.method static synthetic access$500(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;F)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setSmoothFactor2(F)V

    return-void
.end method

.method static synthetic access$600(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;IF)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setFftFilter(IF)V

    return-void
.end method

.method static synthetic access$700(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;F)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setBeatSmooth(F)V

    return-void
.end method

.method static synthetic access$800(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;FFFF)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setBeatRangeCorners(FFFF)V

    return-void
.end method

.method static synthetic access$900(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;F)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setAweightFft(F)V

    return-void
.end method

.method private fillBarValues2([FFZLcom/daaw/avee/Common/ISimpleListDouble;I[F[FZ)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p5

    .line 597
    array-length v3, v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x4

    if-ge v3, v6, :cond_1

    .line 598
    :goto_0
    array-length v2, v1

    if-ge v5, v2, :cond_0

    .line 599
    aput v4, v1, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    const v3, 0x4b189676    # 9999990.0f

    .line 604
    aput v3, p6, v5

    const v3, -0x34e7698a    # -9999990.0f

    const/4 v6, 0x1

    .line 605
    aput v3, p6, v6

    .line 608
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftMag:[D

    array-length v3, v3

    invoke-interface/range {p4 .. p4}, Lcom/daaw/avee/Common/ISimpleListDouble;->size()I

    move-result v6

    if-eq v3, v6, :cond_2

    .line 609
    invoke-interface/range {p4 .. p4}, Lcom/daaw/avee/Common/ISimpleListDouble;->size()I

    move-result v3

    new-array v3, v3, [D

    iput-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftMag:[D

    .line 610
    invoke-interface/range {p4 .. p4}, Lcom/daaw/avee/Common/ISimpleListDouble;->size()I

    move-result v3

    new-array v3, v3, [F

    iput-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftMagSlide:[F

    const/4 v3, 0x0

    .line 611
    :goto_1
    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftMagSlide:[F

    array-length v7, v6

    if-ge v3, v7, :cond_2

    aput v4, v6, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    .line 620
    :goto_2
    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftMag:[D

    array-length v6, v6

    if-ge v3, v6, :cond_4

    .line 622
    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftFilter:Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;

    move-object/from16 v7, p4

    invoke-virtual {v6, v3, v7}, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->getSoftedClamped(ILcom/daaw/avee/Common/ISimpleListDouble;)D

    move-result-wide v8

    double-to-float v6, v8

    .line 623
    invoke-static {v6, v4}, Ljava/lang/Math;->max(FF)F

    move-result v6

    .line 629
    iget v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->aweightFft:F

    const/high16 v9, 0x3f800000    # 1.0f

    cmpl-float v8, v8, v4

    if-lez v8, :cond_3

    int-to-double v10, v3

    .line 630
    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftMag:[D

    array-length v8, v8

    int-to-double v12, v8

    int-to-double v14, v2

    invoke-static/range {v10 .. v15}, Lcom/daaw/avee/comp/Visualizer/Dsp/DspCurves;->freqd(DDD)D

    move-result-wide v10

    .line 631
    invoke-static {v10, v11}, Lcom/daaw/avee/comp/Visualizer/Dsp/DspCurves;->myAWeight1000(D)D

    move-result-wide v10

    double-to-float v8, v10

    .line 633
    iget v10, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->aweightFft:F

    sub-float v11, v9, v10

    mul-float v10, v10, v8

    mul-float v10, v10, v8

    mul-float v10, v10, v8

    add-float/2addr v11, v10

    mul-float v6, v6, v11

    .line 642
    :cond_3
    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftMag:[D

    aget-wide v10, v8, v3

    iget v12, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->smoothFactor2:F

    sub-float/2addr v9, v12

    float-to-double v13, v9

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v10, v10, v13

    mul-float v6, v6, v12

    float-to-double v12, v6

    invoke-static {v12, v13}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v10, v12

    aput-wide v10, v8, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_4
    move-object/from16 v7, p4

    if-eqz p8, :cond_5

    .line 672
    invoke-interface/range {p4 .. p4}, Lcom/daaw/avee/Common/ISimpleListDouble;->size()I

    move-result v3

    mul-int/lit8 v3, v3, 0x2

    goto :goto_3

    .line 674
    :cond_5
    invoke-interface/range {p4 .. p4}, Lcom/daaw/avee/Common/ISimpleListDouble;->size()I

    move-result v3

    :goto_3
    int-to-float v2, v2

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 683
    aput v4, v1, v5

    .line 729
    :goto_4
    array-length v3, v1

    if-ge v5, v3, :cond_7

    .line 731
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreq:[F

    aget v3, v3, v5

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreqNext:[F

    aget v6, v6, v5

    sub-float/2addr v3, v6

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    const/high16 v6, 0x42480000    # 50.0f

    div-float/2addr v3, v6

    const v6, 0x3f333333    # 0.7f

    const v7, 0x3e99999a    # 0.3f

    mul-float v3, v3, v7

    add-float/2addr v3, v6

    .line 736
    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreq:[F

    aget v6, v6, v5

    div-float/2addr v6, v2

    float-to-int v6, v6

    .line 743
    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreqNext:[F

    aget v7, v7, v5

    div-float/2addr v7, v2

    float-to-int v7, v7

    .line 747
    aput v4, v1, v5

    .line 748
    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftMag:[D

    array-length v8, v8

    invoke-static {v6, v8}, Ljava/lang/Math;->min(II)I

    move-result v6

    move v8, v7

    :goto_5
    if-ge v8, v6, :cond_6

    .line 760
    aget v9, v1, v5

    iget-object v10, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftMag:[D

    aget-wide v11, v10, v8

    double-to-float v10, v11

    sub-int v11, v6, v7

    int-to-float v11, v11

    div-float/2addr v10, v11

    add-float/2addr v9, v10

    aput v9, v1, v5

    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    .line 763
    :cond_6
    aget v6, v1, v5

    mul-float v3, v3, p2

    mul-float v6, v6, v3

    aput v6, v1, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_7
    return-void
.end method

.method private getFftSlidingFreq2(I[D)F
    .locals 4

    const/high16 v0, 0x3f800000    # 1.0f

    if-nez p1, :cond_1

    add-int/lit8 v1, p1, 0x1

    .line 1061
    aget-wide v1, p2, v1

    aget-wide p1, p2, p1

    cmpl-double v3, v1, p1

    if-lez v3, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x40a00000    # 5.0f

    :goto_0
    return v0

    .line 1063
    :cond_1
    array-length v1, p2

    add-int/lit8 v1, v1, -0x1

    if-lt p1, v1, :cond_2

    const/high16 p1, 0x3f000000    # 0.5f

    return p1

    :cond_2
    add-int/lit8 v1, p1, 0x1

    .line 1066
    aget-wide v1, p2, v1

    add-int/lit8 p1, p1, -0x1

    aget-wide p1, p2, p1

    cmpl-double v3, v1, p1

    if-lez v3, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private getFftSlidingFreq3(I[D)F
    .locals 4

    const/high16 v0, 0x3f800000    # 1.0f

    if-nez p1, :cond_1

    add-int/lit8 v1, p1, 0x1

    .line 1071
    aget-wide v1, p2, v1

    aget-wide p1, p2, p1

    cmpl-double v3, v1, p1

    if-lez v3, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x40a00000    # 5.0f

    :goto_0
    return v0

    .line 1073
    :cond_1
    array-length v1, p2

    add-int/lit8 v1, v1, -0x1

    if-lt p1, v1, :cond_2

    const/high16 p1, 0x3f000000    # 0.5f

    return p1

    .line 1076
    :cond_2
    aget-wide v1, p2, p1

    add-int/lit8 p1, p1, -0x1

    aget-wide p1, p2, p1

    cmpl-double v3, v1, p1

    if-lez v3, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private getMag2(FFI[DF)F
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 973
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessIndexes:[I

    array-length v3, v2

    if-ge v1, v3, :cond_0

    .line 975
    aget v2, v2, v1

    add-int/2addr v2, p3

    array-length v3, p4

    add-int/2addr v2, v3

    array-length v3, p4

    rem-int/2addr v2, v3

    int-to-float v3, v2

    const/high16 v4, 0x3f000000    # 0.5f

    sub-float v5, v3, v4

    mul-float v5, v5, p5

    add-float/2addr v3, v4

    mul-float v3, v3, p5

    .line 980
    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftMagSlide:[F

    aget v4, v4, v2

    const/high16 v6, 0x3f800000    # 1.0f

    sub-float v7, v6, v4

    mul-float v5, v5, v7

    mul-float v3, v3, v4

    add-float/2addr v5, v3

    sub-float v3, p1, v5

    sub-float v4, p1, p2

    mul-float v4, v4, v6

    div-float/2addr v3, v4

    .line 986
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    invoke-static {v3, v6}, Ljava/lang/Math;->min(FF)F

    move-result v3

    sub-float/2addr v6, v3

    float-to-double v3, v0

    .line 1010
    aget-wide v7, p4, v2

    float-to-double v5, v6

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v7, v7, v5

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessWeight:[F

    aget v0, v0, v1

    float-to-double v5, v0

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v7, v7, v5

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v3, v7

    double-to-float v0, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1012
    :cond_0
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessDivider:F

    div-float/2addr v0, p1

    return v0
.end method

.method private getMag2_3(FFI[DF)F
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p4

    .line 1026
    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessIndexes:[I

    const/4 v3, 0x0

    aget v2, v2, v3

    add-int v2, v2, p3

    array-length v4, v1

    add-int/2addr v2, v4

    array-length v4, v1

    rem-int/2addr v2, v4

    int-to-float v4, v2

    const/high16 v5, 0x3f000000    # 0.5f

    sub-float v6, v4, v5

    mul-float v6, v6, p5

    add-float/2addr v4, v5

    mul-float v4, v4, p5

    .line 1029
    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftMagSlide:[F

    aget v7, v7, v2

    const/high16 v8, 0x3f800000    # 1.0f

    sub-float v9, v8, v7

    mul-float v6, v6, v9

    mul-float v4, v4, v7

    add-float/2addr v6, v4

    sub-float v4, p1, v6

    sub-float v6, p1, p2

    mul-float v6, v6, v8

    div-float/2addr v4, v6

    .line 1032
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    invoke-static {v4, v8}, Ljava/lang/Math;->min(FF)F

    move-result v4

    sub-float v4, v8, v4

    const/4 v7, 0x0

    float-to-double v9, v7

    .line 1033
    aget-wide v11, v1, v2

    float-to-double v13, v4

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v11, v11, v13

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessWeight:[F

    aget v2, v2, v3

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v11, v11, v2

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v9, v11

    double-to-float v2, v9

    .line 1036
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessIndexes:[I

    const/4 v4, 0x1

    aget v3, v3, v4

    add-int v3, v3, p3

    array-length v7, v1

    add-int/2addr v3, v7

    array-length v7, v1

    rem-int/2addr v3, v7

    int-to-float v7, v3

    sub-float v9, v7, v5

    mul-float v9, v9, p5

    add-float/2addr v7, v5

    mul-float v7, v7, p5

    .line 1039
    iget-object v10, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftMagSlide:[F

    aget v10, v10, v3

    sub-float v11, v8, v10

    mul-float v9, v9, v11

    mul-float v7, v7, v10

    add-float/2addr v9, v7

    sub-float v7, p1, v9

    div-float/2addr v7, v6

    .line 1042
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    move-result v7

    sub-float v7, v8, v7

    float-to-double v9, v2

    .line 1043
    aget-wide v2, v1, v3

    float-to-double v11, v7

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v11

    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessWeight:[F

    aget v4, v7, v4

    float-to-double v11, v4

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v11

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v9, v2

    double-to-float v2, v9

    .line 1046
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessIndexes:[I

    const/4 v4, 0x2

    aget v3, v3, v4

    add-int v3, v3, p3

    array-length v7, v1

    add-int/2addr v3, v7

    array-length v7, v1

    rem-int/2addr v3, v7

    int-to-float v7, v3

    sub-float v9, v7, v5

    mul-float v9, v9, p5

    add-float/2addr v7, v5

    mul-float v7, v7, p5

    .line 1049
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftMagSlide:[F

    aget v5, v5, v3

    sub-float v10, v8, v5

    mul-float v9, v9, v10

    mul-float v7, v7, v5

    add-float/2addr v9, v7

    sub-float v5, p1, v9

    div-float/2addr v5, v6

    .line 1052
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    invoke-static {v5, v8}, Ljava/lang/Math;->min(FF)F

    move-result v5

    sub-float/2addr v8, v5

    float-to-double v5, v2

    .line 1053
    aget-wide v2, v1, v3

    float-to-double v7, v8

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v7

    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessWeight:[F

    aget v1, v1, v4

    float-to-double v7, v1

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v7

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v5, v2

    double-to-float v1, v5

    .line 1056
    iget v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessDivider:F

    div-float/2addr v1, v2

    return v1
.end method

.method private getMag2b(FFII[DFI)F
    .locals 6

    sub-int/2addr p4, p3

    const/4 p6, 0x1

    .line 895
    invoke-static {p4, p6}, Ljava/lang/Math;->max(II)I

    move-result p4

    .line 896
    div-int/lit8 p6, p4, 0x2

    const/4 p6, 0x0

    const/4 p7, 0x0

    :goto_0
    if-ge p7, p4, :cond_0

    add-int v0, p7, p3

    .line 902
    array-length v1, p5

    add-int/2addr v0, v1

    array-length v1, p5

    rem-int/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    float-to-double v2, p6

    .line 913
    aget-wide v4, p5, v0

    float-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v2, v4

    double-to-float p6, v2

    add-int/lit8 p7, p7, 0x1

    goto :goto_0

    :cond_0
    sub-float/2addr p2, p1

    div-float/2addr p6, p2

    return p6
.end method

.method private getMag2c(FFI[DF)F
    .locals 2

    const/4 v0, 0x0

    const v1, 0x33d6bf95    # 1.0E-7f

    cmpg-float v1, p1, v1

    if-gez v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 p3, p3, 0x0

    .line 937
    array-length v1, p4

    add-int/2addr p3, v1

    array-length v1, p4

    rem-int/2addr p3, v1

    int-to-float v1, p3

    add-float/2addr v1, v0

    mul-float v1, v1, p5

    sub-float p5, p1, v1

    sub-float/2addr p1, p2

    const p2, 0x3089705f    # 1.0E-9f

    add-float/2addr p1, p2

    div-float/2addr p5, p1

    .line 959
    invoke-static {p5}, Ljava/lang/Math;->abs(F)F

    move-result p1

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    sub-float/2addr p2, p1

    float-to-double v0, v0

    .line 961
    aget-wide p3, p4, p3

    float-to-double p1, p2

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p3, p3, p1

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v0, p3

    double-to-float p1, v0

    return p1
.end method

.method static logspace(DDII)D
    .locals 2

    div-double/2addr p2, p0

    int-to-double v0, p4

    add-int/lit8 p5, p5, -0x1

    int-to-double p4, p5

    .line 1280
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {p4, p5}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, p4

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p2

    mul-double p0, p0, p2

    return-wide p0
.end method

.method private declared-synchronized processTh(FLcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)[F
    .locals 15

    move-object v10, p0

    monitor-enter p0

    .line 290
    :try_start_0
    invoke-interface/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestOverrideAudioFrameSamplesInCount()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    .line 291
    :cond_0
    iget v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->dataCount:I

    :goto_0
    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestSoundVisualizationData(I)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object v0

    const v1, 0xac44

    const/4 v2, 0x4

    const/4 v11, 0x0

    const/4 v3, 0x1

    const/4 v12, 0x0

    if-eqz v0, :cond_1

    .line 299
    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmAsMonoForFft_DoubleDataRate()Lcom/daaw/avee/Common/ISimpleListShort;

    move-result-object v4

    .line 300
    invoke-interface {v4}, Lcom/daaw/avee/Common/ISimpleListShort;->size()I

    move-result v5

    .line 301
    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/AudioFrameData;->IsDoubleDataRate()Z

    move-result v6

    .line 303
    iget v7, v0, Lcom/daaw/avee/comp/playback/AudioFrameData;->sampleRate:I

    .line 304
    iget-object v8, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->pcmRangeTmp:[F

    aput v11, v8, v12

    .line 305
    iget-object v8, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->pcmRangeTmp:[F

    iget-short v0, v0, Lcom/daaw/avee/comp/playback/AudioFrameData;->maxPcmValue:S

    int-to-float v0, v0

    aput v0, v8, v3

    move v9, v6

    goto :goto_1

    .line 307
    :cond_1
    new-instance v4, Lcom/daaw/avee/Common/SimpleListConstantShort;

    invoke-direct {v4, v12, v2}, Lcom/daaw/avee/Common/SimpleListConstantShort;-><init>(SI)V

    .line 310
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->pcmRangeTmp:[F

    aput v11, v0, v12

    .line 311
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->pcmRangeTmp:[F

    const/high16 v5, 0x447a0000    # 1000.0f

    aput v5, v0, v3

    const/4 v5, 0x4

    const v7, 0xac44

    const/4 v9, 0x0

    :goto_1
    if-ge v5, v2, :cond_2

    .line 316
    new-instance v4, Lcom/daaw/avee/Common/SimpleListConstantShort;

    invoke-direct {v4, v12, v2}, Lcom/daaw/avee/Common/SimpleListConstantShort;-><init>(SI)V

    const v6, 0xac44

    goto :goto_2

    :cond_2
    move v2, v5

    move v6, v7

    .line 321
    :goto_2
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barValues:[F

    array-length v0, v0

    iget v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barsCount:I

    if-eq v0, v1, :cond_3

    .line 322
    iget v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barsCount:I

    new-array v0, v0, [F

    iput-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barValues:[F

    .line 324
    :cond_3
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barSmoothValues:[F

    array-length v0, v0

    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barValues:[F

    array-length v1, v1

    if-eq v0, v1, :cond_4

    .line 325
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barValues:[F

    array-length v0, v0

    new-array v0, v0, [F

    iput-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barSmoothValues:[F

    const/4 v0, 0x0

    .line 326
    :goto_3
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barSmoothValues:[F

    array-length v1, v1

    if-ge v0, v1, :cond_4

    .line 327
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barSmoothValues:[F

    aput v11, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 332
    :cond_4
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftWindowMultipliers:[F

    array-length v0, v0

    if-eq v2, v0, :cond_5

    .line 333
    new-array v0, v2, [F

    iput-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftWindowMultipliers:[F

    const/4 v0, 0x0

    :goto_4
    if-ge v0, v2, :cond_5

    .line 336
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftWindowMultipliers:[F

    const/high16 v5, 0x3b800000    # 0.00390625f

    invoke-static {v0, v2}, Lcom/daaw/avee/comp/Visualizer/Dsp/DspWindows;->hannWindow(II)F

    move-result v7

    mul-float v7, v7, v5

    aput v7, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 343
    :cond_5
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->pcmRangeTmp:[F

    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->updateRange([F)V

    .line 346
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftResultDouble:[D

    array-length v0, v0

    if-eq v0, v2, :cond_6

    .line 347
    new-array v0, v2, [D

    iput-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftResultDouble:[D

    :cond_6
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 350
    :goto_5
    iget-object v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftResultDouble:[D

    array-length v5, v5

    if-ge v0, v5, :cond_7

    .line 352
    invoke-interface {v4, v0}, Lcom/daaw/avee/Common/ISimpleListShort;->get(I)S

    move-result v5

    int-to-float v5, v5

    iget-object v7, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftWindowMultipliers:[F

    aget v7, v7, v0

    mul-float v5, v5, v7

    .line 356
    iget v7, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->rangeSmoothMul:F

    mul-float v5, v5, v7

    mul-float v7, v5, v5

    add-float/2addr v1, v7

    .line 359
    iget-object v7, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftResultDouble:[D

    float-to-double v13, v5

    aput-wide v13, v7, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 362
    :cond_7
    iget v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftTransformInitializeSize:I

    if-eq v0, v2, :cond_8

    .line 363
    iput v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftTransformInitializeSize:I

    .line 364
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftTransform:Llomont/FFTBase;

    invoke-virtual {v0, v2}, Llomont/FFTBase;->Initialize(I)V

    .line 367
    :cond_8
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftTransform:Llomont/FFTBase;

    iget-object v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftResultDouble:[D

    invoke-virtual {v0, v4, v3}, Llomont/FFTBase;->RealFFT([DZ)V

    if-lez v2, :cond_9

    int-to-float v0, v2

    div-float/2addr v1, v0

    float-to-double v0, v1

    .line 391
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v1, v0

    .line 392
    :cond_9
    iput v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->windowedRms:F

    const/4 v0, 0x2

    new-array v7, v0, [F

    .line 396
    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barValues:[F

    iget v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->outputMultiplier:F

    iget-boolean v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->mirrorSampleValues:Z

    iget-object v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftResultAccess:Lcom/daaw/avee/Common/ISimpleListDouble;

    iget-object v8, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatBarValue:[F

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fillBarValues2([FFZLcom/daaw/avee/Common/ISimpleListDouble;I[F[FZ)V

    .line 457
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatRange:Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barSmoothValues:[F

    array-length v1, v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->reset(I)V

    .line 459
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barValues:[F

    array-length v0, v0

    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barSmoothValues:[F

    array-length v1, v1

    invoke-static {v0, v1}, Ljunit/framework/Assert;->assertEquals(II)V

    .line 463
    iput v11, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->peakBarIndex01:F

    const v0, -0x39e3c000    # -10000.0f

    const/4 v1, 0x0

    .line 465
    :goto_6
    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barValues:[F

    array-length v2, v2

    if-ge v1, v2, :cond_b

    .line 467
    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barValues:[F

    aget v2, v2, v1

    cmpl-float v2, v2, v0

    if-lez v2, :cond_a

    .line 468
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barValues:[F

    aget v0, v0, v1

    int-to-float v2, v1

    .line 469
    iput v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->peakBarIndex01:F

    .line 476
    :cond_a
    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barValues:[F

    aget v2, v2, v1

    iget-object v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barSmoothValues:[F

    aget v3, v3, v1

    sub-float/2addr v2, v3

    .line 478
    iget-object v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barSmoothValues:[F

    aget v4, v3, v1

    const/high16 v5, 0x41a00000    # 20.0f

    mul-float v2, v2, v5

    mul-float v2, v2, p1

    iget v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->smoothFactor:F

    mul-float v2, v2, v5

    add-float/2addr v4, v2

    aput v4, v3, v1

    .line 479
    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barSmoothValues:[F

    iget-object v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barSmoothValues:[F

    aget v3, v3, v1

    invoke-static {v3, v11}, Ljava/lang/Math;->max(FF)F

    move-result v3

    aput v3, v2, v1

    .line 481
    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatRange:Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

    iget-object v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barSmoothValues:[F

    aget v3, v3, v1

    invoke-virtual {v2, v1, v3}, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->addValue(IF)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    .line 494
    :cond_b
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatBarValue:[F

    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatRange:Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->getValueNormal()F

    move-result v1

    aput v1, v0, v12

    .line 495
    iget v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatBarValueSmooth:F

    iget v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatSmoothFactor:F

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v1, v2, v1

    mul-float v0, v0, v1

    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatBarValue:[F

    aget v1, v1, v12

    iget v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatSmoothFactor:F

    mul-float v1, v1, v3

    add-float/2addr v0, v1

    iput v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatBarValueSmooth:F

    .line 498
    iget v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->peakBarIndex01:F

    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barValues:[F

    array-length v1, v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->peakBarIndex01:F

    .line 499
    iget v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->peakBarIndex01Smooth:F

    iget v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->peakBarSmoothFactor:F

    sub-float/2addr v2, v3

    mul-float v1, v1, v2

    iget v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->peakBarSmoothFactor:F

    mul-float v0, v0, v2

    add-float/2addr v1, v0

    iput v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->peakBarIndex01Smooth:F

    .line 539
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barSmoothValues:[F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_8

    :goto_7
    throw v0

    :goto_8
    goto :goto_7
.end method

.method private declared-synchronized setAweightFft(F)V
    .locals 0

    monitor-enter p0

    .line 1289
    :try_start_0
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->aweightFft:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1290
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized setBeatRangeCorners(FFFF)V
    .locals 1

    monitor-enter p0

    .line 279
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatRange:Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->setCorners(FFFF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 280
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized setBeatSmooth(F)V
    .locals 0

    monitor-enter p0

    .line 274
    :try_start_0
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatSmoothFactor:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 275
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized setFftFilter(IF)V
    .locals 1

    monitor-enter p0

    .line 264
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftFilter:Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->createHighPass(IF)Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 265
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized setOutputMultiplier(F)V
    .locals 0

    monitor-enter p0

    .line 1294
    :try_start_0
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->outputMultiplier:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1295
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private setSampleInCountPower(I)V
    .locals 1

    .line 147
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->sampleInCountPower:I

    const/4 v0, 0x1

    shl-int p1, v0, p1

    const/16 v0, 0x20

    .line 148
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    const/16 v0, 0x2000

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->dataCount:I

    return-void
.end method

.method private setSampleOutCount(IFFZIF)V
    .locals 10

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move/from16 v6, p6

    .line 161
    invoke-direct/range {v0 .. v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setSampleOutCount(IFFZIFIIF)V

    return-void
.end method

.method private declared-synchronized setSampleOutCount(IFFZIFIIF)V
    .locals 11

    move-object v10, p0

    monitor-enter p0

    const v0, 0x3dcccccd    # 0.1f

    move v1, p2

    .line 165
    :try_start_0
    invoke-static {p2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->loFreq:F

    move v0, p3

    .line 166
    iput v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->hiFreq:F

    const/16 v1, 0x2710

    move v2, p1

    .line 167
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x1

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barsCount:I

    move v5, p4

    .line 168
    iput-boolean v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->mirrorSampleValues:Z

    move/from16 v1, p5

    .line 169
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->repeatSamples:I

    move/from16 v6, p6

    .line 170
    iput v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->freqLinfactor:F

    .line 171
    iget v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barsCount:I

    new-array v1, v1, [F

    iput-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreq:[F

    .line 172
    iget v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barsCount:I

    new-array v1, v1, [F

    iput-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreqNext:[F

    move/from16 v7, p7

    .line 174
    iput v7, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->starBar:I

    move/from16 v8, p8

    .line 175
    iput v8, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->endBar:I

    move/from16 v9, p9

    .line 176
    iput v9, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->freqShift:F

    .line 177
    iget v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barsCount:I

    iget v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->loFreq:F

    move-object v1, p0

    move v4, p3

    move v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v1 .. v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->updateBandsFreq(IFFZFIIF)V

    const/4 v0, 0x6

    .line 179
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setBeatBart(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private setSampleOutCount(IFI)V
    .locals 10

    const/high16 v2, 0x41a00000    # 20.0f

    const v3, 0x468ca000    # 18000.0f

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v9, 0x0

    move-object v0, p0

    move v1, p1

    move v6, p2

    move v7, p3

    move v8, p3

    .line 153
    invoke-direct/range {v0 .. v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setSampleOutCount(IFFZIFIIF)V

    return-void
.end method

.method private setSampleOutCount(IZI)V
    .locals 10

    const/high16 v2, 0x41a00000    # 20.0f

    const v3, 0x468ca000    # 18000.0f

    const v6, 0x3d75c28f    # 0.06f

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move v1, p1

    move v4, p2

    move v5, p3

    .line 157
    invoke-direct/range {v0 .. v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setSampleOutCount(IFFZIFIIF)V

    return-void
.end method

.method private declared-synchronized setSmoothFactor(F)V
    .locals 0

    monitor-enter p0

    .line 184
    :try_start_0
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->smoothFactor:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized setSmoothFactor2(F)V
    .locals 0

    monitor-enter p0

    .line 189
    :try_start_0
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->smoothFactor2:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private updateBandsFreq(IFFZFIIF)V
    .locals 23

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    const/4 v4, 0x0

    move/from16 v5, p6

    .line 1082
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    move/from16 v6, p7

    .line 1083
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    const/4 v7, 0x1

    if-eqz p4, :cond_0

    if-le v1, v7, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    if-eqz v8, :cond_1

    .line 1091
    div-int/lit8 v9, v1, 0x2

    goto :goto_1

    :cond_1
    move v9, v1

    :goto_1
    if-eqz v8, :cond_2

    .line 1092
    div-int/lit8 v8, v1, 0x2

    goto :goto_2

    :cond_2
    move v8, v1

    :goto_2
    sub-int/2addr v8, v5

    sub-int/2addr v8, v6

    .line 1095
    iget v10, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->repeatSamples:I

    div-int v10, v8, v10

    invoke-static {v10, v7}, Ljava/lang/Math;->max(II)I

    move-result v10

    const/4 v11, 0x0

    :goto_3
    const/16 v17, 0x0

    if-ge v11, v1, :cond_3

    .line 1103
    iget-object v12, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreq:[F

    aput v17, v12, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_3
    const v11, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v18, 0x7f7fffff    # Float.MAX_VALUE

    const/16 v19, 0x0

    :goto_4
    if-ge v15, v8, :cond_6

    int-to-float v11, v8

    mul-float v11, v11, p8

    float-to-int v11, v11

    sub-int v11, v15, v11

    add-int/2addr v11, v8

    .line 1115
    rem-int/2addr v11, v10

    .line 1130
    iget-object v12, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreq:[F

    add-int v20, v15, v5

    move/from16 p4, v8

    float-to-double v7, v2

    move/from16 v21, v5

    float-to-double v4, v3

    move/from16 p7, v11

    move-object/from16 v22, v12

    move-wide v11, v7

    move v7, v13

    move v8, v14

    move-wide v13, v4

    move v4, v15

    move/from16 v15, p7

    move/from16 v16, v10

    invoke-static/range {v11 .. v16}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->logspace(DDII)D

    move-result-wide v11

    double-to-float v5, v11

    aput v5, v22, v20

    int-to-float v5, v10

    const/high16 v11, 0x3f800000    # 1.0f

    div-float v5, v11, v5

    sub-float v12, v3, v2

    move/from16 v13, p7

    int-to-float v13, v13

    mul-float v13, v13, v5

    mul-float v12, v12, v13

    add-float v5, v2, v12

    .line 1133
    iget-object v12, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreq:[F

    aget v13, v12, v20

    sub-float v11, v11, p5

    mul-float v13, v13, v11

    mul-float v5, v5, p5

    add-float/2addr v13, v5

    aput v13, v12, v20

    .line 1136
    aget v5, v12, v20

    cmpl-float v5, v18, v5

    if-lez v5, :cond_4

    .line 1138
    aget v5, v12, v20

    move/from16 v18, v5

    move/from16 v13, v20

    goto :goto_5

    :cond_4
    move v13, v7

    .line 1142
    :goto_5
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreq:[F

    aget v7, v5, v20

    cmpg-float v7, v19, v7

    if-gez v7, :cond_5

    .line 1144
    aget v19, v5, v20

    move/from16 v14, v20

    goto :goto_6

    :cond_5
    move v14, v8

    :goto_6
    add-int/lit8 v15, v4, 0x1

    move/from16 v8, p4

    move/from16 v5, v21

    const/4 v4, 0x0

    const/4 v7, 0x1

    goto :goto_4

    :cond_6
    move/from16 v21, v5

    move/from16 p4, v8

    move v7, v13

    move v8, v14

    const/4 v2, 0x0

    :goto_7
    if-ge v2, v1, :cond_c

    move/from16 v3, v21

    if-le v2, v3, :cond_7

    if-eq v2, v7, :cond_7

    .line 1223
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreq:[F

    add-int/lit8 v5, v2, -0x1

    add-int/2addr v5, v1

    rem-int/2addr v5, v1

    aget v4, v4, v5

    goto :goto_8

    :cond_7
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreq:[F

    aget v4, v4, v2

    :goto_8
    sub-int v5, p4, v6

    const/4 v10, 0x1

    sub-int/2addr v5, v10

    if-ge v2, v5, :cond_8

    if-eq v2, v8, :cond_8

    .line 1224
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreq:[F

    add-int/lit8 v10, v2, 0x1

    rem-int/2addr v10, v1

    aget v5, v5, v10

    goto :goto_9

    :cond_8
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreq:[F

    aget v5, v5, v2

    .line 1226
    :goto_9
    iget-object v10, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreqNext:[F

    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result v11

    aput v11, v10, v2

    cmpg-float v10, v4, v17

    if-gez v10, :cond_a

    cmpg-float v4, v5, v17

    if-gez v4, :cond_9

    .line 1232
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreqNext:[F

    aput v17, v4, v2

    goto :goto_a

    .line 1234
    :cond_9
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreqNext:[F

    aput v5, v4, v2

    goto :goto_a

    :cond_a
    cmpg-float v5, v4, v17

    if-gez v5, :cond_b

    .line 1238
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreqNext:[F

    aput v17, v4, v2

    goto :goto_a

    .line 1240
    :cond_b
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreqNext:[F

    aput v4, v5, v2

    :goto_a
    add-int/lit8 v2, v2, 0x1

    move/from16 v21, v3

    goto :goto_7

    :cond_c
    const/4 v4, 0x0

    :goto_b
    if-ge v4, v1, :cond_f

    .line 1249
    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreq:[F

    aget v3, v2, v4

    cmpg-float v3, v3, v17

    if-gez v3, :cond_d

    aput v17, v2, v4

    .line 1250
    :cond_d
    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreqNext:[F

    aget v3, v2, v4

    cmpg-float v3, v3, v17

    if-gez v3, :cond_e

    aput v17, v2, v4

    :cond_e
    add-int/lit8 v4, v4, 0x1

    goto :goto_b

    :cond_f
    const/4 v10, 0x1

    sub-int/2addr v1, v10

    move v3, v1

    const/4 v2, 0x1

    :goto_c
    if-lt v3, v9, :cond_10

    .line 1263
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreq:[F

    aget v5, v4, v2

    aput v5, v4, v3

    .line 1264
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barFreqNext:[F

    aget v5, v4, v2

    aput v5, v4, v3

    add-int/2addr v2, v10

    .line 1265
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    add-int/lit8 v3, v3, -0x1

    goto :goto_c

    :cond_10
    return-void
.end method

.method private updateRange([F)V
    .locals 5

    .line 549
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->rangeLoSmooth:F

    const v1, 0x3dccccd0    # 0.100000024f

    mul-float v0, v0, v1

    const/4 v2, 0x0

    aget v2, p1, v2

    const v3, 0x3f666666    # 0.9f

    mul-float v2, v2, v3

    add-float/2addr v0, v2

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->rangeLoSmooth:F

    const/4 v0, 0x1

    .line 551
    aget v2, p1, v0

    iget v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->rangeHiSmooth:F

    cmpl-float v2, v2, v4

    if-lez v2, :cond_0

    mul-float v4, v4, v1

    .line 552
    aget p1, p1, v0

    mul-float p1, p1, v3

    add-float/2addr v4, p1

    iput v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->rangeHiSmooth:F

    goto :goto_0

    :cond_0
    const v1, 0x3f7d70a4    # 0.99f

    mul-float v4, v4, v1

    .line 554
    aget p1, p1, v0

    const v0, 0x3c23d70a    # 0.01f

    mul-float p1, p1, v0

    add-float/2addr v4, p1

    iput v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->rangeHiSmooth:F

    .line 556
    :goto_0
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->rangeHiSmooth:F

    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->rangeLoSmooth:F

    sub-float/2addr p1, v0

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->rangeSmoothMul:F

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float p1, p1, v0

    if-gez p1, :cond_1

    .line 557
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->rangeSmoothMul:F

    :cond_1
    const/high16 p1, 0x43960000    # 300.0f

    .line 558
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->rangeSmoothMul:F

    div-float/2addr p1, v0

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->rangeSmoothMul:F

    return-void
.end method


# virtual methods
.method public declared-synchronized getBeatBarValueSmooth()F
    .locals 1

    monitor-enter p0

    .line 1417
    :try_start_0
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatBarValueSmooth:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getPeakBarIndexSmooth()F
    .locals 1

    monitor-enter p0

    .line 1421
    :try_start_0
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->peakBarIndex01Smooth:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 13

    monitor-enter p0

    :try_start_0
    const-string v0, "fftSize"

    const/16 v1, 0xb

    .line 1336
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setSampleInCountPower(I)V

    const-string v0, "sampleOutCount"

    const/16 v1, 0x80

    .line 1339
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v3

    const-string v0, "lowerHz"

    const/high16 v1, 0x41a00000    # 20.0f

    .line 1340
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v4

    const-string v0, "higherHz"

    const v1, 0x468ca000    # 18000.0f

    .line 1341
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v5

    const-string v0, "mirrorSamples"

    const/4 v1, 0x0

    .line 1342
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v6

    const-string v0, "repeatSamples"

    const/4 v12, 0x1

    .line 1343
    invoke-virtual {p1, v0, v12}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v7

    const-string v0, "hzLinearFactor"

    const v2, 0x3d75c28f    # 0.06f

    .line 1344
    invoke-virtual {p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v8

    const-string v0, "starAndEndGap"

    .line 1345
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v9

    const-string v0, "starAndEndGap"

    .line 1346
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v10

    const-string v0, "freqShift"

    const/4 v1, 0x0

    .line 1347
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v11

    move-object v2, p0

    .line 1338
    invoke-direct/range {v2 .. v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setSampleOutCount(IFFZIFIIF)V

    const-string v0, "smooth"

    const v2, 0x3f4ccccd    # 0.8f

    .line 1350
    invoke-virtual {p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setSmoothFactor(F)V

    const-string v0, "preSmooth"

    const/high16 v2, 0x3f800000    # 1.0f

    .line 1351
    invoke-virtual {p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setSmoothFactor2(F)V

    const-string v0, "filterRadius"

    .line 1355
    invoke-virtual {p1, v0, v12}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v0

    const-string v3, "filterStrength"

    .line 1356
    invoke-virtual {p1, v3, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v3

    .line 1355
    invoke-direct {p0, v0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setFftFilter(IF)V

    const-string v0, "beatSmooth"

    const v3, 0x3ecccccd    # 0.4f

    .line 1359
    invoke-virtual {p1, v0, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setBeatSmooth(F)V

    const-string v0, "beatRangeBarFirst"

    .line 1362
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    const-string v1, "beatRangeBarLast"

    const v3, 0x3e4ccccd    # 0.2f

    .line 1363
    invoke-virtual {p1, v1, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v1

    const-string v4, "beatRangeValueLower"

    const v5, 0x3f333333    # 0.7f

    .line 1364
    invoke-virtual {p1, v4, v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v4

    const-string v5, "beatRangeValueHigher"

    const/high16 v6, 0x420c0000    # 35.0f

    .line 1365
    invoke-virtual {p1, v5, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v5

    .line 1361
    invoke-direct {p0, v0, v1, v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setBeatRangeCorners(FFFF)V

    const-string v0, "aWeight"

    .line 1374
    invoke-virtual {p1, v0, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setAweightFft(F)V

    const-string v0, "outputMultiplier"

    .line 1375
    invoke-virtual {p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result p1

    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->setOutputMultiplier(F)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1376
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 13

    monitor-enter p0

    :try_start_0
    const-string v2, "fftSize"

    .line 1381
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->sampleInCountPower:I

    const-string v4, "Performance"

    const/4 v5, 0x7

    const/16 v6, 0xd

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    const-string v8, "sampleOutCount"

    .line 1382
    iget v9, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->barsCount:I

    const-string v10, "1_spectrum"

    const/4 v11, 0x0

    const/16 v12, 0x200

    move-object v7, p1

    invoke-virtual/range {v7 .. v12}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    const-string v2, "lowerHz"

    .line 1384
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->loFreq:F

    const-string v4, "1_spectrumHz"

    const/4 v5, 0x0

    const/high16 v6, 0x43960000    # 300.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v8, "higherHz"

    .line 1385
    iget v9, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->hiFreq:F

    const-string v10, "1_spectrumHz"

    const/high16 v11, 0x43960000    # 300.0f

    const v12, 0x468ca000    # 18000.0f

    move-object v7, p1

    invoke-virtual/range {v7 .. v12}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "hzLinearFactor"

    .line 1386
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->freqLinfactor:F

    const-string v4, "1_spectrumHz"

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v8, "freqShift"

    .line 1387
    iget v9, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->freqShift:F

    const-string v10, "1_spectrumHz"

    const/4 v11, 0x0

    const/high16 v12, 0x3f800000    # 1.0f

    move-object v7, p1

    invoke-virtual/range {v7 .. v12}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v0, "mirrorSamples"

    .line 1389
    iget-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->mirrorSampleValues:Z

    const-string v2, "1_spectrum"

    invoke-virtual {p1, v0, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    const-string v4, "repeatSamples"

    .line 1390
    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->repeatSamples:I

    const-string v6, "1_spectrum"

    const/4 v7, 0x1

    const/4 v8, 0x6

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    const-string v4, "starAndEndGap"

    .line 1391
    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->starBar:I

    const-string v6, "1_spectrum"

    const/4 v7, 0x0

    const/16 v8, 0x1e

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    const-string v4, "smooth"

    .line 1395
    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->smoothFactor:F

    const-string v6, "1_spectrum"

    const v7, 0x3dcccccd    # 0.1f

    const/high16 v8, 0x3f800000    # 1.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v4, "preSmooth"

    .line 1396
    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->smoothFactor2:F

    const-string v6, "1_spectrum"

    const v7, 0x3dcccccd    # 0.1f

    const/high16 v8, 0x3f800000    # 1.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v4, "filterRadius"

    .line 1400
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftFilter:Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->getRadius()I

    move-result v5

    const-string v6, "1_spectrum"

    const/4 v7, 0x0

    const/16 v8, 0x14

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    const-string v4, "filterStrength"

    .line 1401
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftFilter:Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1d;->getStrength()F

    move-result v5

    const-string v6, "1_spectrum"

    const v7, 0x3dcccccd    # 0.1f

    const/high16 v8, 0x40000000    # 2.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v4, "beatSmooth"

    .line 1406
    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatSmoothFactor:F

    const-string v6, "beat"

    const v7, 0x3dcccccd    # 0.1f

    const/high16 v8, 0x3f800000    # 1.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v4, "beatRangeBarFirst"

    .line 1407
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatRange:Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->getX0()F

    move-result v5

    const-string v6, "beat"

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v4, "beatRangeBarLast"

    .line 1408
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatRange:Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->getX1()F

    move-result v5

    const-string v6, "beat"

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v4, "beatRangeValueLower"

    .line 1409
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatRange:Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->getY0()F

    move-result v5

    const-string v6, "beat"

    const/4 v7, 0x0

    const/high16 v8, 0x42480000    # 50.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v4, "beatRangeValueHigher"

    .line 1410
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->beatRange:Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->getY1()F

    move-result v5

    const-string v6, "beat"

    const/4 v7, 0x0

    const/high16 v8, 0x42c80000    # 100.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v4, "aWeight"

    .line 1412
    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->aweightFft:F

    const-string v6, "1_spectrum"

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v4, "outputMultiplier"

    .line 1413
    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->outputMultiplier:F

    const-string v6, "1_spectrum"

    const v7, 0x3dcccccd    # 0.1f

    const/high16 v8, 0x40400000    # 3.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1414
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized setBeatBart(I)V
    .locals 0

    monitor-enter p0

    .line 193
    :try_start_0
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->rmsTargetBar:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 194
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setDataMode(I)V
    .locals 0

    monitor-enter p0

    .line 198
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized setFftSoftness(I)V
    .locals 4

    monitor-enter p0

    const/4 v0, 0x1

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    :cond_0
    add-int/lit8 v0, p1, 0x1

    add-int/2addr v0, p1

    .line 251
    :try_start_0
    new-array v0, v0, [I

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessIndexes:[I

    .line 252
    array-length v1, v0

    new-array v1, v1, [F

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessWeight:[F

    .line 253
    array-length v0, v0

    int-to-float v0, v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessDivider:F

    const/4 v0, 0x0

    .line 255
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessIndexes:[I

    array-length v1, v1

    if-ge v0, v1, :cond_1

    sub-int v1, v0, p1

    .line 257
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessIndexes:[I

    aput v1, v2, v0

    .line 258
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessWeight:[F

    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessIndexes:[I

    array-length v3, v3

    add-int/lit8 v3, v3, 0x2

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v3, v1

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->fftSoftnessIndexes:[I

    array-length v1, v1

    add-int/lit8 v1, v1, 0x2

    invoke-static {v3, v1}, Lcom/daaw/avee/comp/Visualizer/Dsp/DspWindows;->hammingWindow(II)F

    move-result v1

    aput v1, v2, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 260
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public declared-synchronized setFrequencyBinSliding(Z)V
    .locals 0

    monitor-enter p0

    .line 269
    :try_start_0
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->frequencyBinSliding:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 270
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setSmooth(F)V
    .locals 1

    monitor-enter p0

    const v0, 0x3c23d70a    # 0.01f

    .line 202
    :try_start_0
    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->smoothFactor:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 203
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setSmooth2(F)V
    .locals 1

    monitor-enter p0

    const v0, 0x3c23d70a    # 0.01f

    .line 206
    :try_start_0
    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->smoothFactor2:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 207
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setSteadySmooth(F)V
    .locals 1

    monitor-enter p0

    const v0, 0x3c23d70a    # 0.01f

    .line 210
    :try_start_0
    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData$AudioProcess;->steadySmooth:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 211
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
