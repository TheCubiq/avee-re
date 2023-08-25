.class public final Lcom/daaw/ch2;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/content/Context;Lcom/daaw/eg2;)Lcom/daaw/tf2;
    .locals 3

    new-instance p1, Lcom/daaw/fg2;

    new-instance v0, Lcom/daaw/wg2;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/wg2;-><init>(Lcom/daaw/vg2;Ljavax/net/ssl/SSLSocketFactory;)V

    invoke-direct {p1, v0}, Lcom/daaw/fg2;-><init>(Lcom/daaw/eg2;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    new-instance v0, Lcom/daaw/bh2;

    invoke-direct {v0, p0}, Lcom/daaw/bh2;-><init>(Landroid/content/Context;)V

    new-instance p0, Lcom/daaw/tf2;

    new-instance v1, Lcom/daaw/rg2;

    const/high16 v2, 0x500000

    invoke-direct {v1, v0, v2}, Lcom/daaw/rg2;-><init>(Lcom/daaw/lg2;I)V

    const/4 v0, 0x4

    invoke-direct {p0, v1, p1, v0}, Lcom/daaw/tf2;-><init>(Lcom/daaw/we2;Lcom/daaw/ff2;I)V

    invoke-virtual {p0}, Lcom/daaw/tf2;->d()V

    return-object p0
.end method
