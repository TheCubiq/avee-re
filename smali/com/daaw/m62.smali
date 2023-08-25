.class public final Lcom/daaw/m62;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/m09;


# instance fields
.field public final p:J

.field public final q:Lcom/daaw/m09;


# direct methods
.method public constructor <init>(JLcom/daaw/m09;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/daaw/m62;->p:J

    iput-object p3, p0, Lcom/daaw/m62;->q:Lcom/daaw/m09;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/m62;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/m62;->p:J

    return-wide v0
.end method


# virtual methods
.method public final i(Lcom/daaw/i42;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/m62;->q:Lcom/daaw/m09;

    new-instance v1, Lcom/daaw/l62;

    invoke-direct {v1, p0, p1}, Lcom/daaw/l62;-><init>(Lcom/daaw/m62;Lcom/daaw/i42;)V

    invoke-interface {v0, v1}, Lcom/daaw/m09;->i(Lcom/daaw/i42;)V

    return-void
.end method

.method public final n(II)Lcom/daaw/m42;
    .locals 1

    iget-object v0, p0, Lcom/daaw/m62;->q:Lcom/daaw/m09;

    invoke-interface {v0, p1, p2}, Lcom/daaw/m09;->n(II)Lcom/daaw/m42;

    move-result-object p1

    return-object p1
.end method

.method public final zzC()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/m62;->q:Lcom/daaw/m09;

    invoke-interface {v0}, Lcom/daaw/m09;->zzC()V

    return-void
.end method
