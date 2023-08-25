.class public final Lcom/daaw/nz1;
.super Lcom/daaw/k3$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/k3$a<",
        "Lcom/daaw/wc1;",
        "Lcom/daaw/xc1;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/k3$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic b(Landroid/content/Context;Landroid/os/Looper;Lcom/daaw/xf;Ljava/lang/Object;Lcom/daaw/y70$a;Lcom/daaw/y70$b;)Lcom/daaw/k3$f;
    .locals 8

    check-cast p4, Lcom/daaw/xc1;

    new-instance p4, Lcom/daaw/wc1;

    invoke-static {p3}, Lcom/daaw/wc1;->L(Lcom/daaw/xf;)Landroid/os/Bundle;

    move-result-object v5

    const/4 v3, 0x1

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/daaw/wc1;-><init>(Landroid/content/Context;Landroid/os/Looper;ZLcom/daaw/xf;Landroid/os/Bundle;Lcom/daaw/y70$a;Lcom/daaw/y70$b;)V

    return-object p4
.end method
