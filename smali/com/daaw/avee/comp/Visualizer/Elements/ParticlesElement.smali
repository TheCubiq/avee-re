.class public Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
.source "ParticlesElement.java"


# static fields
.field public static final internalParticles:[Ljava/lang/String;

.field public static final internalParticlesCelebration:[Ljava/lang/String;

.field public static final typeName:Ljava/lang/String; = "Particles"


# instance fields
.field MirrorXRender:Lcom/daaw/avee/Common/Func/Func3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Func/Func3<",
            "Ljava/lang/Integer;",
            "[F[I",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field MirrorXYRender:Lcom/daaw/avee/Common/Func/Func3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Func/Func3<",
            "Ljava/lang/Integer;",
            "[F[I",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field MirrorYRender:Lcom/daaw/avee/Common/Func/Func3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Func/Func3<",
            "Ljava/lang/Integer;",
            "[F[I",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field RenderEmpty:Lcom/daaw/avee/Common/Func/Func3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Func/Func3<",
            "Ljava/lang/Integer;",
            "[F[F",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private additionalRelativeVel:Lcom/daaw/avee/Common/Vec2f;

.field private areaField:Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;

.field private atlasTex1:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

.field private color1:I

.field private colorRgbaTmp:[F

.field final colorRgbaTmp0:[F

.field private dirx0:Lcom/daaw/avee/Common/Vec2f;

.field private dirx1:Lcom/daaw/avee/Common/Vec2f;

.field drawRectCenterXTmp:F

.field drawRectCenterYTmp:F

.field elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

.field private emittingTimeAcc:F

.field private everySec:F

.field private forceField:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;

.field private measureOverallScale:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

.field private measureOverallSpeed:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

.field private mirrorX:Z

.field private mirrorY:Z

.field private nearCameraFadeOutDistance:F

.field private overallScale:F

.field private overallSpeed:F

.field private particeVisibleBounds:Lcom/daaw/avee/Common/Vec2f;

.field private particeVisiblePos:Lcom/daaw/avee/Common/Vec2f;

.field private particleFactory:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;

.field private particles:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

.field private particlesLowCount:I

.field private pathPointOut:Lcom/daaw/avee/Common/Vec3f;

.field private pathPointVecOut:Lcom/daaw/avee/Common/Vec3f;

.field private perspectiveDepth:F

.field private perspectiveFov:F

.field final pi2:F

.field private shaderOnBindAction:Lcom/daaw/avee/Common/Action3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Action3<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;",
            ">;"
        }
    .end annotation
.end field

.field public final vpMat:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/4 v0, 0x5

    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "internalres:particle_blur01"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v4, "internalres:particle_circle_blur4"

    const/4 v5, 0x1

    aput-object v4, v1, v5

    const-string v6, "internalres:particle_circle_w_a_64"

    const/4 v7, 0x2

    aput-object v6, v1, v7

    const-string v8, "internalres:particle_sharp"

    const/4 v9, 0x3

    aput-object v8, v1, v9

    const-string v10, "composition:0"

    const/4 v11, 0x4

    aput-object v10, v1, v11

    .line 46
    sput-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->internalParticles:[Ljava/lang/String;

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/String;

    aput-object v2, v1, v3

    aput-object v4, v1, v5

    aput-object v6, v1, v7

    aput-object v8, v1, v9

    const-string v2, "internalres:snowflake"

    aput-object v2, v1, v11

    const-string v2, "internalres:year2018"

    aput-object v2, v1, v0

    const/4 v0, 0x6

    aput-object v10, v1, v0

    .line 55
    sput-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->internalParticlesCelebration:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    const/4 v0, 0x2

    const/high16 v1, 0x3f000000    # 0.5f

    .line 108
    invoke-direct {p0, v0, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;-><init>(IFF)V

    const/4 v2, 0x0

    .line 65
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particlesLowCount:I

    new-array v3, v2, [Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    .line 66
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particles:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    const/4 v3, 0x0

    .line 67
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->emittingTimeAcc:F

    const/4 v4, 0x0

    .line 68
    iput-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->areaField:Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;

    const v5, 0x3cf5c28f    # 0.03f

    .line 69
    iput v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->everySec:F

    .line 70
    iput-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particleFactory:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;

    const/4 v5, -0x1

    .line 71
    iput v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->color1:I

    const/high16 v6, 0x3f800000    # 1.0f

    .line 72
    iput v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->overallScale:F

    .line 73
    iput v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->overallSpeed:F

    .line 74
    invoke-static {}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->AsNothing()Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    move-result-object v7

    iput-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->measureOverallScale:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    .line 75
    invoke-static {}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->AsNothing()Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    move-result-object v7

    iput-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->measureOverallSpeed:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    .line 76
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->mirrorY:Z

    .line 77
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->mirrorX:Z

    .line 78
    iput-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->forceField:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;

    .line 80
    iput v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->perspectiveDepth:F

    const/high16 v7, 0x42b40000    # 90.0f

    .line 81
    iput v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->perspectiveFov:F

    .line 83
    iput-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->atlasTex1:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    .line 85
    new-instance v7, Lcom/daaw/avee/Common/Vec3f;

    invoke-direct {v7, v3, v3, v3}, Lcom/daaw/avee/Common/Vec3f;-><init>(FFF)V

    iput-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->pathPointOut:Lcom/daaw/avee/Common/Vec3f;

    .line 86
    new-instance v7, Lcom/daaw/avee/Common/Vec3f;

    invoke-direct {v7, v3, v3, v3}, Lcom/daaw/avee/Common/Vec3f;-><init>(FFF)V

    iput-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->pathPointVecOut:Lcom/daaw/avee/Common/Vec3f;

    .line 87
    new-instance v7, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v7, v3, v3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particeVisiblePos:Lcom/daaw/avee/Common/Vec2f;

    .line 88
    new-instance v7, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v7, v3, v3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particeVisibleBounds:Lcom/daaw/avee/Common/Vec2f;

    .line 89
    new-instance v7, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v7, v3, v3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->additionalRelativeVel:Lcom/daaw/avee/Common/Vec2f;

    .line 90
    new-instance v7, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v7, v3, v3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    .line 91
    new-instance v7, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v7, v3, v3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    const/4 v7, 0x4

    new-array v8, v7, [F

    .line 92
    iput-object v8, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->colorRgbaTmp:[F

    new-array v7, v7, [F

    .line 94
    iput-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->colorRgbaTmp0:[F

    const v7, 0x40c90fdb

    .line 98
    iput v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->pi2:F

    .line 102
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-direct {v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;-><init>()V

    iput-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->vpMat:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    const/high16 v7, 0x42200000    # 40.0f

    .line 104
    iput v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->nearCameraFadeOutDistance:F

    .line 433
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$2;

    invoke-direct {v7, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$2;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)V

    iput-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->shaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 889
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$4;

    invoke-direct {v7, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$4;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)V

    iput-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->RenderEmpty:Lcom/daaw/avee/Common/Func/Func3;

    .line 897
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$5;

    invoke-direct {v7, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$5;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)V

    iput-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->MirrorXRender:Lcom/daaw/avee/Common/Func/Func3;

    .line 939
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$6;

    invoke-direct {v7, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$6;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)V

    iput-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->MirrorYRender:Lcom/daaw/avee/Common/Func/Func3;

    .line 979
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$7;

    invoke-direct {v7, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$7;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)V

    iput-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->MirrorXYRender:Lcom/daaw/avee/Common/Func/Func3;

    .line 110
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$1;

    invoke-direct {v8, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$1;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)V

    invoke-direct {v7, v8, v4, v4, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func2;Lcom/daaw/avee/Common/Func/Func2;)V

    iput-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    .line 117
    sget-object v4, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->internalParticles:[Ljava/lang/String;

    aget-object v2, v4, v2

    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setCustomImage(Ljava/lang/String;)V

    .line 118
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;-><init>()V

    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->_setParticlesFactory(Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;)V

    .line 120
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setBlendMode(I)V

    .line 128
    invoke-virtual {p0, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setScale(FF)V

    const/16 v2, 0x5dc

    .line 129
    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesCountLimit(I)V

    const v2, 0x3ca3d70a    # 0.02f

    .line 130
    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesSpawnTime(F)V

    .line 131
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;-><init>()V

    invoke-virtual {v2, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;->setVectorZ(F)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setArea(Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;)V

    .line 132
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setBlendMode(I)V

    .line 133
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const-string v2, "Beat"

    const/high16 v4, 0x3fc00000    # 1.5f

    invoke-direct {v0, v2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setMeasureOverallSpeed(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    const/high16 v0, 0x40000000    # 2.0f

    .line 135
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesScale(F)V

    .line 136
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->internalParticles:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setCustomImage(Ljava/lang/String;)V

    const/high16 v0, 0x44610000    # 900.0f

    .line 137
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setPerspectiveDepth(F)V

    const/high16 v0, 0x43160000    # 150.0f

    .line 138
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setPerspectiveFov(F)V

    .line 140
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->getParticlesFactory()Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;

    move-result-object v0

    .line 142
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSideSineWaveFreq(F)V

    const/high16 v1, 0x3e800000    # 0.25f

    .line 143
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSideSineWaveMag(F)V

    .line 145
    invoke-virtual {v0, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setColorFrom(I)V

    const v1, -0x7f7f7f80

    .line 146
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setColorTo(I)V

    const/high16 v1, 0x41000000    # 8.0f

    .line 147
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setLifetime(F)V

    const v1, 0x3dcccccd    # 0.1f

    .line 148
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInAndOutTime(F)V

    .line 149
    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setStartSize(F)V

    const/high16 v1, 0x40800000    # 4.0f

    .line 150
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInSize(F)V

    .line 151
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setEndSize(F)V

    const/high16 v1, 0x41200000    # 10.0f

    .line 152
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setEndSizeRandom(F)V

    const/high16 v1, 0x42c80000    # 100.0f

    .line 153
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSpeed(F)V

    const/high16 v1, 0x42700000    # 60.0f

    .line 154
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSpeedRandom(F)V

    .line 155
    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setTrailLength(F)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)V
    .locals 0

    .line 42
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->markNeedReCreateGLResourcesDontOverride()V

    return-void
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particles:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    return-object p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->forceField:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;

    return-object p0
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)Lcom/daaw/avee/Common/Vec2f;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->additionalRelativeVel:Lcom/daaw/avee/Common/Vec2f;

    return-object p0
.end method

.method static synthetic access$400(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)Lcom/daaw/avee/Common/Vec2f;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particeVisiblePos:Lcom/daaw/avee/Common/Vec2f;

    return-object p0
.end method

.method static synthetic access$500(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)Lcom/daaw/avee/Common/Vec2f;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particeVisibleBounds:Lcom/daaw/avee/Common/Vec2f;

    return-object p0
.end method

.method static synthetic access$600(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)[F
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->colorRgbaTmp:[F

    return-object p0
.end method

.method private renderParticle(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;[FFF)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    .line 778
    invoke-interface/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->getTextureFrame()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v1

    .line 784
    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->colorRgbaTmp:[F

    invoke-interface/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->getColorArgb()[F

    move-result-object v3

    move-object/from16 v4, p3

    invoke-static {v2, v3, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->f4ColorMultiply([F[F[F)V

    .line 785
    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->colorRgbaTmp:[F

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->f4ColorToIntColorRgba([FI)I

    move-result v18

    .line 787
    invoke-interface/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->getPosition()Lcom/daaw/avee/Common/Vec3f;

    move-result-object v12

    .line 788
    invoke-interface/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->getRot()F

    move-result v2

    if-nez v1, :cond_0

    .line 791
    iget-object v1, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasTexWhite()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v1

    :cond_0
    move-object/from16 v19, v1

    .line 793
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    invoke-interface/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->getSizeX()F

    move-result v3

    neg-float v3, v3

    iput v3, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 794
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    invoke-interface/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->getSizeY()F

    move-result v3

    iput v3, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 795
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v1, v2}, Lcom/daaw/avee/Common/Vec2f;->rotate(F)V

    .line 797
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    invoke-interface/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->getSizeX()F

    move-result v3

    iput v3, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 798
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    invoke-interface/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->getSizeY()F

    move-result v3

    iput v3, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 799
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v1, v2}, Lcom/daaw/avee/Common/Vec2f;->rotate(F)V

    .line 802
    iget v1, v12, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float v3, v1, v2

    .line 803
    iget v1, v12, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float v4, v1, v2

    .line 804
    iget v1, v12, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float v5, v1, v2

    .line 805
    iget v1, v12, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float v6, v1, v2

    .line 806
    iget v1, v12, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float v7, v1, v2

    .line 807
    iget v1, v12, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float v8, v1, v2

    .line 808
    iget v1, v12, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float v9, v1, v2

    .line 809
    iget v1, v12, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float v10, v1, v2

    .line 811
    iget-object v1, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v1

    const/4 v11, 0x0

    .line 819
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v13

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v14

    .line 821
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->getBlendMode()I

    move-result v16

    const/16 v17, 0x0

    move-object/from16 v2, p1

    move-object/from16 v20, v12

    move/from16 v12, v18

    move-object/from16 v15, v19

    .line 811
    invoke-virtual/range {v1 .. v17}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleFCol(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;ILcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;)V

    .line 825
    iget-boolean v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->mirrorX:Z

    if-eqz v1, :cond_1

    move-object/from16 v15, v20

    .line 826
    iget v1, v15, Lcom/daaw/avee/Common/Vec3f;->x:F

    sub-float v1, p4, v1

    add-float v1, p4, v1

    iput v1, v15, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 828
    iget v1, v15, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float v3, v1, v2

    .line 829
    iget v1, v15, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float v4, v1, v2

    .line 830
    iget v1, v15, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float v5, v1, v2

    .line 831
    iget v1, v15, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float v6, v1, v2

    .line 832
    iget v1, v15, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float v7, v1, v2

    .line 833
    iget v1, v15, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float v8, v1, v2

    .line 834
    iget v1, v15, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float v9, v1, v2

    .line 835
    iget v1, v15, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float v10, v1, v2

    move-object/from16 v12, p1

    .line 837
    iget-object v1, v12, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v1

    const/4 v11, 0x0

    .line 845
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v13

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v14

    .line 847
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->getBlendMode()I

    move-result v16

    const/16 v17, 0x0

    move-object/from16 v2, p1

    move/from16 v12, v18

    move-object/from16 v21, v15

    move-object/from16 v15, v19

    .line 837
    invoke-virtual/range {v1 .. v17}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleFCol(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;ILcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;)V

    goto :goto_0

    :cond_1
    move-object/from16 v21, v20

    .line 851
    :goto_0
    iget-boolean v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->mirrorY:Z

    if-eqz v1, :cond_2

    move-object/from16 v1, v21

    .line 852
    iget v2, v1, Lcom/daaw/avee/Common/Vec3f;->y:F

    sub-float v2, p5, v2

    add-float v2, p5, v2

    iput v2, v1, Lcom/daaw/avee/Common/Vec3f;->y:F

    .line 854
    iget v2, v1, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr v3, v2

    .line 855
    iget v2, v1, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v4, v2

    .line 856
    iget v2, v1, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    iget v5, v5, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr v5, v2

    .line 857
    iget v2, v1, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    iget v6, v6, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v6, v2

    .line 858
    iget v2, v1, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    iget v7, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float v7, v2, v7

    .line 859
    iget v2, v1, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    iget v8, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float v8, v2, v8

    .line 860
    iget v2, v1, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget-object v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    iget v9, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float v9, v2, v9

    .line 861
    iget v1, v1, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float v10, v1, v2

    move-object/from16 v2, p1

    .line 863
    iget-object v1, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v1

    const/4 v11, 0x0

    .line 871
    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v13

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v14

    .line 873
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->getBlendMode()I

    move-result v16

    const/16 v17, 0x0

    move/from16 v12, v18

    move-object/from16 v15, v19

    .line 863
    invoke-virtual/range {v1 .. v17}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleFCol(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;ILcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;)V

    :cond_2
    return-void
.end method

.method private update(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;Landroid/graphics/RectF;FLcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Lcom/daaw/avee/Common/Vec2f;)V
    .locals 22

    move-object/from16 v10, p0

    move-object/from16 v12, p1

    .line 551
    iget v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->overallScale:F

    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->measureOverallScale:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    iget-object v2, v12, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v2, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    move-result v1

    add-float/2addr v0, v1

    .line 552
    iget v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->overallSpeed:F

    iget-object v2, v10, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->measureOverallSpeed:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    iget-object v3, v12, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v3, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    invoke-virtual {v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measure(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    move-result v2

    const/high16 v3, 0x40a00000    # 5.0f

    mul-float v2, v2, v3

    add-float v6, v1, v2

    .line 554
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenScale1D(F)F

    move-result v0

    const v1, 0x3a83126f    # 0.001f

    mul-float v5, v0, v1

    .line 556
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    move/from16 v1, p4

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenScale1D(F)F

    move-result v0

    const v1, 0x3ab60b61

    mul-float v7, v0, v1

    .line 558
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Meter;->measureScreenScale1D(F)F

    move-result v4

    .line 562
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerX()F

    .line 563
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerY()F

    .line 564
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iput v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->drawRectCenterXTmp:F

    .line 565
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerY()F

    move-result v0

    iput v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->drawRectCenterYTmp:F

    .line 568
    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->colorRgbaTmp0:[F

    iget v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->color1:I

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToF4Color([FI)V

    .line 612
    iget v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->nearCameraFadeOutDistance:F

    const v1, 0x358637bd    # 1.0E-6f

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v9

    .line 614
    iget-object v0, v12, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v11

    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;

    move-object v0, v13

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p1

    move-object/from16 v8, p6

    invoke-direct/range {v0 .. v9}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;Landroid/graphics/RectF;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;FFFFLcom/daaw/avee/Common/Vec2f;F)V

    iget-boolean v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->mirrorX:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->MirrorXRender:Lcom/daaw/avee/Common/Func/Func3;

    move-object v14, v0

    goto :goto_0

    :cond_0
    move-object v14, v1

    :goto_0
    iget-boolean v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->mirrorY:Z

    if-eqz v0, :cond_1

    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->MirrorYRender:Lcom/daaw/avee/Common/Func/Func3;

    move-object v15, v0

    goto :goto_1

    :cond_1
    move-object v15, v1

    :goto_1
    iget-boolean v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->mirrorX:Z

    if-eqz v0, :cond_2

    iget-boolean v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->mirrorY:Z

    if-eqz v0, :cond_2

    iget-object v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->MirrorXYRender:Lcom/daaw/avee/Common/Func/Func3;

    move-object/from16 v16, v0

    goto :goto_2

    :cond_2
    move-object/from16 v16, v1

    :goto_2
    iget v0, v10, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particlesLowCount:I

    const/16 v18, 0x0

    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    new-instance v4, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v4, v2, v3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    move-object/from16 v12, p1

    move/from16 v17, v0

    move-object/from16 v19, v1

    move-object/from16 v20, v4

    move-object/from16 v21, p5

    invoke-virtual/range {v11 .. v21}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawBatchRectangle(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/Common/Func/Func3;Lcom/daaw/avee/Common/Func/Func3;Lcom/daaw/avee/Common/Func/Func3;Lcom/daaw/avee/Common/Func/Func3;IFLcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method


# virtual methods
.method public _setParticlesFactory(Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particleFactory:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;

    .line 201
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->markNeedReCreateGLResources()V

    return-void
.end method

.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, "Particles"

    return-object v0
.end method

.method getFreeParticleIndex()I
    .locals 3

    const/4 v0, 0x0

    .line 259
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particles:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    .line 260
    aget-object v1, v1, v0

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->getAlive()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 273
    :cond_1
    :goto_1
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particles:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    array-length v1, v1

    if-ge v0, v1, :cond_2

    return v0

    :cond_2
    const/4 v0, -0x1

    return v0
.end method

.method public getNearCameraFadeOutDistance()F
    .locals 1

    .line 238
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->nearCameraFadeOutDistance:F

    return v0
.end method

.method public getParticlesCountLimit()I
    .locals 1

    .line 183
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particlesLowCount:I

    return v0
.end method

.method public getParticlesFactory()Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;
    .locals 1

    .line 205
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particleFactory:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;

    check-cast v0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;

    return-object v0
.end method

.method protected markNeedReCreateGLResources()V
    .locals 1

    .line 387
    invoke-super {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->markNeedReCreateGLResources()V

    .line 388
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->markNeedReCreateGLResources()V

    :cond_0
    return-void
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 4

    .line 291
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 293
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->internalParticles:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const-string v2, "customImage"

    invoke-virtual {p1, v2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setCustomImage(Ljava/lang/String;)V

    const-string v0, "color"

    const/4 v2, -0x1

    .line 295
    invoke-virtual {p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->color1:I

    const-string v0, "CountLimit"

    const/16 v2, 0x5dc

    .line 296
    invoke-virtual {p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesCountLimit(I)V

    const-string v0, "particleScale"

    const/high16 v2, 0x40000000    # 2.0f

    .line 297
    invoke-virtual {p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->overallScale:F

    const-string v0, "spawnTime"

    const v2, 0x3ca3d70a    # 0.02f

    .line 298
    invoke-virtual {p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->everySec:F

    const-string v0, "mirrorX"

    .line 300
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setMirrorX(Z)V

    const-string v0, "mirrorY"

    .line 301
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setMirrorY(Z)V

    const-string v0, "perspectiveDepth"

    const/high16 v1, 0x44610000    # 900.0f

    .line 303
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setPerspectiveDepth(F)V

    const-string v0, "perspectiveFov"

    const/high16 v1, 0x43160000    # 150.0f

    .line 304
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setPerspectiveFov(F)V

    const-string v0, "SpawnArea"

    .line 307
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    const-string v1, "Rectangle"

    .line 308
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->areaField:Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;

    invoke-static {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaFactory;->create(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setArea(Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;)V

    .line 309
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->areaField:Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;

    if-eqz v1, :cond_0

    .line 310
    invoke-interface {v1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    :cond_0
    const-string v0, "MeasureOverallSpeed"

    .line 315
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    .line 316
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->measureOverallSpeed:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const/high16 v2, 0x3fc00000    # 1.5f

    const-string v3, "Beat"

    invoke-virtual {v1, v0, v3, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;F)V

    .line 321
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particleFactory:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;

    if-eqz v0, :cond_1

    .line 322
    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    :cond_1
    const-string v0, "ForceField"

    .line 326
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    const-string v1, "None"

    .line 327
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->forceField:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;

    invoke-static {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ForceFieldFactory;->create(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->forceField:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;

    if-eqz v1, :cond_2

    .line 329
    invoke-interface {v1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 332
    :cond_2
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->getNearCameraFadeOutDistance()F

    move-result v0

    const-string v1, "nearCameraFadeOutDistance"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setNearCameraFadeOutDistance(F)V

    return-void
.end method

.method protected onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z
    .locals 5

    .line 400
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z

    .line 402
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particles:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    array-length v0, v0

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particlesLowCount:I

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    .line 404
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particleFactory:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;

    if-eqz v0, :cond_0

    .line 406
    new-array v0, v1, [Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particles:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    const/4 v0, 0x0

    .line 407
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particles:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    array-length v3, v1

    if-ge v0, v3, :cond_1

    .line 408
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particleFactory:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;

    invoke-interface {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;->allocateParticle()Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    move-result-object v3

    aput-object v3, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-array v0, v2, [Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    .line 411
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particles:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    .line 415
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    new-instance v1, Landroid/graphics/RectF;

    const/high16 v3, 0x43800000    # 256.0f

    const/4 v4, 0x0

    invoke-direct {v1, v4, v4, v3, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;I)Z

    const/4 p1, 0x1

    return p1
.end method

.method protected onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V
    .locals 1

    .line 421
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V

    .line 423
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)Z

    return-void
.end method

.method protected onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 1

    .line 393
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 395
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    :cond_0
    return-void
.end method

.method public onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V
    .locals 1

    .line 428
    invoke-super {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    .line 429
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    return-void
.end method

.method protected onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 7

    .line 337
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V

    const-string v0, "Particles"

    .line 338
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->setCustomizationName(Ljava/lang/String;)V

    .line 340
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getCustomImagePath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;->PutDependencyResourceName(Ljava/lang/String;)V

    .line 341
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    .line 343
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getCustomImagePath()Ljava/lang/String;

    move-result-object v0

    sget-boolean v1, Lcom/daaw/avee/Design/GeneralDesign;->celebrationContentAvailable:Z

    if-eqz v1, :cond_0

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->internalParticlesCelebration:[Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->internalParticles:[Ljava/lang/String;

    :goto_0
    const-string v2, "customImage"

    const-string v3, "appearance"

    .line 341
    invoke-virtual {p1, v2, v0, v3, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsImagePr(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 348
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->color1:I

    const-string v6, "1_overall"

    const-string v1, "color"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGBA(Ljava/lang/String;ILjava/lang/String;)V

    .line 349
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->getParticlesCountLimit()I

    move-result v2

    const/4 v4, 0x1

    const/16 v5, 0x1388

    const-string v1, "CountLimit"

    const-string v3, "1_overall"

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRange(Ljava/lang/String;ILjava/lang/String;II)V

    .line 350
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->overallScale:F

    const/high16 v4, 0x3e800000    # 0.25f

    const/high16 v5, 0x41000000    # 8.0f

    const-string v1, "particleScale"

    const-string v3, "appearance"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 351
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->everySec:F

    const v4, 0x3ba3d70a    # 0.005f

    const v5, 0x3d4ccccd    # 0.05f

    const-string v1, "spawnTime"

    const-string v3, "behaviour"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 353
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->mirrorX:Z

    const-string v1, "mirrorX"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 354
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->mirrorY:Z

    const-string v1, "mirrorY"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 356
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->perspectiveDepth:F

    const/4 v4, 0x0

    const/high16 v5, 0x447a0000    # 1000.0f

    const-string v1, "perspectiveDepth"

    const-string v3, "1_overall"

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 357
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->perspectiveFov:F

    const/high16 v4, 0x41f00000    # 30.0f

    const/high16 v5, 0x43340000    # 180.0f

    const-string v1, "perspectiveFov"

    const-string v3, "1_overall"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 360
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->areaField:Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaFactory;->getTypeName(Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaFactory;->typeNames:[Ljava/lang/String;

    const-string v2, "SpawnArea"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    .line 362
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->areaField:Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;

    if-eqz v1, :cond_1

    invoke-interface {v1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    :cond_1
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "MeasureOverallSpeed"

    const-string v2, ""

    const-string v3, "behaviour"

    .line 367
    invoke-virtual {p1, v1, v2, v3, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    .line 368
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->measureOverallSpeed:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->onReadCustomizationSpeed(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 373
    :cond_2
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particleFactory:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;

    if-eqz v0, :cond_3

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 377
    :cond_3
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->forceField:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ForceFieldFactory;->getTypeName(Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/ForceFieldFactory;->typeNamesAndNone:[Ljava/lang/String;

    const-string v2, "ForceField"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    .line 378
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->forceField:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;

    if-eqz v1, :cond_4

    invoke-interface {v1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 381
    :cond_4
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->getNearCameraFadeOutDistance()F

    move-result v2

    const/4 v4, 0x0

    const/high16 v5, 0x43fa0000    # 500.0f

    const-string v1, "nearCameraFadeOutDistance"

    const-string v3, "appearance"

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 21

    move-object/from16 v7, p0

    move-object/from16 v6, p1

    .line 442
    invoke-super/range {p0 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 443
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    move-object/from16 v5, p2

    invoke-virtual {v0, v6, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 445
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particles:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    array-length v0, v0

    iget v1, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particlesLowCount:I

    if-eq v0, v1, :cond_0

    return-void

    .line 448
    :cond_0
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    invoke-virtual {v7, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->measureDrawRect(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v4

    const/4 v0, 0x0

    .line 453
    new-instance v3, Lcom/daaw/avee/Common/Vec2f;

    const/4 v2, 0x0

    invoke-direct {v3, v2, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 454
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v1, v2, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 459
    iget v15, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->perspectiveDepth:F

    const/high16 v18, 0x3f800000    # 1.0f

    cmpl-float v8, v15, v18

    if-lez v8, :cond_1

    .line 474
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->shaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 476
    iget-object v9, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->vpMat:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    iget v12, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->perspectiveFov:F

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v8, -0x3e600000    # -20.0f

    sub-float v14, v15, v8

    const/high16 v16, -0x41000000    # -0.5f

    const/high16 v17, -0x41000000    # -0.5f

    const/high16 v19, -0x3ee00000    # -10.0f

    const v13, 0x3c23d70a    # 0.01f

    move-object/from16 v8, p1

    move-object v10, v3

    move-object/from16 v11, p2

    move v2, v15

    move/from16 v15, v16

    move/from16 v16, v17

    move/from16 v17, v19

    invoke-virtual/range {v8 .. v17}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->createViewProjMatrixPerspective(Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;Lcom/daaw/avee/Common/Vec2f;Lmdesl/graphics/glutils/FrameBuffer;FFFFFF)V

    neg-float v2, v2

    .line 480
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v8

    iget v9, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    div-float/2addr v8, v9

    .line 481
    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v9

    iget v10, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    div-float/2addr v9, v10

    move v10, v8

    move v11, v9

    move-object v8, v0

    move v9, v2

    goto :goto_0

    :cond_1
    move-object v8, v0

    const/4 v9, 0x0

    const/high16 v10, 0x3f800000    # 1.0f

    const/high16 v11, 0x3f800000    # 1.0f

    .line 486
    :goto_0
    iget v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->emittingTimeAcc:F

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getFrameTimeSmooth()F

    move-result v2

    add-float/2addr v0, v2

    iput v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->emittingTimeAcc:F

    .line 490
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particleFactory:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;

    if-eqz v0, :cond_8

    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->areaField:Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;

    if-eqz v0, :cond_8

    const v0, 0x3c23d70a    # 0.01f

    .line 492
    iget v2, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->everySec:F

    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->everySec:F

    .line 493
    iget v2, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->emittingTimeAcc:F

    mul-float v0, v0, v2

    const/high16 v12, 0x42c80000    # 100.0f

    mul-float v0, v0, v12

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->emittingTimeAcc:F

    .line 494
    :goto_1
    iget v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->emittingTimeAcc:F

    iget v2, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->everySec:F

    cmpl-float v12, v0, v2

    if-lez v12, :cond_5

    sub-float/2addr v0, v2

    .line 495
    iput v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->emittingTimeAcc:F

    .line 497
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->getFreeParticleIndex()I

    move-result v12

    if-ltz v12, :cond_4

    .line 498
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particles:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    array-length v0, v0

    if-ge v12, v0, :cond_4

    .line 502
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->areaField:Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;

    iget-object v2, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->pathPointOut:Lcom/daaw/avee/Common/Vec3f;

    iget-object v13, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->pathPointVecOut:Lcom/daaw/avee/Common/Vec3f;

    iget v14, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->perspectiveDepth:F

    cmpl-float v14, v14, v18

    if-lez v14, :cond_2

    const/4 v14, 0x1

    goto :goto_2

    :cond_2
    const/4 v14, 0x0

    :goto_2
    invoke-interface {v0, v4, v2, v13, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;->getRandomPointInArea(Landroid/graphics/RectF;Lcom/daaw/avee/Common/Vec3f;Lcom/daaw/avee/Common/Vec3f;Z)V

    .line 513
    iget v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->perspectiveDepth:F

    cmpl-float v0, v0, v18

    if-lez v0, :cond_3

    .line 515
    iget v0, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v2, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    div-float v13, v0, v2

    iget v14, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->perspectiveFov:F

    move-object/from16 v0, p1

    move-object v15, v1

    move-object/from16 v16, v8

    const/4 v8, 0x0

    move v2, v9

    move-object/from16 v20, v3

    move-object/from16 v3, p2

    move-object/from16 v17, v4

    move v4, v13

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->createViewProjMatrixPerspectiveBoundsAtZ(Lcom/daaw/avee/Common/Vec2f;FLmdesl/graphics/glutils/FrameBuffer;FF)V

    .line 516
    iget v0, v15, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float v0, v0, v1

    invoke-virtual/range {v17 .. v17}, Landroid/graphics/RectF;->width()F

    move-result v2

    div-float/2addr v0, v2

    .line 517
    iget v2, v15, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v2, v2, v1

    invoke-virtual/range {v17 .. v17}, Landroid/graphics/RectF;->height()F

    move-result v1

    div-float/2addr v2, v1

    .line 518
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->pathPointOut:Lcom/daaw/avee/Common/Vec3f;

    iget v3, v1, Lcom/daaw/avee/Common/Vec3f;->x:F

    invoke-virtual/range {v17 .. v17}, Landroid/graphics/RectF;->centerX()F

    move-result v4

    sub-float/2addr v3, v4

    mul-float v3, v3, v0

    mul-float v3, v3, v10

    invoke-virtual/range {v17 .. v17}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    add-float/2addr v3, v0

    iput v3, v1, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 519
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->pathPointOut:Lcom/daaw/avee/Common/Vec3f;

    iget v1, v0, Lcom/daaw/avee/Common/Vec3f;->y:F

    invoke-virtual/range {v17 .. v17}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    sub-float/2addr v1, v3

    mul-float v1, v1, v2

    mul-float v1, v1, v11

    invoke-virtual/range {v17 .. v17}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    add-float/2addr v1, v2

    iput v1, v0, Lcom/daaw/avee/Common/Vec3f;->y:F

    goto :goto_3

    :cond_3
    move-object v15, v1

    move-object/from16 v20, v3

    move-object/from16 v17, v4

    move-object/from16 v16, v8

    const/4 v8, 0x0

    .line 521
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->pathPointVecOut:Lcom/daaw/avee/Common/Vec3f;

    iput v8, v0, Lcom/daaw/avee/Common/Vec3f;->z:F

    .line 525
    :goto_3
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particleFactory:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;

    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particles:[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    aget-object v1, v1, v12

    new-instance v2, Lcom/daaw/avee/Common/Vec3f;

    iget-object v3, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->pathPointOut:Lcom/daaw/avee/Common/Vec3f;

    iget v3, v3, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget-object v4, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->pathPointOut:Lcom/daaw/avee/Common/Vec3f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec3f;->y:F

    invoke-direct {v2, v3, v4, v9}, Lcom/daaw/avee/Common/Vec3f;-><init>(FFF)V

    iget-object v3, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->pathPointVecOut:Lcom/daaw/avee/Common/Vec3f;

    invoke-interface {v0, v6, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;->emitParticleMaybe(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;Lcom/daaw/avee/Common/Vec3f;Lcom/daaw/avee/Common/Vec3f;)Z

    goto :goto_4

    :cond_4
    move-object v15, v1

    move-object/from16 v20, v3

    move-object/from16 v17, v4

    move-object/from16 v16, v8

    const/4 v8, 0x0

    :goto_4
    move-object/from16 v5, p2

    move-object v1, v15

    move-object/from16 v8, v16

    move-object/from16 v4, v17

    move-object/from16 v3, v20

    goto/16 :goto_1

    :cond_5
    move-object/from16 v20, v3

    move-object/from16 v17, v4

    move-object/from16 v16, v8

    .line 530
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v0

    if-nez v0, :cond_6

    .line 531
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasTexWhite()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object v0

    .line 533
    :cond_6
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_atlasBufferVPMat()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v1

    .line 534
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->getBlendMode()I

    move-result v2

    move-object/from16 v3, v16

    invoke-direct {v5, v2, v0, v1, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    .line 536
    iget v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->perspectiveDepth:F

    cmpl-float v0, v0, v18

    if-lez v0, :cond_7

    .line 537
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particleFactory:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;->getTrailLength()F

    move-result v4

    new-instance v8, Lcom/daaw/avee/Common/Vec2f;

    move-object/from16 v0, v20

    iget v1, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float v1, v1, v2

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v0, v0, v2

    invoke-direct {v8, v1, v0}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, v17

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->update(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;Landroid/graphics/RectF;FLcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Lcom/daaw/avee/Common/Vec2f;)V

    goto :goto_5

    .line 539
    :cond_7
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particleFactory:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;->getTrailLength()F

    move-result v4

    const/4 v8, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, v17

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->update(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;Landroid/graphics/RectF;FLcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Lcom/daaw/avee/Common/Vec2f;)V

    :cond_8
    :goto_5
    return-void
.end method

.method public renderParticle(Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;FFFF[F)V
    .locals 2

    .line 751
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->getSizeX()F

    move-result v1

    neg-float v1, v1

    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 752
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->getSizeY()F

    move-result v1

    neg-float v1, v1

    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 753
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v0, p5}, Lcom/daaw/avee/Common/Vec2f;->rotate(F)V

    .line 755
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->getSizeX()F

    move-result v1

    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 756
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->getSizeY()F

    move-result p1

    neg-float p1, p1

    iput p1, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 757
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {p1, p5}, Lcom/daaw/avee/Common/Vec2f;->rotate(F)V

    .line 759
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr p1, p2

    const/4 p5, 0x0

    aput p1, p6, p5

    .line 760
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr p1, p3

    const/4 p5, 0x1

    aput p1, p6, p5

    .line 762
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr p1, p2

    const/4 p5, 0x2

    aput p1, p6, p5

    .line 763
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr p1, p3

    const/4 p5, 0x3

    aput p1, p6, p5

    .line 765
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float p1, p2, p1

    const/4 p5, 0x4

    aput p1, p6, p5

    .line 766
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx1:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float p1, p3, p1

    const/4 p5, 0x5

    aput p1, p6, p5

    .line 768
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float/2addr p2, p1

    const/4 p1, 0x6

    aput p2, p6, p1

    .line 769
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->dirx0:Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float/2addr p3, p1

    const/4 p1, 0x7

    aput p3, p6, p1

    const/16 p1, 0x8

    .line 771
    aput p4, p6, p1

    return-void
.end method

.method public setArea(Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->areaField:Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;

    return-void
.end method

.method public setColor(I)V
    .locals 0

    .line 286
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->color1:I

    return-void
.end method

.method public setCustomImage(Ljava/lang/String;)V
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setCustomImage(Ljava/lang/String;)V

    return-void
.end method

.method public setForceField(Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;)V
    .locals 0

    .line 886
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->forceField:Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;

    return-void
.end method

.method public setMeasureOverallScale(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->measureOverallScale:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    return-void
.end method

.method public setMeasureOverallSpeed(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V
    .locals 0

    .line 213
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->measureOverallSpeed:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    return-void
.end method

.method public setMirrorX(Z)V
    .locals 0

    .line 221
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->mirrorX:Z

    return-void
.end method

.method public setMirrorY(Z)V
    .locals 0

    .line 217
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->mirrorY:Z

    return-void
.end method

.method public setNearCameraFadeOutDistance(F)V
    .locals 0

    .line 234
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->nearCameraFadeOutDistance:F

    return-void
.end method

.method public setParticlesCountLimit(I)V
    .locals 1

    .line 176
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particlesLowCount:I

    if-ne v0, p1, :cond_0

    return-void

    .line 177
    :cond_0
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->particlesLowCount:I

    .line 179
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->markNeedReCreateGLResources()V

    return-void
.end method

.method public setParticlesFactory(Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;)V
    .locals 0

    return-void
.end method

.method public setParticlesScale(F)V
    .locals 0

    .line 191
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->overallScale:F

    return-void
.end method

.method public setParticlesSpawnTime(F)V
    .locals 0

    .line 187
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->everySec:F

    return-void
.end method

.method public setPerspectiveDepth(F)V
    .locals 0

    .line 225
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->perspectiveDepth:F

    return-void
.end method

.method public setPerspectiveFov(F)V
    .locals 0

    .line 230
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->perspectiveFov:F

    return-void
.end method
