.class public final synthetic Lcom/daaw/nk3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/jl3;

.field public final synthetic q:Lcom/daaw/il3;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/jl3;Lcom/daaw/sl2;Lcom/daaw/il3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/nk3;->p:Lcom/daaw/jl3;

    iput-object p3, p0, Lcom/daaw/nk3;->q:Lcom/daaw/il3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/nk3;->p:Lcom/daaw/jl3;

    iget-object v1, p0, Lcom/daaw/nk3;->q:Lcom/daaw/il3;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/daaw/jl3;->j(Lcom/daaw/sl2;Lcom/daaw/il3;)V

    return-void
.end method
