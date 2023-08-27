.class public Lcom/daaw/avee/Common/Vec4f;
.super Ljava/lang/Object;
.source "Vec4f.java"


# instance fields
.field public x1:F

.field public x2:F

.field public y1:F

.field public y2:F


# direct methods
.method public constructor <init>(FFFF)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput p1, p0, Lcom/daaw/avee/Common/Vec4f;->x1:F

    .line 17
    iput p2, p0, Lcom/daaw/avee/Common/Vec4f;->y1:F

    .line 18
    iput p3, p0, Lcom/daaw/avee/Common/Vec4f;->x2:F

    .line 19
    iput p4, p0, Lcom/daaw/avee/Common/Vec4f;->y2:F

    return-void
.end method
