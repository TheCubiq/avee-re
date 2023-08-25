.class public final Lcom/daaw/f9$b;
.super Lcom/daaw/ig0$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/f9;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Lcom/daaw/bm1;

.field public e:Lcom/daaw/ig0$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/ig0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/ig0;
    .locals 8

    new-instance v7, Lcom/daaw/f9;

    iget-object v1, p0, Lcom/daaw/f9$b;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/f9$b;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/f9$b;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/daaw/f9$b;->d:Lcom/daaw/bm1;

    iget-object v5, p0, Lcom/daaw/f9$b;->e:Lcom/daaw/ig0$b;

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/daaw/f9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/bm1;Lcom/daaw/ig0$b;Lcom/daaw/f9$a;)V

    return-object v7
.end method

.method public b(Lcom/daaw/bm1;)Lcom/daaw/ig0$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/f9$b;->d:Lcom/daaw/bm1;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/daaw/ig0$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/f9$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/daaw/ig0$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/f9$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public e(Lcom/daaw/ig0$b;)Lcom/daaw/ig0$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/f9$b;->e:Lcom/daaw/ig0$b;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lcom/daaw/ig0$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/f9$b;->a:Ljava/lang/String;

    return-object p0
.end method
