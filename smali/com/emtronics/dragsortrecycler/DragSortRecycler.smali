.class public Lcom/emtronics/dragsortrecycler/DragSortRecycler;
.super Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;
.source "DragSortRecycler.java"

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/emtronics/dragsortrecycler/DragSortRecycler$OnDragStateChangedListener;,
        Lcom/emtronics/dragsortrecycler/DragSortRecycler$OnItemMovedListener;
    }
.end annotation


# instance fields
.field final DEBUG:Z

.field final TAG:Ljava/lang/String;

.field private autoScrollSpeed:F

.field private autoScrollWindow:F

.field bgColor:Landroid/graphics/Paint;

.field private dragHandleWidth:I

.field dragStateChangedListener:Lcom/emtronics/dragsortrecycler/DragSortRecycler$OnDragStateChangedListener;

.field draggingItemView:Landroid/view/View;

.field private fingerAnchorY:I

.field private fingerOffsetInViewY:I

.field private fingerY:I

.field private floatingItem:Landroid/graphics/drawable/BitmapDrawable;

.field private floatingItemAlpha:F

.field private floatingItemBgColor:I

.field private floatingItemBounds:Landroid/graphics/Rect;

.field private floatingItemStatingBounds:Landroid/graphics/Rect;

.field private isDragging:Z

.field moveInterface:Lcom/emtronics/dragsortrecycler/DragSortRecycler$OnItemMovedListener;

.field scrollListener:Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;

.field private selectedDragItemPos:I

.field private viewHandleId:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 37
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;-><init>()V

    const-string v0, "DragSortRecycler"

    .line 39
    iput-object v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->TAG:Ljava/lang/String;

    const/4 v0, 0x0

    .line 41
    iput-boolean v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->DEBUG:Z

    .line 43
    iput v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->dragHandleWidth:I

    const/4 v1, -0x1

    .line 45
    iput v1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->selectedDragItemPos:I

    const v2, 0x3dcccccd    # 0.1f

    .line 53
    iput v2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->autoScrollWindow:F

    const/high16 v2, 0x3f000000    # 0.5f

    .line 54
    iput v2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->autoScrollSpeed:F

    .line 61
    iput v2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemAlpha:F

    .line 62
    iput v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemBgColor:I

    .line 64
    iput v1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->viewHandleId:I

    const/4 v0, 0x0

    .line 267
    iput-object v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->draggingItemView:Landroid/view/View;

    .line 431
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->bgColor:Landroid/graphics/Paint;

    .line 442
    new-instance v0, Lcom/emtronics/dragsortrecycler/DragSortRecycler$1;

    invoke-direct {v0, p0}, Lcom/emtronics/dragsortrecycler/DragSortRecycler$1;-><init>(Lcom/emtronics/dragsortrecycler/DragSortRecycler;)V

    iput-object v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->scrollListener:Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;

    return-void
.end method

