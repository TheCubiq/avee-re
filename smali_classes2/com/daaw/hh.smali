.class public Lcom/daaw/hh;
.super Lcom/daaw/r6;
.source ""


# instance fields
.field public p:Ljava/lang/String;

.field public q:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/r6;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/daaw/hh;->p:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/hh;->q:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 4

    new-instance v0, Lcom/daaw/gh;

    iget-object v1, p0, Lcom/daaw/hh;->p:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/hh;->q:Ljava/lang/String;

    const/16 v3, 0x14

    invoke-direct {v0, v3, v1, v2}, Lcom/daaw/gh;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-super {p0}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/gh;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
