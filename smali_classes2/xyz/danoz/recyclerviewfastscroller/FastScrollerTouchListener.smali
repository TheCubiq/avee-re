.class Lxyz/danoz/recyclerviewfastscroller/FastScrollerTouchListener;
.super Ljava/lang/Object;
.source "FastScrollerTouchListener.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field private final mFastScroller:Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;


# direct methods
.method public constructor <init>(Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lxyz/danoz/recyclerviewfastscroller/FastScrollerTouchListener;->mFastScroller:Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;

    return-void
.end method

.method private showOrHideIndicator(Lxyz/danoz/recyclerviewfastscroller/sectionindicator/SectionIndicator;Landroid/view/MotionEvent;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 42
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p2

    if-eqz p2, :cond_2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 47
    invoke-interface {p1, p2}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/SectionIndicator;->animateAlpha(F)V

    :goto_0
    return-void

    :cond_2
    const/high16 p2, 0x3f800000    # 1.0f

    .line 44
    invoke-interface {p1, p2}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/SectionIndicator;->animateAlpha(F)V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 27
    iget-object p1, p0, Lxyz/danoz/recyclerviewfastscroller/FastScrollerTouchListener;->mFastScroller:Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;

    invoke-virtual {p1}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->getSectionIndicator()Lxyz/danoz/recyclerviewfastscroller/sectionindicator/SectionIndicator;

    move-result-object p1

    .line 28
    invoke-direct {p0, p1, p2}, Lxyz/danoz/recyclerviewfastscroller/FastScrollerTouchListener;->showOrHideIndicator(Lxyz/danoz/recyclerviewfastscroller/sectionindicator/SectionIndicator;Landroid/view/MotionEvent;)V

    .line 30
    iget-object p1, p0, Lxyz/danoz/recyclerviewfastscroller/FastScrollerTouchListener;->mFastScroller:Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;

    invoke-virtual {p1, p2}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->getScrollProgress(Landroid/view/MotionEvent;)F

    move-result p1

    .line 32
    iget-object p2, p0, Lxyz/danoz/recyclerviewfastscroller/FastScrollerTouchListener;->mFastScroller:Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;

    const/4 v0, 0x1

    invoke-virtual {p2, p1, v0}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->scrollTo(FZ)V

    .line 33
    iget-object p2, p0, Lxyz/danoz/recyclerviewfastscroller/FastScrollerTouchListener;->mFastScroller:Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;

    invoke-virtual {p2, p1}, Lxyz/danoz/recyclerviewfastscroller/AbsRecyclerViewFastScroller;->moveHandleToPosition(F)V

    return v0
.end method
