.class public Lcom/daaw/avee/comp/EqualizerUI/PointCurve$Point;
.super Ljava/lang/Object;
.source "PointCurve.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/EqualizerUI/PointCurve;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Point"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/EqualizerUI/PointCurve;

.field public x:F

.field public y:F


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/EqualizerUI/PointCurve;FF)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/PointCurve$Point;->this$0:Lcom/daaw/avee/comp/EqualizerUI/PointCurve;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput p2, p0, Lcom/daaw/avee/comp/EqualizerUI/PointCurve$Point;->x:F

    .line 19
    iput p3, p0, Lcom/daaw/avee/comp/EqualizerUI/PointCurve$Point;->y:F

    return-void
.end method
