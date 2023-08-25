.class public final synthetic Lcom/daaw/mv6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/cu0;


# instance fields
.field public final synthetic a:Lcom/daaw/nv6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/nv6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mv6;->a:Lcom/daaw/nv6;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/rj1;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/mv6;->a:Lcom/daaw/nv6;

    invoke-virtual {p1}, Lcom/daaw/rj1;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/daaw/c57;->cancel(Z)Z

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/rj1;->n()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/daaw/rj1;->k()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/nv6;->h(Ljava/lang/Object;)Z

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/rj1;->j()Ljava/lang/Exception;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {v0, p1}, Lcom/daaw/nv6;->i(Ljava/lang/Throwable;)Z

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method
