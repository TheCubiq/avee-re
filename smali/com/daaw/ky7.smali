.class public final Lcom/daaw/ky7;
.super Lcom/daaw/fs7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/ly7;->M()Lcom/daaw/ly7;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/rw7;)V
    .locals 0

    invoke-static {}, Lcom/daaw/ly7;->M()Lcom/daaw/ly7;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/fs7;-><init>(Lcom/daaw/ls7;)V

    return-void
.end method


# virtual methods
.method public final s(Ljava/lang/String;)Lcom/daaw/ky7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/ly7;

    invoke-static {v0, p1}, Lcom/daaw/ly7;->N(Lcom/daaw/ly7;Ljava/lang/String;)V

    return-object p0
.end method

.method public final t(J)Lcom/daaw/ky7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/ly7;

    invoke-static {v0, p1, p2}, Lcom/daaw/ly7;->O(Lcom/daaw/ly7;J)V

    return-object p0
.end method

.method public final u(Z)Lcom/daaw/ky7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/fs7;->p()V

    iget-object v0, p0, Lcom/daaw/fs7;->q:Lcom/daaw/ls7;

    check-cast v0, Lcom/daaw/ly7;

    invoke-static {v0, p1}, Lcom/daaw/ly7;->P(Lcom/daaw/ly7;Z)V

    return-object p0
.end method
