.class public final Lcom/daaw/u8;
.super Lcom/daaw/lm$e$d$a$b$e;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/u8$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Lcom/daaw/of0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/of0<",
            "Lcom/daaw/lm$e$d$a$b$e$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;ILcom/daaw/of0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lcom/daaw/of0<",
            "Lcom/daaw/lm$e$d$a$b$e$b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/daaw/lm$e$d$a$b$e;-><init>()V

    iput-object p1, p0, Lcom/daaw/u8;->a:Ljava/lang/String;

    iput p2, p0, Lcom/daaw/u8;->b:I

    iput-object p3, p0, Lcom/daaw/u8;->c:Lcom/daaw/of0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILcom/daaw/of0;Lcom/daaw/u8$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/u8;-><init>(Ljava/lang/String;ILcom/daaw/of0;)V

    return-void
.end method


# virtual methods
.method public b()Lcom/daaw/of0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/of0<",
            "Lcom/daaw/lm$e$d$a$b$e$b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/u8;->c:Lcom/daaw/of0;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/daaw/u8;->b:I

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/u8;->a:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/daaw/lm$e$d$a$b$e;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lcom/daaw/lm$e$d$a$b$e;

    iget-object v1, p0, Lcom/daaw/u8;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$a$b$e;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/daaw/u8;->b:I

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$a$b$e;->c()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lcom/daaw/u8;->c:Lcom/daaw/of0;

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$a$b$e;->b()Lcom/daaw/of0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/daaw/of0;->equals(Ljava/lang/Object;)Z

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

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/daaw/u8;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    iget v2, p0, Lcom/daaw/u8;->b:I

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    iget-object v1, p0, Lcom/daaw/u8;->c:Lcom/daaw/of0;

    invoke-virtual {v1}, Lcom/daaw/of0;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread{name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/u8;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", importance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/u8;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", frames="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/u8;->c:Lcom/daaw/of0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
