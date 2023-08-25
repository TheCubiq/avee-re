.class public Lcom/daaw/jh0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/jh0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Lcom/daaw/sd0;

.field public b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/sd0;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/sd0;",
            "TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/q6;->f(Ljava/lang/Object;)V

    invoke-static {p2}, Lcom/daaw/q6;->f(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/jh0$a;->a:Lcom/daaw/sd0;

    iput-object p2, p0, Lcom/daaw/jh0$a;->b:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/jh0$a;)Lcom/daaw/sd0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/jh0$a;->a:Lcom/daaw/sd0;

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/jh0$a;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/daaw/jh0$a;->b:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public c()Lcom/daaw/sd0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/jh0$a;->a:Lcom/daaw/sd0;

    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/jh0$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/daaw/jh0$a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/daaw/jh0$a;

    iget-object v0, p0, Lcom/daaw/jh0$a;->a:Lcom/daaw/sd0;

    iget-object v2, p1, Lcom/daaw/jh0$a;->a:Lcom/daaw/sd0;

    invoke-interface {v0, v2}, Lcom/daaw/sd0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/jh0$a;->b:Ljava/lang/Object;

    iget-object p1, p1, Lcom/daaw/jh0$a;->b:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/jh0$a;->a:Lcom/daaw/sd0;

    invoke-interface {v0}, Lcom/daaw/sd0;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/jh0$a;->b:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
