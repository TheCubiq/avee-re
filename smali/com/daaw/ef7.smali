.class public final Lcom/daaw/ef7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/gf7;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/daaw/dq7;

.field public final c:Lcom/daaw/yq7;

.field public final d:Lcom/daaw/mm7;

.field public final e:Lcom/daaw/zn7;

.field public final f:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/daaw/yq7;Lcom/daaw/mm7;Lcom/daaw/zn7;Ljava/lang/Integer;)V
    .locals 0
    .param p5    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ef7;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/pf7;->a(Ljava/lang/String;)Lcom/daaw/dq7;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ef7;->b:Lcom/daaw/dq7;

    iput-object p2, p0, Lcom/daaw/ef7;->c:Lcom/daaw/yq7;

    iput-object p3, p0, Lcom/daaw/ef7;->d:Lcom/daaw/mm7;

    iput-object p4, p0, Lcom/daaw/ef7;->e:Lcom/daaw/zn7;

    iput-object p5, p0, Lcom/daaw/ef7;->f:Ljava/lang/Integer;

    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/daaw/yq7;Lcom/daaw/mm7;Lcom/daaw/zn7;Ljava/lang/Integer;)Lcom/daaw/ef7;
    .locals 7
    .param p4    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    sget-object v0, Lcom/daaw/zn7;->t:Lcom/daaw/zn7;

    if-ne p3, v0, :cond_1

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Keys with output prefix type raw should not have an id requirement."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    if-eqz p4, :cond_2

    :goto_0
    new-instance v6, Lcom/daaw/ef7;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/daaw/ef7;-><init>(Ljava/lang/String;Lcom/daaw/yq7;Lcom/daaw/mm7;Lcom/daaw/zn7;Ljava/lang/Integer;)V

    return-object v6

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Keys with output prefix type different from raw should have an id requirement."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final b()Lcom/daaw/mm7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ef7;->d:Lcom/daaw/mm7;

    return-object v0
.end method

.method public final c()Lcom/daaw/zn7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ef7;->e:Lcom/daaw/zn7;

    return-object v0
.end method

.method public final d()Lcom/daaw/yq7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ef7;->c:Lcom/daaw/yq7;

    return-object v0
.end method

.method public final e()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/daaw/ef7;->f:Ljava/lang/Integer;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ef7;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final zzd()Lcom/daaw/dq7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ef7;->b:Lcom/daaw/dq7;

    return-object v0
.end method
