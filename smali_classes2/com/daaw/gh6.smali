.class public final Lcom/daaw/gh6;
.super Lcom/daaw/pa8;
.source ""

# interfaces
.implements Lcom/daaw/i92;


# instance fields
.field public final d:Ljava/util/Map;

.field public final e:Ljava/util/Map;

.field public final f:Ljava/util/Map;

.field public final g:Ljava/util/Map;

.field public final h:Ljava/util/Map;

.field public final i:Ljava/util/Map;

.field public final j:Lcom/daaw/wl0;

.field public final k:Lcom/daaw/zp8;

.field public final l:Ljava/util/Map;

.field public final m:Ljava/util/Map;

.field public final n:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lcom/daaw/yb8;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/daaw/pa8;-><init>(Lcom/daaw/yb8;)V

    new-instance p1, Lcom/daaw/g6;

    invoke-direct {p1}, Lcom/daaw/g6;-><init>()V

    iput-object p1, p0, Lcom/daaw/gh6;->d:Ljava/util/Map;

    new-instance p1, Lcom/daaw/g6;

    invoke-direct {p1}, Lcom/daaw/g6;-><init>()V

    iput-object p1, p0, Lcom/daaw/gh6;->e:Ljava/util/Map;

    new-instance p1, Lcom/daaw/g6;

    invoke-direct {p1}, Lcom/daaw/g6;-><init>()V

    iput-object p1, p0, Lcom/daaw/gh6;->f:Ljava/util/Map;

    new-instance p1, Lcom/daaw/g6;

    invoke-direct {p1}, Lcom/daaw/g6;-><init>()V

    iput-object p1, p0, Lcom/daaw/gh6;->g:Ljava/util/Map;

    new-instance p1, Lcom/daaw/g6;

    invoke-direct {p1}, Lcom/daaw/g6;-><init>()V

    iput-object p1, p0, Lcom/daaw/gh6;->h:Ljava/util/Map;

    new-instance p1, Lcom/daaw/g6;

    invoke-direct {p1}, Lcom/daaw/g6;-><init>()V

    iput-object p1, p0, Lcom/daaw/gh6;->l:Ljava/util/Map;

    new-instance p1, Lcom/daaw/g6;

    invoke-direct {p1}, Lcom/daaw/g6;-><init>()V

    iput-object p1, p0, Lcom/daaw/gh6;->m:Ljava/util/Map;

    new-instance p1, Lcom/daaw/g6;

    invoke-direct {p1}, Lcom/daaw/g6;-><init>()V

    iput-object p1, p0, Lcom/daaw/gh6;->n:Ljava/util/Map;

    new-instance p1, Lcom/daaw/g6;

    invoke-direct {p1}, Lcom/daaw/g6;-><init>()V

    iput-object p1, p0, Lcom/daaw/gh6;->i:Ljava/util/Map;

    new-instance p1, Lcom/daaw/xd6;

    const/16 v0, 0x14

    invoke-direct {p1, p0, v0}, Lcom/daaw/xd6;-><init>(Lcom/daaw/gh6;I)V

    iput-object p1, p0, Lcom/daaw/gh6;->j:Lcom/daaw/wl0;

    new-instance p1, Lcom/daaw/af6;

    invoke-direct {p1, p0}, Lcom/daaw/af6;-><init>(Lcom/daaw/gh6;)V

    iput-object p1, p0, Lcom/daaw/gh6;->k:Lcom/daaw/zp8;

    return-void
.end method

