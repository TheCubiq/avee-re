.class public final Lcom/daaw/cj7;
.super Lcom/daaw/fs7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/dj7;->N()Lcom/daaw/dj7;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/bj7;)V
    .locals 0

    invoke-static {}, Lcom/daaw/dj7;->N()Lcom/daaw/dj7;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method


# virtual methods
.method public final s(I)Lcom/daaw/cj7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/dj7;

    invoke-static {v0, p1}, Lcom/daaw/dj7;->R(Lcom/daaw/dj7;I)V

    return-object p0
.end method

.method public final t(Lcom/daaw/gj7;)Lcom/daaw/cj7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/dj7;

    invoke-static {v0, p1}, Lcom/daaw/dj7;->Q(Lcom/daaw/dj7;Lcom/daaw/gj7;)V

    return-object p0
.end method
