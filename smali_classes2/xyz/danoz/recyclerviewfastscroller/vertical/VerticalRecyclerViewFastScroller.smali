.class public Lxyz/danoz/recyclerviewfastscroller/vertical/VerticalRecyclerViewFastScroller;
.super Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;
.source "VerticalRecyclerViewFastScroller.java"

# interfaces
.implements Lxyz/danoz/recyclerviewfastscroller/RecyclerViewScroller;


# instance fields
.field private mScreenPositionCalculator:Lxyz/danoz/recyclerviewfastscroller/calculation/position/VerticalScreenPositionCalculator;

.field private mScrollProgressCalculator:Lxyz/danoz/recyclerviewfastscroller/calculation/progress/VerticalScrollProgressCalculator;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 29
    invoke-direct {p0, p1, v0}, Lxyz/danoz/recyclerviewfastscroller/vertical/VerticalRecyclerViewFastScroller;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 33
    invoke-direct {p0, p1, p2, v0}, Lxyz/danoz/recyclerviewfastscroller/vertical/VerticalRecyclerViewFastScroller;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2, p3}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method protected getLayoutResourceId()I
    .locals 1

    .line 42
    sget v0, Lxyz/danoz/recyclerviewfastscroller/R$layout;->vertical_recycler_fast_scroller_layout:I

    return v0
.end method

.method protected getScrollProgressCalculator()Lxyz/danoz/recyclerviewfastscroller/calculation/progress/TouchableScrollProgressCalculator;
    .locals 1

    .line 48
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/vertical/VerticalRecyclerViewFastScroller;->mScrollProgressCalculator:Lxyz/danoz/recyclerviewfastscroller/calculation/progress/VerticalScrollProgressCalculator;

    return-object v0
.end method

.method public moveHandleToPosition(F)V
    .locals 2

    .line 53
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/vertical/VerticalRecyclerViewFastScroller;->mScreenPositionCalculator:Lxyz/danoz/recyclerviewfastscroller/calculation/position/VerticalScreenPositionCalculator;

    if-nez v0, :cond_0

    return-void

    .line 56
    :cond_0
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/vertical/VerticalRecyclerViewFastScroller;->mHandle:Landroid/view/View;

    iget-object v1, p0, Lxyz/danoz/recyclerviewfastscroller/vertical/VerticalRecyclerViewFastScroller;->mScreenPositionCalculator:Lxyz/danoz/recyclerviewfastscroller/calculation/position/VerticalScreenPositionCalculator;

    invoke-virtual {v1, p1}, Lxyz/danoz/recyclerviewfastscroller/calculation/position/VerticalScreenPositionCalculator;->getYPositionFromScrollProgress(F)F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setY(F)V

    return-void
.end method

.method protected onCreateScrollProgressCalculator()V
    .locals 4

    .line 60
    new-instance v0, Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;

    iget-object v1, p0, Lxyz/danoz/recyclerviewfastscroller/vertical/VerticalRecyclerViewFastScroller;->mBar:Landroid/view/View;

    .line 61
    invoke-virtual {v1}, Landroid/view/View;->getY()F

    move-result v1

    iget-object v2, p0, Lxyz/danoz/recyclerviewfastscroller/vertical/VerticalRecyclerViewFastScroller;->mBar:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getY()F

    move-result v2

    iget-object v3, p0, Lxyz/danoz/recyclerviewfastscroller/vertical/VerticalRecyclerViewFastScroller;->mBar:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v2, v3

    iget-object v3, p0, Lxyz/danoz/recyclerviewfastscroller/vertical/VerticalRecyclerViewFastScroller;->mHandle:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    invoke-direct {v0, v1, v2}, Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;-><init>(FF)V

    .line 62
    new-instance v1, Lxyz/danoz/recyclerviewfastscroller/calculation/progress/VerticalLinearLayoutManagerScrollProgressCalculator;

    invoke-direct {v1, v0}, Lxyz/danoz/recyclerviewfastscroller/calculation/progress/VerticalLinearLayoutManagerScrollProgressCalculator;-><init>(Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;)V

    iput-object v1, p0, Lxyz/danoz/recyclerviewfastscroller/vertical/VerticalRecyclerViewFastScroller;->mScrollProgressCalculator:Lxyz/danoz/recyclerviewfastscroller/calculation/progress/VerticalScrollProgressCalculator;

    .line 63
    new-instance v1, Lxyz/danoz/recyclerviewfastscroller/calculation/position/VerticalScreenPositionCalculator;

    invoke-direct {v1, v0}, Lxyz/danoz/recyclerviewfastscroller/calculation/position/VerticalScreenPositionCalculator;-><init>(Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;)V

    iput-object v1, p0, Lxyz/danoz/recyclerviewfastscroller/vertical/VerticalRecyclerViewFastScroller;->mScreenPositionCalculator:Lxyz/danoz/recyclerviewfastscroller/calculation/position/VerticalScreenPositionCalculator;

    return-void
.end method
