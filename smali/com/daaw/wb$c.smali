.class public Lcom/daaw/wb$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/wb;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/wb;


# direct methods
.method public constructor <init>(Lcom/daaw/wb;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wb$c;->p:Lcom/daaw/wb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/wb$c;->p:Lcom/daaw/wb;

    invoke-static {v0}, Lcom/daaw/wb;->g(Lcom/daaw/wb;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/daaw/wb$c;->p:Lcom/daaw/wb;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/wb;->h(Lcom/daaw/wb;I)I

    iget-object v0, p0, Lcom/daaw/wb$c;->p:Lcom/daaw/wb;

    invoke-static {v0}, Lcom/daaw/wb;->f(Lcom/daaw/wb;)Lcom/daaw/qb;

    move-result-object v0

    invoke-static {}, Lcom/daaw/k01;->a()Lcom/daaw/k01$a;

    move-result-object v1

    const-string v2, "subs"

    invoke-virtual {v1, v2}, Lcom/daaw/k01$a;->b(Ljava/lang/String;)Lcom/daaw/k01$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/k01$a;->a()Lcom/daaw/k01;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/wb$c;->p:Lcom/daaw/wb;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qb;->g(Lcom/daaw/k01;Lcom/daaw/f01;)V

    iget-object v0, p0, Lcom/daaw/wb$c;->p:Lcom/daaw/wb;

    invoke-static {v0}, Lcom/daaw/wb;->f(Lcom/daaw/wb;)Lcom/daaw/qb;

    move-result-object v0

    invoke-static {}, Lcom/daaw/k01;->a()Lcom/daaw/k01$a;

    move-result-object v1

    const-string v2, "inapp"

    invoke-virtual {v1, v2}, Lcom/daaw/k01$a;->b(Ljava/lang/String;)Lcom/daaw/k01$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/k01$a;->a()Lcom/daaw/k01;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/wb$c;->p:Lcom/daaw/wb;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qb;->g(Lcom/daaw/k01;Lcom/daaw/f01;)V

    return-void
.end method
