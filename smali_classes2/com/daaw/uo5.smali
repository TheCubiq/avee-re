.class public final Lcom/daaw/uo5;
.super Lcom/daaw/y98;
.source ""

# interfaces
.implements Lcom/daaw/be8;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/xp5;->G()Lcom/daaw/xp5;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/y98;-><init>(Lcom/daaw/ja8;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/kl5;)V
    .locals 0

    invoke-static {}, Lcom/daaw/xp5;->G()Lcom/daaw/xp5;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/y98;-><init>(Lcom/daaw/ja8;)V

    return-void
.end method


# virtual methods
.method public final s()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/xp5;

    invoke-virtual {v0}, Lcom/daaw/xp5;->D()I

    move-result v0

    return v0
.end method

.method public final t(Ljava/lang/String;)Lcom/daaw/uo5;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/xp5;

    invoke-static {v0, p1}, Lcom/daaw/xp5;->L(Lcom/daaw/xp5;Ljava/lang/String;)V

    return-object p0
.end method

.method public final u(ILcom/daaw/ds5;)Lcom/daaw/uo5;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/xp5;

    invoke-static {v0, p1, p2}, Lcom/daaw/xp5;->M(Lcom/daaw/xp5;ILcom/daaw/ds5;)V

    return-object p0
.end method

.method public final v(I)Lcom/daaw/ds5;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/xp5;

    invoke-virtual {v0, p1}, Lcom/daaw/xp5;->H(I)Lcom/daaw/ds5;

    move-result-object p1

    return-object p1
.end method

.method public final w()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/xp5;

    invoke-virtual {v0}, Lcom/daaw/xp5;->J()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
