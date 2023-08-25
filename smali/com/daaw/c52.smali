.class public final synthetic Lcom/daaw/c52;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/rb;

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/daaw/tb;

.field public final synthetic f:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/rb;ILjava/lang/String;Ljava/lang/String;Lcom/daaw/tb;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/c52;->a:Lcom/daaw/rb;

    iput p2, p0, Lcom/daaw/c52;->b:I

    iput-object p3, p0, Lcom/daaw/c52;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/c52;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/c52;->e:Lcom/daaw/tb;

    iput-object p6, p0, Lcom/daaw/c52;->f:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/daaw/c52;->a:Lcom/daaw/rb;

    iget v1, p0, Lcom/daaw/c52;->b:I

    iget-object v2, p0, Lcom/daaw/c52;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/c52;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/daaw/c52;->e:Lcom/daaw/tb;

    iget-object v5, p0, Lcom/daaw/c52;->f:Landroid/os/Bundle;

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/rb;->w(ILjava/lang/String;Ljava/lang/String;Lcom/daaw/tb;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
