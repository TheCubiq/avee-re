.class public final Lcom/daaw/a12;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/b22;

.field public final b:I

.field public final c:Lcom/daaw/v70;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/v70<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/b22;ILcom/daaw/v70;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/b22;",
            "I",
            "Lcom/daaw/v70<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/a12;->a:Lcom/daaw/b22;

    iput p2, p0, Lcom/daaw/a12;->b:I

    iput-object p3, p0, Lcom/daaw/a12;->c:Lcom/daaw/v70;

    return-void
.end method
