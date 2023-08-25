.class public final synthetic Lcom/daaw/i44;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/y24;

.field public final synthetic q:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/y24;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/i44;->p:Lcom/daaw/y24;

    iput-object p2, p0, Lcom/daaw/i44;->q:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/i44;->p:Lcom/daaw/y24;

    iget-object v1, p0, Lcom/daaw/i44;->q:Ljava/util/Map;

    sget v2, Lcom/daaw/l44;->L:I

    const-string v2, "onGcacheInfoEvent"

    invoke-interface {v0, v2, v1}, Lcom/daaw/uj3;->T(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
