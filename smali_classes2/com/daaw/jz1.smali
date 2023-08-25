.class public final Lcom/daaw/jz1;
.super Lcom/daaw/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/jz1$a;
    }
.end annotation


# static fields
.field public static final q:Lcom/daaw/jz1$a;


# instance fields
.field public p:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/jz1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/jz1$a;-><init>(Lcom/daaw/pq;)V

    sput-object v0, Lcom/daaw/jz1;->q:Lcom/daaw/jz1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lcom/daaw/jz1;->q:Lcom/daaw/jz1$a;

    invoke-direct {p0, v0}, Lcom/daaw/g;-><init>(Lcom/daaw/nl$c;)V

    return-void
.end method
