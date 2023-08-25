.class public final Lcom/daaw/ak7;
.super Lcom/daaw/fs7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/bk7;->N()Lcom/daaw/bk7;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/zj7;)V
    .locals 0

    invoke-static {}, Lcom/daaw/bk7;->N()Lcom/daaw/bk7;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method


# virtual methods
.method public final s(I)Lcom/daaw/ak7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object p1, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast p1, Lcom/daaw/bk7;

    const/16 v0, 0x40

    invoke-static {p1, v0}, Lcom/daaw/bk7;->P(Lcom/daaw/bk7;I)V

    return-object p0
.end method
