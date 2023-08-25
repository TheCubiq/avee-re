.class public final Lcom/daaw/o8;
.super Lcom/daaw/lm$e$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/o8$b;
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:Lcom/daaw/lm$e$d$a;

.field public final d:Lcom/daaw/lm$e$d$c;

.field public final e:Lcom/daaw/lm$e$d$d;


# direct methods
.method public constructor <init>(JLjava/lang/String;Lcom/daaw/lm$e$d$a;Lcom/daaw/lm$e$d$c;Lcom/daaw/lm$e$d$d;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/lm$e$d;-><init>()V

    iput-wide p1, p0, Lcom/daaw/o8;->a:J

    iput-object p3, p0, Lcom/daaw/o8;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/o8;->c:Lcom/daaw/lm$e$d$a;

    iput-object p5, p0, Lcom/daaw/o8;->d:Lcom/daaw/lm$e$d$c;

    iput-object p6, p0, Lcom/daaw/o8;->e:Lcom/daaw/lm$e$d$d;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Lcom/daaw/lm$e$d$a;Lcom/daaw/lm$e$d$c;Lcom/daaw/lm$e$d$d;Lcom/daaw/o8$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/daaw/o8;-><init>(JLjava/lang/String;Lcom/daaw/lm$e$d$a;Lcom/daaw/lm$e$d$c;Lcom/daaw/lm$e$d$d;)V

    return-void
.end method


# virtual methods
.method public b()Lcom/daaw/lm$e$d$a;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o8;->c:Lcom/daaw/lm$e$d$a;

    return-object v0
.end method

.method public c()Lcom/daaw/lm$e$d$c;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o8;->d:Lcom/daaw/lm$e$d$c;

    return-object v0
.end method

.method public d()Lcom/daaw/lm$e$d$d;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o8;->e:Lcom/daaw/lm$e$d$d;

    return-object v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/o8;->a:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/daaw/lm$e$d;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    check-cast p1, Lcom/daaw/lm$e$d;

    iget-wide v3, p0, Lcom/daaw/o8;->a:J

    invoke-virtual {p1}, Lcom/daaw/lm$e$d;->e()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/daaw/o8;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/daaw/lm$e$d;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/o8;->c:Lcom/daaw/lm$e$d$a;

    invoke-virtual {p1}, Lcom/daaw/lm$e$d;->b()Lcom/daaw/lm$e$d$a;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/o8;->d:Lcom/daaw/lm$e$d$c;

    invoke-virtual {p1}, Lcom/daaw/lm$e$d;->c()Lcom/daaw/lm$e$d$c;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/o8;->e:Lcom/daaw/lm$e$d$d;

    invoke-virtual {p1}, Lcom/daaw/lm$e$d;->d()Lcom/daaw/lm$e$d$d;

    move-result-object p1

    if-nez v1, :cond_1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    return v2
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o8;->b:Ljava/lang/String;

    return-object v0
.end method

.method public g()Lcom/daaw/lm$e$d$b;
    .locals 2

    new-instance v0, Lcom/daaw/o8$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/daaw/o8$b;-><init>(Lcom/daaw/lm$e$d;Lcom/daaw/o8$a;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/daaw/o8;->a:J

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v1, v0

    const v0, 0xf4243

    xor-int/2addr v1, v0

    mul-int v1, v1, v0

    iget-object v2, p0, Lcom/daaw/o8;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v1, v2

    mul-int v1, v1, v0

    iget-object v2, p0, Lcom/daaw/o8;->c:Lcom/daaw/lm$e$d$a;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v1, v2

    mul-int v1, v1, v0

    iget-object v2, p0, Lcom/daaw/o8;->d:Lcom/daaw/lm$e$d$c;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v1, v2

    mul-int v1, v1, v0

    iget-object v0, p0, Lcom/daaw/o8;->e:Lcom/daaw/lm$e$d$d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Event{timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/daaw/o8;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/o8;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", app="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/o8;->c:Lcom/daaw/lm$e$d$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", device="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/o8;->d:Lcom/daaw/lm$e$d$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", log="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/o8;->e:Lcom/daaw/lm$e$d$d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
