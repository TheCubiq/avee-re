.class Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;
.super Ljava/lang/Object;
.source "SegmentAudioSpectrumDataPhaseS.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Base/ICustomizable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AudioProcess"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess$FftSimpleListDouble;
    }
.end annotation


# static fields
.field private static final KEEP_ALIVE_TIME:I = 0x1


# instance fields
.field private final KEEP_ALIVE_TIME_UNIT:Ljava/util/concurrent/TimeUnit;

.field private NUMBER_OF_CORES:I

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

.field binMagnitudes:[D

.field private dataCountInMs:I

.field private endBar:I

.field fftFilter:Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1dv2;

.field private fftMag:[D

.field private fftMagSmooth:[F

.field fftResultAccess:Lcom/daaw/avee/Common/ISimpleListDouble;

.field fftResultDouble:[D

.field private fftSoftnessDivider:F

.field private fftSoftnessIndexes:[I

.field private fftSoftnessWeight:[F

.field private fftSoftnessWidth:I

.field fftTransform:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

.field fftTransformInitializeSize:I

.field fftWindowMultipliers:[F

.field private freqLinfactor:F

.field private freqShift:F

.field private frequencyBinSliding:Z

.field private hiFreq:F

.field private highQualityAudioCapture:Z

.field lastSampleRate:I

.field private loFreq:F

.field final lockObj:Ljava/lang/Object;

.field mDecodeThreadPool:Ljava/util/concurrent/ThreadPoolExecutor;

.field private final mDecodeWorkQueue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

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

.field private smoothFactor:F

.field private starBar:I

.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;

.field private windowedRms:F


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;)V
    .locals 14

    .line 172
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x5a

    .line 37
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->dataCountInMs:I

    const/4 p1, 0x0

    .line 38
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->highQualityAudioCapture:Z

    const/4 v0, 0x1

    new-array v1, v0, [D

    .line 41
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftMag:[D

    new-array v1, v0, [F

    .line 43
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftMagSmooth:[F

    const/4 v1, 0x2

    new-array v2, v1, [F

    .line 44
    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->pcmRangeTmp:[F

    .line 50
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->starBar:I

    .line 51
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->endBar:I

    const/4 v2, 0x0

    .line 52
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->freqShift:F

    const/16 v3, 0x40

    .line 53
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barsCount:I

    new-array v4, v0, [F

    .line 54
    iput-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barSmoothValues:[F

    new-array v4, v0, [F

    .line 55
    iput-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barValues:[F

    new-array v4, v0, [F

    .line 56
    iput-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreq:[F

    new-array v4, v0, [F

    .line 57
    iput-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreqNext:[F

    new-array v4, v0, [F

    .line 60
    iput-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatBarValue:[F

    .line 61
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatBarValueSmooth:F

    .line 62
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->mirrorSampleValues:Z

    .line 63
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->repeatSamples:I

    const/high16 v4, 0x3f800000    # 1.0f

    .line 66
    iput v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->smoothFactor:F

    const/high16 v5, 0x43960000    # 300.0f

    .line 68
    iput v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->rangeTarget:F

    const v5, 0x3f666666    # 0.9f

    .line 69
    iput v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->rangeSmoothAttackFactor:F

    const v5, 0x3c23d70a    # 0.01f

    .line 70
    iput v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->rangeSmoothDecayFactor:F

    const v5, 0x3ecccccd    # 0.4f

    .line 71
    iput v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatSmoothFactor:F

    const/4 v5, 0x4

    .line 73
    iput v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->rmsTargetBar:I

    .line 74
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->windowedRms:F

    const/high16 v5, 0x447a0000    # 1000.0f

    .line 75
    iput v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->rangeHiSmooth:F

    .line 76
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->rangeLoSmooth:F

    .line 77
    iput v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->rangeSmoothMul:F

    new-array v5, p1, [I

    .line 84
    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftSoftnessIndexes:[I

    new-array v5, p1, [F

    .line 85
    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftSoftnessWeight:[F

    .line 86
    iput v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftSoftnessDivider:F

    .line 87
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftSoftnessWidth:I

    .line 88
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->freqLinfactor:F

    const v1, 0x3e4ccccd    # 0.2f

    .line 89
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->aweightFft:F

    .line 90
    iput v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->outputMultiplier:F

    .line 91
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->frequencyBinSliding:Z

    new-array v5, p1, [F

    .line 92
    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftWindowMultipliers:[F

    const/high16 v5, 0x3f000000    # 0.5f

    .line 94
    iput v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->peakBarSmoothFactor:F

    .line 95
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->peakBarIndex01:F

    .line 96
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->peakBarIndex01Smooth:F

    .line 98
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

    invoke-direct {v6, v5}, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;-><init>(F)V

    iput-object v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatRange:Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

    .line 102
    invoke-static {v0, v4}, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1dv2;->createHighPass(IF)Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1dv2;

    move-result-object v5

    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftFilter:Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1dv2;

    new-array v5, p1, [D

    .line 118
    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftResultDouble:[D

    .line 119
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftTransformInitializeSize:I

    new-array v5, p1, [D

    .line 124
    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->binMagnitudes:[D

    .line 152
    new-instance v5, Ljava/lang/Object;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lockObj:Ljava/lang/Object;

    .line 159
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v5

    iput v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->NUMBER_OF_CORES:I

    .line 161
    new-instance v5, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v5}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->mDecodeWorkQueue:Ljava/util/concurrent/BlockingQueue;

    .line 166
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->KEEP_ALIVE_TIME_UNIT:Ljava/util/concurrent/TimeUnit;

    const v5, 0xac44

    .line 415
    iput v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lastSampleRate:I

    .line 173
    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->NUMBER_OF_CORES:I

    const/4 v6, 0x3

    sub-int/2addr v5, v6

    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 174
    new-array v5, v9, [Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftTransform:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    const/4 v5, 0x0

    .line 175
    :goto_0
    iget-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftTransform:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    array-length v8, v7

    if-ge v5, v8, :cond_0

    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;-><init>()V

    aput-object v8, v7, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 177
    :cond_0
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess$FftSimpleListDouble;

    invoke-direct {v5, p0, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess$FftSimpleListDouble;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;)V

    iput-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftResultAccess:Lcom/daaw/avee/Common/ISimpleListDouble;

    const v5, 0x3d75c28f    # 0.06f

    .line 179
    invoke-virtual {p0, v3, v5, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setSampleOutCount(IFI)V

    .line 180
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setFftSoftness(I)V

    const p1, 0x3f333333    # 0.7f

    const/high16 v0, 0x420c0000    # 35.0f

    .line 183
    invoke-virtual {p0, v2, v1, p1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setBeatRangeCorners(FFFF)V

    .line 184
    invoke-virtual {p0, v6, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setFftFilter(IF)V

    .line 187
    new-instance p1, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v10, 0x1

    iget-object v12, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->KEEP_ALIVE_TIME_UNIT:Ljava/util/concurrent/TimeUnit;

    iget-object v13, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->mDecodeWorkQueue:Ljava/util/concurrent/BlockingQueue;

    move-object v7, p1

    move v8, v9

    invoke-direct/range {v7 .. v13}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->mDecodeThreadPool:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method private fillBarValues2([FFZLcom/daaw/avee/Common/ISimpleListDouble;I[F[FZ)V
    .locals 4

    .line 733
    array-length p3, p1

    const/4 p5, 0x0

    const/4 p7, 0x0

    const/4 p8, 0x4

    if-ge p3, p8, :cond_1

    .line 735
    :goto_0
    array-length p2, p1

    if-ge p7, p2, :cond_0

    .line 737
    aput p5, p1, p7

    add-int/lit8 p7, p7, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    const p3, 0x4b189676    # 9999990.0f

    .line 742
    aput p3, p6, p7

    const p3, -0x34e7698a    # -9999990.0f

    const/4 p8, 0x1

    .line 743
    aput p3, p6, p8

    .line 746
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftMag:[D

    array-length p3, p3

    invoke-interface {p4}, Lcom/daaw/avee/Common/ISimpleListDouble;->size()I

    move-result p6

    if-eq p3, p6, :cond_2

    .line 748
    invoke-interface {p4}, Lcom/daaw/avee/Common/ISimpleListDouble;->size()I

    move-result p3

    new-array p3, p3, [D

    iput-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftMag:[D

    .line 757
    :cond_2
    array-length p3, p1

    iget-object p6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftMag:[D

    array-length p6, p6

    if-ne p3, p6, :cond_3

    goto :goto_1

    :cond_3
    const/4 p8, 0x0

    :goto_1
    invoke-static {p8}, Ljunit/framework/Assert;->assertTrue(Z)V

    .line 759
    iget p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->aweightFft:F

    const/high16 p6, 0x3f800000    # 1.0f

    sub-float/2addr p6, p3

    .line 765
    :goto_2
    iget-object p8, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftMag:[D

    array-length p8, p8

    if-ge p7, p8, :cond_4

    .line 768
    iget-object p8, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftFilter:Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1dv2;

    invoke-virtual {p8, p7, p4}, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1dv2;->getSoftedClamped(ILcom/daaw/avee/Common/ISimpleListDouble;)D

    move-result-wide v0

    double-to-float p8, v0

    .line 769
    invoke-static {p8, p5}, Ljava/lang/Math;->max(FF)F

    move-result p8

    .line 779
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreq:[F

    aget v0, v0, p7

    float-to-double v0, v0

    const-wide v2, 0x40a4500000000000L    # 2600.0

    .line 792
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Dsp/DspCurves;->aweight(D)D

    move-result-wide v0

    double-to-float v0, v0

    const v1, 0x3dcccccd    # 0.1f

    mul-float v0, v0, v1

    mul-float v0, v0, p3

    add-float/2addr v0, p6

    mul-float p8, p8, v0

    mul-float p8, p8, p2

    .line 828
    aput p8, p1, p7

    add-int/lit8 p7, p7, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method

.method private setHighQualityAudioCapture(Z)V
    .locals 0

    .line 215
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->highQualityAudioCapture:Z

    return-void
.end method

.method private setSampleInCountAsMilliseconds(I)V
    .locals 0

    .line 210
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->dataCountInMs:I

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

    .line 231
    invoke-virtual/range {v0 .. v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setSampleOutCount(IFFZIFIIF)V

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

    .line 226
    invoke-virtual/range {v0 .. v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setSampleOutCount(IFFZIFIIF)V

    return-void
.end method

.method private updateBandsFreq(IFFZFIIF)V
    .locals 23

    move-object/from16 v7, p0

    move/from16 v8, p1

    move/from16 v9, p2

    move/from16 v10, p3

    const/4 v11, 0x0

    move/from16 v0, p6

    .line 1072
    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    move-result v12

    move/from16 v0, p7

    .line 1073
    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    move-result v13

    const/4 v14, 0x1

    if-eqz p4, :cond_0

    if-le v8, v14, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 1081
    div-int/lit8 v1, v8, 0x2

    move v15, v1

    goto :goto_1

    :cond_1
    move v15, v8

    :goto_1
    if-eqz v0, :cond_2

    .line 1082
    div-int/lit8 v0, v8, 0x2

    goto :goto_2

    :cond_2
    move v0, v8

    :goto_2
    sub-int/2addr v0, v12

    sub-int v6, v0, v13

    .line 1085
    iget v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->repeatSamples:I

    div-int v0, v6, v0

    invoke-static {v0, v14}, Ljava/lang/Math;->max(II)I

    move-result v5

    const/4 v0, 0x0

    :goto_3
    const/16 v16, 0x0

    if-ge v0, v8, :cond_3

    .line 1094
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreq:[F

    aput v16, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v17, 0x7f7fffff    # Float.MAX_VALUE

    const/16 v18, 0x0

    :goto_4
    if-ge v3, v6, :cond_6

    int-to-float v0, v6

    mul-float v0, v0, p8

    float-to-int v0, v0

    sub-int v0, v3, v0

    add-int/2addr v0, v6

    .line 1106
    rem-int v2, v0, v5

    .line 1121
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreq:[F

    add-int v19, v3, v12

    move/from16 p4, v15

    float-to-double v14, v9

    move/from16 v20, v12

    float-to-double v11, v10

    move-object/from16 v21, v0

    move-object/from16 v0, p0

    move/from16 v22, v1

    move/from16 p7, v2

    move-wide v1, v14

    move v15, v3

    move v14, v4

    move-wide v3, v11

    move v11, v5

    move/from16 v5, p7

    move v12, v6

    move v6, v11

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->logspace(DDII)D

    move-result-wide v0

    double-to-float v0, v0

    aput v0, v21, v19

    int-to-float v0, v11

    const/high16 v1, 0x3f800000    # 1.0f

    div-float v0, v1, v0

    sub-float v2, v10, v9

    move/from16 v3, p7

    int-to-float v3, v3

    mul-float v3, v3, v0

    mul-float v2, v2, v3

    add-float v0, v9, v2

    .line 1124
    iget-object v2, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreq:[F

    aget v3, v2, v19

    sub-float v1, v1, p5

    mul-float v3, v3, v1

    mul-float v0, v0, p5

    add-float/2addr v3, v0

    aput v3, v2, v19

    .line 1127
    aget v0, v2, v19

    cmpl-float v0, v17, v0

    if-lez v0, :cond_4

    .line 1129
    aget v0, v2, v19

    move/from16 v17, v0

    move/from16 v4, v19

    goto :goto_5

    :cond_4
    move v4, v14

    .line 1133
    :goto_5
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreq:[F

    aget v1, v0, v19

    cmpg-float v1, v18, v1

    if-gez v1, :cond_5

    .line 1135
    aget v18, v0, v19

    move/from16 v1, v19

    goto :goto_6

    :cond_5
    move/from16 v1, v22

    :goto_6
    add-int/lit8 v3, v15, 0x1

    move/from16 v15, p4

    move v5, v11

    move v6, v12

    move/from16 v12, v20

    const/4 v11, 0x0

    const/4 v14, 0x1

    goto :goto_4

    :cond_6
    move/from16 v22, v1

    move v14, v4

    move/from16 v20, v12

    move/from16 p4, v15

    move v12, v6

    const/4 v0, 0x0

    :goto_7
    if-ge v0, v8, :cond_c

    move/from16 v1, v20

    if-le v0, v1, :cond_7

    if-eq v0, v14, :cond_7

    .line 1215
    iget-object v2, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreq:[F

    add-int/lit8 v3, v0, -0x1

    add-int/2addr v3, v8

    rem-int/2addr v3, v8

    aget v2, v2, v3

    goto :goto_8

    :cond_7
    iget-object v2, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreq:[F

    aget v2, v2, v0

    :goto_8
    sub-int v6, v12, v13

    const/4 v3, 0x1

    sub-int/2addr v6, v3

    move/from16 v11, v22

    if-ge v0, v6, :cond_8

    if-eq v0, v11, :cond_8

    .line 1216
    iget-object v3, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreq:[F

    add-int/lit8 v4, v0, 0x1

    rem-int/2addr v4, v8

    aget v3, v3, v4

    goto :goto_9

    :cond_8
    iget-object v3, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreq:[F

    aget v3, v3, v0

    .line 1218
    :goto_9
    iget-object v4, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreqNext:[F

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v5

    aput v5, v4, v0

    cmpg-float v4, v2, v16

    if-gez v4, :cond_a

    cmpg-float v2, v3, v16

    if-gez v2, :cond_9

    .line 1224
    iget-object v2, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreqNext:[F

    aput v16, v2, v0

    goto :goto_a

    .line 1226
    :cond_9
    iget-object v2, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreqNext:[F

    aput v3, v2, v0

    goto :goto_a

    :cond_a
    cmpg-float v3, v2, v16

    if-gez v3, :cond_b

    .line 1232
    iget-object v2, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreqNext:[F

    aput v16, v2, v0

    goto :goto_a

    .line 1234
    :cond_b
    iget-object v3, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreqNext:[F

    aput v2, v3, v0

    :goto_a
    add-int/lit8 v0, v0, 0x1

    move/from16 v20, v1

    move/from16 v22, v11

    goto :goto_7

    :cond_c
    const/4 v11, 0x0

    :goto_b
    if-ge v11, v8, :cond_f

    .line 1244
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreq:[F

    aget v1, v0, v11

    cmpg-float v1, v1, v16

    if-gez v1, :cond_d

    aput v16, v0, v11

    .line 1245
    :cond_d
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreqNext:[F

    aget v1, v0, v11

    cmpg-float v1, v1, v16

    if-gez v1, :cond_e

    aput v16, v0, v11

    :cond_e
    add-int/lit8 v11, v11, 0x1

    goto :goto_b

    :cond_f
    const/4 v3, 0x1

    add-int/lit8 v0, v8, -0x1

    move/from16 v8, p4

    move v2, v0

    const/4 v1, 0x1

    :goto_c
    if-lt v2, v8, :cond_10

    .line 1259
    iget-object v4, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreq:[F

    aget v5, v4, v1

    aput v5, v4, v2

    .line 1260
    iget-object v4, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreqNext:[F

    aget v5, v4, v1

    aput v5, v4, v2

    add-int/2addr v1, v3

    .line 1261
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int/lit8 v2, v2, -0x1

    goto :goto_c

    :cond_10
    return-void
.end method

.method private updateRange([F)V
    .locals 5

    .line 684
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->rangeLoSmooth:F

    const v1, 0x3dccccd0    # 0.100000024f

    mul-float v0, v0, v1

    const/4 v2, 0x0

    aget v2, p1, v2

    const v3, 0x3f666666    # 0.9f

    mul-float v2, v2, v3

    add-float/2addr v0, v2

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->rangeLoSmooth:F

    const/4 v0, 0x1

    .line 686
    aget v2, p1, v0

    iget v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->rangeHiSmooth:F

    cmpl-float v2, v2, v4

    if-lez v2, :cond_0

    mul-float v4, v4, v1

    .line 687
    aget p1, p1, v0

    mul-float p1, p1, v3

    add-float/2addr v4, p1

    iput v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->rangeHiSmooth:F

    goto :goto_0

    :cond_0
    const v1, 0x3f7d70a4    # 0.99f

    mul-float v4, v4, v1

    .line 689
    aget p1, p1, v0

    const v0, 0x3c23d70a    # 0.01f

    mul-float p1, p1, v0

    add-float/2addr v4, p1

    iput v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->rangeHiSmooth:F

    .line 691
    :goto_0
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->rangeHiSmooth:F

    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->rangeLoSmooth:F

    sub-float/2addr p1, v0

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->rangeSmoothMul:F

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float p1, p1, v0

    if-gez p1, :cond_1

    .line 692
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->rangeSmoothMul:F

    :cond_1
    const/high16 p1, 0x43960000    # 300.0f

    .line 693
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->rangeSmoothMul:F

    div-float/2addr p1, v0

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->rangeSmoothMul:F

    return-void
.end method


# virtual methods
.method public SpectrumProcessTh([DII)V
    .locals 0

    return-void
.end method

.method public getBeatBarValueSmooth()F
    .locals 2

    .line 1436
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lockObj:Ljava/lang/Object;

    monitor-enter v0

    .line 1438
    :try_start_0
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatBarValueSmooth:F

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 1439
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getPeakBarIndexSmooth()F
    .locals 2

    .line 1444
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lockObj:Ljava/lang/Object;

    monitor-enter v0

    .line 1446
    :try_start_0
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->peakBarIndex01Smooth:F

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 1447
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public synthetic lambda$processTh$0$SegmentAudioSpectrumDataPhaseS$AudioProcess(IIIF[Lcom/daaw/avee/Common/Signal;)V
    .locals 9

    mul-int v2, p1, p2

    .line 543
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftTransform:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    array-length v0, v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p3, p2, 0x1

    mul-int p3, p3, p1

    :goto_0
    move v3, p3

    .line 545
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftTransform:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    aget-object v0, p1, p2

    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftResultDouble:[D

    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->binMagnitudes:[D

    float-to-double v5, p4

    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->pcmRangeTmp:[F

    aget p3, p3, v1

    float-to-double v7, p3

    move-object v1, p1

    invoke-virtual/range {v0 .. v8}, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->Process([DII[DDD)V

    .line 546
    aget-object p1, p5, p2

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Signal;->setSignal()V

    return-void
.end method

.method logspace(DDII)D
    .locals 2

    div-double/2addr p3, p1

    int-to-double v0, p5

    add-int/lit8 p6, p6, -0x1

    int-to-double p5, p6

    .line 1277
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {p5, p6}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, p5

    invoke-static {p3, p4, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p3

    mul-double p1, p1, p3

    return-wide p1
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 14

    .line 1343
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lockObj:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "audioDurationMs"

    const/16 v2, 0x3c

    .line 1346
    invoke-virtual {p1, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v1

    invoke-direct {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setSampleInCountAsMilliseconds(I)V

    const-string v1, "highQualityAudioCapture"

    const/4 v2, 0x0

    .line 1347
    invoke-virtual {p1, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v1

    invoke-direct {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setHighQualityAudioCapture(Z)V

    const-string v1, "sampleOutCount"

    const/16 v3, 0x80

    .line 1350
    invoke-virtual {p1, v1, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v5

    const-string v1, "lowerHz"

    const v3, 0x3dcccccd    # 0.1f

    .line 1351
    invoke-virtual {p1, v1, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v6

    const-string v1, "higherHz"

    const v3, 0x468ca000    # 18000.0f

    .line 1352
    invoke-virtual {p1, v1, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v7

    const-string v1, "mirrorSamples"

    .line 1353
    invoke-virtual {p1, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v8

    const-string v1, "repeatSamples"

    const/4 v3, 0x1

    .line 1354
    invoke-virtual {p1, v1, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v9

    const-string v1, "hzLinearFactor"

    const v3, 0x3d75c28f    # 0.06f

    .line 1355
    invoke-virtual {p1, v1, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v10

    const-string v1, "starAndEndGap"

    .line 1356
    invoke-virtual {p1, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v11

    const-string v1, "starAndEndGap"

    .line 1357
    invoke-virtual {p1, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v12

    const-string v1, "freqShift"

    const/4 v2, 0x0

    .line 1358
    invoke-virtual {p1, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v13

    move-object v4, p0

    .line 1349
    invoke-virtual/range {v4 .. v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setSampleOutCount(IFFZIFIIF)V

    const-string v1, "smooth"

    const/high16 v3, 0x3f800000    # 1.0f

    .line 1361
    invoke-virtual {p1, v1, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setSmoothFactor(F)V

    const-string v1, "filterRadius"

    const/4 v4, 0x4

    .line 1366
    invoke-virtual {p1, v1, v4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v1

    const-string v4, "filterStrength"

    .line 1367
    invoke-virtual {p1, v4, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v4

    .line 1366
    invoke-virtual {p0, v1, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setFftFilter(IF)V

    const-string v1, "beatSmooth"

    const v4, 0x3ecccccd    # 0.4f

    .line 1370
    invoke-virtual {p1, v1, v4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setBeatSmooth(F)V

    const-string v1, "beatRangeBarFirst"

    .line 1373
    invoke-virtual {p1, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v1

    const-string v2, "beatRangeBarLast"

    const v4, 0x3e4ccccd    # 0.2f

    .line 1374
    invoke-virtual {p1, v2, v4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v2

    const-string v4, "beatRangeValueLower"

    const v5, 0x3f333333    # 0.7f

    .line 1375
    invoke-virtual {p1, v4, v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v4

    const-string v5, "beatRangeValueHigher"

    const/high16 v6, 0x420c0000    # 35.0f

    .line 1376
    invoke-virtual {p1, v5, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v5

    .line 1372
    invoke-virtual {p0, v1, v2, v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setBeatRangeCorners(FFFF)V

    const-string v1, "lowerFreqMagnitude"

    const/high16 v2, 0x3e800000    # 0.25f

    .line 1386
    invoke-virtual {p1, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setAweightFft(F)V

    const-string v1, "outputMultiplier"

    .line 1387
    invoke-virtual {p1, v1, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setOutputMultiplier(F)V

    .line 1388
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 8

    .line 1394
    iget-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lockObj:Ljava/lang/Object;

    monitor-enter v7

    :try_start_0
    const-string v2, "audioDurationMs"

    .line 1397
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->dataCountInMs:I

    const-string v4, "1_AudioCapture"

    const/16 v5, 0x14

    const/16 v6, 0x12c

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    const-string v1, "highQualityAudioCapture"

    .line 1398
    iget-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->highQualityAudioCapture:Z

    const-string v3, "1_AudioCapture"

    invoke-virtual {p1, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    const-string v2, "sampleOutCount"

    .line 1400
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barsCount:I

    const-string v4, "2_spectrum"

    const/4 v5, 0x0

    const/16 v6, 0x200

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    const-string v2, "lowerHz"

    .line 1402
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->loFreq:F

    const-string v4, "2_spectrumHz"

    const/4 v5, 0x0

    const/high16 v6, 0x43960000    # 300.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "higherHz"

    .line 1403
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->hiFreq:F

    const-string v4, "2_spectrumHz"

    const/high16 v5, 0x43960000    # 300.0f

    const v6, 0x468ca000    # 18000.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "hzLinearFactor"

    .line 1404
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->freqLinfactor:F

    const-string v4, "2_spectrumHz"

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "freqShift"

    .line 1405
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->freqShift:F

    const-string v4, "2_spectrumHz"

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v1, "mirrorSamples"

    .line 1407
    iget-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->mirrorSampleValues:Z

    const-string v3, "2_spectrum"

    invoke-virtual {p1, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    const-string v2, "repeatSamples"

    .line 1408
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->repeatSamples:I

    const-string v4, "2_spectrum"

    const/4 v5, 0x1

    const/4 v6, 0x6

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    const-string v2, "starAndEndGap"

    .line 1409
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->starBar:I

    const-string v4, "2_spectrum"

    const/4 v5, 0x0

    const/16 v6, 0x1e

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    const-string v2, "smooth"

    .line 1413
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->smoothFactor:F

    const-string v4, "2_spectrum"

    const v5, 0x3dcccccd    # 0.1f

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "filterRadius"

    .line 1418
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftFilter:Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1dv2;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1dv2;->getRadius()I

    move-result v3

    const-string v4, "2_spectrum"

    const/4 v5, 0x0

    const/16 v6, 0x14

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    const-string v2, "filterStrength"

    .line 1419
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftFilter:Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1dv2;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1dv2;->getStrength()F

    move-result v3

    const-string v4, "2_spectrum"

    const v5, 0x3dcccccd    # 0.1f

    const/high16 v6, 0x40000000    # 2.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "beatSmooth"

    .line 1422
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatSmoothFactor:F

    const-string v4, "beat"

    const v5, 0x3dcccccd    # 0.1f

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "beatRangeBarFirst"

    .line 1423
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatRange:Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->getX0()F

    move-result v3

    const-string v4, "beat"

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "beatRangeBarLast"

    .line 1424
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatRange:Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->getX1()F

    move-result v3

    const-string v4, "beat"

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "beatRangeValueLower"

    .line 1425
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatRange:Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->getY0()F

    move-result v3

    const-string v4, "beat"

    const/4 v5, 0x0

    const/high16 v6, 0x42480000    # 50.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "beatRangeValueHigher"

    .line 1426
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatRange:Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->getY1()F

    move-result v3

    const-string v4, "beat"

    const/4 v5, 0x0

    const/high16 v6, 0x42c80000    # 100.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "lowerFreqMagnitude"

    .line 1429
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->aweightFft:F

    const-string v4, "2_spectrum"

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "outputMultiplier"

    .line 1430
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->outputMultiplier:F

    const-string v4, "2_spectrum"

    const v5, 0x3dcccccd    # 0.1f

    const/high16 v6, 0x40400000    # 3.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 1431
    monitor-exit v7

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;)V
    .locals 3

    .line 1452
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lockObj:Ljava/lang/Object;

    monitor-enter v0

    .line 1454
    :try_start_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftTransform:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftTransform:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    aget-object v1, v1, v2

    invoke-virtual {v1, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;)V

    .line 1455
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public processTh(FLcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)[F
    .locals 28

    move-object/from16 v10, p0

    .line 418
    iget-object v11, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lockObj:Ljava/lang/Object;

    monitor-enter v11

    .line 420
    :try_start_0
    iget v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lastSampleRate:I

    int-to-float v0, v0

    const v1, 0x3a83126f    # 0.001f

    mul-float v0, v0, v1

    iget v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->dataCountInMs:I

    int-to-float v1, v1

    mul-float v0, v0, v1

    float-to-int v0, v0

    .line 421
    invoke-interface/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestOverrideAudioFrameSamplesInCount()I

    move-result v1

    if-lez v1, :cond_0

    move v0, v1

    :cond_0
    move-object/from16 v1, p2

    .line 422
    invoke-interface {v1, v0}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestSoundVisualizationData(I)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object v0

    const v2, 0xac44

    const/4 v3, 0x4

    const/4 v12, 0x0

    const/4 v4, 0x1

    const/4 v13, 0x0

    if-eqz v0, :cond_2

    .line 433
    iget-boolean v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->highQualityAudioCapture:Z

    if-eqz v5, :cond_1

    .line 434
    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmAsMonoForFft()Lcom/daaw/avee/Common/ISimpleListShort;

    move-result-object v5

    goto :goto_0

    .line 436
    :cond_1
    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmAsMonoForFft_DoubleDataRate()Lcom/daaw/avee/Common/ISimpleListShort;

    move-result-object v5

    .line 437
    :goto_0
    invoke-interface {v5}, Lcom/daaw/avee/Common/ISimpleListShort;->size()I

    move-result v6

    .line 438
    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/AudioFrameData;->IsDoubleDataRate()Z

    move-result v7

    .line 440
    iget v8, v0, Lcom/daaw/avee/comp/playback/AudioFrameData;->sampleRate:I

    .line 441
    iget-short v9, v0, Lcom/daaw/avee/comp/playback/AudioFrameData;->minPcmValue:S

    int-to-float v9, v9

    .line 442
    iget-object v14, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->pcmRangeTmp:[F

    aput v12, v14, v13

    .line 443
    iget-object v14, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->pcmRangeTmp:[F

    iget-short v0, v0, Lcom/daaw/avee/comp/playback/AudioFrameData;->maxPcmValue:S

    int-to-float v0, v0

    aput v0, v14, v4

    move v0, v7

    goto :goto_1

    .line 447
    :cond_2
    new-instance v5, Lcom/daaw/avee/Common/SimpleListConstantShort;

    invoke-direct {v5, v13, v3}, Lcom/daaw/avee/Common/SimpleListConstantShort;-><init>(SI)V

    const/high16 v9, -0x3b860000    # -1000.0f

    .line 451
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->pcmRangeTmp:[F

    aput v12, v0, v13

    .line 452
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->pcmRangeTmp:[F

    const/high16 v6, 0x447a0000    # 1000.0f

    aput v6, v0, v4

    const/4 v0, 0x0

    const/4 v6, 0x4

    const v8, 0xac44

    :goto_1
    if-ge v6, v3, :cond_3

    .line 457
    new-instance v5, Lcom/daaw/avee/Common/SimpleListConstantShort;

    invoke-direct {v5, v13, v3}, Lcom/daaw/avee/Common/SimpleListConstantShort;-><init>(SI)V

    const/4 v8, 0x4

    const v14, 0xac44

    goto :goto_2

    :cond_3
    move v14, v8

    move v8, v6

    .line 462
    :goto_2
    iput v14, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lastSampleRate:I

    .line 464
    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barValues:[F

    array-length v2, v2

    iget v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barsCount:I

    if-eq v2, v3, :cond_4

    .line 465
    iget v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barsCount:I

    new-array v2, v2, [F

    iput-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barValues:[F

    .line 467
    :cond_4
    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barSmoothValues:[F

    array-length v2, v2

    iget-object v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barValues:[F

    array-length v3, v3

    if-eq v2, v3, :cond_5

    .line 469
    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barValues:[F

    array-length v2, v2

    new-array v2, v2, [F

    iput-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barSmoothValues:[F

    const/4 v2, 0x0

    .line 470
    :goto_3
    iget-object v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barSmoothValues:[F

    array-length v3, v3

    if-ge v2, v3, :cond_5

    .line 471
    iget-object v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barSmoothValues:[F

    aput v12, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 476
    :cond_5
    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftWindowMultipliers:[F

    array-length v2, v2

    if-eq v8, v2, :cond_6

    .line 478
    new-array v2, v8, [F

    iput-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftWindowMultipliers:[F

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v8, :cond_6

    .line 482
    iget-object v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftWindowMultipliers:[F

    const/high16 v6, 0x3b800000    # 0.00390625f

    invoke-static {v2, v8}, Lcom/daaw/avee/comp/Visualizer/Dsp/DspWindows;->hannWindow(II)F

    move-result v7

    mul-float v7, v7, v6

    aput v7, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 493
    :cond_6
    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->pcmRangeTmp:[F

    invoke-direct {v10, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->updateRange([F)V

    .line 496
    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftResultDouble:[D

    array-length v2, v2

    if-eq v2, v8, :cond_7

    .line 498
    new-array v2, v8, [D

    iput-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftResultDouble:[D

    :cond_7
    const/4 v2, 0x0

    const/4 v15, 0x0

    .line 501
    :goto_5
    iget-object v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftResultDouble:[D

    array-length v3, v3

    if-ge v2, v3, :cond_8

    .line 504
    invoke-interface {v5, v2}, Lcom/daaw/avee/Common/ISimpleListShort;->get(I)S

    move-result v3

    int-to-float v3, v3

    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftWindowMultipliers:[F

    aget v6, v6, v2

    mul-float v3, v3, v6

    .line 508
    iget v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->rangeSmoothMul:F

    mul-float v3, v3, v6

    mul-float v6, v3, v3

    add-float/2addr v15, v6

    .line 511
    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftResultDouble:[D

    move-object/from16 v16, v5

    float-to-double v4, v3

    aput-wide v4, v6, v2

    add-int/lit8 v2, v2, 0x1

    move-object/from16 v5, v16

    const/4 v4, 0x1

    goto :goto_5

    .line 523
    :cond_8
    invoke-interface/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestAudioProcessMultiThreadValue()I

    move-result v1

    const/4 v6, 0x2

    and-int/2addr v1, v6

    if-eqz v1, :cond_b

    .line 525
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftTransform:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    array-length v7, v1

    new-array v5, v7, [Lcom/daaw/avee/Common/Signal;

    const/4 v4, 0x0

    .line 527
    :goto_6
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftTransform:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    array-length v1, v1

    if-ge v4, v1, :cond_a

    .line 529
    new-instance v1, Lcom/daaw/avee/Common/Signal;

    invoke-direct {v1}, Lcom/daaw/avee/Common/Signal;-><init>()V

    aput-object v1, v5, v4

    .line 531
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftTransform:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    aget-object v1, v1, v4

    iget v1, v1, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->sampleRate:I

    if-eq v1, v14, :cond_9

    .line 532
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftTransform:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    aget-object v1, v1, v4

    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreq:[F

    invoke-virtual {v1, v2, v14}, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->Initialize([FI)V

    .line 535
    :cond_9
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftTransform:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    aget-object v1, v1, v13

    iget v3, v1, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->binCount:I

    .line 536
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftTransform:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    array-length v1, v1

    div-int v16, v3, v1

    .line 540
    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->mDecodeThreadPool:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/-$$Lambda$SegmentAudioSpectrumDataPhaseS$AudioProcess$GIkafdM5fP4FF5WYHEVXrL3TrdE;

    move-object/from16 p2, v1

    move-object/from16 v1, p2

    move-object v12, v2

    move-object/from16 v2, p0

    move/from16 v17, v3

    move/from16 v3, v16

    move/from16 v16, v4

    move-object/from16 v18, v5

    move/from16 v5, v17

    move v6, v9

    move v13, v7

    move-object/from16 v7, v18

    invoke-direct/range {v1 .. v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/-$$Lambda$SegmentAudioSpectrumDataPhaseS$AudioProcess$GIkafdM5fP4FF5WYHEVXrL3TrdE;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;IIIF[Lcom/daaw/avee/Common/Signal;)V

    invoke-virtual {v12, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v4, v16, 0x1

    move v7, v13

    move-object/from16 v5, v18

    const/4 v6, 0x2

    const/4 v12, 0x0

    const/4 v13, 0x0

    goto :goto_6

    :cond_a
    move-object/from16 v18, v5

    move v13, v7

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v13, :cond_e

    .line 552
    :try_start_1
    aget-object v2, v18, v1

    invoke-virtual {v2}, Lcom/daaw/avee/Common/Signal;->waitForSignal()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_b
    const/4 v1, 0x0

    .line 559
    :goto_8
    :try_start_2
    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftTransform:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    array-length v2, v2

    if-ge v1, v2, :cond_d

    .line 561
    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftTransform:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    aget-object v2, v2, v1

    iget v2, v2, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->sampleRate:I

    if-eq v2, v14, :cond_c

    .line 562
    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftTransform:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    aget-object v2, v2, v1

    iget-object v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreq:[F

    invoke-virtual {v2, v3, v14}, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->Initialize([FI)V

    :cond_c
    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    .line 565
    :cond_d
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftTransform:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    const/4 v2, 0x0

    aget-object v19, v1, v2

    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftResultDouble:[D

    const/16 v21, 0x0

    iget-object v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftTransform:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    aget-object v3, v3, v2

    iget v2, v3, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->binCount:I

    iget-object v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->binMagnitudes:[D

    float-to-double v4, v9

    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->pcmRangeTmp:[F

    const/4 v7, 0x1

    aget v6, v6, v7

    float-to-double v6, v6

    move-object/from16 v20, v1

    move/from16 v22, v2

    move-object/from16 v23, v3

    move-wide/from16 v24, v4

    move-wide/from16 v26, v6

    invoke-virtual/range {v19 .. v27}, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->Process([DII[DDD)V

    :cond_e
    if-lez v8, :cond_f

    int-to-float v1, v8

    div-float/2addr v15, v1

    float-to-double v1, v15

    .line 591
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float v15, v1

    .line 592
    :cond_f
    iput v15, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->windowedRms:F

    const/4 v1, 0x2

    new-array v7, v1, [F

    .line 596
    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barValues:[F

    iget v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->outputMultiplier:F

    iget-boolean v4, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->mirrorSampleValues:Z

    iget-object v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftResultAccess:Lcom/daaw/avee/Common/ISimpleListDouble;

    iget-object v8, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatBarValue:[F

    move-object/from16 v1, p0

    move v6, v14

    move v9, v0

    invoke-direct/range {v1 .. v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fillBarValues2([FFZLcom/daaw/avee/Common/ISimpleListDouble;I[F[FZ)V

    .line 607
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatRange:Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barSmoothValues:[F

    array-length v1, v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->reset(I)V

    const-string v0, "barValues == barSmoothValues"

    .line 609
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barValues:[F

    array-length v1, v1

    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barSmoothValues:[F

    array-length v2, v2

    invoke-static {v0, v1, v2}, Ljunit/framework/Assert;->assertEquals(Ljava/lang/String;II)V

    const/4 v0, 0x0

    .line 613
    iput v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->peakBarIndex01:F

    const v0, -0x39e3c000    # -10000.0f

    const/4 v2, 0x0

    .line 615
    :goto_9
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barValues:[F

    array-length v1, v1

    if-ge v2, v1, :cond_11

    .line 618
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barValues:[F

    aget v1, v1, v2

    cmpl-float v1, v1, v0

    if-lez v1, :cond_10

    .line 620
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barValues:[F

    aget v0, v0, v2

    int-to-float v1, v2

    .line 621
    iput v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->peakBarIndex01:F

    .line 628
    :cond_10
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barValues:[F

    aget v1, v1, v2

    iget-object v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barSmoothValues:[F

    aget v3, v3, v2

    sub-float/2addr v1, v3

    .line 630
    iget-object v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barSmoothValues:[F

    aget v4, v3, v2

    const/high16 v5, 0x41a00000    # 20.0f

    mul-float v1, v1, v5

    mul-float v1, v1, p1

    iget v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->smoothFactor:F

    mul-float v1, v1, v5

    add-float/2addr v4, v1

    aput v4, v3, v2

    .line 631
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barSmoothValues:[F

    iget-object v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barSmoothValues:[F

    aget v3, v3, v2

    const/4 v4, 0x0

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    aput v3, v1, v2

    .line 633
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatRange:Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

    iget-object v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barSmoothValues:[F

    aget v3, v3, v2

    invoke-virtual {v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->addValue(IF)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_9

    .line 646
    :cond_11
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatBarValue:[F

    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatRange:Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->getValueNormal()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 647
    iget v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatBarValueSmooth:F

    iget v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatSmoothFactor:F

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v1, v3, v1

    mul-float v0, v0, v1

    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatBarValue:[F

    aget v1, v1, v2

    iget v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatSmoothFactor:F

    mul-float v1, v1, v2

    add-float/2addr v0, v1

    iput v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatBarValueSmooth:F

    .line 649
    iget v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->peakBarIndex01:F

    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barValues:[F

    array-length v1, v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->peakBarIndex01:F

    .line 650
    iget v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->peakBarIndex01Smooth:F

    iget v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->peakBarSmoothFactor:F

    sub-float/2addr v3, v2

    mul-float v1, v1, v3

    iget v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->peakBarSmoothFactor:F

    mul-float v0, v0, v2

    add-float/2addr v1, v0

    iput v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->peakBarIndex01Smooth:F

    .line 672
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barSmoothValues:[F

    monitor-exit v11

    return-object v0

    :catchall_0
    move-exception v0

    .line 673
    monitor-exit v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_b

    :goto_a
    throw v0

    :goto_b
    goto :goto_a
.end method

.method public setAweightFft(F)V
    .locals 1

    .line 1288
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lockObj:Ljava/lang/Object;

    monitor-enter v0

    .line 1290
    :try_start_0
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->aweightFft:F

    .line 1291
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setBeatBart(I)V
    .locals 1

    .line 279
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lockObj:Ljava/lang/Object;

    monitor-enter v0

    .line 281
    :try_start_0
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->rmsTargetBar:I

    .line 282
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setBeatRangeCorners(FFFF)V
    .locals 2

    .line 397
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lockObj:Ljava/lang/Object;

    monitor-enter v0

    .line 399
    :try_start_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatRange:Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;

    invoke-virtual {v1, p1, p2, p3, p4}, Lcom/daaw/avee/comp/Visualizer/Dsp/RangeBox;->setCorners(FFFF)V

    .line 400
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setBeatSmooth(F)V
    .locals 1

    .line 389
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lockObj:Ljava/lang/Object;

    monitor-enter v0

    .line 391
    :try_start_0
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->beatSmoothFactor:F

    .line 392
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setDataMode(I)V
    .locals 1

    .line 287
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lockObj:Ljava/lang/Object;

    monitor-enter p1

    .line 290
    :try_start_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setFftFilter(IF)V
    .locals 1

    .line 373
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lockObj:Ljava/lang/Object;

    monitor-enter v0

    .line 375
    :try_start_0
    invoke-static {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1dv2;->createHighPass(IF)Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1dv2;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftFilter:Lcom/daaw/avee/comp/Visualizer/Dsp/SignalFilter1dv2;

    .line 376
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setFftSoftness(I)V
    .locals 5

    .line 347
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lockObj:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    if-ge p1, v1, :cond_0

    const/4 p1, 0x1

    :cond_0
    add-int/lit8 v1, p1, 0x1

    add-int/2addr v1, p1

    .line 358
    :try_start_0
    new-array v1, v1, [I

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftSoftnessIndexes:[I

    .line 359
    array-length v2, v1

    new-array v2, v2, [F

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftSoftnessWeight:[F

    .line 360
    array-length v1, v1

    int-to-float v1, v1

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftSoftnessDivider:F

    const/4 v1, 0x0

    .line 362
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftSoftnessIndexes:[I

    array-length v2, v2

    if-ge v1, v2, :cond_1

    sub-int v2, v1, p1

    .line 365
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftSoftnessIndexes:[I

    aput v2, v3, v1

    .line 366
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftSoftnessWeight:[F

    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftSoftnessIndexes:[I

    array-length v4, v4

    add-int/lit8 v4, v4, 0x2

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v2

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftSoftnessIndexes:[I

    array-length v2, v2

    add-int/lit8 v2, v2, 0x2

    invoke-static {v4, v2}, Lcom/daaw/avee/comp/Visualizer/Dsp/DspWindows;->hammingWindow(II)F

    move-result v2

    aput v2, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 368
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public setFrequencyBinSliding(Z)V
    .locals 1

    .line 381
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lockObj:Ljava/lang/Object;

    monitor-enter v0

    .line 383
    :try_start_0
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->frequencyBinSliding:Z

    .line 384
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setOutputMultiplier(F)V
    .locals 1

    .line 1297
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lockObj:Ljava/lang/Object;

    monitor-enter v0

    .line 1299
    :try_start_0
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->outputMultiplier:F

    .line 1300
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setSampleOutCount(IFFZIFIIF)V
    .locals 12

    move-object v10, p0

    .line 236
    iget-object v11, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lockObj:Ljava/lang/Object;

    monitor-enter v11

    const v0, 0x3dcccccd    # 0.1f

    move v1, p2

    .line 238
    :try_start_0
    invoke-static {p2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v1

    iput v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->loFreq:F

    move v4, p3

    .line 239
    invoke-static {p3, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->hiFreq:F

    const/4 v0, 0x1

    move v1, p1

    .line 240
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barsCount:I

    move/from16 v5, p4

    .line 241
    iput-boolean v5, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->mirrorSampleValues:Z

    move/from16 v1, p5

    .line 242
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->repeatSamples:I

    move/from16 v0, p6

    .line 243
    iput v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->freqLinfactor:F

    .line 244
    iget v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barsCount:I

    new-array v1, v1, [F

    iput-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreq:[F

    .line 245
    iget v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barsCount:I

    new-array v1, v1, [F

    iput-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreqNext:[F

    move/from16 v7, p7

    .line 247
    iput v7, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->starBar:I

    move/from16 v8, p8

    .line 248
    iput v8, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->endBar:I

    move/from16 v9, p9

    .line 249
    iput v9, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->freqShift:F

    .line 250
    iget v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barsCount:I

    new-array v1, v1, [D

    iput-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->binMagnitudes:[D

    .line 252
    iget v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barsCount:I

    iget v3, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->loFreq:F

    move-object v1, p0

    move v4, p3

    move/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v1 .. v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->updateBandsFreq(IFFZFIIF)V

    const/4 v0, 0x6

    .line 254
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setBeatBart(I)V

    const/4 v0, 0x0

    .line 256
    :goto_0
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftTransform:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 257
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->fftTransform:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    aget-object v1, v1, v0

    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->barFreq:[F

    const v3, 0xac44

    invoke-virtual {v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->Initialize([FI)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 258
    :cond_0
    monitor-exit v11

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public setSampleOutCount(IFI)V
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

    .line 221
    invoke-virtual/range {v0 .. v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->setSampleOutCount(IFFZIFIIF)V

    return-void
.end method

.method public setSmooth(F)V
    .locals 2

    .line 296
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lockObj:Ljava/lang/Object;

    monitor-enter v0

    const v1, 0x3c23d70a    # 0.01f

    .line 298
    :try_start_0
    invoke-static {p1, v1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->smoothFactor:F

    .line 299
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setSmoothFactor(F)V
    .locals 1

    .line 263
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lockObj:Ljava/lang/Object;

    monitor-enter v0

    .line 265
    :try_start_0
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->smoothFactor:F

    .line 266
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setSteadySmooth(F)V
    .locals 1

    .line 312
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS$AudioProcess;->lockObj:Ljava/lang/Object;

    monitor-enter p1

    .line 315
    :try_start_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
