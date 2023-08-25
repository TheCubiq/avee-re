.class public Lcom/daaw/te$k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/te;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "k"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:Landroid/view/View;

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/te$k;->e:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/PointF;)V
    .locals 1

    iget v0, p1, Landroid/graphics/PointF;->x:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/daaw/te$k;->c:I

    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, Lcom/daaw/te$k;->d:I

    iget p1, p0, Lcom/daaw/te$k;->g:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/te$k;->g:I

    iget v0, p0, Lcom/daaw/te$k;->f:I

    if-ne v0, p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/te$k;->b()V

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/te$k;->e:Landroid/view/View;

    iget v1, p0, Lcom/daaw/te$k;->a:I

    iget v2, p0, Lcom/daaw/te$k;->b:I

    iget v3, p0, Lcom/daaw/te$k;->c:I

    iget v4, p0, Lcom/daaw/te$k;->d:I

    invoke-static {v0, v1, v2, v3, v4}, Lcom/daaw/gu1;->f(Landroid/view/View;IIII)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/te$k;->f:I

    iput v0, p0, Lcom/daaw/te$k;->g:I

    return-void
.end method

.method public c(Landroid/graphics/PointF;)V
    .locals 1

    iget v0, p1, Landroid/graphics/PointF;->x:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/daaw/te$k;->a:I

    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, Lcom/daaw/te$k;->b:I

    iget p1, p0, Lcom/daaw/te$k;->f:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/te$k;->f:I

    iget v0, p0, Lcom/daaw/te$k;->g:I

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/te$k;->b()V

    :cond_0
    return-void
.end method
