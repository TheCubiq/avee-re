.class public final Lcom/daaw/uj7;
.super Lcom/daaw/fs7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/vj7;->N()Lcom/daaw/vj7;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/tj7;)V
    .locals 0

    invoke-static {}, Lcom/daaw/vj7;->N()Lcom/daaw/vj7;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method


# virtual methods
.method public final s(I)Lcom/daaw/uj7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/vj7;

    invoke-static {v0, p1}, Lcom/daaw/vj7;->P(Lcom/daaw/vj7;I)V

    return-object p0
.end method
