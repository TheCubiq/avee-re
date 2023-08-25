.class public final synthetic Lcom/daaw/xf5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/fg5;

.field public final synthetic b:Lcom/daaw/io6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/fg5;Lcom/daaw/io6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/xf5;->a:Lcom/daaw/fg5;

    iput-object p2, p0, Lcom/daaw/xf5;->b:Lcom/daaw/io6;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/xf5;->a:Lcom/daaw/fg5;

    iget-object v1, p0, Lcom/daaw/xf5;->b:Lcom/daaw/io6;

    invoke-virtual {v0, v1}, Lcom/daaw/fg5;->f(Lcom/daaw/io6;)Ljava/lang/Object;

    const/4 v0, 0x0

    return-object v0
.end method
