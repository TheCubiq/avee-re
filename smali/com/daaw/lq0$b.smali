.class public final Lcom/daaw/lq0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/lq0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final d:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/daaw/lq0$b<",
            "*>;>;"
        }
    .end annotation
.end field


# instance fields
.field public a:I

.field public b:I

.field public c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TA;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/daaw/tq1;->d(I)Ljava/util/Queue;

    move-result-object v0

    sput-object v0, Lcom/daaw/lq0$b;->d:Ljava/util/Queue;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Object;II)Lcom/daaw/lq0$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            ">(TA;II)",
            "Lcom/daaw/lq0$b<",
            "TA;>;"
        }
    .end annotation

    sget-object v0, Lcom/daaw/lq0$b;->d:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/lq0$b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/lq0$b;

    invoke-direct {v0}, Lcom/daaw/lq0$b;-><init>()V

    :cond_0
    invoke-virtual {v0, p0, p1, p2}, Lcom/daaw/lq0$b;->b(Ljava/lang/Object;II)V

    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/Object;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;II)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/lq0$b;->c:Ljava/lang/Object;

    iput p2, p0, Lcom/daaw/lq0$b;->b:I

    iput p3, p0, Lcom/daaw/lq0$b;->a:I

    return-void
.end method

.method public c()V
    .locals 1

    sget-object v0, Lcom/daaw/lq0$b;->d:Ljava/util/Queue;

    invoke-interface {v0, p0}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/daaw/lq0$b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/daaw/lq0$b;

    iget v0, p0, Lcom/daaw/lq0$b;->b:I

    iget v2, p1, Lcom/daaw/lq0$b;->b:I

    if-ne v0, v2, :cond_0

    iget v0, p0, Lcom/daaw/lq0$b;->a:I

    iget v2, p1, Lcom/daaw/lq0$b;->a:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/daaw/lq0$b;->c:Ljava/lang/Object;

    iget-object p1, p1, Lcom/daaw/lq0$b;->c:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/daaw/lq0$b;->a:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/daaw/lq0$b;->b:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/lq0$b;->c:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
