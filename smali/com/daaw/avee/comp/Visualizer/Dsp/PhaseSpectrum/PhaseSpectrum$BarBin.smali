.class Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;
.super Ljava/lang/Object;
.source "PhaseSpectrum.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "BarBin"
.end annotation


# instance fields
.field public binData:[D

.field public complexX:D

.field public complexY:D

.field i:I

.field magnitude:D

.field final pi2:D

.field resolution:I

.field resolutionD:D

.field sineMagnitude:D

.field public size:I

.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

.field public vecxTable:[D

.field public vecyTable:[D

.field weight:D


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;DI)V
    .locals 8

    .line 37
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->this$0:Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, 0x401921fb54442d18L    # 6.283185307179586

    .line 12
    iput-wide v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->pi2:D

    const-wide/16 v2, 0x0

    .line 22
    iput-wide v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->magnitude:D

    .line 38
    iput p4, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->resolution:I

    int-to-double v2, p4

    .line 39
    iput-wide v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->resolutionD:D

    int-to-double v2, p4

    .line 42
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p2, p2, v2

    invoke-static {p2, p3}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    long-to-int p2, p1

    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->size:I

    .line 43
    new-array p1, p2, [D

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->binData:[D

    .line 47
    new-array p1, p2, [D

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->vecxTable:[D

    .line 48
    new-array p1, p2, [D

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->vecyTable:[D

    const/4 p1, 0x0

    .line 50
    :goto_0
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->size:I

    if-ge p1, p2, :cond_0

    int-to-double p3, p1

    int-to-double v2, p2

    .line 52
    iget-wide v4, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->resolutionD:D

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v2, v4

    invoke-static {p3, p4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p3, v2

    mul-double p3, p3, v0

    .line 53
    invoke-static {p3, p4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    .line 54
    invoke-static {p3, p4}, Ljava/lang/Math;->sin(D)D

    move-result-wide p2

    mul-double v4, v2, v2

    mul-double v6, p2, p2

    add-double/2addr v4, v6

    .line 57
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    div-double/2addr v2, v4

    div-double/2addr p2, v4

    .line 61
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->vecxTable:[D

    aput-wide v2, p4, p1

    .line 62
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->vecyTable:[D

    aput-wide p2, p4, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->CalcWeights()V

    return-void
.end method


# virtual methods
.method public AddData(ID)V
    .locals 5

    .line 120
    iget-wide v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->complexX:D

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->vecxTable:[D

    aget-wide v3, v2, p1

    mul-double v3, v3, p2

    add-double/2addr v0, v3

    iput-wide v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->complexX:D

    .line 121
    iget-wide v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->complexY:D

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->vecyTable:[D

    aget-wide v3, v2, p1

    mul-double v3, v3, p2

    add-double/2addr v0, v3

    iput-wide v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->complexY:D

    return-void
.end method

.method CalcWeights()V
    .locals 8

    .line 71
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->size:I

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    if-nez v0, :cond_0

    .line 73
    iput-wide v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->sineMagnitude:D

    .line 74
    iput-wide v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->weight:D

    return-void

    .line 78
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->Reset()V

    const/4 v0, 0x0

    .line 80
    :goto_0
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->size:I

    if-ge v0, v3, :cond_1

    .line 86
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->vecxTable:[D

    aget-wide v4, v3, v0

    const-wide v6, 0x3f847ae140000000L    # 0.009999999776482582

    mul-double v4, v4, v6

    invoke-virtual {p0, v0, v4, v5}, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->AddData(ID)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 89
    :cond_1
    iput-wide v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->weight:D

    .line 90
    invoke-virtual {p0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->Finialize(DI)D

    .line 92
    iget-wide v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->magnitude:D

    iput-wide v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->sineMagnitude:D

    .line 93
    iput-wide v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->weight:D

    return-void
.end method

.method public Finialize(DI)D
    .locals 4

    .line 151
    iget-wide p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->complexX:D

    int-to-double v0, p3

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p1, v0

    iput-wide p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->complexX:D

    .line 152
    iget-wide v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->complexY:D

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v2, v0

    iput-wide v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->complexY:D

    mul-double p1, p1, p1

    mul-double v2, v2, v2

    add-double/2addr p1, v2

    .line 160
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    iput-wide p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->magnitude:D

    const-wide/high16 v0, 0x4089000000000000L    # 800.0

    mul-double p1, p1, v0

    .line 164
    iput-wide p1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->magnitude:D

    return-wide p1
.end method

.method public GetMagnitude()D
    .locals 2

    .line 174
    iget-wide v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->magnitude:D

    return-wide v0
.end method

.method public Reset()V
    .locals 3

    const-wide/16 v0, 0x0

    .line 105
    iput-wide v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->complexX:D

    .line 106
    iput-wide v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->complexY:D

    .line 107
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->binData:[D

    invoke-static {v2, v0, v1}, Ljava/util/Arrays;->fill([DD)V

    return-void
.end method
