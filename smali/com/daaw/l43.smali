.class public final Lcom/daaw/l43;
.super Lcom/daaw/fs7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/m43;->L()Lcom/daaw/m43;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/h43;)V
    .locals 0

    invoke-static {}, Lcom/daaw/m43;->L()Lcom/daaw/m43;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method


# virtual methods
.method public final s(Lcom/daaw/k43;)Lcom/daaw/l43;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/m43;

    invoke-static {v0, p1}, Lcom/daaw/m43;->O(Lcom/daaw/m43;Lcom/daaw/k43;)V

    return-object p0
.end method

.method public final t(Lcom/daaw/d53;)Lcom/daaw/l43;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/m43;

    invoke-virtual {p1}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/j53;

    invoke-static {v0, p1}, Lcom/daaw/m43;->P(Lcom/daaw/m43;Lcom/daaw/j53;)V

    return-object p0
.end method
