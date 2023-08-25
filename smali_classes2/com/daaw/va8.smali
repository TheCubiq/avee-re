.class public final Lcom/daaw/va8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/bc8;

.field public final synthetic q:Lcom/daaw/yb8;


# direct methods
.method public constructor <init>(Lcom/daaw/yb8;Lcom/daaw/bc8;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/va8;->q:Lcom/daaw/yb8;

    iput-object p2, p0, Lcom/daaw/va8;->p:Lcom/daaw/bc8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/va8;->q:Lcom/daaw/yb8;

    iget-object v1, p0, Lcom/daaw/va8;->p:Lcom/daaw/bc8;

    invoke-static {v0, v1}, Lcom/daaw/yb8;->k0(Lcom/daaw/yb8;Lcom/daaw/bc8;)V

    iget-object v0, p0, Lcom/daaw/va8;->q:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->x()V

    return-void
.end method
