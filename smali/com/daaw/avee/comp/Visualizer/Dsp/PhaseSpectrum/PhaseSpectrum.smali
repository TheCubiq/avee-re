.class public Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;
.super Ljava/lang/Object;
.source "PhaseSpectrum.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;
    }
.end annotation


# instance fields
.field public binCount:I

.field bins:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

.field public sampleRate:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

    .line 179
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->bins:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

    return-void
.end method


# virtual methods
.method public CalcBarSampleOpCountPerPart([I)V
    .locals 7

    .line 230
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 233
    :goto_0
    iget v4, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->binCount:I

    if-ge v2, v4, :cond_0

    .line 235
    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->bins:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

    aget-object v4, v4, v2

    iget v4, v4, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->size:I

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 238
    :cond_0
    div-int/2addr v3, v0

    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 243
    :goto_1
    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->binCount:I

    if-ge v1, v5, :cond_3

    .line 245
    iget-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->bins:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

    aget-object v5, v5, v1

    iget v5, v5, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->size:I

    add-int/2addr v2, v5

    add-int/lit8 v5, v4, 0x1

    mul-int v6, v3, v5

    if-le v2, v6, :cond_2

    .line 248
    aput v1, p1, v4

    if-ne v5, v0, :cond_1

    goto :goto_2

    :cond_1
    move v4, v5

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    add-int/lit8 v0, v0, -0x1

    .line 255
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->binCount:I

    aput v1, p1, v0

    return-void
.end method

.method public GetBinCount()I
    .locals 1

    .line 382
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->bins:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

    array-length v0, v0

    return v0
.end method

.method public GetBinMagnitude(I)D
    .locals 2

    .line 387
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->bins:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->GetMagnitude()D

    move-result-wide v0

    return-wide v0
.end method

.method public GetBinMagnitudes([D)V
    .locals 4

    .line 393
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->bins:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

    array-length v0, v0

    const/4 v1, 0x0

    .line 395
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 397
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->bins:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

    rem-int v3, v1, v0

    aget-object v2, v2, v3

    invoke-virtual {v2}, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->GetMagnitude()D

    move-result-wide v2

    aput-wide v2, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public Initialize([FI)V
    .locals 7

    .line 187
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->bins:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

    array-length v0, v0

    array-length v1, p1

    if-eq v0, v1, :cond_0

    .line 189
    array-length v0, p1

    new-array v0, v0, [Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->bins:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

    .line 193
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->bins:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

    array-length v0, v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->binCount:I

    .line 195
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->sampleRate:I

    int-to-float v0, v0

    const/high16 v1, 0x43c80000    # 400.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 201
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->sampleRate:I

    const/4 p2, 0x0

    .line 204
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->bins:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

    array-length v1, v1

    if-ge p2, v1, :cond_2

    .line 209
    aget v1, p1, p2

    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_1

    const-wide/16 v1, 0x0

    goto :goto_1

    .line 210
    :cond_1
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->sampleRate:I

    int-to-float v1, v1

    aget v2, p1, p2

    div-float/2addr v1, v2

    float-to-double v1, v1

    .line 218
    :goto_1
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->bins:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

    int-to-double v5, v0

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v5, v1

    invoke-static {v5, v6}, Ljava/lang/Math;->round(D)J

    move-result-wide v5

    long-to-int v6, v5

    const/4 v5, 0x1

    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-direct {v4, p0, v1, v2, v5}, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;-><init>(Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;DI)V

    aput-object v4, v3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public Process([DII[DDD)V
    .locals 4

    .line 265
    array-length p5, p1

    :goto_0
    if-ge p2, p3, :cond_2

    .line 300
    iget-object p6, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->bins:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

    aget-object p6, p6, p2

    invoke-virtual {p6}, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->Reset()V

    .line 302
    iget-object p6, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->bins:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

    aget-object p6, p6, p2

    iget p6, p6, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->size:I

    const-wide/high16 p7, 0x3ff0000000000000L    # 1.0

    if-lez p6, :cond_1

    const/4 p6, 0x0

    :goto_1
    if-ge p6, p5, :cond_0

    .line 364
    aget-wide v0, p1, p6

    .line 367
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->bins:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

    aget-object v3, v2, p2

    aget-object v2, v2, p2

    iget v2, v2, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->size:I

    rem-int v2, p6, v2

    invoke-virtual {v3, v2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->AddData(ID)V

    add-int/lit8 p6, p6, 0x1

    goto :goto_1

    .line 370
    :cond_0
    iget-object p6, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->bins:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

    aget-object p6, p6, p2

    invoke-virtual {p6, p7, p8, p5}, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->Finialize(DI)D

    move-result-wide p6

    aput-wide p6, p4, p2

    goto :goto_2

    .line 375
    :cond_1
    iget-object p6, p0, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum;->bins:[Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;

    aget-object p6, p6, p2

    const/4 v0, 0x1

    invoke-virtual {p6, p7, p8, v0}, Lcom/daaw/avee/comp/Visualizer/Dsp/PhaseSpectrum/PhaseSpectrum$BarBin;->Finialize(DI)D

    move-result-wide p6

    aput-wide p6, p4, p2

    :goto_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;)V
    .locals 0

    return-void
.end method
