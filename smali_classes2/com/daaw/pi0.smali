.class public final Lcom/daaw/pi0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/pi0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/pi0;

    invoke-direct {v0}, Lcom/daaw/pi0;-><init>()V

    sput-object v0, Lcom/daaw/pi0;->a:Lcom/daaw/pi0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Lcom/daaw/oi0;
    .locals 4

    new-instance v0, Lcom/daaw/oi0;

    const/4 v1, 0x1

    const/4 v2, 0x7

    const/16 v3, 0xa

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/oi0;-><init>(III)V

    return-object v0
.end method
