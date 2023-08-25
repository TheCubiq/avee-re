.class public final Lcom/daaw/qo6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/to6;

.field public final synthetic b:Lcom/daaw/io6;

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(Lcom/daaw/to6;Lcom/daaw/io6;Z)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qo6;->a:Lcom/daaw/to6;

    iput-object p2, p0, Lcom/daaw/qo6;->b:Lcom/daaw/io6;

    iput-boolean p3, p0, Lcom/daaw/qo6;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/qo6;->a:Lcom/daaw/to6;

    iget-object v0, p0, Lcom/daaw/qo6;->b:Lcom/daaw/io6;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-virtual {p1, v0}, Lcom/daaw/to6;->a(Lcom/daaw/io6;)Lcom/daaw/to6;

    iget-boolean p1, p0, Lcom/daaw/qo6;->c:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/qo6;->a:Lcom/daaw/to6;

    invoke-virtual {p1}, Lcom/daaw/to6;->g()V

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/qo6;->b:Lcom/daaw/io6;

    invoke-interface {v0}, Lcom/daaw/io6;->zzj()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/qo6;->a:Lcom/daaw/to6;

    invoke-interface {v0, p1}, Lcom/daaw/io6;->e(Ljava/lang/Throwable;)Lcom/daaw/io6;

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-virtual {v1, v0}, Lcom/daaw/to6;->a(Lcom/daaw/io6;)Lcom/daaw/to6;

    iget-boolean p1, p0, Lcom/daaw/qo6;->c:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/qo6;->a:Lcom/daaw/to6;

    invoke-virtual {p1}, Lcom/daaw/to6;->g()V

    :cond_0
    return-void
.end method
