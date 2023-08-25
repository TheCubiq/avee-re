.class public final synthetic Lcom/daaw/kp8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/gq8;


# instance fields
.field public final synthetic a:Lcom/daaw/f92;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/f92;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/kp8;->a:Lcom/daaw/f92;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lcom/daaw/kp8;->a:Lcom/daaw/f92;

    check-cast p1, Lcom/daaw/ep8;

    sget v1, Lcom/daaw/hq8;->d:I

    :try_start_0
    invoke-virtual {p1, v0}, Lcom/daaw/ep8;->d(Lcom/daaw/f92;)Z

    move-result p1
    :try_end_0
    .catch Lcom/daaw/qp8; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    return p1

    :catch_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method
