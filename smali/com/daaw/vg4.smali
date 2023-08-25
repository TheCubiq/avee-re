.class public final Lcom/daaw/vg4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/daaw/jm3;

.field public final c:Ljava/util/concurrent/Executor;

.field public d:Lcom/daaw/ah4;

.field public final e:Lcom/daaw/zg3;

.field public final f:Lcom/daaw/zg3;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/daaw/jm3;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/sg4;

    invoke-direct {v0, p0}, Lcom/daaw/sg4;-><init>(Lcom/daaw/vg4;)V

    iput-object v0, p0, Lcom/daaw/vg4;->e:Lcom/daaw/zg3;

    new-instance v0, Lcom/daaw/ug4;

    invoke-direct {v0, p0}, Lcom/daaw/ug4;-><init>(Lcom/daaw/vg4;)V

    iput-object v0, p0, Lcom/daaw/vg4;->f:Lcom/daaw/zg3;

    iput-object p1, p0, Lcom/daaw/vg4;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/vg4;->b:Lcom/daaw/jm3;

    iput-object p3, p0, Lcom/daaw/vg4;->c:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/vg4;)Lcom/daaw/ah4;
    .locals 0

    iget-object p0, p0, Lcom/daaw/vg4;->d:Lcom/daaw/ah4;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/daaw/vg4;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lcom/daaw/vg4;->c:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public static bridge synthetic g(Lcom/daaw/vg4;Ljava/util/Map;)Z
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "hashCode"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p0, p0, Lcom/daaw/vg4;->a:Ljava/lang/String;

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final c(Lcom/daaw/ah4;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/vg4;->b:Lcom/daaw/jm3;

    iget-object v1, p0, Lcom/daaw/vg4;->e:Lcom/daaw/zg3;

    const-string v2, "/updateActiveView"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/jm3;->b(Ljava/lang/String;Lcom/daaw/zg3;)V

    iget-object v0, p0, Lcom/daaw/vg4;->b:Lcom/daaw/jm3;

    iget-object v1, p0, Lcom/daaw/vg4;->f:Lcom/daaw/zg3;

    const-string v2, "/untrackActiveViewUnit"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/jm3;->b(Ljava/lang/String;Lcom/daaw/zg3;)V

    iput-object p1, p0, Lcom/daaw/vg4;->d:Lcom/daaw/ah4;

    return-void
.end method

.method public final d(Lcom/daaw/a74;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vg4;->e:Lcom/daaw/zg3;

    const-string v1, "/updateActiveView"

    invoke-interface {p1, v1, v0}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    iget-object v0, p0, Lcom/daaw/vg4;->f:Lcom/daaw/zg3;

    const-string v1, "/untrackActiveViewUnit"

    invoke-interface {p1, v1, v0}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    return-void
.end method

.method public final e()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/vg4;->b:Lcom/daaw/jm3;

    iget-object v1, p0, Lcom/daaw/vg4;->e:Lcom/daaw/zg3;

    const-string v2, "/updateActiveView"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/jm3;->c(Ljava/lang/String;Lcom/daaw/zg3;)V

    iget-object v0, p0, Lcom/daaw/vg4;->b:Lcom/daaw/jm3;

    iget-object v1, p0, Lcom/daaw/vg4;->f:Lcom/daaw/zg3;

    const-string v2, "/untrackActiveViewUnit"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/jm3;->c(Ljava/lang/String;Lcom/daaw/zg3;)V

    return-void
.end method

.method public final f(Lcom/daaw/a74;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vg4;->e:Lcom/daaw/zg3;

    const-string v1, "/updateActiveView"

    invoke-interface {p1, v1, v0}, Lcom/daaw/a74;->x(Ljava/lang/String;Lcom/daaw/zg3;)V

    iget-object v0, p0, Lcom/daaw/vg4;->f:Lcom/daaw/zg3;

    const-string v1, "/untrackActiveViewUnit"

    invoke-interface {p1, v1, v0}, Lcom/daaw/a74;->x(Ljava/lang/String;Lcom/daaw/zg3;)V

    return-void
.end method
