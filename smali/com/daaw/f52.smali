.class public final Lcom/daaw/f52;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:I

.field public b:I

.field public c:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/e52;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/ik5;)V
    .locals 1

    invoke-virtual {p1}, Lcom/daaw/ik5;->o()I

    move-result v0

    iput v0, p0, Lcom/daaw/f52;->a:I

    invoke-virtual {p1}, Lcom/daaw/ik5;->o()I

    move-result p1

    iput p1, p0, Lcom/daaw/f52;->b:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/f52;->c:I

    return-void
.end method
