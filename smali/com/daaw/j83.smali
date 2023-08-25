.class public final Lcom/daaw/j83;
.super Lcom/daaw/fs7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/k83;->M()Lcom/daaw/k83;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/h43;)V
    .locals 0

    invoke-static {}, Lcom/daaw/k83;->M()Lcom/daaw/k83;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method


# virtual methods
.method public final s(Z)Lcom/daaw/j83;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/k83;

    invoke-static {v0, p1}, Lcom/daaw/k83;->N(Lcom/daaw/k83;Z)V

    return-object p0
.end method

.method public final t(I)Lcom/daaw/j83;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/k83;

    invoke-static {v0, p1}, Lcom/daaw/k83;->O(Lcom/daaw/k83;I)V

    return-object p0
.end method

.method public final u()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/k83;

    invoke-virtual {v0}, Lcom/daaw/k83;->P()Z

    move-result v0

    return v0
.end method
