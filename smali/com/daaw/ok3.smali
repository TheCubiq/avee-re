.class public final synthetic Lcom/daaw/ok3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/jl3;

.field public final synthetic q:Lcom/daaw/il3;

.field public final synthetic r:Lcom/daaw/bk3;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/jl3;Lcom/daaw/il3;Lcom/daaw/bk3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ok3;->p:Lcom/daaw/jl3;

    iput-object p2, p0, Lcom/daaw/ok3;->q:Lcom/daaw/il3;

    iput-object p3, p0, Lcom/daaw/ok3;->r:Lcom/daaw/bk3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/ok3;->p:Lcom/daaw/jl3;

    iget-object v1, p0, Lcom/daaw/ok3;->q:Lcom/daaw/il3;

    iget-object v2, p0, Lcom/daaw/ok3;->r:Lcom/daaw/bk3;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/jl3;->i(Lcom/daaw/il3;Lcom/daaw/bk3;)V

    return-void
.end method
