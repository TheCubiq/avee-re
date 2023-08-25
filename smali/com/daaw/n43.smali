.class public final Lcom/daaw/n43;
.super Lcom/daaw/fs7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/o43;->M()Lcom/daaw/o43;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/h43;)V
    .locals 0

    invoke-static {}, Lcom/daaw/o43;->M()Lcom/daaw/o43;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method


# virtual methods
.method public final s(Lcom/daaw/r43;)Lcom/daaw/n43;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/o43;

    invoke-virtual {p1}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/s43;

    invoke-static {v0, p1}, Lcom/daaw/o43;->N(Lcom/daaw/o43;Lcom/daaw/s43;)V

    return-object p0
.end method

.method public final t(Lcom/daaw/s43;)Lcom/daaw/n43;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/o43;

    invoke-static {v0, p1}, Lcom/daaw/o43;->N(Lcom/daaw/o43;Lcom/daaw/s43;)V

    return-object p0
.end method

.method public final u(Lcom/daaw/t43;)Lcom/daaw/n43;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/o43;

    invoke-virtual {p1}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/u43;

    invoke-static {v0, p1}, Lcom/daaw/o43;->O(Lcom/daaw/o43;Lcom/daaw/u43;)V

    return-object p0
.end method

.method public final v(I)Lcom/daaw/n43;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object p1, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast p1, Lcom/daaw/o43;

    const/4 v0, 0x2

    invoke-static {p1, v0}, Lcom/daaw/o43;->P(Lcom/daaw/o43;I)V

    return-object p0
.end method
