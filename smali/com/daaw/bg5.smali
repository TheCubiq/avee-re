.class public final synthetic Lcom/daaw/bg5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/fg5;

.field public final synthetic q:Lcom/daaw/e14;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/fg5;Lcom/daaw/e14;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bg5;->p:Lcom/daaw/fg5;

    iput-object p2, p0, Lcom/daaw/bg5;->q:Lcom/daaw/e14;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/bg5;->p:Lcom/daaw/fg5;

    iget-object v1, p0, Lcom/daaw/bg5;->q:Lcom/daaw/e14;

    invoke-virtual {v0, v1}, Lcom/daaw/fg5;->o(Lcom/daaw/e14;)V

    return-void
.end method
