.class public final Lcom/daaw/px8;
.super Lcom/daaw/cp8;
.source ""


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;Lcom/daaw/ep8;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/cp8;-><init>(Ljava/lang/Throwable;Lcom/daaw/ep8;)V

    invoke-static {p3}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/view/Surface;->isValid()Z

    :cond_0
    return-void
.end method
