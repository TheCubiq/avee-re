.class public final Lcom/daaw/nb7;
.super Lcom/daaw/y98;
.source ""

# interfaces
.implements Lcom/daaw/be8;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/daaw/qc7;->H()Lcom/daaw/qc7;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/y98;-><init>(Lcom/daaw/ja8;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/lj6;)V
    .locals 0

    invoke-static {}, Lcom/daaw/qc7;->H()Lcom/daaw/qc7;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/y98;-><init>(Lcom/daaw/ja8;)V

    return-void
.end method


# virtual methods
.method public final s(Ljava/lang/Iterable;)Lcom/daaw/nb7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/qc7;

    invoke-static {v0, p1}, Lcom/daaw/qc7;->K(Lcom/daaw/qc7;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final t(I)Lcom/daaw/nb7;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/y98;->o()V

    iget-object v0, p0, Lcom/daaw/y98;->q:Lcom/daaw/ja8;

    check-cast v0, Lcom/daaw/qc7;

    invoke-static {v0, p1}, Lcom/daaw/qc7;->J(Lcom/daaw/qc7;I)V

    return-object p0
.end method
