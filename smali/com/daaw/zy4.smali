.class public final Lcom/daaw/zy4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Lcom/daaw/op6;

.field public c:Z


# direct methods
.method public constructor <init>(Lcom/daaw/th6;Lcom/daaw/op6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, Lcom/daaw/th6;->q:Ljava/util/List;

    iput-object p1, p0, Lcom/daaw/zy4;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/daaw/zy4;->b:Lcom/daaw/op6;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/zy4;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/zy4;->b:Lcom/daaw/op6;

    iget-object v1, p0, Lcom/daaw/zy4;->a:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/daaw/op6;->d(Ljava/util/List;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/zy4;->c:Z

    :cond_0
    return-void
.end method
