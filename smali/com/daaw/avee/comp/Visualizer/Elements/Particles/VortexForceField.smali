.class public Lcom/daaw/avee/comp/Visualizer/Elements/Particles/VortexForceField;
.super Ljava/lang/Object;
.source "VortexForceField.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;


# static fields
.field public static final typeName:Ljava/lang/String; = "Vortex"


# instance fields
.field private scale:F

.field private speed:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x42480000    # 50.0f

    .line 14
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/VortexForceField;->scale:F

    .line 15
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/VortexForceField;->speed:F

    return-void
.end method


# virtual methods
.method public getVelocityAndFactor(FFLcom/daaw/avee/Common/Vec2f;)F
    .locals 2

    .line 30
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/VortexForceField;->speed:F

    mul-float v0, v0, p2

    iput v0, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    neg-float v0, p1

    .line 31
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/VortexForceField;->speed:F

    mul-float v0, v0, v1

    iput v0, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float p1, p1, p1

    mul-float p2, p2, p2

    add-float/2addr p1, p2

    .line 33
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/VortexForceField;->scale:F

    div-float/2addr p1, p2

    const/high16 p2, 0x3f800000    # 1.0f

    add-float/2addr p1, p2

    div-float/2addr p2, p1

    return p2
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 0

    return-void
.end method

.method public onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 0

    return-void
.end method

.method public setScale(F)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/VortexForceField;
    .locals 0

    .line 18
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/VortexForceField;->scale:F

    return-object p0
.end method

.method public setSpeed(F)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/VortexForceField;
    .locals 0

    .line 23
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/VortexForceField;->speed:F

    return-object p0
.end method
