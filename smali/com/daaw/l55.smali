.class public final Lcom/daaw/l55;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ir4;


# instance fields
.field public final p:Lcom/daaw/j35;

.field public final q:Lcom/daaw/o35;


# direct methods
.method public constructor <init>(Lcom/daaw/j35;Lcom/daaw/o35;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/l55;->p:Lcom/daaw/j35;

    iput-object p2, p0, Lcom/daaw/l55;->q:Lcom/daaw/o35;

    return-void
.end method


# virtual methods
.method public final zzl()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/l55;->p:Lcom/daaw/j35;

    invoke-virtual {v0}, Lcom/daaw/j35;->c0()Lcom/daaw/yd0;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/j35;->Y()Lcom/daaw/a74;

    move-result-object v1

    invoke-virtual {v0}, Lcom/daaw/j35;->Z()Lcom/daaw/a74;

    move-result-object v0

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    const/4 v1, 0x0

    goto :goto_0

    :cond_2
    move-object v1, v0

    :goto_0
    iget-object v0, p0, Lcom/daaw/l55;->q:Lcom/daaw/o35;

    invoke-virtual {v0}, Lcom/daaw/o35;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    new-instance v0, Lcom/daaw/g6;

    invoke-direct {v0}, Lcom/daaw/g6;-><init>()V

    const-string v2, "onSdkImpression"

    invoke-interface {v1, v2, v0}, Lcom/daaw/uj3;->T(Ljava/lang/String;Ljava/util/Map;)V

    :cond_3
    return-void
.end method
