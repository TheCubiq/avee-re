.class public Lcom/daaw/tb;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/tb$b;,
        Lcom/daaw/tb$c;,
        Lcom/daaw/tb$a;
    }
.end annotation


# instance fields
.field public a:Z

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Lcom/daaw/tb$c;

.field public e:Lcom/daaw/rt8;

.field public f:Ljava/util/ArrayList;

.field public g:Z


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/qw2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/daaw/tb$a;
    .locals 2

    new-instance v0, Lcom/daaw/tb$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/tb$a;-><init>(Lcom/daaw/cr2;)V

    return-object v0
.end method

.method public static bridge synthetic h(Lcom/daaw/tb;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/tb;->a:Z

    return-void
.end method

.method public static bridge synthetic i(Lcom/daaw/tb;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/tb;->g:Z

    return-void
.end method

.method public static bridge synthetic j(Lcom/daaw/tb;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/tb;->b:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic k(Lcom/daaw/tb;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/tb;->c:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic l(Lcom/daaw/tb;Lcom/daaw/rt8;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/tb;->e:Lcom/daaw/rt8;

    return-void
.end method

.method public static bridge synthetic m(Lcom/daaw/tb;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/tb;->f:Ljava/util/ArrayList;

    return-void
.end method

.method public static bridge synthetic n(Lcom/daaw/tb;Lcom/daaw/tb$c;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/tb;->d:Lcom/daaw/tb$c;

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/tb;->d:Lcom/daaw/tb$c;

    invoke-virtual {v0}, Lcom/daaw/tb$c;->b()I

    move-result v0

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tb;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tb;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tb;->d:Lcom/daaw/tb$c;

    invoke-virtual {v0}, Lcom/daaw/tb$c;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/util/ArrayList;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/daaw/tb;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public final g()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tb;->e:Lcom/daaw/rt8;

    return-object v0
.end method

.method public final o()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/tb;->g:Z

    return v0
.end method

.method public final p()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/tb;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/tb;->c:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/tb;->d:Lcom/daaw/tb$c;

    invoke-virtual {v0}, Lcom/daaw/tb$c;->b()I

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/tb;->a:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/tb;->g:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
