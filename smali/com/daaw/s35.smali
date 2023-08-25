.class public final Lcom/daaw/s35;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/daaw/zd3;

.field public b:Lcom/daaw/wd3;

.field public c:Lcom/daaw/me3;

.field public d:Lcom/daaw/je3;

.field public e:Lcom/daaw/sj3;

.field public final f:Lcom/daaw/cd1;

.field public final g:Lcom/daaw/cd1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/cd1;

    invoke-direct {v0}, Lcom/daaw/cd1;-><init>()V

    iput-object v0, p0, Lcom/daaw/s35;->f:Lcom/daaw/cd1;

    new-instance v0, Lcom/daaw/cd1;

    invoke-direct {v0}, Lcom/daaw/cd1;-><init>()V

    iput-object v0, p0, Lcom/daaw/s35;->g:Lcom/daaw/cd1;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/wd3;)Lcom/daaw/s35;
    .locals 0

    iput-object p1, p0, Lcom/daaw/s35;->b:Lcom/daaw/wd3;

    return-object p0
.end method

.method public final b(Lcom/daaw/zd3;)Lcom/daaw/s35;
    .locals 0

    iput-object p1, p0, Lcom/daaw/s35;->a:Lcom/daaw/zd3;

    return-object p0
.end method

.method public final c(Ljava/lang/String;Lcom/daaw/fe3;Lcom/daaw/ce3;)Lcom/daaw/s35;
    .locals 1

    iget-object v0, p0, Lcom/daaw/s35;->f:Lcom/daaw/cd1;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/cd1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p3, :cond_0

    iget-object p2, p0, Lcom/daaw/s35;->g:Lcom/daaw/cd1;

    invoke-virtual {p2, p1, p3}, Lcom/daaw/cd1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public final d(Lcom/daaw/sj3;)Lcom/daaw/s35;
    .locals 0

    iput-object p1, p0, Lcom/daaw/s35;->e:Lcom/daaw/sj3;

    return-object p0
.end method

.method public final e(Lcom/daaw/je3;)Lcom/daaw/s35;
    .locals 0

    iput-object p1, p0, Lcom/daaw/s35;->d:Lcom/daaw/je3;

    return-object p0
.end method

.method public final f(Lcom/daaw/me3;)Lcom/daaw/s35;
    .locals 0

    iput-object p1, p0, Lcom/daaw/s35;->c:Lcom/daaw/me3;

    return-object p0
.end method

.method public final g()Lcom/daaw/u35;
    .locals 2

    new-instance v0, Lcom/daaw/u35;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/daaw/u35;-><init>(Lcom/daaw/s35;Lcom/daaw/t35;)V

    return-object v0
.end method
