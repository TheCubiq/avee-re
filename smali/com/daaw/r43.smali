.class public final Lcom/daaw/r43;
.super Lcom/daaw/fs7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/s43;->M()Lcom/daaw/s43;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/h43;)V
    .locals 0

    invoke-static {}, Lcom/daaw/s43;->M()Lcom/daaw/s43;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method


# virtual methods
.method public final s(Z)Lcom/daaw/r43;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/s43;

    invoke-static {v0, p1}, Lcom/daaw/s43;->O(Lcom/daaw/s43;Z)V

    return-object p0
.end method

.method public final t(I)Lcom/daaw/r43;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/s43;

    invoke-static {v0, p1}, Lcom/daaw/s43;->P(Lcom/daaw/s43;I)V

    return-object p0
.end method
