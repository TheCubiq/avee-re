.class public Lcom/daaw/kv1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ljava/lang/Object;ILcom/daaw/ne0;)V
    .locals 0

    return-void
.end method

.method public static b(Ljava/lang/Object;ILcom/daaw/ne0;)Lcom/daaw/ne0;
    .locals 0

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lcom/daaw/ne0;->d(I)Z

    move-result p0

    if-eqz p0, :cond_0

    return-object p2

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
