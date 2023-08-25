.class public final Lcom/daaw/l05;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/sz4;

.field public final b:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/sz4;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/l05;->a:Lcom/daaw/sz4;

    iput-object p2, p0, Lcom/daaw/l05;->b:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/l05;->a:Lcom/daaw/sz4;

    iget-object v1, p0, Lcom/daaw/l05;->b:Lcom/daaw/m08;

    invoke-interface {v1}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1}, Lcom/daaw/sz4;->d(Ljava/util/concurrent/Executor;)Lcom/daaw/ly4;

    move-result-object v0

    return-object v0
.end method
