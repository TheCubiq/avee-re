.class public Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentDataProviderFactory;
.super Ljava/lang/Object;
.source "SegmentDataProviderFactory.java"


# static fields
.field public static final typeNameNone:Ljava/lang/String; = "None"

.field public static final typeNames:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "Waveform"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "Spectrum"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "Spectrum2"

    aput-object v2, v0, v1

    .line 12
    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentDataProviderFactory;->typeNames:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;
    .locals 6

    const-string v0, "None"

    .line 22
    invoke-static {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentDataProviderFactory;->getTypeName(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p1

    :cond_0
    const/4 v1, -0x1

    .line 24
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "Waveform"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :sswitch_1
    const-string v0, "Spectrum2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x3

    goto :goto_0

    :sswitch_2
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :sswitch_3
    const-string v0, "Spectrum"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    :cond_1
    :goto_0
    if-eqz v1, :cond_6

    if-eq v1, v5, :cond_5

    if-eq v1, v4, :cond_4

    if-eq v1, v3, :cond_3

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unknown typeName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    if-nez p1, :cond_2

    .line 40
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;-><init>()V

    return-object p0

    :cond_2
    return-object p1

    .line 36
    :cond_3
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;-><init>()V

    return-object p0

    .line 30
    :cond_4
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;-><init>()V

    return-object p0

    .line 28
    :cond_5
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioWaveformData;

    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioWaveformData;-><init>()V

    return-object p0

    :cond_6
    const/4 p0, 0x0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b41840f -> :sswitch_3
        0x252358 -> :sswitch_2
        0x13110261 -> :sswitch_1
        0x27dddf5d -> :sswitch_0
    .end sparse-switch
.end method

.method public static getTypeName(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    return-object p1

    .line 49
    :cond_0
    instance-of v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioWaveformData;

    if-eqz v0, :cond_1

    const-string p0, "Waveform"

    return-object p0

    .line 51
    :cond_1
    instance-of v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;

    if-eqz v0, :cond_2

    const-string p0, "Spectrum"

    return-object p0

    .line 57
    :cond_2
    instance-of p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumDataPhaseS;

    if-eqz p0, :cond_3

    const-string p0, "Spectrum2"

    return-object p0

    :cond_3
    const-string p0, "unknown instance type"

    .line 60
    invoke-static {p0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return-object p1
.end method
