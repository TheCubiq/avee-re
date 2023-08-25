.class public Lcom/daaw/lu;
.super Landroidx/recyclerview/widget/RecyclerView$n;
.source ""

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$s;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/lu$b;,
        Lcom/daaw/lu$c;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:F

.field public i:F

.field public j:Landroid/graphics/drawable/BitmapDrawable;

.field public k:Landroid/graphics/Rect;

.field public l:Landroid/graphics/Rect;

.field public m:F

.field public n:I

.field public o:I

.field public p:Lcom/daaw/lu$c;

.field public q:Z

.field public r:Lcom/daaw/lu$b;

.field public s:Landroid/view/View;

.field public t:Landroid/graphics/Paint;

.field public u:Landroidx/recyclerview/widget/RecyclerView$t;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$n;-><init>()V

    const-string v0, "DragSortRecycler"

    iput-object v0, p0, Lcom/daaw/lu;->a:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/lu;->b:Z

    iput v0, p0, Lcom/daaw/lu;->c:I

    const/4 v1, -0x1

    iput v1, p0, Lcom/daaw/lu;->d:I

    const v2, 0x3dcccccd    # 0.1f

    iput v2, p0, Lcom/daaw/lu;->h:F

    const/high16 v2, 0x3f000000    # 0.5f

    iput v2, p0, Lcom/daaw/lu;->i:F

    iput v2, p0, Lcom/daaw/lu;->m:F

    iput v0, p0, Lcom/daaw/lu;->n:I

    iput v1, p0, Lcom/daaw/lu;->o:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/lu;->s:Landroid/view/View;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/daaw/lu;->t:Landroid/graphics/Paint;

    new-instance v0, Lcom/daaw/lu$a;

    invoke-direct {v0, p0}, Lcom/daaw/lu$a;-><init>(Lcom/daaw/lu;)V

    iput-object v0, p0, Lcom/daaw/lu;->u:Landroidx/recyclerview/widget/RecyclerView$t;

    return-void
.end method

