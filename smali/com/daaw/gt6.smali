.class public final Lcom/daaw/gt6;
.super Lcom/daaw/fs7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/lt6;->M()Lcom/daaw/lt6;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/ft6;)V
    .locals 0

    invoke-static {}, Lcom/daaw/lt6;->M()Lcom/daaw/lt6;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method


# virtual methods
.method public final s(Ljava/lang/String;)Lcom/daaw/gt6;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/lt6;

    invoke-static {v0, p1}, Lcom/daaw/lt6;->N(Lcom/daaw/lt6;Ljava/lang/String;)V

    return-object p0
.end method

.method public final t(Lcom/daaw/dt6;)Lcom/daaw/gt6;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/lt6;

    invoke-virtual {p1}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/et6;

    invoke-static {v0, p1}, Lcom/daaw/lt6;->O(Lcom/daaw/lt6;Lcom/daaw/et6;)V

    return-object p0
.end method

.method public final u(I)Lcom/daaw/gt6;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object p1, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast p1, Lcom/daaw/lt6;

    const/4 v0, 0x2

    invoke-static {p1, v0}, Lcom/daaw/lt6;->P(Lcom/daaw/lt6;I)V

    return-object p0
.end method
