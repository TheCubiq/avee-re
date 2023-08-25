.class public Lcom/daaw/x10$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/x10;->b(Lcom/daaw/s10;Lcom/daaw/e20;Lcom/daaw/es;Lcom/daaw/es;)Lcom/daaw/x10;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/daaw/dm;

.field public final synthetic c:Lcom/daaw/wb1;


# direct methods
.method public constructor <init>(ZLcom/daaw/dm;Lcom/daaw/wb1;)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/x10$b;->a:Z

    iput-object p2, p0, Lcom/daaw/x10$b;->b:Lcom/daaw/dm;

    iput-object p3, p0, Lcom/daaw/x10$b;->c:Lcom/daaw/wb1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/x10$b;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/x10$b;->b:Lcom/daaw/dm;

    iget-object v1, p0, Lcom/daaw/x10$b;->c:Lcom/daaw/wb1;

    invoke-virtual {v0, v1}, Lcom/daaw/dm;->g(Lcom/daaw/zb1;)Lcom/daaw/rj1;

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/x10$b;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
