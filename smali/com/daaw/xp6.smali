.class public final Lcom/daaw/xp6;
.super Lcom/daaw/tp6;
.source ""


# static fields
.field public static final i:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Lcom/daaw/vp6;

.field public final b:Lcom/daaw/up6;

.field public final c:Ljava/util/List;

.field public d:Lcom/daaw/wr6;

.field public e:Lcom/daaw/xq6;

.field public f:Z

.field public g:Z

.field public final h:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "^[a-zA-Z0-9 ]+$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/daaw/xp6;->i:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/up6;Lcom/daaw/vp6;)V
    .locals 3

    invoke-direct {p0}, Lcom/daaw/tp6;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/xp6;->c:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/xp6;->f:Z

    iput-boolean v0, p0, Lcom/daaw/xp6;->g:Z

    iput-object p1, p0, Lcom/daaw/xp6;->b:Lcom/daaw/up6;

    iput-object p2, p0, Lcom/daaw/xp6;->a:Lcom/daaw/vp6;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/xp6;->h:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/xp6;->k(Landroid/view/View;)V

    invoke-virtual {p2}, Lcom/daaw/vp6;->d()Lcom/daaw/wp6;

    move-result-object v1

    sget-object v2, Lcom/daaw/wp6;->q:Lcom/daaw/wp6;

    if-eq v1, v2, :cond_1

    invoke-virtual {p2}, Lcom/daaw/vp6;->d()Lcom/daaw/wp6;

    move-result-object v1

    sget-object v2, Lcom/daaw/wp6;->s:Lcom/daaw/wp6;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/daaw/ar6;

    invoke-virtual {p2}, Lcom/daaw/vp6;->i()Ljava/util/Map;

    move-result-object p2

    invoke-direct {v1, p2, v0}, Lcom/daaw/ar6;-><init>(Ljava/util/Map;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/daaw/xp6;->e:Lcom/daaw/xq6;

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, Lcom/daaw/yq6;

    invoke-virtual {p2}, Lcom/daaw/vp6;->a()Landroid/webkit/WebView;

    move-result-object p2

    invoke-direct {v0, p2}, Lcom/daaw/yq6;-><init>(Landroid/webkit/WebView;)V

    iput-object v0, p0, Lcom/daaw/xp6;->e:Lcom/daaw/xq6;

    :goto_1
    iget-object p2, p0, Lcom/daaw/xp6;->e:Lcom/daaw/xq6;

    invoke-virtual {p2}, Lcom/daaw/xq6;->j()V

    invoke-static {}, Lcom/daaw/lq6;->a()Lcom/daaw/lq6;

    move-result-object p2

    invoke-virtual {p2, p0}, Lcom/daaw/lq6;->d(Lcom/daaw/xp6;)V

    iget-object p2, p0, Lcom/daaw/xp6;->e:Lcom/daaw/xq6;

    invoke-static {}, Lcom/daaw/qq6;->a()Lcom/daaw/qq6;

    move-result-object v0

    invoke-virtual {p2}, Lcom/daaw/xq6;->a()Landroid/webkit/WebView;

    move-result-object p2

    invoke-virtual {p1}, Lcom/daaw/up6;->b()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lcom/daaw/qq6;->d(Landroid/webkit/WebView;Lorg/json/JSONObject;)V

    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;Lcom/daaw/zp6;Ljava/lang/String;)V
    .locals 3

    iget-boolean p3, p0, Lcom/daaw/xp6;->g:Z

    if-nez p3, :cond_4

    sget-object p3, Lcom/daaw/xp6;->i:Ljava/util/regex/Pattern;

    const-string v0, "Ad overlay"

    invoke-virtual {p3, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/regex/Matcher;->matches()Z

    move-result p3

    if-eqz p3, :cond_3

    iget-object p3, p0, Lcom/daaw/xp6;->c:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/nq6;

    invoke-virtual {v1}, Lcom/daaw/nq6;->b()Lcom/daaw/wr6;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, p1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    iget-object p3, p0, Lcom/daaw/xp6;->c:Ljava/util/List;

    new-instance v1, Lcom/daaw/nq6;

    invoke-direct {v1, p1, p2, v0}, Lcom/daaw/nq6;-><init>(Landroid/view/View;Lcom/daaw/zp6;Ljava/lang/String;)V

    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-void
.end method

.method public final c()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/xp6;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/xp6;->d:Lcom/daaw/wr6;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->clear()V

    iget-boolean v0, p0, Lcom/daaw/xp6;->g:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/xp6;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/xp6;->g:Z

    iget-object v0, p0, Lcom/daaw/xp6;->e:Lcom/daaw/xq6;

    invoke-static {}, Lcom/daaw/qq6;->a()Lcom/daaw/qq6;

    move-result-object v1

    invoke-virtual {v0}, Lcom/daaw/xq6;->a()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/daaw/qq6;->c(Landroid/webkit/WebView;)V

    invoke-static {}, Lcom/daaw/lq6;->a()Lcom/daaw/lq6;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/lq6;->e(Lcom/daaw/xp6;)V

    iget-object v0, p0, Lcom/daaw/xp6;->e:Lcom/daaw/xq6;

    invoke-virtual {v0}, Lcom/daaw/xq6;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/xp6;->e:Lcom/daaw/xq6;

    return-void
.end method

.method public final d(Landroid/view/View;)V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/xp6;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/xp6;->f()Landroid/view/View;

    move-result-object v0

    if-ne v0, p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lcom/daaw/xp6;->k(Landroid/view/View;)V

    iget-object v0, p0, Lcom/daaw/xp6;->e:Lcom/daaw/xq6;

    invoke-virtual {v0}, Lcom/daaw/xq6;->b()V

    invoke-static {}, Lcom/daaw/lq6;->a()Lcom/daaw/lq6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/lq6;->c()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/xp6;

    if-eq v1, p0, :cond_2

    invoke-virtual {v1}, Lcom/daaw/xp6;->f()Landroid/view/View;

    move-result-object v2

    if-ne v2, p1, :cond_2

    iget-object v1, v1, Lcom/daaw/xp6;->d:Lcom/daaw/wr6;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->clear()V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final e()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/xp6;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/xp6;->f:Z

    invoke-static {}, Lcom/daaw/lq6;->a()Lcom/daaw/lq6;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/lq6;->f(Lcom/daaw/xp6;)V

    invoke-static {}, Lcom/daaw/rq6;->b()Lcom/daaw/rq6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/rq6;->a()F

    move-result v0

    iget-object v1, p0, Lcom/daaw/xp6;->e:Lcom/daaw/xq6;

    invoke-virtual {v1, v0}, Lcom/daaw/xq6;->h(F)V

    iget-object v0, p0, Lcom/daaw/xp6;->e:Lcom/daaw/xq6;

    iget-object v1, p0, Lcom/daaw/xp6;->a:Lcom/daaw/vp6;

    invoke-virtual {v0, p0, v1}, Lcom/daaw/xq6;->f(Lcom/daaw/xp6;Lcom/daaw/vp6;)V

    return-void
.end method

.method public final f()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xp6;->d:Lcom/daaw/wr6;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final g()Lcom/daaw/xq6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xp6;->e:Lcom/daaw/xq6;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xp6;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final i()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xp6;->c:Ljava/util/List;

    return-object v0
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/xp6;->f:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/daaw/xp6;->g:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final k(Landroid/view/View;)V
    .locals 1

    new-instance v0, Lcom/daaw/wr6;

    invoke-direct {v0, p1}, Lcom/daaw/wr6;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lcom/daaw/xp6;->d:Lcom/daaw/wr6;

    return-void
.end method
