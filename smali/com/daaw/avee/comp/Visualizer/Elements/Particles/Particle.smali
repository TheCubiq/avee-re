.class public Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;
.super Ljava/lang/Object;
.source "Particle.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;


# static fields
.field static first:Z = true

.field private static final nearCameraFadeSpeed:F = 10.0f

.field private static tmpVec:Lcom/daaw/avee/Common/Vec3f;

.field private static velVecX:Lcom/daaw/avee/Common/Vec3f;

.field private static velVecY:Lcom/daaw/avee/Common/Vec3f;


# instance fields
.field alive:Z

.field public animPaused:Z

.field public createdTime:J

.field public currLifetime:F

.field public currLifetime10:F

.field currStopp:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

.field dbg:Z

.field public finalVel:Lcom/daaw/avee/Common/Vec3f;

.field public frame:I

.field public frameFloat:F

.field public gravity:Lcom/daaw/avee/Common/Vec2f;

.field public lifeTime:F

.field public loop:Z

.field public pos:Lcom/daaw/avee/Common/Vec3f;

.field private rotation:F

.field private sizeXFinal:F

.field public sprite:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

.field private stopps:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

.field public textCoord:F

.field public vel:Lcom/daaw/avee/Common/Vec3f;

.field visible:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 45
    new-instance v0, Lcom/daaw/avee/Common/Vec3f;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Lcom/daaw/avee/Common/Vec3f;-><init>(FFF)V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->tmpVec:Lcom/daaw/avee/Common/Vec3f;

    .line 46
    new-instance v0, Lcom/daaw/avee/Common/Vec3f;

    invoke-direct {v0, v1, v1, v1}, Lcom/daaw/avee/Common/Vec3f;-><init>(FFF)V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->velVecY:Lcom/daaw/avee/Common/Vec3f;

    .line 47
    new-instance v0, Lcom/daaw/avee/Common/Vec3f;

    invoke-direct {v0, v1, v1, v1}, Lcom/daaw/avee/Common/Vec3f;-><init>(FFF)V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->velVecX:Lcom/daaw/avee/Common/Vec3f;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v1, v0, [Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    .line 24
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->stopps:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    .line 25
    new-instance v1, Lcom/daaw/avee/Common/Vec3f;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2, v2}, Lcom/daaw/avee/Common/Vec3f;-><init>(FFF)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    .line 26
    new-instance v1, Lcom/daaw/avee/Common/Vec3f;

    invoke-direct {v1, v2, v2, v2}, Lcom/daaw/avee/Common/Vec3f;-><init>(FFF)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->finalVel:Lcom/daaw/avee/Common/Vec3f;

    .line 27
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v1, v2, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->gravity:Lcom/daaw/avee/Common/Vec2f;

    .line 28
    new-instance v1, Lcom/daaw/avee/Common/Vec3f;

    invoke-direct {v1, v2, v2, v2}, Lcom/daaw/avee/Common/Vec3f;-><init>(FFF)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->pos:Lcom/daaw/avee/Common/Vec3f;

    .line 32
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->rotation:F

    .line 35
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->alive:Z

    .line 36
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->visible:Z

    .line 37
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;-><init>()V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currStopp:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    .line 40
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->dbg:Z

    .line 51
    sget-boolean v1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->first:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 53
    iput-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->dbg:Z

    .line 54
    sput-boolean v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->first:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public allocateStopps(I)V
    .locals 3

    .line 310
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->stopps:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    array-length v0, v0

    if-ne v0, p1, :cond_0

    return-void

    .line 312
    :cond_0
    new-array v0, p1, [Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->stopps:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_1

    .line 314
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->stopps:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;-><init>()V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public getAlive()Z
    .locals 1

    .line 91
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->alive:Z

    return v0
.end method

.method public getColorArgb()[F
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currStopp:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->getColor()[F

    move-result-object v0

    return-object v0
.end method

.method public getPosition()Lcom/daaw/avee/Common/Vec3f;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->pos:Lcom/daaw/avee/Common/Vec3f;

    return-object v0
.end method

.method public getRot()F
    .locals 1

    .line 76
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->rotation:F

    return v0
.end method

.method public getSizeX()F
    .locals 1

    .line 66
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->sizeXFinal:F

    return v0
.end method

.method public getSizeY()F
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currStopp:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeY:F

    return v0
.end method

.method public getStopp(I)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;
    .locals 1

    .line 323
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->stopps:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public getStoppsCount()I
    .locals 1

    .line 319
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->stopps:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    array-length v0, v0

    return v0
.end method

.method public getTextureFrame()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->sprite:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    return-object v0
.end method

.method public getVisible()Z
    .locals 1

    .line 101
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->visible:Z

    return v0
.end method

.method public setAlive(Z)V
    .locals 0

    .line 96
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->alive:Z

    return-void
.end method

.method public setVisible(Z)V
    .locals 0

    .line 106
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->visible:Z

    return-void
.end method

.method public update(FFLcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;FFLcom/daaw/avee/Common/Vec2f;FFLcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;F)Z
    .locals 11

    move-object v0, p0

    move-object/from16 v1, p7

    move-object/from16 v2, p10

    .line 123
    iget-boolean v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->alive:Z

    const/4 v4, 0x0

    if-nez v3, :cond_0

    return v4

    .line 125
    :cond_0
    iget v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currLifetime:F

    add-float/2addr v3, p1

    iput v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currLifetime:F

    .line 126
    iget v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->lifeTime:F

    div-float/2addr v3, v5

    iput v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currLifetime10:F

    const/high16 v5, 0x3f800000    # 1.0f

    cmpl-float v3, v3, v5

    if-gtz v3, :cond_c

    .line 129
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->stopps:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    if-nez v3, :cond_1

    goto/16 :goto_7

    :cond_1
    const/4 v3, 0x0

    if-eqz v2, :cond_2

    .line 136
    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->pos:Lcom/daaw/avee/Common/Vec3f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec3f;->z:F

    neg-float v6, v6

    sub-float v6, v6, p12

    invoke-static {v6, v3}, Ljava/lang/Math;->max(FF)F

    move-result v6

    const/high16 v7, 0x41200000    # 10.0f

    mul-float v7, v7, p12

    div-float/2addr v6, v7

    sub-float v6, v5, v6

    .line 137
    iget v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currLifetime10:F

    invoke-static {v7, v6}, Ljava/lang/Math;->max(FF)F

    move-result v6

    iput v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currLifetime10:F

    :cond_2
    const/4 v6, 0x0

    .line 143
    :goto_0
    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->stopps:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    array-length v8, v7

    if-ge v6, v8, :cond_4

    .line 144
    aget-object v7, v7, v6

    iget v7, v7, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->atTime:F

    iget v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currLifetime10:F

    cmpl-float v7, v7, v8

    if-ltz v7, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    add-int/lit8 v6, v6, -0x1

    if-gez v6, :cond_5

    const/4 v6, 0x0

    .line 149
    :cond_5
    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->stopps:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    array-length v8, v7

    const/4 v9, 0x1

    sub-int/2addr v8, v9

    if-lt v6, v8, :cond_6

    array-length v6, v7

    add-int/lit8 v6, v6, -0x2

    :cond_6
    add-int/lit8 v7, v6, 0x1

    if-gez v6, :cond_7

    goto :goto_2

    :cond_7
    move v4, v6

    .line 153
    :goto_2
    iget v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currLifetime10:F

    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->stopps:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    aget-object v8, v8, v4

    iget v8, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->atTime:F

    sub-float/2addr v6, v8

    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->stopps:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    aget-object v8, v8, v7

    iget v8, v8, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->atTime:F

    iget-object v10, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->stopps:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    aget-object v10, v10, v4

    iget v10, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->atTime:F

    sub-float/2addr v8, v10

    div-float/2addr v6, v8

    cmpl-float v8, v6, v5

    if-lez v8, :cond_8

    goto :goto_3

    :cond_8
    move v5, v6

    .line 155
    :goto_3
    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currStopp:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->stopps:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    aget-object v4, v8, v4

    aget-object v7, v8, v7

    invoke-static {v6, v4, v7, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->Interpolate(Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;F)V

    .line 157
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currStopp:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    iget v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeX:F

    mul-float v5, v5, p5

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeX:F

    .line 158
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currStopp:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    iget v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeY:F

    mul-float v5, v5, p5

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeY:F

    .line 160
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v5, v4, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget v7, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float/2addr v6, v7

    mul-float v6, v6, p8

    add-float/2addr v5, v6

    iput v5, v4, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 161
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v5, v4, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float/2addr v6, v1

    mul-float v6, v6, p8

    add-float/2addr v5, v6

    iput v5, v4, Lcom/daaw/avee/Common/Vec3f;->y:F

    .line 162
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v4, v1, Lcom/daaw/avee/Common/Vec3f;->z:F

    add-float/2addr v4, v3

    iput v4, v1, Lcom/daaw/avee/Common/Vec3f;->z:F

    .line 166
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currStopp:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    iget v1, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveFreq:F

    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currLifetime:F

    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currStopp:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    iget v5, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveFreq:F

    mul-float v4, v4, v5

    add-float/2addr v1, v4

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    double-to-float v1, v4

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currStopp:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    iget v4, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveMag:F

    mul-float v1, v1, v4

    .line 167
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currStopp:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    iget v4, v4, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveFreq:F

    iget v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currLifetime:F

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currStopp:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    iget v6, v6, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveFreq:F

    mul-float v5, v5, v6

    add-float/2addr v4, v5

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    double-to-float v4, v4

    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currStopp:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    iget v5, v5, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sideSineWaveMag:F

    mul-float v4, v4, v5

    .line 172
    sget-object v5, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->velVecY:Lcom/daaw/avee/Common/Vec3f;

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec3f;->y:F

    neg-float v6, v6

    iput v6, v5, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 173
    sget-object v5, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->velVecY:Lcom/daaw/avee/Common/Vec3f;

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec3f;->z:F

    iput v6, v5, Lcom/daaw/avee/Common/Vec3f;->y:F

    .line 174
    sget-object v5, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->velVecY:Lcom/daaw/avee/Common/Vec3f;

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec3f;->x:F

    iput v6, v5, Lcom/daaw/avee/Common/Vec3f;->z:F

    .line 176
    sget-object v5, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->velVecX:Lcom/daaw/avee/Common/Vec3f;

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec3f;->z:F

    neg-float v6, v6

    iput v6, v5, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 177
    sget-object v5, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->velVecX:Lcom/daaw/avee/Common/Vec3f;

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec3f;->x:F

    iput v6, v5, Lcom/daaw/avee/Common/Vec3f;->y:F

    .line 178
    sget-object v5, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->velVecX:Lcom/daaw/avee/Common/Vec3f;

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec3f;->y:F

    iput v6, v5, Lcom/daaw/avee/Common/Vec3f;->z:F

    if-eqz v2, :cond_9

    .line 195
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->finalVel:Lcom/daaw/avee/Common/Vec3f;

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec3f;->x:F

    sget-object v7, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->velVecX:Lcom/daaw/avee/Common/Vec3f;

    iget v7, v7, Lcom/daaw/avee/Common/Vec3f;->x:F

    mul-float v7, v7, v1

    add-float/2addr v6, v7

    sget-object v7, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->velVecY:Lcom/daaw/avee/Common/Vec3f;

    iget v7, v7, Lcom/daaw/avee/Common/Vec3f;->x:F

    mul-float v7, v7, v4

    add-float/2addr v6, v7

    iput v6, v5, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 196
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->finalVel:Lcom/daaw/avee/Common/Vec3f;

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec3f;->y:F

    sget-object v7, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->velVecX:Lcom/daaw/avee/Common/Vec3f;

    iget v7, v7, Lcom/daaw/avee/Common/Vec3f;->y:F

    mul-float v7, v7, v1

    add-float/2addr v6, v7

    sget-object v7, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->velVecY:Lcom/daaw/avee/Common/Vec3f;

    iget v7, v7, Lcom/daaw/avee/Common/Vec3f;->y:F

    mul-float v7, v7, v4

    add-float/2addr v6, v7

    iput v6, v5, Lcom/daaw/avee/Common/Vec3f;->y:F

    .line 197
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->finalVel:Lcom/daaw/avee/Common/Vec3f;

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec3f;->z:F

    sget-object v7, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->velVecX:Lcom/daaw/avee/Common/Vec3f;

    iget v7, v7, Lcom/daaw/avee/Common/Vec3f;->z:F

    mul-float v7, v7, v1

    add-float/2addr v6, v7

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->velVecY:Lcom/daaw/avee/Common/Vec3f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec3f;->z:F

    mul-float v1, v1, v4

    add-float/2addr v6, v1

    iput v6, v5, Lcom/daaw/avee/Common/Vec3f;->z:F

    goto :goto_4

    .line 199
    :cond_9
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->finalVel:Lcom/daaw/avee/Common/Vec3f;

    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v5, v5, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec3f;->y:F

    mul-float v6, v6, v1

    add-float/2addr v5, v6

    iput v5, v4, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 200
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->finalVel:Lcom/daaw/avee/Common/Vec3f;

    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v5, v5, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec3f;->x:F

    neg-float v6, v6

    mul-float v6, v6, v1

    add-float/2addr v5, v6

    iput v5, v4, Lcom/daaw/avee/Common/Vec3f;->y:F

    .line 201
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->finalVel:Lcom/daaw/avee/Common/Vec3f;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec3f;->z:F

    iput v4, v1, Lcom/daaw/avee/Common/Vec3f;->z:F

    .line 204
    :goto_4
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->pos:Lcom/daaw/avee/Common/Vec3f;

    iget v4, v1, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->finalVel:Lcom/daaw/avee/Common/Vec3f;

    iget v5, v5, Lcom/daaw/avee/Common/Vec3f;->x:F

    mul-float v5, v5, p1

    mul-float v5, v5, p6

    mul-float v5, v5, p2

    add-float/2addr v4, v5

    iput v4, v1, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 205
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->pos:Lcom/daaw/avee/Common/Vec3f;

    iget v4, v1, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->finalVel:Lcom/daaw/avee/Common/Vec3f;

    iget v5, v5, Lcom/daaw/avee/Common/Vec3f;->y:F

    mul-float v5, v5, p1

    mul-float v5, v5, p6

    mul-float v5, v5, p2

    add-float/2addr v4, v5

    iput v4, v1, Lcom/daaw/avee/Common/Vec3f;->y:F

    .line 206
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->pos:Lcom/daaw/avee/Common/Vec3f;

    iget v4, v1, Lcom/daaw/avee/Common/Vec3f;->z:F

    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->finalVel:Lcom/daaw/avee/Common/Vec3f;

    iget v5, v5, Lcom/daaw/avee/Common/Vec3f;->z:F

    mul-float v5, v5, p1

    mul-float v5, v5, p6

    mul-float v5, v5, p2

    add-float/2addr v4, v5

    iput v4, v1, Lcom/daaw/avee/Common/Vec3f;->z:F

    .line 216
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v4, v1, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->gravity:Lcom/daaw/avee/Common/Vec2f;

    iget v5, v5, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v5, v5, p1

    mul-float v5, v5, p2

    add-float/2addr v4, v5

    iput v4, v1, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 217
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->vel:Lcom/daaw/avee/Common/Vec3f;

    iget v4, v1, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->gravity:Lcom/daaw/avee/Common/Vec2f;

    iget v5, v5, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v5, v5, p1

    mul-float v5, v5, p2

    add-float/2addr v4, v5

    iput v4, v1, Lcom/daaw/avee/Common/Vec3f;->y:F

    .line 254
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currStopp:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    iget-boolean v1, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->velocityAngle:Z

    if-nez v1, :cond_a

    .line 255
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currStopp:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    iget v1, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->rot:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->rotation:F

    goto/16 :goto_6

    :cond_a
    if-eqz v2, :cond_b

    .line 264
    iget v1, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->pos:Lcom/daaw/avee/Common/Vec3f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec3f;->x:F

    sub-float/2addr v1, v4

    iget v4, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->pos:Lcom/daaw/avee/Common/Vec3f;

    iget v5, v5, Lcom/daaw/avee/Common/Vec3f;->y:F

    sub-float/2addr v4, v5

    invoke-static {v1, v4}, Lcom/daaw/avee/Common/Vec2f;->length(FF)F

    move-result v1

    .line 265
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->pos:Lcom/daaw/avee/Common/Vec3f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec3f;->z:F

    div-float/2addr v1, v4

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->atan(D)D

    move-result-wide v4

    double-to-float v1, v4

    .line 266
    iget v4, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->pos:Lcom/daaw/avee/Common/Vec3f;

    iget v5, v5, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->finalVel:Lcom/daaw/avee/Common/Vec3f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec3f;->x:F

    sub-float/2addr v5, v6

    sub-float/2addr v4, v5

    iget v5, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->pos:Lcom/daaw/avee/Common/Vec3f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->finalVel:Lcom/daaw/avee/Common/Vec3f;

    iget v7, v7, Lcom/daaw/avee/Common/Vec3f;->y:F

    sub-float/2addr v6, v7

    sub-float/2addr v5, v6

    invoke-static {v4, v5}, Lcom/daaw/avee/Common/Vec2f;->length(FF)F

    move-result v4

    .line 267
    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->pos:Lcom/daaw/avee/Common/Vec3f;

    iget v5, v5, Lcom/daaw/avee/Common/Vec3f;->z:F

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->finalVel:Lcom/daaw/avee/Common/Vec3f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec3f;->z:F

    sub-float/2addr v5, v6

    div-float/2addr v4, v5

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->atan(D)D

    move-result-wide v4

    double-to-float v4, v4

    .line 269
    sget-object v5, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->tmpVec:Lcom/daaw/avee/Common/Vec3f;

    iget v6, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->pos:Lcom/daaw/avee/Common/Vec3f;

    iget v7, v7, Lcom/daaw/avee/Common/Vec3f;->x:F

    sub-float/2addr v6, v7

    iput v6, v5, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 270
    sget-object v5, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->tmpVec:Lcom/daaw/avee/Common/Vec3f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->pos:Lcom/daaw/avee/Common/Vec3f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec3f;->y:F

    sub-float/2addr v2, v6

    iput v2, v5, Lcom/daaw/avee/Common/Vec3f;->y:F

    .line 271
    sget-object v2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->tmpVec:Lcom/daaw/avee/Common/Vec3f;

    iput v3, v2, Lcom/daaw/avee/Common/Vec3f;->z:F

    .line 273
    sget-object v2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->tmpVec:Lcom/daaw/avee/Common/Vec3f;

    invoke-virtual {v2}, Lcom/daaw/avee/Common/Vec3f;->getAngle2d()F

    move-result v2

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->rotation:F

    sub-float/2addr v1, v4

    .line 274
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const v2, 0x3e99999a    # 0.3f

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    const v2, 0x42c8199a    # 100.05f

    goto :goto_5

    .line 276
    :cond_b
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->finalVel:Lcom/daaw/avee/Common/Vec3f;

    invoke-virtual {v1}, Lcom/daaw/avee/Common/Vec3f;->getAngle2d()F

    move-result v1

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->rotation:F

    .line 277
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->finalVel:Lcom/daaw/avee/Common/Vec3f;

    invoke-virtual {v1}, Lcom/daaw/avee/Common/Vec3f;->length()F

    move-result v1

    const v2, 0x3d4ccccd    # 0.05f

    :goto_5
    mul-float v3, v1, v2

    .line 286
    :goto_6
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currStopp:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;

    iget v1, v1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ParticleParameterStopp;->sizeX:F

    mul-float v3, v3, p6

    mul-float v3, v3, p9

    add-float/2addr v1, v3

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->sizeXFinal:F

    return v9

    .line 130
    :cond_c
    :goto_7
    iput-boolean v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->alive:Z

    return v4
.end method

.method public updateVisible(F)V
    .locals 2

    .line 294
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->sprite:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->getFramesCount()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 296
    :goto_0
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->animPaused:Z

    if-nez v0, :cond_1

    int-to-float v0, p1

    .line 297
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currLifetime10:F

    mul-float v0, v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->frame:I

    .line 299
    :cond_1
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->loop:Z

    if-nez v0, :cond_2

    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->frame:I

    if-lt v0, p1, :cond_2

    add-int/lit8 v0, p1, -0x1

    .line 300
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->frame:I

    .line 302
    :cond_2
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->frame:I

    rem-int/2addr v0, p1

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->frame:I

    .line 305
    iget-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->animPaused:Z

    if-nez p1, :cond_3

    const/high16 p1, 0x3f800000    # 1.0f

    .line 306
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->currLifetime10:F

    mul-float v0, v0, p1

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Particle;->textCoord:F

    :cond_3
    return-void
.end method
