.class public final Lcom/daaw/k8$b;
.super Lcom/daaw/lm$e$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/k8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/Long;

.field public d:Ljava/lang/Long;

.field public e:Ljava/lang/Boolean;

.field public f:Lcom/daaw/lm$e$a;

.field public g:Lcom/daaw/lm$e$f;

.field public h:Lcom/daaw/lm$e$e;

.field public i:Lcom/daaw/lm$e$c;

.field public j:Lcom/daaw/of0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/of0<",
            "Lcom/daaw/lm$e$d;",
            ">;"
        }
    .end annotation
.end field

.field public k:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/lm$e$b;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/lm$e;)V
    .locals 2

    invoke-direct {p0}, Lcom/daaw/lm$e$b;-><init>()V

    invoke-virtual {p1}, Lcom/daaw/lm$e;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/k8$b;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/k8$b;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->k()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/k8$b;->c:Ljava/lang/Long;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->d()Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/k8$b;->d:Ljava/lang/Long;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->m()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/k8$b;->e:Ljava/lang/Boolean;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->b()Lcom/daaw/lm$e$a;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/k8$b;->f:Lcom/daaw/lm$e$a;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->l()Lcom/daaw/lm$e$f;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/k8$b;->g:Lcom/daaw/lm$e$f;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->j()Lcom/daaw/lm$e$e;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/k8$b;->h:Lcom/daaw/lm$e$e;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->c()Lcom/daaw/lm$e$c;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/k8$b;->i:Lcom/daaw/lm$e$c;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->e()Lcom/daaw/of0;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/k8$b;->j:Lcom/daaw/of0;

    invoke-virtual {p1}, Lcom/daaw/lm$e;->g()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/k8$b;->k:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/lm$e;Lcom/daaw/k8$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/k8$b;-><init>(Lcom/daaw/lm$e;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/lm$e;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/k8$b;->a:Ljava/lang/String;

    const-string v2, ""

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " generator"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_0
    iget-object v1, v0, Lcom/daaw/k8$b;->b:Ljava/lang/String;

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " identifier"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_1
    iget-object v1, v0, Lcom/daaw/k8$b;->c:Ljava/lang/Long;

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " startedAt"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_2
    iget-object v1, v0, Lcom/daaw/k8$b;->e:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " crashed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_3
    iget-object v1, v0, Lcom/daaw/k8$b;->f:Lcom/daaw/lm$e$a;

    if-nez v1, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " app"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_4
    iget-object v1, v0, Lcom/daaw/k8$b;->k:Ljava/lang/Integer;

    if-nez v1, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " generatorType"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Lcom/daaw/k8;

    iget-object v4, v0, Lcom/daaw/k8$b;->a:Ljava/lang/String;

    iget-object v5, v0, Lcom/daaw/k8$b;->b:Ljava/lang/String;

    iget-object v2, v0, Lcom/daaw/k8$b;->c:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-object v8, v0, Lcom/daaw/k8$b;->d:Ljava/lang/Long;

    iget-object v2, v0, Lcom/daaw/k8$b;->e:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    iget-object v10, v0, Lcom/daaw/k8$b;->f:Lcom/daaw/lm$e$a;

    iget-object v11, v0, Lcom/daaw/k8$b;->g:Lcom/daaw/lm$e$f;

    iget-object v12, v0, Lcom/daaw/k8$b;->h:Lcom/daaw/lm$e$e;

    iget-object v13, v0, Lcom/daaw/k8$b;->i:Lcom/daaw/lm$e$c;

    iget-object v14, v0, Lcom/daaw/k8$b;->j:Lcom/daaw/of0;

    iget-object v2, v0, Lcom/daaw/k8$b;->k:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v15

    const/16 v16, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v16}, Lcom/daaw/k8;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLcom/daaw/lm$e$a;Lcom/daaw/lm$e$f;Lcom/daaw/lm$e$e;Lcom/daaw/lm$e$c;Lcom/daaw/of0;ILcom/daaw/k8$a;)V

    return-object v1

    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Missing required properties:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public b(Lcom/daaw/lm$e$a;)Lcom/daaw/lm$e$b;
    .locals 1

    const-string v0, "Null app"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/k8$b;->f:Lcom/daaw/lm$e$a;

    return-object p0
.end method

.method public c(Z)Lcom/daaw/lm$e$b;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/k8$b;->e:Ljava/lang/Boolean;

    return-object p0
.end method

.method public d(Lcom/daaw/lm$e$c;)Lcom/daaw/lm$e$b;
    .locals 0

    iput-object p1, p0, Lcom/daaw/k8$b;->i:Lcom/daaw/lm$e$c;

    return-object p0
.end method

.method public e(Ljava/lang/Long;)Lcom/daaw/lm$e$b;
    .locals 0

    iput-object p1, p0, Lcom/daaw/k8$b;->d:Ljava/lang/Long;

    return-object p0
.end method

.method public f(Lcom/daaw/of0;)Lcom/daaw/lm$e$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/of0<",
            "Lcom/daaw/lm$e$d;",
            ">;)",
            "Lcom/daaw/lm$e$b;"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/k8$b;->j:Lcom/daaw/of0;

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lcom/daaw/lm$e$b;
    .locals 1

    const-string v0, "Null generator"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/k8$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public h(I)Lcom/daaw/lm$e$b;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/k8$b;->k:Ljava/lang/Integer;

    return-object p0
.end method

.method public i(Ljava/lang/String;)Lcom/daaw/lm$e$b;
    .locals 1

    const-string v0, "Null identifier"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/k8$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public k(Lcom/daaw/lm$e$e;)Lcom/daaw/lm$e$b;
    .locals 0

    iput-object p1, p0, Lcom/daaw/k8$b;->h:Lcom/daaw/lm$e$e;

    return-object p0
.end method

.method public l(J)Lcom/daaw/lm$e$b;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/k8$b;->c:Ljava/lang/Long;

    return-object p0
.end method

.method public m(Lcom/daaw/lm$e$f;)Lcom/daaw/lm$e$b;
    .locals 0

    iput-object p1, p0, Lcom/daaw/k8$b;->g:Lcom/daaw/lm$e$f;

    return-object p0
.end method
