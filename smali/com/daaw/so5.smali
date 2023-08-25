.class public final Lcom/daaw/so5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/oo5;

.field public final b:Lcom/daaw/g77;


# direct methods
.method public constructor <init>(Lcom/daaw/oo5;Lcom/daaw/g77;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/so5;->a:Lcom/daaw/oo5;

    iput-object p2, p0, Lcom/daaw/so5;->b:Lcom/daaw/g77;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/em6;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/so5;->b:Lcom/daaw/g77;

    iget-object v1, p0, Lcom/daaw/so5;->a:Lcom/daaw/oo5;

    new-instance v2, Lcom/daaw/qo5;

    invoke-direct {v2, v1}, Lcom/daaw/qo5;-><init>(Lcom/daaw/oo5;)V

    invoke-interface {v0, v2}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v0

    new-instance v1, Lcom/daaw/ro5;

    invoke-direct {v1, p0, p1}, Lcom/daaw/ro5;-><init>(Lcom/daaw/so5;Lcom/daaw/em6;)V

    iget-object p1, p0, Lcom/daaw/so5;->b:Lcom/daaw/g77;

    invoke-static {v0, v1, p1}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-void
.end method
