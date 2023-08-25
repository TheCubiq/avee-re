.class public final Lcom/daaw/ch4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ch4;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/ch4;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/ch4;->c:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/ch4;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/m03;

    iget-object v1, p0, Lcom/daaw/ch4;->b:Lcom/daaw/m08;

    invoke-interface {v1}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/jm3;

    invoke-static {}, Lcom/daaw/ll6;->a()Lcom/daaw/g77;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lcom/daaw/vg4;

    invoke-virtual {v0}, Lcom/daaw/m03;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0, v1, v2}, Lcom/daaw/vg4;-><init>(Ljava/lang/String;Lcom/daaw/jm3;Ljava/util/concurrent/Executor;)V

    return-object v3
.end method
