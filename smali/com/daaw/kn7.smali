.class public final Lcom/daaw/kn7;
.super Lcom/daaw/fs7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/ln7;->N()Lcom/daaw/ln7;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/jn7;)V
    .locals 0

    invoke-static {}, Lcom/daaw/ln7;->N()Lcom/daaw/ln7;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method


# virtual methods
.method public final s(Lcom/daaw/on7;)Lcom/daaw/kn7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/ln7;

    invoke-static {v0, p1}, Lcom/daaw/ln7;->R(Lcom/daaw/ln7;Lcom/daaw/on7;)V

    return-object p0
.end method

.method public final t(I)Lcom/daaw/kn7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object p1, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast p1, Lcom/daaw/ln7;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/ln7;->Q(Lcom/daaw/ln7;I)V

    return-object p0
.end method
