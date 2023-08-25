.class public final Lcom/daaw/yp8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/l5;


# instance fields
.field public final a:Lcom/daaw/l5;

.field public final b:Lcom/daaw/l5;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Lcom/daaw/x70;->f()Lcom/daaw/x70;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lcom/daaw/pm8;

    invoke-direct {v1, p1, v0}, Lcom/daaw/pm8;-><init>(Landroid/content/Context;Lcom/daaw/x70;)V

    iput-object v1, p0, Lcom/daaw/yp8;->a:Lcom/daaw/l5;

    invoke-static {p1}, Lcom/daaw/tc8;->d(Landroid/content/Context;)Lcom/daaw/l5;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/yp8;->b:Lcom/daaw/l5;

    return-void
.end method

.method public static synthetic b(Lcom/daaw/yp8;Lcom/daaw/rj1;)Lcom/daaw/rj1;
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/rj1;->n()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p1}, Lcom/daaw/rj1;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/rj1;->j()Ljava/lang/Exception;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/l3;

    if-eqz v1, :cond_5

    check-cast v0, Lcom/daaw/l3;

    invoke-virtual {v0}, Lcom/daaw/l3;->b()I

    move-result v0

    const v1, 0xa7f9

    if-eq v0, v1, :cond_4

    const v1, 0xa7fa

    if-eq v0, v1, :cond_4

    const v1, 0xa7fb

    if-eq v0, v1, :cond_4

    const/16 v1, 0x11

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const p0, 0xa7f8

    if-ne v0, p0, :cond_2

    new-instance p0, Ljava/lang/Exception;

    const-string p1, "Failed to get app set ID due to an internal error. Please try again later."

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/daaw/dk1;->d(Ljava/lang/Exception;)Lcom/daaw/rj1;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/16 p0, 0xf

    if-eq v0, p0, :cond_3

    goto :goto_1

    :cond_3
    new-instance p0, Ljava/lang/Exception;

    const-string p1, "The operation to get app set ID timed out. Please try again later."

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/daaw/dk1;->d(Ljava/lang/Exception;)Lcom/daaw/rj1;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_0
    iget-object p0, p0, Lcom/daaw/yp8;->b:Lcom/daaw/l5;

    invoke-interface {p0}, Lcom/daaw/l5;->a()Lcom/daaw/rj1;

    move-result-object p1

    :cond_5
    :goto_1
    return-object p1
.end method


# virtual methods
.method public final a()Lcom/daaw/rj1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/rj1<",
            "Lcom/daaw/m5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/yp8;->a:Lcom/daaw/l5;

    invoke-interface {v0}, Lcom/daaw/l5;->a()Lcom/daaw/rj1;

    move-result-object v0

    new-instance v1, Lcom/daaw/no8;

    invoke-direct {v1, p0}, Lcom/daaw/no8;-><init>(Lcom/daaw/yp8;)V

    invoke-virtual {v0, v1}, Lcom/daaw/rj1;->h(Lcom/daaw/hl;)Lcom/daaw/rj1;

    move-result-object v0

    return-object v0
.end method
