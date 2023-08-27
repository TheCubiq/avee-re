.class public Lxyz/danoz/recyclerviewfastscroller/calculation/position/VerticalScreenPositionCalculator;
.super Ljava/lang/Object;
.source "VerticalScreenPositionCalculator.java"


# instance fields
.field private final mVerticalScrollBoundsProvider:Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;


# direct methods
.method public constructor <init>(Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lxyz/danoz/recyclerviewfastscroller/calculation/position/VerticalScreenPositionCalculator;->mVerticalScrollBoundsProvider:Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;

    return-void
.end method


# virtual methods
.method public getYPositionFromScrollProgress(F)F
    .locals 2

    .line 17
    iget-object v0, p0, Lxyz/danoz/recyclerviewfastscroller/calculation/position/VerticalScreenPositionCalculator;->mVerticalScrollBoundsProvider:Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;

    .line 18
    invoke-virtual {v0}, Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;->getMinimumScrollY()F

    move-result v0

    iget-object v1, p0, Lxyz/danoz/recyclerviewfastscroller/calculation/position/VerticalScreenPositionCalculator;->mVerticalScrollBoundsProvider:Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;

    .line 20
    invoke-virtual {v1}, Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;->getMaximumScrollY()F

    move-result v1

    mul-float p1, p1, v1

    iget-object v1, p0, Lxyz/danoz/recyclerviewfastscroller/calculation/position/VerticalScreenPositionCalculator;->mVerticalScrollBoundsProvider:Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;

    .line 21
    invoke-virtual {v1}, Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;->getMaximumScrollY()F

    move-result v1

    .line 19
    invoke-static {p1, v1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    .line 17
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    return p1
.end method
