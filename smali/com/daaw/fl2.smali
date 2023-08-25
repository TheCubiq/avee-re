.class public final Lcom/daaw/fl2;
.super Lcom/daaw/wi2;
.source ""


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final h:Lcom/daaw/fl2;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/ng2;

    invoke-direct {v0}, Lcom/daaw/ng2;-><init>()V

    new-instance v1, Lcom/daaw/fl2;

    invoke-direct {v1, v0}, Lcom/daaw/fl2;-><init>(Lcom/daaw/ng2;)V

    sput-object v1, Lcom/daaw/fl2;->h:Lcom/daaw/fl2;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/ng2;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/daaw/wi2;-><init>(Lcom/daaw/ng2;Lcom/daaw/sh2;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/ng2;Lcom/daaw/bk2;)V
    .locals 0

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/daaw/wi2;-><init>(Lcom/daaw/ng2;Lcom/daaw/sh2;)V

    return-void
.end method
