.class public final synthetic Lcom/daaw/zv5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/aw5;

.field public final synthetic q:Lcom/daaw/fi6;

.field public final synthetic r:Lcom/daaw/th6;

.field public final synthetic s:Lcom/daaw/tq5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/aw5;Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/zv5;->p:Lcom/daaw/aw5;

    iput-object p2, p0, Lcom/daaw/zv5;->q:Lcom/daaw/fi6;

    iput-object p3, p0, Lcom/daaw/zv5;->r:Lcom/daaw/th6;

    iput-object p4, p0, Lcom/daaw/zv5;->s:Lcom/daaw/tq5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/zv5;->p:Lcom/daaw/aw5;

    iget-object v1, p0, Lcom/daaw/zv5;->q:Lcom/daaw/fi6;

    iget-object v2, p0, Lcom/daaw/zv5;->r:Lcom/daaw/th6;

    iget-object v3, p0, Lcom/daaw/zv5;->s:Lcom/daaw/tq5;

    iget-object v0, v0, Lcom/daaw/aw5;->d:Lcom/daaw/cw5;

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/cw5;->d(Lcom/daaw/cw5;Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)V

    return-void
.end method
