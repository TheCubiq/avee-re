.class public abstract Lcom/daaw/tw6;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lcom/daaw/sw6;
    .locals 2

    new-instance v0, Lcom/daaw/wv6;

    invoke-direct {v0}, Lcom/daaw/wv6;-><init>()V

    const/16 v1, 0x1fd6

    invoke-virtual {v0, v1}, Lcom/daaw/wv6;->b(I)Lcom/daaw/sw6;

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()Ljava/lang/String;
.end method
