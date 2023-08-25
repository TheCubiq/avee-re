.class public final synthetic Lcom/daaw/zi8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/dj8;

.field public final synthetic q:Lcom/daaw/f92;

.field public final synthetic r:Lcom/daaw/tm7;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/dj8;Lcom/daaw/f92;Lcom/daaw/tm7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/zi8;->p:Lcom/daaw/dj8;

    iput-object p2, p0, Lcom/daaw/zi8;->q:Lcom/daaw/f92;

    iput-object p3, p0, Lcom/daaw/zi8;->r:Lcom/daaw/tm7;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/zi8;->p:Lcom/daaw/dj8;

    iget-object v1, p0, Lcom/daaw/zi8;->q:Lcom/daaw/f92;

    iget-object v2, p0, Lcom/daaw/zi8;->r:Lcom/daaw/tm7;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/dj8;->n(Lcom/daaw/f92;Lcom/daaw/tm7;)V

    return-void
.end method
