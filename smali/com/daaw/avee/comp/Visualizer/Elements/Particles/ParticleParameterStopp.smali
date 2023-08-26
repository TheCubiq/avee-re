.class public Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;
.super Ljava/lang/Object;
.source "ParticleParameterStopp.java"


# instance fields
.field public atTime:F

.field private final colorRgba:[F

.field public rot:F

.field public sideSineWaveFreq:F

.field public sideSineWaveMag:F

.field public sizeX:F

.field public sizeY:F

.field public velocityAngle:Z


# direct methods
.method constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [F

    .line 16
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->colorRgba:[F

    const/high16 v0, 0x40800000    # 4.0f

    .line 17
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveFreq:F

    const/4 v0, 0x0

    .line 18
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveMag:F

    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->velocityAngle:Z

    return-void
.end method

.method public static Interpolate(Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;F)V
    .locals 5

    const/4 v0, 0x0

    .line 46
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->atTime:F

    .line 47
    iget v0, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeX:F

    iget v1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeX:F

    float-to-double v2, p3

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/avee/Common/Interpolate;->Lerp(FFD)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeX:F

    .line 48
    iget v0, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeY:F

    iget v1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeY:F

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/avee/Common/Interpolate;->Lerp(FFD)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeY:F

    .line 49
    iget v0, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->rot:F

    iget v1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->rot:F

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/avee/Common/Interpolate;->Lerp(FFD)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->rot:F

    .line 50
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->colorRgba:[F

    iget-object v1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->colorRgba:[F

    iget-object v4, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->colorRgba:[F

    invoke-static {v0, v1, v4, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->LerpColorF4([F[F[FF)V

    .line 51
    iget v0, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveFreq:F

    iget v1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveFreq:F

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/avee/Common/Interpolate;->Lerp(FFD)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveFreq:F

    .line 52
    iget v0, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveMag:F

    iget v1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveMag:F

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/avee/Common/Interpolate;->Lerp(FFD)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveMag:F

    const/high16 v0, 0x3f000000    # 0.5f

    cmpg-float p3, p3, v0

    if-gez p3, :cond_0

    .line 55
    iget-boolean p1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->velocityAngle:Z

    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->velocityAngle:Z

    goto :goto_0

    .line 57
    :cond_0
    iget-boolean p1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->velocityAngle:Z

    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->velocityAngle:Z

    :goto_0
    return-void
.end method


# virtual methods
.method public getColor()[F
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->colorRgba:[F

    return-object v0
.end method

.method public setColorArgb(I)V
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->colorRgba:[F

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToF4Color([FI)V

    return-void
.end method

.method public setColorArgb([F)V
    .locals 3

    .line 32
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->colorRgba:[F

    const/4 v1, 0x0

    aget v2, p1, v1

    aput v2, v0, v1

    const/4 v1, 0x1

    .line 33
    aget v2, p1, v1

    aput v2, v0, v1

    const/4 v1, 0x2

    .line 34
    aget v2, p1, v1

    aput v2, v0, v1

    const/4 v1, 0x3

    .line 35
    aget p1, p1, v1

    aput p1, v0, v1

    return-void
.end method
