.class public final synthetic Lcom/daaw/ss8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/ys8;

.field public final synthetic q:Lcom/daaw/i42;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ys8;Lcom/daaw/i42;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ss8;->p:Lcom/daaw/ys8;

    iput-object p2, p0, Lcom/daaw/ss8;->q:Lcom/daaw/i42;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ss8;->p:Lcom/daaw/ys8;

    iget-object v1, p0, Lcom/daaw/ss8;->q:Lcom/daaw/i42;

    invoke-virtual {v0, v1}, Lcom/daaw/ys8;->s(Lcom/daaw/i42;)V

    return-void
.end method
