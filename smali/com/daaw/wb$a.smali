.class public Lcom/daaw/wb$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/wb;->p(Lcom/daaw/kz0;Lcom/android/billingclient/api/Purchase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/kz0;

.field public final synthetic q:Lcom/android/billingclient/api/Purchase;

.field public final synthetic r:Lcom/daaw/wb;


# direct methods
.method public constructor <init>(Lcom/daaw/wb;Lcom/daaw/kz0;Lcom/android/billingclient/api/Purchase;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wb$a;->r:Lcom/daaw/wb;

    iput-object p2, p0, Lcom/daaw/wb$a;->p:Lcom/daaw/kz0;

    iput-object p3, p0, Lcom/daaw/wb$a;->q:Lcom/android/billingclient/api/Purchase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Launching in-app purchase flow. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/wb$a;->p:Lcom/daaw/kz0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/daaw/tb;->a()Lcom/daaw/tb$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/daaw/tb$b;

    invoke-static {}, Lcom/daaw/tb$b;->a()Lcom/daaw/tb$b$a;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/wb$a;->p:Lcom/daaw/kz0;

    invoke-virtual {v2, v3}, Lcom/daaw/tb$b$a;->c(Lcom/daaw/kz0;)Lcom/daaw/tb$b$a;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/wb$a;->p:Lcom/daaw/kz0;

    invoke-virtual {v3}, Lcom/daaw/kz0;->d()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/kz0$d;

    invoke-virtual {v3}, Lcom/daaw/kz0$d;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/tb$b$a;->b(Ljava/lang/String;)Lcom/daaw/tb$b$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/tb$b$a;->a()Lcom/daaw/tb$b;

    move-result-object v2

    aput-object v2, v1, v4

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/tb$a;->b(Ljava/util/List;)Lcom/daaw/tb$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/wb$a;->q:Lcom/android/billingclient/api/Purchase;

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/daaw/tb$c;->a()Lcom/daaw/tb$c$a;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/wb$a;->q:Lcom/android/billingclient/api/Purchase;

    invoke-virtual {v2}, Lcom/android/billingclient/api/Purchase;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/tb$c$a;->b(Ljava/lang/String;)Lcom/daaw/tb$c$a;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/daaw/tb$c$a;->d(I)Lcom/daaw/tb$c$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/tb$c$a;->a()Lcom/daaw/tb$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/tb$a;->c(Lcom/daaw/tb$c;)Lcom/daaw/tb$a;

    :cond_0
    iget-object v1, p0, Lcom/daaw/wb$a;->r:Lcom/daaw/wb;

    invoke-static {v1}, Lcom/daaw/wb;->f(Lcom/daaw/wb;)Lcom/daaw/qb;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/wb$a;->r:Lcom/daaw/wb;

    invoke-static {v2}, Lcom/daaw/wb;->e(Lcom/daaw/wb;)Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v0}, Lcom/daaw/tb$a;->a()Lcom/daaw/tb;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/daaw/qb;->d(Landroid/app/Activity;Lcom/daaw/tb;)Lcom/daaw/xb;

    return-void
.end method
