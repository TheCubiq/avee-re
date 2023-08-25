.class public final Lcom/daaw/f7$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/f7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/f7$b;->a:I

    iput v0, p0, Lcom/daaw/f7$b;->b:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/f7$b;->c:I

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/f7;
    .locals 5

    new-instance v0, Lcom/daaw/f7;

    iget v1, p0, Lcom/daaw/f7$b;->a:I

    iget v2, p0, Lcom/daaw/f7$b;->b:I

    iget v3, p0, Lcom/daaw/f7$b;->c:I

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/f7;-><init>(IIILcom/daaw/f7$a;)V

    return-object v0
.end method
