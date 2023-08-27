.class public Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;
.super Ljava/lang/Object;
.source "VerticalScrollBoundsProvider.java"


# instance fields
.field private final mMaximumScrollY:F

.field private final mMinimumScrollY:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput p1, p0, Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;->mMinimumScrollY:F

    .line 13
    iput p2, p0, Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;->mMaximumScrollY:F

    return-void
.end method


# virtual methods
.method public getMaximumScrollY()F
    .locals 1

    .line 21
    iget v0, p0, Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;->mMaximumScrollY:F

    return v0
.end method

.method public getMinimumScrollY()F
    .locals 1

    .line 17
    iget v0, p0, Lxyz/danoz/recyclerviewfastscroller/calculation/VerticalScrollBoundsProvider;->mMinimumScrollY:F

    return v0
.end method
