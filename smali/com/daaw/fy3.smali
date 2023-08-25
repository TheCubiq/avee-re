.class public final synthetic Lcom/daaw/fy3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/ky3;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ky3;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fy3;->a:Lcom/daaw/ky3;

    iput-object p2, p0, Lcom/daaw/fy3;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/fy3;->a:Lcom/daaw/ky3;

    iget-object v1, p0, Lcom/daaw/fy3;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/daaw/ky3;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
