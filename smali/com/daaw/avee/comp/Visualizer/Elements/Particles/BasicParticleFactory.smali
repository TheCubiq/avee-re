.class public Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AParticleFactoryBase;
.source "BasicParticleFactory.java"


# instance fields
.field private _lifetime:F

.field colorF4Tmp:[F

.field colorHslaTmp:[F

.field protected customImagePath:Ljava/lang/String;

.field private endSize:F

.field private endSizeRandom:F

.field private endSizeTmp:F

.field private endSizeZFactor:F

.field private fadeInAndOutTime:F

.field private fadeInSize:F

.field private gravity:Lcom/daaw/avee/Common/Vec2f;

.field private hslaColorFrom:[F

.field private hslaColorTo:[F

.field private particleAtTime1:F

.field private particleAtTime1Inv:F

.field private particleAtTime2:F

.field private particleAtTime2Inv:F

.field private final randomGenerator:Ljava/util/Random;

.field private sideSineWaveFreq:F

.field private sideSineWaveFreqRandom:F

.field private sideSineWaveMag:F

.field private sideSineWaveMagRandom:F

.field private sizeAspectRatio:F

.field private startSize:F

.field private velocityAngle:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 59
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AParticleFactoryBase;-><init>()V

    .line 22
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->randomGenerator:Ljava/util/Random;

    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->customImagePath:Ljava/lang/String;

    const/high16 v0, 0x3fc00000    # 1.5f

    .line 26
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->_lifetime:F

    const v0, 0x3dcccccd    # 0.1f

    .line 28
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->fadeInAndOutTime:F

    .line 30
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->gravity:Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x1

    .line 31
    iput-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->velocityAngle:Z

    const/4 v1, 0x4

    new-array v3, v1, [F

    .line 32
    fill-array-data v3, :array_0

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->hslaColorFrom:[F

    new-array v3, v1, [F

    .line 33
    fill-array-data v3, :array_1

    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->hslaColorTo:[F

    .line 35
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveFreq:F

    .line 36
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveFreqRandom:F

    .line 37
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveMag:F

    .line 38
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveMagRandom:F

    const/high16 v3, 0x3f800000    # 1.0f

    .line 40
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sizeAspectRatio:F

    const/high16 v3, 0x40800000    # 4.0f

    .line 42
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->startSize:F

    .line 43
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->fadeInSize:F

    .line 44
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->endSize:F

    .line 45
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->endSizeRandom:F

    .line 46
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->endSizeZFactor:F

    new-array v2, v1, [F

    .line 48
    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->colorHslaTmp:[F

    new-array v1, v1, [F

    .line 49
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->colorF4Tmp:[F

    .line 51
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->particleAtTime1:F

    .line 52
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->particleAtTime2:F

    .line 53
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->particleAtTime1Inv:F

    .line 54
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->particleAtTime2Inv:F

    .line 60
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInAndOutTime(F)V

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public allocateParticle()Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;
    .locals 1

    .line 205
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;-><init>()V

    return-object v0
.end method

.method public emitParticleMaybe(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;Lcom/daaw/avee/Common/Vec3f;Lcom/daaw/avee/Common/Vec3f;)Z
    .locals 11

    .line 211
    check-cast p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;

    .line 213
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->randomGenerator:Ljava/util/Random;

    invoke-virtual {p1}, Ljava/util/Random;->nextFloat()F

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float v1, v0, p1

    .line 216
    new-instance v2, Lcom/daaw/avee/Common/Vec3f;

    iget v3, p4, Lcom/daaw/avee/Common/Vec3f;->x:F

    const v4, 0x3e4ccccd    # 0.2f

    mul-float v3, v3, v4

    iget v5, p4, Lcom/daaw/avee/Common/Vec3f;->y:F

    mul-float v5, v5, v4

    iget p4, p4, Lcom/daaw/avee/Common/Vec3f;->z:F

    const v4, 0x3ca3d70a    # 0.02f

    mul-float p4, p4, v4

    invoke-direct {v2, v3, v5, p4}, Lcom/daaw/avee/Common/Vec3f;-><init>(FFF)V

    .line 217
    invoke-virtual {v2}, Lcom/daaw/avee/Common/Vec3f;->normalize()V

    .line 219
    iget p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->endSizeRandom:F

    mul-float p4, p4, p1

    .line 220
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->endSize:F

    iget v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->endSizeZFactor:F

    iget v5, v2, Lcom/daaw/avee/Common/Vec3f;->z:F

    mul-float v4, v4, v5

    add-float/2addr v3, v4

    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->endSizeTmp:F

    .line 221
    iget v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->speedA:F

    iget v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->speedRandom:F

    mul-float v4, v4, p1

    add-float/2addr v3, v4

    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->speedTmp:F

    const/4 v3, 0x4

    .line 226
    invoke-virtual {p2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->allocateStopps(I)V

    const/4 v3, 0x0

    .line 233
    invoke-virtual {p2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v4

    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveFreq:F

    iget v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveFreqRandom:F

    mul-float v6, v6, v1

    add-float/2addr v5, v6

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveFreq:F

    .line 234
    invoke-virtual {p2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v4

    iget v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveMag:F

    iget v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveMagRandom:F

    mul-float v6, v6, p1

    add-float/2addr v5, v6

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveMag:F

    const/4 v4, 0x1

    .line 235
    invoke-virtual {p2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v5

    iget v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveFreq:F

    iget v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveFreqRandom:F

    mul-float v7, v7, v1

    add-float/2addr v6, v7

    iput v6, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveFreq:F

    .line 236
    invoke-virtual {p2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v5

    iget v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveMag:F

    iget v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveMagRandom:F

    mul-float v7, v7, p1

    add-float/2addr v6, v7

    iput v6, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveMag:F

    const/4 v5, 0x2

    .line 237
    invoke-virtual {p2, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v6

    iget v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveFreq:F

    iget v8, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveFreqRandom:F

    mul-float v8, v8, v1

    add-float/2addr v7, v8

    iput v7, v6, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveFreq:F

    .line 238
    invoke-virtual {p2, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v6

    iget v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveMag:F

    iget v8, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveMagRandom:F

    mul-float v8, v8, p1

    add-float/2addr v7, v8

    iput v7, v6, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveMag:F

    const/4 v6, 0x3

    .line 239
    invoke-virtual {p2, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v7

    iget v8, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveFreq:F

    iget v9, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveFreqRandom:F

    mul-float v9, v9, v1

    add-float/2addr v8, v9

    iput v8, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveFreq:F

    .line 240
    invoke-virtual {p2, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v1

    iget v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveMag:F

    iget v8, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveMagRandom:F

    mul-float v8, v8, p1

    add-float/2addr v7, v8

    iput v7, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveMag:F

    .line 242
    invoke-virtual {p2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v1

    const/4 v7, 0x0

    iput v7, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->atTime:F

    .line 243
    invoke-virtual {p2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v1

    iget v8, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->particleAtTime1:F

    iput v8, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->atTime:F

    .line 244
    invoke-virtual {p2, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v1

    iget v8, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->particleAtTime2:F

    iput v8, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->atTime:F

    .line 245
    invoke-virtual {p2, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v1

    iput v0, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->atTime:F

    .line 247
    invoke-virtual {p2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->velocityAngle:Z

    iput-boolean v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->velocityAngle:Z

    .line 248
    invoke-virtual {p2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->velocityAngle:Z

    iput-boolean v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->velocityAngle:Z

    .line 249
    invoke-virtual {p2, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->velocityAngle:Z

    iput-boolean v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->velocityAngle:Z

    .line 250
    invoke-virtual {p2, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->velocityAngle:Z

    iput-boolean v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->velocityAngle:Z

    .line 253
    invoke-virtual {p2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v0

    invoke-virtual {p2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v1

    iget v8, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->startSize:F

    add-float/2addr v8, p4

    iput v8, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeY:F

    iput v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeX:F

    .line 254
    invoke-virtual {p2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v0

    invoke-virtual {p2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v1

    iget v8, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->fadeInSize:F

    add-float/2addr v8, p4

    iget v9, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->particleAtTime1Inv:F

    mul-float v8, v8, v9

    iget v9, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->endSizeTmp:F

    iget v10, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->particleAtTime1:F

    mul-float v9, v9, v10

    add-float/2addr v8, v9

    iput v8, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeY:F

    iput v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeX:F

    .line 255
    invoke-virtual {p2, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v0

    invoke-virtual {p2, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v1

    iget v8, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->fadeInSize:F

    add-float/2addr v8, p4

    iget v9, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->particleAtTime2Inv:F

    mul-float v8, v8, v9

    iget v9, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->endSizeTmp:F

    iget v10, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->particleAtTime2:F

    mul-float v9, v9, v10

    add-float/2addr v8, v9

    iput v8, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeY:F

    iput v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeX:F

    .line 256
    invoke-virtual {p2, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v0

    invoke-virtual {p2, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v1

    iget v8, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->endSizeTmp:F

    add-float/2addr v8, p4

    iput v8, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeY:F

    iput v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeX:F

    .line 258
    invoke-virtual {p2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object p4

    invoke-virtual {p2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v0

    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeY:F

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sizeAspectRatio:F

    mul-float v0, v0, v1

    iput v0, p4, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeX:F

    .line 259
    invoke-virtual {p2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object p4

    invoke-virtual {p2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v0

    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeY:F

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sizeAspectRatio:F

    mul-float v0, v0, v1

    iput v0, p4, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeX:F

    .line 260
    invoke-virtual {p2, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object p4

    invoke-virtual {p2, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v0

    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeY:F

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sizeAspectRatio:F

    mul-float v0, v0, v1

    iput v0, p4, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeX:F

    .line 261
    invoke-virtual {p2, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object p4

    invoke-virtual {p2, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object v0

    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeY:F

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sizeAspectRatio:F

    mul-float v0, v0, v1

    iput v0, p4, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeX:F

    .line 263
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->hslaColorFrom:[F

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->hslaColorTo:[F

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->colorHslaTmp:[F

    invoke-static {p4, v0, v1, p1}, Lcom/daaw/avee/Common/Utils;->lerpHsla([F[F[FF)V

    .line 264
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->colorHslaTmp:[F

    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->colorF4Tmp:[F

    invoke-static {p1, p4}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->hlsa1ColorToF4Color([F[F)V

    .line 267
    invoke-virtual {p2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->setColorArgb(I)V

    .line 270
    invoke-virtual {p2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object p1

    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->colorF4Tmp:[F

    invoke-virtual {p1, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->setColorArgb([F)V

    .line 271
    invoke-virtual {p2, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object p1

    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->colorF4Tmp:[F

    invoke-virtual {p1, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->setColorArgb([F)V

    .line 272
    invoke-virtual {p2, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->setColorArgb(I)V

    .line 276
    iget-object p1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->pos:Lcom/daaw/avee/Common/Vec3f;

    iget p4, p3, Lcom/daaw/avee/Common/Vec3f;->x:F

    iput p4, p1, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 277
    iget-object p1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->pos:Lcom/daaw/avee/Common/Vec3f;

    iget p4, p3, Lcom/daaw/avee/Common/Vec3f;->y:F

    iput p4, p1, Lcom/daaw/avee/Common/Vec3f;->y:F

    .line 278
    iget-object p1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->pos:Lcom/daaw/avee/Common/Vec3f;

    iget p3, p3, Lcom/daaw/avee/Common/Vec3f;->z:F

    iput p3, p1, Lcom/daaw/avee/Common/Vec3f;->z:F

    .line 280
    iget-object p1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget p3, v2, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->speedTmp:F

    mul-float p3, p3, p4

    iput p3, p1, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 281
    iget-object p1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget p3, v2, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->speedTmp:F

    mul-float p3, p3, p4

    iput p3, p1, Lcom/daaw/avee/Common/Vec3f;->y:F

    .line 282
    iget-object p1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget p3, v2, Lcom/daaw/avee/Common/Vec3f;->z:F

    iget p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->speedTmp:F

    mul-float p3, p3, p4

    iput p3, p1, Lcom/daaw/avee/Common/Vec3f;->z:F

    .line 285
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->gravity:Lcom/daaw/avee/Common/Vec2f;

    iput-object p1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->gravity:Lcom/daaw/avee/Common/Vec2f;

    .line 286
    invoke-static {}, Lcom/daaw/avee/Common/Utils;->tickCount()J

    move-result-wide p3

    iput-wide p3, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->createdTime:J

    .line 287
    iput v7, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->frameFloat:F

    .line 288
    iput v7, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currLifetime:F

    .line 289
    iput v7, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currLifetime10:F

    .line 290
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->_lifetime:F

    iput p1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->lifeTime:F

    .line 291
    iput-boolean v3, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->loop:Z

    .line 292
    iput-boolean v3, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->animPaused:Z

    const/4 p1, 0x0

    .line 293
    iput-object p1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->sprite:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    .line 294
    invoke-virtual {p2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->setAlive(Z)V

    return v4
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 3

    .line 151
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AParticleFactoryBase;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const/4 v0, 0x4

    new-array v1, v0, [F

    .line 153
    fill-array-data v1, :array_0

    const-string v2, "ColorFrom"

    invoke-virtual {p1, v2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyArray4f(Ljava/lang/String;[F)[F

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->hslaColorFrom:[F

    new-array v0, v0, [F

    .line 154
    fill-array-data v0, :array_1

    const-string v1, "ColorTo"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyArray4f(Ljava/lang/String;[F)[F

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->hslaColorTo:[F

    const-string v0, "lifetime"

    const/high16 v1, 0x41000000    # 8.0f

    .line 156
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->_lifetime:F

    const-string v0, "fadeInAndOutTime"

    const v1, 0x3dcccccd    # 0.1f

    .line 157
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInAndOutTime(F)V

    .line 158
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const-string v2, "gravity"

    invoke-virtual {p1, v2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->gravity:Lcom/daaw/avee/Common/Vec2f;

    const-string v0, "velocityAngle"

    const/4 v2, 0x1

    .line 159
    invoke-virtual {p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->velocityAngle:Z

    const-string v0, "sizeAspectRatio"

    const/high16 v2, 0x3f800000    # 1.0f

    .line 161
    invoke-virtual {p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sizeAspectRatio:F

    const-string v0, "startSize"

    .line 162
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->startSize:F

    const/high16 v0, 0x40800000    # 4.0f

    const-string v2, "fadeInSize"

    .line 163
    invoke-virtual {p1, v2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v2

    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->fadeInSize:F

    const-string v2, "endSize"

    .line 164
    invoke-virtual {p1, v2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->endSize:F

    const-string v0, "endSizeRandom"

    const/high16 v2, 0x41200000    # 10.0f

    .line 165
    invoke-virtual {p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->endSizeRandom:F

    const-string v0, "endSizeZFactor"

    .line 166
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->endSizeZFactor:F

    const-string v0, "sideSineWaveFreq"

    .line 168
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveFreq:F

    const-string v0, "sideSineWaveFreqRandom"

    .line 169
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveFreqRandom:F

    const-string v0, "sideSineWaveMag"

    .line 170
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveMag:F

    const-string v0, "sideSineWaveMagRandom"

    .line 171
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveMagRandom:F

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x0
        0x3f000000    # 0.5f
        0x3f000000    # 0.5f
    .end array-data
.end method

.method public onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 7

    .line 176
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AParticleFactoryBase;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 181
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->hslaColorFrom:[F

    const-string v6, "appearance"

    const-string v1, "ColorFrom"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyArray4fAsCHSLA(Ljava/lang/String;[FLjava/lang/String;)V

    .line 182
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->hslaColorTo:[F

    const-string v1, "ColorTo"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyArray4fAsCHSLA(Ljava/lang/String;[FLjava/lang/String;)V

    .line 184
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->_lifetime:F

    const-string v1, "lifetime"

    const-string v3, "behaviour"

    const v4, 0x3dcccccd    # 0.1f

    const/high16 v5, 0x41200000    # 10.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 185
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->fadeInAndOutTime:F

    const-string v1, "fadeInAndOutTime"

    const-string v3, "appearance"

    const/4 v4, 0x0

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 186
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->gravity:Lcom/daaw/avee/Common/Vec2f;

    const-string v1, "gravity"

    const-string v3, "behaviour"

    const/high16 v4, -0x3c6a0000    # -300.0f

    const/high16 v5, 0x43960000    # 300.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyVec2fAsRange(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Ljava/lang/String;FF)V

    .line 188
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->velocityAngle:Z

    const-string v1, "velocityAngle"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 189
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sizeAspectRatio:F

    const-string v1, "sizeAspectRatio"

    const-string v3, "appearance"

    const v4, 0x3dcccccd    # 0.1f

    const/high16 v5, 0x41200000    # 10.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 190
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->startSize:F

    const-string v1, "startSize"

    const-string v3, "appearance"

    const/4 v4, 0x0

    const/high16 v5, 0x41a00000    # 20.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 191
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->fadeInSize:F

    const-string v1, "fadeInSize"

    const-string v3, "appearance"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 192
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->endSize:F

    const-string v1, "endSize"

    const-string v3, "appearance"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 193
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->endSizeRandom:F

    const-string v1, "endSizeRandom"

    const-string v3, "appearance"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 194
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->endSizeZFactor:F

    const-string v1, "endSizeZFactor"

    const-string v3, "appearance"

    const/high16 v5, 0x42200000    # 40.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 196
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveFreq:F

    const-string v1, "sideSineWaveFreq"

    const-string v3, "waveBehaviour"

    const/high16 v5, 0x41200000    # 10.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 197
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveFreqRandom:F

    const-string v1, "sideSineWaveFreqRandom"

    const-string v3, "waveBehaviour"

    const/high16 v4, -0x3ee00000    # -10.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 198
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveMag:F

    const-string v1, "sideSineWaveMag"

    const-string v3, "waveBehaviour"

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 199
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveMagRandom:F

    const-string v1, "sideSineWaveMagRandom"

    const-string v3, "waveBehaviour"

    const/high16 v4, -0x3ee00000    # -10.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    return-void
.end method

.method public setColorBoth(I)V
    .locals 0

    .line 135
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setColorFrom(I)V

    .line 136
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setColorTo(I)V

    return-void
.end method

.method public setColorFrom(I)V
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->hslaColorFrom:[F

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToHlsa1([FI)V

    return-void
.end method

.method public setColorTo(FFFF)V
    .locals 2

    .line 128
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->hslaColorTo:[F

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 p1, 0x1

    .line 129
    aput p2, v0, p1

    const/4 p1, 0x2

    .line 130
    aput p3, v0, p1

    const/4 p1, 0x3

    .line 131
    aput p4, v0, p1

    return-void
.end method

.method public setColorTo(I)V
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->hslaColorTo:[F

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToHlsa1([FI)V

    return-void
.end method

.method public setEndSize(F)V
    .locals 0

    .line 103
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->endSize:F

    return-void
.end method

.method public setEndSizeRandom(F)V
    .locals 0

    .line 108
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->endSizeRandom:F

    return-void
.end method

.method public setEndSizeZFactor(F)V
    .locals 0

    .line 112
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->endSizeZFactor:F

    return-void
.end method

.method public setFadeInAndOutTime(F)V
    .locals 2

    const/4 v0, 0x0

    .line 141
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->fadeInAndOutTime:F

    .line 143
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->particleAtTime1:F

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float v1, v0, p1

    .line 144
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->particleAtTime2:F

    sub-float p1, v0, p1

    .line 145
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->particleAtTime1Inv:F

    sub-float/2addr v0, v1

    .line 146
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->particleAtTime2Inv:F

    return-void
.end method

.method public setFadeInSize(F)V
    .locals 0

    .line 99
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->fadeInSize:F

    return-void
.end method

.method public setGravity(Lcom/daaw/avee/Common/Vec2f;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->gravity:Lcom/daaw/avee/Common/Vec2f;

    return-void
.end method

.method public setLifetime(F)V
    .locals 0

    .line 67
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->_lifetime:F

    return-void
.end method

.method public setSideSineWaveFreq(F)V
    .locals 0

    .line 79
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveFreq:F

    return-void
.end method

.method public setSideSineWaveFreqRandom(F)V
    .locals 0

    .line 83
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveFreqRandom:F

    return-void
.end method

.method public setSideSineWaveMag(F)V
    .locals 0

    .line 91
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveMag:F

    return-void
.end method

.method public setSideSineWaveMagRandom(F)V
    .locals 0

    .line 87
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->sideSineWaveMagRandom:F

    return-void
.end method

.method public setStartSize(F)V
    .locals 0

    .line 95
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->startSize:F

    return-void
.end method

.method public setVelocityAngle(Z)V
    .locals 0

    .line 75
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->velocityAngle:Z

    return-void
.end method
