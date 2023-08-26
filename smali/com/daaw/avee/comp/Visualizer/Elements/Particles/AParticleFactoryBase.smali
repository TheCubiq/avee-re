.class public abstract Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AParticleFactoryBase;
.super Ljava/lang/Object;
.source "AParticleFactoryBase.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticleFactory;


# instance fields
.field protected speedA:F

.field protected speedRandom:F

.field protected speedTmp:F

.field trailLength:F

.field trailLengthMin:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 14
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AParticleFactoryBase;->speedA:F

    const/4 v0, 0x0

    .line 15
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AParticleFactoryBase;->speedRandom:F

    .line 17
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AParticleFactoryBase;->trailLengthMin:F

    .line 18
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AParticleFactoryBase;->trailLength:F

    return-void
.end method


# virtual methods
.method public getTrailLength()F
    .locals 1

    .line 61
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AParticleFactoryBase;->trailLength:F

    return v0
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 2

    const-string v0, "Speed"

    const/high16 v1, 0x42c80000    # 100.0f

    .line 66
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AParticleFactoryBase;->speedA:F

    const-string v0, "speedRandom"

    const/high16 v1, 0x42700000    # 60.0f

    .line 67
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AParticleFactoryBase;->speedRandom:F

    const-string v0, "trailLength"

    const/4 v1, 0x0

    .line 70
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AParticleFactoryBase;->trailLength:F

    return-void
.end method

.method public onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 12

    .line 75
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AParticleFactoryBase;->speedA:F

    const-string v1, "Speed"

    const-string v3, "behaviour"

    const/high16 v4, -0x3c6a0000    # -300.0f

    const/high16 v5, 0x43960000    # 300.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 76
    iget v8, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AParticleFactoryBase;->speedRandom:F

    const-string v7, "speedRandom"

    const-string v9, "behaviour"

    const/high16 v10, -0x3c6a0000    # -300.0f

    const/high16 v11, 0x43960000    # 300.0f

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 83
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AParticleFactoryBase;->trailLength:F

    const-string v1, "trailLength"

    const-string v3, "appearance"

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    return-void
.end method

.method public setSpeed(F)V
    .locals 0

    .line 48
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AParticleFactoryBase;->speedA:F

    return-void
.end method

.method public setSpeedRandom(F)V
    .locals 0

    .line 52
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AParticleFactoryBase;->speedRandom:F

    return-void
.end method

.method public setTrailLength(F)V
    .locals 0

    .line 56
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AParticleFactoryBase;->trailLength:F

    return-void
.end method
