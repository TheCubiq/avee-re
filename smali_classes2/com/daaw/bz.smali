.class public abstract Lcom/daaw/bz;
.super Lcom/daaw/pl;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/bz$a;
    }
.end annotation


# static fields
.field public static final q:Lcom/daaw/bz$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/bz$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/bz$a;-><init>(Lcom/daaw/pq;)V

    sput-object v0, Lcom/daaw/bz;->q:Lcom/daaw/bz$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/pl;-><init>()V

    return-void
.end method
