.class public abstract Lcom/daaw/th0;
.super Lcom/daaw/ph;
.source ""

# interfaces
.implements Lcom/daaw/iu;
.implements Lcom/daaw/qf0;


# instance fields
.field public s:Lcom/daaw/uh0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/ph;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/th0;->t()Lcom/daaw/uh0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/uh0;->X(Lcom/daaw/th0;)V

    return-void
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public e()Lcom/daaw/ys0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final t()Lcom/daaw/uh0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/th0;->s:Lcom/daaw/uh0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "job"

    invoke-static {v0}, Lcom/daaw/ug0;->s(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lcom/daaw/aq;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lcom/daaw/aq;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[job@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/daaw/th0;->t()Lcom/daaw/uh0;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/aq;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Lcom/daaw/uh0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/th0;->s:Lcom/daaw/uh0;

    return-void
.end method
