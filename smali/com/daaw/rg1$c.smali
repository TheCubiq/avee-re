.class public final Lcom/daaw/rg1$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ut0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/rg1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/rg1$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/rg1$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/a00;)J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public c()Lcom/daaw/da1;
    .locals 3

    new-instance v0, Lcom/daaw/da1$b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Lcom/daaw/da1$b;-><init>(J)V

    return-object v0
.end method

.method public d(J)J
    .locals 0

    const-wide/16 p1, 0x0

    return-wide p1
.end method
