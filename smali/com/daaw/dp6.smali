.class public final Lcom/daaw/dp6;
.super Lcom/daaw/fs7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/gp6;->N()Lcom/daaw/gp6;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/cp6;)V
    .locals 0

    invoke-static {}, Lcom/daaw/gp6;->N()Lcom/daaw/gp6;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method


# virtual methods
.method public final s()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/gp6;

    invoke-virtual {v0}, Lcom/daaw/gp6;->L()I

    move-result v0

    return v0
.end method

.method public final t(Lcom/daaw/ep6;)Lcom/daaw/dp6;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/gp6;

    invoke-virtual {p1}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/fp6;

    invoke-static {v0, p1}, Lcom/daaw/gp6;->P(Lcom/daaw/gp6;Lcom/daaw/fp6;)V

    return-object p0
.end method

.method public final u()Lcom/daaw/dp6;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/gp6;

    invoke-static {v0}, Lcom/daaw/gp6;->O(Lcom/daaw/gp6;)V

    return-object p0
.end method
