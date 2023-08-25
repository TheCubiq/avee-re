.class public final Lcom/daaw/z21$a;
.super Lcom/daaw/z21;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/z21;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/z21;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/pq;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/z21$a;-><init>()V

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    invoke-static {}, Lcom/daaw/z21;->a()Lcom/daaw/z21;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/z21;->b()I

    move-result v0

    return v0
.end method
