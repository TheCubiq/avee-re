.class public final Lcom/daaw/pi5;
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

    iput-object p1, p0, Lcom/daaw/pi5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/pi5;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/pi5;->c:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/pi5;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/sl2;

    iget-object v1, p0, Lcom/daaw/pi5;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/h94;

    invoke-virtual {v1}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v2}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lcom/daaw/mi5;

    invoke-direct {v3, v0, v1}, Lcom/daaw/mi5;-><init>(Lcom/daaw/sl2;Landroid/content/Context;)V

    invoke-interface {v2, v3}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
