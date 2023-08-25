.class public final Lcom/daaw/qx4;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(ZLjava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Lcom/daaw/ow4;

    invoke-direct {p0, p1}, Lcom/daaw/ow4;-><init>(Ljava/lang/String;)V

    throw p0
.end method
