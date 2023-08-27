.class public abstract Lxyz/danoz/recyclerviewfastscroller/sectionindicator/AbsSectionIndicator;
.super Landroid/widget/FrameLayout;
.source "AbsSectionIndicator.java"

# interfaces
.implements Lxyz/danoz/recyclerviewfastscroller/sectionindicator/SectionIndicator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/widget/FrameLayout;",
        "Lxyz/danoz/recyclerviewfastscroller/sectionindicator/SectionIndicator<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final STYLEABLE:[I


# instance fields
.field private mDefaultSectionIndicatorAlphaAnimator:Lxyz/danoz/recyclerviewfastscroller/sectionindicator/animation/DefaultSectionIndicatorAlphaAnimator;

.field private mScreenPositionCalculator:Lxyz/danoz/recyclerviewfastscroller/calculation/position/VerticalScreenPositionCalculator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    sget-object v0, Lxyz/danoz/recyclerviewfastscroller/R$styleable;->AbsSectionIndicator:[I

    sput-object v0, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/AbsSectionIndicator;->STYLEABLE:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 27
    invoke-direct {p0, p1, v0}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/AbsSectionIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 31
    invoke-direct {p0, p1, p2, v0}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/AbsSectionIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 35
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    invoke-virtual {p0}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/AbsSectionIndicator;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p3

    sget-object v0, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/AbsSectionIndicator;->STYLEABLE:[I

    const/4 v1, 0x0

    invoke-virtual {p3, p2, v0, v1, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 38
    :try_start_0
    sget p3, Lxyz/danoz/recyclerviewfastscroller/R$styleable;->AbsSectionIndicator_rfs_section_indicator_layout:I

    invoke-virtual {p0}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/AbsSectionIndicator;->getDefaultLayoutId()I

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    const-string v0, "layout_inflater"

    .line 39
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    const/4 v0, 0x1

    .line 40
    invoke-virtual {p1, p3, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 45
    new-instance p1, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/animation/DefaultSectionIndicatorAlphaAnimator;

    invoke-direct {p1, p0}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/animation/DefaultSectionIndicatorAlphaAnimator;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/AbsSectionIndicator;->mDefaultSectionIndicatorAlphaAnimator:Lxyz/danoz/recyclerviewfastscroller/sectionindicator/animation/DefaultSectionIndicatorAlphaAnimator;

    return-void

    :catchall_0
    move-exception p1

    .line 42
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
.end method


# virtual methods
.method public animateAlpha(F)V
    .locals 1

    .line 83
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/AbsSectionIndicator;->mDefaultSectionIndicatorAlphaAnimator:Lxyz/danoz/recyclerviewfastscroller/sectionindicator/animation/DefaultSectionIndicatorAlphaAnimator;

    invoke-virtual {v0, p1}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/animation/DefaultSectionIndicatorAlphaAnimator;->animateTo(F)V

    return-void
.end method

.method protected abstract applyCustomBackgroundColorAttribute(I)V
.end method

.method protected abstract getDefaultBackgroundColor()I
.end method

.method protected abstract getDefaultLayoutId()I
.end method

.method public onLayout(ZIIII)V
    .locals 0

    .line 68
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 69
    iget-object p1, p0, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/AbsSectionIndicator;->mScreenPositionCalculator:Lxyz/danoz/recyclerviewfastscroller/calculation/position/VerticalScreenPositionCalculator;

    if-nez p1, :cond_0

    .line 70
    new-instance p1, Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;

    const/4 p2, 0x0

    .line 71
    invoke-virtual {p0}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/AbsSectionIndicator;->getParent()Landroid/view/ViewParent;

    move-result-object p3

    check-cast p3, Landroid/view/ViewGroup;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getHeight()I

    move-result p3

    invoke-virtual {p0}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/AbsSectionIndicator;->getHeight()I

    move-result p4

    sub-int/2addr p3, p4

    int-to-float p3, p3

    invoke-direct {p1, p2, p3}, Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;-><init>(FF)V

    .line 72
    new-instance p2, Lxyz/danoz/recyclerviewfastscroller/calculation/position/VerticalScreenPositionCalculator;

    invoke-direct {p2, p1}, Lxyz/danoz/recyclerviewfastscroller/calculation/position/VerticalScreenPositionCalculator;-><init>(Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;)V

    iput-object p2, p0, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/AbsSectionIndicator;->mScreenPositionCalculator:Lxyz/danoz/recyclerviewfastscroller/calculation/position/VerticalScreenPositionCalculator;

    :cond_0
    return-void
.end method

.method public setProgress(F)V
    .locals 1

    .line 78
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/AbsSectionIndicator;->mScreenPositionCalculator:Lxyz/danoz/recyclerviewfastscroller/calculation/position/VerticalScreenPositionCalculator;

    invoke-virtual {v0, p1}, Lxyz/danoz/recyclerviewfastscroller/calculation/position/VerticalScreenPositionCalculator;->getYPositionFromScrollProgress(F)F

    move-result p1

    invoke-virtual {p0, p1}, Lxyz/danoz/recyclerviewfastscroller/sectionindicator/AbsSectionIndicator;->setY(F)V

    return-void
.end method

.method public abstract setSection(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method
