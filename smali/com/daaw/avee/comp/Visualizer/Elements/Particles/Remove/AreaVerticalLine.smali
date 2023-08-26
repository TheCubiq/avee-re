.class public Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaVerticalLine;
.super Ljava/lang/Object;
.source "AreaVerticalLine.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;


# static fields
.field public static final typeName:Ljava/lang/String; = "Line"

.field public static final typeNameAlias:Ljava/lang/String; = "VerticalLine"


# instance fields
.field private randomGenerator:Ljava/util/Random;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaVerticalLine;->randomGenerator:Ljava/util/Random;

    return-void
.end method


# virtual methods
.method public getRandomPointInArea(Landroid/graphics/RectF;Lcom/daaw/avee/Common/Vec3f;Lcom/daaw/avee/Common/Vec3f;Z)V
    .locals 1

    .line 25
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/Remove/AreaVerticalLine;->randomGenerator:Ljava/util/Random;

    invoke-virtual {p4}, Ljava/util/Random;->nextFloat()F

    move-result p4

    .line 27
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iput v0, p2, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 28
    iget v0, p1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    mul-float p1, p1, p4

    add-float/2addr v0, p1

    iput v0, p2, Lcom/daaw/avee/Common/Vec3f;->y:F

    const/4 p1, 0x0

    .line 29
    iput p1, p2, Lcom/daaw/avee/Common/Vec3f;->z:F

    const/high16 p2, 0x3f800000    # 1.0f

    .line 30
    iput p2, p3, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 31
    iput p1, p3, Lcom/daaw/avee/Common/Vec3f;->y:F

    .line 32
    iput p1, p3, Lcom/daaw/avee/Common/Vec3f;->z:F

    return-void
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 0

    return-void
.end method

.method public onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 0

    return-void
.end method
