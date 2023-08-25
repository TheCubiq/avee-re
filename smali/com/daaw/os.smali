.class public final synthetic Lcom/daaw/os;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/us;

.field public final synthetic q:Ljava/lang/Runnable;

.field public final synthetic r:Lcom/daaw/vs$b;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/us;Ljava/lang/Runnable;Lcom/daaw/vs$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/os;->p:Lcom/daaw/us;

    iput-object p2, p0, Lcom/daaw/os;->q:Ljava/lang/Runnable;

    iput-object p3, p0, Lcom/daaw/os;->r:Lcom/daaw/vs$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/os;->p:Lcom/daaw/us;

    iget-object v1, p0, Lcom/daaw/os;->q:Ljava/lang/Runnable;

    iget-object v2, p0, Lcom/daaw/os;->r:Lcom/daaw/vs$b;

    invoke-static {v0, v1, v2}, Lcom/daaw/us;->c(Lcom/daaw/us;Ljava/lang/Runnable;Lcom/daaw/vs$b;)V

    return-void
.end method
