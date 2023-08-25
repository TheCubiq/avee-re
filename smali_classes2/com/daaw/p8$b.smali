.class public final Lcom/daaw/p8$b;
.super Lcom/daaw/lm$e$d$a$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/p8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lcom/daaw/lm$e$d$a$b;

.field public b:Lcom/daaw/of0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/of0<",
            "Lcom/daaw/lm$c;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lcom/daaw/of0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/of0<",
            "Lcom/daaw/lm$c;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/lang/Boolean;

.field public e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/lm$e$d$a$a;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/lm$e$d$a;)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/lm$e$d$a$a;-><init>()V

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$a;->d()Lcom/daaw/lm$e$d$a$b;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/p8$b;->a:Lcom/daaw/lm$e$d$a$b;

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$a;->c()Lcom/daaw/of0;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/p8$b;->b:Lcom/daaw/of0;

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$a;->e()Lcom/daaw/of0;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/p8$b;->c:Lcom/daaw/of0;

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$a;->b()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/p8$b;->d:Ljava/lang/Boolean;

    invoke-virtual {p1}, Lcom/daaw/lm$e$d$a;->f()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/p8$b;->e:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/lm$e$d$a;Lcom/daaw/p8$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/p8$b;-><init>(Lcom/daaw/lm$e$d$a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/lm$e$d$a;
    .locals 9

    iget-object v0, p0, Lcom/daaw/p8$b;->a:Lcom/daaw/lm$e$d$a$b;

    const-string v1, ""

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " execution"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/p8$b;->e:Ljava/lang/Integer;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " uiOrientation"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/daaw/p8;

    iget-object v3, p0, Lcom/daaw/p8$b;->a:Lcom/daaw/lm$e$d$a$b;

    iget-object v4, p0, Lcom/daaw/p8$b;->b:Lcom/daaw/of0;

    iget-object v5, p0, Lcom/daaw/p8$b;->c:Lcom/daaw/of0;

    iget-object v6, p0, Lcom/daaw/p8$b;->d:Ljava/lang/Boolean;

    iget-object v1, p0, Lcom/daaw/p8$b;->e:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/daaw/p8;-><init>(Lcom/daaw/lm$e$d$a$b;Lcom/daaw/of0;Lcom/daaw/of0;Ljava/lang/Boolean;ILcom/daaw/p8$a;)V

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

.method public b(Ljava/lang/Boolean;)Lcom/daaw/lm$e$d$a$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/p8$b;->d:Ljava/lang/Boolean;

    return-object p0
.end method

.method public c(Lcom/daaw/of0;)Lcom/daaw/lm$e$d$a$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/of0<",
            "Lcom/daaw/lm$c;",
            ">;)",
            "Lcom/daaw/lm$e$d$a$a;"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/p8$b;->b:Lcom/daaw/of0;

    return-object p0
.end method

.method public d(Lcom/daaw/lm$e$d$a$b;)Lcom/daaw/lm$e$d$a$a;
    .locals 1

    const-string v0, "Null execution"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/p8$b;->a:Lcom/daaw/lm$e$d$a$b;

    return-object p0
.end method

.method public e(Lcom/daaw/of0;)Lcom/daaw/lm$e$d$a$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/of0<",
            "Lcom/daaw/lm$c;",
            ">;)",
            "Lcom/daaw/lm$e$d$a$a;"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/p8$b;->c:Lcom/daaw/of0;

    return-object p0
.end method

.method public f(I)Lcom/daaw/lm$e$d$a$a;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/p8$b;->e:Ljava/lang/Integer;

    return-object p0
.end method
