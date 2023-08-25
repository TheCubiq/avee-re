.class public final synthetic Lcom/daaw/g75;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/q03;


# instance fields
.field public final synthetic p:Lcom/daaw/a74;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/a74;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/g75;->p:Lcom/daaw/a74;

    return-void
.end method


# virtual methods
.method public final e0(Lcom/daaw/p03;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/g75;->p:Lcom/daaw/a74;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget-boolean p1, p1, Lcom/daaw/p03;->j:Z

    const/4 v2, 0x1

    if-eq v2, p1, :cond_0

    const-string p1, "0"

    goto :goto_0

    :cond_0
    const-string p1, "1"

    :goto_0
    const-string v2, "isVisible"

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "onAdVisibilityChanged"

    invoke-interface {v0, p1, v1}, Lcom/daaw/uj3;->T(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
