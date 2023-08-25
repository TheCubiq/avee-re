.class public Lcom/daaw/mk$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/mk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:Lcom/daaw/h60;


# direct methods
.method public constructor <init>(Lcom/daaw/h60;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mk$c;->a:Lcom/daaw/h60;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/daaw/mk$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/mk$c;->a:Lcom/daaw/h60;

    iget-object v0, v0, Lcom/daaw/h60;->b:Ljava/lang/String;

    check-cast p1, Lcom/daaw/mk$c;

    iget-object p1, p1, Lcom/daaw/mk$c;->a:Lcom/daaw/h60;

    iget-object p1, p1, Lcom/daaw/h60;->b:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/mk$c;->a:Lcom/daaw/h60;

    iget-object v0, v0, Lcom/daaw/h60;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method
