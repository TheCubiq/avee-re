.class public Lcom/daaw/qv1$h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/qv1$h;->b(Lcom/daaw/vk1;Ljava/lang/Boolean;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Lcom/daaw/qv1$h;


# direct methods
.method public constructor <init>(Lcom/daaw/qv1$h;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1$h$a;->q:Lcom/daaw/qv1$h;

    iput-object p2, p0, Lcom/daaw/qv1$h$a;->p:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/qv1$h$a;->q:Lcom/daaw/qv1$h;

    iget-object v0, v0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->C(Lcom/daaw/qv1;)Lcom/daaw/dv1$f;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/qv1$h$a;->q:Lcom/daaw/qv1$h;

    iget-object v0, v0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    new-instance v1, Lcom/daaw/dv1$f;

    invoke-direct {v1}, Lcom/daaw/dv1$f;-><init>()V

    invoke-static {v0, v1}, Lcom/daaw/qv1;->D(Lcom/daaw/qv1;Lcom/daaw/dv1$f;)Lcom/daaw/dv1$f;

    :cond_0
    iget-object v0, p0, Lcom/daaw/qv1$h$a;->q:Lcom/daaw/qv1$h;

    iget-object v0, v0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->C(Lcom/daaw/qv1;)Lcom/daaw/dv1$f;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/daaw/dv1$f;->a:Z

    iget-object v0, p0, Lcom/daaw/qv1$h$a;->q:Lcom/daaw/qv1$h;

    iget-object v0, v0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->C(Lcom/daaw/qv1;)Lcom/daaw/dv1$f;

    move-result-object v0

    iput-boolean v1, v0, Lcom/daaw/dv1$f;->b:Z

    iget-object v0, p0, Lcom/daaw/qv1$h$a;->q:Lcom/daaw/qv1$h;

    iget-object v0, v0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->C(Lcom/daaw/qv1;)Lcom/daaw/dv1$f;

    move-result-object v0

    iput v1, v0, Lcom/daaw/dv1$f;->d:I

    iget-object v0, p0, Lcom/daaw/qv1$h$a;->q:Lcom/daaw/qv1$h;

    iget-object v0, v0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->C(Lcom/daaw/qv1;)Lcom/daaw/dv1$f;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, v0, Lcom/daaw/dv1$f;->c:I

    iget-object v0, p0, Lcom/daaw/qv1$h$a;->q:Lcom/daaw/qv1$h;

    iget-object v0, v0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->C(Lcom/daaw/qv1;)Lcom/daaw/dv1$f;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/qv1$h$a;->p:Ljava/lang/String;

    iput-object v1, v0, Lcom/daaw/dv1$f;->e:Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/qv1$h$a;->q:Lcom/daaw/qv1$h;

    iget-object v0, v0, Lcom/daaw/qv1$h;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->C(Lcom/daaw/qv1;)Lcom/daaw/dv1$f;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/dv1;->K(Lcom/daaw/dv1$f;)V

    return-void
.end method
