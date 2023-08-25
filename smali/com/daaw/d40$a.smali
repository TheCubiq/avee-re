.class public final Lcom/daaw/d40$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e00;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/d40;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()[Lcom/daaw/zz;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/daaw/zz;

    new-instance v1, Lcom/daaw/d40;

    invoke-direct {v1}, Lcom/daaw/d40;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method
