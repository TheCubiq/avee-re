.class public final Lcom/daaw/q8$b;
.super Lcom/daaw/lm$e$d$a$b$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/q8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lcom/daaw/of0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/of0<",
            "Lcom/daaw/lm$e$d$a$b$e;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lcom/daaw/lm$e$d$a$b$c;

.field public c:Lcom/daaw/lm$a;

.field public d:Lcom/daaw/lm$e$d$a$b$d;

.field public e:Lcom/daaw/of0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/of0<",
            "Lcom/daaw/lm$e$d$a$b$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/lm$e$d$a$b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/lm$e$d$a$b;
    .locals 9

    iget-object v0, p0, Lcom/daaw/q8$b;->d:Lcom/daaw/lm$e$d$a$b$d;

    const-string v1, ""

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " signal"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/q8$b;->e:Lcom/daaw/of0;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " binaries"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/daaw/q8;

    iget-object v3, p0, Lcom/daaw/q8$b;->a:Lcom/daaw/of0;

    iget-object v4, p0, Lcom/daaw/q8$b;->b:Lcom/daaw/lm$e$d$a$b$c;

    iget-object v5, p0, Lcom/daaw/q8$b;->c:Lcom/daaw/lm$a;

    iget-object v6, p0, Lcom/daaw/q8$b;->d:Lcom/daaw/lm$e$d$a$b$d;

    iget-object v7, p0, Lcom/daaw/q8$b;->e:Lcom/daaw/of0;

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/daaw/q8;-><init>(Lcom/daaw/of0;Lcom/daaw/lm$e$d$a$b$c;Lcom/daaw/lm$a;Lcom/daaw/lm$e$d$a$b$d;Lcom/daaw/of0;Lcom/daaw/q8$a;)V

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lcom/daaw/lm$a;)Lcom/daaw/lm$e$d$a$b$b;
    .locals 0

    iput-object p1, p0, Lcom/daaw/q8$b;->c:Lcom/daaw/lm$a;

    return-object p0
.end method

.method public c(Lcom/daaw/of0;)Lcom/daaw/lm$e$d$a$b$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/of0<",
            "Lcom/daaw/lm$e$d$a$b$a;",
            ">;)",
            "Lcom/daaw/lm$e$d$a$b$b;"
        }
    .end annotation

    const-string v0, "Null binaries"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/q8$b;->e:Lcom/daaw/of0;

    return-object p0
.end method

.method public d(Lcom/daaw/lm$e$d$a$b$c;)Lcom/daaw/lm$e$d$a$b$b;
    .locals 0

    iput-object p1, p0, Lcom/daaw/q8$b;->b:Lcom/daaw/lm$e$d$a$b$c;

    return-object p0
.end method

.method public e(Lcom/daaw/lm$e$d$a$b$d;)Lcom/daaw/lm$e$d$a$b$b;
    .locals 1

    const-string v0, "Null signal"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/q8$b;->d:Lcom/daaw/lm$e$d$a$b$d;

    return-object p0
.end method

.method public f(Lcom/daaw/of0;)Lcom/daaw/lm$e$d$a$b$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/of0<",
            "Lcom/daaw/lm$e$d$a$b$e;",
            ">;)",
            "Lcom/daaw/lm$e$d$a$b$b;"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/q8$b;->a:Lcom/daaw/of0;

    return-object p0
.end method
