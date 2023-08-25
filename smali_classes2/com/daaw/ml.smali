.class public Lcom/daaw/ml;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/ic1;FFF)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public b(Lcom/daaw/ic1;FFLandroid/graphics/RectF;Lcom/daaw/ll;)V
    .locals 0

    invoke-interface {p5, p4}, Lcom/daaw/ll;->a(Landroid/graphics/RectF;)F

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/ml;->a(Lcom/daaw/ic1;FFF)V

    return-void
.end method
