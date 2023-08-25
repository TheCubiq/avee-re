.class public Lcom/daaw/aw1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qd0;


# instance fields
.field public a:F

.field public b:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lcom/daaw/aw1;->a:F

    iput v0, p0, Lcom/daaw/aw1;->b:F

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/un;)V
    .locals 0

    return-void
.end method

.method public o(Lcom/daaw/un;)V
    .locals 0

    return-void
.end method

.method public p(FFLcom/daaw/bs1;)F
    .locals 2

    iget v0, p0, Lcom/daaw/aw1;->b:F

    mul-float v1, p2, v0

    iput v1, p3, Lcom/daaw/bs1;->a:F

    neg-float v1, p1

    mul-float v1, v1, v0

    iput v1, p3, Lcom/daaw/bs1;->b:F

    mul-float p1, p1, p1

    mul-float p2, p2, p2

    add-float/2addr p1, p2

    iget p2, p0, Lcom/daaw/aw1;->a:F

    div-float/2addr p1, p2

    const/high16 p2, 0x3f800000    # 1.0f

    add-float/2addr p1, p2

    div-float/2addr p2, p1

    return p2
.end method
