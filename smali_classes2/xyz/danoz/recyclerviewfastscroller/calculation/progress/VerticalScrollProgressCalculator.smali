.class public abstract Lxyz/danoz/recyclerviewfastscroller/calculation/progress/VerticalScrollProgressCalculator;
.super Ljava/lang/Object;
.source "VerticalScrollProgressCalculator.java"

# interfaces
.implements Lxyz/danoz/recyclerviewfastscroller/calculation/progress/TouchableScrollProgressCalculator;


# instance fields
.field private final mScrollBoundsProvider:Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;


# direct methods
.method public constructor <init>(Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lxyz/danoz/recyclerviewfastscroller/calculation/progress/VerticalScrollProgressCalculator;->mScrollBoundsProvider:Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;

    return-void
.end method


# virtual methods
.method public calculateScrollProgress(Landroid/view/MotionEvent;)F
    .locals 1

    .line 21
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 23
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/calculation/progress/VerticalScrollProgressCalculator;->mScrollBoundsProvider:Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;

    invoke-virtual {v0}, Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;->getMinimumScrollY()F

    move-result v0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 25
    :cond_0
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/calculation/progress/VerticalScrollProgressCalculator;->mScrollBoundsProvider:Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;

    invoke-virtual {v0}, Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;->getMaximumScrollY()F

    move-result v0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_1

    const/high16 p1, 0x3f800000    # 1.0f

    return p1

    .line 28
    :cond_1
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/calculation/progress/VerticalScrollProgressCalculator;->mScrollBoundsProvider:Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;

    invoke-virtual {v0}, Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;->getMaximumScrollY()F

    move-result v0

    div-float/2addr p1, v0

    return p1
.end method
