.class public final Lcom/daaw/c63;
.super Lcom/daaw/fs7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/o63;->M()Lcom/daaw/o63;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/h43;)V
    .locals 0

    invoke-static {}, Lcom/daaw/o63;->M()Lcom/daaw/o63;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method


# virtual methods
.method public final s(I)Lcom/daaw/c63;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/o63;

    invoke-static {v0, p1}, Lcom/daaw/o63;->T(Lcom/daaw/o63;I)V

    return-object p0
.end method

.method public final t(I)Lcom/daaw/c63;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/o63;

    invoke-static {v0, p1}, Lcom/daaw/o63;->S(Lcom/daaw/o63;I)V

    return-object p0
.end method
