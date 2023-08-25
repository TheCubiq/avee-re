.class public final synthetic Lcom/daaw/jk4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/kk4;

.field public final synthetic q:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/kk4;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/jk4;->p:Lcom/daaw/kk4;

    iput-object p2, p0, Lcom/daaw/jk4;->q:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/jk4;->p:Lcom/daaw/kk4;

    iget-object v1, p0, Lcom/daaw/jk4;->q:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/daaw/kk4;->p(Ljava/lang/Runnable;)V

    return-void
.end method
