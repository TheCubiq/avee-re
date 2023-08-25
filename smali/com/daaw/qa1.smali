.class public Lcom/daaw/qa1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ge0;


# instance fields
.field public a:F

.field public b:I

.field public c:F

.field public d:Landroid/graphics/PointF;

.field public e:Landroid/graphics/PointF;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/daaw/qa1;->a:F

    const/4 v0, 0x3

    iput v0, p0, Lcom/daaw/qa1;->b:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/qa1;->c:F

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/daaw/qa1;->d:Landroid/graphics/PointF;

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/daaw/qa1;->e:Landroid/graphics/PointF;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/un;)V
    .locals 0

    return-void
.end method

.method public d(Lcom/daaw/de0;)V
    .locals 0

    return-void
.end method

.method public e(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I
    .locals 0

    const/4 p1, -0x1

    const/high16 p3, -0x40800000    # -1.0f

    const/high16 p5, 0x3f800000    # 1.0f

    packed-switch p2, :pswitch_data_0

    return p1

    :pswitch_0
    iget p1, p4, Landroid/graphics/RectF;->left:F

    iput p1, p6, Landroid/graphics/PointF;->x:F

    iget p1, p4, Landroid/graphics/RectF;->bottom:F

    iput p1, p6, Landroid/graphics/PointF;->y:F

    iput p3, p7, Landroid/graphics/PointF;->x:F

    iput p5, p7, Landroid/graphics/PointF;->y:F

    const/4 p1, 0x6

    return p1

    :pswitch_1
    iget p1, p4, Landroid/graphics/RectF;->right:F

    iput p1, p6, Landroid/graphics/PointF;->x:F

    iget p1, p4, Landroid/graphics/RectF;->bottom:F

    iput p1, p6, Landroid/graphics/PointF;->y:F

    iput p5, p7, Landroid/graphics/PointF;->x:F

    iput p5, p7, Landroid/graphics/PointF;->y:F

    const/4 p1, 0x5

    return p1

    :pswitch_2
    iget p1, p4, Landroid/graphics/RectF;->right:F

    iput p1, p6, Landroid/graphics/PointF;->x:F

    iget p1, p4, Landroid/graphics/RectF;->top:F

    iput p1, p6, Landroid/graphics/PointF;->y:F

    iput p5, p7, Landroid/graphics/PointF;->x:F

    iput p3, p7, Landroid/graphics/PointF;->y:F

    const/4 p1, 0x4

    return p1

    :pswitch_3
    iget p1, p4, Landroid/graphics/RectF;->left:F

    iput p1, p6, Landroid/graphics/PointF;->x:F

    iget p1, p4, Landroid/graphics/RectF;->top:F

    iput p1, p6, Landroid/graphics/PointF;->y:F

    iput p3, p7, Landroid/graphics/PointF;->x:F

    iput p3, p7, Landroid/graphics/PointF;->y:F

    const/4 p1, 0x7

    return p1

    :pswitch_4
    iget p1, p4, Landroid/graphics/RectF;->left:F

    iput p1, p6, Landroid/graphics/PointF;->x:F

    iget p1, p4, Landroid/graphics/RectF;->bottom:F

    iput p1, p6, Landroid/graphics/PointF;->y:F

    iput p5, p7, Landroid/graphics/PointF;->x:F

    iput p5, p7, Landroid/graphics/PointF;->y:F

    const/4 p1, 0x2

    return p1

    :pswitch_5
    iget p2, p4, Landroid/graphics/RectF;->right:F

    iput p2, p6, Landroid/graphics/PointF;->x:F

    iget p2, p4, Landroid/graphics/RectF;->top:F

    iput p2, p6, Landroid/graphics/PointF;->y:F

    iput p5, p7, Landroid/graphics/PointF;->x:F

    iput p5, p7, Landroid/graphics/PointF;->y:F

    return p1

    :pswitch_6
    iget p1, p4, Landroid/graphics/RectF;->right:F

    iput p1, p6, Landroid/graphics/PointF;->x:F

    iget p1, p4, Landroid/graphics/RectF;->bottom:F

    iput p1, p6, Landroid/graphics/PointF;->y:F

    iput p5, p7, Landroid/graphics/PointF;->x:F

    iput p3, p7, Landroid/graphics/PointF;->y:F

    const/4 p1, 0x0

    return p1

    :pswitch_7
    iget p2, p4, Landroid/graphics/RectF;->left:F

    iput p2, p6, Landroid/graphics/PointF;->x:F

    iget p2, p4, Landroid/graphics/RectF;->top:F

    iput p2, p6, Landroid/graphics/PointF;->y:F

    iput p5, p7, Landroid/graphics/PointF;->x:F

    iput p3, p7, Landroid/graphics/PointF;->y:F

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public i(Landroid/graphics/RectF;)I
    .locals 0

    const/4 p1, 0x4

    return p1
.end method

.method public k(Landroid/graphics/RectF;I)F
    .locals 0

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result p2

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    add-float/2addr p2, p1

    const/high16 p1, 0x40000000    # 2.0f

    mul-float p2, p2, p1

    return p2
.end method

.method public o(Lcom/daaw/un;)V
    .locals 0

    return-void
.end method