.method static synthetic access$000(Lcom/emtronics/dragsortrecycler/DragSortRecycler;Ljava/lang/String;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->debugLog(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$100(Lcom/emtronics/dragsortrecycler/DragSortRecycler;)I
    .locals 0

    .line 37
    iget p0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->fingerAnchorY:I

    return p0
.end method

.method static synthetic access$102(Lcom/emtronics/dragsortrecycler/DragSortRecycler;I)I
    .locals 0

    .line 37
    iput p1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->fingerAnchorY:I

    return p1
.end method

.method private createFloatingBitmap(Landroid/view/View;)Landroid/graphics/drawable/BitmapDrawable;
    .locals 5

    .line 469
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

    iput-object v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemStatingBounds:Landroid/graphics/Rect;

    .line 470
    new-instance v0, Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemStatingBounds:Landroid/graphics/Rect;

    invoke-direct {v0, v1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iput-object v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemBounds:Landroid/graphics/Rect;

    .line 472
    iget-object v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemStatingBounds:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    iget-object v1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemStatingBounds:Landroid/graphics/Rect;

    .line 473
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 472
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 474
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 475
    invoke-virtual {p1, v1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 477
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 478
    iget-object p1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemBounds:Landroid/graphics/Rect;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/BitmapDrawable;->setBounds(Landroid/graphics/Rect;)V

    return-object v1
.end method

.method private debugLog(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method private getNewPostion(Landroidx/recyclerview/widget/RecyclerView;)I
    .locals 9

    .line 219
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I

    move-result v0

    .line 221
    iget-object v1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemBounds:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    iget-object v2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemBounds:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    int-to-float v1, v1

    const v2, 0x7fffffff

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, 0x7fffffff

    :goto_0
    if-ge v3, v0, :cond_4

    .line 228
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v6

    invoke-virtual {v6, v3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 230
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    .line 233
    :cond_0
    invoke-virtual {p1, v6}, Landroidx/recyclerview/widget/RecyclerView;->getChildPosition(Landroid/view/View;)I

    move-result v7

    .line 235
    iget v8, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->selectedDragItemPos:I

    if-ne v7, v8, :cond_1

    goto :goto_1

    .line 238
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

    .line 250
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

    invoke-direct {p0, p1}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->debugLog(Ljava/lang/String;)V

    if-eq v5, v2, :cond_6

    .line 253
    iget p1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->selectedDragItemPos:I

    if-ge v5, p1, :cond_5

    add-int/lit8 v5, v5, 0x1

    :cond_5
    add-int/lit8 v5, v5, -0x1

    return v5

    .line 259
    :cond_6
    iget p1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->selectedDragItemPos:I

    if-ge v4, p1, :cond_7

    add-int/lit8 v4, v4, 0x1

    :cond_7
    return v4
.end method

.method private setIsDragging(Z)V
    .locals 1

    .line 408
    iget-boolean v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->isDragging:Z

    if-eq p1, v0, :cond_1

    .line 409
    iput-boolean p1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->isDragging:Z

    .line 410
    iget-object v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->dragStateChangedListener:Lcom/emtronics/dragsortrecycler/DragSortRecycler$OnDragStateChangedListener;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 412
    invoke-interface {v0}, Lcom/emtronics/dragsortrecycler/DragSortRecycler$OnDragStateChangedListener;->onDragStart()V

    goto :goto_0

    .line 414
    :cond_0
    invoke-interface {v0}, Lcom/emtronics/dragsortrecycler/DragSortRecycler$OnDragStateChangedListener;->onDragStop()V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public StartDragging(Landroid/view/View;)V
    .locals 0

    .line 270
    iput-object p1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->draggingItemView:Landroid/view/View;

    return-void
.end method

.method protected canDragOver(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 3

    .line 142
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;->getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V

    const-string p4, "getItemOffsets"

    .line 144
    invoke-direct {p0, p4}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->debugLog(Ljava/lang/String;)V

    .line 146
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "View top = "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p0, p4}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->debugLog(Ljava/lang/String;)V

    .line 147
    iget p4, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->selectedDragItemPos:I

    const/4 v0, 0x0

    const/4 v1, -0x1

    if-eq p4, v1, :cond_5

    .line 149
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildPosition(Landroid/view/View;)I

    move-result p3

    .line 150
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "itemPos ="

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p0, p4}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->debugLog(Ljava/lang/String;)V

    .line 152
    invoke-virtual {p0, p3}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->canDragOver(I)Z

    move-result p4

    if-nez p4, :cond_0

    return-void

    .line 159
    :cond_0
    iget p4, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->selectedDragItemPos:I

    if-ne p3, p4, :cond_1

    const/4 p1, 0x4

    .line 161
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_1

    .line 166
    :cond_1
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 169
    iget-object p4, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemBounds:Landroid/graphics/Rect;

    iget p4, p4, Landroid/graphics/Rect;->top:I

    iget-object v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemBounds:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    add-int/2addr p4, v0

    int-to-float p4, p4

    .line 175
    iget v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->selectedDragItemPos:I

    const/high16 v1, 0x3f800000    # 1.0f

    if-le p3, v0, :cond_3

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v0

    int-to-float v0, v0

    cmpg-float v0, v0, p4

    if-gez v0, :cond_3

    .line 177
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

    .line 182
    :cond_2
    iget-object v2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemBounds:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    mul-float v2, v2, v0

    float-to-int v2, v2

    neg-int v2, v2

    iput v2, p1, Landroid/graphics/Rect;->top:I

    .line 183
    iget-object v2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemBounds:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    mul-float v2, v2, v0

    float-to-int v0, v2

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 189
    :cond_3
    iget v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->selectedDragItemPos:I

    if-ge p3, v0, :cond_6

    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result p3

    int-to-float p3, p3

    cmpl-float p3, p3, p4

    if-lez p3, :cond_6

    .line 191
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

    .line 196
    :goto_0
    iget-object p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemBounds:Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p2

    int-to-float p2, p2

    mul-float p2, p2, v1

    float-to-int p2, p2

    iput p2, p1, Landroid/graphics/Rect;->top:I

    .line 197
    iget-object p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemBounds:Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p2

    int-to-float p2, p2

    mul-float p2, p2, v1

    float-to-int p2, p2

    neg-int p2, p2

    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    goto :goto_1

    .line 204
    :cond_5
    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 205
    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 207
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_6
    :goto_1
    return-void
.end method

.method public getScrollListener()Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->scrollListener:Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;

    return-object v0
.end method

.method public onDrawOver(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 1

    .line 434
    iget-object p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItem:Landroid/graphics/drawable/BitmapDrawable;

    if-eqz p2, :cond_0

    const/high16 p3, 0x437f0000    # 255.0f

    .line 435
    iget v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemAlpha:F

    mul-float v0, v0, p3

    float-to-int p3, v0

    invoke-virtual {p2, p3}, Landroid/graphics/drawable/BitmapDrawable;->setAlpha(I)V

    .line 436
    iget-object p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->bgColor:Landroid/graphics/Paint;

    iget p3, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemBgColor:I

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 437
    iget-object p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemBounds:Landroid/graphics/Rect;

    iget-object p3, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->bgColor:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 438
    iget-object p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItem:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/BitmapDrawable;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public onInterceptTouchEvent(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z
    .locals 3

    const-string v0, "onInterceptTouchEvent"

    .line 275
    invoke-direct {p0, v0}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->debugLog(Ljava/lang/String;)V

    .line 280
    iget-object v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->draggingItemView:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-string v1, "Started Drag"

    .line 333
    invoke-direct {p0, v1}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->debugLog(Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 335
    invoke-direct {p0, v1}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->setIsDragging(Z)V

    .line 337
    invoke-direct {p0, v0}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->createFloatingBitmap(Landroid/view/View;)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v2

    iput-object v2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItem:Landroid/graphics/drawable/BitmapDrawable;

    .line 339
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    float-to-int p2, p2

    iput p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->fingerAnchorY:I

    .line 340
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v2

    sub-int/2addr p2, v2

    iput p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->fingerOffsetInViewY:I

    .line 341
    iget p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->fingerAnchorY:I

    iput p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->fingerY:I

    .line 343
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->getChildPosition(Landroid/view/View;)I

    move-result p1

    iput p1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->selectedDragItemPos:I

    .line 344
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "selectedDragItemPos = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->selectedDragItemPos:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->debugLog(Ljava/lang/String;)V

    return v1
.end method

.method public onRequestDisallowInterceptTouchEvent(Z)V
    .locals 0

    return-void
.end method

.method public onTouchEvent(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V
    .locals 5

    const-string v0, "onTouchEvent"

    .line 354
    invoke-direct {p0, v0}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->debugLog(Ljava/lang/String;)V

    .line 356
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_5

    .line 357
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v3, 0x3

    if-ne v0, v3, :cond_0

    goto/16 :goto_2

    .line 375
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    float-to-int p2, p2

    iput p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->fingerY:I

    .line 377
    iget-object v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItem:Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_2

    .line 379
    iget-object v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemBounds:Landroid/graphics/Rect;

    iget v2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->fingerOffsetInViewY:I

    sub-int/2addr p2, v2

    iput p2, v0, Landroid/graphics/Rect;->top:I

    .line 381
    iget-object p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemBounds:Landroid/graphics/Rect;

    iget p2, p2, Landroid/graphics/Rect;->top:I

    iget-object v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemStatingBounds:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    neg-int v0, v0

    div-int/lit8 v0, v0, 0x2

    if-ge p2, v0, :cond_1

    .line 382
    iget-object p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemBounds:Landroid/graphics/Rect;

    iget-object v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemStatingBounds:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    neg-int v0, v0

    div-int/lit8 v0, v0, 0x2

    iput v0, p2, Landroid/graphics/Rect;->top:I

    .line 384
    :cond_1
    iget-object p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemBounds:Landroid/graphics/Rect;

    iget v0, p2, Landroid/graphics/Rect;->top:I

    iget-object v2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemStatingBounds:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    add-int/2addr v0, v2

    iput v0, p2, Landroid/graphics/Rect;->bottom:I

    .line 386
    iget-object p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItem:Landroid/graphics/drawable/BitmapDrawable;

    iget-object v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemBounds:Landroid/graphics/Rect;

    invoke-virtual {p2, v0}, Landroid/graphics/drawable/BitmapDrawable;->setBounds(Landroid/graphics/Rect;)V

    :cond_2
    const/4 p2, 0x0

    .line 391
    iget v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->fingerY:I

    int-to-float v0, v0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->autoScrollWindow:F

    const/high16 v4, 0x3f800000    # 1.0f

    sub-float v3, v4, v3

    mul-float v2, v2, v3

    cmpl-float v0, v0, v2

    if-lez v0, :cond_3

    .line 393
    iget p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->fingerY:I

    int-to-float p2, p2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iget v2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->autoScrollWindow:F

    sub-float/2addr v4, v2

    mul-float v0, v0, v4

    :goto_0
    sub-float/2addr p2, v0

    goto :goto_1

    .line 395
    :cond_3
    iget v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->fingerY:I

    int-to-float v0, v0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->autoScrollWindow:F

    mul-float v2, v2, v3

    cmpg-float v0, v0, v2

    if-gez v0, :cond_4

    .line 397
    iget p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->fingerY:I

    int-to-float p2, p2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iget v2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->autoScrollWindow:F

    mul-float v0, v0, v2

    goto :goto_0

    .line 399
    :cond_4
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Scroll: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->debugLog(Ljava/lang/String;)V

    .line 401
    iget v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->autoScrollSpeed:F

    mul-float p2, p2, v0

    float-to-int p2, p2

    .line 402
    invoke-virtual {p1, v1, p2}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 404
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->invalidateItemDecorations()V

    return-void

    .line 359
    :cond_5
    :goto_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p2

    const/4 v0, -0x1

    if-ne p2, v2, :cond_6

    iget p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->selectedDragItemPos:I

    if-eq p2, v0, :cond_6

    .line 361
    invoke-direct {p0, p1}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->getNewPostion(Landroidx/recyclerview/widget/RecyclerView;)I

    move-result p2

    .line 362
    iget-object v2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->moveInterface:Lcom/emtronics/dragsortrecycler/DragSortRecycler$OnItemMovedListener;

    if-eqz v2, :cond_6

    .line 363
    iget v3, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->selectedDragItemPos:I

    invoke-interface {v2, v3, p2}, Lcom/emtronics/dragsortrecycler/DragSortRecycler$OnItemMovedListener;->onItemMoved(II)V

    :cond_6
    const/4 p2, 0x0

    .line 366
    iput-object p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->draggingItemView:Landroid/view/View;

    .line 367
    invoke-direct {p0, v1}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->setIsDragging(Z)V

    .line 368
    iput v0, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->selectedDragItemPos:I

    .line 369
    iput-object p2, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItem:Landroid/graphics/drawable/BitmapDrawable;

    .line 370
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->invalidateItemDecorations()V

    return-void
.end method

.method public setAutoScrollSpeed(F)V
    .locals 0

    .line 137
    iput p1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->autoScrollSpeed:F

    return-void
.end method

.method public setAutoScrollWindow(F)V
    .locals 0

    .line 129
    iput p1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->autoScrollWindow:F

    return-void
.end method

.method public setFloatingAlpha(F)V
    .locals 0

    .line 116
    iput p1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemAlpha:F

    return-void
.end method

.method public setFloatingBgColor(I)V
    .locals 0

    .line 121
    iput p1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->floatingItemBgColor:I

    return-void
.end method

.method public setLeftDragArea(I)V
    .locals 0

    .line 111
    iput p1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->dragHandleWidth:I

    return-void
.end method

.method public setOnDragStateChangedListener(Lcom/emtronics/dragsortrecycler/DragSortRecycler$OnDragStateChangedListener;)V
    .locals 0

    .line 427
    iput-object p1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->dragStateChangedListener:Lcom/emtronics/dragsortrecycler/DragSortRecycler$OnDragStateChangedListener;

    return-void
.end method

.method public setOnItemMovedListener(Lcom/emtronics/dragsortrecycler/DragSortRecycler$OnItemMovedListener;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->moveInterface:Lcom/emtronics/dragsortrecycler/DragSortRecycler$OnItemMovedListener;

    return-void
.end method

.method public setViewHandleId(I)V
    .locals 0

    .line 106
    iput p1, p0, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->viewHandleId:I

    return-void
.end method
