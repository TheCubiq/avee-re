.class public abstract Lcom/daaw/qq1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:Lcom/daaw/qq1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/daaw/qq1;
    .locals 1

    sget-object v0, Lcom/daaw/qq1;->a:Lcom/daaw/qq1;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/rq1;

    invoke-direct {v0}, Lcom/daaw/rq1;-><init>()V

    sput-object v0, Lcom/daaw/qq1;->a:Lcom/daaw/qq1;

    :cond_0
    sget-object v0, Lcom/daaw/qq1;->a:Lcom/daaw/qq1;

    return-object v0
.end method
