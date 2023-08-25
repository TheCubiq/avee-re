.class public final Lcom/daaw/m88;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/yb8;

.field public final synthetic q:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/daaw/s88;Lcom/daaw/yb8;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/m88;->p:Lcom/daaw/yb8;

    iput-object p3, p0, Lcom/daaw/m88;->q:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/m88;->p:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->c()V

    iget-object v0, p0, Lcom/daaw/m88;->p:Lcom/daaw/yb8;

    iget-object v1, p0, Lcom/daaw/m88;->q:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/daaw/yb8;->l0(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/daaw/m88;->p:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->C()V

    return-void
.end method
