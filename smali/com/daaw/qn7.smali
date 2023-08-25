.class public final Lcom/daaw/qn7;
.super Lcom/daaw/fs7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/rn7;->N()Lcom/daaw/rn7;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/pn7;)V
    .locals 0

    invoke-static {}, Lcom/daaw/rn7;->N()Lcom/daaw/rn7;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method


# virtual methods
.method public final s(Lcom/daaw/xn7;)Lcom/daaw/qn7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/rn7;

    invoke-static {v0, p1}, Lcom/daaw/rn7;->R(Lcom/daaw/rn7;Lcom/daaw/xn7;)V

    return-object p0
.end method

.method public final t(I)Lcom/daaw/qn7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object p1, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast p1, Lcom/daaw/rn7;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/rn7;->Q(Lcom/daaw/rn7;I)V

    return-object p0
.end method
