.class public final Lcom/daaw/wj4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/gj4;

.field public final b:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/gj4;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/wj4;->a:Lcom/daaw/gj4;

    iput-object p2, p0, Lcom/daaw/wj4;->b:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/wj4;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/ul4;

    invoke-virtual {v0}, Lcom/daaw/ul4;->a()Lcom/daaw/jt4;

    move-result-object v0

    new-instance v1, Lcom/daaw/ly4;

    new-instance v2, Lcom/daaw/fj4;

    invoke-direct {v2, v0}, Lcom/daaw/fj4;-><init>(Lcom/daaw/jt4;)V

    sget-object v0, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-direct {v1, v2, v0}, Lcom/daaw/ly4;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v1
.end method
