.class public Lcom/daaw/cu8;
.super Lcom/daaw/sq8;
.source ""


# instance fields
.field public final k:Lcom/daaw/rr8;


# direct methods
.method public constructor <init>(Lcom/daaw/rr8;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/sq8;-><init>()V

    iput-object p1, p0, Lcom/daaw/cu8;->k:Lcom/daaw/rr8;

    return-void
.end method


# virtual methods
.method public final synthetic B(Ljava/lang/Object;I)I
    .locals 0

    check-cast p1, Ljava/lang/Void;

    return p2
.end method

.method public final synthetic C(Ljava/lang/Object;J)J
    .locals 0

    check-cast p1, Ljava/lang/Void;

    return-wide p2
.end method

.method public final synthetic D(Ljava/lang/Object;Lcom/daaw/pr8;)Lcom/daaw/pr8;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p2}, Lcom/daaw/cu8;->F(Lcom/daaw/pr8;)Lcom/daaw/pr8;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic E(Ljava/lang/Object;Lcom/daaw/rr8;Lcom/daaw/l64;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p3}, Lcom/daaw/cu8;->G(Lcom/daaw/l64;)V

    return-void
.end method

.method public F(Lcom/daaw/pr8;)Lcom/daaw/pr8;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public G(Lcom/daaw/l64;)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public H()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/cu8;->k:Lcom/daaw/rr8;

    invoke-interface {v0}, Lcom/daaw/rr8;->b()Z

    const/4 v0, 0x1

    return v0
.end method

.method public final h()Lcom/daaw/f53;
    .locals 1

    iget-object v0, p0, Lcom/daaw/cu8;->k:Lcom/daaw/rr8;

    invoke-interface {v0}, Lcom/daaw/rr8;->h()Lcom/daaw/f53;

    move-result-object v0

    return-object v0
.end method

.method public l(Lcom/daaw/nr8;)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final p()Lcom/daaw/l64;
    .locals 1

    iget-object v0, p0, Lcom/daaw/cu8;->k:Lcom/daaw/rr8;

    invoke-interface {v0}, Lcom/daaw/rr8;->p()Lcom/daaw/l64;

    const/4 v0, 0x0

    return-object v0
.end method

.method public final w(Lcom/daaw/qz6;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/sq8;->w(Lcom/daaw/qz6;)V

    invoke-virtual {p0}, Lcom/daaw/cu8;->H()V

    return-void
.end method
