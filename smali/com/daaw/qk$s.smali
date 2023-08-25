.class public Lcom/daaw/qk$s;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/qk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "s"
.end annotation


# instance fields
.field public final a:I

.field public final b:Lcom/daaw/tx0;

.field public c:Lcom/daaw/vd0;


# direct methods
.method public constructor <init>(Lcom/daaw/tx0;Lcom/daaw/vd0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/qk$s;->b:Lcom/daaw/tx0;

    iput-object p2, p0, Lcom/daaw/qk$s;->c:Lcom/daaw/vd0;

    iput p3, p0, Lcom/daaw/qk$s;->a:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/daaw/qk$s;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/daaw/qk$s;->a:I

    check-cast p1, Lcom/daaw/qk$s;

    iget p1, p1, Lcom/daaw/qk$s;->a:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/daaw/qk$s;->a:I

    return v0
.end method
