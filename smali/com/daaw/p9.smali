.class public final Lcom/daaw/p9;
.super Lcom/daaw/db1;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/p9$b;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/sn1;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/daaw/xx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/xx<",
            "*>;"
        }
    .end annotation
.end field

.field public final d:Lcom/daaw/hn1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/hn1<",
            "*[B>;"
        }
    .end annotation
.end field

.field public final e:Lcom/daaw/bx;


# direct methods
.method public constructor <init>(Lcom/daaw/sn1;Ljava/lang/String;Lcom/daaw/xx;Lcom/daaw/hn1;Lcom/daaw/bx;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/sn1;",
            "Ljava/lang/String;",
            "Lcom/daaw/xx<",
            "*>;",
            "Lcom/daaw/hn1<",
            "*[B>;",
            "Lcom/daaw/bx;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/daaw/db1;-><init>()V

    iput-object p1, p0, Lcom/daaw/p9;->a:Lcom/daaw/sn1;

    iput-object p2, p0, Lcom/daaw/p9;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/p9;->c:Lcom/daaw/xx;

    iput-object p4, p0, Lcom/daaw/p9;->d:Lcom/daaw/hn1;

    iput-object p5, p0, Lcom/daaw/p9;->e:Lcom/daaw/bx;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/sn1;Ljava/lang/String;Lcom/daaw/xx;Lcom/daaw/hn1;Lcom/daaw/bx;Lcom/daaw/p9$a;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/daaw/p9;-><init>(Lcom/daaw/sn1;Ljava/lang/String;Lcom/daaw/xx;Lcom/daaw/hn1;Lcom/daaw/bx;)V

    return-void
.end method


# virtual methods
.method public b()Lcom/daaw/bx;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p9;->e:Lcom/daaw/bx;

    return-object v0
.end method

.method public c()Lcom/daaw/xx;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/xx<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/p9;->c:Lcom/daaw/xx;

    return-object v0
.end method

.method public e()Lcom/daaw/hn1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/hn1<",
            "*[B>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/p9;->d:Lcom/daaw/hn1;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/daaw/db1;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lcom/daaw/db1;

    iget-object v1, p0, Lcom/daaw/p9;->a:Lcom/daaw/sn1;

    invoke-virtual {p1}, Lcom/daaw/db1;->f()Lcom/daaw/sn1;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/p9;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/daaw/db1;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/p9;->c:Lcom/daaw/xx;

    invoke-virtual {p1}, Lcom/daaw/db1;->c()Lcom/daaw/xx;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/p9;->d:Lcom/daaw/hn1;

    invoke-virtual {p1}, Lcom/daaw/db1;->e()Lcom/daaw/hn1;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/p9;->e:Lcom/daaw/bx;

    invoke-virtual {p1}, Lcom/daaw/db1;->b()Lcom/daaw/bx;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/daaw/bx;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public f()Lcom/daaw/sn1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p9;->a:Lcom/daaw/sn1;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p9;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/daaw/p9;->a:Lcom/daaw/sn1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    iget-object v2, p0, Lcom/daaw/p9;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    iget-object v2, p0, Lcom/daaw/p9;->c:Lcom/daaw/xx;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    iget-object v2, p0, Lcom/daaw/p9;->d:Lcom/daaw/hn1;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    iget-object v1, p0, Lcom/daaw/p9;->e:Lcom/daaw/bx;

    invoke-virtual {v1}, Lcom/daaw/bx;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SendRequest{transportContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/p9;->a:Lcom/daaw/sn1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transportName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/p9;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", event="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/p9;->c:Lcom/daaw/xx;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transformer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/p9;->d:Lcom/daaw/hn1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", encoding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/p9;->e:Lcom/daaw/bx;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
