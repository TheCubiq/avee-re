.class public Lcom/daaw/yj$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/be0;
.implements Lcom/daaw/sd0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/yj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/yj$a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/daaw/yj$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/yj$a;->a:Ljava/lang/String;

    check-cast p1, Lcom/daaw/yj$a;

    iget-object p1, p1, Lcom/daaw/yj$a;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/yj$a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method
