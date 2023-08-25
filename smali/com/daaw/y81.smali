.class public abstract Lcom/daaw/y81;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/content/Context;Lcom/daaw/ly;Lcom/daaw/s81;Lcom/daaw/cg;)Lcom/daaw/py1;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    new-instance p3, Lcom/daaw/ph0;

    invoke-direct {p3, p0, p1, p2}, Lcom/daaw/ph0;-><init>(Landroid/content/Context;Lcom/daaw/ly;Lcom/daaw/s81;)V

    return-object p3

    :cond_0
    new-instance v0, Lcom/daaw/v1;

    invoke-direct {v0, p0, p1, p3, p2}, Lcom/daaw/v1;-><init>(Landroid/content/Context;Lcom/daaw/ly;Lcom/daaw/cg;Lcom/daaw/s81;)V

    return-object v0
.end method
