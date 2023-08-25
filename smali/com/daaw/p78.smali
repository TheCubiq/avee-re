.class public final synthetic Lcom/daaw/p78;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/s78;

.field public final synthetic q:Lcom/daaw/v17;

.field public final synthetic r:Lcom/daaw/pr8;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/s78;Lcom/daaw/v17;Lcom/daaw/pr8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/p78;->p:Lcom/daaw/s78;

    iput-object p2, p0, Lcom/daaw/p78;->q:Lcom/daaw/v17;

    iput-object p3, p0, Lcom/daaw/p78;->r:Lcom/daaw/pr8;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/p78;->p:Lcom/daaw/s78;

    iget-object v1, p0, Lcom/daaw/p78;->q:Lcom/daaw/v17;

    iget-object v2, p0, Lcom/daaw/p78;->r:Lcom/daaw/pr8;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/s78;->m(Lcom/daaw/v17;Lcom/daaw/pr8;)V

    return-void
.end method
