.class public final Lcom/daaw/b97;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/b97;->a:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic c(Lcom/daaw/b97;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/b97;->d()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/z87;)Lcom/daaw/b97;
    .locals 1

    invoke-static {p1}, Lcom/daaw/z87;->g(Lcom/daaw/z87;)Lcom/daaw/b97;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {p1}, Lcom/daaw/z87;->k(Lcom/daaw/z87;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/b97;->d()V

    :cond_0
    invoke-static {p1, p0}, Lcom/daaw/z87;->i(Lcom/daaw/z87;Lcom/daaw/b97;)V

    iget-object v0, p0, Lcom/daaw/b97;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Entry has already been added to a KeysetHandle.Builder"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()Lcom/daaw/d97;
    .locals 14

    invoke-static {}, Lcom/daaw/dn7;->N()Lcom/daaw/an7;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/b97;->a:Ljava/util/List;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ge v3, v4, :cond_2

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/z87;

    invoke-static {v4}, Lcom/daaw/z87;->f(Lcom/daaw/z87;)Lcom/daaw/a97;

    move-result-object v4

    invoke-static {}, Lcom/daaw/a97;->a()Lcom/daaw/a97;

    move-result-object v5

    if-ne v4, v5, :cond_1

    add-int/lit8 v4, v3, 0x1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/z87;

    invoke-static {v4}, Lcom/daaw/z87;->f(Lcom/daaw/z87;)Lcom/daaw/a97;

    move-result-object v4

    invoke-static {}, Lcom/daaw/a97;->a()Lcom/daaw/a97;

    move-result-object v5

    if-ne v4, v5, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Entries with \'withRandomId()\' may only be followed by other entries with \'withRandomId()\'."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iget-object v3, p0, Lcom/daaw/b97;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    move-object v5, v4

    :cond_3
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/daaw/z87;

    invoke-static {v6}, Lcom/daaw/z87;->b(Lcom/daaw/z87;)Lcom/daaw/v87;

    invoke-static {v6}, Lcom/daaw/z87;->f(Lcom/daaw/z87;)Lcom/daaw/a97;

    move-result-object v7

    if-eqz v7, :cond_d

    invoke-static {v6}, Lcom/daaw/z87;->f(Lcom/daaw/z87;)Lcom/daaw/a97;

    move-result-object v7

    invoke-static {}, Lcom/daaw/a97;->a()Lcom/daaw/a97;

    move-result-object v8

    const/4 v9, 0x3

    const/4 v10, 0x4

    if-ne v7, v8, :cond_6

    const/4 v7, 0x0

    :goto_3
    if-eqz v7, :cond_4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v1, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    :cond_4
    new-instance v7, Ljava/security/SecureRandom;

    invoke-direct {v7}, Ljava/security/SecureRandom;-><init>()V

    new-array v8, v10, [B

    const/4 v11, 0x0

    :goto_4
    if-nez v11, :cond_5

    invoke-virtual {v7, v8}, Ljava/security/SecureRandom;->nextBytes([B)V

    aget-byte v11, v8, v2

    and-int/lit8 v11, v11, 0x7f

    shl-int/lit8 v11, v11, 0x18

    const/4 v12, 0x1

    aget-byte v12, v8, v12

    and-int/lit16 v12, v12, 0xff

    shl-int/lit8 v12, v12, 0x10

    or-int/2addr v11, v12

    const/4 v12, 0x2

    aget-byte v12, v8, v12

    and-int/lit16 v12, v12, 0xff

    shl-int/lit8 v12, v12, 0x8

    or-int/2addr v11, v12

    aget-byte v12, v8, v9

    and-int/lit16 v12, v12, 0xff

    or-int/2addr v11, v12

    goto :goto_4

    :cond_5
    move v7, v11

    goto :goto_3

    :cond_6
    invoke-static {v6}, Lcom/daaw/z87;->f(Lcom/daaw/z87;)Lcom/daaw/a97;

    const/4 v7, 0x0

    :cond_7
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v1, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_c

    invoke-interface {v1, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {v6}, Lcom/daaw/z87;->a(Lcom/daaw/z87;)Lcom/daaw/m87;

    invoke-static {v6}, Lcom/daaw/z87;->h(Lcom/daaw/z87;)Lcom/daaw/l97;

    move-result-object v11

    invoke-virtual {v6}, Lcom/daaw/z87;->c()Lcom/daaw/v87;

    move-result-object v12

    sget-object v13, Lcom/daaw/v87;->b:Lcom/daaw/v87;

    invoke-virtual {v13, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    goto :goto_5

    :cond_8
    sget-object v9, Lcom/daaw/v87;->c:Lcom/daaw/v87;

    invoke-virtual {v9, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    const/4 v9, 0x4

    goto :goto_5

    :cond_9
    sget-object v9, Lcom/daaw/v87;->d:Lcom/daaw/v87;

    invoke-virtual {v9, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    const/4 v9, 0x5

    :goto_5
    check-cast v11, Lcom/daaw/je7;

    invoke-virtual {v11}, Lcom/daaw/je7;->a()Lcom/daaw/ff7;

    move-result-object v10

    invoke-virtual {v10}, Lcom/daaw/ff7;->b()Lcom/daaw/vm7;

    move-result-object v11

    invoke-static {v11}, Lcom/daaw/w97;->c(Lcom/daaw/vm7;)Lcom/daaw/nm7;

    move-result-object v11

    invoke-static {}, Lcom/daaw/cn7;->N()Lcom/daaw/bn7;

    move-result-object v12

    invoke-virtual {v12, v7}, Lcom/daaw/bn7;->t(I)Lcom/daaw/bn7;

    invoke-virtual {v12, v9}, Lcom/daaw/bn7;->v(I)Lcom/daaw/bn7;

    invoke-virtual {v12, v11}, Lcom/daaw/bn7;->s(Lcom/daaw/nm7;)Lcom/daaw/bn7;

    invoke-virtual {v10}, Lcom/daaw/ff7;->b()Lcom/daaw/vm7;

    move-result-object v7

    invoke-virtual {v7}, Lcom/daaw/vm7;->O()Lcom/daaw/zn7;

    move-result-object v7

    invoke-virtual {v12, v7}, Lcom/daaw/bn7;->u(Lcom/daaw/zn7;)Lcom/daaw/bn7;

    invoke-virtual {v12}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object v7

    check-cast v7, Lcom/daaw/cn7;

    invoke-virtual {v0, v7}, Lcom/daaw/an7;->s(Lcom/daaw/cn7;)Lcom/daaw/an7;

    invoke-static {v6}, Lcom/daaw/z87;->k(Lcom/daaw/z87;)Z

    move-result v6

    if-eqz v6, :cond_3

    if-nez v5, :cond_a

    move-object v5, v8

    goto/16 :goto_2

    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Two primaries were set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unknown key status"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Id "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " is used twice in the keyset"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "No ID was set (with withFixedId or withRandomId)"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    if-eqz v5, :cond_f

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/an7;->t(I)Lcom/daaw/an7;

    new-instance v1, Lcom/daaw/d97;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object v0

    check-cast v0, Lcom/daaw/dn7;

    invoke-direct {v1, v0, v4}, Lcom/daaw/d97;-><init>(Lcom/daaw/dn7;Lcom/daaw/c97;)V

    return-object v1

    :cond_f
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "No primary was set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    goto :goto_7

    :goto_6
    throw v0

    :goto_7
    goto :goto_6
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/b97;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/z87;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/daaw/z87;->j(Lcom/daaw/z87;Z)V

    goto :goto_0

    :cond_0
    return-void
.end method
