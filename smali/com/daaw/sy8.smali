.class public final synthetic Lcom/daaw/sy8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/vy8;

.field public final synthetic q:Lcom/daaw/f92;

.field public final synthetic r:Lcom/daaw/tm7;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/vy8;Lcom/daaw/f92;Lcom/daaw/tm7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/sy8;->p:Lcom/daaw/vy8;

    iput-object p2, p0, Lcom/daaw/sy8;->q:Lcom/daaw/f92;

    iput-object p3, p0, Lcom/daaw/sy8;->r:Lcom/daaw/tm7;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/sy8;->p:Lcom/daaw/vy8;

    iget-object v1, p0, Lcom/daaw/sy8;->q:Lcom/daaw/f92;

    iget-object v2, p0, Lcom/daaw/sy8;->r:Lcom/daaw/tm7;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/vy8;->l(Lcom/daaw/f92;Lcom/daaw/tm7;)V

    return-void
.end method
