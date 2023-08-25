.class public final Lcom/daaw/kl7;
.super Lcom/daaw/fs7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/ll7;->N()Lcom/daaw/ll7;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/jl7;)V
    .locals 0

    invoke-static {}, Lcom/daaw/ll7;->N()Lcom/daaw/ll7;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method


# virtual methods
.method public final s(Lcom/daaw/yq7;)Lcom/daaw/kl7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/ll7;

    invoke-static {v0, p1}, Lcom/daaw/ll7;->U(Lcom/daaw/ll7;Lcom/daaw/yq7;)V

    return-object p0
.end method

.method public final t(Lcom/daaw/ul7;)Lcom/daaw/kl7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/ll7;

    invoke-static {v0, p1}, Lcom/daaw/ll7;->T(Lcom/daaw/ll7;Lcom/daaw/ul7;)V

    return-object p0
.end method

.method public final u(I)Lcom/daaw/kl7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object p1, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast p1, Lcom/daaw/ll7;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/ll7;->S(Lcom/daaw/ll7;I)V

    return-object p0
.end method
