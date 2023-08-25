.class public final synthetic Lcom/daaw/ts;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Ljava/lang/Runnable;

.field public final synthetic q:Lcom/daaw/vs$b;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;Lcom/daaw/vs$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ts;->p:Ljava/lang/Runnable;

    iput-object p2, p0, Lcom/daaw/ts;->q:Lcom/daaw/vs$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ts;->p:Ljava/lang/Runnable;

    iget-object v1, p0, Lcom/daaw/ts;->q:Lcom/daaw/vs$b;

    invoke-static {v0, v1}, Lcom/daaw/us;->j(Ljava/lang/Runnable;Lcom/daaw/vs$b;)V

    return-void
.end method
