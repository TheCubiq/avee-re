.class public final Lcom/daaw/qi7;
.super Lcom/daaw/fs7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/ri7;->N()Lcom/daaw/ri7;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/pi7;)V
    .locals 0

    invoke-static {}, Lcom/daaw/ri7;->N()Lcom/daaw/ri7;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method


# virtual methods
.method public final s(Lcom/daaw/yq7;)Lcom/daaw/qi7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/ri7;

    invoke-static {v0, p1}, Lcom/daaw/ri7;->U(Lcom/daaw/ri7;Lcom/daaw/yq7;)V

    return-object p0
.end method

.method public final t(Lcom/daaw/xi7;)Lcom/daaw/qi7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/ri7;

    invoke-static {v0, p1}, Lcom/daaw/ri7;->T(Lcom/daaw/ri7;Lcom/daaw/xi7;)V

    return-object p0
.end method

.method public final u(I)Lcom/daaw/qi7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object p1, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast p1, Lcom/daaw/ri7;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/ri7;->S(Lcom/daaw/ri7;I)V

    return-object p0
.end method
