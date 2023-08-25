.class public final synthetic Lcom/daaw/vx0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/tx0;

.field public final synthetic b:[Ljava/lang/Object;

.field public final synthetic c:Landroid/os/Handler;

.field public final synthetic d:Lcom/daaw/e0;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/tx0;[Ljava/lang/Object;Landroid/os/Handler;Lcom/daaw/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vx0;->a:Lcom/daaw/tx0;

    iput-object p2, p0, Lcom/daaw/vx0;->b:[Ljava/lang/Object;

    iput-object p3, p0, Lcom/daaw/vx0;->c:Landroid/os/Handler;

    iput-object p4, p0, Lcom/daaw/vx0;->d:Lcom/daaw/e0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/vx0;->a:Lcom/daaw/tx0;

    iget-object v1, p0, Lcom/daaw/vx0;->b:[Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/vx0;->c:Landroid/os/Handler;

    iget-object v3, p0, Lcom/daaw/vx0;->d:Lcom/daaw/e0;

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/wx0;->a(Lcom/daaw/tx0;[Ljava/lang/Object;Landroid/os/Handler;Lcom/daaw/e0;)Lcom/daaw/tx0$b;

    move-result-object v0

    return-object v0
.end method
