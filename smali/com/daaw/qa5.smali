.class public final Lcom/daaw/qa5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/pa5;

.field public final b:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/pa5;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/qa5;->a:Lcom/daaw/pa5;

    iput-object p2, p0, Lcom/daaw/qa5;->b:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/qa5;->b:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/oa5;

    invoke-virtual {v0}, Lcom/daaw/oa5;->a()Lcom/daaw/na5;

    move-result-object v0

    new-instance v1, Lcom/daaw/ly4;

    sget-object v2, Lcom/daaw/z04;->e:Lcom/daaw/g77;

    invoke-direct {v1, v0, v2}, Lcom/daaw/ly4;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v1
.end method
