.class public final Lcom/daaw/aq6;
.super Lcom/daaw/y98;
.source ""

# interfaces
.implements Lcom/daaw/be8;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/er6;->G()Lcom/daaw/er6;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/y98;-><init>(Lcom/daaw/ja8;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/lj6;)V
    .locals 0

    invoke-static {}, Lcom/daaw/er6;->G()Lcom/daaw/er6;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/y98;-><init>(Lcom/daaw/ja8;)V

    return-void
.end method


# virtual methods
.method public final s(J)Lcom/daaw/aq6;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/er6;

    invoke-static {v0, p1, p2}, Lcom/daaw/er6;->I(Lcom/daaw/er6;J)V

    return-object p0
.end method

.method public final t(I)Lcom/daaw/aq6;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/er6;

    invoke-static {v0, p1}, Lcom/daaw/er6;->H(Lcom/daaw/er6;I)V

    return-object p0
.end method
