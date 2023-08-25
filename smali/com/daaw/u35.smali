.class public final Lcom/daaw/u35;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final h:Lcom/daaw/u35;


# instance fields
.field public final a:Lcom/daaw/zd3;

.field public final b:Lcom/daaw/wd3;

.field public final c:Lcom/daaw/me3;

.field public final d:Lcom/daaw/je3;

.field public final e:Lcom/daaw/sj3;

.field public final f:Lcom/daaw/cd1;

.field public final g:Lcom/daaw/cd1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/s35;

    invoke-direct {v0}, Lcom/daaw/s35;-><init>()V

    new-instance v1, Lcom/daaw/u35;

    invoke-direct {v1, v0}, Lcom/daaw/u35;-><init>(Lcom/daaw/s35;)V

    sput-object v1, Lcom/daaw/u35;->h:Lcom/daaw/u35;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/s35;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/daaw/s35;->a:Lcom/daaw/zd3;

    iput-object v0, p0, Lcom/daaw/u35;->a:Lcom/daaw/zd3;

    iget-object v0, p1, Lcom/daaw/s35;->b:Lcom/daaw/wd3;

    iput-object v0, p0, Lcom/daaw/u35;->b:Lcom/daaw/wd3;

    iget-object v0, p1, Lcom/daaw/s35;->c:Lcom/daaw/me3;

    iput-object v0, p0, Lcom/daaw/u35;->c:Lcom/daaw/me3;

    new-instance v0, Lcom/daaw/cd1;

    iget-object v1, p1, Lcom/daaw/s35;->f:Lcom/daaw/cd1;

    invoke-direct {v0, v1}, Lcom/daaw/cd1;-><init>(Lcom/daaw/cd1;)V

    iput-object v0, p0, Lcom/daaw/u35;->f:Lcom/daaw/cd1;

    new-instance v0, Lcom/daaw/cd1;

    iget-object v1, p1, Lcom/daaw/s35;->g:Lcom/daaw/cd1;

    invoke-direct {v0, v1}, Lcom/daaw/cd1;-><init>(Lcom/daaw/cd1;)V

    iput-object v0, p0, Lcom/daaw/u35;->g:Lcom/daaw/cd1;

    iget-object v0, p1, Lcom/daaw/s35;->d:Lcom/daaw/je3;

    iput-object v0, p0, Lcom/daaw/u35;->d:Lcom/daaw/je3;

    iget-object p1, p1, Lcom/daaw/s35;->e:Lcom/daaw/sj3;

    iput-object p1, p0, Lcom/daaw/u35;->e:Lcom/daaw/sj3;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/s35;Lcom/daaw/t35;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/u35;-><init>(Lcom/daaw/s35;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/wd3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/u35;->b:Lcom/daaw/wd3;

    return-object v0
.end method

.method public final b()Lcom/daaw/zd3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/u35;->a:Lcom/daaw/zd3;

    return-object v0
.end method

.method public final c(Ljava/lang/String;)Lcom/daaw/ce3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/u35;->g:Lcom/daaw/cd1;

    invoke-virtual {v0, p1}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ce3;

    return-object p1
.end method

.method public final d(Ljava/lang/String;)Lcom/daaw/fe3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/u35;->f:Lcom/daaw/cd1;

    invoke-virtual {v0, p1}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/fe3;

    return-object p1
.end method

.method public final e()Lcom/daaw/je3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/u35;->d:Lcom/daaw/je3;

    return-object v0
.end method

.method public final f()Lcom/daaw/me3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/u35;->c:Lcom/daaw/me3;

    return-object v0
.end method

.method public final g()Lcom/daaw/sj3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/u35;->e:Lcom/daaw/sj3;

    return-object v0
.end method

.method public final h()Ljava/util/ArrayList;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/daaw/u35;->f:Lcom/daaw/cd1;

    invoke-virtual {v1}, Lcom/daaw/cd1;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/u35;->f:Lcom/daaw/cd1;

    invoke-virtual {v2}, Lcom/daaw/cd1;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/daaw/u35;->f:Lcom/daaw/cd1;

    invoke-virtual {v2, v1}, Lcom/daaw/cd1;->i(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final i()Ljava/util/ArrayList;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/daaw/u35;->c:Lcom/daaw/me3;

    if-eqz v1, :cond_0

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lcom/daaw/u35;->a:Lcom/daaw/zd3;

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v1, p0, Lcom/daaw/u35;->b:Lcom/daaw/wd3;

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v1, p0, Lcom/daaw/u35;->f:Lcom/daaw/cd1;

    invoke-virtual {v1}, Lcom/daaw/cd1;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    iget-object v1, p0, Lcom/daaw/u35;->e:Lcom/daaw/sj3;

    if-eqz v1, :cond_4

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    return-object v0
.end method
