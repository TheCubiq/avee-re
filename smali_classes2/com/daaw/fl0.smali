.class public Lcom/daaw/fl0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/fl0$b;
    }
.end annotation


# static fields
.field public static final c:Lcom/daaw/fl0$b;


# instance fields
.field public final a:Lcom/daaw/h10;

.field public b:Lcom/daaw/e10;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/fl0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/fl0$b;-><init>(Lcom/daaw/fl0$a;)V

    sput-object v0, Lcom/daaw/fl0;->c:Lcom/daaw/fl0$b;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/h10;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fl0;->a:Lcom/daaw/h10;

    sget-object p1, Lcom/daaw/fl0;->c:Lcom/daaw/fl0$b;

    iput-object p1, p0, Lcom/daaw/fl0;->b:Lcom/daaw/e10;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/h10;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/fl0;-><init>(Lcom/daaw/h10;)V

    invoke-virtual {p0, p2}, Lcom/daaw/fl0;->e(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fl0;->b:Lcom/daaw/e10;

    invoke-interface {v0}, Lcom/daaw/e10;->d()V

    return-void
.end method

.method public b()[B
    .locals 1

    iget-object v0, p0, Lcom/daaw/fl0;->b:Lcom/daaw/e10;

    invoke-interface {v0}, Lcom/daaw/e10;->c()[B

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/fl0;->b:Lcom/daaw/e10;

    invoke-interface {v0}, Lcom/daaw/e10;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    iget-object v0, p0, Lcom/daaw/fl0;->a:Lcom/daaw/h10;

    const-string v1, "userlog"

    invoke-virtual {v0, p1, v1}, Lcom/daaw/h10;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fl0;->b:Lcom/daaw/e10;

    invoke-interface {v0}, Lcom/daaw/e10;->a()V

    sget-object v0, Lcom/daaw/fl0;->c:Lcom/daaw/fl0$b;

    iput-object v0, p0, Lcom/daaw/fl0;->b:Lcom/daaw/e10;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/fl0;->d(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    const/high16 v0, 0x10000

    invoke-virtual {p0, p1, v0}, Lcom/daaw/fl0;->f(Ljava/io/File;I)V

    return-void
.end method

.method public f(Ljava/io/File;I)V
    .locals 1

    new-instance v0, Lcom/daaw/n01;

    invoke-direct {v0, p1, p2}, Lcom/daaw/n01;-><init>(Ljava/io/File;I)V

    iput-object v0, p0, Lcom/daaw/fl0;->b:Lcom/daaw/e10;

    return-void
.end method

.method public g(JLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fl0;->b:Lcom/daaw/e10;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/e10;->e(JLjava/lang/String;)V

    return-void
.end method
