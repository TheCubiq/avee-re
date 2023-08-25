.class public Lcom/daaw/yu0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/hi0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/daaw/hi0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/daaw/hi0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/yu0;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/yu0;->b:Lcom/daaw/hi0;

    return-void
.end method


# virtual methods
.method public a(Ljava/security/MessageDigest;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/yu0;->a:Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    iget-object v0, p0, Lcom/daaw/yu0;->b:Lcom/daaw/hi0;

    invoke-interface {v0, p1}, Lcom/daaw/hi0;->a(Ljava/security/MessageDigest;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/daaw/yu0;

    iget-object v2, p0, Lcom/daaw/yu0;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/daaw/yu0;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lcom/daaw/yu0;->b:Lcom/daaw/hi0;

    iget-object p1, p1, Lcom/daaw/yu0;->b:Lcom/daaw/hi0;

    invoke-interface {v2, p1}, Lcom/daaw/hi0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/yu0;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/yu0;->b:Lcom/daaw/hi0;

    invoke-interface {v1}, Lcom/daaw/hi0;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
