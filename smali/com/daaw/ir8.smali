.class public final Lcom/daaw/ir8;
.super Lcom/daaw/xq8;
.source ""


# static fields
.field public static final f:Ljava/lang/Object;


# instance fields
.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/ir8;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/l64;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/xq8;-><init>(Lcom/daaw/l64;)V

    iput-object p2, p0, Lcom/daaw/ir8;->d:Ljava/lang/Object;

    iput-object p3, p0, Lcom/daaw/ir8;->e:Ljava/lang/Object;

    return-void
.end method

.method public static q(Lcom/daaw/f53;)Lcom/daaw/ir8;
    .locals 3

    new-instance v0, Lcom/daaw/ir8;

    new-instance v1, Lcom/daaw/jr8;

    invoke-direct {v1, p0}, Lcom/daaw/jr8;-><init>(Lcom/daaw/f53;)V

    sget-object p0, Lcom/daaw/i54;->o:Ljava/lang/Object;

    sget-object v2, Lcom/daaw/ir8;->f:Ljava/lang/Object;

    invoke-direct {v0, v1, p0, v2}, Lcom/daaw/ir8;-><init>(Lcom/daaw/l64;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static r(Lcom/daaw/l64;Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/ir8;
    .locals 1

    new-instance v0, Lcom/daaw/ir8;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/ir8;-><init>(Lcom/daaw/l64;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static bridge synthetic s(Lcom/daaw/ir8;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ir8;->e:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lcom/daaw/xq8;->c:Lcom/daaw/l64;

    sget-object v1, Lcom/daaw/ir8;->f:Ljava/lang/Object;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/ir8;->e:Ljava/lang/Object;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :cond_1
    :goto_0
    invoke-virtual {v0, p1}, Lcom/daaw/l64;->a(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final d(ILcom/daaw/d34;Z)Lcom/daaw/d34;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xq8;->c:Lcom/daaw/l64;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/l64;->d(ILcom/daaw/d34;Z)Lcom/daaw/d34;

    iget-object p1, p2, Lcom/daaw/d34;->b:Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/ir8;->e:Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    sget-object p1, Lcom/daaw/ir8;->f:Ljava/lang/Object;

    iput-object p1, p2, Lcom/daaw/d34;->b:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public final e(ILcom/daaw/i54;J)Lcom/daaw/i54;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xq8;->c:Lcom/daaw/l64;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    iget-object p1, p2, Lcom/daaw/i54;->a:Ljava/lang/Object;

    iget-object p3, p0, Lcom/daaw/ir8;->d:Ljava/lang/Object;

    invoke-static {p1, p3}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/daaw/i54;->o:Ljava/lang/Object;

    iput-object p1, p2, Lcom/daaw/i54;->a:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public final f(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xq8;->c:Lcom/daaw/l64;

    invoke-virtual {v0, p1}, Lcom/daaw/l64;->f(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/ir8;->e:Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/daaw/ir8;->f:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public final p(Lcom/daaw/l64;)Lcom/daaw/ir8;
    .locals 3

    new-instance v0, Lcom/daaw/ir8;

    iget-object v1, p0, Lcom/daaw/ir8;->d:Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/ir8;->e:Ljava/lang/Object;

    invoke-direct {v0, p1, v1, v2}, Lcom/daaw/ir8;-><init>(Lcom/daaw/l64;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