.method public static synthetic k(Lcom/daaw/lu;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/lu;->o(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic l(Lcom/daaw/lu;I)I
    .locals 1

    iget v0, p0, Lcom/daaw/lu;->e:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/daaw/lu;->e:I

    return v0
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V
    .locals 5

    const-string v0, "onTouchEvent"

    invoke-virtual {p0, v0}, Lcom/daaw/lu;->o(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_5

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v3, 0x3

    if-ne v0, v3, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    float-to-int p2, p2

    iput p2, p0, Lcom/daaw/lu;->f:I

    iget-object v0, p0, Lcom/daaw/lu;->j:Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/lu;->l:Landroid/graphics/Rect;

    iget v2, p0, Lcom/daaw/lu;->g:I

    sub-int/2addr p2, v2

    iput p2, v0, Landroid/graphics/Rect;->top:I

    iget-object v0, p0, Lcom/daaw/lu;->k:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    neg-int v0, v0

    div-int/lit8 v0, v0, 0x2

    if-ge p2, v0, :cond_1

    iget-object p2, p0, Lcom/daaw/lu;->l:Landroid/graphics/Rect;

    iget-object v0, p0, Lcom/daaw/lu;->k:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    neg-int v0, v0

    div-int/lit8 v0, v0, 0x2

    iput v0, p2, Landroid/graphics/Rect;->top:I

    :cond_1
    iget-object p2, p0, Lcom/daaw/lu;->l:Landroid/graphics/Rect;

    iget v0, p2, Landroid/graphics/Rect;->top:I

    iget-object v2, p0, Lcom/daaw/lu;->k:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    add-int/2addr v0, v2

    iput v0, p2, Landroid/graphics/Rect;->bottom:I

    iget-object p2, p0, Lcom/daaw/lu;->j:Landroid/graphics/drawable/BitmapDrawable;

    iget-object v0, p0, Lcom/daaw/lu;->l:Landroid/graphics/Rect;

    invoke-virtual {p2, v0}, Landroid/graphics/drawable/BitmapDrawable;->setBounds(Landroid/graphics/Rect;)V

    :cond_2
    const/4 p2, 0x0

    iget v0, p0, Lcom/daaw/lu;->f:I

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/daaw/lu;->h:F

    const/high16 v4, 0x3f800000    # 1.0f

    sub-float v3, v4, v3

    mul-float v2, v2, v3

    cmpl-float v0, v0, v2

    if-lez v0, :cond_3

    iget p2, p0, Lcom/daaw/lu;->f:I

    int-to-float p2, p2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iget v2, p0, Lcom/daaw/lu;->h:F

    sub-float/2addr v4, v2

    mul-float v0, v0, v4

    :goto_0
    sub-float/2addr p2, v0

    goto :goto_1

    :cond_3
    iget v0, p0, Lcom/daaw/lu;->f:I

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/daaw/lu;->h:F

    mul-float v2, v2, v3

    cmpg-float v0, v0, v2

    if-gez v0, :cond_4

    iget p2, p0, Lcom/daaw/lu;->f:I

    int-to-float p2, p2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iget v2, p0, Lcom/daaw/lu;->h:F

    mul-float v0, v0, v2

    goto :goto_0

    :cond_4
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Scroll: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/lu;->o(Ljava/lang/String;)V

    iget v0, p0, Lcom/daaw/lu;->i:F

    mul-float p2, p2, v0

    float-to-int p2, p2

    invoke-virtual {p1, v1, p2}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    :goto_2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->u0()V

    return-void

    :cond_5
    :goto_3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p2

    const/4 v0, -0x1

    if-ne p2, v2, :cond_6

    iget p2, p0, Lcom/daaw/lu;->d:I

    if-eq p2, v0, :cond_6

    invoke-virtual {p0, p1}, Lcom/daaw/lu;->p(Landroidx/recyclerview/widget/RecyclerView;)I

    move-result p2

    iget-object v2, p0, Lcom/daaw/lu;->p:Lcom/daaw/lu$c;

    if-eqz v2, :cond_6

    iget v3, p0, Lcom/daaw/lu;->d:I

    invoke-interface {v2, v3, p2}, Lcom/daaw/lu$c;->a(II)V

    :cond_6
    const/4 p2, 0x0

    iput-object p2, p0, Lcom/daaw/lu;->s:Landroid/view/View;

    invoke-virtual {p0, v1}, Lcom/daaw/lu;->v(Z)V

    iput v0, p0, Lcom/daaw/lu;->d:I

    iput-object p2, p0, Lcom/daaw/lu;->j:Landroid/graphics/drawable/BitmapDrawable;

    goto :goto_2
.end method

.method public b(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z
    .locals 3

    const-string v0, "onInterceptTouchEvent"

    invoke-virtual {p0, v0}, Lcom/daaw/lu;->o(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/lu;->s:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-string v1, "Started Drag"

    invoke-virtual {p0, v1}, Lcom/daaw/lu;->o(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/daaw/lu;->v(Z)V

    invoke-virtual {p0, v0}, Lcom/daaw/lu;->n(Landroid/view/View;)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/lu;->j:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    float-to-int p2, p2

    iput p2, p0, Lcom/daaw/lu;->e:I

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v2

    sub-int/2addr p2, v2

    iput p2, p0, Lcom/daaw/lu;->g:I

    iget p2, p0, Lcom/daaw/lu;->e:I

    iput p2, p0, Lcom/daaw/lu;->f:I

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->f0(Landroid/view/View;)I

    move-result p1

    iput p1, p0, Lcom/daaw/lu;->d:I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "selectedDragItemPos = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lcom/daaw/lu;->d:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/lu;->o(Ljava/lang/String;)V

    return v1
.end method

.method public c(Z)V
    .locals 0

    return-void
.end method

.method public e(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V
    .locals 3

    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$n;->e(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V

    const-string p4, "getItemOffsets"

    invoke-virtual {p0, p4}, Lcom/daaw/lu;->o(Ljava/lang/String;)V

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "View top = "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p4}, Lcom/daaw/lu;->o(Ljava/lang/String;)V

    iget p4, p0, Lcom/daaw/lu;->d:I

    const/4 v0, 0x0

    const/4 v1, -0x1

    if-eq p4, v1, :cond_5

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->f0(Landroid/view/View;)I

    move-result p3

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "itemPos ="

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p4}, Lcom/daaw/lu;->o(Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lcom/daaw/lu;->m(I)Z

    move-result p4

    if-nez p4, :cond_0

    return-void

    :cond_0
    iget p4, p0, Lcom/daaw/lu;->d:I

    if-ne p3, p4, :cond_1

    const/4 p1, 0x4

    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_1

    :cond_1
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p4, p0, Lcom/daaw/lu;->l:Landroid/graphics/Rect;

    iget v0, p4, Landroid/graphics/Rect;->top:I

    invoke-virtual {p4}, Landroid/graphics/Rect;->height()I

    move-result p4

    div-int/lit8 p4, p4, 0x2

    add-int/2addr v0, p4

    int-to-float p4, v0

    iget v0, p0, Lcom/daaw/lu;->d:I

    const/high16 v1, 0x3f800000    # 1.0f

    if-le p3, v0, :cond_3

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v0

    int-to-float v0, v0

    cmpg-float v0, v0, p4

    if-gez v0, :cond_3

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v0

    int-to-float v0, v0

    sub-float v0, p4, v0

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v0, v2

    cmpl-float v2, v0, v1

    if-lez v2, :cond_2

    const/high16 v0, 0x3f800000    # 1.0f

    :cond_2
    iget-object v2, p0, Lcom/daaw/lu;->l:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    mul-float v2, v2, v0

    float-to-int v2, v2

    neg-int v2, v2

    iput v2, p1, Landroid/graphics/Rect;->top:I

    iget-object v2, p0, Lcom/daaw/lu;->l:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    mul-float v2, v2, v0

    float-to-int v0, v2

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    :cond_3
    iget v0, p0, Lcom/daaw/lu;->d:I

    if-ge p3, v0, :cond_6

    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result p3

    int-to-float p3, p3

    cmpl-float p3, p3, p4

    if-lez p3, :cond_6

    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result p3

    int-to-float p3, p3

    sub-float/2addr p3, p4

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p3, p2

    cmpl-float p2, p3, v1

    if-lez p2, :cond_4

    goto :goto_0

    :cond_4
    move v1, p3

    :goto_0
    iget-object p2, p0, Lcom/daaw/lu;->l:Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p2

    int-to-float p2, p2

    mul-float p2, p2, v1

    float-to-int p2, p2

    iput p2, p1, Landroid/graphics/Rect;->top:I

    iget-object p2, p0, Lcom/daaw/lu;->l:Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p2

    int-to-float p2, p2

    mul-float p2, p2, v1

    float-to-int p2, p2

    neg-int p2, p2

    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    goto :goto_1

    :cond_5
    iput v0, p1, Landroid/graphics/Rect;->top:I

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_6
    :goto_1
    return-void
.end method

.method public i(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V
    .locals 1

    iget-object p2, p0, Lcom/daaw/lu;->j:Landroid/graphics/drawable/BitmapDrawable;

    if-eqz p2, :cond_0

    const/high16 p3, 0x437f0000    # 255.0f

    iget v0, p0, Lcom/daaw/lu;->m:F

    mul-float v0, v0, p3

    float-to-int p3, v0

    invoke-virtual {p2, p3}, Landroid/graphics/drawable/BitmapDrawable;->setAlpha(I)V

    iget-object p2, p0, Lcom/daaw/lu;->t:Landroid/graphics/Paint;

    iget p3, p0, Lcom/daaw/lu;->n:I

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p2, p0, Lcom/daaw/lu;->l:Landroid/graphics/Rect;

    iget-object p3, p0, Lcom/daaw/lu;->t:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    iget-object p2, p0, Lcom/daaw/lu;->j:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/BitmapDrawable;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public j(Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/lu;->s:Landroid/view/View;

    return-void
.end method

.method public m(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final n(Landroid/view/View;)Landroid/graphics/drawable/BitmapDrawable;
    .locals 5

    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/daaw/lu;->k:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/daaw/lu;->k:Landroid/graphics/Rect;

    invoke-direct {v0, v1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iput-object v0, p0, Lcom/daaw/lu;->l:Landroid/graphics/Rect;

    iget-object v0, p0, Lcom/daaw/lu;->k:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/lu;->k:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Lcom/daaw/lu;->l:Landroid/graphics/Rect;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/BitmapDrawable;->setBounds(Landroid/graphics/Rect;)V

    return-object v1
.end method

.method public final o(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final p(Landroidx/recyclerview/widget/RecyclerView;)I
    .locals 9

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$o;->J()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/lu;->l:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->top:I

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v2, v1

    int-to-float v1, v2

    const v2, 0x7fffffff

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, 0x7fffffff

    :goto_0
    if-ge v3, v0, :cond_4

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object v6

    invoke-virtual {v6, v3}, Landroidx/recyclerview/widget/RecyclerView$o;->I(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v6}, Landroidx/recyclerview/widget/RecyclerView;->f0(Landroid/view/View;)I

    move-result v7

    iget v8, p0, Lcom/daaw/lu;->d:I

    if-ne v7, v8, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    move-result v8

    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    move-result v6

    div-int/lit8 v6, v6, 0x2

    add-int/2addr v8, v6

    int-to-float v6, v8

    cmpl-float v8, v1, v6

    if-lez v8, :cond_2

    if-le v7, v4, :cond_3

    move v4, v7

    goto :goto_1

    :cond_2
    cmpg-float v6, v1, v6

    if-gtz v6, :cond_3

    if-ge v7, v5, :cond_3

    move v5, v7

    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "above = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " below = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/lu;->o(Ljava/lang/String;)V

    iget p1, p0, Lcom/daaw/lu;->d:I

    if-eq v5, v2, :cond_6

    if-ge v5, p1, :cond_5

    add-int/lit8 v5, v5, 0x1

    :cond_5
    add-int/lit8 v5, v5, -0x1

    return v5

    :cond_6
    if-ge v4, p1, :cond_7

    add-int/lit8 v4, v4, 0x1

    :cond_7
    return v4
.end method

.method public q()Landroidx/recyclerview/widget/RecyclerView$t;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lu;->u:Landroidx/recyclerview/widget/RecyclerView$t;

    return-object v0
.end method

.method public r(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/lu;->i:F

    return-void
.end method

.method public s(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/lu;->h:F

    return-void
.end method

.method public t(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/lu;->m:F

    return-void
.end method

.method public u(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/lu;->n:I

    return-void
.end method

.method public final v(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/lu;->q:Z

    if-eq p1, v0, :cond_1

    iput-boolean p1, p0, Lcom/daaw/lu;->q:Z

    iget-object v0, p0, Lcom/daaw/lu;->r:Lcom/daaw/lu$b;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    invoke-interface {v0}, Lcom/daaw/lu$b;->b()V

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lcom/daaw/lu$b;->a()V

    :cond_1
    :goto_0
    return-void
.end method

.method public w(Lcom/daaw/lu$c;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/lu;->p:Lcom/daaw/lu$c;

    return-void
.end method

.method public x(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/lu;->o:I

    return-void
.end method
