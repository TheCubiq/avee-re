.class public Lcom/daaw/nk0$b;
.super Lcom/daaw/ht1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/nk0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final f:Lcom/daaw/jt1$b;


# instance fields
.field public d:Lcom/daaw/me1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/me1<",
            "Lcom/daaw/nk0$a;",
            ">;"
        }
    .end annotation
.end field

.field public e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/nk0$b$a;

    invoke-direct {v0}, Lcom/daaw/nk0$b$a;-><init>()V

    sput-object v0, Lcom/daaw/nk0$b;->f:Lcom/daaw/jt1$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ht1;-><init>()V

    new-instance v0, Lcom/daaw/me1;

    invoke-direct {v0}, Lcom/daaw/me1;-><init>()V

    iput-object v0, p0, Lcom/daaw/nk0$b;->d:Lcom/daaw/me1;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/nk0$b;->e:Z

    return-void
.end method

.method public static f(Lcom/daaw/mt1;)Lcom/daaw/nk0$b;
    .locals 2

    new-instance v0, Lcom/daaw/jt1;

    sget-object v1, Lcom/daaw/nk0$b;->f:Lcom/daaw/jt1$b;

    invoke-direct {v0, p0, v1}, Lcom/daaw/jt1;-><init>(Lcom/daaw/mt1;Lcom/daaw/jt1$b;)V

    const-class p0, Lcom/daaw/nk0$b;

    invoke-virtual {v0, p0}, Lcom/daaw/jt1;->a(Ljava/lang/Class;)Lcom/daaw/ht1;

    move-result-object p0

    check-cast p0, Lcom/daaw/nk0$b;

    return-object p0
.end method


# virtual methods
.method public d()V
    .locals 4

    invoke-super {p0}, Lcom/daaw/ht1;->d()V

    iget-object v0, p0, Lcom/daaw/nk0$b;->d:Lcom/daaw/me1;

    invoke-virtual {v0}, Lcom/daaw/me1;->m()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lcom/daaw/nk0$b;->d:Lcom/daaw/me1;

    invoke-virtual {v2, v1}, Lcom/daaw/me1;->n(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/nk0$a;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/daaw/nk0$a;->k(Z)Lcom/daaw/kk0;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/nk0$b;->d:Lcom/daaw/me1;

    invoke-virtual {v0}, Lcom/daaw/me1;->b()V

    return-void
.end method

.method public e(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/nk0$b;->d:Lcom/daaw/me1;

    invoke-virtual {v0}, Lcom/daaw/me1;->m()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Loaders:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/nk0$b;->d:Lcom/daaw/me1;

    invoke-virtual {v2}, Lcom/daaw/me1;->m()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/daaw/nk0$b;->d:Lcom/daaw/me1;

    invoke-virtual {v2, v1}, Lcom/daaw/me1;->n(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/nk0$a;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/daaw/nk0$b;->d:Lcom/daaw/me1;

    invoke-virtual {v3, v1}, Lcom/daaw/me1;->j(I)I

    move-result v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/daaw/nk0$a;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {v2, v0, p2, p3, p4}, Lcom/daaw/nk0$a;->l(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public g()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/nk0$b;->d:Lcom/daaw/me1;

    invoke-virtual {v0}, Lcom/daaw/me1;->m()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lcom/daaw/nk0$b;->d:Lcom/daaw/me1;

    invoke-virtual {v2, v1}, Lcom/daaw/me1;->n(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/nk0$a;

    invoke-virtual {v2}, Lcom/daaw/nk0$a;->m()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