.method public static final p(Lcom/daaw/wd6;)Ljava/util/Map;
    .locals 3

    new-instance v0, Lcom/daaw/g6;

    invoke-direct {v0}, Lcom/daaw/g6;-><init>()V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/wd6;->P()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ii6;

    invoke-virtual {v1}, Lcom/daaw/ii6;->E()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/daaw/ii6;->F()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static bridge synthetic s(Lcom/daaw/gh6;Ljava/lang/String;)Lcom/daaw/tr3;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/pa8;->g()V

    invoke-static {p1}, Lcom/daaw/ry0;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/daaw/gh6;->C(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/gh6;->h:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/gh6;->h:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/gh6;->h:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/wd6;

    invoke-virtual {p0, p1, v0}, Lcom/daaw/gh6;->o(Ljava/lang/String;Lcom/daaw/wd6;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lcom/daaw/gh6;->n(Ljava/lang/String;)V

    :goto_0
    iget-object p0, p0, Lcom/daaw/gh6;->j:Lcom/daaw/wl0;

    invoke-virtual {p0}, Lcom/daaw/wl0;->h()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/tr3;

    :goto_1
    return-object p0
.end method

.method public static bridge synthetic x(Lcom/daaw/gh6;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/daaw/gh6;->d:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public final A(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    iget-object v0, p0, Lcom/daaw/gh6;->h:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final B(Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0, p1}, Lcom/daaw/gh6;->t(Ljava/lang/String;)Lcom/daaw/wd6;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/wd6;->S()Z

    move-result p1

    return p1
.end method

.method public final C(Ljava/lang/String;)Z
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/gh6;->h:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/wd6;

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/wd6;->D()I

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method public final D(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "measurement.upload.blacklist_internal"

    invoke-virtual {p0, p1, v0}, Lcom/daaw/gh6;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "1"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final E(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0, p1}, Lcom/daaw/gh6;->n(Ljava/lang/String;)V

    const-string v0, "ecommerce_purchase"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const-string v0, "purchase"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "refund"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/gh6;->g:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-nez p1, :cond_2

    return v0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_3
    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public final F(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0, p1}, Lcom/daaw/gh6;->n(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/daaw/gh6;->D(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-static {p2}, Lcom/daaw/dd8;->W(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lcom/daaw/gh6;->G(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p2}, Lcom/daaw/dd8;->X(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    return v1

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/daaw/gh6;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-nez p1, :cond_4

    return v0

    :cond_4
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_5
    return v0
.end method

.method public final G(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "measurement.upload.blacklist_public"

    invoke-virtual {p0, p1, v0}, Lcom/daaw/gh6;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "1"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final H(Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)Z
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/pa8;->g()V

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-static {p1}, Lcom/daaw/ry0;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/gh6;->l(Ljava/lang/String;[B)Lcom/daaw/wd6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/ja8;->A()Lcom/daaw/y98;

    move-result-object v0

    check-cast v0, Lcom/daaw/tc6;

    invoke-virtual {p0, p1, v0}, Lcom/daaw/gh6;->m(Ljava/lang/String;Lcom/daaw/tc6;)V

    invoke-virtual {v0}, Lcom/daaw/y98;->m()Lcom/daaw/ja8;

    move-result-object v1

    check-cast v1, Lcom/daaw/wd6;

    invoke-virtual {p0, p1, v1}, Lcom/daaw/gh6;->o(Ljava/lang/String;Lcom/daaw/wd6;)V

    iget-object v1, p0, Lcom/daaw/gh6;->h:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/daaw/y98;->m()Lcom/daaw/ja8;

    move-result-object v2

    check-cast v2, Lcom/daaw/wd6;

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/gh6;->l:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/daaw/tc6;->w()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/gh6;->m:Ljava/util/Map;

    invoke-interface {v1, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/gh6;->n:Ljava/util/Map;

    invoke-interface {v1, p1, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/gh6;->d:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/daaw/y98;->m()Lcom/daaw/ja8;

    move-result-object v2

    check-cast v2, Lcom/daaw/wd6;

    invoke-static {v2}, Lcom/daaw/gh6;->p(Lcom/daaw/wd6;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v1}, Lcom/daaw/yb8;->W()Lcom/daaw/uh2;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lcom/daaw/tc6;->x()Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, p1, v2}, Lcom/daaw/uh2;->m(Ljava/lang/String;Ljava/util/List;)V

    :try_start_0
    invoke-virtual {v0}, Lcom/daaw/tc6;->u()Lcom/daaw/tc6;

    invoke-virtual {v0}, Lcom/daaw/y98;->m()Lcom/daaw/ja8;

    move-result-object v1

    check-cast v1, Lcom/daaw/wd6;

    invoke-virtual {v1}, Lcom/daaw/w48;->i()[B

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    iget-object v2, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object v2

    invoke-static {p1}, Lcom/daaw/om5;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "Unable to serialize reduced-size config. Storing full config instead. appId"

    invoke-virtual {v2, v4, v3, v1}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    iget-object v1, p0, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v1}, Lcom/daaw/yb8;->W()Lcom/daaw/uh2;

    move-result-object v1

    invoke-static {p1}, Lcom/daaw/ry0;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v1}, Lcom/daaw/rc7;->f()V

    invoke-virtual {v1}, Lcom/daaw/pa8;->g()V

    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    const-string v3, "remote_config"

    invoke-virtual {v2, v3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const-string p2, "config_last_modified_time"

    invoke-virtual {v2, p2, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object p2

    const/4 p3, 0x0

    sget-object v3, Lcom/daaw/m75;->q0:Lcom/daaw/j65;

    invoke-virtual {p2, p3, v3}, Lcom/daaw/qa2;->B(Ljava/lang/String;Lcom/daaw/j65;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "e_tag"

    invoke-virtual {v2, p2, p4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 p2, 0x1

    :try_start_1
    invoke-virtual {v1}, Lcom/daaw/uh2;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p3

    new-array p4, p2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p1, p4, v3

    const-string v3, "apps"

    const-string v4, "app_id = ?"

    invoke-virtual {p3, v3, v2, v4, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p3

    int-to-long p3, p3

    const-wide/16 v2, 0x0

    cmp-long v4, p3, v2

    if-nez v4, :cond_1

    iget-object p3, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p3}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p3

    invoke-virtual {p3}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p3

    const-string p4, "Failed to update remote config (got 0). appId"

    invoke-static {p1}, Lcom/daaw/om5;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p3, p4, v2}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p3

    iget-object p4, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p4}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p4

    invoke-virtual {p4}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p4

    invoke-static {p1}, Lcom/daaw/om5;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Error storing remote config. appId"

    invoke-virtual {p4, v2, v1, p3}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    :goto_1
    iget-object p3, p0, Lcom/daaw/gh6;->h:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/daaw/y98;->m()Lcom/daaw/ja8;

    move-result-object p4

    check-cast p4, Lcom/daaw/wd6;

    invoke-interface {p3, p1, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return p2
.end method

.method public final I(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0, p1}, Lcom/daaw/gh6;->n(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/gh6;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/gh6;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    const-string v0, "app_instance_id"

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final J(Ljava/lang/String;)Z
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0, p1}, Lcom/daaw/gh6;->n(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/gh6;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/gh6;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    const-string v3, "device_model"

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/gh6;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    const-string v0, "device_info"

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :cond_2
    return v1
.end method

.method public final K(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0, p1}, Lcom/daaw/gh6;->n(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/gh6;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/gh6;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    const-string v0, "enhanced_user_id"

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final L(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0, p1}, Lcom/daaw/gh6;->n(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/gh6;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/gh6;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    const-string v0, "google_signals"

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final M(Ljava/lang/String;)Z
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0, p1}, Lcom/daaw/gh6;->n(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/gh6;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/gh6;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    const-string v3, "os_version"

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/gh6;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    const-string v0, "device_info"

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :cond_2
    return v1
.end method

.method public final N(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0, p1}, Lcom/daaw/gh6;->n(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/gh6;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/gh6;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    const-string v0, "user_id"

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0, p1}, Lcom/daaw/gh6;->n(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/gh6;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final l(Ljava/lang/String;[B)Lcom/daaw/wd6;
    .locals 7

    const-string v0, "Unable to merge remote config. appId"

    if-nez p2, :cond_0

    invoke-static {}, Lcom/daaw/wd6;->J()Lcom/daaw/wd6;

    move-result-object p1

    return-object p1

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/daaw/wd6;->H()Lcom/daaw/tc6;

    move-result-object v1

    invoke-static {v1, p2}, Lcom/daaw/ec8;->C(Lcom/daaw/xd8;[B)Lcom/daaw/xd8;

    move-result-object p2

    check-cast p2, Lcom/daaw/tc6;

    invoke-virtual {p2}, Lcom/daaw/y98;->m()Lcom/daaw/ja8;

    move-result-object p2

    check-cast p2, Lcom/daaw/wd6;

    iget-object v1, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v1

    const-string v2, "Parsed config. version, gmp_app_id"

    invoke-virtual {p2}, Lcom/daaw/wd6;->U()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {p2}, Lcom/daaw/wd6;->F()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v4

    :goto_0
    invoke-virtual {p2}, Lcom/daaw/wd6;->T()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {p2}, Lcom/daaw/wd6;->K()Ljava/lang/String;

    move-result-object v4

    :cond_2
    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/daaw/mb8; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p2

    :goto_1
    iget-object v1, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object v1

    invoke-static {p1}, Lcom/daaw/om5;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v0, p1, p2}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/daaw/wd6;->J()Lcom/daaw/wd6;

    move-result-object p1

    return-object p1

    :catch_1
    move-exception p2

    goto :goto_1
.end method

.method public final m(Ljava/lang/String;Lcom/daaw/tc6;)V
    .locals 9

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    new-instance v1, Lcom/daaw/g6;

    invoke-direct {v1}, Lcom/daaw/g6;-><init>()V

    new-instance v2, Lcom/daaw/g6;

    invoke-direct {v2}, Lcom/daaw/g6;-><init>()V

    new-instance v3, Lcom/daaw/g6;

    invoke-direct {v3}, Lcom/daaw/g6;-><init>()V

    invoke-virtual {p2}, Lcom/daaw/tc6;->y()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/k96;

    invoke-virtual {v5}, Lcom/daaw/k96;->E()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {p2}, Lcom/daaw/tc6;->s()I

    move-result v5

    if-ge v4, v5, :cond_8

    invoke-virtual {p2, v4}, Lcom/daaw/tc6;->t(I)Lcom/daaw/qb6;

    move-result-object v5

    invoke-virtual {v5}, Lcom/daaw/ja8;->A()Lcom/daaw/y98;

    move-result-object v5

    check-cast v5, Lcom/daaw/na6;

    invoke-virtual {v5}, Lcom/daaw/na6;->u()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v5, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v5}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v5

    invoke-virtual {v5}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object v5

    const-string v6, "EventConfig contained null event name"

    invoke-virtual {v5, v6}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_1
    invoke-virtual {v5}, Lcom/daaw/na6;->u()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lcom/daaw/na6;->u()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/daaw/dh7;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_2

    invoke-virtual {v5, v7}, Lcom/daaw/na6;->t(Ljava/lang/String;)Lcom/daaw/na6;

    invoke-virtual {p2, v4, v5}, Lcom/daaw/tc6;->v(ILcom/daaw/na6;)Lcom/daaw/tc6;

    :cond_2
    invoke-virtual {v5}, Lcom/daaw/na6;->x()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v5}, Lcom/daaw/na6;->v()Z

    move-result v7

    if-eqz v7, :cond_3

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v1, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {v5}, Lcom/daaw/na6;->y()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v5}, Lcom/daaw/na6;->w()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v5}, Lcom/daaw/na6;->u()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    invoke-virtual {v5}, Lcom/daaw/na6;->z()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-virtual {v5}, Lcom/daaw/na6;->s()I

    move-result v6

    const/4 v7, 0x2

    if-lt v6, v7, :cond_6

    invoke-virtual {v5}, Lcom/daaw/na6;->s()I

    move-result v6

    const v7, 0xffff

    if-le v6, v7, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v5}, Lcom/daaw/na6;->u()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lcom/daaw/na6;->s()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_6
    :goto_2
    iget-object v6, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v6}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v6

    invoke-virtual {v6}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object v6

    invoke-virtual {v5}, Lcom/daaw/na6;->u()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5}, Lcom/daaw/na6;->s()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v8, "Invalid sampling rate. Event name, sample rate"

    invoke-virtual {v6, v8, v7, v5}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_7
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    :cond_8
    iget-object p2, p0, Lcom/daaw/gh6;->e:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/daaw/gh6;->f:Ljava/util/Map;

    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/daaw/gh6;->g:Ljava/util/Map;

    invoke-interface {p2, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/daaw/gh6;->i:Ljava/util/Map;

    invoke-interface {p2, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final n(Ljava/lang/String;)V
    .locals 12

    invoke-virtual {p0}, Lcom/daaw/pa8;->g()V

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-static {p1}, Lcom/daaw/ry0;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/gh6;->h:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->W()Lcom/daaw/uh2;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/ry0;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {v0}, Lcom/daaw/pa8;->g()V

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0}, Lcom/daaw/uh2;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const-string v3, "remote_config"

    const-string v4, "config_last_modified_time"

    const-string v5, "e_tag"

    filled-new-array {v3, v4, v5}, [Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x1

    new-array v6, v10, [Ljava/lang/String;

    const/4 v11, 0x0

    aput-object p1, v6, v11

    const-string v3, "apps"

    const-string v5, "app_id=?"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v3

    invoke-interface {v2, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v5}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v5

    sget-object v6, Lcom/daaw/m75;->q0:Lcom/daaw/j65;

    invoke-virtual {v5, v1, v6}, Lcom/daaw/qa2;->B(Ljava/lang/String;Lcom/daaw/j65;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x2

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_1
    move-object v5, v1

    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v6, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v6}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v6

    invoke-virtual {v6}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object v6

    const-string v7, "Got multiple records for app config, expected one. appId"

    invoke-static {p1}, Lcom/daaw/om5;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    new-instance v6, Lcom/daaw/ge2;

    invoke-direct {v6, v3, v4, v5}, Lcom/daaw/ge2;-><init>([BLjava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    goto :goto_3

    :catch_0
    move-exception v3

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :catch_1
    move-exception v2

    move-object v3, v2

    move-object v2, v1

    :goto_1
    :try_start_2
    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object v0

    const-string v4, "Error querying remote config. appId"

    invoke-static {p1}, Lcom/daaw/om5;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v4, v5, v3}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v2, :cond_4

    :goto_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_4
    move-object v6, v1

    :goto_3
    if-nez v6, :cond_5

    iget-object v0, p0, Lcom/daaw/gh6;->d:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/gh6;->f:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/gh6;->e:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/gh6;->g:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/gh6;->h:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/gh6;->l:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/gh6;->m:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/gh6;->n:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/gh6;->i:Ljava/util/Map;

    :goto_4
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_5
    iget-object v0, v6, Lcom/daaw/ge2;->a:[B

    invoke-virtual {p0, p1, v0}, Lcom/daaw/gh6;->l(Ljava/lang/String;[B)Lcom/daaw/wd6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/ja8;->A()Lcom/daaw/y98;

    move-result-object v0

    check-cast v0, Lcom/daaw/tc6;

    invoke-virtual {p0, p1, v0}, Lcom/daaw/gh6;->m(Ljava/lang/String;Lcom/daaw/tc6;)V

    iget-object v1, p0, Lcom/daaw/gh6;->d:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/daaw/y98;->m()Lcom/daaw/ja8;

    move-result-object v2

    check-cast v2, Lcom/daaw/wd6;

    invoke-static {v2}, Lcom/daaw/gh6;->p(Lcom/daaw/wd6;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/gh6;->h:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/daaw/y98;->m()Lcom/daaw/ja8;

    move-result-object v2

    check-cast v2, Lcom/daaw/wd6;

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/daaw/y98;->m()Lcom/daaw/ja8;

    move-result-object v1

    check-cast v1, Lcom/daaw/wd6;

    invoke-virtual {p0, p1, v1}, Lcom/daaw/gh6;->o(Ljava/lang/String;Lcom/daaw/wd6;)V

    iget-object v1, p0, Lcom/daaw/gh6;->l:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/daaw/tc6;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/gh6;->m:Ljava/util/Map;

    iget-object v1, v6, Lcom/daaw/ge2;->b:Ljava/lang/String;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/gh6;->n:Ljava/util/Map;

    iget-object v1, v6, Lcom/daaw/ge2;->c:Ljava/lang/String;

    goto :goto_4

    :catchall_1
    move-exception p1

    move-object v1, v2

    :goto_5
    if-eqz v1, :cond_6

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_6
    throw p1

    :cond_7
    return-void
.end method

.method public final o(Ljava/lang/String;Lcom/daaw/wd6;)V
    .locals 3

    invoke-virtual {p2}, Lcom/daaw/wd6;->D()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v0

    invoke-virtual {p2}, Lcom/daaw/wd6;->D()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "EES programs found"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lcom/daaw/wd6;->O()Ljava/util/List;

    move-result-object p2

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/rm7;

    :try_start_0
    new-instance v0, Lcom/daaw/tr3;

    invoke-direct {v0}, Lcom/daaw/tr3;-><init>()V

    const-string v1, "internal.remoteConfig"

    new-instance v2, Lcom/daaw/oa6;

    invoke-direct {v2, p0, p1}, Lcom/daaw/oa6;-><init>(Lcom/daaw/gh6;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lcom/daaw/tr3;->d(Ljava/lang/String;Ljava/util/concurrent/Callable;)V

    new-instance v1, Lcom/daaw/rb6;

    invoke-direct {v1, p0, p1}, Lcom/daaw/rb6;-><init>(Lcom/daaw/gh6;Ljava/lang/String;)V

    const-string v2, "internal.appMetadata"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/tr3;->d(Ljava/lang/String;Ljava/util/concurrent/Callable;)V

    new-instance v1, Lcom/daaw/uc6;

    invoke-direct {v1, p0}, Lcom/daaw/uc6;-><init>(Lcom/daaw/gh6;)V

    const-string v2, "internal.logger"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/tr3;->d(Ljava/lang/String;Ljava/util/concurrent/Callable;)V

    invoke-virtual {v0, p2}, Lcom/daaw/tr3;->c(Lcom/daaw/rm7;)V

    iget-object v1, p0, Lcom/daaw/gh6;->j:Lcom/daaw/wl0;

    invoke-virtual {v1, p1, v0}, Lcom/daaw/wl0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v0

    const-string v1, "EES program loaded for appId, activities"

    invoke-virtual {p2}, Lcom/daaw/rm7;->D()Lcom/daaw/fi7;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/fi7;->D()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lcom/daaw/rm7;->D()Lcom/daaw/fi7;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/fi7;->G()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/lk7;

    iget-object v1, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v1

    const-string v2, "EES program activity"

    invoke-virtual {v0}, Lcom/daaw/lk7;->E()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/daaw/sk4; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    iget-object p2, p0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p2

    const-string v0, "Failed to load EES program. appId"

    invoke-virtual {p2, v0, p1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object p2, p0, Lcom/daaw/gh6;->j:Lcom/daaw/wl0;

    invoke-virtual {p2, p1}, Lcom/daaw/wl0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final q(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0, p1}, Lcom/daaw/gh6;->n(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/gh6;->i:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_1
    return v0
.end method

.method public final t(Ljava/lang/String;)Lcom/daaw/wd6;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/pa8;->g()V

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-static {p1}, Lcom/daaw/ry0;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/daaw/gh6;->n(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/gh6;->h:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/wd6;

    return-object p1
.end method

.method public final u(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    iget-object v0, p0, Lcom/daaw/gh6;->n:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final v(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    iget-object v0, p0, Lcom/daaw/gh6;->m:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final w(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0, p1}, Lcom/daaw/gh6;->n(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/gh6;->l:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final y(Ljava/lang/String;)Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {p0, p1}, Lcom/daaw/gh6;->n(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/gh6;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    return-object p1
.end method

.method public final z(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/rc7;->f()V

    iget-object v0, p0, Lcom/daaw/gh6;->m:Ljava/util/Map;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
